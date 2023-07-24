// Generated from expression\Curl.g4 by ANTLR 4.7.2

package expression;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CurlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, DATA=8, URL=9, 
		HEADER=10, WS=11;
	public static final int
		RULE_curl = 0;
	private static String[] makeRuleNames() {
		return new String[] {
			"curl"
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

	@Override
	public String getGrammarFileName() { return "Curl.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CurlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CurlContext extends ParserRuleContext {
		public CurlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_curl; }
	 
		public CurlContext() { }
		public void copyFrom(CurlContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CURLCOMMANDContext extends CurlContext {
		public Token method;
		public TerminalNode URL() { return getToken(CurlParser.URL, 0); }
		public TerminalNode DATA() { return getToken(CurlParser.DATA, 0); }
		public List<TerminalNode> HEADER() { return getTokens(CurlParser.HEADER); }
		public TerminalNode HEADER(int i) {
			return getToken(CurlParser.HEADER, i);
		}
		public CURLCOMMANDContext(CurlContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CurlListener ) ((CurlListener)listener).enterCURLCOMMAND(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CurlListener ) ((CurlListener)listener).exitCURLCOMMAND(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CurlVisitor ) return ((CurlVisitor<? extends T>)visitor).visitCURLCOMMAND(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CurlContext curl() throws RecognitionException {
		CurlContext _localctx = new CurlContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_curl);
		int _la;
		try {
			_localctx = new CURLCOMMANDContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(2);
			match(T__0);
			setState(3);
			match(T__1);
			setState(4);
			match(T__2);
			setState(5);
			((CURLCOMMANDContext)_localctx).method = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6))) != 0)) ) {
				((CURLCOMMANDContext)_localctx).method = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(6);
			match(URL);
			setState(12);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HEADER) {
				{
				setState(8); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(7);
					match(HEADER);
					}
					}
					setState(10); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==HEADER );
				}
			}

			setState(15);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DATA) {
				{
				setState(14);
				match(DATA);
				}
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\r\24\4\2\t\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\6\2\13\n\2\r\2\16\2\f\5\2\17\n\2\3\2\5\2\22\n\2\3"+
		"\2\2\2\3\2\2\3\3\2\6\t\2\25\2\4\3\2\2\2\4\5\7\3\2\2\5\6\7\4\2\2\6\7\7"+
		"\5\2\2\7\b\t\2\2\2\b\16\7\13\2\2\t\13\7\f\2\2\n\t\3\2\2\2\13\f\3\2\2\2"+
		"\f\n\3\2\2\2\f\r\3\2\2\2\r\17\3\2\2\2\16\n\3\2\2\2\16\17\3\2\2\2\17\21"+
		"\3\2\2\2\20\22\7\n\2\2\21\20\3\2\2\2\21\22\3\2\2\2\22\3\3\2\2\2\5\f\16"+
		"\21";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}