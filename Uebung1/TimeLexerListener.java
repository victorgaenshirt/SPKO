// Generated from TimeLexer.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TimeLexerParser}.
 */
public interface TimeLexerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TimeLexerParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(TimeLexerParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimeLexerParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(TimeLexerParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link TimeLexerParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(TimeLexerParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimeLexerParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(TimeLexerParser.ExprContext ctx);
}