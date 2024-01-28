// Generated from Aufgabe2aParser.g4 by ANTLR 4.9.2
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
	 * Enter a parse tree produced by {@link Aufgabe2aParser#userPart}.
	 * @param ctx the parse tree
	 */
	void enterUserPart(Aufgabe2aParser.UserPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link Aufgabe2aParser#userPart}.
	 * @param ctx the parse tree
	 */
	void exitUserPart(Aufgabe2aParser.UserPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link Aufgabe2aParser#domainPart}.
	 * @param ctx the parse tree
	 */
	void enterDomainPart(Aufgabe2aParser.DomainPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link Aufgabe2aParser#domainPart}.
	 * @param ctx the parse tree
	 */
	void exitDomainPart(Aufgabe2aParser.DomainPartContext ctx);
}