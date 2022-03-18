// Generated from com/intuit/karate/core/KarateParser.g4 by ANTLR 4.9.2
package com.intuit.karate.core;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link KarateParser}.
 */
public interface KarateParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link KarateParser#feature}.
	 * @param ctx the parse tree
	 */
	void enterFeature(KarateParser.FeatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link KarateParser#feature}.
	 * @param ctx the parse tree
	 */
	void exitFeature(KarateParser.FeatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link KarateParser#featureHeader}.
	 * @param ctx the parse tree
	 */
	void enterFeatureHeader(KarateParser.FeatureHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link KarateParser#featureHeader}.
	 * @param ctx the parse tree
	 */
	void exitFeatureHeader(KarateParser.FeatureHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link KarateParser#featureTags}.
	 * @param ctx the parse tree
	 */
	void enterFeatureTags(KarateParser.FeatureTagsContext ctx);
	/**
	 * Exit a parse tree produced by {@link KarateParser#featureTags}.
	 * @param ctx the parse tree
	 */
	void exitFeatureTags(KarateParser.FeatureTagsContext ctx);
	/**
	 * Enter a parse tree produced by {@link KarateParser#featureDescription}.
	 * @param ctx the parse tree
	 */
	void enterFeatureDescription(KarateParser.FeatureDescriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KarateParser#featureDescription}.
	 * @param ctx the parse tree
	 */
	void exitFeatureDescription(KarateParser.FeatureDescriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KarateParser#background}.
	 * @param ctx the parse tree
	 */
	void enterBackground(KarateParser.BackgroundContext ctx);
	/**
	 * Exit a parse tree produced by {@link KarateParser#background}.
	 * @param ctx the parse tree
	 */
	void exitBackground(KarateParser.BackgroundContext ctx);
	/**
	 * Enter a parse tree produced by {@link KarateParser#scenario}.
	 * @param ctx the parse tree
	 */
	void enterScenario(KarateParser.ScenarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link KarateParser#scenario}.
	 * @param ctx the parse tree
	 */
	void exitScenario(KarateParser.ScenarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link KarateParser#scenarioDescription}.
	 * @param ctx the parse tree
	 */
	void enterScenarioDescription(KarateParser.ScenarioDescriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KarateParser#scenarioDescription}.
	 * @param ctx the parse tree
	 */
	void exitScenarioDescription(KarateParser.ScenarioDescriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KarateParser#scenarioOutline}.
	 * @param ctx the parse tree
	 */
	void enterScenarioOutline(KarateParser.ScenarioOutlineContext ctx);
	/**
	 * Exit a parse tree produced by {@link KarateParser#scenarioOutline}.
	 * @param ctx the parse tree
	 */
	void exitScenarioOutline(KarateParser.ScenarioOutlineContext ctx);
	/**
	 * Enter a parse tree produced by {@link KarateParser#examples}.
	 * @param ctx the parse tree
	 */
	void enterExamples(KarateParser.ExamplesContext ctx);
	/**
	 * Exit a parse tree produced by {@link KarateParser#examples}.
	 * @param ctx the parse tree
	 */
	void exitExamples(KarateParser.ExamplesContext ctx);
	/**
	 * Enter a parse tree produced by {@link KarateParser#exampleDescription}.
	 * @param ctx the parse tree
	 */
	void enterExampleDescription(KarateParser.ExampleDescriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KarateParser#exampleDescription}.
	 * @param ctx the parse tree
	 */
	void exitExampleDescription(KarateParser.ExampleDescriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KarateParser#step}.
	 * @param ctx the parse tree
	 */
	void enterStep(KarateParser.StepContext ctx);
	/**
	 * Exit a parse tree produced by {@link KarateParser#step}.
	 * @param ctx the parse tree
	 */
	void exitStep(KarateParser.StepContext ctx);
	/**
	 * Enter a parse tree produced by {@link KarateParser#prefix}.
	 * @param ctx the parse tree
	 */
	void enterPrefix(KarateParser.PrefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link KarateParser#prefix}.
	 * @param ctx the parse tree
	 */
	void exitPrefix(KarateParser.PrefixContext ctx);
	/**
	 * Enter a parse tree produced by {@link KarateParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(KarateParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link KarateParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(KarateParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link KarateParser#tags}.
	 * @param ctx the parse tree
	 */
	void enterTags(KarateParser.TagsContext ctx);
	/**
	 * Exit a parse tree produced by {@link KarateParser#tags}.
	 * @param ctx the parse tree
	 */
	void exitTags(KarateParser.TagsContext ctx);
	/**
	 * Enter a parse tree produced by {@link KarateParser#docString}.
	 * @param ctx the parse tree
	 */
	void enterDocString(KarateParser.DocStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link KarateParser#docString}.
	 * @param ctx the parse tree
	 */
	void exitDocString(KarateParser.DocStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link KarateParser#table}.
	 * @param ctx the parse tree
	 */
	void enterTable(KarateParser.TableContext ctx);
	/**
	 * Exit a parse tree produced by {@link KarateParser#table}.
	 * @param ctx the parse tree
	 */
	void exitTable(KarateParser.TableContext ctx);
}