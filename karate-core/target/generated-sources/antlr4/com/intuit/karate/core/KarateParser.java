// Generated from com/intuit/karate/core/KarateParser.g4 by ANTLR 4.9.2
package com.intuit.karate.core;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class KarateParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FEATURE_COMMENT=1, FEATURE_TAGS=2, FEATURE=3, BACKGROUND=4, SCENARIO=5, 
		SCENARIO_OUTLINE=6, EXAMPLES=7, STAR=8, GIVEN=9, WHEN=10, THEN=11, AND=12, 
		BUT=13, COMMENT=14, TAGS=15, TABLE_ROW=16, DOC_STRING=17, CHAR=18, NEWLINE=19;
	public static final int
		RULE_feature = 0, RULE_featureHeader = 1, RULE_featureTags = 2, RULE_featureDescription = 3, 
		RULE_background = 4, RULE_scenario = 5, RULE_scenarioDescription = 6, 
		RULE_scenarioOutline = 7, RULE_examples = 8, RULE_exampleDescription = 9, 
		RULE_step = 10, RULE_prefix = 11, RULE_line = 12, RULE_tags = 13, RULE_docString = 14, 
		RULE_table = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"feature", "featureHeader", "featureTags", "featureDescription", "background", 
			"scenario", "scenarioDescription", "scenarioOutline", "examples", "exampleDescription", 
			"step", "prefix", "line", "tags", "docString", "table"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "FEATURE_COMMENT", "FEATURE_TAGS", "FEATURE", "BACKGROUND", "SCENARIO", 
			"SCENARIO_OUTLINE", "EXAMPLES", "STAR", "GIVEN", "WHEN", "THEN", "AND", 
			"BUT", "COMMENT", "TAGS", "TABLE_ROW", "DOC_STRING", "CHAR", "NEWLINE"
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
	public String getGrammarFileName() { return "KarateParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public KarateParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class FeatureContext extends ParserRuleContext {
		public FeatureHeaderContext featureHeader() {
			return getRuleContext(FeatureHeaderContext.class,0);
		}
		public TerminalNode EOF() { return getToken(KarateParser.EOF, 0); }
		public BackgroundContext background() {
			return getRuleContext(BackgroundContext.class,0);
		}
		public List<ScenarioContext> scenario() {
			return getRuleContexts(ScenarioContext.class);
		}
		public ScenarioContext scenario(int i) {
			return getRuleContext(ScenarioContext.class,i);
		}
		public List<ScenarioOutlineContext> scenarioOutline() {
			return getRuleContexts(ScenarioOutlineContext.class);
		}
		public ScenarioOutlineContext scenarioOutline(int i) {
			return getRuleContext(ScenarioOutlineContext.class,i);
		}
		public TerminalNode NEWLINE() { return getToken(KarateParser.NEWLINE, 0); }
		public FeatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_feature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KarateParserListener ) ((KarateParserListener)listener).enterFeature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KarateParserListener ) ((KarateParserListener)listener).exitFeature(this);
		}
	}

	public final FeatureContext feature() throws RecognitionException {
		FeatureContext _localctx = new FeatureContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_feature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			featureHeader();
			setState(34);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BACKGROUND) {
				{
				setState(33);
				background();
				}
			}

			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SCENARIO) | (1L << SCENARIO_OUTLINE) | (1L << TAGS))) != 0)) {
				{
				setState(38);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(36);
					scenario();
					}
					break;
				case 2:
					{
					setState(37);
					scenarioOutline();
					}
					break;
				}
				}
				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(43);
				match(NEWLINE);
				}
			}

			setState(46);
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

	public static class FeatureHeaderContext extends ParserRuleContext {
		public TerminalNode FEATURE() { return getToken(KarateParser.FEATURE, 0); }
		public FeatureDescriptionContext featureDescription() {
			return getRuleContext(FeatureDescriptionContext.class,0);
		}
		public FeatureTagsContext featureTags() {
			return getRuleContext(FeatureTagsContext.class,0);
		}
		public FeatureHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_featureHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KarateParserListener ) ((KarateParserListener)listener).enterFeatureHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KarateParserListener ) ((KarateParserListener)listener).exitFeatureHeader(this);
		}
	}

	public final FeatureHeaderContext featureHeader() throws RecognitionException {
		FeatureHeaderContext _localctx = new FeatureHeaderContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_featureHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FEATURE_TAGS) {
				{
				setState(48);
				featureTags();
				}
			}

			setState(51);
			match(FEATURE);
			setState(52);
			featureDescription();
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

	public static class FeatureTagsContext extends ParserRuleContext {
		public List<TerminalNode> FEATURE_TAGS() { return getTokens(KarateParser.FEATURE_TAGS); }
		public TerminalNode FEATURE_TAGS(int i) {
			return getToken(KarateParser.FEATURE_TAGS, i);
		}
		public FeatureTagsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_featureTags; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KarateParserListener ) ((KarateParserListener)listener).enterFeatureTags(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KarateParserListener ) ((KarateParserListener)listener).exitFeatureTags(this);
		}
	}

	public final FeatureTagsContext featureTags() throws RecognitionException {
		FeatureTagsContext _localctx = new FeatureTagsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_featureTags);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(54);
				match(FEATURE_TAGS);
				}
				}
				setState(57); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==FEATURE_TAGS );
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

	public static class FeatureDescriptionContext extends ParserRuleContext {
		public List<TerminalNode> BACKGROUND() { return getTokens(KarateParser.BACKGROUND); }
		public TerminalNode BACKGROUND(int i) {
			return getToken(KarateParser.BACKGROUND, i);
		}
		public List<TerminalNode> SCENARIO() { return getTokens(KarateParser.SCENARIO); }
		public TerminalNode SCENARIO(int i) {
			return getToken(KarateParser.SCENARIO, i);
		}
		public List<TerminalNode> SCENARIO_OUTLINE() { return getTokens(KarateParser.SCENARIO_OUTLINE); }
		public TerminalNode SCENARIO_OUTLINE(int i) {
			return getToken(KarateParser.SCENARIO_OUTLINE, i);
		}
		public List<TerminalNode> TAGS() { return getTokens(KarateParser.TAGS); }
		public TerminalNode TAGS(int i) {
			return getToken(KarateParser.TAGS, i);
		}
		public FeatureDescriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_featureDescription; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KarateParserListener ) ((KarateParserListener)listener).enterFeatureDescription(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KarateParserListener ) ((KarateParserListener)listener).exitFeatureDescription(this);
		}
	}

	public final FeatureDescriptionContext featureDescription() throws RecognitionException {
		FeatureDescriptionContext _localctx = new FeatureDescriptionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_featureDescription);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(59);
					_la = _input.LA(1);
					if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BACKGROUND) | (1L << SCENARIO) | (1L << SCENARIO_OUTLINE) | (1L << TAGS))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(64);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public static class BackgroundContext extends ParserRuleContext {
		public TerminalNode BACKGROUND() { return getToken(KarateParser.BACKGROUND, 0); }
		public ScenarioDescriptionContext scenarioDescription() {
			return getRuleContext(ScenarioDescriptionContext.class,0);
		}
		public List<StepContext> step() {
			return getRuleContexts(StepContext.class);
		}
		public StepContext step(int i) {
			return getRuleContext(StepContext.class,i);
		}
		public BackgroundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_background; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KarateParserListener ) ((KarateParserListener)listener).enterBackground(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KarateParserListener ) ((KarateParserListener)listener).exitBackground(this);
		}
	}

	public final BackgroundContext background() throws RecognitionException {
		BackgroundContext _localctx = new BackgroundContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_background);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(BACKGROUND);
			setState(66);
			scenarioDescription();
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << GIVEN) | (1L << WHEN) | (1L << THEN) | (1L << AND) | (1L << BUT))) != 0)) {
				{
				{
				setState(67);
				step();
				}
				}
				setState(72);
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

	public static class ScenarioContext extends ParserRuleContext {
		public TerminalNode SCENARIO() { return getToken(KarateParser.SCENARIO, 0); }
		public ScenarioDescriptionContext scenarioDescription() {
			return getRuleContext(ScenarioDescriptionContext.class,0);
		}
		public TagsContext tags() {
			return getRuleContext(TagsContext.class,0);
		}
		public List<StepContext> step() {
			return getRuleContexts(StepContext.class);
		}
		public StepContext step(int i) {
			return getRuleContext(StepContext.class,i);
		}
		public ScenarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scenario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KarateParserListener ) ((KarateParserListener)listener).enterScenario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KarateParserListener ) ((KarateParserListener)listener).exitScenario(this);
		}
	}

	public final ScenarioContext scenario() throws RecognitionException {
		ScenarioContext _localctx = new ScenarioContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_scenario);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TAGS) {
				{
				setState(73);
				tags();
				}
			}

			setState(76);
			match(SCENARIO);
			setState(77);
			scenarioDescription();
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << GIVEN) | (1L << WHEN) | (1L << THEN) | (1L << AND) | (1L << BUT))) != 0)) {
				{
				{
				setState(78);
				step();
				}
				}
				setState(83);
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

	public static class ScenarioDescriptionContext extends ParserRuleContext {
		public List<TerminalNode> STAR() { return getTokens(KarateParser.STAR); }
		public TerminalNode STAR(int i) {
			return getToken(KarateParser.STAR, i);
		}
		public List<TerminalNode> GIVEN() { return getTokens(KarateParser.GIVEN); }
		public TerminalNode GIVEN(int i) {
			return getToken(KarateParser.GIVEN, i);
		}
		public List<TerminalNode> WHEN() { return getTokens(KarateParser.WHEN); }
		public TerminalNode WHEN(int i) {
			return getToken(KarateParser.WHEN, i);
		}
		public List<TerminalNode> THEN() { return getTokens(KarateParser.THEN); }
		public TerminalNode THEN(int i) {
			return getToken(KarateParser.THEN, i);
		}
		public List<TerminalNode> AND() { return getTokens(KarateParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(KarateParser.AND, i);
		}
		public List<TerminalNode> BUT() { return getTokens(KarateParser.BUT); }
		public TerminalNode BUT(int i) {
			return getToken(KarateParser.BUT, i);
		}
		public List<TerminalNode> SCENARIO() { return getTokens(KarateParser.SCENARIO); }
		public TerminalNode SCENARIO(int i) {
			return getToken(KarateParser.SCENARIO, i);
		}
		public List<TerminalNode> SCENARIO_OUTLINE() { return getTokens(KarateParser.SCENARIO_OUTLINE); }
		public TerminalNode SCENARIO_OUTLINE(int i) {
			return getToken(KarateParser.SCENARIO_OUTLINE, i);
		}
		public List<TerminalNode> TAGS() { return getTokens(KarateParser.TAGS); }
		public TerminalNode TAGS(int i) {
			return getToken(KarateParser.TAGS, i);
		}
		public ScenarioDescriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scenarioDescription; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KarateParserListener ) ((KarateParserListener)listener).enterScenarioDescription(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KarateParserListener ) ((KarateParserListener)listener).exitScenarioDescription(this);
		}
	}

	public final ScenarioDescriptionContext scenarioDescription() throws RecognitionException {
		ScenarioDescriptionContext _localctx = new ScenarioDescriptionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_scenarioDescription);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(84);
					_la = _input.LA(1);
					if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SCENARIO) | (1L << SCENARIO_OUTLINE) | (1L << STAR) | (1L << GIVEN) | (1L << WHEN) | (1L << THEN) | (1L << AND) | (1L << BUT) | (1L << TAGS))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(89);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public static class ScenarioOutlineContext extends ParserRuleContext {
		public TerminalNode SCENARIO_OUTLINE() { return getToken(KarateParser.SCENARIO_OUTLINE, 0); }
		public ScenarioDescriptionContext scenarioDescription() {
			return getRuleContext(ScenarioDescriptionContext.class,0);
		}
		public TagsContext tags() {
			return getRuleContext(TagsContext.class,0);
		}
		public List<StepContext> step() {
			return getRuleContexts(StepContext.class);
		}
		public StepContext step(int i) {
			return getRuleContext(StepContext.class,i);
		}
		public List<ExamplesContext> examples() {
			return getRuleContexts(ExamplesContext.class);
		}
		public ExamplesContext examples(int i) {
			return getRuleContext(ExamplesContext.class,i);
		}
		public ScenarioOutlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scenarioOutline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KarateParserListener ) ((KarateParserListener)listener).enterScenarioOutline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KarateParserListener ) ((KarateParserListener)listener).exitScenarioOutline(this);
		}
	}

	public final ScenarioOutlineContext scenarioOutline() throws RecognitionException {
		ScenarioOutlineContext _localctx = new ScenarioOutlineContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_scenarioOutline);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TAGS) {
				{
				setState(90);
				tags();
				}
			}

			setState(93);
			match(SCENARIO_OUTLINE);
			setState(94);
			scenarioDescription();
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << GIVEN) | (1L << WHEN) | (1L << THEN) | (1L << AND) | (1L << BUT))) != 0)) {
				{
				{
				setState(95);
				step();
				}
				}
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(102); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(101);
					examples();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(104); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	public static class ExamplesContext extends ParserRuleContext {
		public TerminalNode EXAMPLES() { return getToken(KarateParser.EXAMPLES, 0); }
		public ExampleDescriptionContext exampleDescription() {
			return getRuleContext(ExampleDescriptionContext.class,0);
		}
		public TableContext table() {
			return getRuleContext(TableContext.class,0);
		}
		public TagsContext tags() {
			return getRuleContext(TagsContext.class,0);
		}
		public ExamplesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_examples; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KarateParserListener ) ((KarateParserListener)listener).enterExamples(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KarateParserListener ) ((KarateParserListener)listener).exitExamples(this);
		}
	}

	public final ExamplesContext examples() throws RecognitionException {
		ExamplesContext _localctx = new ExamplesContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_examples);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TAGS) {
				{
				setState(106);
				tags();
				}
			}

			setState(109);
			match(EXAMPLES);
			setState(110);
			exampleDescription();
			setState(111);
			table();
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

	public static class ExampleDescriptionContext extends ParserRuleContext {
		public List<TerminalNode> TABLE_ROW() { return getTokens(KarateParser.TABLE_ROW); }
		public TerminalNode TABLE_ROW(int i) {
			return getToken(KarateParser.TABLE_ROW, i);
		}
		public ExampleDescriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exampleDescription; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KarateParserListener ) ((KarateParserListener)listener).enterExampleDescription(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KarateParserListener ) ((KarateParserListener)listener).exitExampleDescription(this);
		}
	}

	public final ExampleDescriptionContext exampleDescription() throws RecognitionException {
		ExampleDescriptionContext _localctx = new ExampleDescriptionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_exampleDescription);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FEATURE_COMMENT) | (1L << FEATURE_TAGS) | (1L << FEATURE) | (1L << BACKGROUND) | (1L << SCENARIO) | (1L << SCENARIO_OUTLINE) | (1L << EXAMPLES) | (1L << STAR) | (1L << GIVEN) | (1L << WHEN) | (1L << THEN) | (1L << AND) | (1L << BUT) | (1L << COMMENT) | (1L << TAGS) | (1L << DOC_STRING) | (1L << CHAR) | (1L << NEWLINE))) != 0)) {
				{
				{
				setState(113);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==TABLE_ROW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(118);
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

	public static class StepContext extends ParserRuleContext {
		public PrefixContext prefix() {
			return getRuleContext(PrefixContext.class,0);
		}
		public LineContext line() {
			return getRuleContext(LineContext.class,0);
		}
		public DocStringContext docString() {
			return getRuleContext(DocStringContext.class,0);
		}
		public TableContext table() {
			return getRuleContext(TableContext.class,0);
		}
		public StepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_step; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KarateParserListener ) ((KarateParserListener)listener).enterStep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KarateParserListener ) ((KarateParserListener)listener).exitStep(this);
		}
	}

	public final StepContext step() throws RecognitionException {
		StepContext _localctx = new StepContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_step);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			prefix();
			setState(120);
			line();
			setState(123);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOC_STRING:
				{
				setState(121);
				docString();
				}
				break;
			case TABLE_ROW:
				{
				setState(122);
				table();
				}
				break;
			case EOF:
			case SCENARIO:
			case SCENARIO_OUTLINE:
			case EXAMPLES:
			case STAR:
			case GIVEN:
			case WHEN:
			case THEN:
			case AND:
			case BUT:
			case TAGS:
			case NEWLINE:
				break;
			default:
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

	public static class PrefixContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(KarateParser.STAR, 0); }
		public TerminalNode GIVEN() { return getToken(KarateParser.GIVEN, 0); }
		public TerminalNode WHEN() { return getToken(KarateParser.WHEN, 0); }
		public TerminalNode THEN() { return getToken(KarateParser.THEN, 0); }
		public TerminalNode AND() { return getToken(KarateParser.AND, 0); }
		public TerminalNode BUT() { return getToken(KarateParser.BUT, 0); }
		public PrefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KarateParserListener ) ((KarateParserListener)listener).enterPrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KarateParserListener ) ((KarateParserListener)listener).exitPrefix(this);
		}
	}

	public final PrefixContext prefix() throws RecognitionException {
		PrefixContext _localctx = new PrefixContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_prefix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << GIVEN) | (1L << WHEN) | (1L << THEN) | (1L << AND) | (1L << BUT))) != 0)) ) {
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

	public static class LineContext extends ParserRuleContext {
		public List<TerminalNode> CHAR() { return getTokens(KarateParser.CHAR); }
		public TerminalNode CHAR(int i) {
			return getToken(KarateParser.CHAR, i);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KarateParserListener ) ((KarateParserListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KarateParserListener ) ((KarateParserListener)listener).exitLine(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_line);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(127);
				match(CHAR);
				}
				}
				setState(130); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CHAR );
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

	public static class TagsContext extends ParserRuleContext {
		public List<TerminalNode> TAGS() { return getTokens(KarateParser.TAGS); }
		public TerminalNode TAGS(int i) {
			return getToken(KarateParser.TAGS, i);
		}
		public TagsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tags; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KarateParserListener ) ((KarateParserListener)listener).enterTags(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KarateParserListener ) ((KarateParserListener)listener).exitTags(this);
		}
	}

	public final TagsContext tags() throws RecognitionException {
		TagsContext _localctx = new TagsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_tags);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(132);
				match(TAGS);
				}
				}
				setState(135); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TAGS );
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

	public static class DocStringContext extends ParserRuleContext {
		public TerminalNode DOC_STRING() { return getToken(KarateParser.DOC_STRING, 0); }
		public DocStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_docString; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KarateParserListener ) ((KarateParserListener)listener).enterDocString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KarateParserListener ) ((KarateParserListener)listener).exitDocString(this);
		}
	}

	public final DocStringContext docString() throws RecognitionException {
		DocStringContext _localctx = new DocStringContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_docString);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(DOC_STRING);
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

	public static class TableContext extends ParserRuleContext {
		public List<TerminalNode> TABLE_ROW() { return getTokens(KarateParser.TABLE_ROW); }
		public TerminalNode TABLE_ROW(int i) {
			return getToken(KarateParser.TABLE_ROW, i);
		}
		public TableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KarateParserListener ) ((KarateParserListener)listener).enterTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KarateParserListener ) ((KarateParserListener)listener).exitTable(this);
		}
	}

	public final TableContext table() throws RecognitionException {
		TableContext _localctx = new TableContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_table);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(139);
				match(TABLE_ROW);
				}
				}
				setState(142); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TABLE_ROW );
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\25\u0093\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2"+
		"\5\2%\n\2\3\2\3\2\7\2)\n\2\f\2\16\2,\13\2\3\2\5\2/\n\2\3\2\3\2\3\3\5\3"+
		"\64\n\3\3\3\3\3\3\3\3\4\6\4:\n\4\r\4\16\4;\3\5\7\5?\n\5\f\5\16\5B\13\5"+
		"\3\6\3\6\3\6\7\6G\n\6\f\6\16\6J\13\6\3\7\5\7M\n\7\3\7\3\7\3\7\7\7R\n\7"+
		"\f\7\16\7U\13\7\3\b\7\bX\n\b\f\b\16\b[\13\b\3\t\5\t^\n\t\3\t\3\t\3\t\7"+
		"\tc\n\t\f\t\16\tf\13\t\3\t\6\ti\n\t\r\t\16\tj\3\n\5\nn\n\n\3\n\3\n\3\n"+
		"\3\n\3\13\7\13u\n\13\f\13\16\13x\13\13\3\f\3\f\3\f\3\f\5\f~\n\f\3\r\3"+
		"\r\3\16\6\16\u0083\n\16\r\16\16\16\u0084\3\17\6\17\u0088\n\17\r\17\16"+
		"\17\u0089\3\20\3\20\3\21\6\21\u008f\n\21\r\21\16\21\u0090\3\21\2\2\22"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\6\4\2\6\b\21\21\5\2\7\b\n\17"+
		"\21\21\3\2\22\22\3\2\n\17\2\u0097\2\"\3\2\2\2\4\63\3\2\2\2\69\3\2\2\2"+
		"\b@\3\2\2\2\nC\3\2\2\2\fL\3\2\2\2\16Y\3\2\2\2\20]\3\2\2\2\22m\3\2\2\2"+
		"\24v\3\2\2\2\26y\3\2\2\2\30\177\3\2\2\2\32\u0082\3\2\2\2\34\u0087\3\2"+
		"\2\2\36\u008b\3\2\2\2 \u008e\3\2\2\2\"$\5\4\3\2#%\5\n\6\2$#\3\2\2\2$%"+
		"\3\2\2\2%*\3\2\2\2&)\5\f\7\2\')\5\20\t\2(&\3\2\2\2(\'\3\2\2\2),\3\2\2"+
		"\2*(\3\2\2\2*+\3\2\2\2+.\3\2\2\2,*\3\2\2\2-/\7\25\2\2.-\3\2\2\2./\3\2"+
		"\2\2/\60\3\2\2\2\60\61\7\2\2\3\61\3\3\2\2\2\62\64\5\6\4\2\63\62\3\2\2"+
		"\2\63\64\3\2\2\2\64\65\3\2\2\2\65\66\7\5\2\2\66\67\5\b\5\2\67\5\3\2\2"+
		"\28:\7\4\2\298\3\2\2\2:;\3\2\2\2;9\3\2\2\2;<\3\2\2\2<\7\3\2\2\2=?\n\2"+
		"\2\2>=\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2A\t\3\2\2\2B@\3\2\2\2CD\7"+
		"\6\2\2DH\5\16\b\2EG\5\26\f\2FE\3\2\2\2GJ\3\2\2\2HF\3\2\2\2HI\3\2\2\2I"+
		"\13\3\2\2\2JH\3\2\2\2KM\5\34\17\2LK\3\2\2\2LM\3\2\2\2MN\3\2\2\2NO\7\7"+
		"\2\2OS\5\16\b\2PR\5\26\f\2QP\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2T\r"+
		"\3\2\2\2US\3\2\2\2VX\n\3\2\2WV\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z"+
		"\17\3\2\2\2[Y\3\2\2\2\\^\5\34\17\2]\\\3\2\2\2]^\3\2\2\2^_\3\2\2\2_`\7"+
		"\b\2\2`d\5\16\b\2ac\5\26\f\2ba\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2e"+
		"h\3\2\2\2fd\3\2\2\2gi\5\22\n\2hg\3\2\2\2ij\3\2\2\2jh\3\2\2\2jk\3\2\2\2"+
		"k\21\3\2\2\2ln\5\34\17\2ml\3\2\2\2mn\3\2\2\2no\3\2\2\2op\7\t\2\2pq\5\24"+
		"\13\2qr\5 \21\2r\23\3\2\2\2su\n\4\2\2ts\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw"+
		"\3\2\2\2w\25\3\2\2\2xv\3\2\2\2yz\5\30\r\2z}\5\32\16\2{~\5\36\20\2|~\5"+
		" \21\2}{\3\2\2\2}|\3\2\2\2}~\3\2\2\2~\27\3\2\2\2\177\u0080\t\5\2\2\u0080"+
		"\31\3\2\2\2\u0081\u0083\7\24\2\2\u0082\u0081\3\2\2\2\u0083\u0084\3\2\2"+
		"\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\33\3\2\2\2\u0086\u0088"+
		"\7\21\2\2\u0087\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u0087\3\2\2\2"+
		"\u0089\u008a\3\2\2\2\u008a\35\3\2\2\2\u008b\u008c\7\23\2\2\u008c\37\3"+
		"\2\2\2\u008d\u008f\7\22\2\2\u008e\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090"+
		"\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091!\3\2\2\2\26$(*.\63;@HLSY]djm"+
		"v}\u0084\u0089\u0090";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}