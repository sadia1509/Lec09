// Generated from expression\Curl.g4 by ANTLR 4.7.2

package expression;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CurlLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, DATA=8, URL=9, 
		HEADER=10, WS=11;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "DATA", "URL", 
			"HEADER", "STRINGVALUE", "ALPHANUMERIC", "SPECIALCHARACTER", "JAPANIES", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'curl'", "'--location'", "'--request'", "'GET'", "'POST'", "'PUT'", 
			"'DELETE'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "DATA", "URL", "HEADER", 
			"WS"
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


	public CurlLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Curl.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\r\u00a5\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\5\t`\n\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\5\13\u0089\n\13\3\13\3\13\5\13\u008d\n\13\3\f\3\f\3\f\3\f\6\f\u0093"+
		"\n\f\r\f\16\f\u0094\5\f\u0097\n\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\6\20"+
		"\u00a0\n\20\r\20\16\20\u00a1\3\20\3\20\2\2\21\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\2\31\2\33\2\35\2\37\r\3\2\6\7\2//\62;C\\aac|"+
		"\17\2\"(*.\60\61<=??AB]]__bb}\u0080\u00ad\u00ad\u00e4\u00e4\u02c8\u02c8"+
		"\3\2\u3002\uffa1\6\2\13\f\17\17\"\"^^\2\u00a9\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\37\3\2\2\2\3!\3\2\2\2\5&\3\2\2\2\7"+
		"\61\3\2\2\2\t;\3\2\2\2\13?\3\2\2\2\rD\3\2\2\2\17H\3\2\2\2\21_\3\2\2\2"+
		"\23f\3\2\2\2\25\u008c\3\2\2\2\27\u0096\3\2\2\2\31\u0098\3\2\2\2\33\u009a"+
		"\3\2\2\2\35\u009c\3\2\2\2\37\u009f\3\2\2\2!\"\7e\2\2\"#\7w\2\2#$\7t\2"+
		"\2$%\7n\2\2%\4\3\2\2\2&\'\7/\2\2\'(\7/\2\2()\7n\2\2)*\7q\2\2*+\7e\2\2"+
		"+,\7c\2\2,-\7v\2\2-.\7k\2\2./\7q\2\2/\60\7p\2\2\60\6\3\2\2\2\61\62\7/"+
		"\2\2\62\63\7/\2\2\63\64\7t\2\2\64\65\7g\2\2\65\66\7s\2\2\66\67\7w\2\2"+
		"\678\7g\2\289\7u\2\29:\7v\2\2:\b\3\2\2\2;<\7I\2\2<=\7G\2\2=>\7V\2\2>\n"+
		"\3\2\2\2?@\7R\2\2@A\7Q\2\2AB\7U\2\2BC\7V\2\2C\f\3\2\2\2DE\7R\2\2EF\7W"+
		"\2\2FG\7V\2\2G\16\3\2\2\2HI\7F\2\2IJ\7G\2\2JK\7N\2\2KL\7G\2\2LM\7V\2\2"+
		"MN\7G\2\2N\20\3\2\2\2OP\7/\2\2PQ\7/\2\2QR\7f\2\2RS\7c\2\2ST\7v\2\2T`\7"+
		"c\2\2UV\7/\2\2VW\7/\2\2WX\7f\2\2XY\7c\2\2YZ\7v\2\2Z[\7c\2\2[\\\7/\2\2"+
		"\\]\7t\2\2]^\7c\2\2^`\7y\2\2_O\3\2\2\2_U\3\2\2\2`a\3\2\2\2ab\5\37\20\2"+
		"bc\7)\2\2cd\5\27\f\2de\7)\2\2e\22\3\2\2\2fg\7)\2\2gh\5\27\f\2hi\7)\2\2"+
		"i\24\3\2\2\2jk\7/\2\2kl\7/\2\2lm\7j\2\2mn\7g\2\2no\7c\2\2op\7f\2\2pq\7"+
		"g\2\2qr\7t\2\2rs\3\2\2\2st\5\37\20\2tu\7)\2\2uv\5\27\f\2vw\7<\2\2wx\5"+
		"\27\f\2xy\7)\2\2y\u008d\3\2\2\2z{\7/\2\2{|\7/\2\2|}\7j\2\2}~\7g\2\2~\177"+
		"\7c\2\2\177\u0080\7f\2\2\u0080\u0081\7g\2\2\u0081\u0082\7t\2\2\u0082\u0083"+
		"\3\2\2\2\u0083\u0084\5\37\20\2\u0084\u0085\7)\2\2\u0085\u0086\5\27\f\2"+
		"\u0086\u0088\7=\2\2\u0087\u0089\5\37\20\2\u0088\u0087\3\2\2\2\u0088\u0089"+
		"\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008b\7)\2\2\u008b\u008d\3\2\2\2\u008c"+
		"j\3\2\2\2\u008cz\3\2\2\2\u008d\26\3\2\2\2\u008e\u0093\5\35\17\2\u008f"+
		"\u0093\5\31\r\2\u0090\u0093\5\33\16\2\u0091\u0093\5\37\20\2\u0092\u008e"+
		"\3\2\2\2\u0092\u008f\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0091\3\2\2\2\u0093"+
		"\u0094\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0097\3\2"+
		"\2\2\u0096\u0092\3\2\2\2\u0096\u0097\3\2\2\2\u0097\30\3\2\2\2\u0098\u0099"+
		"\t\2\2\2\u0099\32\3\2\2\2\u009a\u009b\t\3\2\2\u009b\34\3\2\2\2\u009c\u009d"+
		"\t\4\2\2\u009d\36\3\2\2\2\u009e\u00a0\t\5\2\2\u009f\u009e\3\2\2\2\u00a0"+
		"\u00a1\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\3\2"+
		"\2\2\u00a3\u00a4\b\20\2\2\u00a4 \3\2\2\2\n\2_\u0088\u008c\u0092\u0094"+
		"\u0096\u00a1\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}