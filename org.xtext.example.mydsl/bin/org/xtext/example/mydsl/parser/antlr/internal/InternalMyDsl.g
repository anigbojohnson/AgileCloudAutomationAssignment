/*
 * generated by Xtext 2.32.0
 */
grammar InternalMyDsl;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.example.mydsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

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
					"org.xtext.example.mydsl.MyDsl.Model");
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
						"org.xtext.example.mydsl.MyDsl.ConnectionStatement");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getStatementsCRUDOperationAndCollectionSchemaParserRuleCall_1_0());
				}
				lv_statements_1_0=ruleCRUDOperationAndCollectionSchema
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					add(
						$current,
						"statements",
						lv_statements_1_0,
						"org.xtext.example.mydsl.MyDsl.CRUDOperationAndCollectionSchema");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleCRUDOperationAndCollectionSchema
entryRuleCRUDOperationAndCollectionSchema returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCRUDOperationAndCollectionSchemaRule()); }
	iv_ruleCRUDOperationAndCollectionSchema=ruleCRUDOperationAndCollectionSchema
	{ $current=$iv_ruleCRUDOperationAndCollectionSchema.current; }
	EOF;

// Rule CRUDOperationAndCollectionSchema
ruleCRUDOperationAndCollectionSchema returns [EObject current=null]
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
					newCompositeNode(grammarAccess.getCRUDOperationAndCollectionSchemaAccess().getSchemaCollectionSchemaParserRuleCall_0_0());
				}
				lv_schema_0_0=ruleCollectionSchema
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCRUDOperationAndCollectionSchemaRule());
					}
					set(
						$current,
						"schema",
						lv_schema_0_0,
						"org.xtext.example.mydsl.MyDsl.CollectionSchema");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getCRUDOperationAndCollectionSchemaAccess().getOperationsCRUDOperationsParserRuleCall_1_0());
				}
				lv_operations_1_0=ruleCRUDOperations
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCRUDOperationAndCollectionSchemaRule());
					}
					add(
						$current,
						"operations",
						lv_operations_1_0,
						"org.xtext.example.mydsl.MyDsl.CRUDOperations");
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
							({true}?=>(otherlv_6='databaseName'
							{
								newLeafNode(otherlv_6, grammarAccess.getConnectionStatementAccess().getDatabaseNameKeyword_1_0());
							}
							(
								(
									lv_databaseName_7_0=RULE_STRING
									{
										newLeafNode(lv_databaseName_7_0, grammarAccess.getConnectionStatementAccess().getDatabaseNameSTRINGTerminalRuleCall_1_1_0());
									}
									{
										if ($current==null) {
											$current = createModelElement(grammarAccess.getConnectionStatementRule());
										}
										setWithLastConsumed(
											$current,
											"databaseName",
											lv_databaseName_7_0,
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

// Entry rule entryRuleCollectionSchema
entryRuleCollectionSchema returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCollectionSchemaRule()); }
	iv_ruleCollectionSchema=ruleCollectionSchema
	{ $current=$iv_ruleCollectionSchema.current; }
	EOF;

// Rule CollectionSchema
ruleCollectionSchema returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Collection'
		{
			newLeafNode(otherlv_0, grammarAccess.getCollectionSchemaAccess().getCollectionKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getCollectionSchemaAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCollectionSchemaRule());
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
			newLeafNode(otherlv_2, grammarAccess.getCollectionSchemaAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getCollectionSchemaAccess().getDefinationCollectionFieldDefinationParserRuleCall_3_0_0());
					}
					lv_defination_3_0=ruleCollectionFieldDefination
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getCollectionSchemaRule());
						}
						add(
							$current,
							"defination",
							lv_defination_3_0,
							"org.xtext.example.mydsl.MyDsl.CollectionFieldDefination");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_4=','
				{
					newLeafNode(otherlv_4, grammarAccess.getCollectionSchemaAccess().getCommaKeyword_3_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getCollectionSchemaAccess().getDefinationCollectionFieldDefinationParserRuleCall_3_1_1_0());
						}
						lv_defination_5_0=ruleCollectionFieldDefination
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getCollectionSchemaRule());
							}
							add(
								$current,
								"defination",
								lv_defination_5_0,
								"org.xtext.example.mydsl.MyDsl.CollectionFieldDefination");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
		)?
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getCollectionSchemaAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleCollectionFieldDefination
entryRuleCollectionFieldDefination returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCollectionFieldDefinationRule()); }
	iv_ruleCollectionFieldDefination=ruleCollectionFieldDefination
	{ $current=$iv_ruleCollectionFieldDefination.current; }
	EOF;

// Rule CollectionFieldDefination
ruleCollectionFieldDefination returns [EObject current=null]
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
						newLeafNode(lv_name_0_0, grammarAccess.getCollectionFieldDefinationAccess().getNameIDTerminalRuleCall_0_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getCollectionFieldDefinationRule());
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
				newLeafNode(otherlv_1, grammarAccess.getCollectionFieldDefinationAccess().getColonKeyword_0_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getCollectionFieldDefinationAccess().getFieldTypeFieldTypeEnumRuleCall_0_2_0());
					}
					lv_fieldType_2_0=ruleFieldType
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getCollectionFieldDefinationRule());
						}
						set(
							$current,
							"fieldType",
							lv_fieldType_2_0,
							"org.xtext.example.mydsl.MyDsl.FieldType");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					lv_status_3_0='required'
					{
						newLeafNode(lv_status_3_0, grammarAccess.getCollectionFieldDefinationAccess().getStatusRequiredKeyword_0_3_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getCollectionFieldDefinationRule());
						}
						setWithLastConsumed($current, "status", lv_status_3_0 != null, "required");
					}
				)
			)?
			(
				(
					lv_uniqueKey_4_0='unique'
					{
						newLeafNode(lv_uniqueKey_4_0, grammarAccess.getCollectionFieldDefinationAccess().getUniqueKeyUniqueKeyword_0_4_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getCollectionFieldDefinationRule());
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
						newLeafNode(lv_name_5_0, grammarAccess.getCollectionFieldDefinationAccess().getNameIDTerminalRuleCall_1_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getCollectionFieldDefinationRule());
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
				newLeafNode(otherlv_6, grammarAccess.getCollectionFieldDefinationAccess().getColonKeyword_1_1());
			}
			otherlv_7='ref'
			{
				newLeafNode(otherlv_7, grammarAccess.getCollectionFieldDefinationAccess().getRefKeyword_1_2());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getCollectionFieldDefinationRule());
						}
					}
					otherlv_8=RULE_ID
					{
						newLeafNode(otherlv_8, grammarAccess.getCollectionFieldDefinationAccess().getRefCollectionCollectionSchemaCrossReference_1_3_0());
					}
				)
			)
		)
	)
;

// Entry rule entryRuleCRUDOperations
entryRuleCRUDOperations returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCRUDOperationsRule()); }
	iv_ruleCRUDOperations=ruleCRUDOperations
	{ $current=$iv_ruleCRUDOperations.current; }
	EOF;

// Rule CRUDOperations
ruleCRUDOperations returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='task'
			{
				newLeafNode(otherlv_0, grammarAccess.getCRUDOperationsAccess().getTaskKeyword_0_0());
			}
			(
				(
					lv_name_1_0=RULE_ID
					{
						newLeafNode(lv_name_1_0, grammarAccess.getCRUDOperationsAccess().getNameIDTerminalRuleCall_0_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getCRUDOperationsRule());
						}
						setWithLastConsumed(
							$current,
							"name",
							lv_name_1_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
			otherlv_2=':'
			{
				newLeafNode(otherlv_2, grammarAccess.getCRUDOperationsAccess().getColonKeyword_0_2());
			}
			(
				otherlv_3='{'
				{
					newLeafNode(otherlv_3, grammarAccess.getCRUDOperationsAccess().getLeftCurlyBracketKeyword_0_3_0());
				}
				otherlv_4='operation:'
				{
					newLeafNode(otherlv_4, grammarAccess.getCRUDOperationsAccess().getOperationKeyword_0_3_1());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getCRUDOperationsAccess().getTypeOperationEnumRuleCall_0_3_2_0());
						}
						lv_type_5_0=ruleOperation
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getCRUDOperationsRule());
							}
							set(
								$current,
								"type",
								lv_type_5_0,
								"org.xtext.example.mydsl.MyDsl.Operation");
							afterParserOrEnumRuleCall();
						}
					)
				)
				otherlv_6=','
				{
					newLeafNode(otherlv_6, grammarAccess.getCRUDOperationsAccess().getCommaKeyword_0_3_3());
				}
				otherlv_7='collection:'
				{
					newLeafNode(otherlv_7, grammarAccess.getCRUDOperationsAccess().getCollectionKeyword_0_3_4());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getCRUDOperationsRule());
							}
						}
						otherlv_8=RULE_ID
						{
							newLeafNode(otherlv_8, grammarAccess.getCRUDOperationsAccess().getCollectionCollectionSchemaCrossReference_0_3_5_0());
						}
					)
				)
				otherlv_9='input:'
				{
					newLeafNode(otherlv_9, grammarAccess.getCRUDOperationsAccess().getInputKeyword_0_3_6());
				}
				otherlv_10='{'
				{
					newLeafNode(otherlv_10, grammarAccess.getCRUDOperationsAccess().getLeftCurlyBracketKeyword_0_3_7());
				}
				(
					(
						(
							{
								newCompositeNode(grammarAccess.getCRUDOperationsAccess().getEntriesCollectionEntryParserRuleCall_0_3_8_0_0());
							}
							lv_entries_11_0=ruleCollectionEntry
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getCRUDOperationsRule());
								}
								add(
									$current,
									"entries",
									lv_entries_11_0,
									"org.xtext.example.mydsl.MyDsl.CollectionEntry");
								afterParserOrEnumRuleCall();
							}
						)
					)
					(
						otherlv_12=','
						{
							newLeafNode(otherlv_12, grammarAccess.getCRUDOperationsAccess().getCommaKeyword_0_3_8_1_0());
						}
						(
							(
								{
									newCompositeNode(grammarAccess.getCRUDOperationsAccess().getEntriesCollectionEntryParserRuleCall_0_3_8_1_1_0());
								}
								lv_entries_13_0=ruleCollectionEntry
								{
									if ($current==null) {
										$current = createModelElementForParent(grammarAccess.getCRUDOperationsRule());
									}
									add(
										$current,
										"entries",
										lv_entries_13_0,
										"org.xtext.example.mydsl.MyDsl.CollectionEntry");
									afterParserOrEnumRuleCall();
								}
							)
						)
					)*
				)?
				otherlv_14='}'
				{
					newLeafNode(otherlv_14, grammarAccess.getCRUDOperationsAccess().getRightCurlyBracketKeyword_0_3_9());
				}
				otherlv_15='}'
				{
					newLeafNode(otherlv_15, grammarAccess.getCRUDOperationsAccess().getRightCurlyBracketKeyword_0_3_10());
				}
			)
		)
		    |
		(
			otherlv_16='task'
			{
				newLeafNode(otherlv_16, grammarAccess.getCRUDOperationsAccess().getTaskKeyword_1_0());
			}
			(
				(
					lv_name_17_0=RULE_ID
					{
						newLeafNode(lv_name_17_0, grammarAccess.getCRUDOperationsAccess().getNameIDTerminalRuleCall_1_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getCRUDOperationsRule());
						}
						setWithLastConsumed(
							$current,
							"name",
							lv_name_17_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
			otherlv_18=':'
			{
				newLeafNode(otherlv_18, grammarAccess.getCRUDOperationsAccess().getColonKeyword_1_2());
			}
			(
				otherlv_19='{'
				{
					newLeafNode(otherlv_19, grammarAccess.getCRUDOperationsAccess().getLeftCurlyBracketKeyword_1_3_0());
				}
				otherlv_20='operation:'
				{
					newLeafNode(otherlv_20, grammarAccess.getCRUDOperationsAccess().getOperationKeyword_1_3_1());
				}
				(
					(
						lv_updateOperation_21_0='UPDATE'
						{
							newLeafNode(lv_updateOperation_21_0, grammarAccess.getCRUDOperationsAccess().getUpdateOperationUPDATEKeyword_1_3_2_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getCRUDOperationsRule());
							}
							setWithLastConsumed($current, "updateOperation", lv_updateOperation_21_0, "UPDATE");
						}
					)
				)
				otherlv_22='collection:'
				{
					newLeafNode(otherlv_22, grammarAccess.getCRUDOperationsAccess().getCollectionKeyword_1_3_3());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getCRUDOperationsRule());
							}
						}
						otherlv_23=RULE_ID
						{
							newLeafNode(otherlv_23, grammarAccess.getCRUDOperationsAccess().getCollectionCollectionSchemaCrossReference_1_3_4_0());
						}
					)
				)
				otherlv_24='input:'
				{
					newLeafNode(otherlv_24, grammarAccess.getCRUDOperationsAccess().getInputKeyword_1_3_5());
				}
				otherlv_25='{'
				{
					newLeafNode(otherlv_25, grammarAccess.getCRUDOperationsAccess().getLeftCurlyBracketKeyword_1_3_6());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getCRUDOperationsAccess().getCriteriaCollectionEntryParserRuleCall_1_3_7_0());
						}
						lv_criteria_26_0=ruleCollectionEntry
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getCRUDOperationsRule());
							}
							add(
								$current,
								"criteria",
								lv_criteria_26_0,
								"org.xtext.example.mydsl.MyDsl.CollectionEntry");
							afterParserOrEnumRuleCall();
						}
					)
				)
				(
					otherlv_27=','
					{
						newLeafNode(otherlv_27, grammarAccess.getCRUDOperationsAccess().getCommaKeyword_1_3_8_0());
					}
					(
						(
							{
								newCompositeNode(grammarAccess.getCRUDOperationsAccess().getCriteriaCollectionEntryParserRuleCall_1_3_8_1_0());
							}
							lv_criteria_28_0=ruleCollectionEntry
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getCRUDOperationsRule());
								}
								add(
									$current,
									"criteria",
									lv_criteria_28_0,
									"org.xtext.example.mydsl.MyDsl.CollectionEntry");
								afterParserOrEnumRuleCall();
							}
						)
					)
				)*
				otherlv_29='},'
				{
					newLeafNode(otherlv_29, grammarAccess.getCRUDOperationsAccess().getRightCurlyBracketCommaKeyword_1_3_9());
				}
				otherlv_30='update:'
				{
					newLeafNode(otherlv_30, grammarAccess.getCRUDOperationsAccess().getUpdateKeyword_1_3_10());
				}
				otherlv_31='{'
				{
					newLeafNode(otherlv_31, grammarAccess.getCRUDOperationsAccess().getLeftCurlyBracketKeyword_1_3_11());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getCRUDOperationsAccess().getEntriesCollectionEntryParserRuleCall_1_3_12_0());
						}
						lv_entries_32_0=ruleCollectionEntry
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getCRUDOperationsRule());
							}
							add(
								$current,
								"entries",
								lv_entries_32_0,
								"org.xtext.example.mydsl.MyDsl.CollectionEntry");
							afterParserOrEnumRuleCall();
						}
					)
				)
				(
					otherlv_33=','
					{
						newLeafNode(otherlv_33, grammarAccess.getCRUDOperationsAccess().getCommaKeyword_1_3_13_0());
					}
					(
						(
							{
								newCompositeNode(grammarAccess.getCRUDOperationsAccess().getEntriesCollectionEntryParserRuleCall_1_3_13_1_0());
							}
							lv_entries_34_0=ruleCollectionEntry
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getCRUDOperationsRule());
								}
								add(
									$current,
									"entries",
									lv_entries_34_0,
									"org.xtext.example.mydsl.MyDsl.CollectionEntry");
								afterParserOrEnumRuleCall();
							}
						)
					)
				)*
				otherlv_35='}'
				{
					newLeafNode(otherlv_35, grammarAccess.getCRUDOperationsAccess().getRightCurlyBracketKeyword_1_3_14());
				}
				otherlv_36='}'
				{
					newLeafNode(otherlv_36, grammarAccess.getCRUDOperationsAccess().getRightCurlyBracketKeyword_1_3_15());
				}
			)
		)
	)
;

// Entry rule entryRuleCollectionEntry
entryRuleCollectionEntry returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCollectionEntryRule()); }
	iv_ruleCollectionEntry=ruleCollectionEntry
	{ $current=$iv_ruleCollectionEntry.current; }
	EOF;

// Rule CollectionEntry
ruleCollectionEntry returns [EObject current=null]
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
					newLeafNode(lv_valueName_0_0, grammarAccess.getCollectionEntryAccess().getValueNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCollectionEntryRule());
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
			newLeafNode(otherlv_1, grammarAccess.getCollectionEntryAccess().getColonKeyword_1());
		}
		(
			(
				(
					lv_valueString_2_0=RULE_STRING
					{
						newLeafNode(lv_valueString_2_0, grammarAccess.getCollectionEntryAccess().getValueStringSTRINGTerminalRuleCall_2_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getCollectionEntryRule());
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
						newLeafNode(lv_valueInt_3_0, grammarAccess.getCollectionEntryAccess().getValueIntINTTerminalRuleCall_2_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getCollectionEntryRule());
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

// Rule Operation
ruleOperation returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='GET'
			{
				$current = grammarAccess.getOperationAccess().getGETEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getOperationAccess().getGETEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='DELETE'
			{
				$current = grammarAccess.getOperationAccess().getDELETEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getOperationAccess().getDELETEEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='INSERT'
			{
				$current = grammarAccess.getOperationAccess().getINSERTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getOperationAccess().getINSERTEnumLiteralDeclaration_2());
			}
		)
	)
;

// Rule FieldType
ruleFieldType returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='String'
			{
				$current = grammarAccess.getFieldTypeAccess().getStringEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getFieldTypeAccess().getStringEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='Number'
			{
				$current = grammarAccess.getFieldTypeAccess().getNumberEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getFieldTypeAccess().getNumberEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='Boolean'
			{
				$current = grammarAccess.getFieldTypeAccess().getBooleanEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getFieldTypeAccess().getBooleanEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='Date'
			{
				$current = grammarAccess.getFieldTypeAccess().getDateEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getFieldTypeAccess().getDateEnumLiteralDeclaration_3());
			}
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;