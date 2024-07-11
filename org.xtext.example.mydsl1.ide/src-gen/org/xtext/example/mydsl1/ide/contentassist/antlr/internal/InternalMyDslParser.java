package org.xtext.example.mydsl1.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl1.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'GET'", "'DELETE'", "'INSERT'", "'String'", "'Number'", "'Boolean'", "'Date'", "'DatabaseParameters'", "'{'", "'Connection'", "','", "'databaseName'", "'}'", "'Collection'", "':'", "'ref'", "'task'", "'operation:'", "'collection:'", "'input:'", "'},'", "'update:'", "'required'", "'unique'", "'UPDATE'"
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

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleMongoDB"
    // InternalMyDsl.g:53:1: entryRuleMongoDB : ruleMongoDB EOF ;
    public final void entryRuleMongoDB() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleMongoDB EOF )
            // InternalMyDsl.g:55:1: ruleMongoDB EOF
            {
             before(grammarAccess.getMongoDBRule()); 
            pushFollow(FOLLOW_1);
            ruleMongoDB();

            state._fsp--;

             after(grammarAccess.getMongoDBRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMongoDB"


    // $ANTLR start "ruleMongoDB"
    // InternalMyDsl.g:62:1: ruleMongoDB : ( ( rule__MongoDB__ModelsAssignment )* ) ;
    public final void ruleMongoDB() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__MongoDB__ModelsAssignment )* ) )
            // InternalMyDsl.g:67:2: ( ( rule__MongoDB__ModelsAssignment )* )
            {
            // InternalMyDsl.g:67:2: ( ( rule__MongoDB__ModelsAssignment )* )
            // InternalMyDsl.g:68:3: ( rule__MongoDB__ModelsAssignment )*
            {
             before(grammarAccess.getMongoDBAccess().getModelsAssignment()); 
            // InternalMyDsl.g:69:3: ( rule__MongoDB__ModelsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==18||LA1_0==22) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:69:4: rule__MongoDB__ModelsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__MongoDB__ModelsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getMongoDBAccess().getModelsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMongoDB"


    // $ANTLR start "entryRuleModel"
    // InternalMyDsl.g:78:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleModel EOF )
            // InternalMyDsl.g:80:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMyDsl.g:87:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__Model__Group__0 ) )
            // InternalMyDsl.g:93:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalMyDsl.g:94:3: ( rule__Model__Group__0 )
            // InternalMyDsl.g:94:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleCRUDOperationAndCollectionSchema"
    // InternalMyDsl.g:103:1: entryRuleCRUDOperationAndCollectionSchema : ruleCRUDOperationAndCollectionSchema EOF ;
    public final void entryRuleCRUDOperationAndCollectionSchema() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleCRUDOperationAndCollectionSchema EOF )
            // InternalMyDsl.g:105:1: ruleCRUDOperationAndCollectionSchema EOF
            {
             before(grammarAccess.getCRUDOperationAndCollectionSchemaRule()); 
            pushFollow(FOLLOW_1);
            ruleCRUDOperationAndCollectionSchema();

            state._fsp--;

             after(grammarAccess.getCRUDOperationAndCollectionSchemaRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCRUDOperationAndCollectionSchema"


    // $ANTLR start "ruleCRUDOperationAndCollectionSchema"
    // InternalMyDsl.g:112:1: ruleCRUDOperationAndCollectionSchema : ( ( rule__CRUDOperationAndCollectionSchema__Group__0 ) ) ;
    public final void ruleCRUDOperationAndCollectionSchema() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__CRUDOperationAndCollectionSchema__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__CRUDOperationAndCollectionSchema__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__CRUDOperationAndCollectionSchema__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__CRUDOperationAndCollectionSchema__Group__0 )
            {
             before(grammarAccess.getCRUDOperationAndCollectionSchemaAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__CRUDOperationAndCollectionSchema__Group__0 )
            // InternalMyDsl.g:119:4: rule__CRUDOperationAndCollectionSchema__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CRUDOperationAndCollectionSchema__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCRUDOperationAndCollectionSchemaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCRUDOperationAndCollectionSchema"


    // $ANTLR start "entryRuleConnectionStatement"
    // InternalMyDsl.g:128:1: entryRuleConnectionStatement : ruleConnectionStatement EOF ;
    public final void entryRuleConnectionStatement() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleConnectionStatement EOF )
            // InternalMyDsl.g:130:1: ruleConnectionStatement EOF
            {
             before(grammarAccess.getConnectionStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleConnectionStatement();

            state._fsp--;

             after(grammarAccess.getConnectionStatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConnectionStatement"


    // $ANTLR start "ruleConnectionStatement"
    // InternalMyDsl.g:137:1: ruleConnectionStatement : ( ( rule__ConnectionStatement__UnorderedGroup ) ) ;
    public final void ruleConnectionStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__ConnectionStatement__UnorderedGroup ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__ConnectionStatement__UnorderedGroup ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__ConnectionStatement__UnorderedGroup ) )
            // InternalMyDsl.g:143:3: ( rule__ConnectionStatement__UnorderedGroup )
            {
             before(grammarAccess.getConnectionStatementAccess().getUnorderedGroup()); 
            // InternalMyDsl.g:144:3: ( rule__ConnectionStatement__UnorderedGroup )
            // InternalMyDsl.g:144:4: rule__ConnectionStatement__UnorderedGroup
            {
            pushFollow(FOLLOW_2);
            rule__ConnectionStatement__UnorderedGroup();

            state._fsp--;


            }

             after(grammarAccess.getConnectionStatementAccess().getUnorderedGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConnectionStatement"


    // $ANTLR start "entryRuleCollectionSchema"
    // InternalMyDsl.g:153:1: entryRuleCollectionSchema : ruleCollectionSchema EOF ;
    public final void entryRuleCollectionSchema() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleCollectionSchema EOF )
            // InternalMyDsl.g:155:1: ruleCollectionSchema EOF
            {
             before(grammarAccess.getCollectionSchemaRule()); 
            pushFollow(FOLLOW_1);
            ruleCollectionSchema();

            state._fsp--;

             after(grammarAccess.getCollectionSchemaRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCollectionSchema"


    // $ANTLR start "ruleCollectionSchema"
    // InternalMyDsl.g:162:1: ruleCollectionSchema : ( ( rule__CollectionSchema__Group__0 ) ) ;
    public final void ruleCollectionSchema() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__CollectionSchema__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__CollectionSchema__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__CollectionSchema__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__CollectionSchema__Group__0 )
            {
             before(grammarAccess.getCollectionSchemaAccess().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__CollectionSchema__Group__0 )
            // InternalMyDsl.g:169:4: rule__CollectionSchema__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CollectionSchema__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCollectionSchemaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCollectionSchema"


    // $ANTLR start "entryRuleCollectionFieldDefination"
    // InternalMyDsl.g:178:1: entryRuleCollectionFieldDefination : ruleCollectionFieldDefination EOF ;
    public final void entryRuleCollectionFieldDefination() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleCollectionFieldDefination EOF )
            // InternalMyDsl.g:180:1: ruleCollectionFieldDefination EOF
            {
             before(grammarAccess.getCollectionFieldDefinationRule()); 
            pushFollow(FOLLOW_1);
            ruleCollectionFieldDefination();

            state._fsp--;

             after(grammarAccess.getCollectionFieldDefinationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCollectionFieldDefination"


    // $ANTLR start "ruleCollectionFieldDefination"
    // InternalMyDsl.g:187:1: ruleCollectionFieldDefination : ( ( rule__CollectionFieldDefination__Alternatives ) ) ;
    public final void ruleCollectionFieldDefination() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__CollectionFieldDefination__Alternatives ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__CollectionFieldDefination__Alternatives ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__CollectionFieldDefination__Alternatives ) )
            // InternalMyDsl.g:193:3: ( rule__CollectionFieldDefination__Alternatives )
            {
             before(grammarAccess.getCollectionFieldDefinationAccess().getAlternatives()); 
            // InternalMyDsl.g:194:3: ( rule__CollectionFieldDefination__Alternatives )
            // InternalMyDsl.g:194:4: rule__CollectionFieldDefination__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CollectionFieldDefination__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCollectionFieldDefinationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCollectionFieldDefination"


    // $ANTLR start "entryRuleCRUDOperations"
    // InternalMyDsl.g:203:1: entryRuleCRUDOperations : ruleCRUDOperations EOF ;
    public final void entryRuleCRUDOperations() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleCRUDOperations EOF )
            // InternalMyDsl.g:205:1: ruleCRUDOperations EOF
            {
             before(grammarAccess.getCRUDOperationsRule()); 
            pushFollow(FOLLOW_1);
            ruleCRUDOperations();

            state._fsp--;

             after(grammarAccess.getCRUDOperationsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCRUDOperations"


    // $ANTLR start "ruleCRUDOperations"
    // InternalMyDsl.g:212:1: ruleCRUDOperations : ( ( rule__CRUDOperations__Alternatives ) ) ;
    public final void ruleCRUDOperations() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__CRUDOperations__Alternatives ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__CRUDOperations__Alternatives ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__CRUDOperations__Alternatives ) )
            // InternalMyDsl.g:218:3: ( rule__CRUDOperations__Alternatives )
            {
             before(grammarAccess.getCRUDOperationsAccess().getAlternatives()); 
            // InternalMyDsl.g:219:3: ( rule__CRUDOperations__Alternatives )
            // InternalMyDsl.g:219:4: rule__CRUDOperations__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CRUDOperations__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCRUDOperationsAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCRUDOperations"


    // $ANTLR start "entryRuleUpdateCollectionEntry"
    // InternalMyDsl.g:228:1: entryRuleUpdateCollectionEntry : ruleUpdateCollectionEntry EOF ;
    public final void entryRuleUpdateCollectionEntry() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleUpdateCollectionEntry EOF )
            // InternalMyDsl.g:230:1: ruleUpdateCollectionEntry EOF
            {
             before(grammarAccess.getUpdateCollectionEntryRule()); 
            pushFollow(FOLLOW_1);
            ruleUpdateCollectionEntry();

            state._fsp--;

             after(grammarAccess.getUpdateCollectionEntryRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUpdateCollectionEntry"


    // $ANTLR start "ruleUpdateCollectionEntry"
    // InternalMyDsl.g:237:1: ruleUpdateCollectionEntry : ( ( rule__UpdateCollectionEntry__Group__0 ) ) ;
    public final void ruleUpdateCollectionEntry() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__UpdateCollectionEntry__Group__0 ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__UpdateCollectionEntry__Group__0 ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__UpdateCollectionEntry__Group__0 ) )
            // InternalMyDsl.g:243:3: ( rule__UpdateCollectionEntry__Group__0 )
            {
             before(grammarAccess.getUpdateCollectionEntryAccess().getGroup()); 
            // InternalMyDsl.g:244:3: ( rule__UpdateCollectionEntry__Group__0 )
            // InternalMyDsl.g:244:4: rule__UpdateCollectionEntry__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UpdateCollectionEntry__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUpdateCollectionEntryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUpdateCollectionEntry"


    // $ANTLR start "entryRuleCollectionEntry"
    // InternalMyDsl.g:253:1: entryRuleCollectionEntry : ruleCollectionEntry EOF ;
    public final void entryRuleCollectionEntry() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( ruleCollectionEntry EOF )
            // InternalMyDsl.g:255:1: ruleCollectionEntry EOF
            {
             before(grammarAccess.getCollectionEntryRule()); 
            pushFollow(FOLLOW_1);
            ruleCollectionEntry();

            state._fsp--;

             after(grammarAccess.getCollectionEntryRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCollectionEntry"


    // $ANTLR start "ruleCollectionEntry"
    // InternalMyDsl.g:262:1: ruleCollectionEntry : ( ( rule__CollectionEntry__Group__0 ) ) ;
    public final void ruleCollectionEntry() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( ( rule__CollectionEntry__Group__0 ) ) )
            // InternalMyDsl.g:267:2: ( ( rule__CollectionEntry__Group__0 ) )
            {
            // InternalMyDsl.g:267:2: ( ( rule__CollectionEntry__Group__0 ) )
            // InternalMyDsl.g:268:3: ( rule__CollectionEntry__Group__0 )
            {
             before(grammarAccess.getCollectionEntryAccess().getGroup()); 
            // InternalMyDsl.g:269:3: ( rule__CollectionEntry__Group__0 )
            // InternalMyDsl.g:269:4: rule__CollectionEntry__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CollectionEntry__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCollectionEntryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCollectionEntry"


    // $ANTLR start "entryRuleOperation"
    // InternalMyDsl.g:278:1: entryRuleOperation : ruleOperation EOF ;
    public final void entryRuleOperation() throws RecognitionException {
        try {
            // InternalMyDsl.g:279:1: ( ruleOperation EOF )
            // InternalMyDsl.g:280:1: ruleOperation EOF
            {
             before(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_1);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getOperationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // InternalMyDsl.g:287:1: ruleOperation : ( ( rule__Operation__Alternatives ) ) ;
    public final void ruleOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:291:2: ( ( ( rule__Operation__Alternatives ) ) )
            // InternalMyDsl.g:292:2: ( ( rule__Operation__Alternatives ) )
            {
            // InternalMyDsl.g:292:2: ( ( rule__Operation__Alternatives ) )
            // InternalMyDsl.g:293:3: ( rule__Operation__Alternatives )
            {
             before(grammarAccess.getOperationAccess().getAlternatives()); 
            // InternalMyDsl.g:294:3: ( rule__Operation__Alternatives )
            // InternalMyDsl.g:294:4: rule__Operation__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Operation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperation"


    // $ANTLR start "ruleFieldType"
    // InternalMyDsl.g:303:1: ruleFieldType : ( ( rule__FieldType__Alternatives ) ) ;
    public final void ruleFieldType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:307:1: ( ( ( rule__FieldType__Alternatives ) ) )
            // InternalMyDsl.g:308:2: ( ( rule__FieldType__Alternatives ) )
            {
            // InternalMyDsl.g:308:2: ( ( rule__FieldType__Alternatives ) )
            // InternalMyDsl.g:309:3: ( rule__FieldType__Alternatives )
            {
             before(grammarAccess.getFieldTypeAccess().getAlternatives()); 
            // InternalMyDsl.g:310:3: ( rule__FieldType__Alternatives )
            // InternalMyDsl.g:310:4: rule__FieldType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__FieldType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFieldTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFieldType"


    // $ANTLR start "rule__CollectionFieldDefination__Alternatives"
    // InternalMyDsl.g:318:1: rule__CollectionFieldDefination__Alternatives : ( ( ( rule__CollectionFieldDefination__Group_0__0 ) ) | ( ( rule__CollectionFieldDefination__Group_1__0 ) ) );
    public final void rule__CollectionFieldDefination__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:322:1: ( ( ( rule__CollectionFieldDefination__Group_0__0 ) ) | ( ( rule__CollectionFieldDefination__Group_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==25) ) {
                    int LA2_2 = input.LA(3);

                    if ( (LA2_2==26) ) {
                        alt2=2;
                    }
                    else if ( ((LA2_2>=14 && LA2_2<=17)) ) {
                        alt2=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:323:2: ( ( rule__CollectionFieldDefination__Group_0__0 ) )
                    {
                    // InternalMyDsl.g:323:2: ( ( rule__CollectionFieldDefination__Group_0__0 ) )
                    // InternalMyDsl.g:324:3: ( rule__CollectionFieldDefination__Group_0__0 )
                    {
                     before(grammarAccess.getCollectionFieldDefinationAccess().getGroup_0()); 
                    // InternalMyDsl.g:325:3: ( rule__CollectionFieldDefination__Group_0__0 )
                    // InternalMyDsl.g:325:4: rule__CollectionFieldDefination__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CollectionFieldDefination__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCollectionFieldDefinationAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:329:2: ( ( rule__CollectionFieldDefination__Group_1__0 ) )
                    {
                    // InternalMyDsl.g:329:2: ( ( rule__CollectionFieldDefination__Group_1__0 ) )
                    // InternalMyDsl.g:330:3: ( rule__CollectionFieldDefination__Group_1__0 )
                    {
                     before(grammarAccess.getCollectionFieldDefinationAccess().getGroup_1()); 
                    // InternalMyDsl.g:331:3: ( rule__CollectionFieldDefination__Group_1__0 )
                    // InternalMyDsl.g:331:4: rule__CollectionFieldDefination__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CollectionFieldDefination__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCollectionFieldDefinationAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionFieldDefination__Alternatives"


    // $ANTLR start "rule__CRUDOperations__Alternatives"
    // InternalMyDsl.g:339:1: rule__CRUDOperations__Alternatives : ( ( ( rule__CRUDOperations__Group_0__0 ) ) | ( ( rule__CRUDOperations__Group_1__0 ) ) );
    public final void rule__CRUDOperations__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:343:1: ( ( ( rule__CRUDOperations__Group_0__0 ) ) | ( ( rule__CRUDOperations__Group_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==27) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==RULE_ID) ) {
                    int LA3_2 = input.LA(3);

                    if ( (LA3_2==25) ) {
                        int LA3_3 = input.LA(4);

                        if ( (LA3_3==19) ) {
                            int LA3_4 = input.LA(5);

                            if ( (LA3_4==28) ) {
                                int LA3_5 = input.LA(6);

                                if ( ((LA3_5>=11 && LA3_5<=13)) ) {
                                    alt3=1;
                                }
                                else if ( (LA3_5==35) ) {
                                    alt3=2;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 3, 5, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 3, 4, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 3, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:344:2: ( ( rule__CRUDOperations__Group_0__0 ) )
                    {
                    // InternalMyDsl.g:344:2: ( ( rule__CRUDOperations__Group_0__0 ) )
                    // InternalMyDsl.g:345:3: ( rule__CRUDOperations__Group_0__0 )
                    {
                     before(grammarAccess.getCRUDOperationsAccess().getGroup_0()); 
                    // InternalMyDsl.g:346:3: ( rule__CRUDOperations__Group_0__0 )
                    // InternalMyDsl.g:346:4: rule__CRUDOperations__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CRUDOperations__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCRUDOperationsAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:350:2: ( ( rule__CRUDOperations__Group_1__0 ) )
                    {
                    // InternalMyDsl.g:350:2: ( ( rule__CRUDOperations__Group_1__0 ) )
                    // InternalMyDsl.g:351:3: ( rule__CRUDOperations__Group_1__0 )
                    {
                     before(grammarAccess.getCRUDOperationsAccess().getGroup_1()); 
                    // InternalMyDsl.g:352:3: ( rule__CRUDOperations__Group_1__0 )
                    // InternalMyDsl.g:352:4: rule__CRUDOperations__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CRUDOperations__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCRUDOperationsAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CRUDOperations__Alternatives"


    // $ANTLR start "rule__UpdateCollectionEntry__Alternatives_2"
    // InternalMyDsl.g:360:1: rule__UpdateCollectionEntry__Alternatives_2 : ( ( ( rule__UpdateCollectionEntry__ValueStringAssignment_2_0 ) ) | ( ( rule__UpdateCollectionEntry__ValueIntAssignment_2_1 ) ) );
    public final void rule__UpdateCollectionEntry__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:364:1: ( ( ( rule__UpdateCollectionEntry__ValueStringAssignment_2_0 ) ) | ( ( rule__UpdateCollectionEntry__ValueIntAssignment_2_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_INT) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:365:2: ( ( rule__UpdateCollectionEntry__ValueStringAssignment_2_0 ) )
                    {
                    // InternalMyDsl.g:365:2: ( ( rule__UpdateCollectionEntry__ValueStringAssignment_2_0 ) )
                    // InternalMyDsl.g:366:3: ( rule__UpdateCollectionEntry__ValueStringAssignment_2_0 )
                    {
                     before(grammarAccess.getUpdateCollectionEntryAccess().getValueStringAssignment_2_0()); 
                    // InternalMyDsl.g:367:3: ( rule__UpdateCollectionEntry__ValueStringAssignment_2_0 )
                    // InternalMyDsl.g:367:4: rule__UpdateCollectionEntry__ValueStringAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UpdateCollectionEntry__ValueStringAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getUpdateCollectionEntryAccess().getValueStringAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:371:2: ( ( rule__UpdateCollectionEntry__ValueIntAssignment_2_1 ) )
                    {
                    // InternalMyDsl.g:371:2: ( ( rule__UpdateCollectionEntry__ValueIntAssignment_2_1 ) )
                    // InternalMyDsl.g:372:3: ( rule__UpdateCollectionEntry__ValueIntAssignment_2_1 )
                    {
                     before(grammarAccess.getUpdateCollectionEntryAccess().getValueIntAssignment_2_1()); 
                    // InternalMyDsl.g:373:3: ( rule__UpdateCollectionEntry__ValueIntAssignment_2_1 )
                    // InternalMyDsl.g:373:4: rule__UpdateCollectionEntry__ValueIntAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__UpdateCollectionEntry__ValueIntAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getUpdateCollectionEntryAccess().getValueIntAssignment_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateCollectionEntry__Alternatives_2"


    // $ANTLR start "rule__CollectionEntry__Alternatives_2"
    // InternalMyDsl.g:381:1: rule__CollectionEntry__Alternatives_2 : ( ( ( rule__CollectionEntry__ValueStringAssignment_2_0 ) ) | ( ( rule__CollectionEntry__ValueIntAssignment_2_1 ) ) );
    public final void rule__CollectionEntry__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:385:1: ( ( ( rule__CollectionEntry__ValueStringAssignment_2_0 ) ) | ( ( rule__CollectionEntry__ValueIntAssignment_2_1 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_INT) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:386:2: ( ( rule__CollectionEntry__ValueStringAssignment_2_0 ) )
                    {
                    // InternalMyDsl.g:386:2: ( ( rule__CollectionEntry__ValueStringAssignment_2_0 ) )
                    // InternalMyDsl.g:387:3: ( rule__CollectionEntry__ValueStringAssignment_2_0 )
                    {
                     before(grammarAccess.getCollectionEntryAccess().getValueStringAssignment_2_0()); 
                    // InternalMyDsl.g:388:3: ( rule__CollectionEntry__ValueStringAssignment_2_0 )
                    // InternalMyDsl.g:388:4: rule__CollectionEntry__ValueStringAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CollectionEntry__ValueStringAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCollectionEntryAccess().getValueStringAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:392:2: ( ( rule__CollectionEntry__ValueIntAssignment_2_1 ) )
                    {
                    // InternalMyDsl.g:392:2: ( ( rule__CollectionEntry__ValueIntAssignment_2_1 ) )
                    // InternalMyDsl.g:393:3: ( rule__CollectionEntry__ValueIntAssignment_2_1 )
                    {
                     before(grammarAccess.getCollectionEntryAccess().getValueIntAssignment_2_1()); 
                    // InternalMyDsl.g:394:3: ( rule__CollectionEntry__ValueIntAssignment_2_1 )
                    // InternalMyDsl.g:394:4: rule__CollectionEntry__ValueIntAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__CollectionEntry__ValueIntAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getCollectionEntryAccess().getValueIntAssignment_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionEntry__Alternatives_2"


    // $ANTLR start "rule__Operation__Alternatives"
    // InternalMyDsl.g:402:1: rule__Operation__Alternatives : ( ( 'GET' ) | ( 'DELETE' ) | ( 'INSERT' ) );
    public final void rule__Operation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:406:1: ( ( 'GET' ) | ( 'DELETE' ) | ( 'INSERT' ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt6=1;
                }
                break;
            case 12:
                {
                alt6=2;
                }
                break;
            case 13:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:407:2: ( 'GET' )
                    {
                    // InternalMyDsl.g:407:2: ( 'GET' )
                    // InternalMyDsl.g:408:3: 'GET'
                    {
                     before(grammarAccess.getOperationAccess().getGETKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getOperationAccess().getGETKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:413:2: ( 'DELETE' )
                    {
                    // InternalMyDsl.g:413:2: ( 'DELETE' )
                    // InternalMyDsl.g:414:3: 'DELETE'
                    {
                     before(grammarAccess.getOperationAccess().getDELETEKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getOperationAccess().getDELETEKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:419:2: ( 'INSERT' )
                    {
                    // InternalMyDsl.g:419:2: ( 'INSERT' )
                    // InternalMyDsl.g:420:3: 'INSERT'
                    {
                     before(grammarAccess.getOperationAccess().getINSERTKeyword_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getOperationAccess().getINSERTKeyword_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Alternatives"


    // $ANTLR start "rule__FieldType__Alternatives"
    // InternalMyDsl.g:429:1: rule__FieldType__Alternatives : ( ( ( 'String' ) ) | ( ( 'Number' ) ) | ( ( 'Boolean' ) ) | ( ( 'Date' ) ) );
    public final void rule__FieldType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:433:1: ( ( ( 'String' ) ) | ( ( 'Number' ) ) | ( ( 'Boolean' ) ) | ( ( 'Date' ) ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt7=1;
                }
                break;
            case 15:
                {
                alt7=2;
                }
                break;
            case 16:
                {
                alt7=3;
                }
                break;
            case 17:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:434:2: ( ( 'String' ) )
                    {
                    // InternalMyDsl.g:434:2: ( ( 'String' ) )
                    // InternalMyDsl.g:435:3: ( 'String' )
                    {
                     before(grammarAccess.getFieldTypeAccess().getStringEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:436:3: ( 'String' )
                    // InternalMyDsl.g:436:4: 'String'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getFieldTypeAccess().getStringEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:440:2: ( ( 'Number' ) )
                    {
                    // InternalMyDsl.g:440:2: ( ( 'Number' ) )
                    // InternalMyDsl.g:441:3: ( 'Number' )
                    {
                     before(grammarAccess.getFieldTypeAccess().getNumberEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:442:3: ( 'Number' )
                    // InternalMyDsl.g:442:4: 'Number'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getFieldTypeAccess().getNumberEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:446:2: ( ( 'Boolean' ) )
                    {
                    // InternalMyDsl.g:446:2: ( ( 'Boolean' ) )
                    // InternalMyDsl.g:447:3: ( 'Boolean' )
                    {
                     before(grammarAccess.getFieldTypeAccess().getBooleanEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:448:3: ( 'Boolean' )
                    // InternalMyDsl.g:448:4: 'Boolean'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getFieldTypeAccess().getBooleanEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:452:2: ( ( 'Date' ) )
                    {
                    // InternalMyDsl.g:452:2: ( ( 'Date' ) )
                    // InternalMyDsl.g:453:3: ( 'Date' )
                    {
                     before(grammarAccess.getFieldTypeAccess().getDateEnumLiteralDeclaration_3()); 
                    // InternalMyDsl.g:454:3: ( 'Date' )
                    // InternalMyDsl.g:454:4: 'Date'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getFieldTypeAccess().getDateEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldType__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // InternalMyDsl.g:462:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:466:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalMyDsl.g:467:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalMyDsl.g:474:1: rule__Model__Group__0__Impl : ( ( rule__Model__ConnectionAssignment_0 ) ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:478:1: ( ( ( rule__Model__ConnectionAssignment_0 ) ) )
            // InternalMyDsl.g:479:1: ( ( rule__Model__ConnectionAssignment_0 ) )
            {
            // InternalMyDsl.g:479:1: ( ( rule__Model__ConnectionAssignment_0 ) )
            // InternalMyDsl.g:480:2: ( rule__Model__ConnectionAssignment_0 )
            {
             before(grammarAccess.getModelAccess().getConnectionAssignment_0()); 
            // InternalMyDsl.g:481:2: ( rule__Model__ConnectionAssignment_0 )
            // InternalMyDsl.g:481:3: rule__Model__ConnectionAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Model__ConnectionAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getConnectionAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalMyDsl.g:489:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:493:1: ( rule__Model__Group__1__Impl )
            // InternalMyDsl.g:494:2: rule__Model__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalMyDsl.g:500:1: rule__Model__Group__1__Impl : ( ( rule__Model__StatementsAssignment_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:504:1: ( ( ( rule__Model__StatementsAssignment_1 )* ) )
            // InternalMyDsl.g:505:1: ( ( rule__Model__StatementsAssignment_1 )* )
            {
            // InternalMyDsl.g:505:1: ( ( rule__Model__StatementsAssignment_1 )* )
            // InternalMyDsl.g:506:2: ( rule__Model__StatementsAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getStatementsAssignment_1()); 
            // InternalMyDsl.g:507:2: ( rule__Model__StatementsAssignment_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==24) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:507:3: rule__Model__StatementsAssignment_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Model__StatementsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getStatementsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__CRUDOperationAndCollectionSchema__Group__0"
    // InternalMyDsl.g:516:1: rule__CRUDOperationAndCollectionSchema__Group__0 : rule__CRUDOperationAndCollectionSchema__Group__0__Impl rule__CRUDOperationAndCollectionSchema__Group__1 ;
    public final void rule__CRUDOperationAndCollectionSchema__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:520:1: ( rule__CRUDOperationAndCollectionSchema__Group__0__Impl rule__CRUDOperationAndCollectionSchema__Group__1 )
            // InternalMyDsl.g:521:2: rule__CRUDOperationAndCollectionSchema__Group__0__Impl rule__CRUDOperationAndCollectionSchema__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__CRUDOperationAndCollectionSchema__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CRUDOperationAndCollectionSchema__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CRUDOperationAndCollectionSchema__Group__0"


    // $ANTLR start "rule__CRUDOperationAndCollectionSchema__Group__0__Impl"
    // InternalMyDsl.g:528:1: rule__CRUDOperationAndCollectionSchema__Group__0__Impl : ( ( rule__CRUDOperationAndCollectionSchema__SchemaAssignment_0 ) ) ;
    public final void rule__CRUDOperationAndCollectionSchema__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:532:1: ( ( ( rule__CRUDOperationAndCollectionSchema__SchemaAssignment_0 ) ) )
            // InternalMyDsl.g:533:1: ( ( rule__CRUDOperationAndCollectionSchema__SchemaAssignment_0 ) )
            {
            // InternalMyDsl.g:533:1: ( ( rule__CRUDOperationAndCollectionSchema__SchemaAssignment_0 ) )
            // InternalMyDsl.g:534:2: ( rule__CRUDOperationAndCollectionSchema__SchemaAssignment_0 )
            {
             before(grammarAccess.getCRUDOperationAndCollectionSchemaAccess().getSchemaAssignment_0()); 
            // InternalMyDsl.g:535:2: ( rule__CRUDOperationAndCollectionSchema__SchemaAssignment_0 )
            // InternalMyDsl.g:535:3: rule__CRUDOperationAndCollectionSchema__SchemaAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__CRUDOperationAndCollectionSchema__SchemaAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCRUDOperationAndCollectionSchemaAccess().getSchemaAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CRUDOperationAndCollectionSchema__Group__0__Impl"


    // $ANTLR start "rule__CRUDOperationAndCollectionSchema__Group__1"
    // InternalMyDsl.g:543:1: rule__CRUDOperationAndCollectionSchema__Group__1 : rule__CRUDOperationAndCollectionSchema__Group__1__Impl ;
    public final void rule__CRUDOperationAndCollectionSchema__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:547:1: ( rule__CRUDOperationAndCollectionSchema__Group__1__Impl )
            // InternalMyDsl.g:548:2: rule__CRUDOperationAndCollectionSchema__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CRUDOperationAndCollectionSchema__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CRUDOperationAndCollectionSchema__Group__1"


    // $ANTLR start "rule__CRUDOperationAndCollectionSchema__Group__1__Impl"
    // InternalMyDsl.g:554:1: rule__CRUDOperationAndCollectionSchema__Group__1__Impl : ( ( rule__CRUDOperationAndCollectionSchema__OperationsAssignment_1 )* ) ;
    public final void rule__CRUDOperationAndCollectionSchema__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:558:1: ( ( ( rule__CRUDOperationAndCollectionSchema__OperationsAssignment_1 )* ) )
            // InternalMyDsl.g:559:1: ( ( rule__CRUDOperationAndCollectionSchema__OperationsAssignment_1 )* )
            {
            // InternalMyDsl.g:559:1: ( ( rule__CRUDOperationAndCollectionSchema__OperationsAssignment_1 )* )
            // InternalMyDsl.g:560:2: ( rule__CRUDOperationAndCollectionSchema__OperationsAssignment_1 )*
            {
             before(grammarAccess.getCRUDOperationAndCollectionSchemaAccess().getOperationsAssignment_1()); 
            // InternalMyDsl.g:561:2: ( rule__CRUDOperationAndCollectionSchema__OperationsAssignment_1 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==27) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:561:3: rule__CRUDOperationAndCollectionSchema__OperationsAssignment_1
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__CRUDOperationAndCollectionSchema__OperationsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getCRUDOperationAndCollectionSchemaAccess().getOperationsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CRUDOperationAndCollectionSchema__Group__1__Impl"


    // $ANTLR start "rule__ConnectionStatement__Group_0__0"
    // InternalMyDsl.g:570:1: rule__ConnectionStatement__Group_0__0 : rule__ConnectionStatement__Group_0__0__Impl rule__ConnectionStatement__Group_0__1 ;
    public final void rule__ConnectionStatement__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:574:1: ( rule__ConnectionStatement__Group_0__0__Impl rule__ConnectionStatement__Group_0__1 )
            // InternalMyDsl.g:575:2: rule__ConnectionStatement__Group_0__0__Impl rule__ConnectionStatement__Group_0__1
            {
            pushFollow(FOLLOW_8);
            rule__ConnectionStatement__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConnectionStatement__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionStatement__Group_0__0"


    // $ANTLR start "rule__ConnectionStatement__Group_0__0__Impl"
    // InternalMyDsl.g:582:1: rule__ConnectionStatement__Group_0__0__Impl : ( 'DatabaseParameters' ) ;
    public final void rule__ConnectionStatement__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:586:1: ( ( 'DatabaseParameters' ) )
            // InternalMyDsl.g:587:1: ( 'DatabaseParameters' )
            {
            // InternalMyDsl.g:587:1: ( 'DatabaseParameters' )
            // InternalMyDsl.g:588:2: 'DatabaseParameters'
            {
             before(grammarAccess.getConnectionStatementAccess().getDatabaseParametersKeyword_0_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getConnectionStatementAccess().getDatabaseParametersKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionStatement__Group_0__0__Impl"


    // $ANTLR start "rule__ConnectionStatement__Group_0__1"
    // InternalMyDsl.g:597:1: rule__ConnectionStatement__Group_0__1 : rule__ConnectionStatement__Group_0__1__Impl rule__ConnectionStatement__Group_0__2 ;
    public final void rule__ConnectionStatement__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:601:1: ( rule__ConnectionStatement__Group_0__1__Impl rule__ConnectionStatement__Group_0__2 )
            // InternalMyDsl.g:602:2: rule__ConnectionStatement__Group_0__1__Impl rule__ConnectionStatement__Group_0__2
            {
            pushFollow(FOLLOW_9);
            rule__ConnectionStatement__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConnectionStatement__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionStatement__Group_0__1"


    // $ANTLR start "rule__ConnectionStatement__Group_0__1__Impl"
    // InternalMyDsl.g:609:1: rule__ConnectionStatement__Group_0__1__Impl : ( '{' ) ;
    public final void rule__ConnectionStatement__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:613:1: ( ( '{' ) )
            // InternalMyDsl.g:614:1: ( '{' )
            {
            // InternalMyDsl.g:614:1: ( '{' )
            // InternalMyDsl.g:615:2: '{'
            {
             before(grammarAccess.getConnectionStatementAccess().getLeftCurlyBracketKeyword_0_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getConnectionStatementAccess().getLeftCurlyBracketKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionStatement__Group_0__1__Impl"


    // $ANTLR start "rule__ConnectionStatement__Group_0__2"
    // InternalMyDsl.g:624:1: rule__ConnectionStatement__Group_0__2 : rule__ConnectionStatement__Group_0__2__Impl rule__ConnectionStatement__Group_0__3 ;
    public final void rule__ConnectionStatement__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:628:1: ( rule__ConnectionStatement__Group_0__2__Impl rule__ConnectionStatement__Group_0__3 )
            // InternalMyDsl.g:629:2: rule__ConnectionStatement__Group_0__2__Impl rule__ConnectionStatement__Group_0__3
            {
            pushFollow(FOLLOW_10);
            rule__ConnectionStatement__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConnectionStatement__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionStatement__Group_0__2"


    // $ANTLR start "rule__ConnectionStatement__Group_0__2__Impl"
    // InternalMyDsl.g:636:1: rule__ConnectionStatement__Group_0__2__Impl : ( 'Connection' ) ;
    public final void rule__ConnectionStatement__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:640:1: ( ( 'Connection' ) )
            // InternalMyDsl.g:641:1: ( 'Connection' )
            {
            // InternalMyDsl.g:641:1: ( 'Connection' )
            // InternalMyDsl.g:642:2: 'Connection'
            {
             before(grammarAccess.getConnectionStatementAccess().getConnectionKeyword_0_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getConnectionStatementAccess().getConnectionKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionStatement__Group_0__2__Impl"


    // $ANTLR start "rule__ConnectionStatement__Group_0__3"
    // InternalMyDsl.g:651:1: rule__ConnectionStatement__Group_0__3 : rule__ConnectionStatement__Group_0__3__Impl rule__ConnectionStatement__Group_0__4 ;
    public final void rule__ConnectionStatement__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:655:1: ( rule__ConnectionStatement__Group_0__3__Impl rule__ConnectionStatement__Group_0__4 )
            // InternalMyDsl.g:656:2: rule__ConnectionStatement__Group_0__3__Impl rule__ConnectionStatement__Group_0__4
            {
            pushFollow(FOLLOW_11);
            rule__ConnectionStatement__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConnectionStatement__Group_0__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionStatement__Group_0__3"


    // $ANTLR start "rule__ConnectionStatement__Group_0__3__Impl"
    // InternalMyDsl.g:663:1: rule__ConnectionStatement__Group_0__3__Impl : ( ( rule__ConnectionStatement__ConnectionStringAssignment_0_3 ) ) ;
    public final void rule__ConnectionStatement__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:667:1: ( ( ( rule__ConnectionStatement__ConnectionStringAssignment_0_3 ) ) )
            // InternalMyDsl.g:668:1: ( ( rule__ConnectionStatement__ConnectionStringAssignment_0_3 ) )
            {
            // InternalMyDsl.g:668:1: ( ( rule__ConnectionStatement__ConnectionStringAssignment_0_3 ) )
            // InternalMyDsl.g:669:2: ( rule__ConnectionStatement__ConnectionStringAssignment_0_3 )
            {
             before(grammarAccess.getConnectionStatementAccess().getConnectionStringAssignment_0_3()); 
            // InternalMyDsl.g:670:2: ( rule__ConnectionStatement__ConnectionStringAssignment_0_3 )
            // InternalMyDsl.g:670:3: rule__ConnectionStatement__ConnectionStringAssignment_0_3
            {
            pushFollow(FOLLOW_2);
            rule__ConnectionStatement__ConnectionStringAssignment_0_3();

            state._fsp--;


            }

             after(grammarAccess.getConnectionStatementAccess().getConnectionStringAssignment_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionStatement__Group_0__3__Impl"


    // $ANTLR start "rule__ConnectionStatement__Group_0__4"
    // InternalMyDsl.g:678:1: rule__ConnectionStatement__Group_0__4 : rule__ConnectionStatement__Group_0__4__Impl ;
    public final void rule__ConnectionStatement__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:682:1: ( rule__ConnectionStatement__Group_0__4__Impl )
            // InternalMyDsl.g:683:2: rule__ConnectionStatement__Group_0__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConnectionStatement__Group_0__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionStatement__Group_0__4"


    // $ANTLR start "rule__ConnectionStatement__Group_0__4__Impl"
    // InternalMyDsl.g:689:1: rule__ConnectionStatement__Group_0__4__Impl : ( ',' ) ;
    public final void rule__ConnectionStatement__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:693:1: ( ( ',' ) )
            // InternalMyDsl.g:694:1: ( ',' )
            {
            // InternalMyDsl.g:694:1: ( ',' )
            // InternalMyDsl.g:695:2: ','
            {
             before(grammarAccess.getConnectionStatementAccess().getCommaKeyword_0_4()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getConnectionStatementAccess().getCommaKeyword_0_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionStatement__Group_0__4__Impl"


    // $ANTLR start "rule__ConnectionStatement__Group_1__0"
    // InternalMyDsl.g:705:1: rule__ConnectionStatement__Group_1__0 : rule__ConnectionStatement__Group_1__0__Impl rule__ConnectionStatement__Group_1__1 ;
    public final void rule__ConnectionStatement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:709:1: ( rule__ConnectionStatement__Group_1__0__Impl rule__ConnectionStatement__Group_1__1 )
            // InternalMyDsl.g:710:2: rule__ConnectionStatement__Group_1__0__Impl rule__ConnectionStatement__Group_1__1
            {
            pushFollow(FOLLOW_10);
            rule__ConnectionStatement__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConnectionStatement__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionStatement__Group_1__0"


    // $ANTLR start "rule__ConnectionStatement__Group_1__0__Impl"
    // InternalMyDsl.g:717:1: rule__ConnectionStatement__Group_1__0__Impl : ( 'databaseName' ) ;
    public final void rule__ConnectionStatement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:721:1: ( ( 'databaseName' ) )
            // InternalMyDsl.g:722:1: ( 'databaseName' )
            {
            // InternalMyDsl.g:722:1: ( 'databaseName' )
            // InternalMyDsl.g:723:2: 'databaseName'
            {
             before(grammarAccess.getConnectionStatementAccess().getDatabaseNameKeyword_1_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getConnectionStatementAccess().getDatabaseNameKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionStatement__Group_1__0__Impl"


    // $ANTLR start "rule__ConnectionStatement__Group_1__1"
    // InternalMyDsl.g:732:1: rule__ConnectionStatement__Group_1__1 : rule__ConnectionStatement__Group_1__1__Impl rule__ConnectionStatement__Group_1__2 ;
    public final void rule__ConnectionStatement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:736:1: ( rule__ConnectionStatement__Group_1__1__Impl rule__ConnectionStatement__Group_1__2 )
            // InternalMyDsl.g:737:2: rule__ConnectionStatement__Group_1__1__Impl rule__ConnectionStatement__Group_1__2
            {
            pushFollow(FOLLOW_12);
            rule__ConnectionStatement__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConnectionStatement__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionStatement__Group_1__1"


    // $ANTLR start "rule__ConnectionStatement__Group_1__1__Impl"
    // InternalMyDsl.g:744:1: rule__ConnectionStatement__Group_1__1__Impl : ( ( rule__ConnectionStatement__DatabaseNameAssignment_1_1 ) ) ;
    public final void rule__ConnectionStatement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:748:1: ( ( ( rule__ConnectionStatement__DatabaseNameAssignment_1_1 ) ) )
            // InternalMyDsl.g:749:1: ( ( rule__ConnectionStatement__DatabaseNameAssignment_1_1 ) )
            {
            // InternalMyDsl.g:749:1: ( ( rule__ConnectionStatement__DatabaseNameAssignment_1_1 ) )
            // InternalMyDsl.g:750:2: ( rule__ConnectionStatement__DatabaseNameAssignment_1_1 )
            {
             before(grammarAccess.getConnectionStatementAccess().getDatabaseNameAssignment_1_1()); 
            // InternalMyDsl.g:751:2: ( rule__ConnectionStatement__DatabaseNameAssignment_1_1 )
            // InternalMyDsl.g:751:3: rule__ConnectionStatement__DatabaseNameAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ConnectionStatement__DatabaseNameAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getConnectionStatementAccess().getDatabaseNameAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionStatement__Group_1__1__Impl"


    // $ANTLR start "rule__ConnectionStatement__Group_1__2"
    // InternalMyDsl.g:759:1: rule__ConnectionStatement__Group_1__2 : rule__ConnectionStatement__Group_1__2__Impl ;
    public final void rule__ConnectionStatement__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:763:1: ( rule__ConnectionStatement__Group_1__2__Impl )
            // InternalMyDsl.g:764:2: rule__ConnectionStatement__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConnectionStatement__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionStatement__Group_1__2"


    // $ANTLR start "rule__ConnectionStatement__Group_1__2__Impl"
    // InternalMyDsl.g:770:1: rule__ConnectionStatement__Group_1__2__Impl : ( '}' ) ;
    public final void rule__ConnectionStatement__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:774:1: ( ( '}' ) )
            // InternalMyDsl.g:775:1: ( '}' )
            {
            // InternalMyDsl.g:775:1: ( '}' )
            // InternalMyDsl.g:776:2: '}'
            {
             before(grammarAccess.getConnectionStatementAccess().getRightCurlyBracketKeyword_1_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getConnectionStatementAccess().getRightCurlyBracketKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionStatement__Group_1__2__Impl"


    // $ANTLR start "rule__CollectionSchema__Group__0"
    // InternalMyDsl.g:786:1: rule__CollectionSchema__Group__0 : rule__CollectionSchema__Group__0__Impl rule__CollectionSchema__Group__1 ;
    public final void rule__CollectionSchema__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:790:1: ( rule__CollectionSchema__Group__0__Impl rule__CollectionSchema__Group__1 )
            // InternalMyDsl.g:791:2: rule__CollectionSchema__Group__0__Impl rule__CollectionSchema__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__CollectionSchema__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CollectionSchema__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionSchema__Group__0"


    // $ANTLR start "rule__CollectionSchema__Group__0__Impl"
    // InternalMyDsl.g:798:1: rule__CollectionSchema__Group__0__Impl : ( 'Collection' ) ;
    public final void rule__CollectionSchema__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:802:1: ( ( 'Collection' ) )
            // InternalMyDsl.g:803:1: ( 'Collection' )
            {
            // InternalMyDsl.g:803:1: ( 'Collection' )
            // InternalMyDsl.g:804:2: 'Collection'
            {
             before(grammarAccess.getCollectionSchemaAccess().getCollectionKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getCollectionSchemaAccess().getCollectionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionSchema__Group__0__Impl"


    // $ANTLR start "rule__CollectionSchema__Group__1"
    // InternalMyDsl.g:813:1: rule__CollectionSchema__Group__1 : rule__CollectionSchema__Group__1__Impl rule__CollectionSchema__Group__2 ;
    public final void rule__CollectionSchema__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:817:1: ( rule__CollectionSchema__Group__1__Impl rule__CollectionSchema__Group__2 )
            // InternalMyDsl.g:818:2: rule__CollectionSchema__Group__1__Impl rule__CollectionSchema__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__CollectionSchema__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CollectionSchema__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionSchema__Group__1"


    // $ANTLR start "rule__CollectionSchema__Group__1__Impl"
    // InternalMyDsl.g:825:1: rule__CollectionSchema__Group__1__Impl : ( ( rule__CollectionSchema__NameAssignment_1 ) ) ;
    public final void rule__CollectionSchema__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:829:1: ( ( ( rule__CollectionSchema__NameAssignment_1 ) ) )
            // InternalMyDsl.g:830:1: ( ( rule__CollectionSchema__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:830:1: ( ( rule__CollectionSchema__NameAssignment_1 ) )
            // InternalMyDsl.g:831:2: ( rule__CollectionSchema__NameAssignment_1 )
            {
             before(grammarAccess.getCollectionSchemaAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:832:2: ( rule__CollectionSchema__NameAssignment_1 )
            // InternalMyDsl.g:832:3: rule__CollectionSchema__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CollectionSchema__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCollectionSchemaAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionSchema__Group__1__Impl"


    // $ANTLR start "rule__CollectionSchema__Group__2"
    // InternalMyDsl.g:840:1: rule__CollectionSchema__Group__2 : rule__CollectionSchema__Group__2__Impl rule__CollectionSchema__Group__3 ;
    public final void rule__CollectionSchema__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:844:1: ( rule__CollectionSchema__Group__2__Impl rule__CollectionSchema__Group__3 )
            // InternalMyDsl.g:845:2: rule__CollectionSchema__Group__2__Impl rule__CollectionSchema__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__CollectionSchema__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CollectionSchema__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionSchema__Group__2"


    // $ANTLR start "rule__CollectionSchema__Group__2__Impl"
    // InternalMyDsl.g:852:1: rule__CollectionSchema__Group__2__Impl : ( '{' ) ;
    public final void rule__CollectionSchema__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:856:1: ( ( '{' ) )
            // InternalMyDsl.g:857:1: ( '{' )
            {
            // InternalMyDsl.g:857:1: ( '{' )
            // InternalMyDsl.g:858:2: '{'
            {
             before(grammarAccess.getCollectionSchemaAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getCollectionSchemaAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionSchema__Group__2__Impl"


    // $ANTLR start "rule__CollectionSchema__Group__3"
    // InternalMyDsl.g:867:1: rule__CollectionSchema__Group__3 : rule__CollectionSchema__Group__3__Impl rule__CollectionSchema__Group__4 ;
    public final void rule__CollectionSchema__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:871:1: ( rule__CollectionSchema__Group__3__Impl rule__CollectionSchema__Group__4 )
            // InternalMyDsl.g:872:2: rule__CollectionSchema__Group__3__Impl rule__CollectionSchema__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__CollectionSchema__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CollectionSchema__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionSchema__Group__3"


    // $ANTLR start "rule__CollectionSchema__Group__3__Impl"
    // InternalMyDsl.g:879:1: rule__CollectionSchema__Group__3__Impl : ( ( rule__CollectionSchema__Group_3__0 )? ) ;
    public final void rule__CollectionSchema__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:883:1: ( ( ( rule__CollectionSchema__Group_3__0 )? ) )
            // InternalMyDsl.g:884:1: ( ( rule__CollectionSchema__Group_3__0 )? )
            {
            // InternalMyDsl.g:884:1: ( ( rule__CollectionSchema__Group_3__0 )? )
            // InternalMyDsl.g:885:2: ( rule__CollectionSchema__Group_3__0 )?
            {
             before(grammarAccess.getCollectionSchemaAccess().getGroup_3()); 
            // InternalMyDsl.g:886:2: ( rule__CollectionSchema__Group_3__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:886:3: rule__CollectionSchema__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CollectionSchema__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCollectionSchemaAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionSchema__Group__3__Impl"


    // $ANTLR start "rule__CollectionSchema__Group__4"
    // InternalMyDsl.g:894:1: rule__CollectionSchema__Group__4 : rule__CollectionSchema__Group__4__Impl ;
    public final void rule__CollectionSchema__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:898:1: ( rule__CollectionSchema__Group__4__Impl )
            // InternalMyDsl.g:899:2: rule__CollectionSchema__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CollectionSchema__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionSchema__Group__4"


    // $ANTLR start "rule__CollectionSchema__Group__4__Impl"
    // InternalMyDsl.g:905:1: rule__CollectionSchema__Group__4__Impl : ( '}' ) ;
    public final void rule__CollectionSchema__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:909:1: ( ( '}' ) )
            // InternalMyDsl.g:910:1: ( '}' )
            {
            // InternalMyDsl.g:910:1: ( '}' )
            // InternalMyDsl.g:911:2: '}'
            {
             before(grammarAccess.getCollectionSchemaAccess().getRightCurlyBracketKeyword_4()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getCollectionSchemaAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionSchema__Group__4__Impl"


    // $ANTLR start "rule__CollectionSchema__Group_3__0"
    // InternalMyDsl.g:921:1: rule__CollectionSchema__Group_3__0 : rule__CollectionSchema__Group_3__0__Impl rule__CollectionSchema__Group_3__1 ;
    public final void rule__CollectionSchema__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:925:1: ( rule__CollectionSchema__Group_3__0__Impl rule__CollectionSchema__Group_3__1 )
            // InternalMyDsl.g:926:2: rule__CollectionSchema__Group_3__0__Impl rule__CollectionSchema__Group_3__1
            {
            pushFollow(FOLLOW_11);
            rule__CollectionSchema__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CollectionSchema__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionSchema__Group_3__0"


    // $ANTLR start "rule__CollectionSchema__Group_3__0__Impl"
    // InternalMyDsl.g:933:1: rule__CollectionSchema__Group_3__0__Impl : ( ( rule__CollectionSchema__DefinationAssignment_3_0 ) ) ;
    public final void rule__CollectionSchema__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:937:1: ( ( ( rule__CollectionSchema__DefinationAssignment_3_0 ) ) )
            // InternalMyDsl.g:938:1: ( ( rule__CollectionSchema__DefinationAssignment_3_0 ) )
            {
            // InternalMyDsl.g:938:1: ( ( rule__CollectionSchema__DefinationAssignment_3_0 ) )
            // InternalMyDsl.g:939:2: ( rule__CollectionSchema__DefinationAssignment_3_0 )
            {
             before(grammarAccess.getCollectionSchemaAccess().getDefinationAssignment_3_0()); 
            // InternalMyDsl.g:940:2: ( rule__CollectionSchema__DefinationAssignment_3_0 )
            // InternalMyDsl.g:940:3: rule__CollectionSchema__DefinationAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__CollectionSchema__DefinationAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getCollectionSchemaAccess().getDefinationAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionSchema__Group_3__0__Impl"


    // $ANTLR start "rule__CollectionSchema__Group_3__1"
    // InternalMyDsl.g:948:1: rule__CollectionSchema__Group_3__1 : rule__CollectionSchema__Group_3__1__Impl ;
    public final void rule__CollectionSchema__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:952:1: ( rule__CollectionSchema__Group_3__1__Impl )
            // InternalMyDsl.g:953:2: rule__CollectionSchema__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CollectionSchema__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionSchema__Group_3__1"


    // $ANTLR start "rule__CollectionSchema__Group_3__1__Impl"
    // InternalMyDsl.g:959:1: rule__CollectionSchema__Group_3__1__Impl : ( ( rule__CollectionSchema__Group_3_1__0 )* ) ;
    public final void rule__CollectionSchema__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:963:1: ( ( ( rule__CollectionSchema__Group_3_1__0 )* ) )
            // InternalMyDsl.g:964:1: ( ( rule__CollectionSchema__Group_3_1__0 )* )
            {
            // InternalMyDsl.g:964:1: ( ( rule__CollectionSchema__Group_3_1__0 )* )
            // InternalMyDsl.g:965:2: ( rule__CollectionSchema__Group_3_1__0 )*
            {
             before(grammarAccess.getCollectionSchemaAccess().getGroup_3_1()); 
            // InternalMyDsl.g:966:2: ( rule__CollectionSchema__Group_3_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==21) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:966:3: rule__CollectionSchema__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__CollectionSchema__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getCollectionSchemaAccess().getGroup_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionSchema__Group_3__1__Impl"


    // $ANTLR start "rule__CollectionSchema__Group_3_1__0"
    // InternalMyDsl.g:975:1: rule__CollectionSchema__Group_3_1__0 : rule__CollectionSchema__Group_3_1__0__Impl rule__CollectionSchema__Group_3_1__1 ;
    public final void rule__CollectionSchema__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:979:1: ( rule__CollectionSchema__Group_3_1__0__Impl rule__CollectionSchema__Group_3_1__1 )
            // InternalMyDsl.g:980:2: rule__CollectionSchema__Group_3_1__0__Impl rule__CollectionSchema__Group_3_1__1
            {
            pushFollow(FOLLOW_13);
            rule__CollectionSchema__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CollectionSchema__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionSchema__Group_3_1__0"


    // $ANTLR start "rule__CollectionSchema__Group_3_1__0__Impl"
    // InternalMyDsl.g:987:1: rule__CollectionSchema__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__CollectionSchema__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:991:1: ( ( ',' ) )
            // InternalMyDsl.g:992:1: ( ',' )
            {
            // InternalMyDsl.g:992:1: ( ',' )
            // InternalMyDsl.g:993:2: ','
            {
             before(grammarAccess.getCollectionSchemaAccess().getCommaKeyword_3_1_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getCollectionSchemaAccess().getCommaKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionSchema__Group_3_1__0__Impl"


    // $ANTLR start "rule__CollectionSchema__Group_3_1__1"
    // InternalMyDsl.g:1002:1: rule__CollectionSchema__Group_3_1__1 : rule__CollectionSchema__Group_3_1__1__Impl ;
    public final void rule__CollectionSchema__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1006:1: ( rule__CollectionSchema__Group_3_1__1__Impl )
            // InternalMyDsl.g:1007:2: rule__CollectionSchema__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CollectionSchema__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionSchema__Group_3_1__1"


    // $ANTLR start "rule__CollectionSchema__Group_3_1__1__Impl"
    // InternalMyDsl.g:1013:1: rule__CollectionSchema__Group_3_1__1__Impl : ( ( rule__CollectionSchema__DefinationAssignment_3_1_1 ) ) ;
    public final void rule__CollectionSchema__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1017:1: ( ( ( rule__CollectionSchema__DefinationAssignment_3_1_1 ) ) )
            // InternalMyDsl.g:1018:1: ( ( rule__CollectionSchema__DefinationAssignment_3_1_1 ) )
            {
            // InternalMyDsl.g:1018:1: ( ( rule__CollectionSchema__DefinationAssignment_3_1_1 ) )
            // InternalMyDsl.g:1019:2: ( rule__CollectionSchema__DefinationAssignment_3_1_1 )
            {
             before(grammarAccess.getCollectionSchemaAccess().getDefinationAssignment_3_1_1()); 
            // InternalMyDsl.g:1020:2: ( rule__CollectionSchema__DefinationAssignment_3_1_1 )
            // InternalMyDsl.g:1020:3: rule__CollectionSchema__DefinationAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__CollectionSchema__DefinationAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCollectionSchemaAccess().getDefinationAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionSchema__Group_3_1__1__Impl"


    // $ANTLR start "rule__CollectionFieldDefination__Group_0__0"
    // InternalMyDsl.g:1029:1: rule__CollectionFieldDefination__Group_0__0 : rule__CollectionFieldDefination__Group_0__0__Impl rule__CollectionFieldDefination__Group_0__1 ;
    public final void rule__CollectionFieldDefination__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1033:1: ( rule__CollectionFieldDefination__Group_0__0__Impl rule__CollectionFieldDefination__Group_0__1 )
            // InternalMyDsl.g:1034:2: rule__CollectionFieldDefination__Group_0__0__Impl rule__CollectionFieldDefination__Group_0__1
            {
            pushFollow(FOLLOW_16);
            rule__CollectionFieldDefination__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CollectionFieldDefination__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionFieldDefination__Group_0__0"


    // $ANTLR start "rule__CollectionFieldDefination__Group_0__0__Impl"
    // InternalMyDsl.g:1041:1: rule__CollectionFieldDefination__Group_0__0__Impl : ( ( rule__CollectionFieldDefination__NameAssignment_0_0 ) ) ;
    public final void rule__CollectionFieldDefination__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1045:1: ( ( ( rule__CollectionFieldDefination__NameAssignment_0_0 ) ) )
            // InternalMyDsl.g:1046:1: ( ( rule__CollectionFieldDefination__NameAssignment_0_0 ) )
            {
            // InternalMyDsl.g:1046:1: ( ( rule__CollectionFieldDefination__NameAssignment_0_0 ) )
            // InternalMyDsl.g:1047:2: ( rule__CollectionFieldDefination__NameAssignment_0_0 )
            {
             before(grammarAccess.getCollectionFieldDefinationAccess().getNameAssignment_0_0()); 
            // InternalMyDsl.g:1048:2: ( rule__CollectionFieldDefination__NameAssignment_0_0 )
            // InternalMyDsl.g:1048:3: rule__CollectionFieldDefination__NameAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__CollectionFieldDefination__NameAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getCollectionFieldDefinationAccess().getNameAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionFieldDefination__Group_0__0__Impl"


    // $ANTLR start "rule__CollectionFieldDefination__Group_0__1"
    // InternalMyDsl.g:1056:1: rule__CollectionFieldDefination__Group_0__1 : rule__CollectionFieldDefination__Group_0__1__Impl rule__CollectionFieldDefination__Group_0__2 ;
    public final void rule__CollectionFieldDefination__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1060:1: ( rule__CollectionFieldDefination__Group_0__1__Impl rule__CollectionFieldDefination__Group_0__2 )
            // InternalMyDsl.g:1061:2: rule__CollectionFieldDefination__Group_0__1__Impl rule__CollectionFieldDefination__Group_0__2
            {
            pushFollow(FOLLOW_17);
            rule__CollectionFieldDefination__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CollectionFieldDefination__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionFieldDefination__Group_0__1"


    // $ANTLR start "rule__CollectionFieldDefination__Group_0__1__Impl"
    // InternalMyDsl.g:1068:1: rule__CollectionFieldDefination__Group_0__1__Impl : ( ':' ) ;
    public final void rule__CollectionFieldDefination__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1072:1: ( ( ':' ) )
            // InternalMyDsl.g:1073:1: ( ':' )
            {
            // InternalMyDsl.g:1073:1: ( ':' )
            // InternalMyDsl.g:1074:2: ':'
            {
             before(grammarAccess.getCollectionFieldDefinationAccess().getColonKeyword_0_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getCollectionFieldDefinationAccess().getColonKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionFieldDefination__Group_0__1__Impl"


    // $ANTLR start "rule__CollectionFieldDefination__Group_0__2"
    // InternalMyDsl.g:1083:1: rule__CollectionFieldDefination__Group_0__2 : rule__CollectionFieldDefination__Group_0__2__Impl rule__CollectionFieldDefination__Group_0__3 ;
    public final void rule__CollectionFieldDefination__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1087:1: ( rule__CollectionFieldDefination__Group_0__2__Impl rule__CollectionFieldDefination__Group_0__3 )
            // InternalMyDsl.g:1088:2: rule__CollectionFieldDefination__Group_0__2__Impl rule__CollectionFieldDefination__Group_0__3
            {
            pushFollow(FOLLOW_18);
            rule__CollectionFieldDefination__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CollectionFieldDefination__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionFieldDefination__Group_0__2"


    // $ANTLR start "rule__CollectionFieldDefination__Group_0__2__Impl"
    // InternalMyDsl.g:1095:1: rule__CollectionFieldDefination__Group_0__2__Impl : ( ( rule__CollectionFieldDefination__FieldTypeAssignment_0_2 ) ) ;
    public final void rule__CollectionFieldDefination__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1099:1: ( ( ( rule__CollectionFieldDefination__FieldTypeAssignment_0_2 ) ) )
            // InternalMyDsl.g:1100:1: ( ( rule__CollectionFieldDefination__FieldTypeAssignment_0_2 ) )
            {
            // InternalMyDsl.g:1100:1: ( ( rule__CollectionFieldDefination__FieldTypeAssignment_0_2 ) )
            // InternalMyDsl.g:1101:2: ( rule__CollectionFieldDefination__FieldTypeAssignment_0_2 )
            {
             before(grammarAccess.getCollectionFieldDefinationAccess().getFieldTypeAssignment_0_2()); 
            // InternalMyDsl.g:1102:2: ( rule__CollectionFieldDefination__FieldTypeAssignment_0_2 )
            // InternalMyDsl.g:1102:3: rule__CollectionFieldDefination__FieldTypeAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__CollectionFieldDefination__FieldTypeAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getCollectionFieldDefinationAccess().getFieldTypeAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionFieldDefination__Group_0__2__Impl"


    // $ANTLR start "rule__CollectionFieldDefination__Group_0__3"
    // InternalMyDsl.g:1110:1: rule__CollectionFieldDefination__Group_0__3 : rule__CollectionFieldDefination__Group_0__3__Impl rule__CollectionFieldDefination__Group_0__4 ;
    public final void rule__CollectionFieldDefination__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1114:1: ( rule__CollectionFieldDefination__Group_0__3__Impl rule__CollectionFieldDefination__Group_0__4 )
            // InternalMyDsl.g:1115:2: rule__CollectionFieldDefination__Group_0__3__Impl rule__CollectionFieldDefination__Group_0__4
            {
            pushFollow(FOLLOW_18);
            rule__CollectionFieldDefination__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CollectionFieldDefination__Group_0__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionFieldDefination__Group_0__3"


    // $ANTLR start "rule__CollectionFieldDefination__Group_0__3__Impl"
    // InternalMyDsl.g:1122:1: rule__CollectionFieldDefination__Group_0__3__Impl : ( ( rule__CollectionFieldDefination__StatusAssignment_0_3 )? ) ;
    public final void rule__CollectionFieldDefination__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1126:1: ( ( ( rule__CollectionFieldDefination__StatusAssignment_0_3 )? ) )
            // InternalMyDsl.g:1127:1: ( ( rule__CollectionFieldDefination__StatusAssignment_0_3 )? )
            {
            // InternalMyDsl.g:1127:1: ( ( rule__CollectionFieldDefination__StatusAssignment_0_3 )? )
            // InternalMyDsl.g:1128:2: ( rule__CollectionFieldDefination__StatusAssignment_0_3 )?
            {
             before(grammarAccess.getCollectionFieldDefinationAccess().getStatusAssignment_0_3()); 
            // InternalMyDsl.g:1129:2: ( rule__CollectionFieldDefination__StatusAssignment_0_3 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==33) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:1129:3: rule__CollectionFieldDefination__StatusAssignment_0_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__CollectionFieldDefination__StatusAssignment_0_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCollectionFieldDefinationAccess().getStatusAssignment_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionFieldDefination__Group_0__3__Impl"


    // $ANTLR start "rule__CollectionFieldDefination__Group_0__4"
    // InternalMyDsl.g:1137:1: rule__CollectionFieldDefination__Group_0__4 : rule__CollectionFieldDefination__Group_0__4__Impl ;
    public final void rule__CollectionFieldDefination__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1141:1: ( rule__CollectionFieldDefination__Group_0__4__Impl )
            // InternalMyDsl.g:1142:2: rule__CollectionFieldDefination__Group_0__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CollectionFieldDefination__Group_0__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionFieldDefination__Group_0__4"


    // $ANTLR start "rule__CollectionFieldDefination__Group_0__4__Impl"
    // InternalMyDsl.g:1148:1: rule__CollectionFieldDefination__Group_0__4__Impl : ( ( rule__CollectionFieldDefination__UniqueKeyAssignment_0_4 )? ) ;
    public final void rule__CollectionFieldDefination__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1152:1: ( ( ( rule__CollectionFieldDefination__UniqueKeyAssignment_0_4 )? ) )
            // InternalMyDsl.g:1153:1: ( ( rule__CollectionFieldDefination__UniqueKeyAssignment_0_4 )? )
            {
            // InternalMyDsl.g:1153:1: ( ( rule__CollectionFieldDefination__UniqueKeyAssignment_0_4 )? )
            // InternalMyDsl.g:1154:2: ( rule__CollectionFieldDefination__UniqueKeyAssignment_0_4 )?
            {
             before(grammarAccess.getCollectionFieldDefinationAccess().getUniqueKeyAssignment_0_4()); 
            // InternalMyDsl.g:1155:2: ( rule__CollectionFieldDefination__UniqueKeyAssignment_0_4 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==34) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:1155:3: rule__CollectionFieldDefination__UniqueKeyAssignment_0_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__CollectionFieldDefination__UniqueKeyAssignment_0_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCollectionFieldDefinationAccess().getUniqueKeyAssignment_0_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionFieldDefination__Group_0__4__Impl"


    // $ANTLR start "rule__CollectionFieldDefination__Group_1__0"
    // InternalMyDsl.g:1164:1: rule__CollectionFieldDefination__Group_1__0 : rule__CollectionFieldDefination__Group_1__0__Impl rule__CollectionFieldDefination__Group_1__1 ;
    public final void rule__CollectionFieldDefination__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1168:1: ( rule__CollectionFieldDefination__Group_1__0__Impl rule__CollectionFieldDefination__Group_1__1 )
            // InternalMyDsl.g:1169:2: rule__CollectionFieldDefination__Group_1__0__Impl rule__CollectionFieldDefination__Group_1__1
            {
            pushFollow(FOLLOW_16);
            rule__CollectionFieldDefination__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CollectionFieldDefination__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionFieldDefination__Group_1__0"


    // $ANTLR start "rule__CollectionFieldDefination__Group_1__0__Impl"
    // InternalMyDsl.g:1176:1: rule__CollectionFieldDefination__Group_1__0__Impl : ( ( rule__CollectionFieldDefination__NameAssignment_1_0 ) ) ;
    public final void rule__CollectionFieldDefination__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1180:1: ( ( ( rule__CollectionFieldDefination__NameAssignment_1_0 ) ) )
            // InternalMyDsl.g:1181:1: ( ( rule__CollectionFieldDefination__NameAssignment_1_0 ) )
            {
            // InternalMyDsl.g:1181:1: ( ( rule__CollectionFieldDefination__NameAssignment_1_0 ) )
            // InternalMyDsl.g:1182:2: ( rule__CollectionFieldDefination__NameAssignment_1_0 )
            {
             before(grammarAccess.getCollectionFieldDefinationAccess().getNameAssignment_1_0()); 
            // InternalMyDsl.g:1183:2: ( rule__CollectionFieldDefination__NameAssignment_1_0 )
            // InternalMyDsl.g:1183:3: rule__CollectionFieldDefination__NameAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__CollectionFieldDefination__NameAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getCollectionFieldDefinationAccess().getNameAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionFieldDefination__Group_1__0__Impl"


    // $ANTLR start "rule__CollectionFieldDefination__Group_1__1"
    // InternalMyDsl.g:1191:1: rule__CollectionFieldDefination__Group_1__1 : rule__CollectionFieldDefination__Group_1__1__Impl rule__CollectionFieldDefination__Group_1__2 ;
    public final void rule__CollectionFieldDefination__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1195:1: ( rule__CollectionFieldDefination__Group_1__1__Impl rule__CollectionFieldDefination__Group_1__2 )
            // InternalMyDsl.g:1196:2: rule__CollectionFieldDefination__Group_1__1__Impl rule__CollectionFieldDefination__Group_1__2
            {
            pushFollow(FOLLOW_19);
            rule__CollectionFieldDefination__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CollectionFieldDefination__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionFieldDefination__Group_1__1"


    // $ANTLR start "rule__CollectionFieldDefination__Group_1__1__Impl"
    // InternalMyDsl.g:1203:1: rule__CollectionFieldDefination__Group_1__1__Impl : ( ':' ) ;
    public final void rule__CollectionFieldDefination__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1207:1: ( ( ':' ) )
            // InternalMyDsl.g:1208:1: ( ':' )
            {
            // InternalMyDsl.g:1208:1: ( ':' )
            // InternalMyDsl.g:1209:2: ':'
            {
             before(grammarAccess.getCollectionFieldDefinationAccess().getColonKeyword_1_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getCollectionFieldDefinationAccess().getColonKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionFieldDefination__Group_1__1__Impl"


    // $ANTLR start "rule__CollectionFieldDefination__Group_1__2"
    // InternalMyDsl.g:1218:1: rule__CollectionFieldDefination__Group_1__2 : rule__CollectionFieldDefination__Group_1__2__Impl rule__CollectionFieldDefination__Group_1__3 ;
    public final void rule__CollectionFieldDefination__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1222:1: ( rule__CollectionFieldDefination__Group_1__2__Impl rule__CollectionFieldDefination__Group_1__3 )
            // InternalMyDsl.g:1223:2: rule__CollectionFieldDefination__Group_1__2__Impl rule__CollectionFieldDefination__Group_1__3
            {
            pushFollow(FOLLOW_13);
            rule__CollectionFieldDefination__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CollectionFieldDefination__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionFieldDefination__Group_1__2"


    // $ANTLR start "rule__CollectionFieldDefination__Group_1__2__Impl"
    // InternalMyDsl.g:1230:1: rule__CollectionFieldDefination__Group_1__2__Impl : ( 'ref' ) ;
    public final void rule__CollectionFieldDefination__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1234:1: ( ( 'ref' ) )
            // InternalMyDsl.g:1235:1: ( 'ref' )
            {
            // InternalMyDsl.g:1235:1: ( 'ref' )
            // InternalMyDsl.g:1236:2: 'ref'
            {
             before(grammarAccess.getCollectionFieldDefinationAccess().getRefKeyword_1_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getCollectionFieldDefinationAccess().getRefKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionFieldDefination__Group_1__2__Impl"


    // $ANTLR start "rule__CollectionFieldDefination__Group_1__3"
    // InternalMyDsl.g:1245:1: rule__CollectionFieldDefination__Group_1__3 : rule__CollectionFieldDefination__Group_1__3__Impl ;
    public final void rule__CollectionFieldDefination__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1249:1: ( rule__CollectionFieldDefination__Group_1__3__Impl )
            // InternalMyDsl.g:1250:2: rule__CollectionFieldDefination__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CollectionFieldDefination__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionFieldDefination__Group_1__3"


    // $ANTLR start "rule__CollectionFieldDefination__Group_1__3__Impl"
    // InternalMyDsl.g:1256:1: rule__CollectionFieldDefination__Group_1__3__Impl : ( ( rule__CollectionFieldDefination__RefCollectionAssignment_1_3 ) ) ;
    public final void rule__CollectionFieldDefination__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1260:1: ( ( ( rule__CollectionFieldDefination__RefCollectionAssignment_1_3 ) ) )
            // InternalMyDsl.g:1261:1: ( ( rule__CollectionFieldDefination__RefCollectionAssignment_1_3 ) )
            {
            // InternalMyDsl.g:1261:1: ( ( rule__CollectionFieldDefination__RefCollectionAssignment_1_3 ) )
            // InternalMyDsl.g:1262:2: ( rule__CollectionFieldDefination__RefCollectionAssignment_1_3 )
            {
             before(grammarAccess.getCollectionFieldDefinationAccess().getRefCollectionAssignment_1_3()); 
            // InternalMyDsl.g:1263:2: ( rule__CollectionFieldDefination__RefCollectionAssignment_1_3 )
            // InternalMyDsl.g:1263:3: rule__CollectionFieldDefination__RefCollectionAssignment_1_3
            {
            pushFollow(FOLLOW_2);
            rule__CollectionFieldDefination__RefCollectionAssignment_1_3();

            state._fsp--;


            }

             after(grammarAccess.getCollectionFieldDefinationAccess().getRefCollectionAssignment_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionFieldDefination__Group_1__3__Impl"


    // $ANTLR start "rule__CRUDOperations__Group_0__0"
    // InternalMyDsl.g:1272:1: rule__CRUDOperations__Group_0__0 : rule__CRUDOperations__Group_0__0__Impl rule__CRUDOperations__Group_0__1 ;
    public final void rule__CRUDOperations__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1276:1: ( rule__CRUDOperations__Group_0__0__Impl rule__CRUDOperations__Group_0__1 )
            // InternalMyDsl.g:1277:2: rule__CRUDOperations__Group_0__0__Impl rule__CRUDOperations__Group_0__1
            {
            pushFollow(FOLLOW_13);
            rule__CRUDOperations__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CRUDOperations__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CRUDOperations__Group_0__0"


    // $ANTLR start "rule__CRUDOperations__Group_0__0__Impl"
    // InternalMyDsl.g:1284:1: rule__CRUDOperations__Group_0__0__Impl : ( 'task' ) ;
    public final void rule__CRUDOperations__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1288:1: ( ( 'task' ) )
            // InternalMyDsl.g:1289:1: ( 'task' )
            {
            // InternalMyDsl.g:1289:1: ( 'task' )
            // InternalMyDsl.g:1290:2: 'task'
            {
             before(grammarAccess.getCRUDOperationsAccess().getTaskKeyword_0_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getCRUDOperationsAccess().getTaskKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CRUDOperations__Group_0__0__Impl"


    // $ANTLR start "rule__CRUDOperations__Group_0__1"
    // InternalMyDsl.g:1299:1: rule__CRUDOperations__Group_0__1 : rule__CRUDOperations__Group_0__1__Impl rule__CRUDOperations__Group_0__2 ;
    public final void rule__CRUDOperations__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1303:1: ( rule__CRUDOperations__Group_0__1__Impl rule__CRUDOperations__Group_0__2 )
            // InternalMyDsl.g:1304:2: rule__CRUDOperations__Group_0__1__Impl rule__CRUDOperations__Group_0__2
            {
            pushFollow(FOLLOW_16);
            rule__CRUDOperations__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CRUDOperations__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CRUDOperations__Group_0__1"


    // $ANTLR start "rule__CRUDOperations__Group_0__1__Impl"
    // InternalMyDsl.g:1311:1: rule__CRUDOperations__Group_0__1__Impl : ( ( rule__CRUDOperations__NameAssignment_0_1 ) ) ;
    public final void rule__CRUDOperations__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1315:1: ( ( ( rule__CRUDOperations__NameAssignment_0_1 ) ) )
            // InternalMyDsl.g:1316:1: ( ( rule__CRUDOperations__NameAssignment_0_1 ) )
            {
            // InternalMyDsl.g:1316:1: ( ( rule__CRUDOperations__NameAssignment_0_1 ) )
            // InternalMyDsl.g:1317:2: ( rule__CRUDOperations__NameAssignment_0_1 )
            {
             before(grammarAccess.getCRUDOperationsAccess().getNameAssignment_0_1()); 
            // InternalMyDsl.g:1318:2: ( rule__CRUDOperations__NameAssignment_0_1 )
            // InternalMyDsl.g:1318:3: rule__CRUDOperations__NameAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__CRUDOperations__NameAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getCRUDOperationsAccess().getNameAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CRUDOperations__Group_0__1__Impl"


    // $ANTLR start "rule__CRUDOperations__Group_0__2"
    // InternalMyDsl.g:1326:1: rule__CRUDOperations__Group_0__2 : rule__CRUDOperations__Group_0__2__Impl rule__CRUDOperations__Group_0__3 ;
    public final void rule__CRUDOperations__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1330:1: ( rule__CRUDOperations__Group_0__2__Impl rule__CRUDOperations__Group_0__3 )
            // InternalMyDsl.g:1331:2: rule__CRUDOperations__Group_0__2__Impl rule__CRUDOperations__Group_0__3
            {
            pushFollow(FOLLOW_8);
            rule__CRUDOperations__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CRUDOperations__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CRUDOperations__Group_0__2"


    // $ANTLR start "rule__CRUDOperations__Group_0__2__Impl"
    // InternalMyDsl.g:1338:1: rule__CRUDOperations__Group_0__2__Impl : ( ':' ) ;
    public final void rule__CRUDOperations__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1342:1: ( ( ':' ) )
            // InternalMyDsl.g:1343:1: ( ':' )
            {
            // InternalMyDsl.g:1343:1: ( ':' )
            // InternalMyDsl.g:1344:2: ':'
            {
             before(grammarAccess.getCRUDOperationsAccess().getColonKeyword_0_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getCRUDOperationsAccess().getColonKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CRUDOperations__Group_0__2__Impl"


    // $ANTLR start "rule__CRUDOperations__Group_0__3"
    // InternalMyDsl.g:1353:1: rule__CRUDOperations__Group_0__3 : rule__CRUDOperations__Group_0__3__Impl ;
    public final void rule__CRUDOperations__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1357:1: ( rule__CRUDOperations__Group_0__3__Impl )
            // InternalMyDsl.g:1358:2: rule__CRUDOperations__Group_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CRUDOperations__Group_0__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CRUDOperations__Group_0__3"


    // $ANTLR start "rule__CRUDOperations__Group_0__3__Impl"
    // InternalMyDsl.g:1364:1: rule__CRUDOperations__Group_0__3__Impl : ( ( rule__CRUDOperations__Group_0_3__0 ) ) ;
    public final void rule__CRUDOperations__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1368:1: ( ( ( rule__CRUDOperations__Group_0_3__0 ) ) )
            // InternalMyDsl.g:1369:1: ( ( rule__CRUDOperations__Group_0_3__0 ) )
            {
            // InternalMyDsl.g:1369:1: ( ( rule__CRUDOperations__Group_0_3__0 ) )
            // InternalMyDsl.g:1370:2: ( rule__CRUDOperations__Group_0_3__0 )
            {
             before(grammarAccess.getCRUDOperationsAccess().getGroup_0_3()); 
            // InternalMyDsl.g:1371:2: ( rule__CRUDOperations__Group_0_3__0 )
            // InternalMyDsl.g:1371:3: rule__CRUDOperations__Group_0_3__0
            {
            pushFollow(FOLLOW_2);
            rule__CRUDOperations__Group_0_3__0();

            state._fsp--;


            }

             after(grammarAccess.getCRUDOperationsAccess().getGroup_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CRUDOperations__Group_0__3__Impl"


    // $ANTLR start "rule__CRUDOperations__Group_0_3__0"
    // InternalMyDsl.g:1380:1: rule__CRUDOperations__Group_0_3__0 : rule__CRUDOperations__Group_0_3__0__Impl rule__CRUDOperations__Group_0_3__1 ;
    public final void rule__CRUDOperations__Group_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1384:1: ( rule__CRUDOperations__Group_0_3__0__Impl rule__CRUDOperations__Group_0_3__1 )
            // InternalMyDsl.g:1385:2: rule__CRUDOperations__Group_0_3__0__Impl rule__CRUDOperations__Group_0_3__1
            {
            pushFollow(FOLLOW_20);
            rule__CRUDOperations__Group_0_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CRUDOperations__Group_0_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CRUDOperations__Group_0_3__0"


    // $ANTLR start "rule__CRUDOperations__Group_0_3__0__Impl"
    // InternalMyDsl.g:1392:1: rule__CRUDOperations__Group_0_3__0__Impl : ( '{' ) ;
    public final void rule__CRUDOperations__Group_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1396:1: ( ( '{' ) )
            // InternalMyDsl.g:1397:1: ( '{' )
            {
            // InternalMyDsl.g:1397:1: ( '{' )
            // InternalMyDsl.g:1398:2: '{'
            {
             before(grammarAccess.getCRUDOperationsAccess().getLeftCurlyBracketKeyword_0_3_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getCRUDOperationsAccess().getLeftCurlyBracketKeyword_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CRUDOperations__Group_0_3__0__Impl"


    // $ANTLR start "rule__CRUDOperations__Group_0_3__1"
    // InternalMyDsl.g:1407:1: rule__CRUDOperations__Group_0_3__1 : rule__CRUDOperations__Group_0_3__1__Impl rule__CRUDOperations__Group_0_3__2 ;
    public final void rule__CRUDOperations__Group_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1411:1: ( rule__CRUDOperations__Group_0_3__1__Impl rule__CRUDOperations__Group_0_3__2 )
            // InternalMyDsl.g:1412:2: rule__CRUDOperations__Group_0_3__1__Impl rule__CRUDOperations__Group_0_3__2
            {
            pushFollow(FOLLOW_21);
            rule__CRUDOperations__Group_0_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CRUDOperations__Group_0_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CRUDOperations__Group_0_3__1"


    // $ANTLR start "rule__CRUDOperations__Group_0_3__1__Impl"
    // InternalMyDsl.g:1419:1: rule__CRUDOperations__Group_0_3__1__Impl : ( 'operation:' ) ;
    public final void rule__CRUDOperations__Group_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1423:1: ( ( 'operation:' ) )
            // InternalMyDsl.g:1424:1: ( 'operation:' )
            {
            // InternalMyDsl.g:1424:1: ( 'operation:' )
            // InternalMyDsl.g:1425:2: 'operation:'
            {
             before(grammarAccess.getCRUDOperationsAccess().getOperationKeyword_0_3_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getCRUDOperationsAccess().getOperationKeyword_0_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CRUDOperations__Group_0_3__1__Impl"


    // $ANTLR start "rule__CRUDOperations__Group_0_3__2"
    // InternalMyDsl.g:1434:1: rule__CRUDOperations__Group_0_3__2 : rule__CRUDOperations__Group_0_3__2__Impl rule__CRUDOperations__Group_0_3__3 ;
    public final void rule__CRUDOperations__Group_0_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1438:1: ( rule__CRUDOperations__Group_0_3__2__Impl rule__CRUDOperations__Group_0_3__3 )
            // InternalMyDsl.g:1439:2: rule__CRUDOperations__Group_0_3__2__Impl rule__CRUDOperations__Group_0_3__3
            {
            pushFollow(FOLLOW_11);
            rule__CRUDOperations__Group_0_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CRUDOperations__Group_0_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CRUDOperations__Group_0_3__2"


    // $ANTLR start "rule__CRUDOperations__Group_0_3__2__Impl"
    // InternalMyDsl.g:1446:1: rule__CRUDOperations__Group_0_3__2__Impl : ( ( rule__CRUDOperations__TypeAssignment_0_3_2 ) ) ;
    public final void rule__CRUDOperations__Group_0_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1450:1: ( ( ( rule__CRUDOperations__TypeAssignment_0_3_2 ) ) )
            // InternalMyDsl.g:1451:1: ( ( rule__CRUDOperations__TypeAssignment_0_3_2 ) )
            {
            // InternalMyDsl.g:1451:1: ( ( rule__CRUDOperations__TypeAssignment_0_3_2 ) )
            // InternalMyDsl.g:1452:2: ( rule__CRUDOperations__TypeAssignment_0_3_2 )
            {
             before(grammarAccess.getCRUDOperationsAccess().getTypeAssignment_0_3_2()); 
            // InternalMyDsl.g:1453:2: ( rule__CRUDOperations__TypeAssignment_0_3_2 )
            // InternalMyDsl.g:1453:3: rule__CRUDOperations__TypeAssignment_0_3_2
            {
            pushFollow(FOLLOW_2);
            rule__CRUDOperations__TypeAssignment_0_3_2();

            state._fsp--;


            }

             after(grammarAccess.getCRUDOperationsAccess().getTypeAssignment_0_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CRUDOperations__Group_0_3__2__Impl"


    // $ANTLR start "rule__CRUDOperations__Group_0_3__3"
    // InternalMyDsl.g:1461:1: rule__CRUDOperations__Group_0_3__3 : rule__CRUDOperations__Group_0_3__3__Impl rule__CRUDOperations__Group_0_3__4 ;
    public final void rule__CRUDOperations__Group_0_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1465:1: ( rule__CRUDOperations__Group_0_3__3__Impl rule__CRUDOperations__Group_0_3__4 )
            // InternalMyDsl.g:1466:2: rule__CRUDOperations__Group_0_3__3__Impl rule__CRUDOperations__Group_0_3__4
            {
            pushFollow(FOLLOW_22);
            rule__CRUDOperations__Group_0_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CRUDOperations__Group_0_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CRUDOperations__Group_0_3__3"


    // $ANTLR start "rule__CRUDOperations__Group_0_3__3__Impl"
    // InternalMyDsl.g:1473:1: rule__CRUDOperations__Group_0_3__3__Impl : ( ',' ) ;
    public final void rule__CRUDOperations__Group_0_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1477:1: ( ( ',' ) )
            // InternalMyDsl.g:1478:1: ( ',' )
            {
            // InternalMyDsl.g:1478:1: ( ',' )
            // InternalMyDsl.g:1479:2: ','
            {
             before(grammarAccess.getCRUDOperationsAccess().getCommaKeyword_0_3_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getCRUDOperationsAccess().getCommaKeyword_0_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CRUDOperations__Group_0_3__3__Impl"


    // $ANTLR start "rule__CRUDOperations__Group_0_3__4"
    // InternalMyDsl.g:1488:1: rule__CRUDOperations__Group_0_3__4 : rule__CRUDOperations__Group_0_3__4__Impl rule__CRUDOperations__Group_0_3__5 ;
    public final void rule__CRUDOperations__Group_0_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1492:1: ( rule__CRUDOperations__Group_0_3__4__Impl rule__CRUDOperations__Group_0_3__5 )
            // InternalMyDsl.g:1493:2: rule__CRUDOperations__Group_0_3__4__Impl rule__CRUDOperations__Group_0_3__5
            {
            pushFollow(FOLLOW_13);
            rule__CRUDOperations__Group_0_3__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CRUDOperations__Group_0_3__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CRUDOperations__Group_0_3__4"


    // $ANTLR start "rule__CRUDOperations__Group_0_3__4__Impl"
    // InternalMyDsl.g:1500:1: rule__CRUDOperations__Group_0_3__4__Impl : ( 'collection:' ) ;
    public final void rule__CRUDOperations__Group_0_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1504:1: ( ( 'collection:' ) )
            // InternalMyDsl.g:1505:1: ( 'collection:' )
            {
            // InternalMyDsl.g:1505:1: ( 'collection:' )
            // InternalMyDsl.g:1506:2: 'collection:'
            {
             before(grammarAccess.getCRUDOperationsAccess().getCollectionKeyword_0_3_4()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getCRUDOperationsAccess().getCollectionKeyword_0_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CRUDOperations__Group_0_3__4__Impl"


    // $ANTLR start "rule__CRUDOperations__Group_0_3__5"
    // InternalMyDsl.g:1515:1: rule__CRUDOperations__Group_0_3__5 : rule__CRUDOperations__Group_0_3__5__Impl rule__CRUDOperations__Group_0_3__6 ;
    public final void rule__CRUDOperations__Group_0_3__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1519:1: ( rule__CRUDOperations__Group_0_3__5__Impl rule__CRUDOperations__Group_0_3__6 )
            // InternalMyDsl.g:1520:2: rule__CRUDOperations__Group_0_3__5__Impl rule__CRUDOperations__Group_0_3__6
            {
            pushFollow(FOLLOW_23);
            rule__CRUDOperations__Group_0_3__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CRUDOperations__Group_0_3__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CRUDOperations__Group_0_3__5"


    // $ANTLR start "rule__CRUDOperations__Group_0_3__5__Impl"
    // InternalMyDsl.g:1527:1: rule__CRUDOperations__Group_0_3__5__Impl : ( ( rule__CRUDOperations__CollectionAssignment_0_3_5 ) ) ;
    public final void rule__CRUDOperations__Group_0_3__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1531:1: ( ( ( rule__CRUDOperations__CollectionAssignment_0_3_5 ) ) )
            // InternalMyDsl.g:1532:1: ( ( rule__CRUDOperations__CollectionAssignment_0_3_5 ) )
            {
            // InternalMyDsl.g:1532:1: ( ( rule__CRUDOperations__CollectionAssignment_0_3_5 ) )
            // InternalMyDsl.g:1533:2: ( rule__CRUDOperations__CollectionAssignment_0_3_5 )
            {
             before(grammarAccess.getCRUDOperationsAccess().getCollectionAssignment_0_3_5()); 
            // InternalMyDsl.g:1534:2: ( rule__CRUDOperations__CollectionAssignment_0_3_5 )
            // InternalMyDsl.g:1534:3: rule__CRUDOperations__CollectionAssignment_0_3_5
            {
            pushFollow(FOLLOW_2);
            rule__CRUDOperations__CollectionAssignment_0_3_5();

            state._fsp--;


            }

             after(grammarAccess.getCRUDOperationsAccess().getCollectionAssignment_0_3_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CRUDOperations__Group_0_3__5__Impl"


    // $ANTLR start "rule__CRUDOperations__Group_0_3__6"
    // InternalMyDsl.g:1542:1: rule__CRUDOperations__Group_0_3__6 : rule__CRUDOperations__Group_0_3__6__Impl rule__CRUDOperations__Group_0_3__7 ;
    public final void rule__CRUDOperations__Group_0_3__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1546:1: ( rule__CRUDOperations__Group_0_3__6__Impl rule__CRUDOperations__Group_0_3__7 )
            // InternalMyDsl.g:1547:2: rule__CRUDOperations__Group_0_3__6__Impl rule__CRUDOperations__Group_0_3__7
            {
            pushFollow(FOLLOW_8);
            rule__CRUDOperations__Group_0_3__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CRUDOperations__Group_0_3__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CRUDOperations__Group_0_3__6"


    // $ANTLR start "rule__CRUDOperations__Group_0_3__6__Impl"
    // InternalMyDsl.g:1554:1: rule__CRUDOperations__Group_0_3__6__Impl : ( 'input:' ) ;
    public final void rule__CRUDOperations__Group_0_3__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1558:1: ( ( 'input:' ) )
            // InternalMyDsl.g:1559:1: ( 'input:' )
            {
            // InternalMyDsl.g:1559:1: ( 'input:' )
            // InternalMyDsl.g:1560:2: 'input:'
            {
             before(grammarAccess.getCRUDOperationsAccess().getInputKeyword_0_3_6()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getCRUDOperationsAccess().getInputKeyword_0_3_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CRUDOperations__Group_0_3__6__Impl"


    // $ANTLR start "rule__CRUDOperations__Group_0_3__7"
    // InternalMyDsl.g:1569:1: rule__CRUDOperations__Group_0_3__7 : rule__CRUDOperations__Group_0_3__7__Impl rule__CRUDOperations__Group_0_3__8 ;
    public final void rule__CRUDOperations__Group_0_3__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1573:1: ( rule__CRUDOperations__Group_0_3__7__Impl rule__CRUDOperations__Group_0_3__8 )
            // InternalMyDsl.g:1574:2: rule__CRUDOperations__Group_0_3__7__Impl rule__CRUDOperations__Group_0_3__8
            {
            pushFollow(FOLLOW_14);
            rule__CRUDOperations__Group_0_3__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CRUDOperations__Group_0_3__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CRUDOperations__Group_0_3__7"


    // $ANTLR start "rule__CRUDOperations__Group_0_3__7__Impl"
    // InternalMyDsl.g:1581:1: rule__CRUDOperations__Group_0_3__7__Impl : ( '{' ) ;
    public final void rule__CRUDOperations__Group_0_3__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1585:1: ( ( '{' ) )
            // InternalMyDsl.g:1586:1: ( '{' )
            {
            // InternalMyDsl.g:1586:1: ( '{' )
            // InternalMyDsl.g:1587:2: '{'
            {
             before(grammarAccess.getCRUDOperationsAccess().getLeftCurlyBracketKeyword_0_3_7()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getCRUDOperationsAccess().getLeftCurlyBracketKeyword_0_3_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CRUDOperations__Group_0_3__7__Impl"


    // $ANTLR start "rule__CRUDOperations__Group_0_3__8"
    // InternalMyDsl.g:1596:1: rule__CRUDOperations__Group_0_3__8 : rule__CRUDOperations__Group_0_3__8__Impl rule__CRUDOperations__Group_0_3__9 ;
    public final void rule__CRUDOperations__Group_0_3__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1600:1: ( rule__CRUDOperations__Group_0_3__8__Impl rule__CRUDOperations__Group_0_3__9 )
            // InternalMyDsl.g:1601:2: rule__CRUDOperations__Group_0_3__8__Impl rule__CRUDOperations__Group_0_3__9
            {
            pushFollow(FOLLOW_14);
            rule__CRUDOperations__Group_0_3__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CRUDOperations__Group_0_3__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CRUDOperations__Group_0_3__8"


    // $ANTLR start "rule__CRUDOperations__Group_0_3__8__Impl"
    // InternalMyDsl.g:1608:1: rule__CRUDOperations__Group_0_3__8__Impl : ( ( rule__CRUDOperations__Group_0_3_8__0 )? ) ;
    public final void rule__CRUDOperations__Group_0_3__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1612:1: ( ( ( rule__CRUDOperations__Group_0_3_8__0 )? ) )
            // InternalMyDsl.g:1613:1: ( ( rule__CRUDOperations__Group_0_3_8__0 )? )
            {
            // InternalMyDsl.g:1613:1: ( ( rule__CRUDOperations__Group_0_3_8__0 )? )
            // InternalMyDsl.g:1614:2: ( rule__CRUDOperations__Group_0_3_8__0 )?
            {
             before(grammarAccess.getCRUDOperationsAccess().getGroup_0_3_8()); 
            // InternalMyDsl.g:1615:2: ( rule__CRUDOperations__Group_0_3_8__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:1615:3: rule__CRUDOperations__Group_0_3_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CRUDOperations__Group_0_3_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCRUDOperationsAccess().getGroup_0_3_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CRUDOperations__Group_0_3__8__Impl"


    // $ANTLR start "rule__CRUDOperations__Group_0_3__9"
    // InternalMyDsl.g:1623:1: rule__CRUDOperations__Group_0_3__9 : rule__CRUDOperations__Group_0_3__9__Impl rule__CRUDOperations__Group_0_3__10 ;
    public final void rule__CRUDOperations__Group_0_3__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1627:1: ( rule__CRUDOperations__Group_0_3__9__Impl rule__CRUDOperations__Group_0_3__10 )
            // InternalMyDsl.g:1628:2: rule__CRUDOperations__Group_0_3__9__Impl rule__CRUDOperations__Group_0_3__10
            {
            pushFollow(FOLLOW_12);
            rule__CRUDOperations__Group_0_3__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CRUDOperations__Group_0_3__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CRUDOperations__Group_0_3__9"


    // $ANTLR start "rule__CRUDOperations__Group_0_3__9__Impl"
    // InternalMyDsl.g:1635:1: rule__CRUDOperations__Group_0_3__9__Impl : ( '}' ) ;
    public final void rule__CRUDOperations__Group_0_3__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1639:1: ( ( '}' ) )
            // InternalMyDsl.g:1640:1: ( '}' )
            {
            // InternalMyDsl.g:1640:1: ( '}' )
            // InternalMyDsl.g:1641:2: '}'
            {
             before(grammarAccess.getCRUDOperationsAccess().getRightCurlyBracketKeyword_0_3_9()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getCRUDOperationsAccess().getRightCurlyBracketKeyword_0_3_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CRUDOperations__Group_0_3__9__Impl"


    // $ANTLR start "rule__CRUDOperations__Group_0_3__10"
    // InternalMyDsl.g:1650:1: rule__CRUDOperations__Group_0_3__10 : rule__CRUDOperations__Group_0_3__10__Impl ;
    public final void rule__CRUDOperations__Group_0_3__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1654:1: ( rule__CRUDOperations__Group_0_3__10__Impl )
            // InternalMyDsl.g:1655:2: rule__CRUDOperations__Group_0_3__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CRUDOperations__Group_0_3__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CRUDOperations__Group_0_3__10"


    // $ANTLR start "rule__CRUDOperations__Group_0_3__10__Impl"
    // InternalMyDsl.g:1661:1: rule__CRUDOperations__Group_0_3__10__Impl : ( '}' ) ;
    public final void rule__CRUDOperations__Group_0_3__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1665:1: ( ( '}' ) )
            // InternalMyDsl.g:1666:1: ( '}' )
            {
            // InternalMyDsl.g:1666:1: ( '}' )
            // InternalMyDsl.g:1667:2: '}'
            {
             before(grammarAccess.getCRUDOperationsAccess().getRightCurlyBracketKeyword_0_3_10()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getCRUDOperationsAccess().getRightCurlyBracketKeyword_0_3_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CRUDOperations__Group_0_3__10__Impl"


    // $ANTLR start "rule__CRUDOperations__Group_0_3_8__0"
    // InternalMyDsl.g:1677:1: rule__CRUDOperations__Group_0_3_8__0 : rule__CRUDOperations__Group_0_3_8__0__Impl rule__CRUDOperations__Group_0_3_8__1 ;
    public final void rule__CRUDOperations__Group_0_3_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1681:1: ( rule__CRUDOperations__Group_0_3_8__0__Impl rule__CRUDOperations__Group_0_3_8__1 )
            // InternalMyDsl.g:1682:2: rule__CRUDOperations__Group_0_3_8__0__Impl rule__CRUDOperations__Group_0_3_8__1
            {
            pushFollow(FOLLOW_11);
            rule__CRUDOperations__Group_0_3_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CRUDOperations__Group_0_3_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CRUDOperations__Group_0_3_8__0"


    // $ANTLR start "rule__CRUDOperations__Group_0_3_8__0__Impl"
    // InternalMyDsl.g:1689:1: rule__CRUDOperations__Group_0_3_8__0__Impl : ( ( rule__CRUDOperations__EntriesAssignment_0_3_8_0 ) ) ;
    public final void rule__CRUDOperations__Group_0_3_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1693:1: ( ( ( rule__CRUDOperations__EntriesAssignment_0_3_8_0 ) ) )
            // InternalMyDsl.g:1694:1: ( ( rule__CRUDOperations__EntriesAssignment_0_3_8_0 ) )
            {
            // InternalMyDsl.g:1694:1: ( ( rule__CRUDOperations__EntriesAssignment_0_3_8_0 ) )
            // InternalMyDsl.g:1695:2: ( rule__CRUDOperations__EntriesAssignment_0_3_8_0 )
            {
             before(grammarAccess.getCRUDOperationsAccess().getEntriesAssignment_0_3_8_0()); 
            // InternalMyDsl.g:1696:2: ( rule__CRUDOperations__EntriesAssignment_0_3_8_0 )
            // InternalMyDsl.g:1696:3: rule__CRUDOperations__EntriesAssignment_0_3_8_0
            {
            pushFollow(FOLLOW_2);
            rule__CRUDOperations__EntriesAssignment_0_3_8_0();

            state._fsp--;


            }

             after(grammarAccess.getCRUDOperationsAccess().getEntriesAssignment_0_3_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CRUDOperations__Group_0_3_8__0__Impl"


    // $ANTLR start "rule__CRUDOperations__Group_0_3_8__1"
    // InternalMyDsl.g:1704:1: rule__CRUDOperations__Group_0_3_8__1 : rule__CRUDOperations__Group_0_3_8__1__Impl ;
    public final void rule__CRUDOperations__Group_0_3_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1708:1: ( rule__CRUDOperations__Group_0_3_8__1__Impl )
            // InternalMyDsl.g:1709:2: rule__CRUDOperations__Group_0_3_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CRUDOperations__Group_0_3_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CRUDOperations__Group_0_3_8__1"


    // $ANTLR start "rule__CRUDOperations__Group_0_3_8__1__Impl"
    // InternalMyDsl.g:1715:1: rule__CRUDOperations__Group_0_3_8__1__Impl : ( ( rule__CRUDOperations__Group_0_3_8_1__0 )* ) ;
    public final void rule__CRUDOperations__Group_0_3_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1719:1: ( ( ( rule__CRUDOperations__Group_0_3_8_1__0 )* ) )
            // InternalMyDsl.g:1720:1: ( ( rule__CRUDOperations__Group_0_3_8_1__0 )* )
            {
            // InternalMyDsl.g:1720:1: ( ( rule__CRUDOperations__Group_0_3_8_1__0 )* )
            // InternalMyDsl.g:1721:2: ( rule__CRUDOperations__Group_0_3_8_1__0 )*
            {
             before(grammarAccess.getCRUDOperationsAccess().getGroup_0_3_8_1()); 
            // InternalMyDsl.g:1722:2: ( rule__CRUDOperations__Group_0_3_8_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==21) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMyDsl.g:1722:3: rule__CRUDOperations__Group_0_3_8_1__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__CRUDOperations__Group_0_3_8_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getCRUDOperationsAccess().getGroup_0_3_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CRUDOperations__Group_0_3_8__1__Impl"


    // $ANTLR start "rule__CRUDOperations__Group_0_3_8_1__0"
    // InternalMyDsl.g:1731:1: rule__CRUDOperations__Group_0_3_8_1__0 : rule__CRUDOperations__Group_0_3_8_1__0__Impl rule__CRUDOperations__Group_0_3_8_1__1 ;
    public final void rule__CRUDOperations__Group_0_3_8_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1735:1: ( rule__CRUDOperations__Group_0_3_8_1__0__Impl rule__CRUDOperations__Group_0_3_8_1__1 )
            // InternalMyDsl.g:1736:2: rule__CRUDOperations__Group_0_3_8_1__0__Impl rule__CRUDOperations__Group_0_3_8_1__1
            {
            pushFollow(FOLLOW_13);
            rule__CRUDOperations__Group_0_3_8_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CRUDOperations__Group_0_3_8_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CRUDOperations__Group_0_3_8_1__0"


    // $ANTLR start "rule__CRUDOperations__Group_0_3_8_1__0__Impl"
    // InternalMyDsl.g:1743:1: rule__CRUDOperations__Group_0_3_8_1__0__Impl : ( ',' ) ;
    public final void rule__CRUDOperations__Group_0_3_8_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1747:1: ( ( ',' ) )
            // InternalMyDsl.g:1748:1: ( ',' )
            {
            // InternalMyDsl.g:1748:1: ( ',' )
            // InternalMyDsl.g:1749:2: ','
            {
             before(grammarAccess.getCRUDOperationsAccess().getCommaKeyword_0_3_8_1_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getCRUDOperationsAccess().getCommaKeyword_0_3_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CRUDOperations__Group_0_3_8_1__0__Impl"


    // $ANTLR start "rule__CRUDOperations__Group_0_3_8_1__1"
    // InternalMyDsl.g:1758:1: rule__CRUDOperations__Group_0_3_8_1__1 : rule__CRUDOperations__Group_0_3_8_1__1__Impl ;
    public final void rule__CRUDOperations__Group_0_3_8_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1762:1: ( rule__CRUDOperations__Group_0_3_8_1__1__Impl )
            // InternalMyDsl.g:1763:2: rule__CRUDOperations__Group_0_3_8_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CRUDOperations__Group_0_3_8_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CRUDOperations__Group_0_3_8_1__1"


    // $ANTLR start "rule__CRUDOperations__Group_0_3_8_1__1__Impl"
    // InternalMyDsl.g:1769:1: rule__CRUDOperations__Group_0_3_8_1__1__Impl : ( ( rule__CRUDOperations__EntriesAssignment_0_3_8_1_1 ) ) ;
    public final void rule__CRUDOperations__Group_0_3_8_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1773:1: ( ( ( rule__CRUDOperations__EntriesAssignment_0_3_8_1_1 ) ) )
            // InternalMyDsl.g:1774:1: ( ( rule__CRUDOperations__EntriesAssignment_0_3_8_1_1 ) )
            {
            // InternalMyDsl.g:1774:1: ( ( rule__CRUDOperations__EntriesAssignment_0_3_8_1_1 ) )
            // InternalMyDsl.g:1775:2: ( rule__CRUDOperations__EntriesAssignment_0_3_8_1_1 )
            {
             before(grammarAccess.getCRUDOperationsAccess().getEntriesAssignment_0_3_8_1_1()); 
            // InternalMyDsl.g:1776:2: ( rule__CRUDOperations__EntriesAssignment_0_3_8_1_1 )
            // InternalMyDsl.g:1776:3: rule__CRUDOperations__EntriesAssignment_0_3_8_1_1
            {
            pushFollow(FOLLOW_2);
            rule__CRUDOperations__EntriesAssignment_0_3_8_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCRUDOperationsAccess().getEntriesAssignment_0_3_8_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CRUDOperations__Group_0_3_8_1__1__Impl"


    // $ANTLR start "rule__CRUDOperations__Group_1__0"
    // InternalMyDsl.g:1785:1: rule__CRUDOperations__Group_1__0 : rule__CRUDOperations__Group_1__0__Impl rule__CRUDOperations__Group_1__1 ;
    public final void rule__CRUDOperations__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1789:1: ( rule__CRUDOperations__Group_1__0__Impl rule__CRUDOperations__Group_1__1 )
            // InternalMyDsl.g:1790:2: rule__CRUDOperations__Group_1__0__Impl rule__CRUDOperations__Group_1__1
            {
            pushFollow(FOLLOW_13);
            rule__CRUDOperations__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CRUDOperations__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CRUDOperations__Group_1__0"


    // $ANTLR start "rule__CRUDOperations__Group_1__0__Impl"
    // InternalMyDsl.g:1797:1: rule__CRUDOperations__Group_1__0__Impl : ( 'task' ) ;
    public final void rule__CRUDOperations__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1801:1: ( ( 'task' ) )
            // InternalMyDsl.g:1802:1: ( 'task' )
            {
            // InternalMyDsl.g:1802:1: ( 'task' )
            // InternalMyDsl.g:1803:2: 'task'
            {
             before(grammarAccess.getCRUDOperationsAccess().getTaskKeyword_1_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getCRUDOperationsAccess().getTaskKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CRUDOperations__Group_1__0__Impl"


    // $ANTLR start "rule__CRUDOperations__Group_1__1"
    // InternalMyDsl.g:1812:1: rule__CRUDOperations__Group_1__1 : rule__CRUDOperations__Group_1__1__Impl rule__CRUDOperations__Group_1__2 ;
    public final void rule__CRUDOperations__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1816:1: ( rule__CRUDOperations__Group_1__1__Impl rule__CRUDOperations__Group_1__2 )
            // InternalMyDsl.g:1817:2: rule__CRUDOperations__Group_1__1__Impl rule__CRUDOperations__Group_1__2
            {
            pushFollow(FOLLOW_16);
            rule__CRUDOperations__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CRUDOperations__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CRUDOperations__Group_1__1"


    // $ANTLR start "rule__CRUDOperations__Group_1__1__Impl"
    // InternalMyDsl.g:1824:1: rule__CRUDOperations__Group_1__1__Impl : ( ( rule__CRUDOperations__NameAssignment_1_1 ) ) ;
    public final void rule__CRUDOperations__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1828:1: ( ( ( rule__CRUDOperations__NameAssignment_1_1 ) ) )
            // InternalMyDsl.g:1829:1: ( ( rule__CRUDOperations__NameAssignment_1_1 ) )
            {
            // InternalMyDsl.g:1829:1: ( ( rule__CRUDOperations__NameAssignment_1_1 ) )
            // InternalMyDsl.g:1830:2: ( rule__CRUDOperations__NameAssignment_1_1 )
            {
             before(grammarAccess.getCRUDOperationsAccess().getNameAssignment_1_1()); 
            // InternalMyDsl.g:1831:2: ( rule__CRUDOperations__NameAssignment_1_1 )
            // InternalMyDsl.g:1831:3: rule__CRUDOperations__NameAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__CRUDOperations__NameAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCRUDOperationsAccess().getNameAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CRUDOperations__Group_1__1__Impl"


    // $ANTLR start "rule__CRUDOperations__Group_1__2"
    // InternalMyDsl.g:1839:1: rule__CRUDOperations__Group_1__2 : rule__CRUDOperations__Group_1__2__Impl rule__CRUDOperations__Group_1__3 ;
    public final void rule__CRUDOperations__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1843:1: ( rule__CRUDOperations__Group_1__2__Impl rule__CRUDOperations__Group_1__3 )
            // InternalMyDsl.g:1844:2: rule__CRUDOperations__Group_1__2__Impl rule__CRUDOperations__Group_1__3
            {
            pushFollow(FOLLOW_8);
            rule__CRUDOperations__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CRUDOperations__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CRUDOperations__Group_1__2"


    // $ANTLR start "rule__CRUDOperations__Group_1__2__Impl"
    // InternalMyDsl.g:1851:1: rule__CRUDOperations__Group_1__2__Impl : ( ':' ) ;
    public final void rule__CRUDOperations__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1855:1: ( ( ':' ) )
            // InternalMyDsl.g:1856:1: ( ':' )
            {
            // InternalMyDsl.g:1856:1: ( ':' )
            // InternalMyDsl.g:1857:2: ':'
            {
             before(grammarAccess.getCRUDOperationsAccess().getColonKeyword_1_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getCRUDOperationsAccess().getColonKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CRUDOperations__Group_1__2__Impl"


    // $ANTLR start "rule__CRUDOperations__Group_1__3"
    // InternalMyDsl.g:1866:1: rule__CRUDOperations__Group_1__3 : rule__CRUDOperations__Group_1__3__Impl ;
    public final void rule__CRUDOperations__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1870:1: ( rule__CRUDOperations__Group_1__3__Impl )
            // InternalMyDsl.g:1871:2: rule__CRUDOperations__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CRUDOperations__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CRUDOperations__Group_1__3"


    // $ANTLR start "rule__CRUDOperations__Group_1__3__Impl"
    // InternalMyDsl.g:1877:1: rule__CRUDOperations__Group_1__3__Impl : ( ( rule__CRUDOperations__Group_1_3__0 ) ) ;
    public final void rule__CRUDOperations__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1881:1: ( ( ( rule__CRUDOperations__Group_1_3__0 ) ) )
            // InternalMyDsl.g:1882:1: ( ( rule__CRUDOperations__Group_1_3__0 ) )
            {
            // InternalMyDsl.g:1882:1: ( ( rule__CRUDOperations__Group_1_3__0 ) )
            // InternalMyDsl.g:1883:2: ( rule__CRUDOperations__Group_1_3__0 )
            {
             before(grammarAccess.getCRUDOperationsAccess().getGroup_1_3()); 
            // InternalMyDsl.g:1884:2: ( rule__CRUDOperations__Group_1_3__0 )
            // InternalMyDsl.g:1884:3: rule__CRUDOperations__Group_1_3__0
            {
            pushFollow(FOLLOW_2);
            rule__CRUDOperations__Group_1_3__0();

            state._fsp--;


            }

             after(grammarAccess.getCRUDOperationsAccess().getGroup_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CRUDOperations__Group_1__3__Impl"


    // $ANTLR start "rule__CRUDOperations__Group_1_3__0"
    // InternalMyDsl.g:1893:1: rule__CRUDOperations__Group_1_3__0 : rule__CRUDOperations__Group_1_3__0__Impl rule__CRUDOperations__Group_1_3__1 ;
    public final void rule__CRUDOperations__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1897:1: ( rule__CRUDOperations__Group_1_3__0__Impl rule__CRUDOperations__Group_1_3__1 )
            // InternalMyDsl.g:1898:2: rule__CRUDOperations__Group_1_3__0__Impl rule__CRUDOperations__Group_1_3__1
            {
            pushFollow(FOLLOW_20);
            rule__CRUDOperations__Group_1_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CRUDOperations__Group_1_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CRUDOperations__Group_1_3__0"


    // $ANTLR start "rule__CRUDOperations__Group_1_3__0__Impl"
    // InternalMyDsl.g:1905:1: rule__CRUDOperations__Group_1_3__0__Impl : ( '{' ) ;
    public final void rule__CRUDOperations__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1909:1: ( ( '{' ) )
            // InternalMyDsl.g:1910:1: ( '{' )
            {
            // InternalMyDsl.g:1910:1: ( '{' )
            // InternalMyDsl.g:1911:2: '{'
            {
             before(grammarAccess.getCRUDOperationsAccess().getLeftCurlyBracketKeyword_1_3_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getCRUDOperationsAccess().getLeftCurlyBracketKeyword_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CRUDOperations__Group_1_3__0__Impl"


    // $ANTLR start "rule__CRUDOperations__Group_1_3__1"
    // InternalMyDsl.g:1920:1: rule__CRUDOperations__Group_1_3__1 : rule__CRUDOperations__Group_1_3__1__Impl rule__CRUDOperations__Group_1_3__2 ;
    public final void rule__CRUDOperations__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1924:1: ( rule__CRUDOperations__Group_1_3__1__Impl rule__CRUDOperations__Group_1_3__2 )
            // InternalMyDsl.g:1925:2: rule__CRUDOperations__Group_1_3__1__Impl rule__CRUDOperations__Group_1_3__2
            {
            pushFollow(FOLLOW_24);
            rule__CRUDOperations__Group_1_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CRUDOperations__Group_1_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CRUDOperations__Group_1_3__1"


    // $ANTLR start "rule__CRUDOperations__Group_1_3__1__Impl"
    // InternalMyDsl.g:1932:1: rule__CRUDOperations__Group_1_3__1__Impl : ( 'operation:' ) ;
    public final void rule__CRUDOperations__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1936:1: ( ( 'operation:' ) )
            // InternalMyDsl.g:1937:1: ( 'operation:' )
            {
            // InternalMyDsl.g:1937:1: ( 'operation:' )
            // InternalMyDsl.g:1938:2: 'operation:'
            {
             before(grammarAccess.getCRUDOperationsAccess().getOperationKeyword_1_3_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getCRUDOperationsAccess().getOperationKeyword_1_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CRUDOperations__Group_1_3__1__Impl"


    // $ANTLR start "rule__CRUDOperations__Group_1_3__2"
    // InternalMyDsl.g:1947:1: rule__CRUDOperations__Group_1_3__2 : rule__CRUDOperations__Group_1_3__2__Impl rule__CRUDOperations__Group_1_3__3 ;
    public final void rule__CRUDOperations__Group_1_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1951:1: ( rule__CRUDOperations__Group_1_3__2__Impl rule__CRUDOperations__Group_1_3__3 )
            // InternalMyDsl.g:1952:2: rule__CRUDOperations__Group_1_3__2__Impl rule__CRUDOperations__Group_1_3__3
            {
            pushFollow(FOLLOW_22);
            rule__CRUDOperations__Group_1_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CRUDOperations__Group_1_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CRUDOperations__Group_1_3__2"


    // $ANTLR start "rule__CRUDOperations__Group_1_3__2__Impl"
    // InternalMyDsl.g:1959:1: rule__CRUDOperations__Group_1_3__2__Impl : ( ( rule__CRUDOperations__TypeAssignment_1_3_2 ) ) ;
    public final void rule__CRUDOperations__Group_1_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1963:1: ( ( ( rule__CRUDOperations__TypeAssignment_1_3_2 ) ) )
            // InternalMyDsl.g:1964:1: ( ( rule__CRUDOperations__TypeAssignment_1_3_2 ) )
            {
            // InternalMyDsl.g:1964:1: ( ( rule__CRUDOperations__TypeAssignment_1_3_2 ) )
            // InternalMyDsl.g:1965:2: ( rule__CRUDOperations__TypeAssignment_1_3_2 )
            {
             before(grammarAccess.getCRUDOperationsAccess().getTypeAssignment_1_3_2()); 
            // InternalMyDsl.g:1966:2: ( rule__CRUDOperations__TypeAssignment_1_3_2 )
            // InternalMyDsl.g:1966:3: rule__CRUDOperations__TypeAssignment_1_3_2
            {
            pushFollow(FOLLOW_2);
            rule__CRUDOperations__TypeAssignment_1_3_2();

            state._fsp--;


            }

             after(grammarAccess.getCRUDOperationsAccess().getTypeAssignment_1_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CRUDOperations__Group_1_3__2__Impl"


    // $ANTLR start "rule__CRUDOperations__Group_1_3__3"
    // InternalMyDsl.g:1974:1: rule__CRUDOperations__Group_1_3__3 : rule__CRUDOperations__Group_1_3__3__Impl rule__CRUDOperations__Group_1_3__4 ;
    public final void rule__CRUDOperations__Group_1_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1978:1: ( rule__CRUDOperations__Group_1_3__3__Impl rule__CRUDOperations__Group_1_3__4 )
            // InternalMyDsl.g:1979:2: rule__CRUDOperations__Group_1_3__3__Impl rule__CRUDOperations__Group_1_3__4
            {
            pushFollow(FOLLOW_13);
            rule__CRUDOperations__Group_1_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CRUDOperations__Group_1_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CRUDOperations__Group_1_3__3"


    // $ANTLR start "rule__CRUDOperations__Group_1_3__3__Impl"
    // InternalMyDsl.g:1986:1: rule__CRUDOperations__Group_1_3__3__Impl : ( 'collection:' ) ;
    public final void rule__CRUDOperations__Group_1_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1990:1: ( ( 'collection:' ) )
            // InternalMyDsl.g:1991:1: ( 'collection:' )
            {
            // InternalMyDsl.g:1991:1: ( 'collection:' )
            // InternalMyDsl.g:1992:2: 'collection:'
            {
             before(grammarAccess.getCRUDOperationsAccess().getCollectionKeyword_1_3_3()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getCRUDOperationsAccess().getCollectionKeyword_1_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CRUDOperations__Group_1_3__3__Impl"


    // $ANTLR start "rule__CRUDOperations__Group_1_3__4"
    // InternalMyDsl.g:2001:1: rule__CRUDOperations__Group_1_3__4 : rule__CRUDOperations__Group_1_3__4__Impl rule__CRUDOperations__Group_1_3__5 ;
    public final void rule__CRUDOperations__Group_1_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2005:1: ( rule__CRUDOperations__Group_1_3__4__Impl rule__CRUDOperations__Group_1_3__5 )
            // InternalMyDsl.g:2006:2: rule__CRUDOperations__Group_1_3__4__Impl rule__CRUDOperations__Group_1_3__5
            {
            pushFollow(FOLLOW_23);
            rule__CRUDOperations__Group_1_3__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CRUDOperations__Group_1_3__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CRUDOperations__Group_1_3__4"


    // $ANTLR start "rule__CRUDOperations__Group_1_3__4__Impl"
    // InternalMyDsl.g:2013:1: rule__CRUDOperations__Group_1_3__4__Impl : ( ( rule__CRUDOperations__CollectionAssignment_1_3_4 ) ) ;
    public final void rule__CRUDOperations__Group_1_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2017:1: ( ( ( rule__CRUDOperations__CollectionAssignment_1_3_4 ) ) )
            // InternalMyDsl.g:2018:1: ( ( rule__CRUDOperations__CollectionAssignment_1_3_4 ) )
            {
            // InternalMyDsl.g:2018:1: ( ( rule__CRUDOperations__CollectionAssignment_1_3_4 ) )
            // InternalMyDsl.g:2019:2: ( rule__CRUDOperations__CollectionAssignment_1_3_4 )
            {
             before(grammarAccess.getCRUDOperationsAccess().getCollectionAssignment_1_3_4()); 
            // InternalMyDsl.g:2020:2: ( rule__CRUDOperations__CollectionAssignment_1_3_4 )
            // InternalMyDsl.g:2020:3: rule__CRUDOperations__CollectionAssignment_1_3_4
            {
            pushFollow(FOLLOW_2);
            rule__CRUDOperations__CollectionAssignment_1_3_4();

            state._fsp--;


            }

             after(grammarAccess.getCRUDOperationsAccess().getCollectionAssignment_1_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CRUDOperations__Group_1_3__4__Impl"


    // $ANTLR start "rule__CRUDOperations__Group_1_3__5"
    // InternalMyDsl.g:2028:1: rule__CRUDOperations__Group_1_3__5 : rule__CRUDOperations__Group_1_3__5__Impl rule__CRUDOperations__Group_1_3__6 ;
    public final void rule__CRUDOperations__Group_1_3__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2032:1: ( rule__CRUDOperations__Group_1_3__5__Impl rule__CRUDOperations__Group_1_3__6 )
            // InternalMyDsl.g:2033:2: rule__CRUDOperations__Group_1_3__5__Impl rule__CRUDOperations__Group_1_3__6
            {
            pushFollow(FOLLOW_8);
            rule__CRUDOperations__Group_1_3__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CRUDOperations__Group_1_3__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CRUDOperations__Group_1_3__5"


    // $ANTLR start "rule__CRUDOperations__Group_1_3__5__Impl"
    // InternalMyDsl.g:2040:1: rule__CRUDOperations__Group_1_3__5__Impl : ( 'input:' ) ;
    public final void rule__CRUDOperations__Group_1_3__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2044:1: ( ( 'input:' ) )
            // InternalMyDsl.g:2045:1: ( 'input:' )
            {
            // InternalMyDsl.g:2045:1: ( 'input:' )
            // InternalMyDsl.g:2046:2: 'input:'
            {
             before(grammarAccess.getCRUDOperationsAccess().getInputKeyword_1_3_5()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getCRUDOperationsAccess().getInputKeyword_1_3_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CRUDOperations__Group_1_3__5__Impl"


    // $ANTLR start "rule__CRUDOperations__Group_1_3__6"
    // InternalMyDsl.g:2055:1: rule__CRUDOperations__Group_1_3__6 : rule__CRUDOperations__Group_1_3__6__Impl rule__CRUDOperations__Group_1_3__7 ;
    public final void rule__CRUDOperations__Group_1_3__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2059:1: ( rule__CRUDOperations__Group_1_3__6__Impl rule__CRUDOperations__Group_1_3__7 )
            // InternalMyDsl.g:2060:2: rule__CRUDOperations__Group_1_3__6__Impl rule__CRUDOperations__Group_1_3__7
            {
            pushFollow(FOLLOW_13);
            rule__CRUDOperations__Group_1_3__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CRUDOperations__Group_1_3__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CRUDOperations__Group_1_3__6"


    // $ANTLR start "rule__CRUDOperations__Group_1_3__6__Impl"
    // InternalMyDsl.g:2067:1: rule__CRUDOperations__Group_1_3__6__Impl : ( '{' ) ;
    public final void rule__CRUDOperations__Group_1_3__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2071:1: ( ( '{' ) )
            // InternalMyDsl.g:2072:1: ( '{' )
            {
            // InternalMyDsl.g:2072:1: ( '{' )
            // InternalMyDsl.g:2073:2: '{'
            {
             before(grammarAccess.getCRUDOperationsAccess().getLeftCurlyBracketKeyword_1_3_6()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getCRUDOperationsAccess().getLeftCurlyBracketKeyword_1_3_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CRUDOperations__Group_1_3__6__Impl"


    // $ANTLR start "rule__CRUDOperations__Group_1_3__7"
    // InternalMyDsl.g:2082:1: rule__CRUDOperations__Group_1_3__7 : rule__CRUDOperations__Group_1_3__7__Impl rule__CRUDOperations__Group_1_3__8 ;
    public final void rule__CRUDOperations__Group_1_3__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2086:1: ( rule__CRUDOperations__Group_1_3__7__Impl rule__CRUDOperations__Group_1_3__8 )
            // InternalMyDsl.g:2087:2: rule__CRUDOperations__Group_1_3__7__Impl rule__CRUDOperations__Group_1_3__8
            {
            pushFollow(FOLLOW_25);
            rule__CRUDOperations__Group_1_3__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CRUDOperations__Group_1_3__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CRUDOperations__Group_1_3__7"


    // $ANTLR start "rule__CRUDOperations__Group_1_3__7__Impl"
    // InternalMyDsl.g:2094:1: rule__CRUDOperations__Group_1_3__7__Impl : ( ( rule__CRUDOperations__EntriesAssignment_1_3_7 ) ) ;
    public final void rule__CRUDOperations__Group_1_3__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2098:1: ( ( ( rule__CRUDOperations__EntriesAssignment_1_3_7 ) ) )
            // InternalMyDsl.g:2099:1: ( ( rule__CRUDOperations__EntriesAssignment_1_3_7 ) )
            {
            // InternalMyDsl.g:2099:1: ( ( rule__CRUDOperations__EntriesAssignment_1_3_7 ) )
            // InternalMyDsl.g:2100:2: ( rule__CRUDOperations__EntriesAssignment_1_3_7 )
            {
             before(grammarAccess.getCRUDOperationsAccess().getEntriesAssignment_1_3_7()); 
            // InternalMyDsl.g:2101:2: ( rule__CRUDOperations__EntriesAssignment_1_3_7 )
            // InternalMyDsl.g:2101:3: rule__CRUDOperations__EntriesAssignment_1_3_7
            {
            pushFollow(FOLLOW_2);
            rule__CRUDOperations__EntriesAssignment_1_3_7();

            state._fsp--;


            }

             after(grammarAccess.getCRUDOperationsAccess().getEntriesAssignment_1_3_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CRUDOperations__Group_1_3__7__Impl"


    // $ANTLR start "rule__CRUDOperations__Group_1_3__8"
    // InternalMyDsl.g:2109:1: rule__CRUDOperations__Group_1_3__8 : rule__CRUDOperations__Group_1_3__8__Impl rule__CRUDOperations__Group_1_3__9 ;
    public final void rule__CRUDOperations__Group_1_3__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2113:1: ( rule__CRUDOperations__Group_1_3__8__Impl rule__CRUDOperations__Group_1_3__9 )
            // InternalMyDsl.g:2114:2: rule__CRUDOperations__Group_1_3__8__Impl rule__CRUDOperations__Group_1_3__9
            {
            pushFollow(FOLLOW_25);
            rule__CRUDOperations__Group_1_3__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CRUDOperations__Group_1_3__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CRUDOperations__Group_1_3__8"


    // $ANTLR start "rule__CRUDOperations__Group_1_3__8__Impl"
    // InternalMyDsl.g:2121:1: rule__CRUDOperations__Group_1_3__8__Impl : ( ( rule__CRUDOperations__Group_1_3_8__0 )* ) ;
    public final void rule__CRUDOperations__Group_1_3__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2125:1: ( ( ( rule__CRUDOperations__Group_1_3_8__0 )* ) )
            // InternalMyDsl.g:2126:1: ( ( rule__CRUDOperations__Group_1_3_8__0 )* )
            {
            // InternalMyDsl.g:2126:1: ( ( rule__CRUDOperations__Group_1_3_8__0 )* )
            // InternalMyDsl.g:2127:2: ( rule__CRUDOperations__Group_1_3_8__0 )*
            {
             before(grammarAccess.getCRUDOperationsAccess().getGroup_1_3_8()); 
            // InternalMyDsl.g:2128:2: ( rule__CRUDOperations__Group_1_3_8__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==21) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalMyDsl.g:2128:3: rule__CRUDOperations__Group_1_3_8__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__CRUDOperations__Group_1_3_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getCRUDOperationsAccess().getGroup_1_3_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CRUDOperations__Group_1_3__8__Impl"


    // $ANTLR start "rule__CRUDOperations__Group_1_3__9"
    // InternalMyDsl.g:2136:1: rule__CRUDOperations__Group_1_3__9 : rule__CRUDOperations__Group_1_3__9__Impl rule__CRUDOperations__Group_1_3__10 ;
    public final void rule__CRUDOperations__Group_1_3__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2140:1: ( rule__CRUDOperations__Group_1_3__9__Impl rule__CRUDOperations__Group_1_3__10 )
            // InternalMyDsl.g:2141:2: rule__CRUDOperations__Group_1_3__9__Impl rule__CRUDOperations__Group_1_3__10
            {
            pushFollow(FOLLOW_26);
            rule__CRUDOperations__Group_1_3__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CRUDOperations__Group_1_3__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CRUDOperations__Group_1_3__9"


    // $ANTLR start "rule__CRUDOperations__Group_1_3__9__Impl"
    // InternalMyDsl.g:2148:1: rule__CRUDOperations__Group_1_3__9__Impl : ( '},' ) ;
    public final void rule__CRUDOperations__Group_1_3__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2152:1: ( ( '},' ) )
            // InternalMyDsl.g:2153:1: ( '},' )
            {
            // InternalMyDsl.g:2153:1: ( '},' )
            // InternalMyDsl.g:2154:2: '},'
            {
             before(grammarAccess.getCRUDOperationsAccess().getRightCurlyBracketCommaKeyword_1_3_9()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getCRUDOperationsAccess().getRightCurlyBracketCommaKeyword_1_3_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CRUDOperations__Group_1_3__9__Impl"


    // $ANTLR start "rule__CRUDOperations__Group_1_3__10"
    // InternalMyDsl.g:2163:1: rule__CRUDOperations__Group_1_3__10 : rule__CRUDOperations__Group_1_3__10__Impl rule__CRUDOperations__Group_1_3__11 ;
    public final void rule__CRUDOperations__Group_1_3__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2167:1: ( rule__CRUDOperations__Group_1_3__10__Impl rule__CRUDOperations__Group_1_3__11 )
            // InternalMyDsl.g:2168:2: rule__CRUDOperations__Group_1_3__10__Impl rule__CRUDOperations__Group_1_3__11
            {
            pushFollow(FOLLOW_8);
            rule__CRUDOperations__Group_1_3__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CRUDOperations__Group_1_3__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CRUDOperations__Group_1_3__10"


    // $ANTLR start "rule__CRUDOperations__Group_1_3__10__Impl"
    // InternalMyDsl.g:2175:1: rule__CRUDOperations__Group_1_3__10__Impl : ( 'update:' ) ;
    public final void rule__CRUDOperations__Group_1_3__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2179:1: ( ( 'update:' ) )
            // InternalMyDsl.g:2180:1: ( 'update:' )
            {
            // InternalMyDsl.g:2180:1: ( 'update:' )
            // InternalMyDsl.g:2181:2: 'update:'
            {
             before(grammarAccess.getCRUDOperationsAccess().getUpdateKeyword_1_3_10()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getCRUDOperationsAccess().getUpdateKeyword_1_3_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CRUDOperations__Group_1_3__10__Impl"


    // $ANTLR start "rule__CRUDOperations__Group_1_3__11"
    // InternalMyDsl.g:2190:1: rule__CRUDOperations__Group_1_3__11 : rule__CRUDOperations__Group_1_3__11__Impl rule__CRUDOperations__Group_1_3__12 ;
    public final void rule__CRUDOperations__Group_1_3__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2194:1: ( rule__CRUDOperations__Group_1_3__11__Impl rule__CRUDOperations__Group_1_3__12 )
            // InternalMyDsl.g:2195:2: rule__CRUDOperations__Group_1_3__11__Impl rule__CRUDOperations__Group_1_3__12
            {
            pushFollow(FOLLOW_13);
            rule__CRUDOperations__Group_1_3__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CRUDOperations__Group_1_3__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CRUDOperations__Group_1_3__11"


    // $ANTLR start "rule__CRUDOperations__Group_1_3__11__Impl"
    // InternalMyDsl.g:2202:1: rule__CRUDOperations__Group_1_3__11__Impl : ( '{' ) ;
    public final void rule__CRUDOperations__Group_1_3__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2206:1: ( ( '{' ) )
            // InternalMyDsl.g:2207:1: ( '{' )
            {
            // InternalMyDsl.g:2207:1: ( '{' )
            // InternalMyDsl.g:2208:2: '{'
            {
             before(grammarAccess.getCRUDOperationsAccess().getLeftCurlyBracketKeyword_1_3_11()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getCRUDOperationsAccess().getLeftCurlyBracketKeyword_1_3_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CRUDOperations__Group_1_3__11__Impl"


    // $ANTLR start "rule__CRUDOperations__Group_1_3__12"
    // InternalMyDsl.g:2217:1: rule__CRUDOperations__Group_1_3__12 : rule__CRUDOperations__Group_1_3__12__Impl rule__CRUDOperations__Group_1_3__13 ;
    public final void rule__CRUDOperations__Group_1_3__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2221:1: ( rule__CRUDOperations__Group_1_3__12__Impl rule__CRUDOperations__Group_1_3__13 )
            // InternalMyDsl.g:2222:2: rule__CRUDOperations__Group_1_3__12__Impl rule__CRUDOperations__Group_1_3__13
            {
            pushFollow(FOLLOW_27);
            rule__CRUDOperations__Group_1_3__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CRUDOperations__Group_1_3__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CRUDOperations__Group_1_3__12"


    // $ANTLR start "rule__CRUDOperations__Group_1_3__12__Impl"
    // InternalMyDsl.g:2229:1: rule__CRUDOperations__Group_1_3__12__Impl : ( ( rule__CRUDOperations__EntriesAssignment_1_3_12 ) ) ;
    public final void rule__CRUDOperations__Group_1_3__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2233:1: ( ( ( rule__CRUDOperations__EntriesAssignment_1_3_12 ) ) )
            // InternalMyDsl.g:2234:1: ( ( rule__CRUDOperations__EntriesAssignment_1_3_12 ) )
            {
            // InternalMyDsl.g:2234:1: ( ( rule__CRUDOperations__EntriesAssignment_1_3_12 ) )
            // InternalMyDsl.g:2235:2: ( rule__CRUDOperations__EntriesAssignment_1_3_12 )
            {
             before(grammarAccess.getCRUDOperationsAccess().getEntriesAssignment_1_3_12()); 
            // InternalMyDsl.g:2236:2: ( rule__CRUDOperations__EntriesAssignment_1_3_12 )
            // InternalMyDsl.g:2236:3: rule__CRUDOperations__EntriesAssignment_1_3_12
            {
            pushFollow(FOLLOW_2);
            rule__CRUDOperations__EntriesAssignment_1_3_12();

            state._fsp--;


            }

             after(grammarAccess.getCRUDOperationsAccess().getEntriesAssignment_1_3_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CRUDOperations__Group_1_3__12__Impl"


    // $ANTLR start "rule__CRUDOperations__Group_1_3__13"
    // InternalMyDsl.g:2244:1: rule__CRUDOperations__Group_1_3__13 : rule__CRUDOperations__Group_1_3__13__Impl rule__CRUDOperations__Group_1_3__14 ;
    public final void rule__CRUDOperations__Group_1_3__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2248:1: ( rule__CRUDOperations__Group_1_3__13__Impl rule__CRUDOperations__Group_1_3__14 )
            // InternalMyDsl.g:2249:2: rule__CRUDOperations__Group_1_3__13__Impl rule__CRUDOperations__Group_1_3__14
            {
            pushFollow(FOLLOW_27);
            rule__CRUDOperations__Group_1_3__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CRUDOperations__Group_1_3__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CRUDOperations__Group_1_3__13"


    // $ANTLR start "rule__CRUDOperations__Group_1_3__13__Impl"
    // InternalMyDsl.g:2256:1: rule__CRUDOperations__Group_1_3__13__Impl : ( ( rule__CRUDOperations__Group_1_3_13__0 )* ) ;
    public final void rule__CRUDOperations__Group_1_3__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2260:1: ( ( ( rule__CRUDOperations__Group_1_3_13__0 )* ) )
            // InternalMyDsl.g:2261:1: ( ( rule__CRUDOperations__Group_1_3_13__0 )* )
            {
            // InternalMyDsl.g:2261:1: ( ( rule__CRUDOperations__Group_1_3_13__0 )* )
            // InternalMyDsl.g:2262:2: ( rule__CRUDOperations__Group_1_3_13__0 )*
            {
             before(grammarAccess.getCRUDOperationsAccess().getGroup_1_3_13()); 
            // InternalMyDsl.g:2263:2: ( rule__CRUDOperations__Group_1_3_13__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==21) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalMyDsl.g:2263:3: rule__CRUDOperations__Group_1_3_13__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__CRUDOperations__Group_1_3_13__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getCRUDOperationsAccess().getGroup_1_3_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CRUDOperations__Group_1_3__13__Impl"


    // $ANTLR start "rule__CRUDOperations__Group_1_3__14"
    // InternalMyDsl.g:2271:1: rule__CRUDOperations__Group_1_3__14 : rule__CRUDOperations__Group_1_3__14__Impl rule__CRUDOperations__Group_1_3__15 ;
    public final void rule__CRUDOperations__Group_1_3__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2275:1: ( rule__CRUDOperations__Group_1_3__14__Impl rule__CRUDOperations__Group_1_3__15 )
            // InternalMyDsl.g:2276:2: rule__CRUDOperations__Group_1_3__14__Impl rule__CRUDOperations__Group_1_3__15
            {
            pushFollow(FOLLOW_12);
            rule__CRUDOperations__Group_1_3__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CRUDOperations__Group_1_3__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CRUDOperations__Group_1_3__14"


    // $ANTLR start "rule__CRUDOperations__Group_1_3__14__Impl"
    // InternalMyDsl.g:2283:1: rule__CRUDOperations__Group_1_3__14__Impl : ( '}' ) ;
    public final void rule__CRUDOperations__Group_1_3__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2287:1: ( ( '}' ) )
            // InternalMyDsl.g:2288:1: ( '}' )
            {
            // InternalMyDsl.g:2288:1: ( '}' )
            // InternalMyDsl.g:2289:2: '}'
            {
             before(grammarAccess.getCRUDOperationsAccess().getRightCurlyBracketKeyword_1_3_14()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getCRUDOperationsAccess().getRightCurlyBracketKeyword_1_3_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CRUDOperations__Group_1_3__14__Impl"


    // $ANTLR start "rule__CRUDOperations__Group_1_3__15"
    // InternalMyDsl.g:2298:1: rule__CRUDOperations__Group_1_3__15 : rule__CRUDOperations__Group_1_3__15__Impl ;
    public final void rule__CRUDOperations__Group_1_3__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2302:1: ( rule__CRUDOperations__Group_1_3__15__Impl )
            // InternalMyDsl.g:2303:2: rule__CRUDOperations__Group_1_3__15__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CRUDOperations__Group_1_3__15__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CRUDOperations__Group_1_3__15"


    // $ANTLR start "rule__CRUDOperations__Group_1_3__15__Impl"
    // InternalMyDsl.g:2309:1: rule__CRUDOperations__Group_1_3__15__Impl : ( '}' ) ;
    public final void rule__CRUDOperations__Group_1_3__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2313:1: ( ( '}' ) )
            // InternalMyDsl.g:2314:1: ( '}' )
            {
            // InternalMyDsl.g:2314:1: ( '}' )
            // InternalMyDsl.g:2315:2: '}'
            {
             before(grammarAccess.getCRUDOperationsAccess().getRightCurlyBracketKeyword_1_3_15()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getCRUDOperationsAccess().getRightCurlyBracketKeyword_1_3_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CRUDOperations__Group_1_3__15__Impl"


    // $ANTLR start "rule__CRUDOperations__Group_1_3_8__0"
    // InternalMyDsl.g:2325:1: rule__CRUDOperations__Group_1_3_8__0 : rule__CRUDOperations__Group_1_3_8__0__Impl rule__CRUDOperations__Group_1_3_8__1 ;
    public final void rule__CRUDOperations__Group_1_3_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2329:1: ( rule__CRUDOperations__Group_1_3_8__0__Impl rule__CRUDOperations__Group_1_3_8__1 )
            // InternalMyDsl.g:2330:2: rule__CRUDOperations__Group_1_3_8__0__Impl rule__CRUDOperations__Group_1_3_8__1
            {
            pushFollow(FOLLOW_13);
            rule__CRUDOperations__Group_1_3_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CRUDOperations__Group_1_3_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CRUDOperations__Group_1_3_8__0"


    // $ANTLR start "rule__CRUDOperations__Group_1_3_8__0__Impl"
    // InternalMyDsl.g:2337:1: rule__CRUDOperations__Group_1_3_8__0__Impl : ( ',' ) ;
    public final void rule__CRUDOperations__Group_1_3_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2341:1: ( ( ',' ) )
            // InternalMyDsl.g:2342:1: ( ',' )
            {
            // InternalMyDsl.g:2342:1: ( ',' )
            // InternalMyDsl.g:2343:2: ','
            {
             before(grammarAccess.getCRUDOperationsAccess().getCommaKeyword_1_3_8_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getCRUDOperationsAccess().getCommaKeyword_1_3_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CRUDOperations__Group_1_3_8__0__Impl"


    // $ANTLR start "rule__CRUDOperations__Group_1_3_8__1"
    // InternalMyDsl.g:2352:1: rule__CRUDOperations__Group_1_3_8__1 : rule__CRUDOperations__Group_1_3_8__1__Impl ;
    public final void rule__CRUDOperations__Group_1_3_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2356:1: ( rule__CRUDOperations__Group_1_3_8__1__Impl )
            // InternalMyDsl.g:2357:2: rule__CRUDOperations__Group_1_3_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CRUDOperations__Group_1_3_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CRUDOperations__Group_1_3_8__1"


    // $ANTLR start "rule__CRUDOperations__Group_1_3_8__1__Impl"
    // InternalMyDsl.g:2363:1: rule__CRUDOperations__Group_1_3_8__1__Impl : ( ( rule__CRUDOperations__EntriesAssignment_1_3_8_1 ) ) ;
    public final void rule__CRUDOperations__Group_1_3_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2367:1: ( ( ( rule__CRUDOperations__EntriesAssignment_1_3_8_1 ) ) )
            // InternalMyDsl.g:2368:1: ( ( rule__CRUDOperations__EntriesAssignment_1_3_8_1 ) )
            {
            // InternalMyDsl.g:2368:1: ( ( rule__CRUDOperations__EntriesAssignment_1_3_8_1 ) )
            // InternalMyDsl.g:2369:2: ( rule__CRUDOperations__EntriesAssignment_1_3_8_1 )
            {
             before(grammarAccess.getCRUDOperationsAccess().getEntriesAssignment_1_3_8_1()); 
            // InternalMyDsl.g:2370:2: ( rule__CRUDOperations__EntriesAssignment_1_3_8_1 )
            // InternalMyDsl.g:2370:3: rule__CRUDOperations__EntriesAssignment_1_3_8_1
            {
            pushFollow(FOLLOW_2);
            rule__CRUDOperations__EntriesAssignment_1_3_8_1();

            state._fsp--;


            }

             after(grammarAccess.getCRUDOperationsAccess().getEntriesAssignment_1_3_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CRUDOperations__Group_1_3_8__1__Impl"


    // $ANTLR start "rule__CRUDOperations__Group_1_3_13__0"
    // InternalMyDsl.g:2379:1: rule__CRUDOperations__Group_1_3_13__0 : rule__CRUDOperations__Group_1_3_13__0__Impl rule__CRUDOperations__Group_1_3_13__1 ;
    public final void rule__CRUDOperations__Group_1_3_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2383:1: ( rule__CRUDOperations__Group_1_3_13__0__Impl rule__CRUDOperations__Group_1_3_13__1 )
            // InternalMyDsl.g:2384:2: rule__CRUDOperations__Group_1_3_13__0__Impl rule__CRUDOperations__Group_1_3_13__1
            {
            pushFollow(FOLLOW_13);
            rule__CRUDOperations__Group_1_3_13__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CRUDOperations__Group_1_3_13__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CRUDOperations__Group_1_3_13__0"


    // $ANTLR start "rule__CRUDOperations__Group_1_3_13__0__Impl"
    // InternalMyDsl.g:2391:1: rule__CRUDOperations__Group_1_3_13__0__Impl : ( ',' ) ;
    public final void rule__CRUDOperations__Group_1_3_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2395:1: ( ( ',' ) )
            // InternalMyDsl.g:2396:1: ( ',' )
            {
            // InternalMyDsl.g:2396:1: ( ',' )
            // InternalMyDsl.g:2397:2: ','
            {
             before(grammarAccess.getCRUDOperationsAccess().getCommaKeyword_1_3_13_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getCRUDOperationsAccess().getCommaKeyword_1_3_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CRUDOperations__Group_1_3_13__0__Impl"


    // $ANTLR start "rule__CRUDOperations__Group_1_3_13__1"
    // InternalMyDsl.g:2406:1: rule__CRUDOperations__Group_1_3_13__1 : rule__CRUDOperations__Group_1_3_13__1__Impl ;
    public final void rule__CRUDOperations__Group_1_3_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2410:1: ( rule__CRUDOperations__Group_1_3_13__1__Impl )
            // InternalMyDsl.g:2411:2: rule__CRUDOperations__Group_1_3_13__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CRUDOperations__Group_1_3_13__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CRUDOperations__Group_1_3_13__1"


    // $ANTLR start "rule__CRUDOperations__Group_1_3_13__1__Impl"
    // InternalMyDsl.g:2417:1: rule__CRUDOperations__Group_1_3_13__1__Impl : ( ( rule__CRUDOperations__EntriesAssignment_1_3_13_1 ) ) ;
    public final void rule__CRUDOperations__Group_1_3_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2421:1: ( ( ( rule__CRUDOperations__EntriesAssignment_1_3_13_1 ) ) )
            // InternalMyDsl.g:2422:1: ( ( rule__CRUDOperations__EntriesAssignment_1_3_13_1 ) )
            {
            // InternalMyDsl.g:2422:1: ( ( rule__CRUDOperations__EntriesAssignment_1_3_13_1 ) )
            // InternalMyDsl.g:2423:2: ( rule__CRUDOperations__EntriesAssignment_1_3_13_1 )
            {
             before(grammarAccess.getCRUDOperationsAccess().getEntriesAssignment_1_3_13_1()); 
            // InternalMyDsl.g:2424:2: ( rule__CRUDOperations__EntriesAssignment_1_3_13_1 )
            // InternalMyDsl.g:2424:3: rule__CRUDOperations__EntriesAssignment_1_3_13_1
            {
            pushFollow(FOLLOW_2);
            rule__CRUDOperations__EntriesAssignment_1_3_13_1();

            state._fsp--;


            }

             after(grammarAccess.getCRUDOperationsAccess().getEntriesAssignment_1_3_13_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CRUDOperations__Group_1_3_13__1__Impl"


    // $ANTLR start "rule__UpdateCollectionEntry__Group__0"
    // InternalMyDsl.g:2433:1: rule__UpdateCollectionEntry__Group__0 : rule__UpdateCollectionEntry__Group__0__Impl rule__UpdateCollectionEntry__Group__1 ;
    public final void rule__UpdateCollectionEntry__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2437:1: ( rule__UpdateCollectionEntry__Group__0__Impl rule__UpdateCollectionEntry__Group__1 )
            // InternalMyDsl.g:2438:2: rule__UpdateCollectionEntry__Group__0__Impl rule__UpdateCollectionEntry__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__UpdateCollectionEntry__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UpdateCollectionEntry__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateCollectionEntry__Group__0"


    // $ANTLR start "rule__UpdateCollectionEntry__Group__0__Impl"
    // InternalMyDsl.g:2445:1: rule__UpdateCollectionEntry__Group__0__Impl : ( ( rule__UpdateCollectionEntry__ValueNameAssignment_0 ) ) ;
    public final void rule__UpdateCollectionEntry__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2449:1: ( ( ( rule__UpdateCollectionEntry__ValueNameAssignment_0 ) ) )
            // InternalMyDsl.g:2450:1: ( ( rule__UpdateCollectionEntry__ValueNameAssignment_0 ) )
            {
            // InternalMyDsl.g:2450:1: ( ( rule__UpdateCollectionEntry__ValueNameAssignment_0 ) )
            // InternalMyDsl.g:2451:2: ( rule__UpdateCollectionEntry__ValueNameAssignment_0 )
            {
             before(grammarAccess.getUpdateCollectionEntryAccess().getValueNameAssignment_0()); 
            // InternalMyDsl.g:2452:2: ( rule__UpdateCollectionEntry__ValueNameAssignment_0 )
            // InternalMyDsl.g:2452:3: rule__UpdateCollectionEntry__ValueNameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__UpdateCollectionEntry__ValueNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getUpdateCollectionEntryAccess().getValueNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateCollectionEntry__Group__0__Impl"


    // $ANTLR start "rule__UpdateCollectionEntry__Group__1"
    // InternalMyDsl.g:2460:1: rule__UpdateCollectionEntry__Group__1 : rule__UpdateCollectionEntry__Group__1__Impl rule__UpdateCollectionEntry__Group__2 ;
    public final void rule__UpdateCollectionEntry__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2464:1: ( rule__UpdateCollectionEntry__Group__1__Impl rule__UpdateCollectionEntry__Group__2 )
            // InternalMyDsl.g:2465:2: rule__UpdateCollectionEntry__Group__1__Impl rule__UpdateCollectionEntry__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__UpdateCollectionEntry__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UpdateCollectionEntry__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateCollectionEntry__Group__1"


    // $ANTLR start "rule__UpdateCollectionEntry__Group__1__Impl"
    // InternalMyDsl.g:2472:1: rule__UpdateCollectionEntry__Group__1__Impl : ( ':' ) ;
    public final void rule__UpdateCollectionEntry__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2476:1: ( ( ':' ) )
            // InternalMyDsl.g:2477:1: ( ':' )
            {
            // InternalMyDsl.g:2477:1: ( ':' )
            // InternalMyDsl.g:2478:2: ':'
            {
             before(grammarAccess.getUpdateCollectionEntryAccess().getColonKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getUpdateCollectionEntryAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateCollectionEntry__Group__1__Impl"


    // $ANTLR start "rule__UpdateCollectionEntry__Group__2"
    // InternalMyDsl.g:2487:1: rule__UpdateCollectionEntry__Group__2 : rule__UpdateCollectionEntry__Group__2__Impl ;
    public final void rule__UpdateCollectionEntry__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2491:1: ( rule__UpdateCollectionEntry__Group__2__Impl )
            // InternalMyDsl.g:2492:2: rule__UpdateCollectionEntry__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UpdateCollectionEntry__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateCollectionEntry__Group__2"


    // $ANTLR start "rule__UpdateCollectionEntry__Group__2__Impl"
    // InternalMyDsl.g:2498:1: rule__UpdateCollectionEntry__Group__2__Impl : ( ( rule__UpdateCollectionEntry__Alternatives_2 ) ) ;
    public final void rule__UpdateCollectionEntry__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2502:1: ( ( ( rule__UpdateCollectionEntry__Alternatives_2 ) ) )
            // InternalMyDsl.g:2503:1: ( ( rule__UpdateCollectionEntry__Alternatives_2 ) )
            {
            // InternalMyDsl.g:2503:1: ( ( rule__UpdateCollectionEntry__Alternatives_2 ) )
            // InternalMyDsl.g:2504:2: ( rule__UpdateCollectionEntry__Alternatives_2 )
            {
             before(grammarAccess.getUpdateCollectionEntryAccess().getAlternatives_2()); 
            // InternalMyDsl.g:2505:2: ( rule__UpdateCollectionEntry__Alternatives_2 )
            // InternalMyDsl.g:2505:3: rule__UpdateCollectionEntry__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__UpdateCollectionEntry__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getUpdateCollectionEntryAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateCollectionEntry__Group__2__Impl"


    // $ANTLR start "rule__CollectionEntry__Group__0"
    // InternalMyDsl.g:2514:1: rule__CollectionEntry__Group__0 : rule__CollectionEntry__Group__0__Impl rule__CollectionEntry__Group__1 ;
    public final void rule__CollectionEntry__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2518:1: ( rule__CollectionEntry__Group__0__Impl rule__CollectionEntry__Group__1 )
            // InternalMyDsl.g:2519:2: rule__CollectionEntry__Group__0__Impl rule__CollectionEntry__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__CollectionEntry__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CollectionEntry__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionEntry__Group__0"


    // $ANTLR start "rule__CollectionEntry__Group__0__Impl"
    // InternalMyDsl.g:2526:1: rule__CollectionEntry__Group__0__Impl : ( ( rule__CollectionEntry__ValueNameAssignment_0 ) ) ;
    public final void rule__CollectionEntry__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2530:1: ( ( ( rule__CollectionEntry__ValueNameAssignment_0 ) ) )
            // InternalMyDsl.g:2531:1: ( ( rule__CollectionEntry__ValueNameAssignment_0 ) )
            {
            // InternalMyDsl.g:2531:1: ( ( rule__CollectionEntry__ValueNameAssignment_0 ) )
            // InternalMyDsl.g:2532:2: ( rule__CollectionEntry__ValueNameAssignment_0 )
            {
             before(grammarAccess.getCollectionEntryAccess().getValueNameAssignment_0()); 
            // InternalMyDsl.g:2533:2: ( rule__CollectionEntry__ValueNameAssignment_0 )
            // InternalMyDsl.g:2533:3: rule__CollectionEntry__ValueNameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__CollectionEntry__ValueNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCollectionEntryAccess().getValueNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionEntry__Group__0__Impl"


    // $ANTLR start "rule__CollectionEntry__Group__1"
    // InternalMyDsl.g:2541:1: rule__CollectionEntry__Group__1 : rule__CollectionEntry__Group__1__Impl rule__CollectionEntry__Group__2 ;
    public final void rule__CollectionEntry__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2545:1: ( rule__CollectionEntry__Group__1__Impl rule__CollectionEntry__Group__2 )
            // InternalMyDsl.g:2546:2: rule__CollectionEntry__Group__1__Impl rule__CollectionEntry__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__CollectionEntry__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CollectionEntry__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionEntry__Group__1"


    // $ANTLR start "rule__CollectionEntry__Group__1__Impl"
    // InternalMyDsl.g:2553:1: rule__CollectionEntry__Group__1__Impl : ( ':' ) ;
    public final void rule__CollectionEntry__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2557:1: ( ( ':' ) )
            // InternalMyDsl.g:2558:1: ( ':' )
            {
            // InternalMyDsl.g:2558:1: ( ':' )
            // InternalMyDsl.g:2559:2: ':'
            {
             before(grammarAccess.getCollectionEntryAccess().getColonKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getCollectionEntryAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionEntry__Group__1__Impl"


    // $ANTLR start "rule__CollectionEntry__Group__2"
    // InternalMyDsl.g:2568:1: rule__CollectionEntry__Group__2 : rule__CollectionEntry__Group__2__Impl ;
    public final void rule__CollectionEntry__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2572:1: ( rule__CollectionEntry__Group__2__Impl )
            // InternalMyDsl.g:2573:2: rule__CollectionEntry__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CollectionEntry__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionEntry__Group__2"


    // $ANTLR start "rule__CollectionEntry__Group__2__Impl"
    // InternalMyDsl.g:2579:1: rule__CollectionEntry__Group__2__Impl : ( ( rule__CollectionEntry__Alternatives_2 ) ) ;
    public final void rule__CollectionEntry__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2583:1: ( ( ( rule__CollectionEntry__Alternatives_2 ) ) )
            // InternalMyDsl.g:2584:1: ( ( rule__CollectionEntry__Alternatives_2 ) )
            {
            // InternalMyDsl.g:2584:1: ( ( rule__CollectionEntry__Alternatives_2 ) )
            // InternalMyDsl.g:2585:2: ( rule__CollectionEntry__Alternatives_2 )
            {
             before(grammarAccess.getCollectionEntryAccess().getAlternatives_2()); 
            // InternalMyDsl.g:2586:2: ( rule__CollectionEntry__Alternatives_2 )
            // InternalMyDsl.g:2586:3: rule__CollectionEntry__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__CollectionEntry__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getCollectionEntryAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionEntry__Group__2__Impl"


    // $ANTLR start "rule__ConnectionStatement__UnorderedGroup"
    // InternalMyDsl.g:2595:1: rule__ConnectionStatement__UnorderedGroup : rule__ConnectionStatement__UnorderedGroup__0 {...}?;
    public final void rule__ConnectionStatement__UnorderedGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getConnectionStatementAccess().getUnorderedGroup());
        	
        try {
            // InternalMyDsl.g:2600:1: ( rule__ConnectionStatement__UnorderedGroup__0 {...}?)
            // InternalMyDsl.g:2601:2: rule__ConnectionStatement__UnorderedGroup__0 {...}?
            {
            pushFollow(FOLLOW_2);
            rule__ConnectionStatement__UnorderedGroup__0();

            state._fsp--;

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getConnectionStatementAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "rule__ConnectionStatement__UnorderedGroup", "getUnorderedGroupHelper().canLeave(grammarAccess.getConnectionStatementAccess().getUnorderedGroup())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getConnectionStatementAccess().getUnorderedGroup());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionStatement__UnorderedGroup"


    // $ANTLR start "rule__ConnectionStatement__UnorderedGroup__Impl"
    // InternalMyDsl.g:2609:1: rule__ConnectionStatement__UnorderedGroup__Impl : ( ({...}? => ( ( ( rule__ConnectionStatement__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ConnectionStatement__Group_1__0 ) ) ) ) ) ;
    public final void rule__ConnectionStatement__UnorderedGroup__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalMyDsl.g:2614:1: ( ( ({...}? => ( ( ( rule__ConnectionStatement__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ConnectionStatement__Group_1__0 ) ) ) ) ) )
            // InternalMyDsl.g:2615:3: ( ({...}? => ( ( ( rule__ConnectionStatement__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ConnectionStatement__Group_1__0 ) ) ) ) )
            {
            // InternalMyDsl.g:2615:3: ( ({...}? => ( ( ( rule__ConnectionStatement__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ConnectionStatement__Group_1__0 ) ) ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( LA18_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionStatementAccess().getUnorderedGroup(), 0) ) {
                alt18=1;
            }
            else if ( LA18_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionStatementAccess().getUnorderedGroup(), 1) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalMyDsl.g:2616:3: ({...}? => ( ( ( rule__ConnectionStatement__Group_0__0 ) ) ) )
                    {
                    // InternalMyDsl.g:2616:3: ({...}? => ( ( ( rule__ConnectionStatement__Group_0__0 ) ) ) )
                    // InternalMyDsl.g:2617:4: {...}? => ( ( ( rule__ConnectionStatement__Group_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionStatementAccess().getUnorderedGroup(), 0) ) {
                        throw new FailedPredicateException(input, "rule__ConnectionStatement__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionStatementAccess().getUnorderedGroup(), 0)");
                    }
                    // InternalMyDsl.g:2617:113: ( ( ( rule__ConnectionStatement__Group_0__0 ) ) )
                    // InternalMyDsl.g:2618:5: ( ( rule__ConnectionStatement__Group_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getConnectionStatementAccess().getUnorderedGroup(), 0);
                    				

                    					selected = true;
                    				
                    // InternalMyDsl.g:2624:5: ( ( rule__ConnectionStatement__Group_0__0 ) )
                    // InternalMyDsl.g:2625:6: ( rule__ConnectionStatement__Group_0__0 )
                    {
                     before(grammarAccess.getConnectionStatementAccess().getGroup_0()); 
                    // InternalMyDsl.g:2626:6: ( rule__ConnectionStatement__Group_0__0 )
                    // InternalMyDsl.g:2626:7: rule__ConnectionStatement__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConnectionStatement__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConnectionStatementAccess().getGroup_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2631:3: ({...}? => ( ( ( rule__ConnectionStatement__Group_1__0 ) ) ) )
                    {
                    // InternalMyDsl.g:2631:3: ({...}? => ( ( ( rule__ConnectionStatement__Group_1__0 ) ) ) )
                    // InternalMyDsl.g:2632:4: {...}? => ( ( ( rule__ConnectionStatement__Group_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionStatementAccess().getUnorderedGroup(), 1) ) {
                        throw new FailedPredicateException(input, "rule__ConnectionStatement__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionStatementAccess().getUnorderedGroup(), 1)");
                    }
                    // InternalMyDsl.g:2632:113: ( ( ( rule__ConnectionStatement__Group_1__0 ) ) )
                    // InternalMyDsl.g:2633:5: ( ( rule__ConnectionStatement__Group_1__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getConnectionStatementAccess().getUnorderedGroup(), 1);
                    				

                    					selected = true;
                    				
                    // InternalMyDsl.g:2639:5: ( ( rule__ConnectionStatement__Group_1__0 ) )
                    // InternalMyDsl.g:2640:6: ( rule__ConnectionStatement__Group_1__0 )
                    {
                     before(grammarAccess.getConnectionStatementAccess().getGroup_1()); 
                    // InternalMyDsl.g:2641:6: ( rule__ConnectionStatement__Group_1__0 )
                    // InternalMyDsl.g:2641:7: rule__ConnectionStatement__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConnectionStatement__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConnectionStatementAccess().getGroup_1()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getConnectionStatementAccess().getUnorderedGroup());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionStatement__UnorderedGroup__Impl"


    // $ANTLR start "rule__ConnectionStatement__UnorderedGroup__0"
    // InternalMyDsl.g:2654:1: rule__ConnectionStatement__UnorderedGroup__0 : rule__ConnectionStatement__UnorderedGroup__Impl ( rule__ConnectionStatement__UnorderedGroup__1 )? ;
    public final void rule__ConnectionStatement__UnorderedGroup__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2658:1: ( rule__ConnectionStatement__UnorderedGroup__Impl ( rule__ConnectionStatement__UnorderedGroup__1 )? )
            // InternalMyDsl.g:2659:2: rule__ConnectionStatement__UnorderedGroup__Impl ( rule__ConnectionStatement__UnorderedGroup__1 )?
            {
            pushFollow(FOLLOW_3);
            rule__ConnectionStatement__UnorderedGroup__Impl();

            state._fsp--;

            // InternalMyDsl.g:2660:2: ( rule__ConnectionStatement__UnorderedGroup__1 )?
            int alt19=2;
            alt19 = dfa19.predict(input);
            switch (alt19) {
                case 1 :
                    // InternalMyDsl.g:2660:2: rule__ConnectionStatement__UnorderedGroup__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConnectionStatement__UnorderedGroup__1();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionStatement__UnorderedGroup__0"


    // $ANTLR start "rule__ConnectionStatement__UnorderedGroup__1"
    // InternalMyDsl.g:2666:1: rule__ConnectionStatement__UnorderedGroup__1 : rule__ConnectionStatement__UnorderedGroup__Impl ;
    public final void rule__ConnectionStatement__UnorderedGroup__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2670:1: ( rule__ConnectionStatement__UnorderedGroup__Impl )
            // InternalMyDsl.g:2671:2: rule__ConnectionStatement__UnorderedGroup__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConnectionStatement__UnorderedGroup__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionStatement__UnorderedGroup__1"


    // $ANTLR start "rule__MongoDB__ModelsAssignment"
    // InternalMyDsl.g:2678:1: rule__MongoDB__ModelsAssignment : ( ruleModel ) ;
    public final void rule__MongoDB__ModelsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2682:1: ( ( ruleModel ) )
            // InternalMyDsl.g:2683:2: ( ruleModel )
            {
            // InternalMyDsl.g:2683:2: ( ruleModel )
            // InternalMyDsl.g:2684:3: ruleModel
            {
             before(grammarAccess.getMongoDBAccess().getModelsModelParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getMongoDBAccess().getModelsModelParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MongoDB__ModelsAssignment"


    // $ANTLR start "rule__Model__ConnectionAssignment_0"
    // InternalMyDsl.g:2693:1: rule__Model__ConnectionAssignment_0 : ( ruleConnectionStatement ) ;
    public final void rule__Model__ConnectionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2697:1: ( ( ruleConnectionStatement ) )
            // InternalMyDsl.g:2698:2: ( ruleConnectionStatement )
            {
            // InternalMyDsl.g:2698:2: ( ruleConnectionStatement )
            // InternalMyDsl.g:2699:3: ruleConnectionStatement
            {
             before(grammarAccess.getModelAccess().getConnectionConnectionStatementParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleConnectionStatement();

            state._fsp--;

             after(grammarAccess.getModelAccess().getConnectionConnectionStatementParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ConnectionAssignment_0"


    // $ANTLR start "rule__Model__StatementsAssignment_1"
    // InternalMyDsl.g:2708:1: rule__Model__StatementsAssignment_1 : ( ruleCRUDOperationAndCollectionSchema ) ;
    public final void rule__Model__StatementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2712:1: ( ( ruleCRUDOperationAndCollectionSchema ) )
            // InternalMyDsl.g:2713:2: ( ruleCRUDOperationAndCollectionSchema )
            {
            // InternalMyDsl.g:2713:2: ( ruleCRUDOperationAndCollectionSchema )
            // InternalMyDsl.g:2714:3: ruleCRUDOperationAndCollectionSchema
            {
             before(grammarAccess.getModelAccess().getStatementsCRUDOperationAndCollectionSchemaParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCRUDOperationAndCollectionSchema();

            state._fsp--;

             after(grammarAccess.getModelAccess().getStatementsCRUDOperationAndCollectionSchemaParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__StatementsAssignment_1"


    // $ANTLR start "rule__CRUDOperationAndCollectionSchema__SchemaAssignment_0"
    // InternalMyDsl.g:2723:1: rule__CRUDOperationAndCollectionSchema__SchemaAssignment_0 : ( ruleCollectionSchema ) ;
    public final void rule__CRUDOperationAndCollectionSchema__SchemaAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2727:1: ( ( ruleCollectionSchema ) )
            // InternalMyDsl.g:2728:2: ( ruleCollectionSchema )
            {
            // InternalMyDsl.g:2728:2: ( ruleCollectionSchema )
            // InternalMyDsl.g:2729:3: ruleCollectionSchema
            {
             before(grammarAccess.getCRUDOperationAndCollectionSchemaAccess().getSchemaCollectionSchemaParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleCollectionSchema();

            state._fsp--;

             after(grammarAccess.getCRUDOperationAndCollectionSchemaAccess().getSchemaCollectionSchemaParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CRUDOperationAndCollectionSchema__SchemaAssignment_0"


    // $ANTLR start "rule__CRUDOperationAndCollectionSchema__OperationsAssignment_1"
    // InternalMyDsl.g:2738:1: rule__CRUDOperationAndCollectionSchema__OperationsAssignment_1 : ( ruleCRUDOperations ) ;
    public final void rule__CRUDOperationAndCollectionSchema__OperationsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2742:1: ( ( ruleCRUDOperations ) )
            // InternalMyDsl.g:2743:2: ( ruleCRUDOperations )
            {
            // InternalMyDsl.g:2743:2: ( ruleCRUDOperations )
            // InternalMyDsl.g:2744:3: ruleCRUDOperations
            {
             before(grammarAccess.getCRUDOperationAndCollectionSchemaAccess().getOperationsCRUDOperationsParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCRUDOperations();

            state._fsp--;

             after(grammarAccess.getCRUDOperationAndCollectionSchemaAccess().getOperationsCRUDOperationsParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CRUDOperationAndCollectionSchema__OperationsAssignment_1"


    // $ANTLR start "rule__ConnectionStatement__ConnectionStringAssignment_0_3"
    // InternalMyDsl.g:2753:1: rule__ConnectionStatement__ConnectionStringAssignment_0_3 : ( RULE_STRING ) ;
    public final void rule__ConnectionStatement__ConnectionStringAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2757:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:2758:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:2758:2: ( RULE_STRING )
            // InternalMyDsl.g:2759:3: RULE_STRING
            {
             before(grammarAccess.getConnectionStatementAccess().getConnectionStringSTRINGTerminalRuleCall_0_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getConnectionStatementAccess().getConnectionStringSTRINGTerminalRuleCall_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionStatement__ConnectionStringAssignment_0_3"


    // $ANTLR start "rule__ConnectionStatement__DatabaseNameAssignment_1_1"
    // InternalMyDsl.g:2768:1: rule__ConnectionStatement__DatabaseNameAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__ConnectionStatement__DatabaseNameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2772:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:2773:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:2773:2: ( RULE_STRING )
            // InternalMyDsl.g:2774:3: RULE_STRING
            {
             before(grammarAccess.getConnectionStatementAccess().getDatabaseNameSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getConnectionStatementAccess().getDatabaseNameSTRINGTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionStatement__DatabaseNameAssignment_1_1"


    // $ANTLR start "rule__CollectionSchema__NameAssignment_1"
    // InternalMyDsl.g:2783:1: rule__CollectionSchema__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__CollectionSchema__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2787:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2788:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2788:2: ( RULE_ID )
            // InternalMyDsl.g:2789:3: RULE_ID
            {
             before(grammarAccess.getCollectionSchemaAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCollectionSchemaAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionSchema__NameAssignment_1"


    // $ANTLR start "rule__CollectionSchema__DefinationAssignment_3_0"
    // InternalMyDsl.g:2798:1: rule__CollectionSchema__DefinationAssignment_3_0 : ( ruleCollectionFieldDefination ) ;
    public final void rule__CollectionSchema__DefinationAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2802:1: ( ( ruleCollectionFieldDefination ) )
            // InternalMyDsl.g:2803:2: ( ruleCollectionFieldDefination )
            {
            // InternalMyDsl.g:2803:2: ( ruleCollectionFieldDefination )
            // InternalMyDsl.g:2804:3: ruleCollectionFieldDefination
            {
             before(grammarAccess.getCollectionSchemaAccess().getDefinationCollectionFieldDefinationParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleCollectionFieldDefination();

            state._fsp--;

             after(grammarAccess.getCollectionSchemaAccess().getDefinationCollectionFieldDefinationParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionSchema__DefinationAssignment_3_0"


    // $ANTLR start "rule__CollectionSchema__DefinationAssignment_3_1_1"
    // InternalMyDsl.g:2813:1: rule__CollectionSchema__DefinationAssignment_3_1_1 : ( ruleCollectionFieldDefination ) ;
    public final void rule__CollectionSchema__DefinationAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2817:1: ( ( ruleCollectionFieldDefination ) )
            // InternalMyDsl.g:2818:2: ( ruleCollectionFieldDefination )
            {
            // InternalMyDsl.g:2818:2: ( ruleCollectionFieldDefination )
            // InternalMyDsl.g:2819:3: ruleCollectionFieldDefination
            {
             before(grammarAccess.getCollectionSchemaAccess().getDefinationCollectionFieldDefinationParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCollectionFieldDefination();

            state._fsp--;

             after(grammarAccess.getCollectionSchemaAccess().getDefinationCollectionFieldDefinationParserRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionSchema__DefinationAssignment_3_1_1"


    // $ANTLR start "rule__CollectionFieldDefination__NameAssignment_0_0"
    // InternalMyDsl.g:2828:1: rule__CollectionFieldDefination__NameAssignment_0_0 : ( RULE_ID ) ;
    public final void rule__CollectionFieldDefination__NameAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2832:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2833:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2833:2: ( RULE_ID )
            // InternalMyDsl.g:2834:3: RULE_ID
            {
             before(grammarAccess.getCollectionFieldDefinationAccess().getNameIDTerminalRuleCall_0_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCollectionFieldDefinationAccess().getNameIDTerminalRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionFieldDefination__NameAssignment_0_0"


    // $ANTLR start "rule__CollectionFieldDefination__FieldTypeAssignment_0_2"
    // InternalMyDsl.g:2843:1: rule__CollectionFieldDefination__FieldTypeAssignment_0_2 : ( ruleFieldType ) ;
    public final void rule__CollectionFieldDefination__FieldTypeAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2847:1: ( ( ruleFieldType ) )
            // InternalMyDsl.g:2848:2: ( ruleFieldType )
            {
            // InternalMyDsl.g:2848:2: ( ruleFieldType )
            // InternalMyDsl.g:2849:3: ruleFieldType
            {
             before(grammarAccess.getCollectionFieldDefinationAccess().getFieldTypeFieldTypeEnumRuleCall_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFieldType();

            state._fsp--;

             after(grammarAccess.getCollectionFieldDefinationAccess().getFieldTypeFieldTypeEnumRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionFieldDefination__FieldTypeAssignment_0_2"


    // $ANTLR start "rule__CollectionFieldDefination__StatusAssignment_0_3"
    // InternalMyDsl.g:2858:1: rule__CollectionFieldDefination__StatusAssignment_0_3 : ( ( 'required' ) ) ;
    public final void rule__CollectionFieldDefination__StatusAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2862:1: ( ( ( 'required' ) ) )
            // InternalMyDsl.g:2863:2: ( ( 'required' ) )
            {
            // InternalMyDsl.g:2863:2: ( ( 'required' ) )
            // InternalMyDsl.g:2864:3: ( 'required' )
            {
             before(grammarAccess.getCollectionFieldDefinationAccess().getStatusRequiredKeyword_0_3_0()); 
            // InternalMyDsl.g:2865:3: ( 'required' )
            // InternalMyDsl.g:2866:4: 'required'
            {
             before(grammarAccess.getCollectionFieldDefinationAccess().getStatusRequiredKeyword_0_3_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getCollectionFieldDefinationAccess().getStatusRequiredKeyword_0_3_0()); 

            }

             after(grammarAccess.getCollectionFieldDefinationAccess().getStatusRequiredKeyword_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionFieldDefination__StatusAssignment_0_3"


    // $ANTLR start "rule__CollectionFieldDefination__UniqueKeyAssignment_0_4"
    // InternalMyDsl.g:2877:1: rule__CollectionFieldDefination__UniqueKeyAssignment_0_4 : ( ( 'unique' ) ) ;
    public final void rule__CollectionFieldDefination__UniqueKeyAssignment_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2881:1: ( ( ( 'unique' ) ) )
            // InternalMyDsl.g:2882:2: ( ( 'unique' ) )
            {
            // InternalMyDsl.g:2882:2: ( ( 'unique' ) )
            // InternalMyDsl.g:2883:3: ( 'unique' )
            {
             before(grammarAccess.getCollectionFieldDefinationAccess().getUniqueKeyUniqueKeyword_0_4_0()); 
            // InternalMyDsl.g:2884:3: ( 'unique' )
            // InternalMyDsl.g:2885:4: 'unique'
            {
             before(grammarAccess.getCollectionFieldDefinationAccess().getUniqueKeyUniqueKeyword_0_4_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getCollectionFieldDefinationAccess().getUniqueKeyUniqueKeyword_0_4_0()); 

            }

             after(grammarAccess.getCollectionFieldDefinationAccess().getUniqueKeyUniqueKeyword_0_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionFieldDefination__UniqueKeyAssignment_0_4"


    // $ANTLR start "rule__CollectionFieldDefination__NameAssignment_1_0"
    // InternalMyDsl.g:2896:1: rule__CollectionFieldDefination__NameAssignment_1_0 : ( RULE_ID ) ;
    public final void rule__CollectionFieldDefination__NameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2900:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2901:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2901:2: ( RULE_ID )
            // InternalMyDsl.g:2902:3: RULE_ID
            {
             before(grammarAccess.getCollectionFieldDefinationAccess().getNameIDTerminalRuleCall_1_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCollectionFieldDefinationAccess().getNameIDTerminalRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionFieldDefination__NameAssignment_1_0"


    // $ANTLR start "rule__CollectionFieldDefination__RefCollectionAssignment_1_3"
    // InternalMyDsl.g:2911:1: rule__CollectionFieldDefination__RefCollectionAssignment_1_3 : ( ( RULE_ID ) ) ;
    public final void rule__CollectionFieldDefination__RefCollectionAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2915:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:2916:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:2916:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:2917:3: ( RULE_ID )
            {
             before(grammarAccess.getCollectionFieldDefinationAccess().getRefCollectionCollectionSchemaCrossReference_1_3_0()); 
            // InternalMyDsl.g:2918:3: ( RULE_ID )
            // InternalMyDsl.g:2919:4: RULE_ID
            {
             before(grammarAccess.getCollectionFieldDefinationAccess().getRefCollectionCollectionSchemaIDTerminalRuleCall_1_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCollectionFieldDefinationAccess().getRefCollectionCollectionSchemaIDTerminalRuleCall_1_3_0_1()); 

            }

             after(grammarAccess.getCollectionFieldDefinationAccess().getRefCollectionCollectionSchemaCrossReference_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionFieldDefination__RefCollectionAssignment_1_3"


    // $ANTLR start "rule__CRUDOperations__NameAssignment_0_1"
    // InternalMyDsl.g:2930:1: rule__CRUDOperations__NameAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__CRUDOperations__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2934:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2935:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2935:2: ( RULE_ID )
            // InternalMyDsl.g:2936:3: RULE_ID
            {
             before(grammarAccess.getCRUDOperationsAccess().getNameIDTerminalRuleCall_0_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCRUDOperationsAccess().getNameIDTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CRUDOperations__NameAssignment_0_1"


    // $ANTLR start "rule__CRUDOperations__TypeAssignment_0_3_2"
    // InternalMyDsl.g:2945:1: rule__CRUDOperations__TypeAssignment_0_3_2 : ( ruleOperation ) ;
    public final void rule__CRUDOperations__TypeAssignment_0_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2949:1: ( ( ruleOperation ) )
            // InternalMyDsl.g:2950:2: ( ruleOperation )
            {
            // InternalMyDsl.g:2950:2: ( ruleOperation )
            // InternalMyDsl.g:2951:3: ruleOperation
            {
             before(grammarAccess.getCRUDOperationsAccess().getTypeOperationParserRuleCall_0_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getCRUDOperationsAccess().getTypeOperationParserRuleCall_0_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CRUDOperations__TypeAssignment_0_3_2"


    // $ANTLR start "rule__CRUDOperations__CollectionAssignment_0_3_5"
    // InternalMyDsl.g:2960:1: rule__CRUDOperations__CollectionAssignment_0_3_5 : ( ( RULE_ID ) ) ;
    public final void rule__CRUDOperations__CollectionAssignment_0_3_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2964:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:2965:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:2965:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:2966:3: ( RULE_ID )
            {
             before(grammarAccess.getCRUDOperationsAccess().getCollectionCollectionSchemaCrossReference_0_3_5_0()); 
            // InternalMyDsl.g:2967:3: ( RULE_ID )
            // InternalMyDsl.g:2968:4: RULE_ID
            {
             before(grammarAccess.getCRUDOperationsAccess().getCollectionCollectionSchemaIDTerminalRuleCall_0_3_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCRUDOperationsAccess().getCollectionCollectionSchemaIDTerminalRuleCall_0_3_5_0_1()); 

            }

             after(grammarAccess.getCRUDOperationsAccess().getCollectionCollectionSchemaCrossReference_0_3_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CRUDOperations__CollectionAssignment_0_3_5"


    // $ANTLR start "rule__CRUDOperations__EntriesAssignment_0_3_8_0"
    // InternalMyDsl.g:2979:1: rule__CRUDOperations__EntriesAssignment_0_3_8_0 : ( ruleCollectionEntry ) ;
    public final void rule__CRUDOperations__EntriesAssignment_0_3_8_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2983:1: ( ( ruleCollectionEntry ) )
            // InternalMyDsl.g:2984:2: ( ruleCollectionEntry )
            {
            // InternalMyDsl.g:2984:2: ( ruleCollectionEntry )
            // InternalMyDsl.g:2985:3: ruleCollectionEntry
            {
             before(grammarAccess.getCRUDOperationsAccess().getEntriesCollectionEntryParserRuleCall_0_3_8_0_0()); 
            pushFollow(FOLLOW_2);
            ruleCollectionEntry();

            state._fsp--;

             after(grammarAccess.getCRUDOperationsAccess().getEntriesCollectionEntryParserRuleCall_0_3_8_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CRUDOperations__EntriesAssignment_0_3_8_0"


    // $ANTLR start "rule__CRUDOperations__EntriesAssignment_0_3_8_1_1"
    // InternalMyDsl.g:2994:1: rule__CRUDOperations__EntriesAssignment_0_3_8_1_1 : ( ruleCollectionEntry ) ;
    public final void rule__CRUDOperations__EntriesAssignment_0_3_8_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2998:1: ( ( ruleCollectionEntry ) )
            // InternalMyDsl.g:2999:2: ( ruleCollectionEntry )
            {
            // InternalMyDsl.g:2999:2: ( ruleCollectionEntry )
            // InternalMyDsl.g:3000:3: ruleCollectionEntry
            {
             before(grammarAccess.getCRUDOperationsAccess().getEntriesCollectionEntryParserRuleCall_0_3_8_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCollectionEntry();

            state._fsp--;

             after(grammarAccess.getCRUDOperationsAccess().getEntriesCollectionEntryParserRuleCall_0_3_8_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CRUDOperations__EntriesAssignment_0_3_8_1_1"


    // $ANTLR start "rule__CRUDOperations__NameAssignment_1_1"
    // InternalMyDsl.g:3009:1: rule__CRUDOperations__NameAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__CRUDOperations__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3013:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:3014:2: ( RULE_ID )
            {
            // InternalMyDsl.g:3014:2: ( RULE_ID )
            // InternalMyDsl.g:3015:3: RULE_ID
            {
             before(grammarAccess.getCRUDOperationsAccess().getNameIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCRUDOperationsAccess().getNameIDTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CRUDOperations__NameAssignment_1_1"


    // $ANTLR start "rule__CRUDOperations__TypeAssignment_1_3_2"
    // InternalMyDsl.g:3024:1: rule__CRUDOperations__TypeAssignment_1_3_2 : ( ( 'UPDATE' ) ) ;
    public final void rule__CRUDOperations__TypeAssignment_1_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3028:1: ( ( ( 'UPDATE' ) ) )
            // InternalMyDsl.g:3029:2: ( ( 'UPDATE' ) )
            {
            // InternalMyDsl.g:3029:2: ( ( 'UPDATE' ) )
            // InternalMyDsl.g:3030:3: ( 'UPDATE' )
            {
             before(grammarAccess.getCRUDOperationsAccess().getTypeUPDATEKeyword_1_3_2_0()); 
            // InternalMyDsl.g:3031:3: ( 'UPDATE' )
            // InternalMyDsl.g:3032:4: 'UPDATE'
            {
             before(grammarAccess.getCRUDOperationsAccess().getTypeUPDATEKeyword_1_3_2_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getCRUDOperationsAccess().getTypeUPDATEKeyword_1_3_2_0()); 

            }

             after(grammarAccess.getCRUDOperationsAccess().getTypeUPDATEKeyword_1_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CRUDOperations__TypeAssignment_1_3_2"


    // $ANTLR start "rule__CRUDOperations__CollectionAssignment_1_3_4"
    // InternalMyDsl.g:3043:1: rule__CRUDOperations__CollectionAssignment_1_3_4 : ( ( RULE_ID ) ) ;
    public final void rule__CRUDOperations__CollectionAssignment_1_3_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3047:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:3048:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:3048:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:3049:3: ( RULE_ID )
            {
             before(grammarAccess.getCRUDOperationsAccess().getCollectionCollectionSchemaCrossReference_1_3_4_0()); 
            // InternalMyDsl.g:3050:3: ( RULE_ID )
            // InternalMyDsl.g:3051:4: RULE_ID
            {
             before(grammarAccess.getCRUDOperationsAccess().getCollectionCollectionSchemaIDTerminalRuleCall_1_3_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCRUDOperationsAccess().getCollectionCollectionSchemaIDTerminalRuleCall_1_3_4_0_1()); 

            }

             after(grammarAccess.getCRUDOperationsAccess().getCollectionCollectionSchemaCrossReference_1_3_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CRUDOperations__CollectionAssignment_1_3_4"


    // $ANTLR start "rule__CRUDOperations__EntriesAssignment_1_3_7"
    // InternalMyDsl.g:3062:1: rule__CRUDOperations__EntriesAssignment_1_3_7 : ( ruleCollectionEntry ) ;
    public final void rule__CRUDOperations__EntriesAssignment_1_3_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3066:1: ( ( ruleCollectionEntry ) )
            // InternalMyDsl.g:3067:2: ( ruleCollectionEntry )
            {
            // InternalMyDsl.g:3067:2: ( ruleCollectionEntry )
            // InternalMyDsl.g:3068:3: ruleCollectionEntry
            {
             before(grammarAccess.getCRUDOperationsAccess().getEntriesCollectionEntryParserRuleCall_1_3_7_0()); 
            pushFollow(FOLLOW_2);
            ruleCollectionEntry();

            state._fsp--;

             after(grammarAccess.getCRUDOperationsAccess().getEntriesCollectionEntryParserRuleCall_1_3_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CRUDOperations__EntriesAssignment_1_3_7"


    // $ANTLR start "rule__CRUDOperations__EntriesAssignment_1_3_8_1"
    // InternalMyDsl.g:3077:1: rule__CRUDOperations__EntriesAssignment_1_3_8_1 : ( ruleCollectionEntry ) ;
    public final void rule__CRUDOperations__EntriesAssignment_1_3_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3081:1: ( ( ruleCollectionEntry ) )
            // InternalMyDsl.g:3082:2: ( ruleCollectionEntry )
            {
            // InternalMyDsl.g:3082:2: ( ruleCollectionEntry )
            // InternalMyDsl.g:3083:3: ruleCollectionEntry
            {
             before(grammarAccess.getCRUDOperationsAccess().getEntriesCollectionEntryParserRuleCall_1_3_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCollectionEntry();

            state._fsp--;

             after(grammarAccess.getCRUDOperationsAccess().getEntriesCollectionEntryParserRuleCall_1_3_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CRUDOperations__EntriesAssignment_1_3_8_1"


    // $ANTLR start "rule__CRUDOperations__EntriesAssignment_1_3_12"
    // InternalMyDsl.g:3092:1: rule__CRUDOperations__EntriesAssignment_1_3_12 : ( ruleUpdateCollectionEntry ) ;
    public final void rule__CRUDOperations__EntriesAssignment_1_3_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3096:1: ( ( ruleUpdateCollectionEntry ) )
            // InternalMyDsl.g:3097:2: ( ruleUpdateCollectionEntry )
            {
            // InternalMyDsl.g:3097:2: ( ruleUpdateCollectionEntry )
            // InternalMyDsl.g:3098:3: ruleUpdateCollectionEntry
            {
             before(grammarAccess.getCRUDOperationsAccess().getEntriesUpdateCollectionEntryParserRuleCall_1_3_12_0()); 
            pushFollow(FOLLOW_2);
            ruleUpdateCollectionEntry();

            state._fsp--;

             after(grammarAccess.getCRUDOperationsAccess().getEntriesUpdateCollectionEntryParserRuleCall_1_3_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CRUDOperations__EntriesAssignment_1_3_12"


    // $ANTLR start "rule__CRUDOperations__EntriesAssignment_1_3_13_1"
    // InternalMyDsl.g:3107:1: rule__CRUDOperations__EntriesAssignment_1_3_13_1 : ( ruleUpdateCollectionEntry ) ;
    public final void rule__CRUDOperations__EntriesAssignment_1_3_13_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3111:1: ( ( ruleUpdateCollectionEntry ) )
            // InternalMyDsl.g:3112:2: ( ruleUpdateCollectionEntry )
            {
            // InternalMyDsl.g:3112:2: ( ruleUpdateCollectionEntry )
            // InternalMyDsl.g:3113:3: ruleUpdateCollectionEntry
            {
             before(grammarAccess.getCRUDOperationsAccess().getEntriesUpdateCollectionEntryParserRuleCall_1_3_13_1_0()); 
            pushFollow(FOLLOW_2);
            ruleUpdateCollectionEntry();

            state._fsp--;

             after(grammarAccess.getCRUDOperationsAccess().getEntriesUpdateCollectionEntryParserRuleCall_1_3_13_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CRUDOperations__EntriesAssignment_1_3_13_1"


    // $ANTLR start "rule__UpdateCollectionEntry__ValueNameAssignment_0"
    // InternalMyDsl.g:3122:1: rule__UpdateCollectionEntry__ValueNameAssignment_0 : ( RULE_ID ) ;
    public final void rule__UpdateCollectionEntry__ValueNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3126:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:3127:2: ( RULE_ID )
            {
            // InternalMyDsl.g:3127:2: ( RULE_ID )
            // InternalMyDsl.g:3128:3: RULE_ID
            {
             before(grammarAccess.getUpdateCollectionEntryAccess().getValueNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getUpdateCollectionEntryAccess().getValueNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateCollectionEntry__ValueNameAssignment_0"


    // $ANTLR start "rule__UpdateCollectionEntry__ValueStringAssignment_2_0"
    // InternalMyDsl.g:3137:1: rule__UpdateCollectionEntry__ValueStringAssignment_2_0 : ( RULE_STRING ) ;
    public final void rule__UpdateCollectionEntry__ValueStringAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3141:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:3142:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:3142:2: ( RULE_STRING )
            // InternalMyDsl.g:3143:3: RULE_STRING
            {
             before(grammarAccess.getUpdateCollectionEntryAccess().getValueStringSTRINGTerminalRuleCall_2_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getUpdateCollectionEntryAccess().getValueStringSTRINGTerminalRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateCollectionEntry__ValueStringAssignment_2_0"


    // $ANTLR start "rule__UpdateCollectionEntry__ValueIntAssignment_2_1"
    // InternalMyDsl.g:3152:1: rule__UpdateCollectionEntry__ValueIntAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__UpdateCollectionEntry__ValueIntAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3156:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:3157:2: ( RULE_INT )
            {
            // InternalMyDsl.g:3157:2: ( RULE_INT )
            // InternalMyDsl.g:3158:3: RULE_INT
            {
             before(grammarAccess.getUpdateCollectionEntryAccess().getValueIntINTTerminalRuleCall_2_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getUpdateCollectionEntryAccess().getValueIntINTTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateCollectionEntry__ValueIntAssignment_2_1"


    // $ANTLR start "rule__CollectionEntry__ValueNameAssignment_0"
    // InternalMyDsl.g:3167:1: rule__CollectionEntry__ValueNameAssignment_0 : ( RULE_ID ) ;
    public final void rule__CollectionEntry__ValueNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3171:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:3172:2: ( RULE_ID )
            {
            // InternalMyDsl.g:3172:2: ( RULE_ID )
            // InternalMyDsl.g:3173:3: RULE_ID
            {
             before(grammarAccess.getCollectionEntryAccess().getValueNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCollectionEntryAccess().getValueNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionEntry__ValueNameAssignment_0"


    // $ANTLR start "rule__CollectionEntry__ValueStringAssignment_2_0"
    // InternalMyDsl.g:3182:1: rule__CollectionEntry__ValueStringAssignment_2_0 : ( RULE_STRING ) ;
    public final void rule__CollectionEntry__ValueStringAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3186:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:3187:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:3187:2: ( RULE_STRING )
            // InternalMyDsl.g:3188:3: RULE_STRING
            {
             before(grammarAccess.getCollectionEntryAccess().getValueStringSTRINGTerminalRuleCall_2_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCollectionEntryAccess().getValueStringSTRINGTerminalRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionEntry__ValueStringAssignment_2_0"


    // $ANTLR start "rule__CollectionEntry__ValueIntAssignment_2_1"
    // InternalMyDsl.g:3197:1: rule__CollectionEntry__ValueIntAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__CollectionEntry__ValueIntAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3201:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:3202:2: ( RULE_INT )
            {
            // InternalMyDsl.g:3202:2: ( RULE_INT )
            // InternalMyDsl.g:3203:3: RULE_INT
            {
             before(grammarAccess.getCollectionEntryAccess().getValueIntINTTerminalRuleCall_2_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCollectionEntryAccess().getValueIntINTTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionEntry__ValueIntAssignment_2_1"

    // Delegated rules


    protected DFA19 dfa19 = new DFA19(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\1\3\12\uffff";
    static final String dfa_3s = "\1\22\1\23\1\4\1\uffff\1\24\1\27\1\4\1\0\1\25\1\uffff\1\0";
    static final String dfa_4s = "\1\30\1\23\1\4\1\uffff\1\24\1\27\1\4\1\0\1\25\1\uffff\1\0";
    static final String dfa_5s = "\3\uffff\1\2\5\uffff\1\1\1\uffff";
    static final String dfa_6s = "\7\uffff\1\0\2\uffff\1\1}>";
    static final String[] dfa_7s = {
            "\1\1\3\uffff\1\2\1\uffff\1\3",
            "\1\4",
            "\1\5",
            "",
            "\1\6",
            "\1\7",
            "\1\10",
            "\1\uffff",
            "\1\12",
            "",
            "\1\uffff"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "2660:2: ( rule__ConnectionStatement__UnorderedGroup__1 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA19_7 = input.LA(1);

                         
                        int index19_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionStatementAccess().getUnorderedGroup(), 1) ) {s = 9;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getConnectionStatementAccess().getUnorderedGroup()) ) {s = 3;}

                         
                        input.seek(index19_7);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA19_10 = input.LA(1);

                         
                        int index19_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionStatementAccess().getUnorderedGroup(), 0) ) {s = 9;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getConnectionStatementAccess().getUnorderedGroup()) ) {s = 3;}

                         
                        input.seek(index19_10);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 19, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000440002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000000003C000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000080200000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000050L});

}
