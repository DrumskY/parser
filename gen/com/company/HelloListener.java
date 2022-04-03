// Generated from C:/Users/Bartek/Desktop/Parser/src/com/company\Hello.g4 by ANTLR 4.9.2
package com.company;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HelloParser}.
 */
public interface HelloListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HelloParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(HelloParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(HelloParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#pd}.
	 * @param ctx the parse tree
	 */
	void enterPd(HelloParser.PdContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#pd}.
	 * @param ctx the parse tree
	 */
	void exitPd(HelloParser.PdContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#r}.
	 * @param ctx the parse tree
	 */
	void enterR(HelloParser.RContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#r}.
	 * @param ctx the parse tree
	 */
	void exitR(HelloParser.RContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#z}.
	 * @param ctx the parse tree
	 */
	void enterZ(HelloParser.ZContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#z}.
	 * @param ctx the parse tree
	 */
	void exitZ(HelloParser.ZContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#y}.
	 * @param ctx the parse tree
	 */
	void enterY(HelloParser.YContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#y}.
	 * @param ctx the parse tree
	 */
	void exitY(HelloParser.YContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#w}.
	 * @param ctx the parse tree
	 */
	void enterW(HelloParser.WContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#w}.
	 * @param ctx the parse tree
	 */
	void exitW(HelloParser.WContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#x}.
	 * @param ctx the parse tree
	 */
	void enterX(HelloParser.XContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#x}.
	 * @param ctx the parse tree
	 */
	void exitX(HelloParser.XContext ctx);
}