// Generated from Aufgabe2aParser.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Aufgabe2aParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		USER=1, MAILSIGN=2, REST=3, COMMA=4, WS=5, ERROR=6;
	public static final int
		RULE_mailList = 0, RULE_expr = 1, RULE_userPart = 2, RULE_domainPart = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"mailList", "expr", "userPart", "domainPart"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "USER", "MAILSIGN", "REST", "COMMA", "WS", "ERROR"
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
		enterRule(_localctx, 0, RULE_mailList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(8);
			expr();
			setState(13);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(9);
				match(COMMA);
				setState(10);
				expr();
				}
				}
				setState(15);
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

	public static class ExprContext extends ParserRuleContext {
		public UserPartContext userPart() {
			return getRuleContext(UserPartContext.class,0);
		}
		public TerminalNode MAILSIGN() { return getToken(Aufgabe2aParser.MAILSIGN, 0); }
		public DomainPartContext domainPart() {
			return getRuleContext(DomainPartContext.class,0);
		}
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
		enterRule(_localctx, 2, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			userPart();
			setState(17);
			match(MAILSIGN);
			setState(18);
			domainPart();
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

	public static class UserPartContext extends ParserRuleContext {
		public TerminalNode USER() { return getToken(Aufgabe2aParser.USER, 0); }
		public UserPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_userPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Aufgabe2aParserListener ) ((Aufgabe2aParserListener)listener).enterUserPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Aufgabe2aParserListener ) ((Aufgabe2aParserListener)listener).exitUserPart(this);
		}
	}

	public final UserPartContext userPart() throws RecognitionException {
		UserPartContext _localctx = new UserPartContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_userPart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			match(USER);
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

	public static class DomainPartContext extends ParserRuleContext {
		public TerminalNode REST() { return getToken(Aufgabe2aParser.REST, 0); }
		public DomainPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_domainPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Aufgabe2aParserListener ) ((Aufgabe2aParserListener)listener).enterDomainPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Aufgabe2aParserListener ) ((Aufgabe2aParserListener)listener).exitDomainPart(this);
		}
	}

	public final DomainPartContext domainPart() throws RecognitionException {
		DomainPartContext _localctx = new DomainPartContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_domainPart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			match(REST);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\b\33\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\7\2\16\n\2\f\2\16\2\21\13\2\3\3\3\3\3"+
		"\3\3\3\3\4\3\4\3\5\3\5\3\5\2\2\6\2\4\6\b\2\2\2\27\2\n\3\2\2\2\4\22\3\2"+
		"\2\2\6\26\3\2\2\2\b\30\3\2\2\2\n\17\5\4\3\2\13\f\7\6\2\2\f\16\5\4\3\2"+
		"\r\13\3\2\2\2\16\21\3\2\2\2\17\r\3\2\2\2\17\20\3\2\2\2\20\3\3\2\2\2\21"+
		"\17\3\2\2\2\22\23\5\6\4\2\23\24\7\4\2\2\24\25\5\b\5\2\25\5\3\2\2\2\26"+
		"\27\7\3\2\2\27\7\3\2\2\2\30\31\7\5\2\2\31\t\3\2\2\2\3\17";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}