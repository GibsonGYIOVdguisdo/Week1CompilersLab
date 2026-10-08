// Generated from C:/Users/gh379/Documents/Programming/Week1CompilersLab/week1/src/Characters.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class CharactersParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Operation=1, Keyword=2, Integer=3, Identifier=4, Uppercase=5, Lowercase=6, 
		Digit=7, Whitespace=8, Punctuation=9, Extended=10, Semicolon=11, Others=12;
	public static final int
		RULE_charstring = 0, RULE_somechar = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"charstring", "somechar"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Operation", "Keyword", "Integer", "Identifier", "Uppercase", "Lowercase", 
			"Digit", "Whitespace", "Punctuation", "Extended", "Semicolon", "Others"
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
	public String getGrammarFileName() { return "Characters.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CharactersParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CharstringContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CharactersParser.EOF, 0); }
		public List<SomecharContext> somechar() {
			return getRuleContexts(SomecharContext.class);
		}
		public SomecharContext somechar(int i) {
			return getRuleContext(SomecharContext.class,i);
		}
		public CharstringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charstring; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CharactersVisitor ) return ((CharactersVisitor<? extends T>)visitor).visitCharstring(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharstringContext charstring() throws RecognitionException {
		CharstringContext _localctx = new CharstringContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_charstring);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(5); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(4);
				somechar();
				}
				}
				setState(7); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 8190L) != 0) );
			setState(9);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SomecharContext extends ParserRuleContext {
		public SomecharContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_somechar; }
	 
		public SomecharContext() { }
		public void copyFrom(SomecharContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SemicolonContext extends SomecharContext {
		public TerminalNode Semicolon() { return getToken(CharactersParser.Semicolon, 0); }
		public SemicolonContext(SomecharContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CharactersVisitor ) return ((CharactersVisitor<? extends T>)visitor).visitSemicolon(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntegerContext extends SomecharContext {
		public TerminalNode Integer() { return getToken(CharactersParser.Integer, 0); }
		public IntegerContext(SomecharContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CharactersVisitor ) return ((CharactersVisitor<? extends T>)visitor).visitInteger(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UppercaseCharContext extends SomecharContext {
		public TerminalNode Uppercase() { return getToken(CharactersParser.Uppercase, 0); }
		public UppercaseCharContext(SomecharContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CharactersVisitor ) return ((CharactersVisitor<? extends T>)visitor).visitUppercaseChar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierContext extends SomecharContext {
		public TerminalNode Identifier() { return getToken(CharactersParser.Identifier, 0); }
		public IdentifierContext(SomecharContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CharactersVisitor ) return ((CharactersVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class KeywordContext extends SomecharContext {
		public TerminalNode Keyword() { return getToken(CharactersParser.Keyword, 0); }
		public KeywordContext(SomecharContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CharactersVisitor ) return ((CharactersVisitor<? extends T>)visitor).visitKeyword(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExtendedCharContext extends SomecharContext {
		public TerminalNode Extended() { return getToken(CharactersParser.Extended, 0); }
		public ExtendedCharContext(SomecharContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CharactersVisitor ) return ((CharactersVisitor<? extends T>)visitor).visitExtendedChar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OtherCharContext extends SomecharContext {
		public TerminalNode Others() { return getToken(CharactersParser.Others, 0); }
		public OtherCharContext(SomecharContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CharactersVisitor ) return ((CharactersVisitor<? extends T>)visitor).visitOtherChar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DigitCharContext extends SomecharContext {
		public TerminalNode Digit() { return getToken(CharactersParser.Digit, 0); }
		public DigitCharContext(SomecharContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CharactersVisitor ) return ((CharactersVisitor<? extends T>)visitor).visitDigitChar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OperationContext extends SomecharContext {
		public TerminalNode Operation() { return getToken(CharactersParser.Operation, 0); }
		public OperationContext(SomecharContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CharactersVisitor ) return ((CharactersVisitor<? extends T>)visitor).visitOperation(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LowercaseCharContext extends SomecharContext {
		public TerminalNode Lowercase() { return getToken(CharactersParser.Lowercase, 0); }
		public LowercaseCharContext(SomecharContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CharactersVisitor ) return ((CharactersVisitor<? extends T>)visitor).visitLowercaseChar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PunctuationCharContext extends SomecharContext {
		public TerminalNode Punctuation() { return getToken(CharactersParser.Punctuation, 0); }
		public PunctuationCharContext(SomecharContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CharactersVisitor ) return ((CharactersVisitor<? extends T>)visitor).visitPunctuationChar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhitespaceCharContext extends SomecharContext {
		public TerminalNode Whitespace() { return getToken(CharactersParser.Whitespace, 0); }
		public WhitespaceCharContext(SomecharContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CharactersVisitor ) return ((CharactersVisitor<? extends T>)visitor).visitWhitespaceChar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SomecharContext somechar() throws RecognitionException {
		SomecharContext _localctx = new SomecharContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_somechar);
		try {
			setState(23);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Keyword:
				_localctx = new KeywordContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(11);
				match(Keyword);
				}
				break;
			case Identifier:
				_localctx = new IdentifierContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(12);
				match(Identifier);
				}
				break;
			case Operation:
				_localctx = new OperationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(13);
				match(Operation);
				}
				break;
			case Semicolon:
				_localctx = new SemicolonContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(14);
				match(Semicolon);
				}
				break;
			case Integer:
				_localctx = new IntegerContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(15);
				match(Integer);
				}
				break;
			case Uppercase:
				_localctx = new UppercaseCharContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(16);
				match(Uppercase);
				}
				break;
			case Lowercase:
				_localctx = new LowercaseCharContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(17);
				match(Lowercase);
				}
				break;
			case Digit:
				_localctx = new DigitCharContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(18);
				match(Digit);
				}
				break;
			case Whitespace:
				_localctx = new WhitespaceCharContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(19);
				match(Whitespace);
				}
				break;
			case Punctuation:
				_localctx = new PunctuationCharContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(20);
				match(Punctuation);
				}
				break;
			case Extended:
				_localctx = new ExtendedCharContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(21);
				match(Extended);
				}
				break;
			case Others:
				_localctx = new OtherCharContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(22);
				match(Others);
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

	public static final String _serializedATN =
		"\u0004\u0001\f\u001a\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0001"+
		"\u0000\u0004\u0000\u0006\b\u0000\u000b\u0000\f\u0000\u0007\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001\u0018\b\u0001\u0001\u0001\u0000\u0000\u0002\u0000"+
		"\u0002\u0000\u0000#\u0000\u0005\u0001\u0000\u0000\u0000\u0002\u0017\u0001"+
		"\u0000\u0000\u0000\u0004\u0006\u0003\u0002\u0001\u0000\u0005\u0004\u0001"+
		"\u0000\u0000\u0000\u0006\u0007\u0001\u0000\u0000\u0000\u0007\u0005\u0001"+
		"\u0000\u0000\u0000\u0007\b\u0001\u0000\u0000\u0000\b\t\u0001\u0000\u0000"+
		"\u0000\t\n\u0005\u0000\u0000\u0001\n\u0001\u0001\u0000\u0000\u0000\u000b"+
		"\u0018\u0005\u0002\u0000\u0000\f\u0018\u0005\u0004\u0000\u0000\r\u0018"+
		"\u0005\u0001\u0000\u0000\u000e\u0018\u0005\u000b\u0000\u0000\u000f\u0018"+
		"\u0005\u0003\u0000\u0000\u0010\u0018\u0005\u0005\u0000\u0000\u0011\u0018"+
		"\u0005\u0006\u0000\u0000\u0012\u0018\u0005\u0007\u0000\u0000\u0013\u0018"+
		"\u0005\b\u0000\u0000\u0014\u0018\u0005\t\u0000\u0000\u0015\u0018\u0005"+
		"\n\u0000\u0000\u0016\u0018\u0005\f\u0000\u0000\u0017\u000b\u0001\u0000"+
		"\u0000\u0000\u0017\f\u0001\u0000\u0000\u0000\u0017\r\u0001\u0000\u0000"+
		"\u0000\u0017\u000e\u0001\u0000\u0000\u0000\u0017\u000f\u0001\u0000\u0000"+
		"\u0000\u0017\u0010\u0001\u0000\u0000\u0000\u0017\u0011\u0001\u0000\u0000"+
		"\u0000\u0017\u0012\u0001\u0000\u0000\u0000\u0017\u0013\u0001\u0000\u0000"+
		"\u0000\u0017\u0014\u0001\u0000\u0000\u0000\u0017\u0015\u0001\u0000\u0000"+
		"\u0000\u0017\u0016\u0001\u0000\u0000\u0000\u0018\u0003\u0001\u0000\u0000"+
		"\u0000\u0002\u0007\u0017";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}