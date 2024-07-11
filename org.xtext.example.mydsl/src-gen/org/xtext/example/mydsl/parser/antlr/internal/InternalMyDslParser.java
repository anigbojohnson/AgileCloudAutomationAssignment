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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'DatabaseParameters'", "'{'", "'Connection'", "','", "'databaseName'", "'}'", "'Collection'", "':'", "'required'", "'unique'", "'ref'", "'task'", "'operation:'", "'collection:'", "'input:'", "'UPDATE'", "'},'", "'update:'", "'GET'", "'DELETE'", "'INSERT'", "'String'", "'Number'", "'Boolean'", "'Date'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



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




    // $ANTLR start "entryRuleMongoDB"
    // InternalMyDsl.g:65:1: entryRuleMongoDB returns [EObject current=null] : iv_ruleMongoDB= ruleMongoDB EOF ;
    public final EObject entryRuleMongoDB() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMongoDB = null;


        try {
            // InternalMyDsl.g:65:48: (iv_ruleMongoDB= ruleMongoDB EOF )
            // InternalMyDsl.g:66:2: iv_ruleMongoDB= ruleMongoDB EOF
            {
             newCompositeNode(grammarAccess.getMongoDBRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMongoDB=ruleMongoDB();

            state._fsp--;

             current =iv_ruleMongoDB; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMongoDB"


    // $ANTLR start "ruleMongoDB"
    // InternalMyDsl.g:72:1: ruleMongoDB returns [EObject current=null] : ( (lv_models_0_0= ruleModel ) )* ;
    public final EObject ruleMongoDB() throws RecognitionException {
        EObject current = null;

        EObject lv_models_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:78:2: ( ( (lv_models_0_0= ruleModel ) )* )
            // InternalMyDsl.g:79:2: ( (lv_models_0_0= ruleModel ) )*
            {
            // InternalMyDsl.g:79:2: ( (lv_models_0_0= ruleModel ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:80:3: (lv_models_0_0= ruleModel )
            	    {
            	    // InternalMyDsl.g:80:3: (lv_models_0_0= ruleModel )
            	    // InternalMyDsl.g:81:4: lv_models_0_0= ruleModel
            	    {

            	    				newCompositeNode(grammarAccess.getMongoDBAccess().getModelsModelParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_models_0_0=ruleModel();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getMongoDBRule());
            	    				}
            	    				add(
            	    					current,
            	    					"models",
            	    					lv_models_0_0,
            	    					"org.xtext.example.mydsl.MyDsl.Model");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMongoDB"


    // $ANTLR start "entryRuleModel"
    // InternalMyDsl.g:101:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalMyDsl.g:101:46: (iv_ruleModel= ruleModel EOF )
            // InternalMyDsl.g:102:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMyDsl.g:108:1: ruleModel returns [EObject current=null] : ( ( (lv_connection_0_0= ruleConnectionStatement ) ) ( (lv_statements_1_0= ruleCRUDOperationAndCollectionSchema ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_connection_0_0 = null;

        EObject lv_statements_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:114:2: ( ( ( (lv_connection_0_0= ruleConnectionStatement ) ) ( (lv_statements_1_0= ruleCRUDOperationAndCollectionSchema ) )* ) )
            // InternalMyDsl.g:115:2: ( ( (lv_connection_0_0= ruleConnectionStatement ) ) ( (lv_statements_1_0= ruleCRUDOperationAndCollectionSchema ) )* )
            {
            // InternalMyDsl.g:115:2: ( ( (lv_connection_0_0= ruleConnectionStatement ) ) ( (lv_statements_1_0= ruleCRUDOperationAndCollectionSchema ) )* )
            // InternalMyDsl.g:116:3: ( (lv_connection_0_0= ruleConnectionStatement ) ) ( (lv_statements_1_0= ruleCRUDOperationAndCollectionSchema ) )*
            {
            // InternalMyDsl.g:116:3: ( (lv_connection_0_0= ruleConnectionStatement ) )
            // InternalMyDsl.g:117:4: (lv_connection_0_0= ruleConnectionStatement )
            {
            // InternalMyDsl.g:117:4: (lv_connection_0_0= ruleConnectionStatement )
            // InternalMyDsl.g:118:5: lv_connection_0_0= ruleConnectionStatement
            {

            					newCompositeNode(grammarAccess.getModelAccess().getConnectionConnectionStatementParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
            lv_connection_0_0=ruleConnectionStatement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"connection",
            						lv_connection_0_0,
            						"org.xtext.example.mydsl.MyDsl.ConnectionStatement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:135:3: ( (lv_statements_1_0= ruleCRUDOperationAndCollectionSchema ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==17) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:136:4: (lv_statements_1_0= ruleCRUDOperationAndCollectionSchema )
            	    {
            	    // InternalMyDsl.g:136:4: (lv_statements_1_0= ruleCRUDOperationAndCollectionSchema )
            	    // InternalMyDsl.g:137:5: lv_statements_1_0= ruleCRUDOperationAndCollectionSchema
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getStatementsCRUDOperationAndCollectionSchemaParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_statements_1_0=ruleCRUDOperationAndCollectionSchema();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statements",
            	    						lv_statements_1_0,
            	    						"org.xtext.example.mydsl.MyDsl.CRUDOperationAndCollectionSchema");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleCRUDOperationAndCollectionSchema"
    // InternalMyDsl.g:158:1: entryRuleCRUDOperationAndCollectionSchema returns [EObject current=null] : iv_ruleCRUDOperationAndCollectionSchema= ruleCRUDOperationAndCollectionSchema EOF ;
    public final EObject entryRuleCRUDOperationAndCollectionSchema() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCRUDOperationAndCollectionSchema = null;


        try {
            // InternalMyDsl.g:158:73: (iv_ruleCRUDOperationAndCollectionSchema= ruleCRUDOperationAndCollectionSchema EOF )
            // InternalMyDsl.g:159:2: iv_ruleCRUDOperationAndCollectionSchema= ruleCRUDOperationAndCollectionSchema EOF
            {
             newCompositeNode(grammarAccess.getCRUDOperationAndCollectionSchemaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCRUDOperationAndCollectionSchema=ruleCRUDOperationAndCollectionSchema();

            state._fsp--;

             current =iv_ruleCRUDOperationAndCollectionSchema; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCRUDOperationAndCollectionSchema"


    // $ANTLR start "ruleCRUDOperationAndCollectionSchema"
    // InternalMyDsl.g:165:1: ruleCRUDOperationAndCollectionSchema returns [EObject current=null] : ( ( (lv_schema_0_0= ruleCollectionSchema ) ) ( (lv_operations_1_0= ruleCRUDOperations ) )* ) ;
    public final EObject ruleCRUDOperationAndCollectionSchema() throws RecognitionException {
        EObject current = null;

        EObject lv_schema_0_0 = null;

        EObject lv_operations_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:171:2: ( ( ( (lv_schema_0_0= ruleCollectionSchema ) ) ( (lv_operations_1_0= ruleCRUDOperations ) )* ) )
            // InternalMyDsl.g:172:2: ( ( (lv_schema_0_0= ruleCollectionSchema ) ) ( (lv_operations_1_0= ruleCRUDOperations ) )* )
            {
            // InternalMyDsl.g:172:2: ( ( (lv_schema_0_0= ruleCollectionSchema ) ) ( (lv_operations_1_0= ruleCRUDOperations ) )* )
            // InternalMyDsl.g:173:3: ( (lv_schema_0_0= ruleCollectionSchema ) ) ( (lv_operations_1_0= ruleCRUDOperations ) )*
            {
            // InternalMyDsl.g:173:3: ( (lv_schema_0_0= ruleCollectionSchema ) )
            // InternalMyDsl.g:174:4: (lv_schema_0_0= ruleCollectionSchema )
            {
            // InternalMyDsl.g:174:4: (lv_schema_0_0= ruleCollectionSchema )
            // InternalMyDsl.g:175:5: lv_schema_0_0= ruleCollectionSchema
            {

            					newCompositeNode(grammarAccess.getCRUDOperationAndCollectionSchemaAccess().getSchemaCollectionSchemaParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_5);
            lv_schema_0_0=ruleCollectionSchema();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCRUDOperationAndCollectionSchemaRule());
            					}
            					set(
            						current,
            						"schema",
            						lv_schema_0_0,
            						"org.xtext.example.mydsl.MyDsl.CollectionSchema");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:192:3: ( (lv_operations_1_0= ruleCRUDOperations ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==22) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:193:4: (lv_operations_1_0= ruleCRUDOperations )
            	    {
            	    // InternalMyDsl.g:193:4: (lv_operations_1_0= ruleCRUDOperations )
            	    // InternalMyDsl.g:194:5: lv_operations_1_0= ruleCRUDOperations
            	    {

            	    					newCompositeNode(grammarAccess.getCRUDOperationAndCollectionSchemaAccess().getOperationsCRUDOperationsParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_operations_1_0=ruleCRUDOperations();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCRUDOperationAndCollectionSchemaRule());
            	    					}
            	    					add(
            	    						current,
            	    						"operations",
            	    						lv_operations_1_0,
            	    						"org.xtext.example.mydsl.MyDsl.CRUDOperations");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCRUDOperationAndCollectionSchema"


    // $ANTLR start "entryRuleConnectionStatement"
    // InternalMyDsl.g:215:1: entryRuleConnectionStatement returns [EObject current=null] : iv_ruleConnectionStatement= ruleConnectionStatement EOF ;
    public final EObject entryRuleConnectionStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnectionStatement = null;


        try {
            // InternalMyDsl.g:215:60: (iv_ruleConnectionStatement= ruleConnectionStatement EOF )
            // InternalMyDsl.g:216:2: iv_ruleConnectionStatement= ruleConnectionStatement EOF
            {
             newCompositeNode(grammarAccess.getConnectionStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConnectionStatement=ruleConnectionStatement();

            state._fsp--;

             current =iv_ruleConnectionStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConnectionStatement"


    // $ANTLR start "ruleConnectionStatement"
    // InternalMyDsl.g:222:1: ruleConnectionStatement returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'DatabaseParameters' otherlv_2= '{' otherlv_3= 'Connection' ( (lv_connectionString_4_0= RULE_STRING ) ) otherlv_5= ',' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'databaseName' ( (lv_databaseName_7_0= RULE_STRING ) ) otherlv_8= '}' ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleConnectionStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_connectionString_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_databaseName_7_0=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalMyDsl.g:228:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'DatabaseParameters' otherlv_2= '{' otherlv_3= 'Connection' ( (lv_connectionString_4_0= RULE_STRING ) ) otherlv_5= ',' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'databaseName' ( (lv_databaseName_7_0= RULE_STRING ) ) otherlv_8= '}' ) ) ) ) )+ {...}?) ) ) )
            // InternalMyDsl.g:229:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'DatabaseParameters' otherlv_2= '{' otherlv_3= 'Connection' ( (lv_connectionString_4_0= RULE_STRING ) ) otherlv_5= ',' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'databaseName' ( (lv_databaseName_7_0= RULE_STRING ) ) otherlv_8= '}' ) ) ) ) )+ {...}?) ) )
            {
            // InternalMyDsl.g:229:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'DatabaseParameters' otherlv_2= '{' otherlv_3= 'Connection' ( (lv_connectionString_4_0= RULE_STRING ) ) otherlv_5= ',' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'databaseName' ( (lv_databaseName_7_0= RULE_STRING ) ) otherlv_8= '}' ) ) ) ) )+ {...}?) ) )
            // InternalMyDsl.g:230:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'DatabaseParameters' otherlv_2= '{' otherlv_3= 'Connection' ( (lv_connectionString_4_0= RULE_STRING ) ) otherlv_5= ',' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'databaseName' ( (lv_databaseName_7_0= RULE_STRING ) ) otherlv_8= '}' ) ) ) ) )+ {...}?) )
            {
            // InternalMyDsl.g:230:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'DatabaseParameters' otherlv_2= '{' otherlv_3= 'Connection' ( (lv_connectionString_4_0= RULE_STRING ) ) otherlv_5= ',' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'databaseName' ( (lv_databaseName_7_0= RULE_STRING ) ) otherlv_8= '}' ) ) ) ) )+ {...}?) )
            // InternalMyDsl.g:231:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'DatabaseParameters' otherlv_2= '{' otherlv_3= 'Connection' ( (lv_connectionString_4_0= RULE_STRING ) ) otherlv_5= ',' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'databaseName' ( (lv_databaseName_7_0= RULE_STRING ) ) otherlv_8= '}' ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getConnectionStatementAccess().getUnorderedGroup());
            			
            // InternalMyDsl.g:234:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'DatabaseParameters' otherlv_2= '{' otherlv_3= 'Connection' ( (lv_connectionString_4_0= RULE_STRING ) ) otherlv_5= ',' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'databaseName' ( (lv_databaseName_7_0= RULE_STRING ) ) otherlv_8= '}' ) ) ) ) )+ {...}?)
            // InternalMyDsl.g:235:5: ( ({...}? => ( ({...}? => (otherlv_1= 'DatabaseParameters' otherlv_2= '{' otherlv_3= 'Connection' ( (lv_connectionString_4_0= RULE_STRING ) ) otherlv_5= ',' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'databaseName' ( (lv_databaseName_7_0= RULE_STRING ) ) otherlv_8= '}' ) ) ) ) )+ {...}?
            {
            // InternalMyDsl.g:235:5: ( ({...}? => ( ({...}? => (otherlv_1= 'DatabaseParameters' otherlv_2= '{' otherlv_3= 'Connection' ( (lv_connectionString_4_0= RULE_STRING ) ) otherlv_5= ',' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'databaseName' ( (lv_databaseName_7_0= RULE_STRING ) ) otherlv_8= '}' ) ) ) ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=3;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==11) ) {
                    int LA4_2 = input.LA(2);

                    if ( getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionStatementAccess().getUnorderedGroup(), 0) ) {
                        alt4=1;
                    }


                }
                else if ( (LA4_0==15) ) {
                    int LA4_3 = input.LA(2);

                    if ( getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionStatementAccess().getUnorderedGroup(), 1) ) {
                        alt4=2;
                    }


                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:236:3: ({...}? => ( ({...}? => (otherlv_1= 'DatabaseParameters' otherlv_2= '{' otherlv_3= 'Connection' ( (lv_connectionString_4_0= RULE_STRING ) ) otherlv_5= ',' ) ) ) )
            	    {
            	    // InternalMyDsl.g:236:3: ({...}? => ( ({...}? => (otherlv_1= 'DatabaseParameters' otherlv_2= '{' otherlv_3= 'Connection' ( (lv_connectionString_4_0= RULE_STRING ) ) otherlv_5= ',' ) ) ) )
            	    // InternalMyDsl.g:237:4: {...}? => ( ({...}? => (otherlv_1= 'DatabaseParameters' otherlv_2= '{' otherlv_3= 'Connection' ( (lv_connectionString_4_0= RULE_STRING ) ) otherlv_5= ',' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionStatementAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleConnectionStatement", "getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionStatementAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalMyDsl.g:237:113: ( ({...}? => (otherlv_1= 'DatabaseParameters' otherlv_2= '{' otherlv_3= 'Connection' ( (lv_connectionString_4_0= RULE_STRING ) ) otherlv_5= ',' ) ) )
            	    // InternalMyDsl.g:238:5: ({...}? => (otherlv_1= 'DatabaseParameters' otherlv_2= '{' otherlv_3= 'Connection' ( (lv_connectionString_4_0= RULE_STRING ) ) otherlv_5= ',' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getConnectionStatementAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalMyDsl.g:241:8: ({...}? => (otherlv_1= 'DatabaseParameters' otherlv_2= '{' otherlv_3= 'Connection' ( (lv_connectionString_4_0= RULE_STRING ) ) otherlv_5= ',' ) )
            	    // InternalMyDsl.g:241:9: {...}? => (otherlv_1= 'DatabaseParameters' otherlv_2= '{' otherlv_3= 'Connection' ( (lv_connectionString_4_0= RULE_STRING ) ) otherlv_5= ',' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleConnectionStatement", "true");
            	    }
            	    // InternalMyDsl.g:241:18: (otherlv_1= 'DatabaseParameters' otherlv_2= '{' otherlv_3= 'Connection' ( (lv_connectionString_4_0= RULE_STRING ) ) otherlv_5= ',' )
            	    // InternalMyDsl.g:241:19: otherlv_1= 'DatabaseParameters' otherlv_2= '{' otherlv_3= 'Connection' ( (lv_connectionString_4_0= RULE_STRING ) ) otherlv_5= ','
            	    {
            	    otherlv_1=(Token)match(input,11,FOLLOW_6); 

            	    								newLeafNode(otherlv_1, grammarAccess.getConnectionStatementAccess().getDatabaseParametersKeyword_0_0());
            	    							
            	    otherlv_2=(Token)match(input,12,FOLLOW_7); 

            	    								newLeafNode(otherlv_2, grammarAccess.getConnectionStatementAccess().getLeftCurlyBracketKeyword_0_1());
            	    							
            	    otherlv_3=(Token)match(input,13,FOLLOW_8); 

            	    								newLeafNode(otherlv_3, grammarAccess.getConnectionStatementAccess().getConnectionKeyword_0_2());
            	    							
            	    // InternalMyDsl.g:253:8: ( (lv_connectionString_4_0= RULE_STRING ) )
            	    // InternalMyDsl.g:254:9: (lv_connectionString_4_0= RULE_STRING )
            	    {
            	    // InternalMyDsl.g:254:9: (lv_connectionString_4_0= RULE_STRING )
            	    // InternalMyDsl.g:255:10: lv_connectionString_4_0= RULE_STRING
            	    {
            	    lv_connectionString_4_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

            	    										newLeafNode(lv_connectionString_4_0, grammarAccess.getConnectionStatementAccess().getConnectionStringSTRINGTerminalRuleCall_0_3_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getConnectionStatementRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"connectionString",
            	    											lv_connectionString_4_0,
            	    											"org.eclipse.xtext.common.Terminals.STRING");
            	    									

            	    }


            	    }

            	    otherlv_5=(Token)match(input,14,FOLLOW_3); 

            	    								newLeafNode(otherlv_5, grammarAccess.getConnectionStatementAccess().getCommaKeyword_0_4());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getConnectionStatementAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMyDsl.g:281:3: ({...}? => ( ({...}? => (otherlv_6= 'databaseName' ( (lv_databaseName_7_0= RULE_STRING ) ) otherlv_8= '}' ) ) ) )
            	    {
            	    // InternalMyDsl.g:281:3: ({...}? => ( ({...}? => (otherlv_6= 'databaseName' ( (lv_databaseName_7_0= RULE_STRING ) ) otherlv_8= '}' ) ) ) )
            	    // InternalMyDsl.g:282:4: {...}? => ( ({...}? => (otherlv_6= 'databaseName' ( (lv_databaseName_7_0= RULE_STRING ) ) otherlv_8= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionStatementAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleConnectionStatement", "getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionStatementAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalMyDsl.g:282:113: ( ({...}? => (otherlv_6= 'databaseName' ( (lv_databaseName_7_0= RULE_STRING ) ) otherlv_8= '}' ) ) )
            	    // InternalMyDsl.g:283:5: ({...}? => (otherlv_6= 'databaseName' ( (lv_databaseName_7_0= RULE_STRING ) ) otherlv_8= '}' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getConnectionStatementAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalMyDsl.g:286:8: ({...}? => (otherlv_6= 'databaseName' ( (lv_databaseName_7_0= RULE_STRING ) ) otherlv_8= '}' ) )
            	    // InternalMyDsl.g:286:9: {...}? => (otherlv_6= 'databaseName' ( (lv_databaseName_7_0= RULE_STRING ) ) otherlv_8= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleConnectionStatement", "true");
            	    }
            	    // InternalMyDsl.g:286:18: (otherlv_6= 'databaseName' ( (lv_databaseName_7_0= RULE_STRING ) ) otherlv_8= '}' )
            	    // InternalMyDsl.g:286:19: otherlv_6= 'databaseName' ( (lv_databaseName_7_0= RULE_STRING ) ) otherlv_8= '}'
            	    {
            	    otherlv_6=(Token)match(input,15,FOLLOW_8); 

            	    								newLeafNode(otherlv_6, grammarAccess.getConnectionStatementAccess().getDatabaseNameKeyword_1_0());
            	    							
            	    // InternalMyDsl.g:290:8: ( (lv_databaseName_7_0= RULE_STRING ) )
            	    // InternalMyDsl.g:291:9: (lv_databaseName_7_0= RULE_STRING )
            	    {
            	    // InternalMyDsl.g:291:9: (lv_databaseName_7_0= RULE_STRING )
            	    // InternalMyDsl.g:292:10: lv_databaseName_7_0= RULE_STRING
            	    {
            	    lv_databaseName_7_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            	    										newLeafNode(lv_databaseName_7_0, grammarAccess.getConnectionStatementAccess().getDatabaseNameSTRINGTerminalRuleCall_1_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getConnectionStatementRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"databaseName",
            	    											lv_databaseName_7_0,
            	    											"org.eclipse.xtext.common.Terminals.STRING");
            	    									

            	    }


            	    }

            	    otherlv_8=(Token)match(input,16,FOLLOW_3); 

            	    								newLeafNode(otherlv_8, grammarAccess.getConnectionStatementAccess().getRightCurlyBracketKeyword_1_2());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getConnectionStatementAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getConnectionStatementAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "ruleConnectionStatement", "getUnorderedGroupHelper().canLeave(grammarAccess.getConnectionStatementAccess().getUnorderedGroup())");
            }

            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getConnectionStatementAccess().getUnorderedGroup());
            			

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConnectionStatement"


    // $ANTLR start "entryRuleCollectionSchema"
    // InternalMyDsl.g:329:1: entryRuleCollectionSchema returns [EObject current=null] : iv_ruleCollectionSchema= ruleCollectionSchema EOF ;
    public final EObject entryRuleCollectionSchema() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionSchema = null;


        try {
            // InternalMyDsl.g:329:57: (iv_ruleCollectionSchema= ruleCollectionSchema EOF )
            // InternalMyDsl.g:330:2: iv_ruleCollectionSchema= ruleCollectionSchema EOF
            {
             newCompositeNode(grammarAccess.getCollectionSchemaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCollectionSchema=ruleCollectionSchema();

            state._fsp--;

             current =iv_ruleCollectionSchema; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCollectionSchema"


    // $ANTLR start "ruleCollectionSchema"
    // InternalMyDsl.g:336:1: ruleCollectionSchema returns [EObject current=null] : (otherlv_0= 'Collection' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_defination_3_0= ruleCollectionFieldDefination ) ) (otherlv_4= ',' ( (lv_defination_5_0= ruleCollectionFieldDefination ) ) )* )? otherlv_6= '}' ) ;
    public final EObject ruleCollectionSchema() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_defination_3_0 = null;

        EObject lv_defination_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:342:2: ( (otherlv_0= 'Collection' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_defination_3_0= ruleCollectionFieldDefination ) ) (otherlv_4= ',' ( (lv_defination_5_0= ruleCollectionFieldDefination ) ) )* )? otherlv_6= '}' ) )
            // InternalMyDsl.g:343:2: (otherlv_0= 'Collection' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_defination_3_0= ruleCollectionFieldDefination ) ) (otherlv_4= ',' ( (lv_defination_5_0= ruleCollectionFieldDefination ) ) )* )? otherlv_6= '}' )
            {
            // InternalMyDsl.g:343:2: (otherlv_0= 'Collection' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_defination_3_0= ruleCollectionFieldDefination ) ) (otherlv_4= ',' ( (lv_defination_5_0= ruleCollectionFieldDefination ) ) )* )? otherlv_6= '}' )
            // InternalMyDsl.g:344:3: otherlv_0= 'Collection' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_defination_3_0= ruleCollectionFieldDefination ) ) (otherlv_4= ',' ( (lv_defination_5_0= ruleCollectionFieldDefination ) ) )* )? otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getCollectionSchemaAccess().getCollectionKeyword_0());
            		
            // InternalMyDsl.g:348:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:349:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:349:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:350:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getCollectionSchemaAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCollectionSchemaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getCollectionSchemaAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:370:3: ( ( (lv_defination_3_0= ruleCollectionFieldDefination ) ) (otherlv_4= ',' ( (lv_defination_5_0= ruleCollectionFieldDefination ) ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:371:4: ( (lv_defination_3_0= ruleCollectionFieldDefination ) ) (otherlv_4= ',' ( (lv_defination_5_0= ruleCollectionFieldDefination ) ) )*
                    {
                    // InternalMyDsl.g:371:4: ( (lv_defination_3_0= ruleCollectionFieldDefination ) )
                    // InternalMyDsl.g:372:5: (lv_defination_3_0= ruleCollectionFieldDefination )
                    {
                    // InternalMyDsl.g:372:5: (lv_defination_3_0= ruleCollectionFieldDefination )
                    // InternalMyDsl.g:373:6: lv_defination_3_0= ruleCollectionFieldDefination
                    {

                    						newCompositeNode(grammarAccess.getCollectionSchemaAccess().getDefinationCollectionFieldDefinationParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_defination_3_0=ruleCollectionFieldDefination();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCollectionSchemaRule());
                    						}
                    						add(
                    							current,
                    							"defination",
                    							lv_defination_3_0,
                    							"org.xtext.example.mydsl.MyDsl.CollectionFieldDefination");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:390:4: (otherlv_4= ',' ( (lv_defination_5_0= ruleCollectionFieldDefination ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==14) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalMyDsl.g:391:5: otherlv_4= ',' ( (lv_defination_5_0= ruleCollectionFieldDefination ) )
                    	    {
                    	    otherlv_4=(Token)match(input,14,FOLLOW_11); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getCollectionSchemaAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalMyDsl.g:395:5: ( (lv_defination_5_0= ruleCollectionFieldDefination ) )
                    	    // InternalMyDsl.g:396:6: (lv_defination_5_0= ruleCollectionFieldDefination )
                    	    {
                    	    // InternalMyDsl.g:396:6: (lv_defination_5_0= ruleCollectionFieldDefination )
                    	    // InternalMyDsl.g:397:7: lv_defination_5_0= ruleCollectionFieldDefination
                    	    {

                    	    							newCompositeNode(grammarAccess.getCollectionSchemaAccess().getDefinationCollectionFieldDefinationParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    lv_defination_5_0=ruleCollectionFieldDefination();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCollectionSchemaRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"defination",
                    	    								lv_defination_5_0,
                    	    								"org.xtext.example.mydsl.MyDsl.CollectionFieldDefination");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getCollectionSchemaAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCollectionSchema"


    // $ANTLR start "entryRuleCollectionFieldDefination"
    // InternalMyDsl.g:424:1: entryRuleCollectionFieldDefination returns [EObject current=null] : iv_ruleCollectionFieldDefination= ruleCollectionFieldDefination EOF ;
    public final EObject entryRuleCollectionFieldDefination() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionFieldDefination = null;


        try {
            // InternalMyDsl.g:424:66: (iv_ruleCollectionFieldDefination= ruleCollectionFieldDefination EOF )
            // InternalMyDsl.g:425:2: iv_ruleCollectionFieldDefination= ruleCollectionFieldDefination EOF
            {
             newCompositeNode(grammarAccess.getCollectionFieldDefinationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCollectionFieldDefination=ruleCollectionFieldDefination();

            state._fsp--;

             current =iv_ruleCollectionFieldDefination; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCollectionFieldDefination"


    // $ANTLR start "ruleCollectionFieldDefination"
    // InternalMyDsl.g:431:1: ruleCollectionFieldDefination returns [EObject current=null] : ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_fieldType_2_0= ruleFieldType ) ) ( (lv_status_3_0= 'required' ) )? ( (lv_uniqueKey_4_0= 'unique' ) )? ) | ( ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ':' otherlv_7= 'ref' ( (otherlv_8= RULE_ID ) ) ) ) ;
    public final EObject ruleCollectionFieldDefination() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_status_3_0=null;
        Token lv_uniqueKey_4_0=null;
        Token lv_name_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Enumerator lv_fieldType_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:437:2: ( ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_fieldType_2_0= ruleFieldType ) ) ( (lv_status_3_0= 'required' ) )? ( (lv_uniqueKey_4_0= 'unique' ) )? ) | ( ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ':' otherlv_7= 'ref' ( (otherlv_8= RULE_ID ) ) ) ) )
            // InternalMyDsl.g:438:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_fieldType_2_0= ruleFieldType ) ) ( (lv_status_3_0= 'required' ) )? ( (lv_uniqueKey_4_0= 'unique' ) )? ) | ( ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ':' otherlv_7= 'ref' ( (otherlv_8= RULE_ID ) ) ) )
            {
            // InternalMyDsl.g:438:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_fieldType_2_0= ruleFieldType ) ) ( (lv_status_3_0= 'required' ) )? ( (lv_uniqueKey_4_0= 'unique' ) )? ) | ( ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ':' otherlv_7= 'ref' ( (otherlv_8= RULE_ID ) ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==18) ) {
                    int LA9_2 = input.LA(3);

                    if ( ((LA9_2>=32 && LA9_2<=35)) ) {
                        alt9=1;
                    }
                    else if ( (LA9_2==21) ) {
                        alt9=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:439:3: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_fieldType_2_0= ruleFieldType ) ) ( (lv_status_3_0= 'required' ) )? ( (lv_uniqueKey_4_0= 'unique' ) )? )
                    {
                    // InternalMyDsl.g:439:3: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_fieldType_2_0= ruleFieldType ) ) ( (lv_status_3_0= 'required' ) )? ( (lv_uniqueKey_4_0= 'unique' ) )? )
                    // InternalMyDsl.g:440:4: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_fieldType_2_0= ruleFieldType ) ) ( (lv_status_3_0= 'required' ) )? ( (lv_uniqueKey_4_0= 'unique' ) )?
                    {
                    // InternalMyDsl.g:440:4: ( (lv_name_0_0= RULE_ID ) )
                    // InternalMyDsl.g:441:5: (lv_name_0_0= RULE_ID )
                    {
                    // InternalMyDsl.g:441:5: (lv_name_0_0= RULE_ID )
                    // InternalMyDsl.g:442:6: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_14); 

                    						newLeafNode(lv_name_0_0, grammarAccess.getCollectionFieldDefinationAccess().getNameIDTerminalRuleCall_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCollectionFieldDefinationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_0_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,18,FOLLOW_15); 

                    				newLeafNode(otherlv_1, grammarAccess.getCollectionFieldDefinationAccess().getColonKeyword_0_1());
                    			
                    // InternalMyDsl.g:462:4: ( (lv_fieldType_2_0= ruleFieldType ) )
                    // InternalMyDsl.g:463:5: (lv_fieldType_2_0= ruleFieldType )
                    {
                    // InternalMyDsl.g:463:5: (lv_fieldType_2_0= ruleFieldType )
                    // InternalMyDsl.g:464:6: lv_fieldType_2_0= ruleFieldType
                    {

                    						newCompositeNode(grammarAccess.getCollectionFieldDefinationAccess().getFieldTypeFieldTypeEnumRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_fieldType_2_0=ruleFieldType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCollectionFieldDefinationRule());
                    						}
                    						set(
                    							current,
                    							"fieldType",
                    							lv_fieldType_2_0,
                    							"org.xtext.example.mydsl.MyDsl.FieldType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:481:4: ( (lv_status_3_0= 'required' ) )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==19) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalMyDsl.g:482:5: (lv_status_3_0= 'required' )
                            {
                            // InternalMyDsl.g:482:5: (lv_status_3_0= 'required' )
                            // InternalMyDsl.g:483:6: lv_status_3_0= 'required'
                            {
                            lv_status_3_0=(Token)match(input,19,FOLLOW_17); 

                            						newLeafNode(lv_status_3_0, grammarAccess.getCollectionFieldDefinationAccess().getStatusRequiredKeyword_0_3_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getCollectionFieldDefinationRule());
                            						}
                            						setWithLastConsumed(current, "status", lv_status_3_0 != null, "required");
                            					

                            }


                            }
                            break;

                    }

                    // InternalMyDsl.g:495:4: ( (lv_uniqueKey_4_0= 'unique' ) )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==20) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalMyDsl.g:496:5: (lv_uniqueKey_4_0= 'unique' )
                            {
                            // InternalMyDsl.g:496:5: (lv_uniqueKey_4_0= 'unique' )
                            // InternalMyDsl.g:497:6: lv_uniqueKey_4_0= 'unique'
                            {
                            lv_uniqueKey_4_0=(Token)match(input,20,FOLLOW_2); 

                            						newLeafNode(lv_uniqueKey_4_0, grammarAccess.getCollectionFieldDefinationAccess().getUniqueKeyUniqueKeyword_0_4_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getCollectionFieldDefinationRule());
                            						}
                            						setWithLastConsumed(current, "uniqueKey", lv_uniqueKey_4_0 != null, "unique");
                            					

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:511:3: ( ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ':' otherlv_7= 'ref' ( (otherlv_8= RULE_ID ) ) )
                    {
                    // InternalMyDsl.g:511:3: ( ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ':' otherlv_7= 'ref' ( (otherlv_8= RULE_ID ) ) )
                    // InternalMyDsl.g:512:4: ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ':' otherlv_7= 'ref' ( (otherlv_8= RULE_ID ) )
                    {
                    // InternalMyDsl.g:512:4: ( (lv_name_5_0= RULE_ID ) )
                    // InternalMyDsl.g:513:5: (lv_name_5_0= RULE_ID )
                    {
                    // InternalMyDsl.g:513:5: (lv_name_5_0= RULE_ID )
                    // InternalMyDsl.g:514:6: lv_name_5_0= RULE_ID
                    {
                    lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_14); 

                    						newLeafNode(lv_name_5_0, grammarAccess.getCollectionFieldDefinationAccess().getNameIDTerminalRuleCall_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCollectionFieldDefinationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_5_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,18,FOLLOW_18); 

                    				newLeafNode(otherlv_6, grammarAccess.getCollectionFieldDefinationAccess().getColonKeyword_1_1());
                    			
                    otherlv_7=(Token)match(input,21,FOLLOW_11); 

                    				newLeafNode(otherlv_7, grammarAccess.getCollectionFieldDefinationAccess().getRefKeyword_1_2());
                    			
                    // InternalMyDsl.g:538:4: ( (otherlv_8= RULE_ID ) )
                    // InternalMyDsl.g:539:5: (otherlv_8= RULE_ID )
                    {
                    // InternalMyDsl.g:539:5: (otherlv_8= RULE_ID )
                    // InternalMyDsl.g:540:6: otherlv_8= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCollectionFieldDefinationRule());
                    						}
                    					
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_8, grammarAccess.getCollectionFieldDefinationAccess().getRefCollectionCollectionSchemaCrossReference_1_3_0());
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCollectionFieldDefination"


    // $ANTLR start "entryRuleCRUDOperations"
    // InternalMyDsl.g:556:1: entryRuleCRUDOperations returns [EObject current=null] : iv_ruleCRUDOperations= ruleCRUDOperations EOF ;
    public final EObject entryRuleCRUDOperations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCRUDOperations = null;


        try {
            // InternalMyDsl.g:556:55: (iv_ruleCRUDOperations= ruleCRUDOperations EOF )
            // InternalMyDsl.g:557:2: iv_ruleCRUDOperations= ruleCRUDOperations EOF
            {
             newCompositeNode(grammarAccess.getCRUDOperationsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCRUDOperations=ruleCRUDOperations();

            state._fsp--;

             current =iv_ruleCRUDOperations; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCRUDOperations"


    // $ANTLR start "ruleCRUDOperations"
    // InternalMyDsl.g:563:1: ruleCRUDOperations returns [EObject current=null] : ( (otherlv_0= 'task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' (otherlv_3= '{' otherlv_4= 'operation:' ( (lv_type_5_0= ruleOperation ) ) otherlv_6= ',' otherlv_7= 'collection:' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'input:' otherlv_10= '{' ( ( (lv_entries_11_0= ruleCollectionEntry ) ) (otherlv_12= ',' ( (lv_entries_13_0= ruleCollectionEntry ) ) )* )? otherlv_14= '}' otherlv_15= '}' ) ) | (otherlv_16= 'task' ( (lv_name_17_0= RULE_ID ) ) otherlv_18= ':' (otherlv_19= '{' otherlv_20= 'operation:' ( (lv_updateOperation_21_0= 'UPDATE' ) ) otherlv_22= 'collection:' ( (otherlv_23= RULE_ID ) ) otherlv_24= 'input:' otherlv_25= '{' ( (lv_criteria_26_0= ruleCollectionEntry ) ) (otherlv_27= ',' ( (lv_criteria_28_0= ruleCollectionEntry ) ) )* otherlv_29= '},' otherlv_30= 'update:' otherlv_31= '{' ( (lv_entries_32_0= ruleCollectionEntry ) ) (otherlv_33= ',' ( (lv_entries_34_0= ruleCollectionEntry ) ) )* otherlv_35= '}' otherlv_36= '}' ) ) ) ;
    public final EObject ruleCRUDOperations() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token lv_name_17_0=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token lv_updateOperation_21_0=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token otherlv_35=null;
        Token otherlv_36=null;
        Enumerator lv_type_5_0 = null;

        EObject lv_entries_11_0 = null;

        EObject lv_entries_13_0 = null;

        EObject lv_criteria_26_0 = null;

        EObject lv_criteria_28_0 = null;

        EObject lv_entries_32_0 = null;

        EObject lv_entries_34_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:569:2: ( ( (otherlv_0= 'task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' (otherlv_3= '{' otherlv_4= 'operation:' ( (lv_type_5_0= ruleOperation ) ) otherlv_6= ',' otherlv_7= 'collection:' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'input:' otherlv_10= '{' ( ( (lv_entries_11_0= ruleCollectionEntry ) ) (otherlv_12= ',' ( (lv_entries_13_0= ruleCollectionEntry ) ) )* )? otherlv_14= '}' otherlv_15= '}' ) ) | (otherlv_16= 'task' ( (lv_name_17_0= RULE_ID ) ) otherlv_18= ':' (otherlv_19= '{' otherlv_20= 'operation:' ( (lv_updateOperation_21_0= 'UPDATE' ) ) otherlv_22= 'collection:' ( (otherlv_23= RULE_ID ) ) otherlv_24= 'input:' otherlv_25= '{' ( (lv_criteria_26_0= ruleCollectionEntry ) ) (otherlv_27= ',' ( (lv_criteria_28_0= ruleCollectionEntry ) ) )* otherlv_29= '},' otherlv_30= 'update:' otherlv_31= '{' ( (lv_entries_32_0= ruleCollectionEntry ) ) (otherlv_33= ',' ( (lv_entries_34_0= ruleCollectionEntry ) ) )* otherlv_35= '}' otherlv_36= '}' ) ) ) )
            // InternalMyDsl.g:570:2: ( (otherlv_0= 'task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' (otherlv_3= '{' otherlv_4= 'operation:' ( (lv_type_5_0= ruleOperation ) ) otherlv_6= ',' otherlv_7= 'collection:' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'input:' otherlv_10= '{' ( ( (lv_entries_11_0= ruleCollectionEntry ) ) (otherlv_12= ',' ( (lv_entries_13_0= ruleCollectionEntry ) ) )* )? otherlv_14= '}' otherlv_15= '}' ) ) | (otherlv_16= 'task' ( (lv_name_17_0= RULE_ID ) ) otherlv_18= ':' (otherlv_19= '{' otherlv_20= 'operation:' ( (lv_updateOperation_21_0= 'UPDATE' ) ) otherlv_22= 'collection:' ( (otherlv_23= RULE_ID ) ) otherlv_24= 'input:' otherlv_25= '{' ( (lv_criteria_26_0= ruleCollectionEntry ) ) (otherlv_27= ',' ( (lv_criteria_28_0= ruleCollectionEntry ) ) )* otherlv_29= '},' otherlv_30= 'update:' otherlv_31= '{' ( (lv_entries_32_0= ruleCollectionEntry ) ) (otherlv_33= ',' ( (lv_entries_34_0= ruleCollectionEntry ) ) )* otherlv_35= '}' otherlv_36= '}' ) ) )
            {
            // InternalMyDsl.g:570:2: ( (otherlv_0= 'task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' (otherlv_3= '{' otherlv_4= 'operation:' ( (lv_type_5_0= ruleOperation ) ) otherlv_6= ',' otherlv_7= 'collection:' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'input:' otherlv_10= '{' ( ( (lv_entries_11_0= ruleCollectionEntry ) ) (otherlv_12= ',' ( (lv_entries_13_0= ruleCollectionEntry ) ) )* )? otherlv_14= '}' otherlv_15= '}' ) ) | (otherlv_16= 'task' ( (lv_name_17_0= RULE_ID ) ) otherlv_18= ':' (otherlv_19= '{' otherlv_20= 'operation:' ( (lv_updateOperation_21_0= 'UPDATE' ) ) otherlv_22= 'collection:' ( (otherlv_23= RULE_ID ) ) otherlv_24= 'input:' otherlv_25= '{' ( (lv_criteria_26_0= ruleCollectionEntry ) ) (otherlv_27= ',' ( (lv_criteria_28_0= ruleCollectionEntry ) ) )* otherlv_29= '},' otherlv_30= 'update:' otherlv_31= '{' ( (lv_entries_32_0= ruleCollectionEntry ) ) (otherlv_33= ',' ( (lv_entries_34_0= ruleCollectionEntry ) ) )* otherlv_35= '}' otherlv_36= '}' ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==22) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==RULE_ID) ) {
                    int LA14_2 = input.LA(3);

                    if ( (LA14_2==18) ) {
                        int LA14_3 = input.LA(4);

                        if ( (LA14_3==12) ) {
                            int LA14_4 = input.LA(5);

                            if ( (LA14_4==23) ) {
                                int LA14_5 = input.LA(6);

                                if ( (LA14_5==26) ) {
                                    alt14=2;
                                }
                                else if ( ((LA14_5>=29 && LA14_5<=31)) ) {
                                    alt14=1;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 14, 5, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 14, 4, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 14, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:571:3: (otherlv_0= 'task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' (otherlv_3= '{' otherlv_4= 'operation:' ( (lv_type_5_0= ruleOperation ) ) otherlv_6= ',' otherlv_7= 'collection:' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'input:' otherlv_10= '{' ( ( (lv_entries_11_0= ruleCollectionEntry ) ) (otherlv_12= ',' ( (lv_entries_13_0= ruleCollectionEntry ) ) )* )? otherlv_14= '}' otherlv_15= '}' ) )
                    {
                    // InternalMyDsl.g:571:3: (otherlv_0= 'task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' (otherlv_3= '{' otherlv_4= 'operation:' ( (lv_type_5_0= ruleOperation ) ) otherlv_6= ',' otherlv_7= 'collection:' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'input:' otherlv_10= '{' ( ( (lv_entries_11_0= ruleCollectionEntry ) ) (otherlv_12= ',' ( (lv_entries_13_0= ruleCollectionEntry ) ) )* )? otherlv_14= '}' otherlv_15= '}' ) )
                    // InternalMyDsl.g:572:4: otherlv_0= 'task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' (otherlv_3= '{' otherlv_4= 'operation:' ( (lv_type_5_0= ruleOperation ) ) otherlv_6= ',' otherlv_7= 'collection:' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'input:' otherlv_10= '{' ( ( (lv_entries_11_0= ruleCollectionEntry ) ) (otherlv_12= ',' ( (lv_entries_13_0= ruleCollectionEntry ) ) )* )? otherlv_14= '}' otherlv_15= '}' )
                    {
                    otherlv_0=(Token)match(input,22,FOLLOW_11); 

                    				newLeafNode(otherlv_0, grammarAccess.getCRUDOperationsAccess().getTaskKeyword_0_0());
                    			
                    // InternalMyDsl.g:576:4: ( (lv_name_1_0= RULE_ID ) )
                    // InternalMyDsl.g:577:5: (lv_name_1_0= RULE_ID )
                    {
                    // InternalMyDsl.g:577:5: (lv_name_1_0= RULE_ID )
                    // InternalMyDsl.g:578:6: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_14); 

                    						newLeafNode(lv_name_1_0, grammarAccess.getCRUDOperationsAccess().getNameIDTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCRUDOperationsRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_1_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,18,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getCRUDOperationsAccess().getColonKeyword_0_2());
                    			
                    // InternalMyDsl.g:598:4: (otherlv_3= '{' otherlv_4= 'operation:' ( (lv_type_5_0= ruleOperation ) ) otherlv_6= ',' otherlv_7= 'collection:' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'input:' otherlv_10= '{' ( ( (lv_entries_11_0= ruleCollectionEntry ) ) (otherlv_12= ',' ( (lv_entries_13_0= ruleCollectionEntry ) ) )* )? otherlv_14= '}' otherlv_15= '}' )
                    // InternalMyDsl.g:599:5: otherlv_3= '{' otherlv_4= 'operation:' ( (lv_type_5_0= ruleOperation ) ) otherlv_6= ',' otherlv_7= 'collection:' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'input:' otherlv_10= '{' ( ( (lv_entries_11_0= ruleCollectionEntry ) ) (otherlv_12= ',' ( (lv_entries_13_0= ruleCollectionEntry ) ) )* )? otherlv_14= '}' otherlv_15= '}'
                    {
                    otherlv_3=(Token)match(input,12,FOLLOW_19); 

                    					newLeafNode(otherlv_3, grammarAccess.getCRUDOperationsAccess().getLeftCurlyBracketKeyword_0_3_0());
                    				
                    otherlv_4=(Token)match(input,23,FOLLOW_20); 

                    					newLeafNode(otherlv_4, grammarAccess.getCRUDOperationsAccess().getOperationKeyword_0_3_1());
                    				
                    // InternalMyDsl.g:607:5: ( (lv_type_5_0= ruleOperation ) )
                    // InternalMyDsl.g:608:6: (lv_type_5_0= ruleOperation )
                    {
                    // InternalMyDsl.g:608:6: (lv_type_5_0= ruleOperation )
                    // InternalMyDsl.g:609:7: lv_type_5_0= ruleOperation
                    {

                    							newCompositeNode(grammarAccess.getCRUDOperationsAccess().getTypeOperationEnumRuleCall_0_3_2_0());
                    						
                    pushFollow(FOLLOW_9);
                    lv_type_5_0=ruleOperation();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getCRUDOperationsRule());
                    							}
                    							set(
                    								current,
                    								"type",
                    								lv_type_5_0,
                    								"org.xtext.example.mydsl.MyDsl.Operation");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_6=(Token)match(input,14,FOLLOW_21); 

                    					newLeafNode(otherlv_6, grammarAccess.getCRUDOperationsAccess().getCommaKeyword_0_3_3());
                    				
                    otherlv_7=(Token)match(input,24,FOLLOW_11); 

                    					newLeafNode(otherlv_7, grammarAccess.getCRUDOperationsAccess().getCollectionKeyword_0_3_4());
                    				
                    // InternalMyDsl.g:634:5: ( (otherlv_8= RULE_ID ) )
                    // InternalMyDsl.g:635:6: (otherlv_8= RULE_ID )
                    {
                    // InternalMyDsl.g:635:6: (otherlv_8= RULE_ID )
                    // InternalMyDsl.g:636:7: otherlv_8= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getCRUDOperationsRule());
                    							}
                    						
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_22); 

                    							newLeafNode(otherlv_8, grammarAccess.getCRUDOperationsAccess().getCollectionCollectionSchemaCrossReference_0_3_5_0());
                    						

                    }


                    }

                    otherlv_9=(Token)match(input,25,FOLLOW_6); 

                    					newLeafNode(otherlv_9, grammarAccess.getCRUDOperationsAccess().getInputKeyword_0_3_6());
                    				
                    otherlv_10=(Token)match(input,12,FOLLOW_12); 

                    					newLeafNode(otherlv_10, grammarAccess.getCRUDOperationsAccess().getLeftCurlyBracketKeyword_0_3_7());
                    				
                    // InternalMyDsl.g:655:5: ( ( (lv_entries_11_0= ruleCollectionEntry ) ) (otherlv_12= ',' ( (lv_entries_13_0= ruleCollectionEntry ) ) )* )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==RULE_ID) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalMyDsl.g:656:6: ( (lv_entries_11_0= ruleCollectionEntry ) ) (otherlv_12= ',' ( (lv_entries_13_0= ruleCollectionEntry ) ) )*
                            {
                            // InternalMyDsl.g:656:6: ( (lv_entries_11_0= ruleCollectionEntry ) )
                            // InternalMyDsl.g:657:7: (lv_entries_11_0= ruleCollectionEntry )
                            {
                            // InternalMyDsl.g:657:7: (lv_entries_11_0= ruleCollectionEntry )
                            // InternalMyDsl.g:658:8: lv_entries_11_0= ruleCollectionEntry
                            {

                            								newCompositeNode(grammarAccess.getCRUDOperationsAccess().getEntriesCollectionEntryParserRuleCall_0_3_8_0_0());
                            							
                            pushFollow(FOLLOW_13);
                            lv_entries_11_0=ruleCollectionEntry();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getCRUDOperationsRule());
                            								}
                            								add(
                            									current,
                            									"entries",
                            									lv_entries_11_0,
                            									"org.xtext.example.mydsl.MyDsl.CollectionEntry");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }

                            // InternalMyDsl.g:675:6: (otherlv_12= ',' ( (lv_entries_13_0= ruleCollectionEntry ) ) )*
                            loop10:
                            do {
                                int alt10=2;
                                int LA10_0 = input.LA(1);

                                if ( (LA10_0==14) ) {
                                    alt10=1;
                                }


                                switch (alt10) {
                            	case 1 :
                            	    // InternalMyDsl.g:676:7: otherlv_12= ',' ( (lv_entries_13_0= ruleCollectionEntry ) )
                            	    {
                            	    otherlv_12=(Token)match(input,14,FOLLOW_11); 

                            	    							newLeafNode(otherlv_12, grammarAccess.getCRUDOperationsAccess().getCommaKeyword_0_3_8_1_0());
                            	    						
                            	    // InternalMyDsl.g:680:7: ( (lv_entries_13_0= ruleCollectionEntry ) )
                            	    // InternalMyDsl.g:681:8: (lv_entries_13_0= ruleCollectionEntry )
                            	    {
                            	    // InternalMyDsl.g:681:8: (lv_entries_13_0= ruleCollectionEntry )
                            	    // InternalMyDsl.g:682:9: lv_entries_13_0= ruleCollectionEntry
                            	    {

                            	    									newCompositeNode(grammarAccess.getCRUDOperationsAccess().getEntriesCollectionEntryParserRuleCall_0_3_8_1_1_0());
                            	    								
                            	    pushFollow(FOLLOW_13);
                            	    lv_entries_13_0=ruleCollectionEntry();

                            	    state._fsp--;


                            	    									if (current==null) {
                            	    										current = createModelElementForParent(grammarAccess.getCRUDOperationsRule());
                            	    									}
                            	    									add(
                            	    										current,
                            	    										"entries",
                            	    										lv_entries_13_0,
                            	    										"org.xtext.example.mydsl.MyDsl.CollectionEntry");
                            	    									afterParserOrEnumRuleCall();
                            	    								

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop10;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_14=(Token)match(input,16,FOLLOW_10); 

                    					newLeafNode(otherlv_14, grammarAccess.getCRUDOperationsAccess().getRightCurlyBracketKeyword_0_3_9());
                    				
                    otherlv_15=(Token)match(input,16,FOLLOW_2); 

                    					newLeafNode(otherlv_15, grammarAccess.getCRUDOperationsAccess().getRightCurlyBracketKeyword_0_3_10());
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:712:3: (otherlv_16= 'task' ( (lv_name_17_0= RULE_ID ) ) otherlv_18= ':' (otherlv_19= '{' otherlv_20= 'operation:' ( (lv_updateOperation_21_0= 'UPDATE' ) ) otherlv_22= 'collection:' ( (otherlv_23= RULE_ID ) ) otherlv_24= 'input:' otherlv_25= '{' ( (lv_criteria_26_0= ruleCollectionEntry ) ) (otherlv_27= ',' ( (lv_criteria_28_0= ruleCollectionEntry ) ) )* otherlv_29= '},' otherlv_30= 'update:' otherlv_31= '{' ( (lv_entries_32_0= ruleCollectionEntry ) ) (otherlv_33= ',' ( (lv_entries_34_0= ruleCollectionEntry ) ) )* otherlv_35= '}' otherlv_36= '}' ) )
                    {
                    // InternalMyDsl.g:712:3: (otherlv_16= 'task' ( (lv_name_17_0= RULE_ID ) ) otherlv_18= ':' (otherlv_19= '{' otherlv_20= 'operation:' ( (lv_updateOperation_21_0= 'UPDATE' ) ) otherlv_22= 'collection:' ( (otherlv_23= RULE_ID ) ) otherlv_24= 'input:' otherlv_25= '{' ( (lv_criteria_26_0= ruleCollectionEntry ) ) (otherlv_27= ',' ( (lv_criteria_28_0= ruleCollectionEntry ) ) )* otherlv_29= '},' otherlv_30= 'update:' otherlv_31= '{' ( (lv_entries_32_0= ruleCollectionEntry ) ) (otherlv_33= ',' ( (lv_entries_34_0= ruleCollectionEntry ) ) )* otherlv_35= '}' otherlv_36= '}' ) )
                    // InternalMyDsl.g:713:4: otherlv_16= 'task' ( (lv_name_17_0= RULE_ID ) ) otherlv_18= ':' (otherlv_19= '{' otherlv_20= 'operation:' ( (lv_updateOperation_21_0= 'UPDATE' ) ) otherlv_22= 'collection:' ( (otherlv_23= RULE_ID ) ) otherlv_24= 'input:' otherlv_25= '{' ( (lv_criteria_26_0= ruleCollectionEntry ) ) (otherlv_27= ',' ( (lv_criteria_28_0= ruleCollectionEntry ) ) )* otherlv_29= '},' otherlv_30= 'update:' otherlv_31= '{' ( (lv_entries_32_0= ruleCollectionEntry ) ) (otherlv_33= ',' ( (lv_entries_34_0= ruleCollectionEntry ) ) )* otherlv_35= '}' otherlv_36= '}' )
                    {
                    otherlv_16=(Token)match(input,22,FOLLOW_11); 

                    				newLeafNode(otherlv_16, grammarAccess.getCRUDOperationsAccess().getTaskKeyword_1_0());
                    			
                    // InternalMyDsl.g:717:4: ( (lv_name_17_0= RULE_ID ) )
                    // InternalMyDsl.g:718:5: (lv_name_17_0= RULE_ID )
                    {
                    // InternalMyDsl.g:718:5: (lv_name_17_0= RULE_ID )
                    // InternalMyDsl.g:719:6: lv_name_17_0= RULE_ID
                    {
                    lv_name_17_0=(Token)match(input,RULE_ID,FOLLOW_14); 

                    						newLeafNode(lv_name_17_0, grammarAccess.getCRUDOperationsAccess().getNameIDTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCRUDOperationsRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_17_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_18=(Token)match(input,18,FOLLOW_6); 

                    				newLeafNode(otherlv_18, grammarAccess.getCRUDOperationsAccess().getColonKeyword_1_2());
                    			
                    // InternalMyDsl.g:739:4: (otherlv_19= '{' otherlv_20= 'operation:' ( (lv_updateOperation_21_0= 'UPDATE' ) ) otherlv_22= 'collection:' ( (otherlv_23= RULE_ID ) ) otherlv_24= 'input:' otherlv_25= '{' ( (lv_criteria_26_0= ruleCollectionEntry ) ) (otherlv_27= ',' ( (lv_criteria_28_0= ruleCollectionEntry ) ) )* otherlv_29= '},' otherlv_30= 'update:' otherlv_31= '{' ( (lv_entries_32_0= ruleCollectionEntry ) ) (otherlv_33= ',' ( (lv_entries_34_0= ruleCollectionEntry ) ) )* otherlv_35= '}' otherlv_36= '}' )
                    // InternalMyDsl.g:740:5: otherlv_19= '{' otherlv_20= 'operation:' ( (lv_updateOperation_21_0= 'UPDATE' ) ) otherlv_22= 'collection:' ( (otherlv_23= RULE_ID ) ) otherlv_24= 'input:' otherlv_25= '{' ( (lv_criteria_26_0= ruleCollectionEntry ) ) (otherlv_27= ',' ( (lv_criteria_28_0= ruleCollectionEntry ) ) )* otherlv_29= '},' otherlv_30= 'update:' otherlv_31= '{' ( (lv_entries_32_0= ruleCollectionEntry ) ) (otherlv_33= ',' ( (lv_entries_34_0= ruleCollectionEntry ) ) )* otherlv_35= '}' otherlv_36= '}'
                    {
                    otherlv_19=(Token)match(input,12,FOLLOW_19); 

                    					newLeafNode(otherlv_19, grammarAccess.getCRUDOperationsAccess().getLeftCurlyBracketKeyword_1_3_0());
                    				
                    otherlv_20=(Token)match(input,23,FOLLOW_23); 

                    					newLeafNode(otherlv_20, grammarAccess.getCRUDOperationsAccess().getOperationKeyword_1_3_1());
                    				
                    // InternalMyDsl.g:748:5: ( (lv_updateOperation_21_0= 'UPDATE' ) )
                    // InternalMyDsl.g:749:6: (lv_updateOperation_21_0= 'UPDATE' )
                    {
                    // InternalMyDsl.g:749:6: (lv_updateOperation_21_0= 'UPDATE' )
                    // InternalMyDsl.g:750:7: lv_updateOperation_21_0= 'UPDATE'
                    {
                    lv_updateOperation_21_0=(Token)match(input,26,FOLLOW_21); 

                    							newLeafNode(lv_updateOperation_21_0, grammarAccess.getCRUDOperationsAccess().getUpdateOperationUPDATEKeyword_1_3_2_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getCRUDOperationsRule());
                    							}
                    							setWithLastConsumed(current, "updateOperation", lv_updateOperation_21_0, "UPDATE");
                    						

                    }


                    }

                    otherlv_22=(Token)match(input,24,FOLLOW_11); 

                    					newLeafNode(otherlv_22, grammarAccess.getCRUDOperationsAccess().getCollectionKeyword_1_3_3());
                    				
                    // InternalMyDsl.g:766:5: ( (otherlv_23= RULE_ID ) )
                    // InternalMyDsl.g:767:6: (otherlv_23= RULE_ID )
                    {
                    // InternalMyDsl.g:767:6: (otherlv_23= RULE_ID )
                    // InternalMyDsl.g:768:7: otherlv_23= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getCRUDOperationsRule());
                    							}
                    						
                    otherlv_23=(Token)match(input,RULE_ID,FOLLOW_22); 

                    							newLeafNode(otherlv_23, grammarAccess.getCRUDOperationsAccess().getCollectionCollectionSchemaCrossReference_1_3_4_0());
                    						

                    }


                    }

                    otherlv_24=(Token)match(input,25,FOLLOW_6); 

                    					newLeafNode(otherlv_24, grammarAccess.getCRUDOperationsAccess().getInputKeyword_1_3_5());
                    				
                    otherlv_25=(Token)match(input,12,FOLLOW_11); 

                    					newLeafNode(otherlv_25, grammarAccess.getCRUDOperationsAccess().getLeftCurlyBracketKeyword_1_3_6());
                    				
                    // InternalMyDsl.g:787:5: ( (lv_criteria_26_0= ruleCollectionEntry ) )
                    // InternalMyDsl.g:788:6: (lv_criteria_26_0= ruleCollectionEntry )
                    {
                    // InternalMyDsl.g:788:6: (lv_criteria_26_0= ruleCollectionEntry )
                    // InternalMyDsl.g:789:7: lv_criteria_26_0= ruleCollectionEntry
                    {

                    							newCompositeNode(grammarAccess.getCRUDOperationsAccess().getCriteriaCollectionEntryParserRuleCall_1_3_7_0());
                    						
                    pushFollow(FOLLOW_24);
                    lv_criteria_26_0=ruleCollectionEntry();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getCRUDOperationsRule());
                    							}
                    							add(
                    								current,
                    								"criteria",
                    								lv_criteria_26_0,
                    								"org.xtext.example.mydsl.MyDsl.CollectionEntry");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalMyDsl.g:806:5: (otherlv_27= ',' ( (lv_criteria_28_0= ruleCollectionEntry ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==14) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalMyDsl.g:807:6: otherlv_27= ',' ( (lv_criteria_28_0= ruleCollectionEntry ) )
                    	    {
                    	    otherlv_27=(Token)match(input,14,FOLLOW_11); 

                    	    						newLeafNode(otherlv_27, grammarAccess.getCRUDOperationsAccess().getCommaKeyword_1_3_8_0());
                    	    					
                    	    // InternalMyDsl.g:811:6: ( (lv_criteria_28_0= ruleCollectionEntry ) )
                    	    // InternalMyDsl.g:812:7: (lv_criteria_28_0= ruleCollectionEntry )
                    	    {
                    	    // InternalMyDsl.g:812:7: (lv_criteria_28_0= ruleCollectionEntry )
                    	    // InternalMyDsl.g:813:8: lv_criteria_28_0= ruleCollectionEntry
                    	    {

                    	    								newCompositeNode(grammarAccess.getCRUDOperationsAccess().getCriteriaCollectionEntryParserRuleCall_1_3_8_1_0());
                    	    							
                    	    pushFollow(FOLLOW_24);
                    	    lv_criteria_28_0=ruleCollectionEntry();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getCRUDOperationsRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"criteria",
                    	    									lv_criteria_28_0,
                    	    									"org.xtext.example.mydsl.MyDsl.CollectionEntry");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_29=(Token)match(input,27,FOLLOW_25); 

                    					newLeafNode(otherlv_29, grammarAccess.getCRUDOperationsAccess().getRightCurlyBracketCommaKeyword_1_3_9());
                    				
                    otherlv_30=(Token)match(input,28,FOLLOW_6); 

                    					newLeafNode(otherlv_30, grammarAccess.getCRUDOperationsAccess().getUpdateKeyword_1_3_10());
                    				
                    otherlv_31=(Token)match(input,12,FOLLOW_11); 

                    					newLeafNode(otherlv_31, grammarAccess.getCRUDOperationsAccess().getLeftCurlyBracketKeyword_1_3_11());
                    				
                    // InternalMyDsl.g:843:5: ( (lv_entries_32_0= ruleCollectionEntry ) )
                    // InternalMyDsl.g:844:6: (lv_entries_32_0= ruleCollectionEntry )
                    {
                    // InternalMyDsl.g:844:6: (lv_entries_32_0= ruleCollectionEntry )
                    // InternalMyDsl.g:845:7: lv_entries_32_0= ruleCollectionEntry
                    {

                    							newCompositeNode(grammarAccess.getCRUDOperationsAccess().getEntriesCollectionEntryParserRuleCall_1_3_12_0());
                    						
                    pushFollow(FOLLOW_13);
                    lv_entries_32_0=ruleCollectionEntry();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getCRUDOperationsRule());
                    							}
                    							add(
                    								current,
                    								"entries",
                    								lv_entries_32_0,
                    								"org.xtext.example.mydsl.MyDsl.CollectionEntry");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalMyDsl.g:862:5: (otherlv_33= ',' ( (lv_entries_34_0= ruleCollectionEntry ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==14) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalMyDsl.g:863:6: otherlv_33= ',' ( (lv_entries_34_0= ruleCollectionEntry ) )
                    	    {
                    	    otherlv_33=(Token)match(input,14,FOLLOW_11); 

                    	    						newLeafNode(otherlv_33, grammarAccess.getCRUDOperationsAccess().getCommaKeyword_1_3_13_0());
                    	    					
                    	    // InternalMyDsl.g:867:6: ( (lv_entries_34_0= ruleCollectionEntry ) )
                    	    // InternalMyDsl.g:868:7: (lv_entries_34_0= ruleCollectionEntry )
                    	    {
                    	    // InternalMyDsl.g:868:7: (lv_entries_34_0= ruleCollectionEntry )
                    	    // InternalMyDsl.g:869:8: lv_entries_34_0= ruleCollectionEntry
                    	    {

                    	    								newCompositeNode(grammarAccess.getCRUDOperationsAccess().getEntriesCollectionEntryParserRuleCall_1_3_13_1_0());
                    	    							
                    	    pushFollow(FOLLOW_13);
                    	    lv_entries_34_0=ruleCollectionEntry();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getCRUDOperationsRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"entries",
                    	    									lv_entries_34_0,
                    	    									"org.xtext.example.mydsl.MyDsl.CollectionEntry");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_35=(Token)match(input,16,FOLLOW_10); 

                    					newLeafNode(otherlv_35, grammarAccess.getCRUDOperationsAccess().getRightCurlyBracketKeyword_1_3_14());
                    				
                    otherlv_36=(Token)match(input,16,FOLLOW_2); 

                    					newLeafNode(otherlv_36, grammarAccess.getCRUDOperationsAccess().getRightCurlyBracketKeyword_1_3_15());
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCRUDOperations"


    // $ANTLR start "entryRuleCollectionEntry"
    // InternalMyDsl.g:901:1: entryRuleCollectionEntry returns [EObject current=null] : iv_ruleCollectionEntry= ruleCollectionEntry EOF ;
    public final EObject entryRuleCollectionEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionEntry = null;


        try {
            // InternalMyDsl.g:901:56: (iv_ruleCollectionEntry= ruleCollectionEntry EOF )
            // InternalMyDsl.g:902:2: iv_ruleCollectionEntry= ruleCollectionEntry EOF
            {
             newCompositeNode(grammarAccess.getCollectionEntryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCollectionEntry=ruleCollectionEntry();

            state._fsp--;

             current =iv_ruleCollectionEntry; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCollectionEntry"


    // $ANTLR start "ruleCollectionEntry"
    // InternalMyDsl.g:908:1: ruleCollectionEntry returns [EObject current=null] : ( ( (lv_valueName_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_valueString_2_0= RULE_STRING ) ) | ( (lv_valueInt_3_0= RULE_INT ) ) ) ) ;
    public final EObject ruleCollectionEntry() throws RecognitionException {
        EObject current = null;

        Token lv_valueName_0_0=null;
        Token otherlv_1=null;
        Token lv_valueString_2_0=null;
        Token lv_valueInt_3_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:914:2: ( ( ( (lv_valueName_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_valueString_2_0= RULE_STRING ) ) | ( (lv_valueInt_3_0= RULE_INT ) ) ) ) )
            // InternalMyDsl.g:915:2: ( ( (lv_valueName_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_valueString_2_0= RULE_STRING ) ) | ( (lv_valueInt_3_0= RULE_INT ) ) ) )
            {
            // InternalMyDsl.g:915:2: ( ( (lv_valueName_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_valueString_2_0= RULE_STRING ) ) | ( (lv_valueInt_3_0= RULE_INT ) ) ) )
            // InternalMyDsl.g:916:3: ( (lv_valueName_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_valueString_2_0= RULE_STRING ) ) | ( (lv_valueInt_3_0= RULE_INT ) ) )
            {
            // InternalMyDsl.g:916:3: ( (lv_valueName_0_0= RULE_ID ) )
            // InternalMyDsl.g:917:4: (lv_valueName_0_0= RULE_ID )
            {
            // InternalMyDsl.g:917:4: (lv_valueName_0_0= RULE_ID )
            // InternalMyDsl.g:918:5: lv_valueName_0_0= RULE_ID
            {
            lv_valueName_0_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_valueName_0_0, grammarAccess.getCollectionEntryAccess().getValueNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCollectionEntryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"valueName",
            						lv_valueName_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getCollectionEntryAccess().getColonKeyword_1());
            		
            // InternalMyDsl.g:938:3: ( ( (lv_valueString_2_0= RULE_STRING ) ) | ( (lv_valueInt_3_0= RULE_INT ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_STRING) ) {
                alt15=1;
            }
            else if ( (LA15_0==RULE_INT) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:939:4: ( (lv_valueString_2_0= RULE_STRING ) )
                    {
                    // InternalMyDsl.g:939:4: ( (lv_valueString_2_0= RULE_STRING ) )
                    // InternalMyDsl.g:940:5: (lv_valueString_2_0= RULE_STRING )
                    {
                    // InternalMyDsl.g:940:5: (lv_valueString_2_0= RULE_STRING )
                    // InternalMyDsl.g:941:6: lv_valueString_2_0= RULE_STRING
                    {
                    lv_valueString_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_valueString_2_0, grammarAccess.getCollectionEntryAccess().getValueStringSTRINGTerminalRuleCall_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCollectionEntryRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"valueString",
                    							lv_valueString_2_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:958:4: ( (lv_valueInt_3_0= RULE_INT ) )
                    {
                    // InternalMyDsl.g:958:4: ( (lv_valueInt_3_0= RULE_INT ) )
                    // InternalMyDsl.g:959:5: (lv_valueInt_3_0= RULE_INT )
                    {
                    // InternalMyDsl.g:959:5: (lv_valueInt_3_0= RULE_INT )
                    // InternalMyDsl.g:960:6: lv_valueInt_3_0= RULE_INT
                    {
                    lv_valueInt_3_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_valueInt_3_0, grammarAccess.getCollectionEntryAccess().getValueIntINTTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCollectionEntryRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"valueInt",
                    							lv_valueInt_3_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCollectionEntry"


    // $ANTLR start "ruleOperation"
    // InternalMyDsl.g:981:1: ruleOperation returns [Enumerator current=null] : ( (enumLiteral_0= 'GET' ) | (enumLiteral_1= 'DELETE' ) | (enumLiteral_2= 'INSERT' ) ) ;
    public final Enumerator ruleOperation() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:987:2: ( ( (enumLiteral_0= 'GET' ) | (enumLiteral_1= 'DELETE' ) | (enumLiteral_2= 'INSERT' ) ) )
            // InternalMyDsl.g:988:2: ( (enumLiteral_0= 'GET' ) | (enumLiteral_1= 'DELETE' ) | (enumLiteral_2= 'INSERT' ) )
            {
            // InternalMyDsl.g:988:2: ( (enumLiteral_0= 'GET' ) | (enumLiteral_1= 'DELETE' ) | (enumLiteral_2= 'INSERT' ) )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt16=1;
                }
                break;
            case 30:
                {
                alt16=2;
                }
                break;
            case 31:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:989:3: (enumLiteral_0= 'GET' )
                    {
                    // InternalMyDsl.g:989:3: (enumLiteral_0= 'GET' )
                    // InternalMyDsl.g:990:4: enumLiteral_0= 'GET'
                    {
                    enumLiteral_0=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getOperationAccess().getGETEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOperationAccess().getGETEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:997:3: (enumLiteral_1= 'DELETE' )
                    {
                    // InternalMyDsl.g:997:3: (enumLiteral_1= 'DELETE' )
                    // InternalMyDsl.g:998:4: enumLiteral_1= 'DELETE'
                    {
                    enumLiteral_1=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getOperationAccess().getDELETEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getOperationAccess().getDELETEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1005:3: (enumLiteral_2= 'INSERT' )
                    {
                    // InternalMyDsl.g:1005:3: (enumLiteral_2= 'INSERT' )
                    // InternalMyDsl.g:1006:4: enumLiteral_2= 'INSERT'
                    {
                    enumLiteral_2=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getOperationAccess().getINSERTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getOperationAccess().getINSERTEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperation"


    // $ANTLR start "ruleFieldType"
    // InternalMyDsl.g:1016:1: ruleFieldType returns [Enumerator current=null] : ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Number' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'Date' ) ) ;
    public final Enumerator ruleFieldType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1022:2: ( ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Number' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'Date' ) ) )
            // InternalMyDsl.g:1023:2: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Number' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'Date' ) )
            {
            // InternalMyDsl.g:1023:2: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Number' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'Date' ) )
            int alt17=4;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt17=1;
                }
                break;
            case 33:
                {
                alt17=2;
                }
                break;
            case 34:
                {
                alt17=3;
                }
                break;
            case 35:
                {
                alt17=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:1024:3: (enumLiteral_0= 'String' )
                    {
                    // InternalMyDsl.g:1024:3: (enumLiteral_0= 'String' )
                    // InternalMyDsl.g:1025:4: enumLiteral_0= 'String'
                    {
                    enumLiteral_0=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getFieldTypeAccess().getStringEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getFieldTypeAccess().getStringEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1032:3: (enumLiteral_1= 'Number' )
                    {
                    // InternalMyDsl.g:1032:3: (enumLiteral_1= 'Number' )
                    // InternalMyDsl.g:1033:4: enumLiteral_1= 'Number'
                    {
                    enumLiteral_1=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getFieldTypeAccess().getNumberEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getFieldTypeAccess().getNumberEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1040:3: (enumLiteral_2= 'Boolean' )
                    {
                    // InternalMyDsl.g:1040:3: (enumLiteral_2= 'Boolean' )
                    // InternalMyDsl.g:1041:4: enumLiteral_2= 'Boolean'
                    {
                    enumLiteral_2=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getFieldTypeAccess().getBooleanEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getFieldTypeAccess().getBooleanEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1048:3: (enumLiteral_3= 'Date' )
                    {
                    // InternalMyDsl.g:1048:3: (enumLiteral_3= 'Date' )
                    // InternalMyDsl.g:1049:4: enumLiteral_3= 'Date'
                    {
                    enumLiteral_3=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getFieldTypeAccess().getDateEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getFieldTypeAccess().getDateEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFieldType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000F00000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000000E0000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000008004000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000050L});

}
