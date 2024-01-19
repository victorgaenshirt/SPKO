// Generated from /home/xymint/studium/faecher/WS2324/sprachkonzepte/uebung/SPKO/Uebung3_nochmalChris/unserCode/Aufgabe2aParser.g4 by ANTLR 4.13.1
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
		USER=1, MAILSIGN=2, DOMAIN=3, ENDING=4, COMMA=5, WS=6, ERROR=7;
	public static final int
		RULE_expr = 0, RULE_userPart = 1, RULE_domainPart = 2, RULE_mailList = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"expr", "userPart", "domainPart", "mailList"
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
			null, "USER", "MAILSIGN", "DOMAIN", "ENDING", "COMMA", "WS", "ERROR"
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
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(8);
			userPart();
			setState(9);
			match(MAILSIGN);
			setState(10);
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

	@SuppressWarnings("CheckReturnValue")
	public static class UserPartContext extends ParserRuleContext {
		public TerminalNode USER() { return getToken(Aufgabe2aParser.USER, 0); }
		public UserPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_userPart; }
	}

	public final UserPartContext userPart() throws RecognitionException {
		UserPartContext _localctx = new UserPartContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_userPart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DomainPartContext extends ParserRuleContext {
		public TerminalNode DOMAIN() { return getToken(Aufgabe2aParser.DOMAIN, 0); }
		public TerminalNode ENDING() { return getToken(Aufgabe2aParser.ENDING, 0); }
		public DomainPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_domainPart; }
	}

	public final DomainPartContext domainPart() throws RecognitionException {
		DomainPartContext _localctx = new DomainPartContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_domainPart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			match(DOMAIN);
			setState(15);
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
	}

	public final MailListContext mailList() throws RecognitionException {
		MailListContext _localctx = new MailListContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_mailList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17);
			expr();
			setState(22);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(18);
				match(COMMA);
				setState(19);
				expr();
				}
				}
				setState(24);
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
		"\u0004\u0001\u0007\u001a\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003\u0015\b\u0003"+
		"\n\u0003\f\u0003\u0018\t\u0003\u0001\u0003\u0000\u0000\u0004\u0000\u0002"+
		"\u0004\u0006\u0000\u0000\u0016\u0000\b\u0001\u0000\u0000\u0000\u0002\f"+
		"\u0001\u0000\u0000\u0000\u0004\u000e\u0001\u0000\u0000\u0000\u0006\u0011"+
		"\u0001\u0000\u0000\u0000\b\t\u0003\u0002\u0001\u0000\t\n\u0005\u0002\u0000"+
		"\u0000\n\u000b\u0003\u0004\u0002\u0000\u000b\u0001\u0001\u0000\u0000\u0000"+
		"\f\r\u0005\u0001\u0000\u0000\r\u0003\u0001\u0000\u0000\u0000\u000e\u000f"+
		"\u0005\u0003\u0000\u0000\u000f\u0010\u0005\u0004\u0000\u0000\u0010\u0005"+
		"\u0001\u0000\u0000\u0000\u0011\u0016\u0003\u0000\u0000\u0000\u0012\u0013"+
		"\u0005\u0005\u0000\u0000\u0013\u0015\u0003\u0000\u0000\u0000\u0014\u0012"+
		"\u0001\u0000\u0000\u0000\u0015\u0018\u0001\u0000\u0000\u0000\u0016\u0014"+
		"\u0001\u0000\u0000\u0000\u0016\u0017\u0001\u0000\u0000\u0000\u0017\u0007"+
		"\u0001\u0000\u0000\u0000\u0018\u0016\u0001\u0000\u0000\u0000\u0001\u0016";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}