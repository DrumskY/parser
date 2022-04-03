// Generated from C:/Users/Bartek/Desktop/Parser/src/com/company\Hello.g4 by ANTLR 4.9.2
package com.company;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HelloParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HelloVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HelloParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(HelloParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#pd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPd(HelloParser.PdContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#r}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitR(HelloParser.RContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#z}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitZ(HelloParser.ZContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#y}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitY(HelloParser.YContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#w}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitW(HelloParser.WContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#x}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitX(HelloParser.XContext ctx);
}