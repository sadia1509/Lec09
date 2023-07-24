// Generated from expression\Validation.g4 by ANTLR 4.7.2

    package expression;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ValidationParser}.
 */
public interface ValidationListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ValidationParser#validationStatement}.
	 * @param ctx the parse tree
	 */
	void enterValidationStatement(ValidationParser.ValidationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValidationParser#validationStatement}.
	 * @param ctx the parse tree
	 */
	void exitValidationStatement(ValidationParser.ValidationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValidationParser#v}.
	 * @param ctx the parse tree
	 */
	void enterV(ValidationParser.VContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValidationParser#v}.
	 * @param ctx the parse tree
	 */
	void exitV(ValidationParser.VContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValidationParser#v0}.
	 * @param ctx the parse tree
	 */
	void enterV0(ValidationParser.V0Context ctx);
	/**
	 * Exit a parse tree produced by {@link ValidationParser#v0}.
	 * @param ctx the parse tree
	 */
	void exitV0(ValidationParser.V0Context ctx);
	/**
	 * Enter a parse tree produced by the {@code existKey}
	 * labeled alternative in {@link ValidationParser#v1}.
	 * @param ctx the parse tree
	 */
	void enterExistKey(ValidationParser.ExistKeyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code existKey}
	 * labeled alternative in {@link ValidationParser#v1}.
	 * @param ctx the parse tree
	 */
	void exitExistKey(ValidationParser.ExistKeyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code datatype}
	 * labeled alternative in {@link ValidationParser#v2}.
	 * @param ctx the parse tree
	 */
	void enterDatatype(ValidationParser.DatatypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code datatype}
	 * labeled alternative in {@link ValidationParser#v2}.
	 * @param ctx the parse tree
	 */
	void exitDatatype(ValidationParser.DatatypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equal}
	 * labeled alternative in {@link ValidationParser#v3}.
	 * @param ctx the parse tree
	 */
	void enterEqual(ValidationParser.EqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equal}
	 * labeled alternative in {@link ValidationParser#v3}.
	 * @param ctx the parse tree
	 */
	void exitEqual(ValidationParser.EqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code checkForBoth}
	 * labeled alternative in {@link ValidationParser#v4}.
	 * @param ctx the parse tree
	 */
	void enterCheckForBoth(ValidationParser.CheckForBothContext ctx);
	/**
	 * Exit a parse tree produced by the {@code checkForBoth}
	 * labeled alternative in {@link ValidationParser#v4}.
	 * @param ctx the parse tree
	 */
	void exitCheckForBoth(ValidationParser.CheckForBothContext ctx);
	/**
	 * Enter a parse tree produced by the {@code checkForAdditionalOperators}
	 * labeled alternative in {@link ValidationParser#v5}.
	 * @param ctx the parse tree
	 */
	void enterCheckForAdditionalOperators(ValidationParser.CheckForAdditionalOperatorsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code checkForAdditionalOperators}
	 * labeled alternative in {@link ValidationParser#v5}.
	 * @param ctx the parse tree
	 */
	void exitCheckForAdditionalOperators(ValidationParser.CheckForAdditionalOperatorsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code calculate}
	 * labeled alternative in {@link ValidationParser#v6}.
	 * @param ctx the parse tree
	 */
	void enterCalculate(ValidationParser.CalculateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code calculate}
	 * labeled alternative in {@link ValidationParser#v6}.
	 * @param ctx the parse tree
	 */
	void exitCalculate(ValidationParser.CalculateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sorting}
	 * labeled alternative in {@link ValidationParser#v7}.
	 * @param ctx the parse tree
	 */
	void enterSorting(ValidationParser.SortingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sorting}
	 * labeled alternative in {@link ValidationParser#v7}.
	 * @param ctx the parse tree
	 */
	void exitSorting(ValidationParser.SortingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code maxMinCheck}
	 * labeled alternative in {@link ValidationParser#v8}.
	 * @param ctx the parse tree
	 */
	void enterMaxMinCheck(ValidationParser.MaxMinCheckContext ctx);
	/**
	 * Exit a parse tree produced by the {@code maxMinCheck}
	 * labeled alternative in {@link ValidationParser#v8}.
	 * @param ctx the parse tree
	 */
	void exitMaxMinCheck(ValidationParser.MaxMinCheckContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCheck}
	 * labeled alternative in {@link ValidationParser#v9}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCheck(ValidationParser.FunctionCheckContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCheck}
	 * labeled alternative in {@link ValidationParser#v9}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCheck(ValidationParser.FunctionCheckContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dateTimePatternCheck}
	 * labeled alternative in {@link ValidationParser#v10}.
	 * @param ctx the parse tree
	 */
	void enterDateTimePatternCheck(ValidationParser.DateTimePatternCheckContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dateTimePatternCheck}
	 * labeled alternative in {@link ValidationParser#v10}.
	 * @param ctx the parse tree
	 */
	void exitDateTimePatternCheck(ValidationParser.DateTimePatternCheckContext ctx);
	/**
	 * Enter a parse tree produced by the {@code operators}
	 * labeled alternative in {@link ValidationParser#v11}.
	 * @param ctx the parse tree
	 */
	void enterOperators(ValidationParser.OperatorsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code operators}
	 * labeled alternative in {@link ValidationParser#v11}.
	 * @param ctx the parse tree
	 */
	void exitOperators(ValidationParser.OperatorsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code regexMatch}
	 * labeled alternative in {@link ValidationParser#v12}.
	 * @param ctx the parse tree
	 */
	void enterRegexMatch(ValidationParser.RegexMatchContext ctx);
	/**
	 * Exit a parse tree produced by the {@code regexMatch}
	 * labeled alternative in {@link ValidationParser#v12}.
	 * @param ctx the parse tree
	 */
	void exitRegexMatch(ValidationParser.RegexMatchContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValidationParser#dateTime}.
	 * @param ctx the parse tree
	 */
	void enterDateTime(ValidationParser.DateTimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValidationParser#dateTime}.
	 * @param ctx the parse tree
	 */
	void exitDateTime(ValidationParser.DateTimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValidationParser#functionResult}.
	 * @param ctx the parse tree
	 */
	void enterFunctionResult(ValidationParser.FunctionResultContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValidationParser#functionResult}.
	 * @param ctx the parse tree
	 */
	void exitFunctionResult(ValidationParser.FunctionResultContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValidationParser#functionNames}.
	 * @param ctx the parse tree
	 */
	void enterFunctionNames(ValidationParser.FunctionNamesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValidationParser#functionNames}.
	 * @param ctx the parse tree
	 */
	void exitFunctionNames(ValidationParser.FunctionNamesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValidationParser#isMaxMin}.
	 * @param ctx the parse tree
	 */
	void enterIsMaxMin(ValidationParser.IsMaxMinContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValidationParser#isMaxMin}.
	 * @param ctx the parse tree
	 */
	void exitIsMaxMin(ValidationParser.IsMaxMinContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValidationParser#order}.
	 * @param ctx the parse tree
	 */
	void enterOrder(ValidationParser.OrderContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValidationParser#order}.
	 * @param ctx the parse tree
	 */
	void exitOrder(ValidationParser.OrderContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValidationParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(ValidationParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValidationParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(ValidationParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValidationParser#isNot}.
	 * @param ctx the parse tree
	 */
	void enterIsNot(ValidationParser.IsNotContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValidationParser#isNot}.
	 * @param ctx the parse tree
	 */
	void exitIsNot(ValidationParser.IsNotContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValidationParser#keyString}.
	 * @param ctx the parse tree
	 */
	void enterKeyString(ValidationParser.KeyStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValidationParser#keyString}.
	 * @param ctx the parse tree
	 */
	void exitKeyString(ValidationParser.KeyStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValidationParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(ValidationParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValidationParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(ValidationParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValidationParser#keyStringMap}.
	 * @param ctx the parse tree
	 */
	void enterKeyStringMap(ValidationParser.KeyStringMapContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValidationParser#keyStringMap}.
	 * @param ctx the parse tree
	 */
	void exitKeyStringMap(ValidationParser.KeyStringMapContext ctx);
}