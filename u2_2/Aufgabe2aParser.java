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
		RULE_expr = 0, RULE_userPart = 1, RULE_domainPart = 2;
	private static String[] makeRuleNames() {
		return new String[] {
			"expr", "userPart", "domainPart"
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
		enterRule(_localctx, 0, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(6);
			userPart();
			setState(7);
			match(MAILSIGN);
			setState(8);
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
		enterRule(_localctx, 2, RULE_userPart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
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
		enterRule(_localctx, 4, RULE_domainPart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\b\21\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\2\2\5\2\4\6\2\2\2\r\2"+
		"\b\3\2\2\2\4\f\3\2\2\2\6\16\3\2\2\2\b\t\5\4\3\2\t\n\7\4\2\2\n\13\5\6\4"+
		"\2\13\3\3\2\2\2\f\r\7\3\2\2\r\5\3\2\2\2\16\17\7\5\2\2\17\7\3\2\2\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}