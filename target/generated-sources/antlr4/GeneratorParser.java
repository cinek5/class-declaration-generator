// Generated from Generator.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GeneratorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, OFTYPE=6, NAME=7, TYPENAME=8, 
		WHITESPACE=9, NEWLINE=10, UNKNOWN_CHAR=11;
	public static final int
		RULE_root = 0, RULE_attrdef = 1, RULE_attrname = 2, RULE_typename = 3, 
		RULE_getter = 4, RULE_setter = 5;
	public static final String[] ruleNames = {
		"root", "attrdef", "attrname", "typename", "getter", "setter"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'['", "']'", "';'", "'get'", "'set'", "'oftype'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, "OFTYPE", "NAME", "TYPENAME", "WHITESPACE", 
		"NEWLINE", "UNKNOWN_CHAR"
	};
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
	public String getGrammarFileName() { return "Generator.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GeneratorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class RootContext extends ParserRuleContext {
		public TerminalNode TYPENAME() { return getToken(GeneratorParser.TYPENAME, 0); }
		public TerminalNode EOF() { return getToken(GeneratorParser.EOF, 0); }
		public List<AttrdefContext> attrdef() {
			return getRuleContexts(AttrdefContext.class);
		}
		public AttrdefContext attrdef(int i) {
			return getRuleContext(AttrdefContext.class,i);
		}
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeneratorListener ) ((GeneratorListener)listener).enterRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeneratorListener ) ((GeneratorListener)listener).exitRoot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeneratorVisitor ) return ((GeneratorVisitor<? extends T>)visitor).visitRoot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			match(TYPENAME);
			setState(13);
			match(T__0);
			setState(15); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(14);
				attrdef();
				}
				}
				setState(17); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NAME );
			setState(19);
			match(T__1);
			setState(20);
			match(EOF);
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

	public static class AttrdefContext extends ParserRuleContext {
		public AttrnameContext attrname() {
			return getRuleContext(AttrnameContext.class,0);
		}
		public TerminalNode OFTYPE() { return getToken(GeneratorParser.OFTYPE, 0); }
		public TypenameContext typename() {
			return getRuleContext(TypenameContext.class,0);
		}
		public GetterContext getter() {
			return getRuleContext(GetterContext.class,0);
		}
		public SetterContext setter() {
			return getRuleContext(SetterContext.class,0);
		}
		public AttrdefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attrdef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeneratorListener ) ((GeneratorListener)listener).enterAttrdef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeneratorListener ) ((GeneratorListener)listener).exitAttrdef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeneratorVisitor ) return ((GeneratorVisitor<? extends T>)visitor).visitAttrdef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttrdefContext attrdef() throws RecognitionException {
		AttrdefContext _localctx = new AttrdefContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_attrdef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			attrname();
			setState(23);
			match(OFTYPE);
			setState(24);
			typename();
			setState(26);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(25);
				getter();
				}
			}

			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(28);
				setter();
				}
			}

			setState(31);
			match(T__2);
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

	public static class AttrnameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(GeneratorParser.NAME, 0); }
		public AttrnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attrname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeneratorListener ) ((GeneratorListener)listener).enterAttrname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeneratorListener ) ((GeneratorListener)listener).exitAttrname(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeneratorVisitor ) return ((GeneratorVisitor<? extends T>)visitor).visitAttrname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttrnameContext attrname() throws RecognitionException {
		AttrnameContext _localctx = new AttrnameContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_attrname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			match(NAME);
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

	public static class TypenameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(GeneratorParser.NAME, 0); }
		public TerminalNode TYPENAME() { return getToken(GeneratorParser.TYPENAME, 0); }
		public TypenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typename; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeneratorListener ) ((GeneratorListener)listener).enterTypename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeneratorListener ) ((GeneratorListener)listener).exitTypename(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeneratorVisitor ) return ((GeneratorVisitor<? extends T>)visitor).visitTypename(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypenameContext typename() throws RecognitionException {
		TypenameContext _localctx = new TypenameContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_typename);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			_la = _input.LA(1);
			if ( !(_la==NAME || _la==TYPENAME) ) {
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

	public static class GetterContext extends ParserRuleContext {
		public GetterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeneratorListener ) ((GeneratorListener)listener).enterGetter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeneratorListener ) ((GeneratorListener)listener).exitGetter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeneratorVisitor ) return ((GeneratorVisitor<? extends T>)visitor).visitGetter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GetterContext getter() throws RecognitionException {
		GetterContext _localctx = new GetterContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_getter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(T__3);
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

	public static class SetterContext extends ParserRuleContext {
		public SetterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeneratorListener ) ((GeneratorListener)listener).enterSetter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeneratorListener ) ((GeneratorListener)listener).exitSetter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeneratorVisitor ) return ((GeneratorVisitor<? extends T>)visitor).visitSetter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetterContext setter() throws RecognitionException {
		SetterContext _localctx = new SetterContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_setter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(T__4);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\r,\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\6\2\22\n\2\r\2\16\2\23"+
		"\3\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3\35\n\3\3\3\5\3 \n\3\3\3\3\3\3\4\3\4\3"+
		"\5\3\5\3\6\3\6\3\7\3\7\3\7\2\2\b\2\4\6\b\n\f\2\3\3\2\t\n\2(\2\16\3\2\2"+
		"\2\4\30\3\2\2\2\6#\3\2\2\2\b%\3\2\2\2\n\'\3\2\2\2\f)\3\2\2\2\16\17\7\n"+
		"\2\2\17\21\7\3\2\2\20\22\5\4\3\2\21\20\3\2\2\2\22\23\3\2\2\2\23\21\3\2"+
		"\2\2\23\24\3\2\2\2\24\25\3\2\2\2\25\26\7\4\2\2\26\27\7\2\2\3\27\3\3\2"+
		"\2\2\30\31\5\6\4\2\31\32\7\b\2\2\32\34\5\b\5\2\33\35\5\n\6\2\34\33\3\2"+
		"\2\2\34\35\3\2\2\2\35\37\3\2\2\2\36 \5\f\7\2\37\36\3\2\2\2\37 \3\2\2\2"+
		" !\3\2\2\2!\"\7\5\2\2\"\5\3\2\2\2#$\7\t\2\2$\7\3\2\2\2%&\t\2\2\2&\t\3"+
		"\2\2\2\'(\7\6\2\2(\13\3\2\2\2)*\7\7\2\2*\r\3\2\2\2\5\23\34\37";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}