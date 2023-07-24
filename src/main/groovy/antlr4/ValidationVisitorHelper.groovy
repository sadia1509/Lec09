package antlr4

import util.JsonParser

class ValidationVisitorHelper {
    boolean isAssert

    ValidationVisitorHelper(boolean isAssert) {
        this.isAssert = isAssert
    }

    boolean assertionResultHelper(def actualOrLeft = null, def expectedOrRight = null,
                                  String operator = null, String checkingType = null, String key = null) {
        if (checkingType != null ? checkingType.toLowerCase() == "exist" : false) {
            if (operator == "!") {
                if (isAssert) assert !(JsonParser.isValidKey(actualOrLeft, key))
                return !(JsonParser.isValidKey(actualOrLeft, key))
            } else {
                if (isAssert) assert JsonParser.isValidKey(actualOrLeft, key)
                return (JsonParser.isValidKey(actualOrLeft, key))
            }
        } else {
            // println actualOrLeft.toString() + " " + operator.toString() + " " + expectedOrRight.toString()
            switch (operator != null ? operator.trim() : null) {
                case "!": case "!=":
                    if (isAssert) assert actualOrLeft != expectedOrRight
                    return (actualOrLeft != expectedOrRight)
                case ">":
                    if (isAssert) assert actualOrLeft > expectedOrRight
                    return (actualOrLeft > expectedOrRight)
                case "<":
                    if (isAssert) assert actualOrLeft < expectedOrRight
                    return (actualOrLeft < expectedOrRight)
                case ">=":
                    if (isAssert) assert actualOrLeft >= expectedOrRight
                    return (actualOrLeft >= expectedOrRight)
                case "<=":
                    if (isAssert) assert actualOrLeft <= expectedOrRight
                    return (actualOrLeft <= expectedOrRight)
                default:
                    if (isAssert) assert actualOrLeft == expectedOrRight
                    return (actualOrLeft == expectedOrRight)
            }
        }
    }

    def sortTheList(def list) {
        list.sort { a, b ->
            if (a instanceof List && b instanceof List) nestedListComparator(a, b)
            else a.toString() <=> b.toString()
        }
        list
    }

    def nestedListComparator = { list1, list2 ->
        def id1 = list1[0], id2 = list2[0]
        if (id1 == null) return 1
        else if (id2 == null) return -1
        else return id1.toString() <=> id2.toString()
    }

    def getTheCTX(String statements) {
        def ctxTexts = [] as Queue
        if (!statements.contains(",") && !statements.contains("\n")) ctxTexts.add(statements.trim())
        else statements.split("[\n,]").each { if (!it.isBlank()) ctxTexts.add(it.trim()) }
        ctxTexts
    }

    def getAllValues = { data ->
        def values = []
        if (data instanceof Map) {
            data.values().each { value ->
                if (value instanceof Map || value instanceof List) values.addAll(getAllValues(value))
                 else   values.add(value)
            }
        } else if (data instanceof List) {
            data.each { element ->
                if (element instanceof Map || element instanceof List)  values.addAll(getAllValues(element))
                else   values.add(element)
            }
        }
        values
    }

}
