// Generated from expression\Validation.g4 by ANTLR 4.7.2

    package expression;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ValidationParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ValidationVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ValidationParser#validationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValidationStatement(ValidationParser.ValidationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ValidationParser#v}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitV(ValidationParser.VContext ctx);
	/**
	 * Visit a parse tree produced by {@link ValidationParser#v0}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitV0(ValidationParser.V0Context ctx);
	/**
	 * Visit a parse tree produced by the {@code existKey}
	 * labeled alternative in {@link ValidationParser#v1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExistKey(ValidationParser.ExistKeyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code datatype}
	 * labeled alternative in {@link ValidationParser#v2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatatype(ValidationParser.DatatypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equal}
	 * labeled alternative in {@link ValidationParser#v3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqual(ValidationParser.EqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code checkForBoth}
	 * labeled alternative in {@link ValidationParser#v4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckForBoth(ValidationParser.CheckForBothContext ctx);
	/**
	 * Visit a parse tree produced by the {@code checkForAdditionalOperators}
	 * labeled alternative in {@link ValidationParser#v5}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckForAdditionalOperators(ValidationParser.CheckForAdditionalOperatorsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code calculate}
	 * labeled alternative in {@link ValidationParser#v6}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalculate(ValidationParser.CalculateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sorting}
	 * labeled alternative in {@link ValidationParser#v7}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSorting(ValidationParser.SortingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code maxMinCheck}
	 * labeled alternative in {@link ValidationParser#v8}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaxMinCheck(ValidationParser.MaxMinCheckContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCheck}
	 * labeled alternative in {@link ValidationParser#v9}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCheck(ValidationParser.FunctionCheckContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dateTimePatternCheck}
	 * labeled alternative in {@link ValidationParser#v10}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDateTimePatternCheck(ValidationParser.DateTimePatternCheckContext ctx);
	/**
	 * Visit a parse tree produced by the {@code operators}
	 * labeled alternative in {@link ValidationParser#v11}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperators(ValidationParser.OperatorsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code regexMatch}
	 * labeled alternative in {@link ValidationParser#v12}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegexMatch(ValidationParser.RegexMatchContext ctx);
	/**
	 * Visit a parse tree produced by {@link ValidationParser#dateTime}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDateTime(ValidationParser.DateTimeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ValidationParser#functionResult}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionResult(ValidationParser.FunctionResultContext ctx);
	/**
	 * Visit a parse tree produced by {@link ValidationParser#functionNames}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionNames(ValidationParser.FunctionNamesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ValidationParser#isMaxMin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsMaxMin(ValidationParser.IsMaxMinContext ctx);
	/**
	 * Visit a parse tree produced by {@link ValidationParser#order}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrder(ValidationParser.OrderContext ctx);
	/**
	 * Visit a parse tree produced by {@link ValidationParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(ValidationParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ValidationParser#isNot}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsNot(ValidationParser.IsNotContext ctx);
	/**
	 * Visit a parse tree produced by {@link ValidationParser#keyString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyString(ValidationParser.KeyStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link ValidationParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(ValidationParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ValidationParser#keyStringMap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyStringMap(ValidationParser.KeyStringMapContext ctx);
}