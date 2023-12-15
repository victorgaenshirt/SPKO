// Generated from Aufgabe2aParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class Aufgabe2aParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		USER=1, MAILSIGN=2, DOMAIN=3, ENDING=4, COMMA=5, WS=6;
	public static final int
		RULE_expr = 0, RULE_mailList = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"expr", "mailList"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'@'", null, null, "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "USER", "MAILSIGN", "DOMAIN", "ENDING", "COMMA", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Aufgabe2aParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Aufgabe2aParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public TerminalNode USER() { return getToken(Aufgabe2aParser.USER, 0); }
		public TerminalNode MAILSIGN() { return getToken(Aufgabe2aParser.MAILSIGN, 0); }
		public TerminalNode DOMAIN() { return getToken(Aufgabe2aParser.DOMAIN, 0); }
		public TerminalNode ENDING() { return getToken(Aufgabe2aParser.ENDING, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Aufgabe2aParserListener ) ((Aufgabe2aParserListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Aufgabe2aParserListener ) ((Aufgabe2aParserListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4);
			match(USER);
			setState(5);
			match(MAILSIGN);
			setState(6);
			match(DOMAIN);
			setState(7);
			match(ENDING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MailListContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Aufgabe2aParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Aufgabe2aParser.COMMA, i);
		}
		public MailListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mailList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Aufgabe2aParserListener ) ((Aufgabe2aParserListener)listener).enterMailList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Aufgabe2aParserListener ) ((Aufgabe2aParserListener)listener).exitMailList(this);
		}
	}

	public final MailListContext mailList() throws RecognitionException {
		MailListContext _localctx = new MailListContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_mailList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(9);
			expr();
			setState(14);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(10);
				match(COMMA);
				setState(11);
				expr();
				}
				}
				setState(16);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0006\u0012\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0005\u0001\r\b\u0001\n\u0001\f\u0001\u0010\t"+
		"\u0001\u0001\u0001\u0000\u0000\u0002\u0000\u0002\u0000\u0000\u0010\u0000"+
		"\u0004\u0001\u0000\u0000\u0000\u0002\t\u0001\u0000\u0000\u0000\u0004\u0005"+
		"\u0005\u0001\u0000\u0000\u0005\u0006\u0005\u0002\u0000\u0000\u0006\u0007"+
		"\u0005\u0003\u0000\u0000\u0007\b\u0005\u0004\u0000\u0000\b\u0001\u0001"+
		"\u0000\u0000\u0000\t\u000e\u0003\u0000\u0000\u0000\n\u000b\u0005\u0005"+
		"\u0000\u0000\u000b\r\u0003\u0000\u0000\u0000\f\n\u0001\u0000\u0000\u0000"+
		"\r\u0010\u0001\u0000\u0000\u0000\u000e\f\u0001\u0000\u0000\u0000\u000e"+
		"\u000f\u0001\u0000\u0000\u0000\u000f\u0003\u0001\u0000\u0000\u0000\u0010"+
		"\u000e\u0001\u0000\u0000\u0000\u0001\u000e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}