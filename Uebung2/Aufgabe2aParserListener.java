// Generated from Aufgabe2aParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Aufgabe2aParser}.
 */
public interface Aufgabe2aParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Aufgabe2aParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(Aufgabe2aParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Aufgabe2aParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(Aufgabe2aParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link Aufgabe2aParser#mailList}.
	 * @param ctx the parse tree
	 */
	void enterMailList(Aufgabe2aParser.MailListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Aufgabe2aParser#mailList}.
	 * @param ctx the parse tree
	 */
	void exitMailList(Aufgabe2aParser.MailListContext ctx);
}