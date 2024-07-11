/*
 * generated by Xtext 2.32.0
 */
grammar InternalMyDsl;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.example.mydsl1.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.example.mydsl1.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl1.services.MyDslGrammarAccess;

}

@parser::members {

 	private MyDslGrammarAccess grammarAccess;

    public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "MongoDB";
   	}

   	@Override
   	protected MyDslGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleMongoDB
entryRuleMongoDB returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMongoDBRule()); }
	iv_ruleMongoDB=ruleMongoDB
	{ $current=$iv_ruleMongoDB.current; }
	EOF;

// Rule MongoDB
ruleMongoDB returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getMongoDBAccess().getModelsModelParserRuleCall_0());
			}
			lv_models_0_0=ruleModel
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getMongoDBRule());
				}
				add(
					$current,
					"models",
					lv_models_0_0,
					"org.xtext.example.mydsl1.MyDsl.Model");
				afterParserOrEnumRuleCall();
			}
		)
	)*
;

// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	iv_ruleModel=ruleModel
	{ $current=$iv_ruleModel.current; }
	EOF;

// Rule Model
ruleModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getConnectionConnectionStatementParserRuleCall_0_0());
				}
				lv_connection_0_0=ruleConnectionStatement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					set(
						$current,
						"connection",
						lv_connection_0_0,
						"org.xtext.example.mydsl1.MyDsl.ConnectionStatement");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getStatementsOperationStatementParserRuleCall_1_0());
				}
				lv_statements_1_0=ruleOperationStatement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					add(
						$current,
						"statements",
						lv_statements_1_0,
						"org.xtext.example.mydsl1.MyDsl.OperationStatement");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleOperationStatement
entryRuleOperationStatement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getOperationStatementRule()); }
	iv_ruleOperationStatement=ruleOperationStatement
	{ $current=$iv_ruleOperationStatement.current; }
	EOF;

// Rule OperationStatement
ruleOperationStatement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getOperationStatementAccess().getSchemaMakeStatementParserRuleCall_0_0());
				}
				lv_schema_0_0=ruleMakeStatement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getOperationStatementRule());
					}
					set(
						$current,
						"schema",
						lv_schema_0_0,
						"org.xtext.example.mydsl1.MyDsl.MakeStatement");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getOperationStatementAccess().getOperationsOtherOperationStatementParserRuleCall_1_0());
				}
				lv_operations_1_0=ruleOtherOperationStatement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getOperationStatementRule());
					}
					add(
						$current,
						"operations",
						lv_operations_1_0,
						"org.xtext.example.mydsl1.MyDsl.OtherOperationStatement");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleConnectionStatement
entryRuleConnectionStatement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConnectionStatementRule()); }
	iv_ruleConnectionStatement=ruleConnectionStatement
	{ $current=$iv_ruleConnectionStatement.current; }
	EOF;

// Rule ConnectionStatement
ruleConnectionStatement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{ 
			  getUnorderedGroupHelper().enter(grammarAccess.getConnectionStatementAccess().getUnorderedGroup());
			}
			(
				(
		(
			{getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionStatementAccess().getUnorderedGroup(), 0)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getConnectionStatementAccess().getUnorderedGroup(), 0);
				}
							({true}?=>(otherlv_1='DatabaseParameters'
							{
								newLeafNode(otherlv_1, grammarAccess.getConnectionStatementAccess().getDatabaseParametersKeyword_0_0());
							}
							otherlv_2='{'
							{
								newLeafNode(otherlv_2, grammarAccess.getConnectionStatementAccess().getLeftCurlyBracketKeyword_0_1());
							}
							otherlv_3='Connection'
							{
								newLeafNode(otherlv_3, grammarAccess.getConnectionStatementAccess().getConnectionKeyword_0_2());
							}
							(
								(
									lv_connectionString_4_0=RULE_STRING
									{
										newLeafNode(lv_connectionString_4_0, grammarAccess.getConnectionStatementAccess().getConnectionStringSTRINGTerminalRuleCall_0_3_0());
									}
									{
										if ($current==null) {
											$current = createModelElement(grammarAccess.getConnectionStatementRule());
										}
										setWithLastConsumed(
											$current,
											"connectionString",
											lv_connectionString_4_0,
											"org.eclipse.xtext.common.Terminals.STRING");
									}
								)
							)
							otherlv_5=','
							{
								newLeafNode(otherlv_5, grammarAccess.getConnectionStatementAccess().getCommaKeyword_0_4());
							}
							))
				{ 
					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getConnectionStatementAccess().getUnorderedGroup());
				}
			)
		)|
		(
			{getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionStatementAccess().getUnorderedGroup(), 1)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getConnectionStatementAccess().getUnorderedGroup(), 1);
				}
							({true}?=>(otherlv_6='database'
							{
								newLeafNode(otherlv_6, grammarAccess.getConnectionStatementAccess().getDatabaseKeyword_1_0());
							}
							(
								(
									lv_database_7_0=RULE_STRING
									{
										newLeafNode(lv_database_7_0, grammarAccess.getConnectionStatementAccess().getDatabaseSTRINGTerminalRuleCall_1_1_0());
									}
									{
										if ($current==null) {
											$current = createModelElement(grammarAccess.getConnectionStatementRule());
										}
										setWithLastConsumed(
											$current,
											"database",
											lv_database_7_0,
											"org.eclipse.xtext.common.Terminals.STRING");
									}
								)
							)
							otherlv_8='}'
							{
								newLeafNode(otherlv_8, grammarAccess.getConnectionStatementAccess().getRightCurlyBracketKeyword_1_2());
							}
							))
				{ 
					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getConnectionStatementAccess().getUnorderedGroup());
				}
			)
		)
				)+
				{getUnorderedGroupHelper().canLeave(grammarAccess.getConnectionStatementAccess().getUnorderedGroup())}?
			)
		)
			{ 
			  getUnorderedGroupHelper().leave(grammarAccess.getConnectionStatementAccess().getUnorderedGroup());
			}
	)
;

// Entry rule entryRuleMakeStatement
entryRuleMakeStatement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMakeStatementRule()); }
	iv_ruleMakeStatement=ruleMakeStatement
	{ $current=$iv_ruleMakeStatement.current; }
	EOF;

// Rule MakeStatement
ruleMakeStatement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Collection'
		{
			newLeafNode(otherlv_0, grammarAccess.getMakeStatementAccess().getCollectionKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getMakeStatementAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMakeStatementRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getMakeStatementAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getMakeStatementAccess().getEntriesDictionaryEntryParserRuleCall_3_0_0());
					}
					lv_entries_3_0=ruleDictionaryEntry
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getMakeStatementRule());
						}
						add(
							$current,
							"entries",
							lv_entries_3_0,
							"org.xtext.example.mydsl1.MyDsl.DictionaryEntry");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_4=','
				{
					newLeafNode(otherlv_4, grammarAccess.getMakeStatementAccess().getCommaKeyword_3_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getMakeStatementAccess().getEntriesDictionaryEntryParserRuleCall_3_1_1_0());
						}
						lv_entries_5_0=ruleDictionaryEntry
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getMakeStatementRule());
							}
							add(
								$current,
								"entries",
								lv_entries_5_0,
								"org.xtext.example.mydsl1.MyDsl.DictionaryEntry");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
		)?
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getMakeStatementAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleDictionaryEntry
entryRuleDictionaryEntry returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDictionaryEntryRule()); }
	iv_ruleDictionaryEntry=ruleDictionaryEntry
	{ $current=$iv_ruleDictionaryEntry.current; }
	EOF;

// Rule DictionaryEntry
ruleDictionaryEntry returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				(
					lv_name_0_0=RULE_ID
					{
						newLeafNode(lv_name_0_0, grammarAccess.getDictionaryEntryAccess().getNameIDTerminalRuleCall_0_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getDictionaryEntryRule());
						}
						setWithLastConsumed(
							$current,
							"name",
							lv_name_0_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
			otherlv_1=':'
			{
				newLeafNode(otherlv_1, grammarAccess.getDictionaryEntryAccess().getColonKeyword_0_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getDictionaryEntryAccess().getFieldTypeFieldTypeParserRuleCall_0_2_0());
					}
					lv_fieldType_2_0=ruleFieldType
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDictionaryEntryRule());
						}
						set(
							$current,
							"fieldType",
							lv_fieldType_2_0,
							"org.xtext.example.mydsl1.MyDsl.FieldType");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					lv_status_3_0='required'
					{
						newLeafNode(lv_status_3_0, grammarAccess.getDictionaryEntryAccess().getStatusRequiredKeyword_0_3_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getDictionaryEntryRule());
						}
						setWithLastConsumed($current, "status", lv_status_3_0 != null, "required");
					}
				)
			)?
			(
				(
					lv_uniqueKey_4_0='unique'
					{
						newLeafNode(lv_uniqueKey_4_0, grammarAccess.getDictionaryEntryAccess().getUniqueKeyUniqueKeyword_0_4_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getDictionaryEntryRule());
						}
						setWithLastConsumed($current, "uniqueKey", lv_uniqueKey_4_0 != null, "unique");
					}
				)
			)?
		)
		    |
		(
			(
				(
					lv_name_5_0=RULE_ID
					{
						newLeafNode(lv_name_5_0, grammarAccess.getDictionaryEntryAccess().getNameIDTerminalRuleCall_1_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getDictionaryEntryRule());
						}
						setWithLastConsumed(
							$current,
							"name",
							lv_name_5_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
			otherlv_6=':'
			{
				newLeafNode(otherlv_6, grammarAccess.getDictionaryEntryAccess().getColonKeyword_1_1());
			}
			otherlv_7='ref'
			{
				newLeafNode(otherlv_7, grammarAccess.getDictionaryEntryAccess().getRefKeyword_1_2());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getDictionaryEntryRule());
						}
					}
					otherlv_8=RULE_ID
					{
						newLeafNode(otherlv_8, grammarAccess.getDictionaryEntryAccess().getRefDictionaryMakeStatementCrossReference_1_3_0());
					}
				)
			)
		)
	)
;

// Entry rule entryRuleOtherOperationStatement
entryRuleOtherOperationStatement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getOtherOperationStatementRule()); }
	iv_ruleOtherOperationStatement=ruleOtherOperationStatement
	{ $current=$iv_ruleOtherOperationStatement.current; }
	EOF;

// Rule OtherOperationStatement
ruleOtherOperationStatement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='task:'
			{
				newLeafNode(otherlv_0, grammarAccess.getOtherOperationStatementAccess().getTaskKeyword_0_0());
			}
			(
				otherlv_1='{'
				{
					newLeafNode(otherlv_1, grammarAccess.getOtherOperationStatementAccess().getLeftCurlyBracketKeyword_0_1_0());
				}
				otherlv_2='operation:'
				{
					newLeafNode(otherlv_2, grammarAccess.getOtherOperationStatementAccess().getOperationKeyword_0_1_1());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getOtherOperationStatementAccess().getTypeOperationParserRuleCall_0_1_2_0());
						}
						lv_type_3_0=ruleOperation
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getOtherOperationStatementRule());
							}
							set(
								$current,
								"type",
								lv_type_3_0,
								"org.xtext.example.mydsl1.MyDsl.Operation");
							afterParserOrEnumRuleCall();
						}
					)
				)
				otherlv_4=','
				{
					newLeafNode(otherlv_4, grammarAccess.getOtherOperationStatementAccess().getCommaKeyword_0_1_3());
				}
				otherlv_5='collection:'
				{
					newLeafNode(otherlv_5, grammarAccess.getOtherOperationStatementAccess().getCollectionKeyword_0_1_4());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getOtherOperationStatementRule());
							}
						}
						otherlv_6=RULE_ID
						{
							newLeafNode(otherlv_6, grammarAccess.getOtherOperationStatementAccess().getCollectionMakeStatementCrossReference_0_1_5_0());
						}
					)
				)
				otherlv_7='input:'
				{
					newLeafNode(otherlv_7, grammarAccess.getOtherOperationStatementAccess().getInputKeyword_0_1_6());
				}
				otherlv_8='{'
				{
					newLeafNode(otherlv_8, grammarAccess.getOtherOperationStatementAccess().getLeftCurlyBracketKeyword_0_1_7());
				}
				(
					(
						(
							{
								newCompositeNode(grammarAccess.getOtherOperationStatementAccess().getEntriesTaskDictionaryEntryParserRuleCall_0_1_8_0_0());
							}
							lv_entries_9_0=ruleTaskDictionaryEntry
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getOtherOperationStatementRule());
								}
								add(
									$current,
									"entries",
									lv_entries_9_0,
									"org.xtext.example.mydsl1.MyDsl.TaskDictionaryEntry");
								afterParserOrEnumRuleCall();
							}
						)
					)
					(
						otherlv_10=','
						{
							newLeafNode(otherlv_10, grammarAccess.getOtherOperationStatementAccess().getCommaKeyword_0_1_8_1_0());
						}
						(
							(
								{
									newCompositeNode(grammarAccess.getOtherOperationStatementAccess().getEntriesTaskDictionaryEntryParserRuleCall_0_1_8_1_1_0());
								}
								lv_entries_11_0=ruleTaskDictionaryEntry
								{
									if ($current==null) {
										$current = createModelElementForParent(grammarAccess.getOtherOperationStatementRule());
									}
									add(
										$current,
										"entries",
										lv_entries_11_0,
										"org.xtext.example.mydsl1.MyDsl.TaskDictionaryEntry");
									afterParserOrEnumRuleCall();
								}
							)
						)
					)*
				)?
				otherlv_12='}'
				{
					newLeafNode(otherlv_12, grammarAccess.getOtherOperationStatementAccess().getRightCurlyBracketKeyword_0_1_9());
				}
				otherlv_13='}'
				{
					newLeafNode(otherlv_13, grammarAccess.getOtherOperationStatementAccess().getRightCurlyBracketKeyword_0_1_10());
				}
			)
		)
		    |
		(
			otherlv_14='task:'
			{
				newLeafNode(otherlv_14, grammarAccess.getOtherOperationStatementAccess().getTaskKeyword_1_0());
			}
			(
				otherlv_15='{'
				{
					newLeafNode(otherlv_15, grammarAccess.getOtherOperationStatementAccess().getLeftCurlyBracketKeyword_1_1_0());
				}
				otherlv_16='operation:'
				{
					newLeafNode(otherlv_16, grammarAccess.getOtherOperationStatementAccess().getOperationKeyword_1_1_1());
				}
				(
					(
						lv_type_17_0='UPDATE,'
						{
							newLeafNode(lv_type_17_0, grammarAccess.getOtherOperationStatementAccess().getTypeUPDATEKeyword_1_1_2_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getOtherOperationStatementRule());
							}
							setWithLastConsumed($current, "type", lv_type_17_0, "UPDATE,");
						}
					)
				)
				otherlv_18='collection:'
				{
					newLeafNode(otherlv_18, grammarAccess.getOtherOperationStatementAccess().getCollectionKeyword_1_1_3());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getOtherOperationStatementRule());
							}
						}
						otherlv_19=RULE_ID
						{
							newLeafNode(otherlv_19, grammarAccess.getOtherOperationStatementAccess().getCollectionMakeStatementCrossReference_1_1_4_0());
						}
					)
				)
				otherlv_20='input:'
				{
					newLeafNode(otherlv_20, grammarAccess.getOtherOperationStatementAccess().getInputKeyword_1_1_5());
				}
				otherlv_21='{'
				{
					newLeafNode(otherlv_21, grammarAccess.getOtherOperationStatementAccess().getLeftCurlyBracketKeyword_1_1_6());
				}
				(
					(
						(
							{
								newCompositeNode(grammarAccess.getOtherOperationStatementAccess().getEntriesTaskDictionaryEntryParserRuleCall_1_1_7_0_0());
							}
							lv_entries_22_0=ruleTaskDictionaryEntry
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getOtherOperationStatementRule());
								}
								add(
									$current,
									"entries",
									lv_entries_22_0,
									"org.xtext.example.mydsl1.MyDsl.TaskDictionaryEntry");
								afterParserOrEnumRuleCall();
							}
						)
					)
					(
						otherlv_23=','
						{
							newLeafNode(otherlv_23, grammarAccess.getOtherOperationStatementAccess().getCommaKeyword_1_1_7_1_0());
						}
						(
							(
								{
									newCompositeNode(grammarAccess.getOtherOperationStatementAccess().getEntriesTaskDictionaryEntryParserRuleCall_1_1_7_1_1_0());
								}
								lv_entries_24_0=ruleTaskDictionaryEntry
								{
									if ($current==null) {
										$current = createModelElementForParent(grammarAccess.getOtherOperationStatementRule());
									}
									add(
										$current,
										"entries",
										lv_entries_24_0,
										"org.xtext.example.mydsl1.MyDsl.TaskDictionaryEntry");
									afterParserOrEnumRuleCall();
								}
							)
						)
					)*
				)?
				otherlv_25='}'
				{
					newLeafNode(otherlv_25, grammarAccess.getOtherOperationStatementAccess().getRightCurlyBracketKeyword_1_1_8());
				}
				(
					otherlv_26=','
					{
						newLeafNode(otherlv_26, grammarAccess.getOtherOperationStatementAccess().getCommaKeyword_1_1_9_0());
					}
					otherlv_27='update:'
					{
						newLeafNode(otherlv_27, grammarAccess.getOtherOperationStatementAccess().getUpdateKeyword_1_1_9_1());
					}
					otherlv_28='{'
					{
						newLeafNode(otherlv_28, grammarAccess.getOtherOperationStatementAccess().getLeftCurlyBracketKeyword_1_1_9_2());
					}
					(
						(
							(
								{
									newCompositeNode(grammarAccess.getOtherOperationStatementAccess().getEntriesTaskDictionaryEntryParserRuleCall_1_1_9_3_0_0());
								}
								lv_entries_29_0=ruleTaskDictionaryEntry
								{
									if ($current==null) {
										$current = createModelElementForParent(grammarAccess.getOtherOperationStatementRule());
									}
									add(
										$current,
										"entries",
										lv_entries_29_0,
										"org.xtext.example.mydsl1.MyDsl.TaskDictionaryEntry");
									afterParserOrEnumRuleCall();
								}
							)
						)
						(
							otherlv_30=','
							{
								newLeafNode(otherlv_30, grammarAccess.getOtherOperationStatementAccess().getCommaKeyword_1_1_9_3_1_0());
							}
							(
								(
									{
										newCompositeNode(grammarAccess.getOtherOperationStatementAccess().getEntriesTaskDictionaryEntryParserRuleCall_1_1_9_3_1_1_0());
									}
									lv_entries_31_0=ruleTaskDictionaryEntry
									{
										if ($current==null) {
											$current = createModelElementForParent(grammarAccess.getOtherOperationStatementRule());
										}
										add(
											$current,
											"entries",
											lv_entries_31_0,
											"org.xtext.example.mydsl1.MyDsl.TaskDictionaryEntry");
										afterParserOrEnumRuleCall();
									}
								)
							)
						)*
					)?
					otherlv_32='}'
					{
						newLeafNode(otherlv_32, grammarAccess.getOtherOperationStatementAccess().getRightCurlyBracketKeyword_1_1_9_4());
					}
				)?
				otherlv_33='}'
				{
					newLeafNode(otherlv_33, grammarAccess.getOtherOperationStatementAccess().getRightCurlyBracketKeyword_1_1_10());
				}
			)
		)
	)
;

// Entry rule entryRuleTaskDictionaryEntry
entryRuleTaskDictionaryEntry returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTaskDictionaryEntryRule()); }
	iv_ruleTaskDictionaryEntry=ruleTaskDictionaryEntry
	{ $current=$iv_ruleTaskDictionaryEntry.current; }
	EOF;

// Rule TaskDictionaryEntry
ruleTaskDictionaryEntry returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_valueName_0_0=RULE_ID
				{
					newLeafNode(lv_valueName_0_0, grammarAccess.getTaskDictionaryEntryAccess().getValueNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTaskDictionaryEntryRule());
					}
					setWithLastConsumed(
						$current,
						"valueName",
						lv_valueName_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_1=':'
		{
			newLeafNode(otherlv_1, grammarAccess.getTaskDictionaryEntryAccess().getColonKeyword_1());
		}
		(
			(
				(
					lv_valueString_2_0=RULE_STRING
					{
						newLeafNode(lv_valueString_2_0, grammarAccess.getTaskDictionaryEntryAccess().getValueStringSTRINGTerminalRuleCall_2_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTaskDictionaryEntryRule());
						}
						setWithLastConsumed(
							$current,
							"valueString",
							lv_valueString_2_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
			    |
			(
				(
					lv_valueInt_3_0=RULE_INT
					{
						newLeafNode(lv_valueInt_3_0, grammarAccess.getTaskDictionaryEntryAccess().getValueIntINTTerminalRuleCall_2_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTaskDictionaryEntryRule());
						}
						setWithLastConsumed(
							$current,
							"valueInt",
							lv_valueInt_3_0,
							"org.eclipse.xtext.common.Terminals.INT");
					}
				)
			)
		)
	)
;

// Entry rule entryRuleOperation
entryRuleOperation returns [String current=null]:
	{ newCompositeNode(grammarAccess.getOperationRule()); }
	iv_ruleOperation=ruleOperation
	{ $current=$iv_ruleOperation.current.getText(); }
	EOF;

// Rule Operation
ruleOperation returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='GET'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getOperationAccess().getGETKeyword_0());
		}
		    |
		kw='DELETE'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getOperationAccess().getDELETEKeyword_1());
		}
		    |
		kw='INSERT'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getOperationAccess().getINSERTKeyword_2());
		}
	)
;

// Entry rule entryRuleFieldType
entryRuleFieldType returns [String current=null]:
	{ newCompositeNode(grammarAccess.getFieldTypeRule()); }
	iv_ruleFieldType=ruleFieldType
	{ $current=$iv_ruleFieldType.current.getText(); }
	EOF;

// Rule FieldType
ruleFieldType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='String'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getFieldTypeAccess().getStringKeyword_0());
		}
		    |
		kw='Number'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getFieldTypeAccess().getNumberKeyword_1());
		}
		    |
		kw='Boolean'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getFieldTypeAccess().getBooleanKeyword_2());
		}
		    |
		kw='Date'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getFieldTypeAccess().getDateKeyword_3());
		}
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;