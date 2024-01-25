// Generated from Aufgabe2aLexer.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Aufgabe2aLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		USER=1, MAILSIGN=2, REST=3, COMMA=4, WS=5, ERROR=6;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"USER", "MAILSIGN", "REST", "COMMA", "WS", "ERROR", "Domain", "Ending"
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


	public Aufgabe2aLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Aufgabe2aLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\b@\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\6\2\25\n\2"+
		"\r\2\16\2\26\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\6\6\6!\n\6\r\6\16\6\"\3\6\3"+
		"\6\3\7\3\7\3\7\3\7\3\b\6\b,\n\b\r\b\16\b-\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t?\n\t\2\2\n\3\3\5\4\7\5\t\6\13\7\r"+
		"\b\17\2\21\2\3\2\6\6\2//\62;C\\c|\3\2BB\5\2\13\f\17\17\"\"\4\2C\\c|\2"+
		"C\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\3\24\3\2\2\2\5\30\3\2\2\2\7\32\3\2\2\2\t\35\3\2\2\2\13 \3\2\2\2\r"+
		"&\3\2\2\2\17+\3\2\2\2\21>\3\2\2\2\23\25\t\2\2\2\24\23\3\2\2\2\25\26\3"+
		"\2\2\2\26\24\3\2\2\2\26\27\3\2\2\2\27\4\3\2\2\2\30\31\t\3\2\2\31\6\3\2"+
		"\2\2\32\33\5\17\b\2\33\34\5\21\t\2\34\b\3\2\2\2\35\36\7.\2\2\36\n\3\2"+
		"\2\2\37!\t\4\2\2 \37\3\2\2\2!\"\3\2\2\2\" \3\2\2\2\"#\3\2\2\2#$\3\2\2"+
		"\2$%\b\6\2\2%\f\3\2\2\2&\'\13\2\2\2\'(\3\2\2\2()\b\7\2\2)\16\3\2\2\2*"+
		",\t\5\2\2+*\3\2\2\2,-\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\20\3\2\2\2/\60\7\60"+
		"\2\2\60\61\7f\2\2\61?\7g\2\2\62\63\7\60\2\2\63\64\7e\2\2\64\65\7q\2\2"+
		"\65?\7o\2\2\66\67\7\60\2\2\678\7q\2\289\7t\2\29?\7i\2\2:;\7\60\2\2;<\7"+
		"p\2\2<=\7g\2\2=?\7v\2\2>/\3\2\2\2>\62\3\2\2\2>\66\3\2\2\2>:\3\2\2\2?\22"+
		"\3\2\2\2\7\2\26\"->\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}