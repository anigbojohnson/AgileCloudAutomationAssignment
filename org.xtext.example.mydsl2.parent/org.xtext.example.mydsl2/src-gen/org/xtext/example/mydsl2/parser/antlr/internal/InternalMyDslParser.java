package org.xtext.example.mydsl2.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl2.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'DatabaseParameters'", "'{'", "'Connection'", "','", "'database'", "'}'", "'Collection'", "':'", "'required'", "'unique'", "'ref'", "'task:'", "'operation:'", "'collection:'", "'input:'", "'UPDATE,'", "'update:'", "'GET'", "'DELETE'", "'INSERT'", "'String'", "'Number'", "'Boolean'", "'Date'"
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
    // InternalMyDsl.g:64:1: entryRuleMongoDB returns [EObject current=null] : iv_ruleMongoDB= ruleMongoDB EOF ;
    public final EObject entryRuleMongoDB() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMongoDB = null;


        try {
            // InternalMyDsl.g:64:48: (iv_ruleMongoDB= ruleMongoDB EOF )
            // InternalMyDsl.g:65:2: iv_ruleMongoDB= ruleMongoDB EOF
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
    // InternalMyDsl.g:71:1: ruleMongoDB returns [EObject current=null] : ( (lv_models_0_0= ruleModel ) )* ;
    public final EObject ruleMongoDB() throws RecognitionException {
        EObject current = null;

        EObject lv_models_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( (lv_models_0_0= ruleModel ) )* )
            // InternalMyDsl.g:78:2: ( (lv_models_0_0= ruleModel ) )*
            {
            // InternalMyDsl.g:78:2: ( (lv_models_0_0= ruleModel ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:79:3: (lv_models_0_0= ruleModel )
            	    {
            	    // InternalMyDsl.g:79:3: (lv_models_0_0= ruleModel )
            	    // InternalMyDsl.g:80:4: lv_models_0_0= ruleModel
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
            	    					"org.xtext.example.mydsl2.MyDsl.Model");
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
    // InternalMyDsl.g:100:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalMyDsl.g:100:46: (iv_ruleModel= ruleModel EOF )
            // InternalMyDsl.g:101:2: iv_ruleModel= ruleModel EOF
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
    // InternalMyDsl.g:107:1: ruleModel returns [EObject current=null] : ( ( (lv_connection_0_0= ruleConnectionStatement ) ) ( (lv_statements_1_0= ruleOperationStatement ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_connection_0_0 = null;

        EObject lv_statements_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:113:2: ( ( ( (lv_connection_0_0= ruleConnectionStatement ) ) ( (lv_statements_1_0= ruleOperationStatement ) )* ) )
            // InternalMyDsl.g:114:2: ( ( (lv_connection_0_0= ruleConnectionStatement ) ) ( (lv_statements_1_0= ruleOperationStatement ) )* )
            {
            // InternalMyDsl.g:114:2: ( ( (lv_connection_0_0= ruleConnectionStatement ) ) ( (lv_statements_1_0= ruleOperationStatement ) )* )
            // InternalMyDsl.g:115:3: ( (lv_connection_0_0= ruleConnectionStatement ) ) ( (lv_statements_1_0= ruleOperationStatement ) )*
            {
            // InternalMyDsl.g:115:3: ( (lv_connection_0_0= ruleConnectionStatement ) )
            // InternalMyDsl.g:116:4: (lv_connection_0_0= ruleConnectionStatement )
            {
            // InternalMyDsl.g:116:4: (lv_connection_0_0= ruleConnectionStatement )
            // InternalMyDsl.g:117:5: lv_connection_0_0= ruleConnectionStatement
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
            						"org.xtext.example.mydsl2.MyDsl.ConnectionStatement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:134:3: ( (lv_statements_1_0= ruleOperationStatement ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==17) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:135:4: (lv_statements_1_0= ruleOperationStatement )
            	    {
            	    // InternalMyDsl.g:135:4: (lv_statements_1_0= ruleOperationStatement )
            	    // InternalMyDsl.g:136:5: lv_statements_1_0= ruleOperationStatement
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getStatementsOperationStatementParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_statements_1_0=ruleOperationStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statements",
            	    						lv_statements_1_0,
            	    						"org.xtext.example.mydsl2.MyDsl.OperationStatement");
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


    // $ANTLR start "entryRuleOperationStatement"
    // InternalMyDsl.g:157:1: entryRuleOperationStatement returns [EObject current=null] : iv_ruleOperationStatement= ruleOperationStatement EOF ;
    public final EObject entryRuleOperationStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationStatement = null;


        try {
            // InternalMyDsl.g:157:59: (iv_ruleOperationStatement= ruleOperationStatement EOF )
            // InternalMyDsl.g:158:2: iv_ruleOperationStatement= ruleOperationStatement EOF
            {
             newCompositeNode(grammarAccess.getOperationStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperationStatement=ruleOperationStatement();

            state._fsp--;

             current =iv_ruleOperationStatement; 
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
    // $ANTLR end "entryRuleOperationStatement"


    // $ANTLR start "ruleOperationStatement"
    // InternalMyDsl.g:164:1: ruleOperationStatement returns [EObject current=null] : ( ( (lv_schema_0_0= ruleMakeStatement ) ) ( (lv_operations_1_0= ruleOtherOperationStatement ) )* ) ;
    public final EObject ruleOperationStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_schema_0_0 = null;

        EObject lv_operations_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:170:2: ( ( ( (lv_schema_0_0= ruleMakeStatement ) ) ( (lv_operations_1_0= ruleOtherOperationStatement ) )* ) )
            // InternalMyDsl.g:171:2: ( ( (lv_schema_0_0= ruleMakeStatement ) ) ( (lv_operations_1_0= ruleOtherOperationStatement ) )* )
            {
            // InternalMyDsl.g:171:2: ( ( (lv_schema_0_0= ruleMakeStatement ) ) ( (lv_operations_1_0= ruleOtherOperationStatement ) )* )
            // InternalMyDsl.g:172:3: ( (lv_schema_0_0= ruleMakeStatement ) ) ( (lv_operations_1_0= ruleOtherOperationStatement ) )*
            {
            // InternalMyDsl.g:172:3: ( (lv_schema_0_0= ruleMakeStatement ) )
            // InternalMyDsl.g:173:4: (lv_schema_0_0= ruleMakeStatement )
            {
            // InternalMyDsl.g:173:4: (lv_schema_0_0= ruleMakeStatement )
            // InternalMyDsl.g:174:5: lv_schema_0_0= ruleMakeStatement
            {

            					newCompositeNode(grammarAccess.getOperationStatementAccess().getSchemaMakeStatementParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_5);
            lv_schema_0_0=ruleMakeStatement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOperationStatementRule());
            					}
            					set(
            						current,
            						"schema",
            						lv_schema_0_0,
            						"org.xtext.example.mydsl2.MyDsl.MakeStatement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:191:3: ( (lv_operations_1_0= ruleOtherOperationStatement ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==22) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:192:4: (lv_operations_1_0= ruleOtherOperationStatement )
            	    {
            	    // InternalMyDsl.g:192:4: (lv_operations_1_0= ruleOtherOperationStatement )
            	    // InternalMyDsl.g:193:5: lv_operations_1_0= ruleOtherOperationStatement
            	    {

            	    					newCompositeNode(grammarAccess.getOperationStatementAccess().getOperationsOtherOperationStatementParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_operations_1_0=ruleOtherOperationStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getOperationStatementRule());
            	    					}
            	    					add(
            	    						current,
            	    						"operations",
            	    						lv_operations_1_0,
            	    						"org.xtext.example.mydsl2.MyDsl.OtherOperationStatement");
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
    // $ANTLR end "ruleOperationStatement"


    // $ANTLR start "entryRuleConnectionStatement"
    // InternalMyDsl.g:214:1: entryRuleConnectionStatement returns [EObject current=null] : iv_ruleConnectionStatement= ruleConnectionStatement EOF ;
    public final EObject entryRuleConnectionStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnectionStatement = null;


        try {
            // InternalMyDsl.g:214:60: (iv_ruleConnectionStatement= ruleConnectionStatement EOF )
            // InternalMyDsl.g:215:2: iv_ruleConnectionStatement= ruleConnectionStatement EOF
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
    // InternalMyDsl.g:221:1: ruleConnectionStatement returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'DatabaseParameters' otherlv_2= '{' otherlv_3= 'Connection' ( (lv_connectionString_4_0= RULE_STRING ) ) otherlv_5= ',' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'database' ( (lv_database_7_0= RULE_STRING ) ) otherlv_8= '}' ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleConnectionStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_connectionString_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_database_7_0=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalMyDsl.g:227:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'DatabaseParameters' otherlv_2= '{' otherlv_3= 'Connection' ( (lv_connectionString_4_0= RULE_STRING ) ) otherlv_5= ',' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'database' ( (lv_database_7_0= RULE_STRING ) ) otherlv_8= '}' ) ) ) ) )+ {...}?) ) ) )
            // InternalMyDsl.g:228:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'DatabaseParameters' otherlv_2= '{' otherlv_3= 'Connection' ( (lv_connectionString_4_0= RULE_STRING ) ) otherlv_5= ',' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'database' ( (lv_database_7_0= RULE_STRING ) ) otherlv_8= '}' ) ) ) ) )+ {...}?) ) )
            {
            // InternalMyDsl.g:228:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'DatabaseParameters' otherlv_2= '{' otherlv_3= 'Connection' ( (lv_connectionString_4_0= RULE_STRING ) ) otherlv_5= ',' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'database' ( (lv_database_7_0= RULE_STRING ) ) otherlv_8= '}' ) ) ) ) )+ {...}?) ) )
            // InternalMyDsl.g:229:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'DatabaseParameters' otherlv_2= '{' otherlv_3= 'Connection' ( (lv_connectionString_4_0= RULE_STRING ) ) otherlv_5= ',' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'database' ( (lv_database_7_0= RULE_STRING ) ) otherlv_8= '}' ) ) ) ) )+ {...}?) )
            {
            // InternalMyDsl.g:229:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'DatabaseParameters' otherlv_2= '{' otherlv_3= 'Connection' ( (lv_connectionString_4_0= RULE_STRING ) ) otherlv_5= ',' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'database' ( (lv_database_7_0= RULE_STRING ) ) otherlv_8= '}' ) ) ) ) )+ {...}?) )
            // InternalMyDsl.g:230:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'DatabaseParameters' otherlv_2= '{' otherlv_3= 'Connection' ( (lv_connectionString_4_0= RULE_STRING ) ) otherlv_5= ',' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'database' ( (lv_database_7_0= RULE_STRING ) ) otherlv_8= '}' ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getConnectionStatementAccess().getUnorderedGroup());
            			
            // InternalMyDsl.g:233:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'DatabaseParameters' otherlv_2= '{' otherlv_3= 'Connection' ( (lv_connectionString_4_0= RULE_STRING ) ) otherlv_5= ',' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'database' ( (lv_database_7_0= RULE_STRING ) ) otherlv_8= '}' ) ) ) ) )+ {...}?)
            // InternalMyDsl.g:234:5: ( ({...}? => ( ({...}? => (otherlv_1= 'DatabaseParameters' otherlv_2= '{' otherlv_3= 'Connection' ( (lv_connectionString_4_0= RULE_STRING ) ) otherlv_5= ',' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'database' ( (lv_database_7_0= RULE_STRING ) ) otherlv_8= '}' ) ) ) ) )+ {...}?
            {
            // InternalMyDsl.g:234:5: ( ({...}? => ( ({...}? => (otherlv_1= 'DatabaseParameters' otherlv_2= '{' otherlv_3= 'Connection' ( (lv_connectionString_4_0= RULE_STRING ) ) otherlv_5= ',' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'database' ( (lv_database_7_0= RULE_STRING ) ) otherlv_8= '}' ) ) ) ) )+
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
            	    // InternalMyDsl.g:235:3: ({...}? => ( ({...}? => (otherlv_1= 'DatabaseParameters' otherlv_2= '{' otherlv_3= 'Connection' ( (lv_connectionString_4_0= RULE_STRING ) ) otherlv_5= ',' ) ) ) )
            	    {
            	    // InternalMyDsl.g:235:3: ({...}? => ( ({...}? => (otherlv_1= 'DatabaseParameters' otherlv_2= '{' otherlv_3= 'Connection' ( (lv_connectionString_4_0= RULE_STRING ) ) otherlv_5= ',' ) ) ) )
            	    // InternalMyDsl.g:236:4: {...}? => ( ({...}? => (otherlv_1= 'DatabaseParameters' otherlv_2= '{' otherlv_3= 'Connection' ( (lv_connectionString_4_0= RULE_STRING ) ) otherlv_5= ',' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionStatementAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleConnectionStatement", "getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionStatementAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalMyDsl.g:236:113: ( ({...}? => (otherlv_1= 'DatabaseParameters' otherlv_2= '{' otherlv_3= 'Connection' ( (lv_connectionString_4_0= RULE_STRING ) ) otherlv_5= ',' ) ) )
            	    // InternalMyDsl.g:237:5: ({...}? => (otherlv_1= 'DatabaseParameters' otherlv_2= '{' otherlv_3= 'Connection' ( (lv_connectionString_4_0= RULE_STRING ) ) otherlv_5= ',' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getConnectionStatementAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalMyDsl.g:240:8: ({...}? => (otherlv_1= 'DatabaseParameters' otherlv_2= '{' otherlv_3= 'Connection' ( (lv_connectionString_4_0= RULE_STRING ) ) otherlv_5= ',' ) )
            	    // InternalMyDsl.g:240:9: {...}? => (otherlv_1= 'DatabaseParameters' otherlv_2= '{' otherlv_3= 'Connection' ( (lv_connectionString_4_0= RULE_STRING ) ) otherlv_5= ',' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleConnectionStatement", "true");
            	    }
            	    // InternalMyDsl.g:240:18: (otherlv_1= 'DatabaseParameters' otherlv_2= '{' otherlv_3= 'Connection' ( (lv_connectionString_4_0= RULE_STRING ) ) otherlv_5= ',' )
            	    // InternalMyDsl.g:240:19: otherlv_1= 'DatabaseParameters' otherlv_2= '{' otherlv_3= 'Connection' ( (lv_connectionString_4_0= RULE_STRING ) ) otherlv_5= ','
            	    {
            	    otherlv_1=(Token)match(input,11,FOLLOW_6); 

            	    								newLeafNode(otherlv_1, grammarAccess.getConnectionStatementAccess().getDatabaseParametersKeyword_0_0());
            	    							
            	    otherlv_2=(Token)match(input,12,FOLLOW_7); 

            	    								newLeafNode(otherlv_2, grammarAccess.getConnectionStatementAccess().getLeftCurlyBracketKeyword_0_1());
            	    							
            	    otherlv_3=(Token)match(input,13,FOLLOW_8); 

            	    								newLeafNode(otherlv_3, grammarAccess.getConnectionStatementAccess().getConnectionKeyword_0_2());
            	    							
            	    // InternalMyDsl.g:252:8: ( (lv_connectionString_4_0= RULE_STRING ) )
            	    // InternalMyDsl.g:253:9: (lv_connectionString_4_0= RULE_STRING )
            	    {
            	    // InternalMyDsl.g:253:9: (lv_connectionString_4_0= RULE_STRING )
            	    // InternalMyDsl.g:254:10: lv_connectionString_4_0= RULE_STRING
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
            	    // InternalMyDsl.g:280:3: ({...}? => ( ({...}? => (otherlv_6= 'database' ( (lv_database_7_0= RULE_STRING ) ) otherlv_8= '}' ) ) ) )
            	    {
            	    // InternalMyDsl.g:280:3: ({...}? => ( ({...}? => (otherlv_6= 'database' ( (lv_database_7_0= RULE_STRING ) ) otherlv_8= '}' ) ) ) )
            	    // InternalMyDsl.g:281:4: {...}? => ( ({...}? => (otherlv_6= 'database' ( (lv_database_7_0= RULE_STRING ) ) otherlv_8= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionStatementAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleConnectionStatement", "getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionStatementAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalMyDsl.g:281:113: ( ({...}? => (otherlv_6= 'database' ( (lv_database_7_0= RULE_STRING ) ) otherlv_8= '}' ) ) )
            	    // InternalMyDsl.g:282:5: ({...}? => (otherlv_6= 'database' ( (lv_database_7_0= RULE_STRING ) ) otherlv_8= '}' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getConnectionStatementAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalMyDsl.g:285:8: ({...}? => (otherlv_6= 'database' ( (lv_database_7_0= RULE_STRING ) ) otherlv_8= '}' ) )
            	    // InternalMyDsl.g:285:9: {...}? => (otherlv_6= 'database' ( (lv_database_7_0= RULE_STRING ) ) otherlv_8= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleConnectionStatement", "true");
            	    }
            	    // InternalMyDsl.g:285:18: (otherlv_6= 'database' ( (lv_database_7_0= RULE_STRING ) ) otherlv_8= '}' )
            	    // InternalMyDsl.g:285:19: otherlv_6= 'database' ( (lv_database_7_0= RULE_STRING ) ) otherlv_8= '}'
            	    {
            	    otherlv_6=(Token)match(input,15,FOLLOW_8); 

            	    								newLeafNode(otherlv_6, grammarAccess.getConnectionStatementAccess().getDatabaseKeyword_1_0());
            	    							
            	    // InternalMyDsl.g:289:8: ( (lv_database_7_0= RULE_STRING ) )
            	    // InternalMyDsl.g:290:9: (lv_database_7_0= RULE_STRING )
            	    {
            	    // InternalMyDsl.g:290:9: (lv_database_7_0= RULE_STRING )
            	    // InternalMyDsl.g:291:10: lv_database_7_0= RULE_STRING
            	    {
            	    lv_database_7_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            	    										newLeafNode(lv_database_7_0, grammarAccess.getConnectionStatementAccess().getDatabaseSTRINGTerminalRuleCall_1_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getConnectionStatementRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"database",
            	    											lv_database_7_0,
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


    // $ANTLR start "entryRuleMakeStatement"
    // InternalMyDsl.g:328:1: entryRuleMakeStatement returns [EObject current=null] : iv_ruleMakeStatement= ruleMakeStatement EOF ;
    public final EObject entryRuleMakeStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMakeStatement = null;


        try {
            // InternalMyDsl.g:328:54: (iv_ruleMakeStatement= ruleMakeStatement EOF )
            // InternalMyDsl.g:329:2: iv_ruleMakeStatement= ruleMakeStatement EOF
            {
             newCompositeNode(grammarAccess.getMakeStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMakeStatement=ruleMakeStatement();

            state._fsp--;

             current =iv_ruleMakeStatement; 
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
    // $ANTLR end "entryRuleMakeStatement"


    // $ANTLR start "ruleMakeStatement"
    // InternalMyDsl.g:335:1: ruleMakeStatement returns [EObject current=null] : (otherlv_0= 'Collection' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_entries_3_0= ruleDictionaryEntry ) ) (otherlv_4= ',' ( (lv_entries_5_0= ruleDictionaryEntry ) ) )* )? otherlv_6= '}' ) ;
    public final EObject ruleMakeStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_entries_3_0 = null;

        EObject lv_entries_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:341:2: ( (otherlv_0= 'Collection' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_entries_3_0= ruleDictionaryEntry ) ) (otherlv_4= ',' ( (lv_entries_5_0= ruleDictionaryEntry ) ) )* )? otherlv_6= '}' ) )
            // InternalMyDsl.g:342:2: (otherlv_0= 'Collection' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_entries_3_0= ruleDictionaryEntry ) ) (otherlv_4= ',' ( (lv_entries_5_0= ruleDictionaryEntry ) ) )* )? otherlv_6= '}' )
            {
            // InternalMyDsl.g:342:2: (otherlv_0= 'Collection' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_entries_3_0= ruleDictionaryEntry ) ) (otherlv_4= ',' ( (lv_entries_5_0= ruleDictionaryEntry ) ) )* )? otherlv_6= '}' )
            // InternalMyDsl.g:343:3: otherlv_0= 'Collection' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_entries_3_0= ruleDictionaryEntry ) ) (otherlv_4= ',' ( (lv_entries_5_0= ruleDictionaryEntry ) ) )* )? otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getMakeStatementAccess().getCollectionKeyword_0());
            		
            // InternalMyDsl.g:347:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:348:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:348:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:349:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMakeStatementAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMakeStatementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getMakeStatementAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:369:3: ( ( (lv_entries_3_0= ruleDictionaryEntry ) ) (otherlv_4= ',' ( (lv_entries_5_0= ruleDictionaryEntry ) ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:370:4: ( (lv_entries_3_0= ruleDictionaryEntry ) ) (otherlv_4= ',' ( (lv_entries_5_0= ruleDictionaryEntry ) ) )*
                    {
                    // InternalMyDsl.g:370:4: ( (lv_entries_3_0= ruleDictionaryEntry ) )
                    // InternalMyDsl.g:371:5: (lv_entries_3_0= ruleDictionaryEntry )
                    {
                    // InternalMyDsl.g:371:5: (lv_entries_3_0= ruleDictionaryEntry )
                    // InternalMyDsl.g:372:6: lv_entries_3_0= ruleDictionaryEntry
                    {

                    						newCompositeNode(grammarAccess.getMakeStatementAccess().getEntriesDictionaryEntryParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_entries_3_0=ruleDictionaryEntry();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMakeStatementRule());
                    						}
                    						add(
                    							current,
                    							"entries",
                    							lv_entries_3_0,
                    							"org.xtext.example.mydsl2.MyDsl.DictionaryEntry");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:389:4: (otherlv_4= ',' ( (lv_entries_5_0= ruleDictionaryEntry ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==14) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalMyDsl.g:390:5: otherlv_4= ',' ( (lv_entries_5_0= ruleDictionaryEntry ) )
                    	    {
                    	    otherlv_4=(Token)match(input,14,FOLLOW_11); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getMakeStatementAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalMyDsl.g:394:5: ( (lv_entries_5_0= ruleDictionaryEntry ) )
                    	    // InternalMyDsl.g:395:6: (lv_entries_5_0= ruleDictionaryEntry )
                    	    {
                    	    // InternalMyDsl.g:395:6: (lv_entries_5_0= ruleDictionaryEntry )
                    	    // InternalMyDsl.g:396:7: lv_entries_5_0= ruleDictionaryEntry
                    	    {

                    	    							newCompositeNode(grammarAccess.getMakeStatementAccess().getEntriesDictionaryEntryParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    lv_entries_5_0=ruleDictionaryEntry();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMakeStatementRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"entries",
                    	    								lv_entries_5_0,
                    	    								"org.xtext.example.mydsl2.MyDsl.DictionaryEntry");
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

            			newLeafNode(otherlv_6, grammarAccess.getMakeStatementAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleMakeStatement"


    // $ANTLR start "entryRuleDictionaryEntry"
    // InternalMyDsl.g:423:1: entryRuleDictionaryEntry returns [EObject current=null] : iv_ruleDictionaryEntry= ruleDictionaryEntry EOF ;
    public final EObject entryRuleDictionaryEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDictionaryEntry = null;


        try {
            // InternalMyDsl.g:423:56: (iv_ruleDictionaryEntry= ruleDictionaryEntry EOF )
            // InternalMyDsl.g:424:2: iv_ruleDictionaryEntry= ruleDictionaryEntry EOF
            {
             newCompositeNode(grammarAccess.getDictionaryEntryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDictionaryEntry=ruleDictionaryEntry();

            state._fsp--;

             current =iv_ruleDictionaryEntry; 
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
    // $ANTLR end "entryRuleDictionaryEntry"


    // $ANTLR start "ruleDictionaryEntry"
    // InternalMyDsl.g:430:1: ruleDictionaryEntry returns [EObject current=null] : ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_fieldType_2_0= ruleFieldType ) ) ( (lv_status_3_0= 'required' ) )? ( (lv_uniqueKey_4_0= 'unique' ) )? ) | ( ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ':' otherlv_7= 'ref' ( (otherlv_8= RULE_ID ) ) ) ) ;
    public final EObject ruleDictionaryEntry() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_status_3_0=null;
        Token lv_uniqueKey_4_0=null;
        Token lv_name_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_fieldType_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:436:2: ( ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_fieldType_2_0= ruleFieldType ) ) ( (lv_status_3_0= 'required' ) )? ( (lv_uniqueKey_4_0= 'unique' ) )? ) | ( ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ':' otherlv_7= 'ref' ( (otherlv_8= RULE_ID ) ) ) ) )
            // InternalMyDsl.g:437:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_fieldType_2_0= ruleFieldType ) ) ( (lv_status_3_0= 'required' ) )? ( (lv_uniqueKey_4_0= 'unique' ) )? ) | ( ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ':' otherlv_7= 'ref' ( (otherlv_8= RULE_ID ) ) ) )
            {
            // InternalMyDsl.g:437:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_fieldType_2_0= ruleFieldType ) ) ( (lv_status_3_0= 'required' ) )? ( (lv_uniqueKey_4_0= 'unique' ) )? ) | ( ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ':' otherlv_7= 'ref' ( (otherlv_8= RULE_ID ) ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==18) ) {
                    int LA9_2 = input.LA(3);

                    if ( ((LA9_2>=31 && LA9_2<=34)) ) {
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
                    // InternalMyDsl.g:438:3: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_fieldType_2_0= ruleFieldType ) ) ( (lv_status_3_0= 'required' ) )? ( (lv_uniqueKey_4_0= 'unique' ) )? )
                    {
                    // InternalMyDsl.g:438:3: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_fieldType_2_0= ruleFieldType ) ) ( (lv_status_3_0= 'required' ) )? ( (lv_uniqueKey_4_0= 'unique' ) )? )
                    // InternalMyDsl.g:439:4: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_fieldType_2_0= ruleFieldType ) ) ( (lv_status_3_0= 'required' ) )? ( (lv_uniqueKey_4_0= 'unique' ) )?
                    {
                    // InternalMyDsl.g:439:4: ( (lv_name_0_0= RULE_ID ) )
                    // InternalMyDsl.g:440:5: (lv_name_0_0= RULE_ID )
                    {
                    // InternalMyDsl.g:440:5: (lv_name_0_0= RULE_ID )
                    // InternalMyDsl.g:441:6: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_14); 

                    						newLeafNode(lv_name_0_0, grammarAccess.getDictionaryEntryAccess().getNameIDTerminalRuleCall_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDictionaryEntryRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_0_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,18,FOLLOW_15); 

                    				newLeafNode(otherlv_1, grammarAccess.getDictionaryEntryAccess().getColonKeyword_0_1());
                    			
                    // InternalMyDsl.g:461:4: ( (lv_fieldType_2_0= ruleFieldType ) )
                    // InternalMyDsl.g:462:5: (lv_fieldType_2_0= ruleFieldType )
                    {
                    // InternalMyDsl.g:462:5: (lv_fieldType_2_0= ruleFieldType )
                    // InternalMyDsl.g:463:6: lv_fieldType_2_0= ruleFieldType
                    {

                    						newCompositeNode(grammarAccess.getDictionaryEntryAccess().getFieldTypeFieldTypeParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_fieldType_2_0=ruleFieldType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDictionaryEntryRule());
                    						}
                    						set(
                    							current,
                    							"fieldType",
                    							lv_fieldType_2_0,
                    							"org.xtext.example.mydsl2.MyDsl.FieldType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:480:4: ( (lv_status_3_0= 'required' ) )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==19) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalMyDsl.g:481:5: (lv_status_3_0= 'required' )
                            {
                            // InternalMyDsl.g:481:5: (lv_status_3_0= 'required' )
                            // InternalMyDsl.g:482:6: lv_status_3_0= 'required'
                            {
                            lv_status_3_0=(Token)match(input,19,FOLLOW_17); 

                            						newLeafNode(lv_status_3_0, grammarAccess.getDictionaryEntryAccess().getStatusRequiredKeyword_0_3_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getDictionaryEntryRule());
                            						}
                            						setWithLastConsumed(current, "status", lv_status_3_0 != null, "required");
                            					

                            }


                            }
                            break;

                    }

                    // InternalMyDsl.g:494:4: ( (lv_uniqueKey_4_0= 'unique' ) )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==20) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalMyDsl.g:495:5: (lv_uniqueKey_4_0= 'unique' )
                            {
                            // InternalMyDsl.g:495:5: (lv_uniqueKey_4_0= 'unique' )
                            // InternalMyDsl.g:496:6: lv_uniqueKey_4_0= 'unique'
                            {
                            lv_uniqueKey_4_0=(Token)match(input,20,FOLLOW_2); 

                            						newLeafNode(lv_uniqueKey_4_0, grammarAccess.getDictionaryEntryAccess().getUniqueKeyUniqueKeyword_0_4_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getDictionaryEntryRule());
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
                    // InternalMyDsl.g:510:3: ( ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ':' otherlv_7= 'ref' ( (otherlv_8= RULE_ID ) ) )
                    {
                    // InternalMyDsl.g:510:3: ( ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ':' otherlv_7= 'ref' ( (otherlv_8= RULE_ID ) ) )
                    // InternalMyDsl.g:511:4: ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ':' otherlv_7= 'ref' ( (otherlv_8= RULE_ID ) )
                    {
                    // InternalMyDsl.g:511:4: ( (lv_name_5_0= RULE_ID ) )
                    // InternalMyDsl.g:512:5: (lv_name_5_0= RULE_ID )
                    {
                    // InternalMyDsl.g:512:5: (lv_name_5_0= RULE_ID )
                    // InternalMyDsl.g:513:6: lv_name_5_0= RULE_ID
                    {
                    lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_14); 

                    						newLeafNode(lv_name_5_0, grammarAccess.getDictionaryEntryAccess().getNameIDTerminalRuleCall_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDictionaryEntryRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_5_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,18,FOLLOW_18); 

                    				newLeafNode(otherlv_6, grammarAccess.getDictionaryEntryAccess().getColonKeyword_1_1());
                    			
                    otherlv_7=(Token)match(input,21,FOLLOW_11); 

                    				newLeafNode(otherlv_7, grammarAccess.getDictionaryEntryAccess().getRefKeyword_1_2());
                    			
                    // InternalMyDsl.g:537:4: ( (otherlv_8= RULE_ID ) )
                    // InternalMyDsl.g:538:5: (otherlv_8= RULE_ID )
                    {
                    // InternalMyDsl.g:538:5: (otherlv_8= RULE_ID )
                    // InternalMyDsl.g:539:6: otherlv_8= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDictionaryEntryRule());
                    						}
                    					
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_8, grammarAccess.getDictionaryEntryAccess().getRefDictionaryMakeStatementCrossReference_1_3_0());
                    					

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
    // $ANTLR end "ruleDictionaryEntry"


    // $ANTLR start "entryRuleOtherOperationStatement"
    // InternalMyDsl.g:555:1: entryRuleOtherOperationStatement returns [EObject current=null] : iv_ruleOtherOperationStatement= ruleOtherOperationStatement EOF ;
    public final EObject entryRuleOtherOperationStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOtherOperationStatement = null;


        try {
            // InternalMyDsl.g:555:64: (iv_ruleOtherOperationStatement= ruleOtherOperationStatement EOF )
            // InternalMyDsl.g:556:2: iv_ruleOtherOperationStatement= ruleOtherOperationStatement EOF
            {
             newCompositeNode(grammarAccess.getOtherOperationStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOtherOperationStatement=ruleOtherOperationStatement();

            state._fsp--;

             current =iv_ruleOtherOperationStatement; 
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
    // $ANTLR end "entryRuleOtherOperationStatement"


    // $ANTLR start "ruleOtherOperationStatement"
    // InternalMyDsl.g:562:1: ruleOtherOperationStatement returns [EObject current=null] : ( (otherlv_0= 'task:' (otherlv_1= '{' otherlv_2= 'operation:' ( (lv_type_3_0= ruleOperation ) ) otherlv_4= ',' otherlv_5= 'collection:' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'input:' otherlv_8= '{' ( ( (lv_entries_9_0= ruleTaskDictionaryEntry ) ) (otherlv_10= ',' ( (lv_entries_11_0= ruleTaskDictionaryEntry ) ) )* )? otherlv_12= '}' otherlv_13= '}' ) ) | (otherlv_14= 'task:' (otherlv_15= '{' otherlv_16= 'operation:' ( (lv_type_17_0= 'UPDATE,' ) ) otherlv_18= 'collection:' ( (otherlv_19= RULE_ID ) ) otherlv_20= 'input:' otherlv_21= '{' ( ( (lv_entries_22_0= ruleTaskDictionaryEntry ) ) (otherlv_23= ',' ( (lv_entries_24_0= ruleTaskDictionaryEntry ) ) )* )? otherlv_25= '}' (otherlv_26= ',' otherlv_27= 'update:' otherlv_28= '{' ( ( (lv_entries_29_0= ruleTaskDictionaryEntry ) ) (otherlv_30= ',' ( (lv_entries_31_0= ruleTaskDictionaryEntry ) ) )* )? otherlv_32= '}' )? otherlv_33= '}' ) ) ) ;
    public final EObject ruleOtherOperationStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token lv_type_17_0=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        AntlrDatatypeRuleToken lv_type_3_0 = null;

        EObject lv_entries_9_0 = null;

        EObject lv_entries_11_0 = null;

        EObject lv_entries_22_0 = null;

        EObject lv_entries_24_0 = null;

        EObject lv_entries_29_0 = null;

        EObject lv_entries_31_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:568:2: ( ( (otherlv_0= 'task:' (otherlv_1= '{' otherlv_2= 'operation:' ( (lv_type_3_0= ruleOperation ) ) otherlv_4= ',' otherlv_5= 'collection:' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'input:' otherlv_8= '{' ( ( (lv_entries_9_0= ruleTaskDictionaryEntry ) ) (otherlv_10= ',' ( (lv_entries_11_0= ruleTaskDictionaryEntry ) ) )* )? otherlv_12= '}' otherlv_13= '}' ) ) | (otherlv_14= 'task:' (otherlv_15= '{' otherlv_16= 'operation:' ( (lv_type_17_0= 'UPDATE,' ) ) otherlv_18= 'collection:' ( (otherlv_19= RULE_ID ) ) otherlv_20= 'input:' otherlv_21= '{' ( ( (lv_entries_22_0= ruleTaskDictionaryEntry ) ) (otherlv_23= ',' ( (lv_entries_24_0= ruleTaskDictionaryEntry ) ) )* )? otherlv_25= '}' (otherlv_26= ',' otherlv_27= 'update:' otherlv_28= '{' ( ( (lv_entries_29_0= ruleTaskDictionaryEntry ) ) (otherlv_30= ',' ( (lv_entries_31_0= ruleTaskDictionaryEntry ) ) )* )? otherlv_32= '}' )? otherlv_33= '}' ) ) ) )
            // InternalMyDsl.g:569:2: ( (otherlv_0= 'task:' (otherlv_1= '{' otherlv_2= 'operation:' ( (lv_type_3_0= ruleOperation ) ) otherlv_4= ',' otherlv_5= 'collection:' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'input:' otherlv_8= '{' ( ( (lv_entries_9_0= ruleTaskDictionaryEntry ) ) (otherlv_10= ',' ( (lv_entries_11_0= ruleTaskDictionaryEntry ) ) )* )? otherlv_12= '}' otherlv_13= '}' ) ) | (otherlv_14= 'task:' (otherlv_15= '{' otherlv_16= 'operation:' ( (lv_type_17_0= 'UPDATE,' ) ) otherlv_18= 'collection:' ( (otherlv_19= RULE_ID ) ) otherlv_20= 'input:' otherlv_21= '{' ( ( (lv_entries_22_0= ruleTaskDictionaryEntry ) ) (otherlv_23= ',' ( (lv_entries_24_0= ruleTaskDictionaryEntry ) ) )* )? otherlv_25= '}' (otherlv_26= ',' otherlv_27= 'update:' otherlv_28= '{' ( ( (lv_entries_29_0= ruleTaskDictionaryEntry ) ) (otherlv_30= ',' ( (lv_entries_31_0= ruleTaskDictionaryEntry ) ) )* )? otherlv_32= '}' )? otherlv_33= '}' ) ) )
            {
            // InternalMyDsl.g:569:2: ( (otherlv_0= 'task:' (otherlv_1= '{' otherlv_2= 'operation:' ( (lv_type_3_0= ruleOperation ) ) otherlv_4= ',' otherlv_5= 'collection:' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'input:' otherlv_8= '{' ( ( (lv_entries_9_0= ruleTaskDictionaryEntry ) ) (otherlv_10= ',' ( (lv_entries_11_0= ruleTaskDictionaryEntry ) ) )* )? otherlv_12= '}' otherlv_13= '}' ) ) | (otherlv_14= 'task:' (otherlv_15= '{' otherlv_16= 'operation:' ( (lv_type_17_0= 'UPDATE,' ) ) otherlv_18= 'collection:' ( (otherlv_19= RULE_ID ) ) otherlv_20= 'input:' otherlv_21= '{' ( ( (lv_entries_22_0= ruleTaskDictionaryEntry ) ) (otherlv_23= ',' ( (lv_entries_24_0= ruleTaskDictionaryEntry ) ) )* )? otherlv_25= '}' (otherlv_26= ',' otherlv_27= 'update:' otherlv_28= '{' ( ( (lv_entries_29_0= ruleTaskDictionaryEntry ) ) (otherlv_30= ',' ( (lv_entries_31_0= ruleTaskDictionaryEntry ) ) )* )? otherlv_32= '}' )? otherlv_33= '}' ) ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==22) ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1==12) ) {
                    int LA17_2 = input.LA(3);

                    if ( (LA17_2==23) ) {
                        int LA17_3 = input.LA(4);

                        if ( ((LA17_3>=28 && LA17_3<=30)) ) {
                            alt17=1;
                        }
                        else if ( (LA17_3==26) ) {
                            alt17=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 17, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:570:3: (otherlv_0= 'task:' (otherlv_1= '{' otherlv_2= 'operation:' ( (lv_type_3_0= ruleOperation ) ) otherlv_4= ',' otherlv_5= 'collection:' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'input:' otherlv_8= '{' ( ( (lv_entries_9_0= ruleTaskDictionaryEntry ) ) (otherlv_10= ',' ( (lv_entries_11_0= ruleTaskDictionaryEntry ) ) )* )? otherlv_12= '}' otherlv_13= '}' ) )
                    {
                    // InternalMyDsl.g:570:3: (otherlv_0= 'task:' (otherlv_1= '{' otherlv_2= 'operation:' ( (lv_type_3_0= ruleOperation ) ) otherlv_4= ',' otherlv_5= 'collection:' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'input:' otherlv_8= '{' ( ( (lv_entries_9_0= ruleTaskDictionaryEntry ) ) (otherlv_10= ',' ( (lv_entries_11_0= ruleTaskDictionaryEntry ) ) )* )? otherlv_12= '}' otherlv_13= '}' ) )
                    // InternalMyDsl.g:571:4: otherlv_0= 'task:' (otherlv_1= '{' otherlv_2= 'operation:' ( (lv_type_3_0= ruleOperation ) ) otherlv_4= ',' otherlv_5= 'collection:' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'input:' otherlv_8= '{' ( ( (lv_entries_9_0= ruleTaskDictionaryEntry ) ) (otherlv_10= ',' ( (lv_entries_11_0= ruleTaskDictionaryEntry ) ) )* )? otherlv_12= '}' otherlv_13= '}' )
                    {
                    otherlv_0=(Token)match(input,22,FOLLOW_6); 

                    				newLeafNode(otherlv_0, grammarAccess.getOtherOperationStatementAccess().getTaskKeyword_0_0());
                    			
                    // InternalMyDsl.g:575:4: (otherlv_1= '{' otherlv_2= 'operation:' ( (lv_type_3_0= ruleOperation ) ) otherlv_4= ',' otherlv_5= 'collection:' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'input:' otherlv_8= '{' ( ( (lv_entries_9_0= ruleTaskDictionaryEntry ) ) (otherlv_10= ',' ( (lv_entries_11_0= ruleTaskDictionaryEntry ) ) )* )? otherlv_12= '}' otherlv_13= '}' )
                    // InternalMyDsl.g:576:5: otherlv_1= '{' otherlv_2= 'operation:' ( (lv_type_3_0= ruleOperation ) ) otherlv_4= ',' otherlv_5= 'collection:' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'input:' otherlv_8= '{' ( ( (lv_entries_9_0= ruleTaskDictionaryEntry ) ) (otherlv_10= ',' ( (lv_entries_11_0= ruleTaskDictionaryEntry ) ) )* )? otherlv_12= '}' otherlv_13= '}'
                    {
                    otherlv_1=(Token)match(input,12,FOLLOW_19); 

                    					newLeafNode(otherlv_1, grammarAccess.getOtherOperationStatementAccess().getLeftCurlyBracketKeyword_0_1_0());
                    				
                    otherlv_2=(Token)match(input,23,FOLLOW_20); 

                    					newLeafNode(otherlv_2, grammarAccess.getOtherOperationStatementAccess().getOperationKeyword_0_1_1());
                    				
                    // InternalMyDsl.g:584:5: ( (lv_type_3_0= ruleOperation ) )
                    // InternalMyDsl.g:585:6: (lv_type_3_0= ruleOperation )
                    {
                    // InternalMyDsl.g:585:6: (lv_type_3_0= ruleOperation )
                    // InternalMyDsl.g:586:7: lv_type_3_0= ruleOperation
                    {

                    							newCompositeNode(grammarAccess.getOtherOperationStatementAccess().getTypeOperationParserRuleCall_0_1_2_0());
                    						
                    pushFollow(FOLLOW_9);
                    lv_type_3_0=ruleOperation();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getOtherOperationStatementRule());
                    							}
                    							set(
                    								current,
                    								"type",
                    								lv_type_3_0,
                    								"org.xtext.example.mydsl2.MyDsl.Operation");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_4=(Token)match(input,14,FOLLOW_21); 

                    					newLeafNode(otherlv_4, grammarAccess.getOtherOperationStatementAccess().getCommaKeyword_0_1_3());
                    				
                    otherlv_5=(Token)match(input,24,FOLLOW_11); 

                    					newLeafNode(otherlv_5, grammarAccess.getOtherOperationStatementAccess().getCollectionKeyword_0_1_4());
                    				
                    // InternalMyDsl.g:611:5: ( (otherlv_6= RULE_ID ) )
                    // InternalMyDsl.g:612:6: (otherlv_6= RULE_ID )
                    {
                    // InternalMyDsl.g:612:6: (otherlv_6= RULE_ID )
                    // InternalMyDsl.g:613:7: otherlv_6= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getOtherOperationStatementRule());
                    							}
                    						
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_22); 

                    							newLeafNode(otherlv_6, grammarAccess.getOtherOperationStatementAccess().getCollectionMakeStatementCrossReference_0_1_5_0());
                    						

                    }


                    }

                    otherlv_7=(Token)match(input,25,FOLLOW_6); 

                    					newLeafNode(otherlv_7, grammarAccess.getOtherOperationStatementAccess().getInputKeyword_0_1_6());
                    				
                    otherlv_8=(Token)match(input,12,FOLLOW_12); 

                    					newLeafNode(otherlv_8, grammarAccess.getOtherOperationStatementAccess().getLeftCurlyBracketKeyword_0_1_7());
                    				
                    // InternalMyDsl.g:632:5: ( ( (lv_entries_9_0= ruleTaskDictionaryEntry ) ) (otherlv_10= ',' ( (lv_entries_11_0= ruleTaskDictionaryEntry ) ) )* )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==RULE_ID) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalMyDsl.g:633:6: ( (lv_entries_9_0= ruleTaskDictionaryEntry ) ) (otherlv_10= ',' ( (lv_entries_11_0= ruleTaskDictionaryEntry ) ) )*
                            {
                            // InternalMyDsl.g:633:6: ( (lv_entries_9_0= ruleTaskDictionaryEntry ) )
                            // InternalMyDsl.g:634:7: (lv_entries_9_0= ruleTaskDictionaryEntry )
                            {
                            // InternalMyDsl.g:634:7: (lv_entries_9_0= ruleTaskDictionaryEntry )
                            // InternalMyDsl.g:635:8: lv_entries_9_0= ruleTaskDictionaryEntry
                            {

                            								newCompositeNode(grammarAccess.getOtherOperationStatementAccess().getEntriesTaskDictionaryEntryParserRuleCall_0_1_8_0_0());
                            							
                            pushFollow(FOLLOW_13);
                            lv_entries_9_0=ruleTaskDictionaryEntry();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getOtherOperationStatementRule());
                            								}
                            								add(
                            									current,
                            									"entries",
                            									lv_entries_9_0,
                            									"org.xtext.example.mydsl2.MyDsl.TaskDictionaryEntry");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }

                            // InternalMyDsl.g:652:6: (otherlv_10= ',' ( (lv_entries_11_0= ruleTaskDictionaryEntry ) ) )*
                            loop10:
                            do {
                                int alt10=2;
                                int LA10_0 = input.LA(1);

                                if ( (LA10_0==14) ) {
                                    alt10=1;
                                }


                                switch (alt10) {
                            	case 1 :
                            	    // InternalMyDsl.g:653:7: otherlv_10= ',' ( (lv_entries_11_0= ruleTaskDictionaryEntry ) )
                            	    {
                            	    otherlv_10=(Token)match(input,14,FOLLOW_11); 

                            	    							newLeafNode(otherlv_10, grammarAccess.getOtherOperationStatementAccess().getCommaKeyword_0_1_8_1_0());
                            	    						
                            	    // InternalMyDsl.g:657:7: ( (lv_entries_11_0= ruleTaskDictionaryEntry ) )
                            	    // InternalMyDsl.g:658:8: (lv_entries_11_0= ruleTaskDictionaryEntry )
                            	    {
                            	    // InternalMyDsl.g:658:8: (lv_entries_11_0= ruleTaskDictionaryEntry )
                            	    // InternalMyDsl.g:659:9: lv_entries_11_0= ruleTaskDictionaryEntry
                            	    {

                            	    									newCompositeNode(grammarAccess.getOtherOperationStatementAccess().getEntriesTaskDictionaryEntryParserRuleCall_0_1_8_1_1_0());
                            	    								
                            	    pushFollow(FOLLOW_13);
                            	    lv_entries_11_0=ruleTaskDictionaryEntry();

                            	    state._fsp--;


                            	    									if (current==null) {
                            	    										current = createModelElementForParent(grammarAccess.getOtherOperationStatementRule());
                            	    									}
                            	    									add(
                            	    										current,
                            	    										"entries",
                            	    										lv_entries_11_0,
                            	    										"org.xtext.example.mydsl2.MyDsl.TaskDictionaryEntry");
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

                    otherlv_12=(Token)match(input,16,FOLLOW_10); 

                    					newLeafNode(otherlv_12, grammarAccess.getOtherOperationStatementAccess().getRightCurlyBracketKeyword_0_1_9());
                    				
                    otherlv_13=(Token)match(input,16,FOLLOW_2); 

                    					newLeafNode(otherlv_13, grammarAccess.getOtherOperationStatementAccess().getRightCurlyBracketKeyword_0_1_10());
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:689:3: (otherlv_14= 'task:' (otherlv_15= '{' otherlv_16= 'operation:' ( (lv_type_17_0= 'UPDATE,' ) ) otherlv_18= 'collection:' ( (otherlv_19= RULE_ID ) ) otherlv_20= 'input:' otherlv_21= '{' ( ( (lv_entries_22_0= ruleTaskDictionaryEntry ) ) (otherlv_23= ',' ( (lv_entries_24_0= ruleTaskDictionaryEntry ) ) )* )? otherlv_25= '}' (otherlv_26= ',' otherlv_27= 'update:' otherlv_28= '{' ( ( (lv_entries_29_0= ruleTaskDictionaryEntry ) ) (otherlv_30= ',' ( (lv_entries_31_0= ruleTaskDictionaryEntry ) ) )* )? otherlv_32= '}' )? otherlv_33= '}' ) )
                    {
                    // InternalMyDsl.g:689:3: (otherlv_14= 'task:' (otherlv_15= '{' otherlv_16= 'operation:' ( (lv_type_17_0= 'UPDATE,' ) ) otherlv_18= 'collection:' ( (otherlv_19= RULE_ID ) ) otherlv_20= 'input:' otherlv_21= '{' ( ( (lv_entries_22_0= ruleTaskDictionaryEntry ) ) (otherlv_23= ',' ( (lv_entries_24_0= ruleTaskDictionaryEntry ) ) )* )? otherlv_25= '}' (otherlv_26= ',' otherlv_27= 'update:' otherlv_28= '{' ( ( (lv_entries_29_0= ruleTaskDictionaryEntry ) ) (otherlv_30= ',' ( (lv_entries_31_0= ruleTaskDictionaryEntry ) ) )* )? otherlv_32= '}' )? otherlv_33= '}' ) )
                    // InternalMyDsl.g:690:4: otherlv_14= 'task:' (otherlv_15= '{' otherlv_16= 'operation:' ( (lv_type_17_0= 'UPDATE,' ) ) otherlv_18= 'collection:' ( (otherlv_19= RULE_ID ) ) otherlv_20= 'input:' otherlv_21= '{' ( ( (lv_entries_22_0= ruleTaskDictionaryEntry ) ) (otherlv_23= ',' ( (lv_entries_24_0= ruleTaskDictionaryEntry ) ) )* )? otherlv_25= '}' (otherlv_26= ',' otherlv_27= 'update:' otherlv_28= '{' ( ( (lv_entries_29_0= ruleTaskDictionaryEntry ) ) (otherlv_30= ',' ( (lv_entries_31_0= ruleTaskDictionaryEntry ) ) )* )? otherlv_32= '}' )? otherlv_33= '}' )
                    {
                    otherlv_14=(Token)match(input,22,FOLLOW_6); 

                    				newLeafNode(otherlv_14, grammarAccess.getOtherOperationStatementAccess().getTaskKeyword_1_0());
                    			
                    // InternalMyDsl.g:694:4: (otherlv_15= '{' otherlv_16= 'operation:' ( (lv_type_17_0= 'UPDATE,' ) ) otherlv_18= 'collection:' ( (otherlv_19= RULE_ID ) ) otherlv_20= 'input:' otherlv_21= '{' ( ( (lv_entries_22_0= ruleTaskDictionaryEntry ) ) (otherlv_23= ',' ( (lv_entries_24_0= ruleTaskDictionaryEntry ) ) )* )? otherlv_25= '}' (otherlv_26= ',' otherlv_27= 'update:' otherlv_28= '{' ( ( (lv_entries_29_0= ruleTaskDictionaryEntry ) ) (otherlv_30= ',' ( (lv_entries_31_0= ruleTaskDictionaryEntry ) ) )* )? otherlv_32= '}' )? otherlv_33= '}' )
                    // InternalMyDsl.g:695:5: otherlv_15= '{' otherlv_16= 'operation:' ( (lv_type_17_0= 'UPDATE,' ) ) otherlv_18= 'collection:' ( (otherlv_19= RULE_ID ) ) otherlv_20= 'input:' otherlv_21= '{' ( ( (lv_entries_22_0= ruleTaskDictionaryEntry ) ) (otherlv_23= ',' ( (lv_entries_24_0= ruleTaskDictionaryEntry ) ) )* )? otherlv_25= '}' (otherlv_26= ',' otherlv_27= 'update:' otherlv_28= '{' ( ( (lv_entries_29_0= ruleTaskDictionaryEntry ) ) (otherlv_30= ',' ( (lv_entries_31_0= ruleTaskDictionaryEntry ) ) )* )? otherlv_32= '}' )? otherlv_33= '}'
                    {
                    otherlv_15=(Token)match(input,12,FOLLOW_19); 

                    					newLeafNode(otherlv_15, grammarAccess.getOtherOperationStatementAccess().getLeftCurlyBracketKeyword_1_1_0());
                    				
                    otherlv_16=(Token)match(input,23,FOLLOW_23); 

                    					newLeafNode(otherlv_16, grammarAccess.getOtherOperationStatementAccess().getOperationKeyword_1_1_1());
                    				
                    // InternalMyDsl.g:703:5: ( (lv_type_17_0= 'UPDATE,' ) )
                    // InternalMyDsl.g:704:6: (lv_type_17_0= 'UPDATE,' )
                    {
                    // InternalMyDsl.g:704:6: (lv_type_17_0= 'UPDATE,' )
                    // InternalMyDsl.g:705:7: lv_type_17_0= 'UPDATE,'
                    {
                    lv_type_17_0=(Token)match(input,26,FOLLOW_21); 

                    							newLeafNode(lv_type_17_0, grammarAccess.getOtherOperationStatementAccess().getTypeUPDATEKeyword_1_1_2_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getOtherOperationStatementRule());
                    							}
                    							setWithLastConsumed(current, "type", lv_type_17_0, "UPDATE,");
                    						

                    }


                    }

                    otherlv_18=(Token)match(input,24,FOLLOW_11); 

                    					newLeafNode(otherlv_18, grammarAccess.getOtherOperationStatementAccess().getCollectionKeyword_1_1_3());
                    				
                    // InternalMyDsl.g:721:5: ( (otherlv_19= RULE_ID ) )
                    // InternalMyDsl.g:722:6: (otherlv_19= RULE_ID )
                    {
                    // InternalMyDsl.g:722:6: (otherlv_19= RULE_ID )
                    // InternalMyDsl.g:723:7: otherlv_19= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getOtherOperationStatementRule());
                    							}
                    						
                    otherlv_19=(Token)match(input,RULE_ID,FOLLOW_22); 

                    							newLeafNode(otherlv_19, grammarAccess.getOtherOperationStatementAccess().getCollectionMakeStatementCrossReference_1_1_4_0());
                    						

                    }


                    }

                    otherlv_20=(Token)match(input,25,FOLLOW_6); 

                    					newLeafNode(otherlv_20, grammarAccess.getOtherOperationStatementAccess().getInputKeyword_1_1_5());
                    				
                    otherlv_21=(Token)match(input,12,FOLLOW_12); 

                    					newLeafNode(otherlv_21, grammarAccess.getOtherOperationStatementAccess().getLeftCurlyBracketKeyword_1_1_6());
                    				
                    // InternalMyDsl.g:742:5: ( ( (lv_entries_22_0= ruleTaskDictionaryEntry ) ) (otherlv_23= ',' ( (lv_entries_24_0= ruleTaskDictionaryEntry ) ) )* )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==RULE_ID) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalMyDsl.g:743:6: ( (lv_entries_22_0= ruleTaskDictionaryEntry ) ) (otherlv_23= ',' ( (lv_entries_24_0= ruleTaskDictionaryEntry ) ) )*
                            {
                            // InternalMyDsl.g:743:6: ( (lv_entries_22_0= ruleTaskDictionaryEntry ) )
                            // InternalMyDsl.g:744:7: (lv_entries_22_0= ruleTaskDictionaryEntry )
                            {
                            // InternalMyDsl.g:744:7: (lv_entries_22_0= ruleTaskDictionaryEntry )
                            // InternalMyDsl.g:745:8: lv_entries_22_0= ruleTaskDictionaryEntry
                            {

                            								newCompositeNode(grammarAccess.getOtherOperationStatementAccess().getEntriesTaskDictionaryEntryParserRuleCall_1_1_7_0_0());
                            							
                            pushFollow(FOLLOW_13);
                            lv_entries_22_0=ruleTaskDictionaryEntry();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getOtherOperationStatementRule());
                            								}
                            								add(
                            									current,
                            									"entries",
                            									lv_entries_22_0,
                            									"org.xtext.example.mydsl2.MyDsl.TaskDictionaryEntry");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }

                            // InternalMyDsl.g:762:6: (otherlv_23= ',' ( (lv_entries_24_0= ruleTaskDictionaryEntry ) ) )*
                            loop12:
                            do {
                                int alt12=2;
                                int LA12_0 = input.LA(1);

                                if ( (LA12_0==14) ) {
                                    alt12=1;
                                }


                                switch (alt12) {
                            	case 1 :
                            	    // InternalMyDsl.g:763:7: otherlv_23= ',' ( (lv_entries_24_0= ruleTaskDictionaryEntry ) )
                            	    {
                            	    otherlv_23=(Token)match(input,14,FOLLOW_11); 

                            	    							newLeafNode(otherlv_23, grammarAccess.getOtherOperationStatementAccess().getCommaKeyword_1_1_7_1_0());
                            	    						
                            	    // InternalMyDsl.g:767:7: ( (lv_entries_24_0= ruleTaskDictionaryEntry ) )
                            	    // InternalMyDsl.g:768:8: (lv_entries_24_0= ruleTaskDictionaryEntry )
                            	    {
                            	    // InternalMyDsl.g:768:8: (lv_entries_24_0= ruleTaskDictionaryEntry )
                            	    // InternalMyDsl.g:769:9: lv_entries_24_0= ruleTaskDictionaryEntry
                            	    {

                            	    									newCompositeNode(grammarAccess.getOtherOperationStatementAccess().getEntriesTaskDictionaryEntryParserRuleCall_1_1_7_1_1_0());
                            	    								
                            	    pushFollow(FOLLOW_13);
                            	    lv_entries_24_0=ruleTaskDictionaryEntry();

                            	    state._fsp--;


                            	    									if (current==null) {
                            	    										current = createModelElementForParent(grammarAccess.getOtherOperationStatementRule());
                            	    									}
                            	    									add(
                            	    										current,
                            	    										"entries",
                            	    										lv_entries_24_0,
                            	    										"org.xtext.example.mydsl2.MyDsl.TaskDictionaryEntry");
                            	    									afterParserOrEnumRuleCall();
                            	    								

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop12;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_25=(Token)match(input,16,FOLLOW_13); 

                    					newLeafNode(otherlv_25, grammarAccess.getOtherOperationStatementAccess().getRightCurlyBracketKeyword_1_1_8());
                    				
                    // InternalMyDsl.g:792:5: (otherlv_26= ',' otherlv_27= 'update:' otherlv_28= '{' ( ( (lv_entries_29_0= ruleTaskDictionaryEntry ) ) (otherlv_30= ',' ( (lv_entries_31_0= ruleTaskDictionaryEntry ) ) )* )? otherlv_32= '}' )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==14) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalMyDsl.g:793:6: otherlv_26= ',' otherlv_27= 'update:' otherlv_28= '{' ( ( (lv_entries_29_0= ruleTaskDictionaryEntry ) ) (otherlv_30= ',' ( (lv_entries_31_0= ruleTaskDictionaryEntry ) ) )* )? otherlv_32= '}'
                            {
                            otherlv_26=(Token)match(input,14,FOLLOW_24); 

                            						newLeafNode(otherlv_26, grammarAccess.getOtherOperationStatementAccess().getCommaKeyword_1_1_9_0());
                            					
                            otherlv_27=(Token)match(input,27,FOLLOW_6); 

                            						newLeafNode(otherlv_27, grammarAccess.getOtherOperationStatementAccess().getUpdateKeyword_1_1_9_1());
                            					
                            otherlv_28=(Token)match(input,12,FOLLOW_12); 

                            						newLeafNode(otherlv_28, grammarAccess.getOtherOperationStatementAccess().getLeftCurlyBracketKeyword_1_1_9_2());
                            					
                            // InternalMyDsl.g:805:6: ( ( (lv_entries_29_0= ruleTaskDictionaryEntry ) ) (otherlv_30= ',' ( (lv_entries_31_0= ruleTaskDictionaryEntry ) ) )* )?
                            int alt15=2;
                            int LA15_0 = input.LA(1);

                            if ( (LA15_0==RULE_ID) ) {
                                alt15=1;
                            }
                            switch (alt15) {
                                case 1 :
                                    // InternalMyDsl.g:806:7: ( (lv_entries_29_0= ruleTaskDictionaryEntry ) ) (otherlv_30= ',' ( (lv_entries_31_0= ruleTaskDictionaryEntry ) ) )*
                                    {
                                    // InternalMyDsl.g:806:7: ( (lv_entries_29_0= ruleTaskDictionaryEntry ) )
                                    // InternalMyDsl.g:807:8: (lv_entries_29_0= ruleTaskDictionaryEntry )
                                    {
                                    // InternalMyDsl.g:807:8: (lv_entries_29_0= ruleTaskDictionaryEntry )
                                    // InternalMyDsl.g:808:9: lv_entries_29_0= ruleTaskDictionaryEntry
                                    {

                                    									newCompositeNode(grammarAccess.getOtherOperationStatementAccess().getEntriesTaskDictionaryEntryParserRuleCall_1_1_9_3_0_0());
                                    								
                                    pushFollow(FOLLOW_13);
                                    lv_entries_29_0=ruleTaskDictionaryEntry();

                                    state._fsp--;


                                    									if (current==null) {
                                    										current = createModelElementForParent(grammarAccess.getOtherOperationStatementRule());
                                    									}
                                    									add(
                                    										current,
                                    										"entries",
                                    										lv_entries_29_0,
                                    										"org.xtext.example.mydsl2.MyDsl.TaskDictionaryEntry");
                                    									afterParserOrEnumRuleCall();
                                    								

                                    }


                                    }

                                    // InternalMyDsl.g:825:7: (otherlv_30= ',' ( (lv_entries_31_0= ruleTaskDictionaryEntry ) ) )*
                                    loop14:
                                    do {
                                        int alt14=2;
                                        int LA14_0 = input.LA(1);

                                        if ( (LA14_0==14) ) {
                                            alt14=1;
                                        }


                                        switch (alt14) {
                                    	case 1 :
                                    	    // InternalMyDsl.g:826:8: otherlv_30= ',' ( (lv_entries_31_0= ruleTaskDictionaryEntry ) )
                                    	    {
                                    	    otherlv_30=(Token)match(input,14,FOLLOW_11); 

                                    	    								newLeafNode(otherlv_30, grammarAccess.getOtherOperationStatementAccess().getCommaKeyword_1_1_9_3_1_0());
                                    	    							
                                    	    // InternalMyDsl.g:830:8: ( (lv_entries_31_0= ruleTaskDictionaryEntry ) )
                                    	    // InternalMyDsl.g:831:9: (lv_entries_31_0= ruleTaskDictionaryEntry )
                                    	    {
                                    	    // InternalMyDsl.g:831:9: (lv_entries_31_0= ruleTaskDictionaryEntry )
                                    	    // InternalMyDsl.g:832:10: lv_entries_31_0= ruleTaskDictionaryEntry
                                    	    {

                                    	    										newCompositeNode(grammarAccess.getOtherOperationStatementAccess().getEntriesTaskDictionaryEntryParserRuleCall_1_1_9_3_1_1_0());
                                    	    									
                                    	    pushFollow(FOLLOW_13);
                                    	    lv_entries_31_0=ruleTaskDictionaryEntry();

                                    	    state._fsp--;


                                    	    										if (current==null) {
                                    	    											current = createModelElementForParent(grammarAccess.getOtherOperationStatementRule());
                                    	    										}
                                    	    										add(
                                    	    											current,
                                    	    											"entries",
                                    	    											lv_entries_31_0,
                                    	    											"org.xtext.example.mydsl2.MyDsl.TaskDictionaryEntry");
                                    	    										afterParserOrEnumRuleCall();
                                    	    									

                                    	    }


                                    	    }


                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop14;
                                        }
                                    } while (true);


                                    }
                                    break;

                            }

                            otherlv_32=(Token)match(input,16,FOLLOW_10); 

                            						newLeafNode(otherlv_32, grammarAccess.getOtherOperationStatementAccess().getRightCurlyBracketKeyword_1_1_9_4());
                            					

                            }
                            break;

                    }

                    otherlv_33=(Token)match(input,16,FOLLOW_2); 

                    					newLeafNode(otherlv_33, grammarAccess.getOtherOperationStatementAccess().getRightCurlyBracketKeyword_1_1_10());
                    				

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
    // $ANTLR end "ruleOtherOperationStatement"


    // $ANTLR start "entryRuleTaskDictionaryEntry"
    // InternalMyDsl.g:866:1: entryRuleTaskDictionaryEntry returns [EObject current=null] : iv_ruleTaskDictionaryEntry= ruleTaskDictionaryEntry EOF ;
    public final EObject entryRuleTaskDictionaryEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskDictionaryEntry = null;


        try {
            // InternalMyDsl.g:866:60: (iv_ruleTaskDictionaryEntry= ruleTaskDictionaryEntry EOF )
            // InternalMyDsl.g:867:2: iv_ruleTaskDictionaryEntry= ruleTaskDictionaryEntry EOF
            {
             newCompositeNode(grammarAccess.getTaskDictionaryEntryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTaskDictionaryEntry=ruleTaskDictionaryEntry();

            state._fsp--;

             current =iv_ruleTaskDictionaryEntry; 
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
    // $ANTLR end "entryRuleTaskDictionaryEntry"


    // $ANTLR start "ruleTaskDictionaryEntry"
    // InternalMyDsl.g:873:1: ruleTaskDictionaryEntry returns [EObject current=null] : ( ( (lv_valueName_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_valueString_2_0= RULE_STRING ) ) | ( (lv_valueInt_3_0= RULE_INT ) ) ) ) ;
    public final EObject ruleTaskDictionaryEntry() throws RecognitionException {
        EObject current = null;

        Token lv_valueName_0_0=null;
        Token otherlv_1=null;
        Token lv_valueString_2_0=null;
        Token lv_valueInt_3_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:879:2: ( ( ( (lv_valueName_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_valueString_2_0= RULE_STRING ) ) | ( (lv_valueInt_3_0= RULE_INT ) ) ) ) )
            // InternalMyDsl.g:880:2: ( ( (lv_valueName_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_valueString_2_0= RULE_STRING ) ) | ( (lv_valueInt_3_0= RULE_INT ) ) ) )
            {
            // InternalMyDsl.g:880:2: ( ( (lv_valueName_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_valueString_2_0= RULE_STRING ) ) | ( (lv_valueInt_3_0= RULE_INT ) ) ) )
            // InternalMyDsl.g:881:3: ( (lv_valueName_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_valueString_2_0= RULE_STRING ) ) | ( (lv_valueInt_3_0= RULE_INT ) ) )
            {
            // InternalMyDsl.g:881:3: ( (lv_valueName_0_0= RULE_ID ) )
            // InternalMyDsl.g:882:4: (lv_valueName_0_0= RULE_ID )
            {
            // InternalMyDsl.g:882:4: (lv_valueName_0_0= RULE_ID )
            // InternalMyDsl.g:883:5: lv_valueName_0_0= RULE_ID
            {
            lv_valueName_0_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_valueName_0_0, grammarAccess.getTaskDictionaryEntryAccess().getValueNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskDictionaryEntryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"valueName",
            						lv_valueName_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_25); 

            			newLeafNode(otherlv_1, grammarAccess.getTaskDictionaryEntryAccess().getColonKeyword_1());
            		
            // InternalMyDsl.g:903:3: ( ( (lv_valueString_2_0= RULE_STRING ) ) | ( (lv_valueInt_3_0= RULE_INT ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_STRING) ) {
                alt18=1;
            }
            else if ( (LA18_0==RULE_INT) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalMyDsl.g:904:4: ( (lv_valueString_2_0= RULE_STRING ) )
                    {
                    // InternalMyDsl.g:904:4: ( (lv_valueString_2_0= RULE_STRING ) )
                    // InternalMyDsl.g:905:5: (lv_valueString_2_0= RULE_STRING )
                    {
                    // InternalMyDsl.g:905:5: (lv_valueString_2_0= RULE_STRING )
                    // InternalMyDsl.g:906:6: lv_valueString_2_0= RULE_STRING
                    {
                    lv_valueString_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_valueString_2_0, grammarAccess.getTaskDictionaryEntryAccess().getValueStringSTRINGTerminalRuleCall_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTaskDictionaryEntryRule());
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
                    // InternalMyDsl.g:923:4: ( (lv_valueInt_3_0= RULE_INT ) )
                    {
                    // InternalMyDsl.g:923:4: ( (lv_valueInt_3_0= RULE_INT ) )
                    // InternalMyDsl.g:924:5: (lv_valueInt_3_0= RULE_INT )
                    {
                    // InternalMyDsl.g:924:5: (lv_valueInt_3_0= RULE_INT )
                    // InternalMyDsl.g:925:6: lv_valueInt_3_0= RULE_INT
                    {
                    lv_valueInt_3_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_valueInt_3_0, grammarAccess.getTaskDictionaryEntryAccess().getValueIntINTTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTaskDictionaryEntryRule());
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
    // $ANTLR end "ruleTaskDictionaryEntry"


    // $ANTLR start "entryRuleOperation"
    // InternalMyDsl.g:946:1: entryRuleOperation returns [String current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final String entryRuleOperation() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOperation = null;


        try {
            // InternalMyDsl.g:946:49: (iv_ruleOperation= ruleOperation EOF )
            // InternalMyDsl.g:947:2: iv_ruleOperation= ruleOperation EOF
            {
             newCompositeNode(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperation=ruleOperation();

            state._fsp--;

             current =iv_ruleOperation.getText(); 
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
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // InternalMyDsl.g:953:1: ruleOperation returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'GET' | kw= 'DELETE' | kw= 'INSERT' ) ;
    public final AntlrDatatypeRuleToken ruleOperation() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:959:2: ( (kw= 'GET' | kw= 'DELETE' | kw= 'INSERT' ) )
            // InternalMyDsl.g:960:2: (kw= 'GET' | kw= 'DELETE' | kw= 'INSERT' )
            {
            // InternalMyDsl.g:960:2: (kw= 'GET' | kw= 'DELETE' | kw= 'INSERT' )
            int alt19=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt19=1;
                }
                break;
            case 29:
                {
                alt19=2;
                }
                break;
            case 30:
                {
                alt19=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalMyDsl.g:961:3: kw= 'GET'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOperationAccess().getGETKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:967:3: kw= 'DELETE'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOperationAccess().getDELETEKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:973:3: kw= 'INSERT'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOperationAccess().getINSERTKeyword_2());
                    		

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


    // $ANTLR start "entryRuleFieldType"
    // InternalMyDsl.g:982:1: entryRuleFieldType returns [String current=null] : iv_ruleFieldType= ruleFieldType EOF ;
    public final String entryRuleFieldType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFieldType = null;


        try {
            // InternalMyDsl.g:982:49: (iv_ruleFieldType= ruleFieldType EOF )
            // InternalMyDsl.g:983:2: iv_ruleFieldType= ruleFieldType EOF
            {
             newCompositeNode(grammarAccess.getFieldTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFieldType=ruleFieldType();

            state._fsp--;

             current =iv_ruleFieldType.getText(); 
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
    // $ANTLR end "entryRuleFieldType"


    // $ANTLR start "ruleFieldType"
    // InternalMyDsl.g:989:1: ruleFieldType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'String' | kw= 'Number' | kw= 'Boolean' | kw= 'Date' ) ;
    public final AntlrDatatypeRuleToken ruleFieldType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:995:2: ( (kw= 'String' | kw= 'Number' | kw= 'Boolean' | kw= 'Date' ) )
            // InternalMyDsl.g:996:2: (kw= 'String' | kw= 'Number' | kw= 'Boolean' | kw= 'Date' )
            {
            // InternalMyDsl.g:996:2: (kw= 'String' | kw= 'Number' | kw= 'Boolean' | kw= 'Date' )
            int alt20=4;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt20=1;
                }
                break;
            case 32:
                {
                alt20=2;
                }
                break;
            case 33:
                {
                alt20=3;
                }
                break;
            case 34:
                {
                alt20=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalMyDsl.g:997:3: kw= 'String'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getFieldTypeAccess().getStringKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1003:3: kw= 'Number'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getFieldTypeAccess().getNumberKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1009:3: kw= 'Boolean'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getFieldTypeAccess().getBooleanKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1015:3: kw= 'Date'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getFieldTypeAccess().getDateKeyword_3());
                    		

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
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000780000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000070000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000050L});

}
