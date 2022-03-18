// Generated from com/intuit/karate/core/KarateLexer.g4 by ANTLR 4.9.2
package com.intuit.karate.core;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class KarateLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FEATURE_COMMENT=1, FEATURE_TAGS=2, FEATURE=3, BACKGROUND=4, SCENARIO=5, 
		SCENARIO_OUTLINE=6, EXAMPLES=7, STAR=8, GIVEN=9, WHEN=10, THEN=11, AND=12, 
		BUT=13, COMMENT=14, TAGS=15, TABLE_ROW=16, DOC_STRING=17, CHAR=18, NEWLINE=19;
	public static final int
		MAIN=1;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "MAIN"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"FEATURE_COMMENT", "FEATURE_TAGS", "FEATURE", "WSLF", "BOL", "WS", "BACKGROUND", 
			"SCENARIO", "SCENARIO_OUTLINE", "EXAMPLES", "STAR", "GIVEN", "WHEN", 
			"THEN", "AND", "BUT", "COMMENT", "TAGS", "TABLE_ROW", "DOC_STRING", "CHAR", 
			"NEWLINE"
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


	public KarateLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "KarateLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\25\u0172\b\1\b\1"+
		"\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t"+
		"\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4"+
		"\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\7\2\62"+
		"\n\2\f\2\16\2\65\13\2\3\2\3\2\7\29\n\2\f\2\16\2<\13\2\3\2\6\2?\n\2\r\2"+
		"\16\2@\3\2\3\2\3\3\7\3F\n\3\f\3\16\3I\13\3\3\3\3\3\6\3M\n\3\r\3\16\3N"+
		"\3\3\6\3R\n\3\r\3\16\3S\3\4\7\4W\n\4\f\4\16\4Z\13\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\7\4f\n\4\f\4\16\4i\13\4\3\4\3\4\3\5\3\5\3\6\6\6"+
		"p\n\6\r\6\16\6q\3\6\7\6u\n\6\f\6\16\6x\13\6\3\7\3\7\3\b\6\b}\n\b\r\b\16"+
		"\b~\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u008e\n\b"+
		"\f\b\16\b\u0091\13\b\3\t\6\t\u0094\n\t\r\t\16\t\u0095\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00a3\n\t\f\t\16\t\u00a6\13\t\3\n\6\n"+
		"\u00a9\n\n\r\n\16\n\u00aa\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00c0\n\n\f\n\16\n\u00c3\13\n\3\13"+
		"\6\13\u00c6\n\13\r\13\16\13\u00c7\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\7\13\u00d5\n\13\f\13\16\13\u00d8\13\13\3\f\6\f\u00db"+
		"\n\f\r\f\16\f\u00dc\3\f\3\f\6\f\u00e1\n\f\r\f\16\f\u00e2\3\r\6\r\u00e6"+
		"\n\r\r\r\16\r\u00e7\3\r\3\r\3\r\3\r\3\r\3\r\3\r\6\r\u00f1\n\r\r\r\16\r"+
		"\u00f2\3\16\6\16\u00f6\n\16\r\16\16\16\u00f7\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\6\16\u0100\n\16\r\16\16\16\u0101\3\17\6\17\u0105\n\17\r\17\16\17"+
		"\u0106\3\17\3\17\3\17\3\17\3\17\3\17\6\17\u010f\n\17\r\17\16\17\u0110"+
		"\3\20\6\20\u0114\n\20\r\20\16\20\u0115\3\20\3\20\3\20\3\20\3\20\6\20\u011d"+
		"\n\20\r\20\16\20\u011e\3\21\6\21\u0122\n\21\r\21\16\21\u0123\3\21\3\21"+
		"\3\21\3\21\3\21\6\21\u012b\n\21\r\21\16\21\u012c\3\22\6\22\u0130\n\22"+
		"\r\22\16\22\u0131\3\22\3\22\7\22\u0136\n\22\f\22\16\22\u0139\13\22\3\22"+
		"\3\22\3\23\6\23\u013e\n\23\r\23\16\23\u013f\3\23\3\23\6\23\u0144\n\23"+
		"\r\23\16\23\u0145\3\24\6\24\u0149\n\24\r\24\16\24\u014a\3\24\3\24\6\24"+
		"\u014f\n\24\r\24\16\24\u0150\3\25\6\25\u0154\n\25\r\25\16\25\u0155\3\25"+
		"\3\25\3\25\3\25\3\25\7\25\u015d\n\25\f\25\16\25\u0160\13\25\3\25\3\25"+
		"\3\25\3\25\3\25\7\25\u0167\n\25\f\25\16\25\u016a\13\25\3\26\3\26\3\27"+
		"\6\27\u016f\n\27\r\27\16\27\u0170\3\u015e\2\30\4\3\6\4\b\5\n\2\f\2\16"+
		"\2\20\6\22\7\24\b\26\t\30\n\32\13\34\f\36\r \16\"\17$\20&\21(\22*\23,"+
		"\24.\25\4\2\3\5\4\2\f\f\17\17\5\2\13\f\17\17\"\"\4\2\13\13\"\"\2\u0195"+
		"\2\4\3\2\2\2\2\6\3\2\2\2\2\b\3\2\2\2\3\20\3\2\2\2\3\22\3\2\2\2\3\24\3"+
		"\2\2\2\3\26\3\2\2\2\3\30\3\2\2\2\3\32\3\2\2\2\3\34\3\2\2\2\3\36\3\2\2"+
		"\2\3 \3\2\2\2\3\"\3\2\2\2\3$\3\2\2\2\3&\3\2\2\2\3(\3\2\2\2\3*\3\2\2\2"+
		"\3,\3\2\2\2\3.\3\2\2\2\4\63\3\2\2\2\6G\3\2\2\2\bX\3\2\2\2\nl\3\2\2\2\f"+
		"o\3\2\2\2\16y\3\2\2\2\20|\3\2\2\2\22\u0093\3\2\2\2\24\u00a8\3\2\2\2\26"+
		"\u00c5\3\2\2\2\30\u00da\3\2\2\2\32\u00e5\3\2\2\2\34\u00f5\3\2\2\2\36\u0104"+
		"\3\2\2\2 \u0113\3\2\2\2\"\u0121\3\2\2\2$\u012f\3\2\2\2&\u013d\3\2\2\2"+
		"(\u0148\3\2\2\2*\u0153\3\2\2\2,\u016b\3\2\2\2.\u016e\3\2\2\2\60\62\5\n"+
		"\5\2\61\60\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\66\3\2"+
		"\2\2\65\63\3\2\2\2\66:\7%\2\2\679\n\2\2\28\67\3\2\2\29<\3\2\2\2:8\3\2"+
		"\2\2:;\3\2\2\2;>\3\2\2\2<:\3\2\2\2=?\5\f\6\2>=\3\2\2\2?@\3\2\2\2@>\3\2"+
		"\2\2@A\3\2\2\2AB\3\2\2\2BC\b\2\2\2C\5\3\2\2\2DF\5\n\5\2ED\3\2\2\2FI\3"+
		"\2\2\2GE\3\2\2\2GH\3\2\2\2HJ\3\2\2\2IG\3\2\2\2JL\7B\2\2KM\n\2\2\2LK\3"+
		"\2\2\2MN\3\2\2\2NL\3\2\2\2NO\3\2\2\2OQ\3\2\2\2PR\5\f\6\2QP\3\2\2\2RS\3"+
		"\2\2\2SQ\3\2\2\2ST\3\2\2\2T\7\3\2\2\2UW\5\n\5\2VU\3\2\2\2WZ\3\2\2\2XV"+
		"\3\2\2\2XY\3\2\2\2Y[\3\2\2\2ZX\3\2\2\2[\\\7H\2\2\\]\7g\2\2]^\7c\2\2^_"+
		"\7v\2\2_`\7w\2\2`a\7t\2\2ab\7g\2\2bc\7<\2\2cg\3\2\2\2df\5\16\7\2ed\3\2"+
		"\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2hj\3\2\2\2ig\3\2\2\2jk\b\4\3\2k\t\3"+
		"\2\2\2lm\t\3\2\2m\13\3\2\2\2np\t\2\2\2on\3\2\2\2pq\3\2\2\2qo\3\2\2\2q"+
		"r\3\2\2\2rv\3\2\2\2su\t\4\2\2ts\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2"+
		"w\r\3\2\2\2xv\3\2\2\2yz\t\4\2\2z\17\3\2\2\2{}\5\f\6\2|{\3\2\2\2}~\3\2"+
		"\2\2~|\3\2\2\2~\177\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081\7D\2\2\u0081"+
		"\u0082\7c\2\2\u0082\u0083\7e\2\2\u0083\u0084\7m\2\2\u0084\u0085\7i\2\2"+
		"\u0085\u0086\7t\2\2\u0086\u0087\7q\2\2\u0087\u0088\7w\2\2\u0088\u0089"+
		"\7p\2\2\u0089\u008a\7f\2\2\u008a\u008b\7<\2\2\u008b\u008f\3\2\2\2\u008c"+
		"\u008e\5\16\7\2\u008d\u008c\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3"+
		"\2\2\2\u008f\u0090\3\2\2\2\u0090\21\3\2\2\2\u0091\u008f\3\2\2\2\u0092"+
		"\u0094\5\f\6\2\u0093\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0093\3\2"+
		"\2\2\u0095\u0096\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098\7U\2\2\u0098"+
		"\u0099\7e\2\2\u0099\u009a\7g\2\2\u009a\u009b\7p\2\2\u009b\u009c\7c\2\2"+
		"\u009c\u009d\7t\2\2\u009d\u009e\7k\2\2\u009e\u009f\7q\2\2\u009f\u00a0"+
		"\7<\2\2\u00a0\u00a4\3\2\2\2\u00a1\u00a3\5\16\7\2\u00a2\u00a1\3\2\2\2\u00a3"+
		"\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\23\3\2\2"+
		"\2\u00a6\u00a4\3\2\2\2\u00a7\u00a9\5\f\6\2\u00a8\u00a7\3\2\2\2\u00a9\u00aa"+
		"\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac"+
		"\u00ad\7U\2\2\u00ad\u00ae\7e\2\2\u00ae\u00af\7g\2\2\u00af\u00b0\7p\2\2"+
		"\u00b0\u00b1\7c\2\2\u00b1\u00b2\7t\2\2\u00b2\u00b3\7k\2\2\u00b3\u00b4"+
		"\7q\2\2\u00b4\u00b5\7\"\2\2\u00b5\u00b6\7Q\2\2\u00b6\u00b7\7w\2\2\u00b7"+
		"\u00b8\7v\2\2\u00b8\u00b9\7n\2\2\u00b9\u00ba\7k\2\2\u00ba\u00bb\7p\2\2"+
		"\u00bb\u00bc\7g\2\2\u00bc\u00bd\7<\2\2\u00bd\u00c1\3\2\2\2\u00be\u00c0"+
		"\5\16\7\2\u00bf\u00be\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2"+
		"\u00c1\u00c2\3\2\2\2\u00c2\25\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c6"+
		"\5\f\6\2\u00c5\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7"+
		"\u00c8\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\7G\2\2\u00ca\u00cb\7z\2"+
		"\2\u00cb\u00cc\7c\2\2\u00cc\u00cd\7o\2\2\u00cd\u00ce\7r\2\2\u00ce\u00cf"+
		"\7n\2\2\u00cf\u00d0\7g\2\2\u00d0\u00d1\7u\2\2\u00d1\u00d2\7<\2\2\u00d2"+
		"\u00d6\3\2\2\2\u00d3\u00d5\5\16\7\2\u00d4\u00d3\3\2\2\2\u00d5\u00d8\3"+
		"\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\27\3\2\2\2\u00d8"+
		"\u00d6\3\2\2\2\u00d9\u00db\5\f\6\2\u00da\u00d9\3\2\2\2\u00db\u00dc\3\2"+
		"\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00de\3\2\2\2\u00de"+
		"\u00e0\7,\2\2\u00df\u00e1\5\16\7\2\u00e0\u00df\3\2\2\2\u00e1\u00e2\3\2"+
		"\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\31\3\2\2\2\u00e4\u00e6"+
		"\5\f\6\2\u00e5\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7"+
		"\u00e8\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea\7I\2\2\u00ea\u00eb\7k\2"+
		"\2\u00eb\u00ec\7x\2\2\u00ec\u00ed\7g\2\2\u00ed\u00ee\7p\2\2\u00ee\u00f0"+
		"\3\2\2\2\u00ef\u00f1\5\16\7\2\u00f0\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2"+
		"\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\33\3\2\2\2\u00f4\u00f6"+
		"\5\f\6\2\u00f5\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7"+
		"\u00f8\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fa\7Y\2\2\u00fa\u00fb\7j\2"+
		"\2\u00fb\u00fc\7g\2\2\u00fc\u00fd\7p\2\2\u00fd\u00ff\3\2\2\2\u00fe\u0100"+
		"\5\16\7\2\u00ff\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u00ff\3\2\2\2"+
		"\u0101\u0102\3\2\2\2\u0102\35\3\2\2\2\u0103\u0105\5\f\6\2\u0104\u0103"+
		"\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107"+
		"\u0108\3\2\2\2\u0108\u0109\7V\2\2\u0109\u010a\7j\2\2\u010a\u010b\7g\2"+
		"\2\u010b\u010c\7p\2\2\u010c\u010e\3\2\2\2\u010d\u010f\5\16\7\2\u010e\u010d"+
		"\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111"+
		"\37\3\2\2\2\u0112\u0114\5\f\6\2\u0113\u0112\3\2\2\2\u0114\u0115\3\2\2"+
		"\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0118"+
		"\7C\2\2\u0118\u0119\7p\2\2\u0119\u011a\7f\2\2\u011a\u011c\3\2\2\2\u011b"+
		"\u011d\5\16\7\2\u011c\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u011c\3"+
		"\2\2\2\u011e\u011f\3\2\2\2\u011f!\3\2\2\2\u0120\u0122\5\f\6\2\u0121\u0120"+
		"\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124"+
		"\u0125\3\2\2\2\u0125\u0126\7D\2\2\u0126\u0127\7w\2\2\u0127\u0128\7v\2"+
		"\2\u0128\u012a\3\2\2\2\u0129\u012b\5\16\7\2\u012a\u0129\3\2\2\2\u012b"+
		"\u012c\3\2\2\2\u012c\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d#\3\2\2\2"+
		"\u012e\u0130\5\f\6\2\u012f\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u012f"+
		"\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0137\7%\2\2\u0134"+
		"\u0136\n\2\2\2\u0135\u0134\3\2\2\2\u0136\u0139\3\2\2\2\u0137\u0135\3\2"+
		"\2\2\u0137\u0138\3\2\2\2\u0138\u013a\3\2\2\2\u0139\u0137\3\2\2\2\u013a"+
		"\u013b\b\22\2\2\u013b%\3\2\2\2\u013c\u013e\5\f\6\2\u013d\u013c\3\2\2\2"+
		"\u013e\u013f\3\2\2\2\u013f\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0141"+
		"\3\2\2\2\u0141\u0143\7B\2\2\u0142\u0144\n\2\2\2\u0143\u0142\3\2\2\2\u0144"+
		"\u0145\3\2\2\2\u0145\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146\'\3\2\2\2"+
		"\u0147\u0149\5\f\6\2\u0148\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u0148"+
		"\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014e\7~\2\2\u014d"+
		"\u014f\n\2\2\2\u014e\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u014e\3\2"+
		"\2\2\u0150\u0151\3\2\2\2\u0151)\3\2\2\2\u0152\u0154\5\f\6\2\u0153\u0152"+
		"\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156"+
		"\u0157\3\2\2\2\u0157\u0158\7$\2\2\u0158\u0159\7$\2\2\u0159\u015a\7$\2"+
		"\2\u015a\u015e\3\2\2\2\u015b\u015d\13\2\2\2\u015c\u015b\3\2\2\2\u015d"+
		"\u0160\3\2\2\2\u015e\u015f\3\2\2\2\u015e\u015c\3\2\2\2\u015f\u0161\3\2"+
		"\2\2\u0160\u015e\3\2\2\2\u0161\u0162\7$\2\2\u0162\u0163\7$\2\2\u0163\u0164"+
		"\7$\2\2\u0164\u0168\3\2\2\2\u0165\u0167\n\2\2\2\u0166\u0165\3\2\2\2\u0167"+
		"\u016a\3\2\2\2\u0168\u0166\3\2\2\2\u0168\u0169\3\2\2\2\u0169+\3\2\2\2"+
		"\u016a\u0168\3\2\2\2\u016b\u016c\n\2\2\2\u016c-\3\2\2\2\u016d\u016f\5"+
		"\f\6\2\u016e\u016d\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u016e\3\2\2\2\u0170"+
		"\u0171\3\2\2\2\u0171/\3\2\2\2,\2\3\63:@GNSXgqv~\u008f\u0095\u00a4\u00aa"+
		"\u00c1\u00c7\u00d6\u00dc\u00e2\u00e7\u00f2\u00f7\u0101\u0106\u0110\u0115"+
		"\u011e\u0123\u012c\u0131\u0137\u013f\u0145\u014a\u0150\u0155\u015e\u0168"+
		"\u0170\4\2\3\2\7\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}