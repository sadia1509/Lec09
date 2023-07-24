// Generated from expression\Curl.g4 by ANTLR 4.7.2

package expression;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CurlParser}.
 */
public interface CurlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code CURLCOMMAND}
	 * labeled alternative in {@link CurlParser#curl}.
	 * @param ctx the parse tree
	 */
	void enterCURLCOMMAND(CurlParser.CURLCOMMANDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CURLCOMMAND}
	 * labeled alternative in {@link CurlParser#curl}.
	 * @param ctx the parse tree
	 */
	void exitCURLCOMMAND(CurlParser.CURLCOMMANDContext ctx);
}