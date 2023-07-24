// Generated from expression\Curl.g4 by ANTLR 4.7.2

package expression;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CurlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CurlVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code CURLCOMMAND}
	 * labeled alternative in {@link CurlParser#curl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCURLCOMMAND(CurlParser.CURLCOMMANDContext ctx);
}