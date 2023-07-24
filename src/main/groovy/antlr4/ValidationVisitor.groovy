package antlr4

import constant.ConstantClass
import expression.ValidationBaseVisitor
import expression.ValidationLexer
import expression.ValidationParser
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CodePointCharStream
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.tree.ParseTree
import util.JsonParser
import javax.script.ScriptEngineManager
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.regex.*

class ValidationVisitor extends ValidationBaseVisitor<Object> {
    def responseBody, responseBodyCurl
    boolean isAssert
    ValidationVisitorHelper vvHelper
    Queue<String> ctxTexts

    static def validate(String expression, def body, def curlBody = null, boolean isAssertBool = true) {
        println "ANTLR grammar validation:"
        CodePointCharStream input = CharStreams.fromString(expression)
        ValidationLexer lexer = new ValidationLexer(input)
        CommonTokenStream tokenStream = new CommonTokenStream(lexer)
        ValidationParser parser = new ValidationParser(tokenStream)
        ParseTree tree = parser.validationStatement()
        ValidationVisitor visitor = new ValidationVisitor()
        visitor.responseBody = body
        visitor.responseBodyCurl = curlBody
        visitor.isAssert = isAssertBool
        visitor.vvHelper = new ValidationVisitorHelper(isAssertBool)
        visitor.ctxTexts = visitor.vvHelper.getTheCTX(expression)
        visitor.visit(tree)
    }


    @Override
    Object visitExistKey(ValidationParser.ExistKeyContext ctx) {
        String msg = "Existence check"
        ctx.getChild(2).each {
            String key = it.getText().replaceAll("\\[]", "").trim()
            if (ctx.keyStringMap() != null) {
                println msg + "(Map) : " + ctxTexts.remove()
                String lastKey = it.getText().contains("[].") ? ctx.keyStringMap().Identifier().last().getText() : ""
                def dataFromMap = JsonParser.getValueByKey(responseBody, key)
                List<Map<String, Object>> dataMap = dataFromMap
                if (lastKey != "") {
                    dataMap.each {
                        if (isAssert) assert it.containsKey(lastKey)
                        else return it.containsKey(lastKey) == true
                    }
                } else dataMap.size() < 0 ? false : true
            }else println msg + " : " + ctxTexts.remove()  //ctx.getText()
            vvHelper.assertionResultHelper(responseBody, null, ctx.isNot().getText().trim(), "exist", key)
        }

    }


    @Override
    Object visitDatatype(ValidationParser.DatatypeContext ctx) {
        String msg = "Datatype check"
        ctx.getChild(2).each {
            String key = it.getText().replaceAll("\\[]", "").trim()
            def actualValue
            if (ctx.keyStringMap() != null) {
                def actualValueList = JsonParser.getValueByKey(responseBody, key)[key.split("\\.").last().trim()]
                actualValue = actualValueList[0].getClass().name.split("\\.").last().trim()
                msg += "(Map)"
            } else actualValue = JsonParser.getValueByKey(responseBody, key).getClass().name.split("\\.").last().trim()
            def expectedValue = ctx.type().getText().trim()
            ConstantClass.whichType.each { k, list ->
                if (list.stream().anyMatch(expectedValue::equalsIgnoreCase) && expectedValue != "String")
                    actualValue = expectedValue
            }
            println msg + " : " + ctxTexts.remove() // ctx.getText()
            vvHelper.assertionResultHelper(actualValue, expectedValue, ctx.isNot().getText())
        }

    }

    @Override
    Object visitEqual(ValidationParser.EqualContext ctx) {
        println "Equality check" + " : " + ctxTexts.remove() // ctx.getText()
        def mapKey = ctx.keyStringMap()
        def lastKey = mapKey != null ? mapKey.Identifier().last().getText() : ""
        def actualValue = JsonParser.getValueByKey(responseBody,
                mapKey == null ? ctx.keyString(0).getText().trim() : mapKey.getText().replaceAll("\\[[0-9]*]", "") + "." + lastKey)
        def expectedValue = ctx.type() == null ? ctx.getChild(2).getText().trim() : ctx.type().getText().replaceAll("\"", "")
        if (expectedValue.isInteger()) expectedValue = Integer.parseInt(expectedValue)
        if (mapKey != null) {
            def index = mapKey.getText().replaceAll("[^0-9]", "")
            index != "" ? actualValue = (actualValue[index.isInteger() ? Integer.parseInt(index) : -1])[lastKey] : ""
        }
        vvHelper.assertionResultHelper(actualValue, expectedValue, ctx.EuqalEuqal().getText())
    }


    @Override
    Object visitCheckForBoth(ValidationParser.CheckForBothContext ctx) {
        String msg = "Left and right curl check"
        def leftSide = null, rightSide = null
        String leftKey = ctx.getChild(1).getText()
        String rightKey = ctx.getChild(4).getText()
        if (ctx.keyStringMap(0) != null && ctx.keyStringMap(1) != null) {
            leftSide = JsonParser.getValueByKey(responseBody, leftKey.split("\\[]").first().trim())[leftKey.split("\\.").last().trim()].grep()
            rightSide = JsonParser.getValueByKey(responseBodyCurl, rightKey.split("\\[]").first().trim())[rightKey.split("\\.").last().trim()].grep()
        } else {
            leftSide = JsonParser.getValueByKey(responseBody, leftKey.trim())
            rightSide = JsonParser.getValueByKey(responseBodyCurl, rightKey.trim())
        }
        def leftList = vvHelper.getAllValues(leftSide)
        def rightList = vvHelper.getAllValues(rightSide)
        if (leftSide instanceof Map && rightSide instanceof Map) msg += "(Map type value)"
        else if (leftSide instanceof ArrayList && rightSide instanceof ArrayList) msg += "(List type value)"
        else {
            leftList.add(leftSide)
            rightList.add(rightSide)
        }
        println msg + " : " + ctxTexts.remove() // ctx.getText()
        if (leftList.size() < 1 | rightList.size() < 1) return vvHelper.assertionResultHelper("", "n/a")
        else return vvHelper.assertionResultHelper(vvHelper.sortTheList(leftList), vvHelper.sortTheList(rightList), ctx.EuqalEuqal().getText())
    }

    @Override
    Object visitCheckForAdditionalOperators(ValidationParser.CheckForAdditionalOperatorsContext ctx) {
        println "Additional operators check" + " : " + ctxTexts.remove()  // ctx.getText()
        String key = ctx.AdditionalOperators().getText().trim()
        def actualValue = JsonParser.getValueByKey(responseBody, ctx.keyString(0).getText().trim())
        def expectedValue = ctx.keyString(1).getText().trim()
        if (expectedValue.isInteger()) expectedValue = Integer.parseInt(expectedValue)
        vvHelper.assertionResultHelper(actualValue, expectedValue, key)
    }


    @Override
    Object visitOperators(ValidationParser.OperatorsContext ctx) {
        println "Logical operator check" + " : " + ctxTexts.remove()  //ctx.getText()
        String operator = ctx.LogicalOperators().getText().trim()
        def tree = []
        for (int i = 0; i < 2; i++) ctx.v0(i).each { if (it != null) tree.add(it.getText()) }
        switch (operator) {
            case "&&":
                tree.each { node ->
                    validate(node, responseBody, responseBodyCurl)
                }
                break
            case "||":
                isAssert = false
                def checkerForBothStatementIsTrue = []
                tree.each { node ->
                    if (validate(node, responseBody, responseBodyCurl, false))
                        checkerForBothStatementIsTrue.add(true)
                }
                assert checkerForBothStatementIsTrue.size() > 0
                break
        }
    }


    @Override
    Object visitCalculate(ValidationParser.CalculateContext ctx) {
        println "Calculation check" + " : " + ctxTexts.remove()  // ctx.getText()
        String equation = ctx.getText().split("==").first().trim()
        equation.replaceAll("[()]", "").split("[-+*/^%]").each {
            if (JsonParser.isValidKey(responseBody, it))
                equation = equation.replaceFirst(it, (String) JsonParser.getValueByKey(responseBody, it))
        }
        String expectedValue = ctx.getText().split("==").last().trim()
        String actualValue = new ScriptEngineManager().getEngineByName("JavaScript").eval(equation)
        println equation + " = " + actualValue
        vvHelper.assertionResultHelper(actualValue, expectedValue)
    }

    @Override
    Object visitSorting(ValidationParser.SortingContext ctx) {
        println "Sorting check" + " : " + ctxTexts.remove()  // ctx.getText()
        List actualMap = []
        def expectedMap = JsonParser.getValueByKey(responseBody, ctx.keyString().get(0).getText())
        actualMap.addAll(expectedMap)
        if (ctx.order().getText().toLowerCase() == "asc")
            expectedMap.sort(Comparator.comparing(m -> m[ctx.keyString().get(1).getText()],
                    Comparator.nullsLast(Comparator.naturalOrder())))
        else if (ctx.order().getText().toLowerCase() == "desc")
            expectedMap.sort(Comparator.comparing(m -> m[ctx.keyString().get(1).getText()],
                    Comparator.nullsLast(Comparator.reverseOrder())))
        vvHelper.assertionResultHelper(actualMap, expectedMap)
    }


    @Override
    Object visitMaxMinCheck(ValidationParser.MaxMinCheckContext ctx) {
        println "Min/Max check" + " : " + ctxTexts.remove()   //ctx.getText()
        String key = ctx.keyStringMap().getText().trim()
        def actualValueList = JsonParser.getValueByKey(responseBody, key.replaceAll("\\[]", ""))[key.split("\\.").last().trim()]
        def expectedValue = ctx.keyString().getText(), actualValue
        switch (ctx.isMaxMin().getText().toLowerCase()) {
            case "max":
                actualValue = Collections.max(actualValueList).toString()
                break
            case "min":
                actualValue = Collections.min(actualValueList).toString()
                break
            default:
                println "Only min/max is accepted"
                break
        }
        vvHelper.assertionResultHelper(actualValue, expectedValue)
    }

    @Override
    Object visitDateTimePatternCheck(ValidationParser.DateTimePatternCheckContext ctx) {
        println "Datetime check" + " : " + ctxTexts.remove()  // ctx.getText()
        def dateValue = JsonParser.getValueByKey(responseBody, ctx.keyString().getText().trim())
        String str = dateValue.toString().replaceAll(" ", "")
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(ctx.dateTime().getText().replaceAll("\"", ""))
        LocalDateTime dateTime
        try {
            dateTime = LocalDateTime.parse(str, formatter)
        } catch (Exception e) {
        }
        finally {
            vvHelper.assertionResultHelper(str, dateTime.toString().replaceAll("[a-zA-Z]", ""))
        }
    }

    @Override
    Object visitRegexMatch(ValidationParser.RegexMatchContext ctx) {
        String regex = ctx.REGEX().getText().split(" ", 2).last().replaceAll("\"", "") // ctx.getText()
        println "Regex check" + " : " + ctxTexts.peek().toString().split("\"", 2).first() + "\"" + regex + "\""
        def keyMap = ctx.keyStringMap()
        def index = ""
        if (keyMap != null) index = keyMap.getText().replaceAll("[^0-9]", "").trim()
        def data = keyMap == null ? JsonParser.getValueByKey(responseBody, ctx.keyString().getText())
                : JsonParser.getValueByKey(responseBody, keyMap.getText().split("\\[[0-9]*]")
                .first())[keyMap.Identifier().last().getText()][index.isInteger() ? Integer.parseInt(index) : 0]
        boolean actualValue = Pattern.matches(regex, data.toString())
        ctxTexts.remove()
        vvHelper.assertionResultHelper(actualValue, true)
    }


    @Override
    Object visitFunctionCheck(ValidationParser.FunctionCheckContext ctx) {
        println "Functional check" + " : " + ctxTexts.remove()  //ctx.getText()
        def mapKey = null, lastKey = null, index = "", mapString = ctx.keyStringMap()
        if (ctx.keyStringMap() != null) {
            mapKey = mapString.getText().replaceAll("\\[[0-9]*]", "")
            lastKey = mapString.getText().split("\\.").last().trim()
            index = mapString.getText().replaceAll("[^0-9]", "")
        }
        def actualValue = JsonParser.getValueByKey(responseBody, mapKey == null ? ctx.keyString().getText().trim() : mapKey + "." + lastKey)
        if (mapString != null)
            actualValue = index != "" ? (actualValue[index.isInteger() ? Integer.parseInt(index) : -1])[lastKey]
                    : JsonParser.getValueByKey(responseBody, mapKey)[lastKey]
        String expectedValue = ctx.functionResult().type() != null ? ctx.functionResult().type().getText().replaceAll("\"", "") : ""
        switch (ctx.functionNames() != null ? ctx.functionNames().getText().trim() : ctx.functionResult().functionNames().getText().trim()) {
            case "contains":
                if (isAssert) assert actualValue.toString().contains(expectedValue)
                return actualValue.toString().contains(expectedValue)
            case "startsWith":
                if (isAssert) assert actualValue.toString().startsWith(expectedValue)
                return actualValue.toString().startsWith(expectedValue)
            case "endsWith":
                if (isAssert) assert actualValue.toString().endsWith(expectedValue)
                return actualValue.toString().endsWith(expectedValue)
            case "floor":
                if (actualValue.toString().isDouble())
                    return vvHelper.assertionResultHelper(Math.floor(Double.parseDouble(actualValue.toString())),
                            Double.parseDouble(expectedValue))
                else return false
            case "ceil":
                if (actualValue.toString().isDouble())
                    return vvHelper.assertionResultHelper(Math.ceil(Double.parseDouble(actualValue.toString())),
                            Double.parseDouble(expectedValue))
                else return false
            case "round":
                if (actualValue.toString().isDouble())
                    return vvHelper.assertionResultHelper(Math.round(Double.parseDouble(actualValue.toString())),
                            Double.parseDouble(expectedValue))
                else return false
            case "lengthOf":
                vvHelper.assertionResultHelper(actualValue.toString().length(),
                        expectedValue.isInteger() ? Integer.parseInt(expectedValue) : -1)
                return true
            case "sizeOf":
                def list = actualValue as ArrayList
                vvHelper.assertionResultHelper(list.size(), expectedValue.isInteger() ? Integer.parseInt(expectedValue) : -1)
                return true
            case "concat":
                String actualText = actualValue.toString()
                ctx.functionResult().keyString().each {
                    actualText += JsonParser.getValueByKey(responseBody, it.getText())
                }
                return vvHelper.assertionResultHelper(actualText, ctx.functionResult().Identifier().getText())
            default:
                println "No such function is supported."
                break
        }
    }


}

