// Generated from expression\Validation.g4 by ANTLR 4.7.2

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
public class ValidationParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, Exist=19, Datatype=20, RESPONSE_LEFT=21, RESPONSE_RIGHT=22, 
		SORT=23, ASC=24, DESC=25, BY=26, MAX=27, MIN=28, Date=29, Pattern=30, 
		Match=31, Regex=32, Identifier=33, REGEX=34, Seperator=35, EuqalEuqal=36, 
		LogicalOperators=37, AdditionalOperators=38, OPERATORS=39, OP_Bracket=40, 
		WS=41;
	public static final int
		RULE_validationStatement = 0, RULE_v = 1, RULE_v0 = 2, RULE_v1 = 3, RULE_v2 = 4, 
		RULE_v3 = 5, RULE_v4 = 6, RULE_v5 = 7, RULE_v6 = 8, RULE_v7 = 9, RULE_v8 = 10, 
		RULE_v9 = 11, RULE_v10 = 12, RULE_v11 = 13, RULE_v12 = 14, RULE_dateTime = 15, 
		RULE_functionResult = 16, RULE_functionNames = 17, RULE_isMaxMin = 18, 
		RULE_order = 19, RULE_statement = 20, RULE_isNot = 21, RULE_keyString = 22, 
		RULE_type = 23, RULE_keyStringMap = 24;
	private static String[] makeRuleNames() {
		return new String[] {
			"validationStatement", "v", "v0", "v1", "v2", "v3", "v4", "v5", "v6", 
			"v7", "v8", "v9", "v10", "v11", "v12", "dateTime", "functionResult", 
			"functionNames", "isMaxMin", "order", "statement", "isNot", "keyString", 
			"type", "keyStringMap"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\"'", "'-'", "':'", "'&'", "'contains'", "'startsWith'", "'endsWith'", 
			"'floor'", "'ceil'", "'round'", "'lengthOf'", "'sizeOf'", "'concat'", 
			"'!'", "'.'", "'[]'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "Exist", "Datatype", "RESPONSE_LEFT", 
			"RESPONSE_RIGHT", "SORT", "ASC", "DESC", "BY", "MAX", "MIN", "Date", 
			"Pattern", "Match", "Regex", "Identifier", "REGEX", "Seperator", "EuqalEuqal", 
			"LogicalOperators", "AdditionalOperators", "OPERATORS", "OP_Bracket", 
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
	public String getGrammarFileName() { return "Validation.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ValidationParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ValidationStatementContext extends ParserRuleContext {
		public List<VContext> v() {
			return getRuleContexts(VContext.class);
		}
		public VContext v(int i) {
			return getRuleContext(VContext.class,i);
		}
		public List<TerminalNode> Seperator() { return getTokens(ValidationParser.Seperator); }
		public TerminalNode Seperator(int i) {
			return getToken(ValidationParser.Seperator, i);
		}
		public ValidationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_validationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValidationListener ) ((ValidationListener)listener).enterValidationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValidationListener ) ((ValidationListener)listener).exitValidationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValidationVisitor ) return ((ValidationVisitor<? extends T>)visitor).visitValidationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValidationStatementContext validationStatement() throws RecognitionException {
		ValidationStatementContext _localctx = new ValidationStatementContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_validationStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			v();
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Seperator) {
				{
				{
				setState(51);
				match(Seperator);
				setState(52);
				v();
				}
				}
				setState(57);
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

	public static class VContext extends ParserRuleContext {
		public V0Context v0() {
			return getRuleContext(V0Context.class,0);
		}
		public V11Context v11() {
			return getRuleContext(V11Context.class,0);
		}
		public VContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_v; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValidationListener ) ((ValidationListener)listener).enterV(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValidationListener ) ((ValidationListener)listener).exitV(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValidationVisitor ) return ((ValidationVisitor<? extends T>)visitor).visitV(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VContext v() throws RecognitionException {
		VContext _localctx = new VContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_v);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(58);
				v0();
				}
				break;
			case 2:
				{
				setState(59);
				v11();
				}
				break;
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

	public static class V0Context extends ParserRuleContext {
		public V1Context v1() {
			return getRuleContext(V1Context.class,0);
		}
		public V2Context v2() {
			return getRuleContext(V2Context.class,0);
		}
		public V3Context v3() {
			return getRuleContext(V3Context.class,0);
		}
		public V4Context v4() {
			return getRuleContext(V4Context.class,0);
		}
		public V5Context v5() {
			return getRuleContext(V5Context.class,0);
		}
		public V6Context v6() {
			return getRuleContext(V6Context.class,0);
		}
		public V7Context v7() {
			return getRuleContext(V7Context.class,0);
		}
		public V8Context v8() {
			return getRuleContext(V8Context.class,0);
		}
		public V9Context v9() {
			return getRuleContext(V9Context.class,0);
		}
		public V10Context v10() {
			return getRuleContext(V10Context.class,0);
		}
		public V12Context v12() {
			return getRuleContext(V12Context.class,0);
		}
		public V0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_v0; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValidationListener ) ((ValidationListener)listener).enterV0(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValidationListener ) ((ValidationListener)listener).exitV0(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValidationVisitor ) return ((ValidationVisitor<? extends T>)visitor).visitV0(this);
			else return visitor.visitChildren(this);
		}
	}

	public final V0Context v0() throws RecognitionException {
		V0Context _localctx = new V0Context(_ctx, getState());
		enterRule(_localctx, 4, RULE_v0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(62);
				v1();
				}
				break;
			case 2:
				{
				setState(63);
				v2();
				}
				break;
			case 3:
				{
				setState(64);
				v3();
				}
				break;
			case 4:
				{
				setState(65);
				v4();
				}
				break;
			case 5:
				{
				setState(66);
				v5();
				}
				break;
			case 6:
				{
				setState(67);
				v6();
				}
				break;
			case 7:
				{
				setState(68);
				v7();
				}
				break;
			case 8:
				{
				setState(69);
				v8();
				}
				break;
			case 9:
				{
				setState(70);
				v9();
				}
				break;
			case 10:
				{
				setState(71);
				v10();
				}
				break;
			case 11:
				{
				setState(72);
				v12();
				}
				break;
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

	public static class V1Context extends ParserRuleContext {
		public V1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_v1; }
	 
		public V1Context() { }
		public void copyFrom(V1Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExistKeyContext extends V1Context {
		public IsNotContext isNot() {
			return getRuleContext(IsNotContext.class,0);
		}
		public TerminalNode Exist() { return getToken(ValidationParser.Exist, 0); }
		public KeyStringContext keyString() {
			return getRuleContext(KeyStringContext.class,0);
		}
		public KeyStringMapContext keyStringMap() {
			return getRuleContext(KeyStringMapContext.class,0);
		}
		public ExistKeyContext(V1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValidationListener ) ((ValidationListener)listener).enterExistKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValidationListener ) ((ValidationListener)listener).exitExistKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValidationVisitor ) return ((ValidationVisitor<? extends T>)visitor).visitExistKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final V1Context v1() throws RecognitionException {
		V1Context _localctx = new V1Context(_ctx, getState());
		enterRule(_localctx, 6, RULE_v1);
		try {
			_localctx = new ExistKeyContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			isNot();
			setState(76);
			match(Exist);
			setState(79);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(77);
				keyString();
				}
				break;
			case 2:
				{
				setState(78);
				keyStringMap();
				}
				break;
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

	public static class V2Context extends ParserRuleContext {
		public V2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_v2; }
	 
		public V2Context() { }
		public void copyFrom(V2Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DatatypeContext extends V2Context {
		public IsNotContext isNot() {
			return getRuleContext(IsNotContext.class,0);
		}
		public TerminalNode Datatype() { return getToken(ValidationParser.Datatype, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public KeyStringContext keyString() {
			return getRuleContext(KeyStringContext.class,0);
		}
		public KeyStringMapContext keyStringMap() {
			return getRuleContext(KeyStringMapContext.class,0);
		}
		public DatatypeContext(V2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValidationListener ) ((ValidationListener)listener).enterDatatype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValidationListener ) ((ValidationListener)listener).exitDatatype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValidationVisitor ) return ((ValidationVisitor<? extends T>)visitor).visitDatatype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final V2Context v2() throws RecognitionException {
		V2Context _localctx = new V2Context(_ctx, getState());
		enterRule(_localctx, 8, RULE_v2);
		try {
			_localctx = new DatatypeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			isNot();
			setState(82);
			match(Datatype);
			setState(85);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(83);
				keyString();
				}
				break;
			case 2:
				{
				setState(84);
				keyStringMap();
				}
				break;
			}
			setState(87);
			type();
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

	public static class V3Context extends ParserRuleContext {
		public V3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_v3; }
	 
		public V3Context() { }
		public void copyFrom(V3Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EqualContext extends V3Context {
		public TerminalNode EuqalEuqal() { return getToken(ValidationParser.EuqalEuqal, 0); }
		public List<KeyStringContext> keyString() {
			return getRuleContexts(KeyStringContext.class);
		}
		public KeyStringContext keyString(int i) {
			return getRuleContext(KeyStringContext.class,i);
		}
		public KeyStringMapContext keyStringMap() {
			return getRuleContext(KeyStringMapContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public EqualContext(V3Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValidationListener ) ((ValidationListener)listener).enterEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValidationListener ) ((ValidationListener)listener).exitEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValidationVisitor ) return ((ValidationVisitor<? extends T>)visitor).visitEqual(this);
			else return visitor.visitChildren(this);
		}
	}

	public final V3Context v3() throws RecognitionException {
		V3Context _localctx = new V3Context(_ctx, getState());
		enterRule(_localctx, 10, RULE_v3);
		try {
			_localctx = new EqualContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(89);
				keyString();
				}
				break;
			case 2:
				{
				setState(90);
				keyStringMap();
				}
				break;
			}
			setState(93);
			match(EuqalEuqal);
			setState(96);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(94);
				keyString();
				}
				break;
			case 2:
				{
				setState(95);
				type();
				}
				break;
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

	public static class V4Context extends ParserRuleContext {
		public V4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_v4; }
	 
		public V4Context() { }
		public void copyFrom(V4Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CheckForBothContext extends V4Context {
		public TerminalNode RESPONSE_LEFT() { return getToken(ValidationParser.RESPONSE_LEFT, 0); }
		public TerminalNode EuqalEuqal() { return getToken(ValidationParser.EuqalEuqal, 0); }
		public TerminalNode RESPONSE_RIGHT() { return getToken(ValidationParser.RESPONSE_RIGHT, 0); }
		public List<KeyStringContext> keyString() {
			return getRuleContexts(KeyStringContext.class);
		}
		public KeyStringContext keyString(int i) {
			return getRuleContext(KeyStringContext.class,i);
		}
		public List<KeyStringMapContext> keyStringMap() {
			return getRuleContexts(KeyStringMapContext.class);
		}
		public KeyStringMapContext keyStringMap(int i) {
			return getRuleContext(KeyStringMapContext.class,i);
		}
		public CheckForBothContext(V4Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValidationListener ) ((ValidationListener)listener).enterCheckForBoth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValidationListener ) ((ValidationListener)listener).exitCheckForBoth(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValidationVisitor ) return ((ValidationVisitor<? extends T>)visitor).visitCheckForBoth(this);
			else return visitor.visitChildren(this);
		}
	}

	public final V4Context v4() throws RecognitionException {
		V4Context _localctx = new V4Context(_ctx, getState());
		enterRule(_localctx, 12, RULE_v4);
		try {
			_localctx = new CheckForBothContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(RESPONSE_LEFT);
			setState(101);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(99);
				keyString();
				}
				break;
			case 2:
				{
				setState(100);
				keyStringMap();
				}
				break;
			}
			setState(103);
			match(EuqalEuqal);
			setState(104);
			match(RESPONSE_RIGHT);
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(105);
				keyString();
				}
				break;
			case 2:
				{
				setState(106);
				keyStringMap();
				}
				break;
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

	public static class V5Context extends ParserRuleContext {
		public V5Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_v5; }
	 
		public V5Context() { }
		public void copyFrom(V5Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CheckForAdditionalOperatorsContext extends V5Context {
		public List<KeyStringContext> keyString() {
			return getRuleContexts(KeyStringContext.class);
		}
		public KeyStringContext keyString(int i) {
			return getRuleContext(KeyStringContext.class,i);
		}
		public TerminalNode AdditionalOperators() { return getToken(ValidationParser.AdditionalOperators, 0); }
		public CheckForAdditionalOperatorsContext(V5Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValidationListener ) ((ValidationListener)listener).enterCheckForAdditionalOperators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValidationListener ) ((ValidationListener)listener).exitCheckForAdditionalOperators(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValidationVisitor ) return ((ValidationVisitor<? extends T>)visitor).visitCheckForAdditionalOperators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final V5Context v5() throws RecognitionException {
		V5Context _localctx = new V5Context(_ctx, getState());
		enterRule(_localctx, 14, RULE_v5);
		try {
			_localctx = new CheckForAdditionalOperatorsContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			keyString();
			setState(110);
			match(AdditionalOperators);
			setState(111);
			keyString();
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

	public static class V6Context extends ParserRuleContext {
		public V6Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_v6; }
	 
		public V6Context() { }
		public void copyFrom(V6Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CalculateContext extends V6Context {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode EuqalEuqal() { return getToken(ValidationParser.EuqalEuqal, 0); }
		public KeyStringContext keyString() {
			return getRuleContext(KeyStringContext.class,0);
		}
		public List<TerminalNode> OPERATORS() { return getTokens(ValidationParser.OPERATORS); }
		public TerminalNode OPERATORS(int i) {
			return getToken(ValidationParser.OPERATORS, i);
		}
		public CalculateContext(V6Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValidationListener ) ((ValidationListener)listener).enterCalculate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValidationListener ) ((ValidationListener)listener).exitCalculate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValidationVisitor ) return ((ValidationVisitor<? extends T>)visitor).visitCalculate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final V6Context v6() throws RecognitionException {
		V6Context _localctx = new V6Context(_ctx, getState());
		enterRule(_localctx, 16, RULE_v6);
		int _la;
		try {
			_localctx = new CalculateContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			statement();
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPERATORS) {
				{
				{
				setState(114);
				match(OPERATORS);
				setState(115);
				statement();
				}
				}
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(121);
			match(EuqalEuqal);
			setState(122);
			keyString();
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

	public static class V7Context extends ParserRuleContext {
		public V7Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_v7; }
	 
		public V7Context() { }
		public void copyFrom(V7Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SortingContext extends V7Context {
		public TerminalNode SORT() { return getToken(ValidationParser.SORT, 0); }
		public List<KeyStringContext> keyString() {
			return getRuleContexts(KeyStringContext.class);
		}
		public KeyStringContext keyString(int i) {
			return getRuleContext(KeyStringContext.class,i);
		}
		public TerminalNode BY() { return getToken(ValidationParser.BY, 0); }
		public OrderContext order() {
			return getRuleContext(OrderContext.class,0);
		}
		public SortingContext(V7Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValidationListener ) ((ValidationListener)listener).enterSorting(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValidationListener ) ((ValidationListener)listener).exitSorting(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValidationVisitor ) return ((ValidationVisitor<? extends T>)visitor).visitSorting(this);
			else return visitor.visitChildren(this);
		}
	}

	public final V7Context v7() throws RecognitionException {
		V7Context _localctx = new V7Context(_ctx, getState());
		enterRule(_localctx, 18, RULE_v7);
		try {
			_localctx = new SortingContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(SORT);
			setState(125);
			keyString();
			setState(126);
			match(BY);
			setState(127);
			keyString();
			setState(128);
			order();
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

	public static class V8Context extends ParserRuleContext {
		public V8Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_v8; }
	 
		public V8Context() { }
		public void copyFrom(V8Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MaxMinCheckContext extends V8Context {
		public IsMaxMinContext isMaxMin() {
			return getRuleContext(IsMaxMinContext.class,0);
		}
		public KeyStringMapContext keyStringMap() {
			return getRuleContext(KeyStringMapContext.class,0);
		}
		public TerminalNode EuqalEuqal() { return getToken(ValidationParser.EuqalEuqal, 0); }
		public KeyStringContext keyString() {
			return getRuleContext(KeyStringContext.class,0);
		}
		public MaxMinCheckContext(V8Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValidationListener ) ((ValidationListener)listener).enterMaxMinCheck(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValidationListener ) ((ValidationListener)listener).exitMaxMinCheck(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValidationVisitor ) return ((ValidationVisitor<? extends T>)visitor).visitMaxMinCheck(this);
			else return visitor.visitChildren(this);
		}
	}

	public final V8Context v8() throws RecognitionException {
		V8Context _localctx = new V8Context(_ctx, getState());
		enterRule(_localctx, 20, RULE_v8);
		try {
			_localctx = new MaxMinCheckContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			isMaxMin();
			setState(131);
			keyStringMap();
			setState(132);
			match(EuqalEuqal);
			setState(133);
			keyString();
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

	public static class V9Context extends ParserRuleContext {
		public V9Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_v9; }
	 
		public V9Context() { }
		public void copyFrom(V9Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FunctionCheckContext extends V9Context {
		public FunctionResultContext functionResult() {
			return getRuleContext(FunctionResultContext.class,0);
		}
		public KeyStringContext keyString() {
			return getRuleContext(KeyStringContext.class,0);
		}
		public KeyStringMapContext keyStringMap() {
			return getRuleContext(KeyStringMapContext.class,0);
		}
		public FunctionNamesContext functionNames() {
			return getRuleContext(FunctionNamesContext.class,0);
		}
		public FunctionCheckContext(V9Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValidationListener ) ((ValidationListener)listener).enterFunctionCheck(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValidationListener ) ((ValidationListener)listener).exitFunctionCheck(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValidationVisitor ) return ((ValidationVisitor<? extends T>)visitor).visitFunctionCheck(this);
			else return visitor.visitChildren(this);
		}
	}

	public final V9Context v9() throws RecognitionException {
		V9Context _localctx = new V9Context(_ctx, getState());
		enterRule(_localctx, 22, RULE_v9);
		int _la;
		try {
			_localctx = new FunctionCheckContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12))) != 0)) {
				{
				setState(135);
				functionNames();
				}
			}

			setState(140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(138);
				keyString();
				}
				break;
			case 2:
				{
				setState(139);
				keyStringMap();
				}
				break;
			}
			setState(142);
			functionResult();
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

	public static class V10Context extends ParserRuleContext {
		public V10Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_v10; }
	 
		public V10Context() { }
		public void copyFrom(V10Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DateTimePatternCheckContext extends V10Context {
		public TerminalNode Date() { return getToken(ValidationParser.Date, 0); }
		public KeyStringContext keyString() {
			return getRuleContext(KeyStringContext.class,0);
		}
		public TerminalNode Pattern() { return getToken(ValidationParser.Pattern, 0); }
		public DateTimeContext dateTime() {
			return getRuleContext(DateTimeContext.class,0);
		}
		public DateTimePatternCheckContext(V10Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValidationListener ) ((ValidationListener)listener).enterDateTimePatternCheck(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValidationListener ) ((ValidationListener)listener).exitDateTimePatternCheck(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValidationVisitor ) return ((ValidationVisitor<? extends T>)visitor).visitDateTimePatternCheck(this);
			else return visitor.visitChildren(this);
		}
	}

	public final V10Context v10() throws RecognitionException {
		V10Context _localctx = new V10Context(_ctx, getState());
		enterRule(_localctx, 24, RULE_v10);
		try {
			_localctx = new DateTimePatternCheckContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(Date);
			setState(145);
			keyString();
			setState(146);
			match(Pattern);
			setState(147);
			dateTime();
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

	public static class V11Context extends ParserRuleContext {
		public V11Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_v11; }
	 
		public V11Context() { }
		public void copyFrom(V11Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OperatorsContext extends V11Context {
		public List<V0Context> v0() {
			return getRuleContexts(V0Context.class);
		}
		public V0Context v0(int i) {
			return getRuleContext(V0Context.class,i);
		}
		public TerminalNode LogicalOperators() { return getToken(ValidationParser.LogicalOperators, 0); }
		public OperatorsContext(V11Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValidationListener ) ((ValidationListener)listener).enterOperators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValidationListener ) ((ValidationListener)listener).exitOperators(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValidationVisitor ) return ((ValidationVisitor<? extends T>)visitor).visitOperators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final V11Context v11() throws RecognitionException {
		V11Context _localctx = new V11Context(_ctx, getState());
		enterRule(_localctx, 26, RULE_v11);
		try {
			_localctx = new OperatorsContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			v0();
			setState(150);
			match(LogicalOperators);
			setState(151);
			v0();
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

	public static class V12Context extends ParserRuleContext {
		public V12Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_v12; }
	 
		public V12Context() { }
		public void copyFrom(V12Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RegexMatchContext extends V12Context {
		public TerminalNode Match() { return getToken(ValidationParser.Match, 0); }
		public TerminalNode REGEX() { return getToken(ValidationParser.REGEX, 0); }
		public KeyStringContext keyString() {
			return getRuleContext(KeyStringContext.class,0);
		}
		public KeyStringMapContext keyStringMap() {
			return getRuleContext(KeyStringMapContext.class,0);
		}
		public RegexMatchContext(V12Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValidationListener ) ((ValidationListener)listener).enterRegexMatch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValidationListener ) ((ValidationListener)listener).exitRegexMatch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValidationVisitor ) return ((ValidationVisitor<? extends T>)visitor).visitRegexMatch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final V12Context v12() throws RecognitionException {
		V12Context _localctx = new V12Context(_ctx, getState());
		enterRule(_localctx, 28, RULE_v12);
		try {
			_localctx = new RegexMatchContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(Match);
			setState(156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(154);
				keyString();
				}
				break;
			case 2:
				{
				setState(155);
				keyStringMap();
				}
				break;
			}
			setState(158);
			match(REGEX);
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

	public static class DateTimeContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(ValidationParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(ValidationParser.Identifier, i);
		}
		public DateTimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dateTime; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValidationListener ) ((ValidationListener)listener).enterDateTime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValidationListener ) ((ValidationListener)listener).exitDateTime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValidationVisitor ) return ((ValidationVisitor<? extends T>)visitor).visitDateTime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DateTimeContext dateTime() throws RecognitionException {
		DateTimeContext _localctx = new DateTimeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_dateTime);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(160);
				match(T__0);
				}
			}

			setState(163);
			match(Identifier);
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(164);
				match(T__1);
				setState(165);
				match(Identifier);
				}
				}
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(171);
				match(Identifier);
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(172);
					match(T__2);
					setState(173);
					match(Identifier);
					}
					}
					setState(178);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(181);
				match(T__0);
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

	public static class FunctionResultContext extends ParserRuleContext {
		public FunctionNamesContext functionNames() {
			return getRuleContext(FunctionNamesContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode EuqalEuqal() { return getToken(ValidationParser.EuqalEuqal, 0); }
		public TerminalNode Identifier() { return getToken(ValidationParser.Identifier, 0); }
		public List<KeyStringContext> keyString() {
			return getRuleContexts(KeyStringContext.class);
		}
		public KeyStringContext keyString(int i) {
			return getRuleContext(KeyStringContext.class,i);
		}
		public FunctionResultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionResult; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValidationListener ) ((ValidationListener)listener).enterFunctionResult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValidationListener ) ((ValidationListener)listener).exitFunctionResult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValidationVisitor ) return ((ValidationVisitor<? extends T>)visitor).visitFunctionResult(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionResultContext functionResult() throws RecognitionException {
		FunctionResultContext _localctx = new FunctionResultContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_functionResult);
		int _la;
		try {
			setState(203);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(184);
				functionNames();
				setState(185);
				type();
				}
				break;
			case EuqalEuqal:
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
				match(EuqalEuqal);
				setState(188);
				type();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 3);
				{
				setState(191); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(189);
					match(T__3);
					setState(190);
					keyString();
					}
					}
					setState(193); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__3 );
				setState(195);
				match(EuqalEuqal);
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(196);
					match(T__0);
					}
				}

				setState(199);
				match(Identifier);
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(200);
					match(T__0);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class FunctionNamesContext extends ParserRuleContext {
		public FunctionNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionNames; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValidationListener ) ((ValidationListener)listener).enterFunctionNames(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValidationListener ) ((ValidationListener)listener).exitFunctionNames(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValidationVisitor ) return ((ValidationVisitor<? extends T>)visitor).visitFunctionNames(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionNamesContext functionNames() throws RecognitionException {
		FunctionNamesContext _localctx = new FunctionNamesContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_functionNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class IsMaxMinContext extends ParserRuleContext {
		public TerminalNode MAX() { return getToken(ValidationParser.MAX, 0); }
		public TerminalNode MIN() { return getToken(ValidationParser.MIN, 0); }
		public IsMaxMinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_isMaxMin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValidationListener ) ((ValidationListener)listener).enterIsMaxMin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValidationListener ) ((ValidationListener)listener).exitIsMaxMin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValidationVisitor ) return ((ValidationVisitor<? extends T>)visitor).visitIsMaxMin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IsMaxMinContext isMaxMin() throws RecognitionException {
		IsMaxMinContext _localctx = new IsMaxMinContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_isMaxMin);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			_la = _input.LA(1);
			if ( !(_la==MAX || _la==MIN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class OrderContext extends ParserRuleContext {
		public TerminalNode ASC() { return getToken(ValidationParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(ValidationParser.DESC, 0); }
		public OrderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_order; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValidationListener ) ((ValidationListener)listener).enterOrder(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValidationListener ) ((ValidationListener)listener).exitOrder(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValidationVisitor ) return ((ValidationVisitor<? extends T>)visitor).visitOrder(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderContext order() throws RecognitionException {
		OrderContext _localctx = new OrderContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_order);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			_la = _input.LA(1);
			if ( !(_la==ASC || _la==DESC) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class StatementContext extends ParserRuleContext {
		public List<KeyStringContext> keyString() {
			return getRuleContexts(KeyStringContext.class);
		}
		public KeyStringContext keyString(int i) {
			return getRuleContext(KeyStringContext.class,i);
		}
		public List<TerminalNode> OP_Bracket() { return getTokens(ValidationParser.OP_Bracket); }
		public TerminalNode OP_Bracket(int i) {
			return getToken(ValidationParser.OP_Bracket, i);
		}
		public List<TerminalNode> OPERATORS() { return getTokens(ValidationParser.OPERATORS); }
		public TerminalNode OPERATORS(int i) {
			return getToken(ValidationParser.OPERATORS, i);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValidationListener ) ((ValidationListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValidationListener ) ((ValidationListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValidationVisitor ) return ((ValidationVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_statement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_Bracket) {
				{
				{
				setState(211);
				match(OP_Bracket);
				}
				}
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(217);
			keyString();
			setState(232); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(218);
					match(OPERATORS);
					setState(222);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==OP_Bracket) {
						{
						{
						setState(219);
						match(OP_Bracket);
						}
						}
						setState(224);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(225);
					keyString();
					setState(229);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==OP_Bracket) {
						{
						{
						setState(226);
						match(OP_Bracket);
						}
						}
						setState(231);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(234); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class IsNotContext extends ParserRuleContext {
		public IsNotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_isNot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValidationListener ) ((ValidationListener)listener).enterIsNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValidationListener ) ((ValidationListener)listener).exitIsNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValidationVisitor ) return ((ValidationVisitor<? extends T>)visitor).visitIsNot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IsNotContext isNot() throws RecognitionException {
		IsNotContext _localctx = new IsNotContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_isNot);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(236);
				match(T__13);
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

	public static class KeyStringContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(ValidationParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(ValidationParser.Identifier, i);
		}
		public KeyStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyString; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValidationListener ) ((ValidationListener)listener).enterKeyString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValidationListener ) ((ValidationListener)listener).exitKeyString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValidationVisitor ) return ((ValidationVisitor<? extends T>)visitor).visitKeyString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyStringContext keyString() throws RecognitionException {
		KeyStringContext _localctx = new KeyStringContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_keyString);
		try {
			int _alt;
			setState(248);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(239);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(240);
				match(Identifier);
				setState(245);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(241);
						match(T__14);
						setState(242);
						match(Identifier);
						}
						} 
					}
					setState(247);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				}
				}
				break;
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

	public static class TypeContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(ValidationParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(ValidationParser.Identifier, i);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValidationListener ) ((ValidationListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValidationListener ) ((ValidationListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValidationVisitor ) return ((ValidationVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_type);
		int _la;
		try {
			setState(264);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(250);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(251);
					match(T__0);
					}
				}

				setState(254);
				match(Identifier);
				setState(258);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Identifier) {
					{
					{
					setState(255);
					match(Identifier);
					}
					}
					setState(260);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(262);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(261);
					match(T__0);
					}
				}

				}
				break;
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

	public static class KeyStringMapContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(ValidationParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(ValidationParser.Identifier, i);
		}
		public KeyStringContext keyString() {
			return getRuleContext(KeyStringContext.class,0);
		}
		public KeyStringMapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyStringMap; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValidationListener ) ((ValidationListener)listener).enterKeyStringMap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValidationListener ) ((ValidationListener)listener).exitKeyStringMap(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValidationVisitor ) return ((ValidationVisitor<? extends T>)visitor).visitKeyStringMap(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyStringMapContext keyStringMap() throws RecognitionException {
		KeyStringMapContext _localctx = new KeyStringMapContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_keyStringMap);
		try {
			int _alt;
			setState(298);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(266);
				match(Identifier);
				{
				setState(267);
				match(T__15);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(268);
				match(Identifier);
				{
				setState(269);
				match(T__15);
				}
				setState(274);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(270);
						match(T__14);
						setState(271);
						match(Identifier);
						}
						} 
					}
					setState(276);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(277);
				keyString();
				{
				setState(278);
				match(T__15);
				}
				setState(283);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(279);
						match(T__14);
						setState(280);
						match(Identifier);
						}
						} 
					}
					setState(285);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(286);
				keyString();
				{
				setState(287);
				match(T__16);
				setState(288);
				match(Identifier);
				setState(289);
				match(T__17);
				}
				setState(295);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(291);
						match(T__14);
						setState(292);
						match(Identifier);
						}
						} 
					}
					setState(297);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				}
				}
				break;
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3+\u012f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\3\2\7\28\n\2\f\2\16\2;\13\2\3\3\3\3\5\3?\n\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4L\n\4\3\5\3\5\3\5\3\5\5\5R\n"+
		"\5\3\6\3\6\3\6\3\6\5\6X\n\6\3\6\3\6\3\7\3\7\5\7^\n\7\3\7\3\7\3\7\5\7c"+
		"\n\7\3\b\3\b\3\b\5\bh\n\b\3\b\3\b\3\b\3\b\5\bn\n\b\3\t\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\7\nw\n\n\f\n\16\nz\13\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\3\r\5\r\u008b\n\r\3\r\3\r\5\r\u008f\n\r\3\r"+
		"\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\5\20"+
		"\u009f\n\20\3\20\3\20\3\21\5\21\u00a4\n\21\3\21\3\21\3\21\7\21\u00a9\n"+
		"\21\f\21\16\21\u00ac\13\21\3\21\3\21\3\21\7\21\u00b1\n\21\f\21\16\21\u00b4"+
		"\13\21\5\21\u00b6\n\21\3\21\5\21\u00b9\n\21\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\6\22\u00c2\n\22\r\22\16\22\u00c3\3\22\3\22\5\22\u00c8\n\22\3"+
		"\22\3\22\5\22\u00cc\n\22\5\22\u00ce\n\22\3\23\3\23\3\24\3\24\3\25\3\25"+
		"\3\26\7\26\u00d7\n\26\f\26\16\26\u00da\13\26\3\26\3\26\3\26\7\26\u00df"+
		"\n\26\f\26\16\26\u00e2\13\26\3\26\3\26\7\26\u00e6\n\26\f\26\16\26\u00e9"+
		"\13\26\6\26\u00eb\n\26\r\26\16\26\u00ec\3\27\5\27\u00f0\n\27\3\30\3\30"+
		"\3\30\3\30\7\30\u00f6\n\30\f\30\16\30\u00f9\13\30\5\30\u00fb\n\30\3\31"+
		"\3\31\5\31\u00ff\n\31\3\31\3\31\7\31\u0103\n\31\f\31\16\31\u0106\13\31"+
		"\3\31\5\31\u0109\n\31\5\31\u010b\n\31\3\32\3\32\3\32\3\32\3\32\3\32\7"+
		"\32\u0113\n\32\f\32\16\32\u0116\13\32\3\32\3\32\3\32\3\32\7\32\u011c\n"+
		"\32\f\32\16\32\u011f\13\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u0128"+
		"\n\32\f\32\16\32\u012b\13\32\5\32\u012d\n\32\3\32\6\u00f7\u0114\u011d"+
		"\u0129\2\33\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\2\5"+
		"\3\2\7\17\3\2\35\36\3\2\32\33\2\u0146\2\64\3\2\2\2\4>\3\2\2\2\6K\3\2\2"+
		"\2\bM\3\2\2\2\nS\3\2\2\2\f]\3\2\2\2\16d\3\2\2\2\20o\3\2\2\2\22s\3\2\2"+
		"\2\24~\3\2\2\2\26\u0084\3\2\2\2\30\u008a\3\2\2\2\32\u0092\3\2\2\2\34\u0097"+
		"\3\2\2\2\36\u009b\3\2\2\2 \u00a3\3\2\2\2\"\u00cd\3\2\2\2$\u00cf\3\2\2"+
		"\2&\u00d1\3\2\2\2(\u00d3\3\2\2\2*\u00d8\3\2\2\2,\u00ef\3\2\2\2.\u00fa"+
		"\3\2\2\2\60\u010a\3\2\2\2\62\u012c\3\2\2\2\649\5\4\3\2\65\66\7%\2\2\66"+
		"8\5\4\3\2\67\65\3\2\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2:\3\3\2\2\2;9\3"+
		"\2\2\2<?\5\6\4\2=?\5\34\17\2><\3\2\2\2>=\3\2\2\2?\5\3\2\2\2@L\5\b\5\2"+
		"AL\5\n\6\2BL\5\f\7\2CL\5\16\b\2DL\5\20\t\2EL\5\22\n\2FL\5\24\13\2GL\5"+
		"\26\f\2HL\5\30\r\2IL\5\32\16\2JL\5\36\20\2K@\3\2\2\2KA\3\2\2\2KB\3\2\2"+
		"\2KC\3\2\2\2KD\3\2\2\2KE\3\2\2\2KF\3\2\2\2KG\3\2\2\2KH\3\2\2\2KI\3\2\2"+
		"\2KJ\3\2\2\2L\7\3\2\2\2MN\5,\27\2NQ\7\25\2\2OR\5.\30\2PR\5\62\32\2QO\3"+
		"\2\2\2QP\3\2\2\2R\t\3\2\2\2ST\5,\27\2TW\7\26\2\2UX\5.\30\2VX\5\62\32\2"+
		"WU\3\2\2\2WV\3\2\2\2XY\3\2\2\2YZ\5\60\31\2Z\13\3\2\2\2[^\5.\30\2\\^\5"+
		"\62\32\2][\3\2\2\2]\\\3\2\2\2^_\3\2\2\2_b\7&\2\2`c\5.\30\2ac\5\60\31\2"+
		"b`\3\2\2\2ba\3\2\2\2c\r\3\2\2\2dg\7\27\2\2eh\5.\30\2fh\5\62\32\2ge\3\2"+
		"\2\2gf\3\2\2\2hi\3\2\2\2ij\7&\2\2jm\7\30\2\2kn\5.\30\2ln\5\62\32\2mk\3"+
		"\2\2\2ml\3\2\2\2n\17\3\2\2\2op\5.\30\2pq\7(\2\2qr\5.\30\2r\21\3\2\2\2"+
		"sx\5*\26\2tu\7)\2\2uw\5*\26\2vt\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2"+
		"y{\3\2\2\2zx\3\2\2\2{|\7&\2\2|}\5.\30\2}\23\3\2\2\2~\177\7\31\2\2\177"+
		"\u0080\5.\30\2\u0080\u0081\7\34\2\2\u0081\u0082\5.\30\2\u0082\u0083\5"+
		"(\25\2\u0083\25\3\2\2\2\u0084\u0085\5&\24\2\u0085\u0086\5\62\32\2\u0086"+
		"\u0087\7&\2\2\u0087\u0088\5.\30\2\u0088\27\3\2\2\2\u0089\u008b\5$\23\2"+
		"\u008a\u0089\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008f"+
		"\5.\30\2\u008d\u008f\5\62\32\2\u008e\u008c\3\2\2\2\u008e\u008d\3\2\2\2"+
		"\u008f\u0090\3\2\2\2\u0090\u0091\5\"\22\2\u0091\31\3\2\2\2\u0092\u0093"+
		"\7\37\2\2\u0093\u0094\5.\30\2\u0094\u0095\7 \2\2\u0095\u0096\5 \21\2\u0096"+
		"\33\3\2\2\2\u0097\u0098\5\6\4\2\u0098\u0099\7\'\2\2\u0099\u009a\5\6\4"+
		"\2\u009a\35\3\2\2\2\u009b\u009e\7!\2\2\u009c\u009f\5.\30\2\u009d\u009f"+
		"\5\62\32\2\u009e\u009c\3\2\2\2\u009e\u009d\3\2\2\2\u009f\u00a0\3\2\2\2"+
		"\u00a0\u00a1\7$\2\2\u00a1\37\3\2\2\2\u00a2\u00a4\7\3\2\2\u00a3\u00a2\3"+
		"\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00aa\7#\2\2\u00a6"+
		"\u00a7\7\4\2\2\u00a7\u00a9\7#\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00ac\3\2"+
		"\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00b5\3\2\2\2\u00ac"+
		"\u00aa\3\2\2\2\u00ad\u00b2\7#\2\2\u00ae\u00af\7\5\2\2\u00af\u00b1\7#\2"+
		"\2\u00b0\u00ae\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3"+
		"\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00ad\3\2\2\2\u00b5"+
		"\u00b6\3\2\2\2\u00b6\u00b8\3\2\2\2\u00b7\u00b9\7\3\2\2\u00b8\u00b7\3\2"+
		"\2\2\u00b8\u00b9\3\2\2\2\u00b9!\3\2\2\2\u00ba\u00bb\5$\23\2\u00bb\u00bc"+
		"\5\60\31\2\u00bc\u00ce\3\2\2\2\u00bd\u00be\7&\2\2\u00be\u00ce\5\60\31"+
		"\2\u00bf\u00c0\7\6\2\2\u00c0\u00c2\5.\30\2\u00c1\u00bf\3\2\2\2\u00c2\u00c3"+
		"\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5"+
		"\u00c7\7&\2\2\u00c6\u00c8\7\3\2\2\u00c7\u00c6\3\2\2\2\u00c7\u00c8\3\2"+
		"\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00cb\7#\2\2\u00ca\u00cc\7\3\2\2\u00cb"+
		"\u00ca\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ce\3\2\2\2\u00cd\u00ba\3\2"+
		"\2\2\u00cd\u00bd\3\2\2\2\u00cd\u00c1\3\2\2\2\u00ce#\3\2\2\2\u00cf\u00d0"+
		"\t\2\2\2\u00d0%\3\2\2\2\u00d1\u00d2\t\3\2\2\u00d2\'\3\2\2\2\u00d3\u00d4"+
		"\t\4\2\2\u00d4)\3\2\2\2\u00d5\u00d7\7*\2\2\u00d6\u00d5\3\2\2\2\u00d7\u00da"+
		"\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00db\3\2\2\2\u00da"+
		"\u00d8\3\2\2\2\u00db\u00ea\5.\30\2\u00dc\u00e0\7)\2\2\u00dd\u00df\7*\2"+
		"\2\u00de\u00dd\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1"+
		"\3\2\2\2\u00e1\u00e3\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e3\u00e7\5.\30\2\u00e4"+
		"\u00e6\7*\2\2\u00e5\u00e4\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2"+
		"\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00eb\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea"+
		"\u00dc\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2"+
		"\2\2\u00ed+\3\2\2\2\u00ee\u00f0\7\20\2\2\u00ef\u00ee\3\2\2\2\u00ef\u00f0"+
		"\3\2\2\2\u00f0-\3\2\2\2\u00f1\u00fb\7#\2\2\u00f2\u00f7\7#\2\2\u00f3\u00f4"+
		"\7\21\2\2\u00f4\u00f6\7#\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7"+
		"\u00f8\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9\u00f7\3\2"+
		"\2\2\u00fa\u00f1\3\2\2\2\u00fa\u00f2\3\2\2\2\u00fb/\3\2\2\2\u00fc\u010b"+
		"\7#\2\2\u00fd\u00ff\7\3\2\2\u00fe\u00fd\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff"+
		"\u0100\3\2\2\2\u0100\u0104\7#\2\2\u0101\u0103\7#\2\2\u0102\u0101\3\2\2"+
		"\2\u0103\u0106\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0108"+
		"\3\2\2\2\u0106\u0104\3\2\2\2\u0107\u0109\7\3\2\2\u0108\u0107\3\2\2\2\u0108"+
		"\u0109\3\2\2\2\u0109\u010b\3\2\2\2\u010a\u00fc\3\2\2\2\u010a\u00fe\3\2"+
		"\2\2\u010b\61\3\2\2\2\u010c\u010d\7#\2\2\u010d\u012d\7\22\2\2\u010e\u010f"+
		"\7#\2\2\u010f\u0114\7\22\2\2\u0110\u0111\7\21\2\2\u0111\u0113\7#\2\2\u0112"+
		"\u0110\3\2\2\2\u0113\u0116\3\2\2\2\u0114\u0115\3\2\2\2\u0114\u0112\3\2"+
		"\2\2\u0115\u012d\3\2\2\2\u0116\u0114\3\2\2\2\u0117\u0118\5.\30\2\u0118"+
		"\u011d\7\22\2\2\u0119\u011a\7\21\2\2\u011a\u011c\7#\2\2\u011b\u0119\3"+
		"\2\2\2\u011c\u011f\3\2\2\2\u011d\u011e\3\2\2\2\u011d\u011b\3\2\2\2\u011e"+
		"\u012d\3\2\2\2\u011f\u011d\3\2\2\2\u0120\u0121\5.\30\2\u0121\u0122\7\23"+
		"\2\2\u0122\u0123\7#\2\2\u0123\u0124\7\24\2\2\u0124\u0129\3\2\2\2\u0125"+
		"\u0126\7\21\2\2\u0126\u0128\7#\2\2\u0127\u0125\3\2\2\2\u0128\u012b\3\2"+
		"\2\2\u0129\u012a\3\2\2\2\u0129\u0127\3\2\2\2\u012a\u012d\3\2\2\2\u012b"+
		"\u0129\3\2\2\2\u012c\u010c\3\2\2\2\u012c\u010e\3\2\2\2\u012c\u0117\3\2"+
		"\2\2\u012c\u0120\3\2\2\2\u012d\63\3\2\2\2\'9>KQW]bgmx\u008a\u008e\u009e"+
		"\u00a3\u00aa\u00b2\u00b5\u00b8\u00c3\u00c7\u00cb\u00cd\u00d8\u00e0\u00e7"+
		"\u00ec\u00ef\u00f7\u00fa\u00fe\u0104\u0108\u010a\u0114\u011d\u0129\u012c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}