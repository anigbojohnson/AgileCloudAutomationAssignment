package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

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
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



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


    // $ANTLR start "entryRuleCollectionEntry"
    // InternalMyDsl.g:228:1: entryRuleCollectionEntry : ruleCollectionEntry EOF ;
    public final void entryRuleCollectionEntry() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleCollectionEntry EOF )
            // InternalMyDsl.g:230:1: ruleCollectionEntry EOF
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
    // InternalMyDsl.g:237:1: ruleCollectionEntry : ( ( rule__CollectionEntry__Group__0 ) ) ;
    public final void ruleCollectionEntry() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__CollectionEntry__Group__0 ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__CollectionEntry__Group__0 ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__CollectionEntry__Group__0 ) )
            // InternalMyDsl.g:243:3: ( rule__CollectionEntry__Group__0 )
            {
             before(grammarAccess.getCollectionEntryAccess().getGroup()); 
            // InternalMyDsl.g:244:3: ( rule__CollectionEntry__Group__0 )
            // InternalMyDsl.g:244:4: rule__CollectionEntry__Group__0
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


    // $ANTLR start "ruleOperation"
    // InternalMyDsl.g:253:1: ruleOperation : ( ( rule__Operation__Alternatives ) ) ;
    public final void ruleOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:257:1: ( ( ( rule__Operation__Alternatives ) ) )
            // InternalMyDsl.g:258:2: ( ( rule__Operation__Alternatives ) )
            {
            // InternalMyDsl.g:258:2: ( ( rule__Operation__Alternatives ) )
            // InternalMyDsl.g:259:3: ( rule__Operation__Alternatives )
            {
             before(grammarAccess.getOperationAccess().getAlternatives()); 
            // InternalMyDsl.g:260:3: ( rule__Operation__Alternatives )
            // InternalMyDsl.g:260:4: rule__Operation__Alternatives
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
    // InternalMyDsl.g:269:1: ruleFieldType : ( ( rule__FieldType__Alternatives ) ) ;
    public final void ruleFieldType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:273:1: ( ( ( rule__FieldType__Alternatives ) ) )
            // InternalMyDsl.g:274:2: ( ( rule__FieldType__Alternatives ) )
            {
            // InternalMyDsl.g:274:2: ( ( rule__FieldType__Alternatives ) )
            // InternalMyDsl.g:275:3: ( rule__FieldType__Alternatives )
            {
             before(grammarAccess.getFieldTypeAccess().getAlternatives()); 
            // InternalMyDsl.g:276:3: ( rule__FieldType__Alternatives )
            // InternalMyDsl.g:276:4: rule__FieldType__Alternatives
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
    // InternalMyDsl.g:284:1: rule__CollectionFieldDefination__Alternatives : ( ( ( rule__CollectionFieldDefination__Group_0__0 ) ) | ( ( rule__CollectionFieldDefination__Group_1__0 ) ) );
    public final void rule__CollectionFieldDefination__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:288:1: ( ( ( rule__CollectionFieldDefination__Group_0__0 ) ) | ( ( rule__CollectionFieldDefination__Group_1__0 ) ) )
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
                    // InternalMyDsl.g:289:2: ( ( rule__CollectionFieldDefination__Group_0__0 ) )
                    {
                    // InternalMyDsl.g:289:2: ( ( rule__CollectionFieldDefination__Group_0__0 ) )
                    // InternalMyDsl.g:290:3: ( rule__CollectionFieldDefination__Group_0__0 )
                    {
                     before(grammarAccess.getCollectionFieldDefinationAccess().getGroup_0()); 
                    // InternalMyDsl.g:291:3: ( rule__CollectionFieldDefination__Group_0__0 )
                    // InternalMyDsl.g:291:4: rule__CollectionFieldDefination__Group_0__0
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
                    // InternalMyDsl.g:295:2: ( ( rule__CollectionFieldDefination__Group_1__0 ) )
                    {
                    // InternalMyDsl.g:295:2: ( ( rule__CollectionFieldDefination__Group_1__0 ) )
                    // InternalMyDsl.g:296:3: ( rule__CollectionFieldDefination__Group_1__0 )
                    {
                     before(grammarAccess.getCollectionFieldDefinationAccess().getGroup_1()); 
                    // InternalMyDsl.g:297:3: ( rule__CollectionFieldDefination__Group_1__0 )
                    // InternalMyDsl.g:297:4: rule__CollectionFieldDefination__Group_1__0
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
    // InternalMyDsl.g:305:1: rule__CRUDOperations__Alternatives : ( ( ( rule__CRUDOperations__Group_0__0 ) ) | ( ( rule__CRUDOperations__Group_1__0 ) ) );
    public final void rule__CRUDOperations__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:309:1: ( ( ( rule__CRUDOperations__Group_0__0 ) ) | ( ( rule__CRUDOperations__Group_1__0 ) ) )
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
                    // InternalMyDsl.g:310:2: ( ( rule__CRUDOperations__Group_0__0 ) )
                    {
                    // InternalMyDsl.g:310:2: ( ( rule__CRUDOperations__Group_0__0 ) )
                    // InternalMyDsl.g:311:3: ( rule__CRUDOperations__Group_0__0 )
                    {
                     before(grammarAccess.getCRUDOperationsAccess().getGroup_0()); 
                    // InternalMyDsl.g:312:3: ( rule__CRUDOperations__Group_0__0 )
                    // InternalMyDsl.g:312:4: rule__CRUDOperations__Group_0__0
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
                    // InternalMyDsl.g:316:2: ( ( rule__CRUDOperations__Group_1__0 ) )
                    {
                    // InternalMyDsl.g:316:2: ( ( rule__CRUDOperations__Group_1__0 ) )
                    // InternalMyDsl.g:317:3: ( rule__CRUDOperations__Group_1__0 )
                    {
                     before(grammarAccess.getCRUDOperationsAccess().getGroup_1()); 
                    // InternalMyDsl.g:318:3: ( rule__CRUDOperations__Group_1__0 )
                    // InternalMyDsl.g:318:4: rule__CRUDOperations__Group_1__0
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


    // $ANTLR start "rule__CollectionEntry__Alternatives_2"
    // InternalMyDsl.g:326:1: rule__CollectionEntry__Alternatives_2 : ( ( ( rule__CollectionEntry__ValueStringAssignment_2_0 ) ) | ( ( rule__CollectionEntry__ValueIntAssignment_2_1 ) ) );
    public final void rule__CollectionEntry__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:330:1: ( ( ( rule__CollectionEntry__ValueStringAssignment_2_0 ) ) | ( ( rule__CollectionEntry__ValueIntAssignment_2_1 ) ) )
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
                    // InternalMyDsl.g:331:2: ( ( rule__CollectionEntry__ValueStringAssignment_2_0 ) )
                    {
                    // InternalMyDsl.g:331:2: ( ( rule__CollectionEntry__ValueStringAssignment_2_0 ) )
                    // InternalMyDsl.g:332:3: ( rule__CollectionEntry__ValueStringAssignment_2_0 )
                    {
                     before(grammarAccess.getCollectionEntryAccess().getValueStringAssignment_2_0()); 
                    // InternalMyDsl.g:333:3: ( rule__CollectionEntry__ValueStringAssignment_2_0 )
                    // InternalMyDsl.g:333:4: rule__CollectionEntry__ValueStringAssignment_2_0
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
                    // InternalMyDsl.g:337:2: ( ( rule__CollectionEntry__ValueIntAssignment_2_1 ) )
                    {
                    // InternalMyDsl.g:337:2: ( ( rule__CollectionEntry__ValueIntAssignment_2_1 ) )
                    // InternalMyDsl.g:338:3: ( rule__CollectionEntry__ValueIntAssignment_2_1 )
                    {
                     before(grammarAccess.getCollectionEntryAccess().getValueIntAssignment_2_1()); 
                    // InternalMyDsl.g:339:3: ( rule__CollectionEntry__ValueIntAssignment_2_1 )
                    // InternalMyDsl.g:339:4: rule__CollectionEntry__ValueIntAssignment_2_1
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
    // InternalMyDsl.g:347:1: rule__Operation__Alternatives : ( ( ( 'GET' ) ) | ( ( 'DELETE' ) ) | ( ( 'INSERT' ) ) );
    public final void rule__Operation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:351:1: ( ( ( 'GET' ) ) | ( ( 'DELETE' ) ) | ( ( 'INSERT' ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt5=1;
                }
                break;
            case 12:
                {
                alt5=2;
                }
                break;
            case 13:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:352:2: ( ( 'GET' ) )
                    {
                    // InternalMyDsl.g:352:2: ( ( 'GET' ) )
                    // InternalMyDsl.g:353:3: ( 'GET' )
                    {
                     before(grammarAccess.getOperationAccess().getGETEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:354:3: ( 'GET' )
                    // InternalMyDsl.g:354:4: 'GET'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperationAccess().getGETEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:358:2: ( ( 'DELETE' ) )
                    {
                    // InternalMyDsl.g:358:2: ( ( 'DELETE' ) )
                    // InternalMyDsl.g:359:3: ( 'DELETE' )
                    {
                     before(grammarAccess.getOperationAccess().getDELETEEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:360:3: ( 'DELETE' )
                    // InternalMyDsl.g:360:4: 'DELETE'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperationAccess().getDELETEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:364:2: ( ( 'INSERT' ) )
                    {
                    // InternalMyDsl.g:364:2: ( ( 'INSERT' ) )
                    // InternalMyDsl.g:365:3: ( 'INSERT' )
                    {
                     before(grammarAccess.getOperationAccess().getINSERTEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:366:3: ( 'INSERT' )
                    // InternalMyDsl.g:366:4: 'INSERT'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperationAccess().getINSERTEnumLiteralDeclaration_2()); 

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
    // InternalMyDsl.g:374:1: rule__FieldType__Alternatives : ( ( ( 'String' ) ) | ( ( 'Number' ) ) | ( ( 'Boolean' ) ) | ( ( 'Date' ) ) );
    public final void rule__FieldType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:378:1: ( ( ( 'String' ) ) | ( ( 'Number' ) ) | ( ( 'Boolean' ) ) | ( ( 'Date' ) ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt6=1;
                }
                break;
            case 15:
                {
                alt6=2;
                }
                break;
            case 16:
                {
                alt6=3;
                }
                break;
            case 17:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:379:2: ( ( 'String' ) )
                    {
                    // InternalMyDsl.g:379:2: ( ( 'String' ) )
                    // InternalMyDsl.g:380:3: ( 'String' )
                    {
                     before(grammarAccess.getFieldTypeAccess().getStringEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:381:3: ( 'String' )
                    // InternalMyDsl.g:381:4: 'String'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getFieldTypeAccess().getStringEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:385:2: ( ( 'Number' ) )
                    {
                    // InternalMyDsl.g:385:2: ( ( 'Number' ) )
                    // InternalMyDsl.g:386:3: ( 'Number' )
                    {
                     before(grammarAccess.getFieldTypeAccess().getNumberEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:387:3: ( 'Number' )
                    // InternalMyDsl.g:387:4: 'Number'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getFieldTypeAccess().getNumberEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:391:2: ( ( 'Boolean' ) )
                    {
                    // InternalMyDsl.g:391:2: ( ( 'Boolean' ) )
                    // InternalMyDsl.g:392:3: ( 'Boolean' )
                    {
                     before(grammarAccess.getFieldTypeAccess().getBooleanEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:393:3: ( 'Boolean' )
                    // InternalMyDsl.g:393:4: 'Boolean'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getFieldTypeAccess().getBooleanEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:397:2: ( ( 'Date' ) )
                    {
                    // InternalMyDsl.g:397:2: ( ( 'Date' ) )
                    // InternalMyDsl.g:398:3: ( 'Date' )
                    {
                     before(grammarAccess.getFieldTypeAccess().getDateEnumLiteralDeclaration_3()); 
                    // InternalMyDsl.g:399:3: ( 'Date' )
                    // InternalMyDsl.g:399:4: 'Date'
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
    // InternalMyDsl.g:407:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:411:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalMyDsl.g:412:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalMyDsl.g:419:1: rule__Model__Group__0__Impl : ( ( rule__Model__ConnectionAssignment_0 ) ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:423:1: ( ( ( rule__Model__ConnectionAssignment_0 ) ) )
            // InternalMyDsl.g:424:1: ( ( rule__Model__ConnectionAssignment_0 ) )
            {
            // InternalMyDsl.g:424:1: ( ( rule__Model__ConnectionAssignment_0 ) )
            // InternalMyDsl.g:425:2: ( rule__Model__ConnectionAssignment_0 )
            {
             before(grammarAccess.getModelAccess().getConnectionAssignment_0()); 
            // InternalMyDsl.g:426:2: ( rule__Model__ConnectionAssignment_0 )
            // InternalMyDsl.g:426:3: rule__Model__ConnectionAssignment_0
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
    // InternalMyDsl.g:434:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:438:1: ( rule__Model__Group__1__Impl )
            // InternalMyDsl.g:439:2: rule__Model__Group__1__Impl
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
    // InternalMyDsl.g:445:1: rule__Model__Group__1__Impl : ( ( rule__Model__StatementsAssignment_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:449:1: ( ( ( rule__Model__StatementsAssignment_1 )* ) )
            // InternalMyDsl.g:450:1: ( ( rule__Model__StatementsAssignment_1 )* )
            {
            // InternalMyDsl.g:450:1: ( ( rule__Model__StatementsAssignment_1 )* )
            // InternalMyDsl.g:451:2: ( rule__Model__StatementsAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getStatementsAssignment_1()); 
            // InternalMyDsl.g:452:2: ( rule__Model__StatementsAssignment_1 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==24) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:452:3: rule__Model__StatementsAssignment_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Model__StatementsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // InternalMyDsl.g:461:1: rule__CRUDOperationAndCollectionSchema__Group__0 : rule__CRUDOperationAndCollectionSchema__Group__0__Impl rule__CRUDOperationAndCollectionSchema__Group__1 ;
    public final void rule__CRUDOperationAndCollectionSchema__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:465:1: ( rule__CRUDOperationAndCollectionSchema__Group__0__Impl rule__CRUDOperationAndCollectionSchema__Group__1 )
            // InternalMyDsl.g:466:2: rule__CRUDOperationAndCollectionSchema__Group__0__Impl rule__CRUDOperationAndCollectionSchema__Group__1
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
    // InternalMyDsl.g:473:1: rule__CRUDOperationAndCollectionSchema__Group__0__Impl : ( ( rule__CRUDOperationAndCollectionSchema__SchemaAssignment_0 ) ) ;
    public final void rule__CRUDOperationAndCollectionSchema__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:477:1: ( ( ( rule__CRUDOperationAndCollectionSchema__SchemaAssignment_0 ) ) )
            // InternalMyDsl.g:478:1: ( ( rule__CRUDOperationAndCollectionSchema__SchemaAssignment_0 ) )
            {
            // InternalMyDsl.g:478:1: ( ( rule__CRUDOperationAndCollectionSchema__SchemaAssignment_0 ) )
            // InternalMyDsl.g:479:2: ( rule__CRUDOperationAndCollectionSchema__SchemaAssignment_0 )
            {
             before(grammarAccess.getCRUDOperationAndCollectionSchemaAccess().getSchemaAssignment_0()); 
            // InternalMyDsl.g:480:2: ( rule__CRUDOperationAndCollectionSchema__SchemaAssignment_0 )
            // InternalMyDsl.g:480:3: rule__CRUDOperationAndCollectionSchema__SchemaAssignment_0
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
    // InternalMyDsl.g:488:1: rule__CRUDOperationAndCollectionSchema__Group__1 : rule__CRUDOperationAndCollectionSchema__Group__1__Impl ;
    public final void rule__CRUDOperationAndCollectionSchema__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:492:1: ( rule__CRUDOperationAndCollectionSchema__Group__1__Impl )
            // InternalMyDsl.g:493:2: rule__CRUDOperationAndCollectionSchema__Group__1__Impl
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
    // InternalMyDsl.g:499:1: rule__CRUDOperationAndCollectionSchema__Group__1__Impl : ( ( rule__CRUDOperationAndCollectionSchema__OperationsAssignment_1 )* ) ;
    public final void rule__CRUDOperationAndCollectionSchema__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:503:1: ( ( ( rule__CRUDOperationAndCollectionSchema__OperationsAssignment_1 )* ) )
            // InternalMyDsl.g:504:1: ( ( rule__CRUDOperationAndCollectionSchema__OperationsAssignment_1 )* )
            {
            // InternalMyDsl.g:504:1: ( ( rule__CRUDOperationAndCollectionSchema__OperationsAssignment_1 )* )
            // InternalMyDsl.g:505:2: ( rule__CRUDOperationAndCollectionSchema__OperationsAssignment_1 )*
            {
             before(grammarAccess.getCRUDOperationAndCollectionSchemaAccess().getOperationsAssignment_1()); 
            // InternalMyDsl.g:506:2: ( rule__CRUDOperationAndCollectionSchema__OperationsAssignment_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==27) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:506:3: rule__CRUDOperationAndCollectionSchema__OperationsAssignment_1
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__CRUDOperationAndCollectionSchema__OperationsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalMyDsl.g:515:1: rule__ConnectionStatement__Group_0__0 : rule__ConnectionStatement__Group_0__0__Impl rule__ConnectionStatement__Group_0__1 ;
    public final void rule__ConnectionStatement__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:519:1: ( rule__ConnectionStatement__Group_0__0__Impl rule__ConnectionStatement__Group_0__1 )
            // InternalMyDsl.g:520:2: rule__ConnectionStatement__Group_0__0__Impl rule__ConnectionStatement__Group_0__1
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
    // InternalMyDsl.g:527:1: rule__ConnectionStatement__Group_0__0__Impl : ( 'DatabaseParameters' ) ;
    public final void rule__ConnectionStatement__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:531:1: ( ( 'DatabaseParameters' ) )
            // InternalMyDsl.g:532:1: ( 'DatabaseParameters' )
            {
            // InternalMyDsl.g:532:1: ( 'DatabaseParameters' )
            // InternalMyDsl.g:533:2: 'DatabaseParameters'
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
    // InternalMyDsl.g:542:1: rule__ConnectionStatement__Group_0__1 : rule__ConnectionStatement__Group_0__1__Impl rule__ConnectionStatement__Group_0__2 ;
    public final void rule__ConnectionStatement__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:546:1: ( rule__ConnectionStatement__Group_0__1__Impl rule__ConnectionStatement__Group_0__2 )
            // InternalMyDsl.g:547:2: rule__ConnectionStatement__Group_0__1__Impl rule__ConnectionStatement__Group_0__2
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
    // InternalMyDsl.g:554:1: rule__ConnectionStatement__Group_0__1__Impl : ( '{' ) ;
    public final void rule__ConnectionStatement__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:558:1: ( ( '{' ) )
            // InternalMyDsl.g:559:1: ( '{' )
            {
            // InternalMyDsl.g:559:1: ( '{' )
            // InternalMyDsl.g:560:2: '{'
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
    // InternalMyDsl.g:569:1: rule__ConnectionStatement__Group_0__2 : rule__ConnectionStatement__Group_0__2__Impl rule__ConnectionStatement__Group_0__3 ;
    public final void rule__ConnectionStatement__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:573:1: ( rule__ConnectionStatement__Group_0__2__Impl rule__ConnectionStatement__Group_0__3 )
            // InternalMyDsl.g:574:2: rule__ConnectionStatement__Group_0__2__Impl rule__ConnectionStatement__Group_0__3
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
    // InternalMyDsl.g:581:1: rule__ConnectionStatement__Group_0__2__Impl : ( 'Connection' ) ;
    public final void rule__ConnectionStatement__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:585:1: ( ( 'Connection' ) )
            // InternalMyDsl.g:586:1: ( 'Connection' )
            {
            // InternalMyDsl.g:586:1: ( 'Connection' )
            // InternalMyDsl.g:587:2: 'Connection'
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
    // InternalMyDsl.g:596:1: rule__ConnectionStatement__Group_0__3 : rule__ConnectionStatement__Group_0__3__Impl rule__ConnectionStatement__Group_0__4 ;
    public final void rule__ConnectionStatement__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:600:1: ( rule__ConnectionStatement__Group_0__3__Impl rule__ConnectionStatement__Group_0__4 )
            // InternalMyDsl.g:601:2: rule__ConnectionStatement__Group_0__3__Impl rule__ConnectionStatement__Group_0__4
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
    // InternalMyDsl.g:608:1: rule__ConnectionStatement__Group_0__3__Impl : ( ( rule__ConnectionStatement__ConnectionStringAssignment_0_3 ) ) ;
    public final void rule__ConnectionStatement__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:612:1: ( ( ( rule__ConnectionStatement__ConnectionStringAssignment_0_3 ) ) )
            // InternalMyDsl.g:613:1: ( ( rule__ConnectionStatement__ConnectionStringAssignment_0_3 ) )
            {
            // InternalMyDsl.g:613:1: ( ( rule__ConnectionStatement__ConnectionStringAssignment_0_3 ) )
            // InternalMyDsl.g:614:2: ( rule__ConnectionStatement__ConnectionStringAssignment_0_3 )
            {
             before(grammarAccess.getConnectionStatementAccess().getConnectionStringAssignment_0_3()); 
            // InternalMyDsl.g:615:2: ( rule__ConnectionStatement__ConnectionStringAssignment_0_3 )
            // InternalMyDsl.g:615:3: rule__ConnectionStatement__ConnectionStringAssignment_0_3
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
    // InternalMyDsl.g:623:1: rule__ConnectionStatement__Group_0__4 : rule__ConnectionStatement__Group_0__4__Impl ;
    public final void rule__ConnectionStatement__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:627:1: ( rule__ConnectionStatement__Group_0__4__Impl )
            // InternalMyDsl.g:628:2: rule__ConnectionStatement__Group_0__4__Impl
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
    // InternalMyDsl.g:634:1: rule__ConnectionStatement__Group_0__4__Impl : ( ',' ) ;
    public final void rule__ConnectionStatement__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:638:1: ( ( ',' ) )
            // InternalMyDsl.g:639:1: ( ',' )
            {
            // InternalMyDsl.g:639:1: ( ',' )
            // InternalMyDsl.g:640:2: ','
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
    // InternalMyDsl.g:650:1: rule__ConnectionStatement__Group_1__0 : rule__ConnectionStatement__Group_1__0__Impl rule__ConnectionStatement__Group_1__1 ;
    public final void rule__ConnectionStatement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:654:1: ( rule__ConnectionStatement__Group_1__0__Impl rule__ConnectionStatement__Group_1__1 )
            // InternalMyDsl.g:655:2: rule__ConnectionStatement__Group_1__0__Impl rule__ConnectionStatement__Group_1__1
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
    // InternalMyDsl.g:662:1: rule__ConnectionStatement__Group_1__0__Impl : ( 'databaseName' ) ;
    public final void rule__ConnectionStatement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:666:1: ( ( 'databaseName' ) )
            // InternalMyDsl.g:667:1: ( 'databaseName' )
            {
            // InternalMyDsl.g:667:1: ( 'databaseName' )
            // InternalMyDsl.g:668:2: 'databaseName'
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
    // InternalMyDsl.g:677:1: rule__ConnectionStatement__Group_1__1 : rule__ConnectionStatement__Group_1__1__Impl rule__ConnectionStatement__Group_1__2 ;
    public final void rule__ConnectionStatement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:681:1: ( rule__ConnectionStatement__Group_1__1__Impl rule__ConnectionStatement__Group_1__2 )
            // InternalMyDsl.g:682:2: rule__ConnectionStatement__Group_1__1__Impl rule__ConnectionStatement__Group_1__2
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
    // InternalMyDsl.g:689:1: rule__ConnectionStatement__Group_1__1__Impl : ( ( rule__ConnectionStatement__DatabaseNameAssignment_1_1 ) ) ;
    public final void rule__ConnectionStatement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:693:1: ( ( ( rule__ConnectionStatement__DatabaseNameAssignment_1_1 ) ) )
            // InternalMyDsl.g:694:1: ( ( rule__ConnectionStatement__DatabaseNameAssignment_1_1 ) )
            {
            // InternalMyDsl.g:694:1: ( ( rule__ConnectionStatement__DatabaseNameAssignment_1_1 ) )
            // InternalMyDsl.g:695:2: ( rule__ConnectionStatement__DatabaseNameAssignment_1_1 )
            {
             before(grammarAccess.getConnectionStatementAccess().getDatabaseNameAssignment_1_1()); 
            // InternalMyDsl.g:696:2: ( rule__ConnectionStatement__DatabaseNameAssignment_1_1 )
            // InternalMyDsl.g:696:3: rule__ConnectionStatement__DatabaseNameAssignment_1_1
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
    // InternalMyDsl.g:704:1: rule__ConnectionStatement__Group_1__2 : rule__ConnectionStatement__Group_1__2__Impl ;
    public final void rule__ConnectionStatement__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:708:1: ( rule__ConnectionStatement__Group_1__2__Impl )
            // InternalMyDsl.g:709:2: rule__ConnectionStatement__Group_1__2__Impl
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
    // InternalMyDsl.g:715:1: rule__ConnectionStatement__Group_1__2__Impl : ( '}' ) ;
    public final void rule__ConnectionStatement__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:719:1: ( ( '}' ) )
            // InternalMyDsl.g:720:1: ( '}' )
            {
            // InternalMyDsl.g:720:1: ( '}' )
            // InternalMyDsl.g:721:2: '}'
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
    // InternalMyDsl.g:731:1: rule__CollectionSchema__Group__0 : rule__CollectionSchema__Group__0__Impl rule__CollectionSchema__Group__1 ;
    public final void rule__CollectionSchema__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:735:1: ( rule__CollectionSchema__Group__0__Impl rule__CollectionSchema__Group__1 )
            // InternalMyDsl.g:736:2: rule__CollectionSchema__Group__0__Impl rule__CollectionSchema__Group__1
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
    // InternalMyDsl.g:743:1: rule__CollectionSchema__Group__0__Impl : ( 'Collection' ) ;
    public final void rule__CollectionSchema__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:747:1: ( ( 'Collection' ) )
            // InternalMyDsl.g:748:1: ( 'Collection' )
            {
            // InternalMyDsl.g:748:1: ( 'Collection' )
            // InternalMyDsl.g:749:2: 'Collection'
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
    // InternalMyDsl.g:758:1: rule__CollectionSchema__Group__1 : rule__CollectionSchema__Group__1__Impl rule__CollectionSchema__Group__2 ;
    public final void rule__CollectionSchema__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:762:1: ( rule__CollectionSchema__Group__1__Impl rule__CollectionSchema__Group__2 )
            // InternalMyDsl.g:763:2: rule__CollectionSchema__Group__1__Impl rule__CollectionSchema__Group__2
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
    // InternalMyDsl.g:770:1: rule__CollectionSchema__Group__1__Impl : ( ( rule__CollectionSchema__NameAssignment_1 ) ) ;
    public final void rule__CollectionSchema__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:774:1: ( ( ( rule__CollectionSchema__NameAssignment_1 ) ) )
            // InternalMyDsl.g:775:1: ( ( rule__CollectionSchema__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:775:1: ( ( rule__CollectionSchema__NameAssignment_1 ) )
            // InternalMyDsl.g:776:2: ( rule__CollectionSchema__NameAssignment_1 )
            {
             before(grammarAccess.getCollectionSchemaAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:777:2: ( rule__CollectionSchema__NameAssignment_1 )
            // InternalMyDsl.g:777:3: rule__CollectionSchema__NameAssignment_1
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
    // InternalMyDsl.g:785:1: rule__CollectionSchema__Group__2 : rule__CollectionSchema__Group__2__Impl rule__CollectionSchema__Group__3 ;
    public final void rule__CollectionSchema__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:789:1: ( rule__CollectionSchema__Group__2__Impl rule__CollectionSchema__Group__3 )
            // InternalMyDsl.g:790:2: rule__CollectionSchema__Group__2__Impl rule__CollectionSchema__Group__3
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
    // InternalMyDsl.g:797:1: rule__CollectionSchema__Group__2__Impl : ( '{' ) ;
    public final void rule__CollectionSchema__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:801:1: ( ( '{' ) )
            // InternalMyDsl.g:802:1: ( '{' )
            {
            // InternalMyDsl.g:802:1: ( '{' )
            // InternalMyDsl.g:803:2: '{'
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
    // InternalMyDsl.g:812:1: rule__CollectionSchema__Group__3 : rule__CollectionSchema__Group__3__Impl rule__CollectionSchema__Group__4 ;
    public final void rule__CollectionSchema__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:816:1: ( rule__CollectionSchema__Group__3__Impl rule__CollectionSchema__Group__4 )
            // InternalMyDsl.g:817:2: rule__CollectionSchema__Group__3__Impl rule__CollectionSchema__Group__4
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
    // InternalMyDsl.g:824:1: rule__CollectionSchema__Group__3__Impl : ( ( rule__CollectionSchema__Group_3__0 )? ) ;
    public final void rule__CollectionSchema__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:828:1: ( ( ( rule__CollectionSchema__Group_3__0 )? ) )
            // InternalMyDsl.g:829:1: ( ( rule__CollectionSchema__Group_3__0 )? )
            {
            // InternalMyDsl.g:829:1: ( ( rule__CollectionSchema__Group_3__0 )? )
            // InternalMyDsl.g:830:2: ( rule__CollectionSchema__Group_3__0 )?
            {
             before(grammarAccess.getCollectionSchemaAccess().getGroup_3()); 
            // InternalMyDsl.g:831:2: ( rule__CollectionSchema__Group_3__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:831:3: rule__CollectionSchema__Group_3__0
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
    // InternalMyDsl.g:839:1: rule__CollectionSchema__Group__4 : rule__CollectionSchema__Group__4__Impl ;
    public final void rule__CollectionSchema__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:843:1: ( rule__CollectionSchema__Group__4__Impl )
            // InternalMyDsl.g:844:2: rule__CollectionSchema__Group__4__Impl
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
    // InternalMyDsl.g:850:1: rule__CollectionSchema__Group__4__Impl : ( '}' ) ;
    public final void rule__CollectionSchema__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:854:1: ( ( '}' ) )
            // InternalMyDsl.g:855:1: ( '}' )
            {
            // InternalMyDsl.g:855:1: ( '}' )
            // InternalMyDsl.g:856:2: '}'
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
    // InternalMyDsl.g:866:1: rule__CollectionSchema__Group_3__0 : rule__CollectionSchema__Group_3__0__Impl rule__CollectionSchema__Group_3__1 ;
    public final void rule__CollectionSchema__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:870:1: ( rule__CollectionSchema__Group_3__0__Impl rule__CollectionSchema__Group_3__1 )
            // InternalMyDsl.g:871:2: rule__CollectionSchema__Group_3__0__Impl rule__CollectionSchema__Group_3__1
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
    // InternalMyDsl.g:878:1: rule__CollectionSchema__Group_3__0__Impl : ( ( rule__CollectionSchema__DefinationAssignment_3_0 ) ) ;
    public final void rule__CollectionSchema__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:882:1: ( ( ( rule__CollectionSchema__DefinationAssignment_3_0 ) ) )
            // InternalMyDsl.g:883:1: ( ( rule__CollectionSchema__DefinationAssignment_3_0 ) )
            {
            // InternalMyDsl.g:883:1: ( ( rule__CollectionSchema__DefinationAssignment_3_0 ) )
            // InternalMyDsl.g:884:2: ( rule__CollectionSchema__DefinationAssignment_3_0 )
            {
             before(grammarAccess.getCollectionSchemaAccess().getDefinationAssignment_3_0()); 
            // InternalMyDsl.g:885:2: ( rule__CollectionSchema__DefinationAssignment_3_0 )
            // InternalMyDsl.g:885:3: rule__CollectionSchema__DefinationAssignment_3_0
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
    // InternalMyDsl.g:893:1: rule__CollectionSchema__Group_3__1 : rule__CollectionSchema__Group_3__1__Impl ;
    public final void rule__CollectionSchema__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:897:1: ( rule__CollectionSchema__Group_3__1__Impl )
            // InternalMyDsl.g:898:2: rule__CollectionSchema__Group_3__1__Impl
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
    // InternalMyDsl.g:904:1: rule__CollectionSchema__Group_3__1__Impl : ( ( rule__CollectionSchema__Group_3_1__0 )* ) ;
    public final void rule__CollectionSchema__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:908:1: ( ( ( rule__CollectionSchema__Group_3_1__0 )* ) )
            // InternalMyDsl.g:909:1: ( ( rule__CollectionSchema__Group_3_1__0 )* )
            {
            // InternalMyDsl.g:909:1: ( ( rule__CollectionSchema__Group_3_1__0 )* )
            // InternalMyDsl.g:910:2: ( rule__CollectionSchema__Group_3_1__0 )*
            {
             before(grammarAccess.getCollectionSchemaAccess().getGroup_3_1()); 
            // InternalMyDsl.g:911:2: ( rule__CollectionSchema__Group_3_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==21) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDsl.g:911:3: rule__CollectionSchema__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__CollectionSchema__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalMyDsl.g:920:1: rule__CollectionSchema__Group_3_1__0 : rule__CollectionSchema__Group_3_1__0__Impl rule__CollectionSchema__Group_3_1__1 ;
    public final void rule__CollectionSchema__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:924:1: ( rule__CollectionSchema__Group_3_1__0__Impl rule__CollectionSchema__Group_3_1__1 )
            // InternalMyDsl.g:925:2: rule__CollectionSchema__Group_3_1__0__Impl rule__CollectionSchema__Group_3_1__1
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
    // InternalMyDsl.g:932:1: rule__CollectionSchema__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__CollectionSchema__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:936:1: ( ( ',' ) )
            // InternalMyDsl.g:937:1: ( ',' )
            {
            // InternalMyDsl.g:937:1: ( ',' )
            // InternalMyDsl.g:938:2: ','
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
    // InternalMyDsl.g:947:1: rule__CollectionSchema__Group_3_1__1 : rule__CollectionSchema__Group_3_1__1__Impl ;
    public final void rule__CollectionSchema__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:951:1: ( rule__CollectionSchema__Group_3_1__1__Impl )
            // InternalMyDsl.g:952:2: rule__CollectionSchema__Group_3_1__1__Impl
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
    // InternalMyDsl.g:958:1: rule__CollectionSchema__Group_3_1__1__Impl : ( ( rule__CollectionSchema__DefinationAssignment_3_1_1 ) ) ;
    public final void rule__CollectionSchema__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:962:1: ( ( ( rule__CollectionSchema__DefinationAssignment_3_1_1 ) ) )
            // InternalMyDsl.g:963:1: ( ( rule__CollectionSchema__DefinationAssignment_3_1_1 ) )
            {
            // InternalMyDsl.g:963:1: ( ( rule__CollectionSchema__DefinationAssignment_3_1_1 ) )
            // InternalMyDsl.g:964:2: ( rule__CollectionSchema__DefinationAssignment_3_1_1 )
            {
             before(grammarAccess.getCollectionSchemaAccess().getDefinationAssignment_3_1_1()); 
            // InternalMyDsl.g:965:2: ( rule__CollectionSchema__DefinationAssignment_3_1_1 )
            // InternalMyDsl.g:965:3: rule__CollectionSchema__DefinationAssignment_3_1_1
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
    // InternalMyDsl.g:974:1: rule__CollectionFieldDefination__Group_0__0 : rule__CollectionFieldDefination__Group_0__0__Impl rule__CollectionFieldDefination__Group_0__1 ;
    public final void rule__CollectionFieldDefination__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:978:1: ( rule__CollectionFieldDefination__Group_0__0__Impl rule__CollectionFieldDefination__Group_0__1 )
            // InternalMyDsl.g:979:2: rule__CollectionFieldDefination__Group_0__0__Impl rule__CollectionFieldDefination__Group_0__1
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
    // InternalMyDsl.g:986:1: rule__CollectionFieldDefination__Group_0__0__Impl : ( ( rule__CollectionFieldDefination__NameAssignment_0_0 ) ) ;
    public final void rule__CollectionFieldDefination__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:990:1: ( ( ( rule__CollectionFieldDefination__NameAssignment_0_0 ) ) )
            // InternalMyDsl.g:991:1: ( ( rule__CollectionFieldDefination__NameAssignment_0_0 ) )
            {
            // InternalMyDsl.g:991:1: ( ( rule__CollectionFieldDefination__NameAssignment_0_0 ) )
            // InternalMyDsl.g:992:2: ( rule__CollectionFieldDefination__NameAssignment_0_0 )
            {
             before(grammarAccess.getCollectionFieldDefinationAccess().getNameAssignment_0_0()); 
            // InternalMyDsl.g:993:2: ( rule__CollectionFieldDefination__NameAssignment_0_0 )
            // InternalMyDsl.g:993:3: rule__CollectionFieldDefination__NameAssignment_0_0
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
    // InternalMyDsl.g:1001:1: rule__CollectionFieldDefination__Group_0__1 : rule__CollectionFieldDefination__Group_0__1__Impl rule__CollectionFieldDefination__Group_0__2 ;
    public final void rule__CollectionFieldDefination__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1005:1: ( rule__CollectionFieldDefination__Group_0__1__Impl rule__CollectionFieldDefination__Group_0__2 )
            // InternalMyDsl.g:1006:2: rule__CollectionFieldDefination__Group_0__1__Impl rule__CollectionFieldDefination__Group_0__2
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
    // InternalMyDsl.g:1013:1: rule__CollectionFieldDefination__Group_0__1__Impl : ( ':' ) ;
    public final void rule__CollectionFieldDefination__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1017:1: ( ( ':' ) )
            // InternalMyDsl.g:1018:1: ( ':' )
            {
            // InternalMyDsl.g:1018:1: ( ':' )
            // InternalMyDsl.g:1019:2: ':'
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
    // InternalMyDsl.g:1028:1: rule__CollectionFieldDefination__Group_0__2 : rule__CollectionFieldDefination__Group_0__2__Impl rule__CollectionFieldDefination__Group_0__3 ;
    public final void rule__CollectionFieldDefination__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1032:1: ( rule__CollectionFieldDefination__Group_0__2__Impl rule__CollectionFieldDefination__Group_0__3 )
            // InternalMyDsl.g:1033:2: rule__CollectionFieldDefination__Group_0__2__Impl rule__CollectionFieldDefination__Group_0__3
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
    // InternalMyDsl.g:1040:1: rule__CollectionFieldDefination__Group_0__2__Impl : ( ( rule__CollectionFieldDefination__FieldTypeAssignment_0_2 ) ) ;
    public final void rule__CollectionFieldDefination__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1044:1: ( ( ( rule__CollectionFieldDefination__FieldTypeAssignment_0_2 ) ) )
            // InternalMyDsl.g:1045:1: ( ( rule__CollectionFieldDefination__FieldTypeAssignment_0_2 ) )
            {
            // InternalMyDsl.g:1045:1: ( ( rule__CollectionFieldDefination__FieldTypeAssignment_0_2 ) )
            // InternalMyDsl.g:1046:2: ( rule__CollectionFieldDefination__FieldTypeAssignment_0_2 )
            {
             before(grammarAccess.getCollectionFieldDefinationAccess().getFieldTypeAssignment_0_2()); 
            // InternalMyDsl.g:1047:2: ( rule__CollectionFieldDefination__FieldTypeAssignment_0_2 )
            // InternalMyDsl.g:1047:3: rule__CollectionFieldDefination__FieldTypeAssignment_0_2
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
    // InternalMyDsl.g:1055:1: rule__CollectionFieldDefination__Group_0__3 : rule__CollectionFieldDefination__Group_0__3__Impl rule__CollectionFieldDefination__Group_0__4 ;
    public final void rule__CollectionFieldDefination__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1059:1: ( rule__CollectionFieldDefination__Group_0__3__Impl rule__CollectionFieldDefination__Group_0__4 )
            // InternalMyDsl.g:1060:2: rule__CollectionFieldDefination__Group_0__3__Impl rule__CollectionFieldDefination__Group_0__4
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
    // InternalMyDsl.g:1067:1: rule__CollectionFieldDefination__Group_0__3__Impl : ( ( rule__CollectionFieldDefination__StatusAssignment_0_3 )? ) ;
    public final void rule__CollectionFieldDefination__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1071:1: ( ( ( rule__CollectionFieldDefination__StatusAssignment_0_3 )? ) )
            // InternalMyDsl.g:1072:1: ( ( rule__CollectionFieldDefination__StatusAssignment_0_3 )? )
            {
            // InternalMyDsl.g:1072:1: ( ( rule__CollectionFieldDefination__StatusAssignment_0_3 )? )
            // InternalMyDsl.g:1073:2: ( rule__CollectionFieldDefination__StatusAssignment_0_3 )?
            {
             before(grammarAccess.getCollectionFieldDefinationAccess().getStatusAssignment_0_3()); 
            // InternalMyDsl.g:1074:2: ( rule__CollectionFieldDefination__StatusAssignment_0_3 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==33) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:1074:3: rule__CollectionFieldDefination__StatusAssignment_0_3
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
    // InternalMyDsl.g:1082:1: rule__CollectionFieldDefination__Group_0__4 : rule__CollectionFieldDefination__Group_0__4__Impl ;
    public final void rule__CollectionFieldDefination__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1086:1: ( rule__CollectionFieldDefination__Group_0__4__Impl )
            // InternalMyDsl.g:1087:2: rule__CollectionFieldDefination__Group_0__4__Impl
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
    // InternalMyDsl.g:1093:1: rule__CollectionFieldDefination__Group_0__4__Impl : ( ( rule__CollectionFieldDefination__UniqueKeyAssignment_0_4 )? ) ;
    public final void rule__CollectionFieldDefination__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1097:1: ( ( ( rule__CollectionFieldDefination__UniqueKeyAssignment_0_4 )? ) )
            // InternalMyDsl.g:1098:1: ( ( rule__CollectionFieldDefination__UniqueKeyAssignment_0_4 )? )
            {
            // InternalMyDsl.g:1098:1: ( ( rule__CollectionFieldDefination__UniqueKeyAssignment_0_4 )? )
            // InternalMyDsl.g:1099:2: ( rule__CollectionFieldDefination__UniqueKeyAssignment_0_4 )?
            {
             before(grammarAccess.getCollectionFieldDefinationAccess().getUniqueKeyAssignment_0_4()); 
            // InternalMyDsl.g:1100:2: ( rule__CollectionFieldDefination__UniqueKeyAssignment_0_4 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==34) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:1100:3: rule__CollectionFieldDefination__UniqueKeyAssignment_0_4
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
    // InternalMyDsl.g:1109:1: rule__CollectionFieldDefination__Group_1__0 : rule__CollectionFieldDefination__Group_1__0__Impl rule__CollectionFieldDefination__Group_1__1 ;
    public final void rule__CollectionFieldDefination__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1113:1: ( rule__CollectionFieldDefination__Group_1__0__Impl rule__CollectionFieldDefination__Group_1__1 )
            // InternalMyDsl.g:1114:2: rule__CollectionFieldDefination__Group_1__0__Impl rule__CollectionFieldDefination__Group_1__1
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
    // InternalMyDsl.g:1121:1: rule__CollectionFieldDefination__Group_1__0__Impl : ( ( rule__CollectionFieldDefination__NameAssignment_1_0 ) ) ;
    public final void rule__CollectionFieldDefination__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1125:1: ( ( ( rule__CollectionFieldDefination__NameAssignment_1_0 ) ) )
            // InternalMyDsl.g:1126:1: ( ( rule__CollectionFieldDefination__NameAssignment_1_0 ) )
            {
            // InternalMyDsl.g:1126:1: ( ( rule__CollectionFieldDefination__NameAssignment_1_0 ) )
            // InternalMyDsl.g:1127:2: ( rule__CollectionFieldDefination__NameAssignment_1_0 )
            {
             before(grammarAccess.getCollectionFieldDefinationAccess().getNameAssignment_1_0()); 
            // InternalMyDsl.g:1128:2: ( rule__CollectionFieldDefination__NameAssignment_1_0 )
            // InternalMyDsl.g:1128:3: rule__CollectionFieldDefination__NameAssignment_1_0
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
    // InternalMyDsl.g:1136:1: rule__CollectionFieldDefination__Group_1__1 : rule__CollectionFieldDefination__Group_1__1__Impl rule__CollectionFieldDefination__Group_1__2 ;
    public final void rule__CollectionFieldDefination__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1140:1: ( rule__CollectionFieldDefination__Group_1__1__Impl rule__CollectionFieldDefination__Group_1__2 )
            // InternalMyDsl.g:1141:2: rule__CollectionFieldDefination__Group_1__1__Impl rule__CollectionFieldDefination__Group_1__2
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
    // InternalMyDsl.g:1148:1: rule__CollectionFieldDefination__Group_1__1__Impl : ( ':' ) ;
    public final void rule__CollectionFieldDefination__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1152:1: ( ( ':' ) )
            // InternalMyDsl.g:1153:1: ( ':' )
            {
            // InternalMyDsl.g:1153:1: ( ':' )
            // InternalMyDsl.g:1154:2: ':'
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
    // InternalMyDsl.g:1163:1: rule__CollectionFieldDefination__Group_1__2 : rule__CollectionFieldDefination__Group_1__2__Impl rule__CollectionFieldDefination__Group_1__3 ;
    public final void rule__CollectionFieldDefination__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1167:1: ( rule__CollectionFieldDefination__Group_1__2__Impl rule__CollectionFieldDefination__Group_1__3 )
            // InternalMyDsl.g:1168:2: rule__CollectionFieldDefination__Group_1__2__Impl rule__CollectionFieldDefination__Group_1__3
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
    // InternalMyDsl.g:1175:1: rule__CollectionFieldDefination__Group_1__2__Impl : ( 'ref' ) ;
    public final void rule__CollectionFieldDefination__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1179:1: ( ( 'ref' ) )
            // InternalMyDsl.g:1180:1: ( 'ref' )
            {
            // InternalMyDsl.g:1180:1: ( 'ref' )
            // InternalMyDsl.g:1181:2: 'ref'
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
    // InternalMyDsl.g:1190:1: rule__CollectionFieldDefination__Group_1__3 : rule__CollectionFieldDefination__Group_1__3__Impl ;
    public final void rule__CollectionFieldDefination__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1194:1: ( rule__CollectionFieldDefination__Group_1__3__Impl )
            // InternalMyDsl.g:1195:2: rule__CollectionFieldDefination__Group_1__3__Impl
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
    // InternalMyDsl.g:1201:1: rule__CollectionFieldDefination__Group_1__3__Impl : ( ( rule__CollectionFieldDefination__RefCollectionAssignment_1_3 ) ) ;
    public final void rule__CollectionFieldDefination__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1205:1: ( ( ( rule__CollectionFieldDefination__RefCollectionAssignment_1_3 ) ) )
            // InternalMyDsl.g:1206:1: ( ( rule__CollectionFieldDefination__RefCollectionAssignment_1_3 ) )
            {
            // InternalMyDsl.g:1206:1: ( ( rule__CollectionFieldDefination__RefCollectionAssignment_1_3 ) )
            // InternalMyDsl.g:1207:2: ( rule__CollectionFieldDefination__RefCollectionAssignment_1_3 )
            {
             before(grammarAccess.getCollectionFieldDefinationAccess().getRefCollectionAssignment_1_3()); 
            // InternalMyDsl.g:1208:2: ( rule__CollectionFieldDefination__RefCollectionAssignment_1_3 )
            // InternalMyDsl.g:1208:3: rule__CollectionFieldDefination__RefCollectionAssignment_1_3
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
    // InternalMyDsl.g:1217:1: rule__CRUDOperations__Group_0__0 : rule__CRUDOperations__Group_0__0__Impl rule__CRUDOperations__Group_0__1 ;
    public final void rule__CRUDOperations__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1221:1: ( rule__CRUDOperations__Group_0__0__Impl rule__CRUDOperations__Group_0__1 )
            // InternalMyDsl.g:1222:2: rule__CRUDOperations__Group_0__0__Impl rule__CRUDOperations__Group_0__1
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
    // InternalMyDsl.g:1229:1: rule__CRUDOperations__Group_0__0__Impl : ( 'task' ) ;
    public final void rule__CRUDOperations__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1233:1: ( ( 'task' ) )
            // InternalMyDsl.g:1234:1: ( 'task' )
            {
            // InternalMyDsl.g:1234:1: ( 'task' )
            // InternalMyDsl.g:1235:2: 'task'
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
    // InternalMyDsl.g:1244:1: rule__CRUDOperations__Group_0__1 : rule__CRUDOperations__Group_0__1__Impl rule__CRUDOperations__Group_0__2 ;
    public final void rule__CRUDOperations__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1248:1: ( rule__CRUDOperations__Group_0__1__Impl rule__CRUDOperations__Group_0__2 )
            // InternalMyDsl.g:1249:2: rule__CRUDOperations__Group_0__1__Impl rule__CRUDOperations__Group_0__2
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
    // InternalMyDsl.g:1256:1: rule__CRUDOperations__Group_0__1__Impl : ( ( rule__CRUDOperations__NameAssignment_0_1 ) ) ;
    public final void rule__CRUDOperations__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1260:1: ( ( ( rule__CRUDOperations__NameAssignment_0_1 ) ) )
            // InternalMyDsl.g:1261:1: ( ( rule__CRUDOperations__NameAssignment_0_1 ) )
            {
            // InternalMyDsl.g:1261:1: ( ( rule__CRUDOperations__NameAssignment_0_1 ) )
            // InternalMyDsl.g:1262:2: ( rule__CRUDOperations__NameAssignment_0_1 )
            {
             before(grammarAccess.getCRUDOperationsAccess().getNameAssignment_0_1()); 
            // InternalMyDsl.g:1263:2: ( rule__CRUDOperations__NameAssignment_0_1 )
            // InternalMyDsl.g:1263:3: rule__CRUDOperations__NameAssignment_0_1
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
    // InternalMyDsl.g:1271:1: rule__CRUDOperations__Group_0__2 : rule__CRUDOperations__Group_0__2__Impl rule__CRUDOperations__Group_0__3 ;
    public final void rule__CRUDOperations__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1275:1: ( rule__CRUDOperations__Group_0__2__Impl rule__CRUDOperations__Group_0__3 )
            // InternalMyDsl.g:1276:2: rule__CRUDOperations__Group_0__2__Impl rule__CRUDOperations__Group_0__3
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
    // InternalMyDsl.g:1283:1: rule__CRUDOperations__Group_0__2__Impl : ( ':' ) ;
    public final void rule__CRUDOperations__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1287:1: ( ( ':' ) )
            // InternalMyDsl.g:1288:1: ( ':' )
            {
            // InternalMyDsl.g:1288:1: ( ':' )
            // InternalMyDsl.g:1289:2: ':'
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
    // InternalMyDsl.g:1298:1: rule__CRUDOperations__Group_0__3 : rule__CRUDOperations__Group_0__3__Impl ;
    public final void rule__CRUDOperations__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1302:1: ( rule__CRUDOperations__Group_0__3__Impl )
            // InternalMyDsl.g:1303:2: rule__CRUDOperations__Group_0__3__Impl
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
    // InternalMyDsl.g:1309:1: rule__CRUDOperations__Group_0__3__Impl : ( ( rule__CRUDOperations__Group_0_3__0 ) ) ;
    public final void rule__CRUDOperations__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1313:1: ( ( ( rule__CRUDOperations__Group_0_3__0 ) ) )
            // InternalMyDsl.g:1314:1: ( ( rule__CRUDOperations__Group_0_3__0 ) )
            {
            // InternalMyDsl.g:1314:1: ( ( rule__CRUDOperations__Group_0_3__0 ) )
            // InternalMyDsl.g:1315:2: ( rule__CRUDOperations__Group_0_3__0 )
            {
             before(grammarAccess.getCRUDOperationsAccess().getGroup_0_3()); 
            // InternalMyDsl.g:1316:2: ( rule__CRUDOperations__Group_0_3__0 )
            // InternalMyDsl.g:1316:3: rule__CRUDOperations__Group_0_3__0
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
    // InternalMyDsl.g:1325:1: rule__CRUDOperations__Group_0_3__0 : rule__CRUDOperations__Group_0_3__0__Impl rule__CRUDOperations__Group_0_3__1 ;
    public final void rule__CRUDOperations__Group_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1329:1: ( rule__CRUDOperations__Group_0_3__0__Impl rule__CRUDOperations__Group_0_3__1 )
            // InternalMyDsl.g:1330:2: rule__CRUDOperations__Group_0_3__0__Impl rule__CRUDOperations__Group_0_3__1
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
    // InternalMyDsl.g:1337:1: rule__CRUDOperations__Group_0_3__0__Impl : ( '{' ) ;
    public final void rule__CRUDOperations__Group_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1341:1: ( ( '{' ) )
            // InternalMyDsl.g:1342:1: ( '{' )
            {
            // InternalMyDsl.g:1342:1: ( '{' )
            // InternalMyDsl.g:1343:2: '{'
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
    // InternalMyDsl.g:1352:1: rule__CRUDOperations__Group_0_3__1 : rule__CRUDOperations__Group_0_3__1__Impl rule__CRUDOperations__Group_0_3__2 ;
    public final void rule__CRUDOperations__Group_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1356:1: ( rule__CRUDOperations__Group_0_3__1__Impl rule__CRUDOperations__Group_0_3__2 )
            // InternalMyDsl.g:1357:2: rule__CRUDOperations__Group_0_3__1__Impl rule__CRUDOperations__Group_0_3__2
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
    // InternalMyDsl.g:1364:1: rule__CRUDOperations__Group_0_3__1__Impl : ( 'operation:' ) ;
    public final void rule__CRUDOperations__Group_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1368:1: ( ( 'operation:' ) )
            // InternalMyDsl.g:1369:1: ( 'operation:' )
            {
            // InternalMyDsl.g:1369:1: ( 'operation:' )
            // InternalMyDsl.g:1370:2: 'operation:'
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
    // InternalMyDsl.g:1379:1: rule__CRUDOperations__Group_0_3__2 : rule__CRUDOperations__Group_0_3__2__Impl rule__CRUDOperations__Group_0_3__3 ;
    public final void rule__CRUDOperations__Group_0_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1383:1: ( rule__CRUDOperations__Group_0_3__2__Impl rule__CRUDOperations__Group_0_3__3 )
            // InternalMyDsl.g:1384:2: rule__CRUDOperations__Group_0_3__2__Impl rule__CRUDOperations__Group_0_3__3
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
    // InternalMyDsl.g:1391:1: rule__CRUDOperations__Group_0_3__2__Impl : ( ( rule__CRUDOperations__TypeAssignment_0_3_2 ) ) ;
    public final void rule__CRUDOperations__Group_0_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1395:1: ( ( ( rule__CRUDOperations__TypeAssignment_0_3_2 ) ) )
            // InternalMyDsl.g:1396:1: ( ( rule__CRUDOperations__TypeAssignment_0_3_2 ) )
            {
            // InternalMyDsl.g:1396:1: ( ( rule__CRUDOperations__TypeAssignment_0_3_2 ) )
            // InternalMyDsl.g:1397:2: ( rule__CRUDOperations__TypeAssignment_0_3_2 )
            {
             before(grammarAccess.getCRUDOperationsAccess().getTypeAssignment_0_3_2()); 
            // InternalMyDsl.g:1398:2: ( rule__CRUDOperations__TypeAssignment_0_3_2 )
            // InternalMyDsl.g:1398:3: rule__CRUDOperations__TypeAssignment_0_3_2
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
    // InternalMyDsl.g:1406:1: rule__CRUDOperations__Group_0_3__3 : rule__CRUDOperations__Group_0_3__3__Impl rule__CRUDOperations__Group_0_3__4 ;
    public final void rule__CRUDOperations__Group_0_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1410:1: ( rule__CRUDOperations__Group_0_3__3__Impl rule__CRUDOperations__Group_0_3__4 )
            // InternalMyDsl.g:1411:2: rule__CRUDOperations__Group_0_3__3__Impl rule__CRUDOperations__Group_0_3__4
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
    // InternalMyDsl.g:1418:1: rule__CRUDOperations__Group_0_3__3__Impl : ( ',' ) ;
    public final void rule__CRUDOperations__Group_0_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1422:1: ( ( ',' ) )
            // InternalMyDsl.g:1423:1: ( ',' )
            {
            // InternalMyDsl.g:1423:1: ( ',' )
            // InternalMyDsl.g:1424:2: ','
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
    // InternalMyDsl.g:1433:1: rule__CRUDOperations__Group_0_3__4 : rule__CRUDOperations__Group_0_3__4__Impl rule__CRUDOperations__Group_0_3__5 ;
    public final void rule__CRUDOperations__Group_0_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1437:1: ( rule__CRUDOperations__Group_0_3__4__Impl rule__CRUDOperations__Group_0_3__5 )
            // InternalMyDsl.g:1438:2: rule__CRUDOperations__Group_0_3__4__Impl rule__CRUDOperations__Group_0_3__5
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
    // InternalMyDsl.g:1445:1: rule__CRUDOperations__Group_0_3__4__Impl : ( 'collection:' ) ;
    public final void rule__CRUDOperations__Group_0_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1449:1: ( ( 'collection:' ) )
            // InternalMyDsl.g:1450:1: ( 'collection:' )
            {
            // InternalMyDsl.g:1450:1: ( 'collection:' )
            // InternalMyDsl.g:1451:2: 'collection:'
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
    // InternalMyDsl.g:1460:1: rule__CRUDOperations__Group_0_3__5 : rule__CRUDOperations__Group_0_3__5__Impl rule__CRUDOperations__Group_0_3__6 ;
    public final void rule__CRUDOperations__Group_0_3__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1464:1: ( rule__CRUDOperations__Group_0_3__5__Impl rule__CRUDOperations__Group_0_3__6 )
            // InternalMyDsl.g:1465:2: rule__CRUDOperations__Group_0_3__5__Impl rule__CRUDOperations__Group_0_3__6
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
    // InternalMyDsl.g:1472:1: rule__CRUDOperations__Group_0_3__5__Impl : ( ( rule__CRUDOperations__CollectionAssignment_0_3_5 ) ) ;
    public final void rule__CRUDOperations__Group_0_3__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1476:1: ( ( ( rule__CRUDOperations__CollectionAssignment_0_3_5 ) ) )
            // InternalMyDsl.g:1477:1: ( ( rule__CRUDOperations__CollectionAssignment_0_3_5 ) )
            {
            // InternalMyDsl.g:1477:1: ( ( rule__CRUDOperations__CollectionAssignment_0_3_5 ) )
            // InternalMyDsl.g:1478:2: ( rule__CRUDOperations__CollectionAssignment_0_3_5 )
            {
             before(grammarAccess.getCRUDOperationsAccess().getCollectionAssignment_0_3_5()); 
            // InternalMyDsl.g:1479:2: ( rule__CRUDOperations__CollectionAssignment_0_3_5 )
            // InternalMyDsl.g:1479:3: rule__CRUDOperations__CollectionAssignment_0_3_5
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
    // InternalMyDsl.g:1487:1: rule__CRUDOperations__Group_0_3__6 : rule__CRUDOperations__Group_0_3__6__Impl rule__CRUDOperations__Group_0_3__7 ;
    public final void rule__CRUDOperations__Group_0_3__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1491:1: ( rule__CRUDOperations__Group_0_3__6__Impl rule__CRUDOperations__Group_0_3__7 )
            // InternalMyDsl.g:1492:2: rule__CRUDOperations__Group_0_3__6__Impl rule__CRUDOperations__Group_0_3__7
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
    // InternalMyDsl.g:1499:1: rule__CRUDOperations__Group_0_3__6__Impl : ( 'input:' ) ;
    public final void rule__CRUDOperations__Group_0_3__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1503:1: ( ( 'input:' ) )
            // InternalMyDsl.g:1504:1: ( 'input:' )
            {
            // InternalMyDsl.g:1504:1: ( 'input:' )
            // InternalMyDsl.g:1505:2: 'input:'
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
    // InternalMyDsl.g:1514:1: rule__CRUDOperations__Group_0_3__7 : rule__CRUDOperations__Group_0_3__7__Impl rule__CRUDOperations__Group_0_3__8 ;
    public final void rule__CRUDOperations__Group_0_3__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1518:1: ( rule__CRUDOperations__Group_0_3__7__Impl rule__CRUDOperations__Group_0_3__8 )
            // InternalMyDsl.g:1519:2: rule__CRUDOperations__Group_0_3__7__Impl rule__CRUDOperations__Group_0_3__8
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
    // InternalMyDsl.g:1526:1: rule__CRUDOperations__Group_0_3__7__Impl : ( '{' ) ;
    public final void rule__CRUDOperations__Group_0_3__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1530:1: ( ( '{' ) )
            // InternalMyDsl.g:1531:1: ( '{' )
            {
            // InternalMyDsl.g:1531:1: ( '{' )
            // InternalMyDsl.g:1532:2: '{'
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
    // InternalMyDsl.g:1541:1: rule__CRUDOperations__Group_0_3__8 : rule__CRUDOperations__Group_0_3__8__Impl rule__CRUDOperations__Group_0_3__9 ;
    public final void rule__CRUDOperations__Group_0_3__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1545:1: ( rule__CRUDOperations__Group_0_3__8__Impl rule__CRUDOperations__Group_0_3__9 )
            // InternalMyDsl.g:1546:2: rule__CRUDOperations__Group_0_3__8__Impl rule__CRUDOperations__Group_0_3__9
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
    // InternalMyDsl.g:1553:1: rule__CRUDOperations__Group_0_3__8__Impl : ( ( rule__CRUDOperations__Group_0_3_8__0 )? ) ;
    public final void rule__CRUDOperations__Group_0_3__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1557:1: ( ( ( rule__CRUDOperations__Group_0_3_8__0 )? ) )
            // InternalMyDsl.g:1558:1: ( ( rule__CRUDOperations__Group_0_3_8__0 )? )
            {
            // InternalMyDsl.g:1558:1: ( ( rule__CRUDOperations__Group_0_3_8__0 )? )
            // InternalMyDsl.g:1559:2: ( rule__CRUDOperations__Group_0_3_8__0 )?
            {
             before(grammarAccess.getCRUDOperationsAccess().getGroup_0_3_8()); 
            // InternalMyDsl.g:1560:2: ( rule__CRUDOperations__Group_0_3_8__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:1560:3: rule__CRUDOperations__Group_0_3_8__0
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
    // InternalMyDsl.g:1568:1: rule__CRUDOperations__Group_0_3__9 : rule__CRUDOperations__Group_0_3__9__Impl rule__CRUDOperations__Group_0_3__10 ;
    public final void rule__CRUDOperations__Group_0_3__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1572:1: ( rule__CRUDOperations__Group_0_3__9__Impl rule__CRUDOperations__Group_0_3__10 )
            // InternalMyDsl.g:1573:2: rule__CRUDOperations__Group_0_3__9__Impl rule__CRUDOperations__Group_0_3__10
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
    // InternalMyDsl.g:1580:1: rule__CRUDOperations__Group_0_3__9__Impl : ( '}' ) ;
    public final void rule__CRUDOperations__Group_0_3__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1584:1: ( ( '}' ) )
            // InternalMyDsl.g:1585:1: ( '}' )
            {
            // InternalMyDsl.g:1585:1: ( '}' )
            // InternalMyDsl.g:1586:2: '}'
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
    // InternalMyDsl.g:1595:1: rule__CRUDOperations__Group_0_3__10 : rule__CRUDOperations__Group_0_3__10__Impl ;
    public final void rule__CRUDOperations__Group_0_3__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1599:1: ( rule__CRUDOperations__Group_0_3__10__Impl )
            // InternalMyDsl.g:1600:2: rule__CRUDOperations__Group_0_3__10__Impl
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
    // InternalMyDsl.g:1606:1: rule__CRUDOperations__Group_0_3__10__Impl : ( '}' ) ;
    public final void rule__CRUDOperations__Group_0_3__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1610:1: ( ( '}' ) )
            // InternalMyDsl.g:1611:1: ( '}' )
            {
            // InternalMyDsl.g:1611:1: ( '}' )
            // InternalMyDsl.g:1612:2: '}'
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
    // InternalMyDsl.g:1622:1: rule__CRUDOperations__Group_0_3_8__0 : rule__CRUDOperations__Group_0_3_8__0__Impl rule__CRUDOperations__Group_0_3_8__1 ;
    public final void rule__CRUDOperations__Group_0_3_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1626:1: ( rule__CRUDOperations__Group_0_3_8__0__Impl rule__CRUDOperations__Group_0_3_8__1 )
            // InternalMyDsl.g:1627:2: rule__CRUDOperations__Group_0_3_8__0__Impl rule__CRUDOperations__Group_0_3_8__1
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
    // InternalMyDsl.g:1634:1: rule__CRUDOperations__Group_0_3_8__0__Impl : ( ( rule__CRUDOperations__EntriesAssignment_0_3_8_0 ) ) ;
    public final void rule__CRUDOperations__Group_0_3_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1638:1: ( ( ( rule__CRUDOperations__EntriesAssignment_0_3_8_0 ) ) )
            // InternalMyDsl.g:1639:1: ( ( rule__CRUDOperations__EntriesAssignment_0_3_8_0 ) )
            {
            // InternalMyDsl.g:1639:1: ( ( rule__CRUDOperations__EntriesAssignment_0_3_8_0 ) )
            // InternalMyDsl.g:1640:2: ( rule__CRUDOperations__EntriesAssignment_0_3_8_0 )
            {
             before(grammarAccess.getCRUDOperationsAccess().getEntriesAssignment_0_3_8_0()); 
            // InternalMyDsl.g:1641:2: ( rule__CRUDOperations__EntriesAssignment_0_3_8_0 )
            // InternalMyDsl.g:1641:3: rule__CRUDOperations__EntriesAssignment_0_3_8_0
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
    // InternalMyDsl.g:1649:1: rule__CRUDOperations__Group_0_3_8__1 : rule__CRUDOperations__Group_0_3_8__1__Impl ;
    public final void rule__CRUDOperations__Group_0_3_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1653:1: ( rule__CRUDOperations__Group_0_3_8__1__Impl )
            // InternalMyDsl.g:1654:2: rule__CRUDOperations__Group_0_3_8__1__Impl
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
    // InternalMyDsl.g:1660:1: rule__CRUDOperations__Group_0_3_8__1__Impl : ( ( rule__CRUDOperations__Group_0_3_8_1__0 )* ) ;
    public final void rule__CRUDOperations__Group_0_3_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1664:1: ( ( ( rule__CRUDOperations__Group_0_3_8_1__0 )* ) )
            // InternalMyDsl.g:1665:1: ( ( rule__CRUDOperations__Group_0_3_8_1__0 )* )
            {
            // InternalMyDsl.g:1665:1: ( ( rule__CRUDOperations__Group_0_3_8_1__0 )* )
            // InternalMyDsl.g:1666:2: ( rule__CRUDOperations__Group_0_3_8_1__0 )*
            {
             before(grammarAccess.getCRUDOperationsAccess().getGroup_0_3_8_1()); 
            // InternalMyDsl.g:1667:2: ( rule__CRUDOperations__Group_0_3_8_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==21) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMyDsl.g:1667:3: rule__CRUDOperations__Group_0_3_8_1__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__CRUDOperations__Group_0_3_8_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalMyDsl.g:1676:1: rule__CRUDOperations__Group_0_3_8_1__0 : rule__CRUDOperations__Group_0_3_8_1__0__Impl rule__CRUDOperations__Group_0_3_8_1__1 ;
    public final void rule__CRUDOperations__Group_0_3_8_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1680:1: ( rule__CRUDOperations__Group_0_3_8_1__0__Impl rule__CRUDOperations__Group_0_3_8_1__1 )
            // InternalMyDsl.g:1681:2: rule__CRUDOperations__Group_0_3_8_1__0__Impl rule__CRUDOperations__Group_0_3_8_1__1
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
    // InternalMyDsl.g:1688:1: rule__CRUDOperations__Group_0_3_8_1__0__Impl : ( ',' ) ;
    public final void rule__CRUDOperations__Group_0_3_8_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1692:1: ( ( ',' ) )
            // InternalMyDsl.g:1693:1: ( ',' )
            {
            // InternalMyDsl.g:1693:1: ( ',' )
            // InternalMyDsl.g:1694:2: ','
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
    // InternalMyDsl.g:1703:1: rule__CRUDOperations__Group_0_3_8_1__1 : rule__CRUDOperations__Group_0_3_8_1__1__Impl ;
    public final void rule__CRUDOperations__Group_0_3_8_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1707:1: ( rule__CRUDOperations__Group_0_3_8_1__1__Impl )
            // InternalMyDsl.g:1708:2: rule__CRUDOperations__Group_0_3_8_1__1__Impl
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
    // InternalMyDsl.g:1714:1: rule__CRUDOperations__Group_0_3_8_1__1__Impl : ( ( rule__CRUDOperations__EntriesAssignment_0_3_8_1_1 ) ) ;
    public final void rule__CRUDOperations__Group_0_3_8_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1718:1: ( ( ( rule__CRUDOperations__EntriesAssignment_0_3_8_1_1 ) ) )
            // InternalMyDsl.g:1719:1: ( ( rule__CRUDOperations__EntriesAssignment_0_3_8_1_1 ) )
            {
            // InternalMyDsl.g:1719:1: ( ( rule__CRUDOperations__EntriesAssignment_0_3_8_1_1 ) )
            // InternalMyDsl.g:1720:2: ( rule__CRUDOperations__EntriesAssignment_0_3_8_1_1 )
            {
             before(grammarAccess.getCRUDOperationsAccess().getEntriesAssignment_0_3_8_1_1()); 
            // InternalMyDsl.g:1721:2: ( rule__CRUDOperations__EntriesAssignment_0_3_8_1_1 )
            // InternalMyDsl.g:1721:3: rule__CRUDOperations__EntriesAssignment_0_3_8_1_1
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
    // InternalMyDsl.g:1730:1: rule__CRUDOperations__Group_1__0 : rule__CRUDOperations__Group_1__0__Impl rule__CRUDOperations__Group_1__1 ;
    public final void rule__CRUDOperations__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1734:1: ( rule__CRUDOperations__Group_1__0__Impl rule__CRUDOperations__Group_1__1 )
            // InternalMyDsl.g:1735:2: rule__CRUDOperations__Group_1__0__Impl rule__CRUDOperations__Group_1__1
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
    // InternalMyDsl.g:1742:1: rule__CRUDOperations__Group_1__0__Impl : ( 'task' ) ;
    public final void rule__CRUDOperations__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1746:1: ( ( 'task' ) )
            // InternalMyDsl.g:1747:1: ( 'task' )
            {
            // InternalMyDsl.g:1747:1: ( 'task' )
            // InternalMyDsl.g:1748:2: 'task'
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
    // InternalMyDsl.g:1757:1: rule__CRUDOperations__Group_1__1 : rule__CRUDOperations__Group_1__1__Impl rule__CRUDOperations__Group_1__2 ;
    public final void rule__CRUDOperations__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1761:1: ( rule__CRUDOperations__Group_1__1__Impl rule__CRUDOperations__Group_1__2 )
            // InternalMyDsl.g:1762:2: rule__CRUDOperations__Group_1__1__Impl rule__CRUDOperations__Group_1__2
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
    // InternalMyDsl.g:1769:1: rule__CRUDOperations__Group_1__1__Impl : ( ( rule__CRUDOperations__NameAssignment_1_1 ) ) ;
    public final void rule__CRUDOperations__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1773:1: ( ( ( rule__CRUDOperations__NameAssignment_1_1 ) ) )
            // InternalMyDsl.g:1774:1: ( ( rule__CRUDOperations__NameAssignment_1_1 ) )
            {
            // InternalMyDsl.g:1774:1: ( ( rule__CRUDOperations__NameAssignment_1_1 ) )
            // InternalMyDsl.g:1775:2: ( rule__CRUDOperations__NameAssignment_1_1 )
            {
             before(grammarAccess.getCRUDOperationsAccess().getNameAssignment_1_1()); 
            // InternalMyDsl.g:1776:2: ( rule__CRUDOperations__NameAssignment_1_1 )
            // InternalMyDsl.g:1776:3: rule__CRUDOperations__NameAssignment_1_1
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
    // InternalMyDsl.g:1784:1: rule__CRUDOperations__Group_1__2 : rule__CRUDOperations__Group_1__2__Impl rule__CRUDOperations__Group_1__3 ;
    public final void rule__CRUDOperations__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1788:1: ( rule__CRUDOperations__Group_1__2__Impl rule__CRUDOperations__Group_1__3 )
            // InternalMyDsl.g:1789:2: rule__CRUDOperations__Group_1__2__Impl rule__CRUDOperations__Group_1__3
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
    // InternalMyDsl.g:1796:1: rule__CRUDOperations__Group_1__2__Impl : ( ':' ) ;
    public final void rule__CRUDOperations__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1800:1: ( ( ':' ) )
            // InternalMyDsl.g:1801:1: ( ':' )
            {
            // InternalMyDsl.g:1801:1: ( ':' )
            // InternalMyDsl.g:1802:2: ':'
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
    // InternalMyDsl.g:1811:1: rule__CRUDOperations__Group_1__3 : rule__CRUDOperations__Group_1__3__Impl ;
    public final void rule__CRUDOperations__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1815:1: ( rule__CRUDOperations__Group_1__3__Impl )
            // InternalMyDsl.g:1816:2: rule__CRUDOperations__Group_1__3__Impl
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
    // InternalMyDsl.g:1822:1: rule__CRUDOperations__Group_1__3__Impl : ( ( rule__CRUDOperations__Group_1_3__0 ) ) ;
    public final void rule__CRUDOperations__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1826:1: ( ( ( rule__CRUDOperations__Group_1_3__0 ) ) )
            // InternalMyDsl.g:1827:1: ( ( rule__CRUDOperations__Group_1_3__0 ) )
            {
            // InternalMyDsl.g:1827:1: ( ( rule__CRUDOperations__Group_1_3__0 ) )
            // InternalMyDsl.g:1828:2: ( rule__CRUDOperations__Group_1_3__0 )
            {
             before(grammarAccess.getCRUDOperationsAccess().getGroup_1_3()); 
            // InternalMyDsl.g:1829:2: ( rule__CRUDOperations__Group_1_3__0 )
            // InternalMyDsl.g:1829:3: rule__CRUDOperations__Group_1_3__0
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
    // InternalMyDsl.g:1838:1: rule__CRUDOperations__Group_1_3__0 : rule__CRUDOperations__Group_1_3__0__Impl rule__CRUDOperations__Group_1_3__1 ;
    public final void rule__CRUDOperations__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1842:1: ( rule__CRUDOperations__Group_1_3__0__Impl rule__CRUDOperations__Group_1_3__1 )
            // InternalMyDsl.g:1843:2: rule__CRUDOperations__Group_1_3__0__Impl rule__CRUDOperations__Group_1_3__1
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
    // InternalMyDsl.g:1850:1: rule__CRUDOperations__Group_1_3__0__Impl : ( '{' ) ;
    public final void rule__CRUDOperations__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1854:1: ( ( '{' ) )
            // InternalMyDsl.g:1855:1: ( '{' )
            {
            // InternalMyDsl.g:1855:1: ( '{' )
            // InternalMyDsl.g:1856:2: '{'
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
    // InternalMyDsl.g:1865:1: rule__CRUDOperations__Group_1_3__1 : rule__CRUDOperations__Group_1_3__1__Impl rule__CRUDOperations__Group_1_3__2 ;
    public final void rule__CRUDOperations__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1869:1: ( rule__CRUDOperations__Group_1_3__1__Impl rule__CRUDOperations__Group_1_3__2 )
            // InternalMyDsl.g:1870:2: rule__CRUDOperations__Group_1_3__1__Impl rule__CRUDOperations__Group_1_3__2
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
    // InternalMyDsl.g:1877:1: rule__CRUDOperations__Group_1_3__1__Impl : ( 'operation:' ) ;
    public final void rule__CRUDOperations__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1881:1: ( ( 'operation:' ) )
            // InternalMyDsl.g:1882:1: ( 'operation:' )
            {
            // InternalMyDsl.g:1882:1: ( 'operation:' )
            // InternalMyDsl.g:1883:2: 'operation:'
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
    // InternalMyDsl.g:1892:1: rule__CRUDOperations__Group_1_3__2 : rule__CRUDOperations__Group_1_3__2__Impl rule__CRUDOperations__Group_1_3__3 ;
    public final void rule__CRUDOperations__Group_1_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1896:1: ( rule__CRUDOperations__Group_1_3__2__Impl rule__CRUDOperations__Group_1_3__3 )
            // InternalMyDsl.g:1897:2: rule__CRUDOperations__Group_1_3__2__Impl rule__CRUDOperations__Group_1_3__3
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
    // InternalMyDsl.g:1904:1: rule__CRUDOperations__Group_1_3__2__Impl : ( ( rule__CRUDOperations__UpdateOperationAssignment_1_3_2 ) ) ;
    public final void rule__CRUDOperations__Group_1_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1908:1: ( ( ( rule__CRUDOperations__UpdateOperationAssignment_1_3_2 ) ) )
            // InternalMyDsl.g:1909:1: ( ( rule__CRUDOperations__UpdateOperationAssignment_1_3_2 ) )
            {
            // InternalMyDsl.g:1909:1: ( ( rule__CRUDOperations__UpdateOperationAssignment_1_3_2 ) )
            // InternalMyDsl.g:1910:2: ( rule__CRUDOperations__UpdateOperationAssignment_1_3_2 )
            {
             before(grammarAccess.getCRUDOperationsAccess().getUpdateOperationAssignment_1_3_2()); 
            // InternalMyDsl.g:1911:2: ( rule__CRUDOperations__UpdateOperationAssignment_1_3_2 )
            // InternalMyDsl.g:1911:3: rule__CRUDOperations__UpdateOperationAssignment_1_3_2
            {
            pushFollow(FOLLOW_2);
            rule__CRUDOperations__UpdateOperationAssignment_1_3_2();

            state._fsp--;


            }

             after(grammarAccess.getCRUDOperationsAccess().getUpdateOperationAssignment_1_3_2()); 

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
    // InternalMyDsl.g:1919:1: rule__CRUDOperations__Group_1_3__3 : rule__CRUDOperations__Group_1_3__3__Impl rule__CRUDOperations__Group_1_3__4 ;
    public final void rule__CRUDOperations__Group_1_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1923:1: ( rule__CRUDOperations__Group_1_3__3__Impl rule__CRUDOperations__Group_1_3__4 )
            // InternalMyDsl.g:1924:2: rule__CRUDOperations__Group_1_3__3__Impl rule__CRUDOperations__Group_1_3__4
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
    // InternalMyDsl.g:1931:1: rule__CRUDOperations__Group_1_3__3__Impl : ( 'collection:' ) ;
    public final void rule__CRUDOperations__Group_1_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1935:1: ( ( 'collection:' ) )
            // InternalMyDsl.g:1936:1: ( 'collection:' )
            {
            // InternalMyDsl.g:1936:1: ( 'collection:' )
            // InternalMyDsl.g:1937:2: 'collection:'
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
    // InternalMyDsl.g:1946:1: rule__CRUDOperations__Group_1_3__4 : rule__CRUDOperations__Group_1_3__4__Impl rule__CRUDOperations__Group_1_3__5 ;
    public final void rule__CRUDOperations__Group_1_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1950:1: ( rule__CRUDOperations__Group_1_3__4__Impl rule__CRUDOperations__Group_1_3__5 )
            // InternalMyDsl.g:1951:2: rule__CRUDOperations__Group_1_3__4__Impl rule__CRUDOperations__Group_1_3__5
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
    // InternalMyDsl.g:1958:1: rule__CRUDOperations__Group_1_3__4__Impl : ( ( rule__CRUDOperations__CollectionAssignment_1_3_4 ) ) ;
    public final void rule__CRUDOperations__Group_1_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1962:1: ( ( ( rule__CRUDOperations__CollectionAssignment_1_3_4 ) ) )
            // InternalMyDsl.g:1963:1: ( ( rule__CRUDOperations__CollectionAssignment_1_3_4 ) )
            {
            // InternalMyDsl.g:1963:1: ( ( rule__CRUDOperations__CollectionAssignment_1_3_4 ) )
            // InternalMyDsl.g:1964:2: ( rule__CRUDOperations__CollectionAssignment_1_3_4 )
            {
             before(grammarAccess.getCRUDOperationsAccess().getCollectionAssignment_1_3_4()); 
            // InternalMyDsl.g:1965:2: ( rule__CRUDOperations__CollectionAssignment_1_3_4 )
            // InternalMyDsl.g:1965:3: rule__CRUDOperations__CollectionAssignment_1_3_4
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
    // InternalMyDsl.g:1973:1: rule__CRUDOperations__Group_1_3__5 : rule__CRUDOperations__Group_1_3__5__Impl rule__CRUDOperations__Group_1_3__6 ;
    public final void rule__CRUDOperations__Group_1_3__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1977:1: ( rule__CRUDOperations__Group_1_3__5__Impl rule__CRUDOperations__Group_1_3__6 )
            // InternalMyDsl.g:1978:2: rule__CRUDOperations__Group_1_3__5__Impl rule__CRUDOperations__Group_1_3__6
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
    // InternalMyDsl.g:1985:1: rule__CRUDOperations__Group_1_3__5__Impl : ( 'input:' ) ;
    public final void rule__CRUDOperations__Group_1_3__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1989:1: ( ( 'input:' ) )
            // InternalMyDsl.g:1990:1: ( 'input:' )
            {
            // InternalMyDsl.g:1990:1: ( 'input:' )
            // InternalMyDsl.g:1991:2: 'input:'
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
    // InternalMyDsl.g:2000:1: rule__CRUDOperations__Group_1_3__6 : rule__CRUDOperations__Group_1_3__6__Impl rule__CRUDOperations__Group_1_3__7 ;
    public final void rule__CRUDOperations__Group_1_3__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2004:1: ( rule__CRUDOperations__Group_1_3__6__Impl rule__CRUDOperations__Group_1_3__7 )
            // InternalMyDsl.g:2005:2: rule__CRUDOperations__Group_1_3__6__Impl rule__CRUDOperations__Group_1_3__7
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
    // InternalMyDsl.g:2012:1: rule__CRUDOperations__Group_1_3__6__Impl : ( '{' ) ;
    public final void rule__CRUDOperations__Group_1_3__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2016:1: ( ( '{' ) )
            // InternalMyDsl.g:2017:1: ( '{' )
            {
            // InternalMyDsl.g:2017:1: ( '{' )
            // InternalMyDsl.g:2018:2: '{'
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
    // InternalMyDsl.g:2027:1: rule__CRUDOperations__Group_1_3__7 : rule__CRUDOperations__Group_1_3__7__Impl rule__CRUDOperations__Group_1_3__8 ;
    public final void rule__CRUDOperations__Group_1_3__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2031:1: ( rule__CRUDOperations__Group_1_3__7__Impl rule__CRUDOperations__Group_1_3__8 )
            // InternalMyDsl.g:2032:2: rule__CRUDOperations__Group_1_3__7__Impl rule__CRUDOperations__Group_1_3__8
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
    // InternalMyDsl.g:2039:1: rule__CRUDOperations__Group_1_3__7__Impl : ( ( rule__CRUDOperations__CriteriaAssignment_1_3_7 ) ) ;
    public final void rule__CRUDOperations__Group_1_3__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2043:1: ( ( ( rule__CRUDOperations__CriteriaAssignment_1_3_7 ) ) )
            // InternalMyDsl.g:2044:1: ( ( rule__CRUDOperations__CriteriaAssignment_1_3_7 ) )
            {
            // InternalMyDsl.g:2044:1: ( ( rule__CRUDOperations__CriteriaAssignment_1_3_7 ) )
            // InternalMyDsl.g:2045:2: ( rule__CRUDOperations__CriteriaAssignment_1_3_7 )
            {
             before(grammarAccess.getCRUDOperationsAccess().getCriteriaAssignment_1_3_7()); 
            // InternalMyDsl.g:2046:2: ( rule__CRUDOperations__CriteriaAssignment_1_3_7 )
            // InternalMyDsl.g:2046:3: rule__CRUDOperations__CriteriaAssignment_1_3_7
            {
            pushFollow(FOLLOW_2);
            rule__CRUDOperations__CriteriaAssignment_1_3_7();

            state._fsp--;


            }

             after(grammarAccess.getCRUDOperationsAccess().getCriteriaAssignment_1_3_7()); 

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
    // InternalMyDsl.g:2054:1: rule__CRUDOperations__Group_1_3__8 : rule__CRUDOperations__Group_1_3__8__Impl rule__CRUDOperations__Group_1_3__9 ;
    public final void rule__CRUDOperations__Group_1_3__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2058:1: ( rule__CRUDOperations__Group_1_3__8__Impl rule__CRUDOperations__Group_1_3__9 )
            // InternalMyDsl.g:2059:2: rule__CRUDOperations__Group_1_3__8__Impl rule__CRUDOperations__Group_1_3__9
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
    // InternalMyDsl.g:2066:1: rule__CRUDOperations__Group_1_3__8__Impl : ( ( rule__CRUDOperations__Group_1_3_8__0 )* ) ;
    public final void rule__CRUDOperations__Group_1_3__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2070:1: ( ( ( rule__CRUDOperations__Group_1_3_8__0 )* ) )
            // InternalMyDsl.g:2071:1: ( ( rule__CRUDOperations__Group_1_3_8__0 )* )
            {
            // InternalMyDsl.g:2071:1: ( ( rule__CRUDOperations__Group_1_3_8__0 )* )
            // InternalMyDsl.g:2072:2: ( rule__CRUDOperations__Group_1_3_8__0 )*
            {
             before(grammarAccess.getCRUDOperationsAccess().getGroup_1_3_8()); 
            // InternalMyDsl.g:2073:2: ( rule__CRUDOperations__Group_1_3_8__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==21) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMyDsl.g:2073:3: rule__CRUDOperations__Group_1_3_8__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__CRUDOperations__Group_1_3_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalMyDsl.g:2081:1: rule__CRUDOperations__Group_1_3__9 : rule__CRUDOperations__Group_1_3__9__Impl rule__CRUDOperations__Group_1_3__10 ;
    public final void rule__CRUDOperations__Group_1_3__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2085:1: ( rule__CRUDOperations__Group_1_3__9__Impl rule__CRUDOperations__Group_1_3__10 )
            // InternalMyDsl.g:2086:2: rule__CRUDOperations__Group_1_3__9__Impl rule__CRUDOperations__Group_1_3__10
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
    // InternalMyDsl.g:2093:1: rule__CRUDOperations__Group_1_3__9__Impl : ( '},' ) ;
    public final void rule__CRUDOperations__Group_1_3__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2097:1: ( ( '},' ) )
            // InternalMyDsl.g:2098:1: ( '},' )
            {
            // InternalMyDsl.g:2098:1: ( '},' )
            // InternalMyDsl.g:2099:2: '},'
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
    // InternalMyDsl.g:2108:1: rule__CRUDOperations__Group_1_3__10 : rule__CRUDOperations__Group_1_3__10__Impl rule__CRUDOperations__Group_1_3__11 ;
    public final void rule__CRUDOperations__Group_1_3__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2112:1: ( rule__CRUDOperations__Group_1_3__10__Impl rule__CRUDOperations__Group_1_3__11 )
            // InternalMyDsl.g:2113:2: rule__CRUDOperations__Group_1_3__10__Impl rule__CRUDOperations__Group_1_3__11
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
    // InternalMyDsl.g:2120:1: rule__CRUDOperations__Group_1_3__10__Impl : ( 'update:' ) ;
    public final void rule__CRUDOperations__Group_1_3__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2124:1: ( ( 'update:' ) )
            // InternalMyDsl.g:2125:1: ( 'update:' )
            {
            // InternalMyDsl.g:2125:1: ( 'update:' )
            // InternalMyDsl.g:2126:2: 'update:'
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
    // InternalMyDsl.g:2135:1: rule__CRUDOperations__Group_1_3__11 : rule__CRUDOperations__Group_1_3__11__Impl rule__CRUDOperations__Group_1_3__12 ;
    public final void rule__CRUDOperations__Group_1_3__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2139:1: ( rule__CRUDOperations__Group_1_3__11__Impl rule__CRUDOperations__Group_1_3__12 )
            // InternalMyDsl.g:2140:2: rule__CRUDOperations__Group_1_3__11__Impl rule__CRUDOperations__Group_1_3__12
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
    // InternalMyDsl.g:2147:1: rule__CRUDOperations__Group_1_3__11__Impl : ( '{' ) ;
    public final void rule__CRUDOperations__Group_1_3__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2151:1: ( ( '{' ) )
            // InternalMyDsl.g:2152:1: ( '{' )
            {
            // InternalMyDsl.g:2152:1: ( '{' )
            // InternalMyDsl.g:2153:2: '{'
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
    // InternalMyDsl.g:2162:1: rule__CRUDOperations__Group_1_3__12 : rule__CRUDOperations__Group_1_3__12__Impl rule__CRUDOperations__Group_1_3__13 ;
    public final void rule__CRUDOperations__Group_1_3__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2166:1: ( rule__CRUDOperations__Group_1_3__12__Impl rule__CRUDOperations__Group_1_3__13 )
            // InternalMyDsl.g:2167:2: rule__CRUDOperations__Group_1_3__12__Impl rule__CRUDOperations__Group_1_3__13
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
    // InternalMyDsl.g:2174:1: rule__CRUDOperations__Group_1_3__12__Impl : ( ( rule__CRUDOperations__EntriesAssignment_1_3_12 ) ) ;
    public final void rule__CRUDOperations__Group_1_3__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2178:1: ( ( ( rule__CRUDOperations__EntriesAssignment_1_3_12 ) ) )
            // InternalMyDsl.g:2179:1: ( ( rule__CRUDOperations__EntriesAssignment_1_3_12 ) )
            {
            // InternalMyDsl.g:2179:1: ( ( rule__CRUDOperations__EntriesAssignment_1_3_12 ) )
            // InternalMyDsl.g:2180:2: ( rule__CRUDOperations__EntriesAssignment_1_3_12 )
            {
             before(grammarAccess.getCRUDOperationsAccess().getEntriesAssignment_1_3_12()); 
            // InternalMyDsl.g:2181:2: ( rule__CRUDOperations__EntriesAssignment_1_3_12 )
            // InternalMyDsl.g:2181:3: rule__CRUDOperations__EntriesAssignment_1_3_12
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
    // InternalMyDsl.g:2189:1: rule__CRUDOperations__Group_1_3__13 : rule__CRUDOperations__Group_1_3__13__Impl rule__CRUDOperations__Group_1_3__14 ;
    public final void rule__CRUDOperations__Group_1_3__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2193:1: ( rule__CRUDOperations__Group_1_3__13__Impl rule__CRUDOperations__Group_1_3__14 )
            // InternalMyDsl.g:2194:2: rule__CRUDOperations__Group_1_3__13__Impl rule__CRUDOperations__Group_1_3__14
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
    // InternalMyDsl.g:2201:1: rule__CRUDOperations__Group_1_3__13__Impl : ( ( rule__CRUDOperations__Group_1_3_13__0 )* ) ;
    public final void rule__CRUDOperations__Group_1_3__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2205:1: ( ( ( rule__CRUDOperations__Group_1_3_13__0 )* ) )
            // InternalMyDsl.g:2206:1: ( ( rule__CRUDOperations__Group_1_3_13__0 )* )
            {
            // InternalMyDsl.g:2206:1: ( ( rule__CRUDOperations__Group_1_3_13__0 )* )
            // InternalMyDsl.g:2207:2: ( rule__CRUDOperations__Group_1_3_13__0 )*
            {
             before(grammarAccess.getCRUDOperationsAccess().getGroup_1_3_13()); 
            // InternalMyDsl.g:2208:2: ( rule__CRUDOperations__Group_1_3_13__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==21) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalMyDsl.g:2208:3: rule__CRUDOperations__Group_1_3_13__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__CRUDOperations__Group_1_3_13__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalMyDsl.g:2216:1: rule__CRUDOperations__Group_1_3__14 : rule__CRUDOperations__Group_1_3__14__Impl rule__CRUDOperations__Group_1_3__15 ;
    public final void rule__CRUDOperations__Group_1_3__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2220:1: ( rule__CRUDOperations__Group_1_3__14__Impl rule__CRUDOperations__Group_1_3__15 )
            // InternalMyDsl.g:2221:2: rule__CRUDOperations__Group_1_3__14__Impl rule__CRUDOperations__Group_1_3__15
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
    // InternalMyDsl.g:2228:1: rule__CRUDOperations__Group_1_3__14__Impl : ( '}' ) ;
    public final void rule__CRUDOperations__Group_1_3__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2232:1: ( ( '}' ) )
            // InternalMyDsl.g:2233:1: ( '}' )
            {
            // InternalMyDsl.g:2233:1: ( '}' )
            // InternalMyDsl.g:2234:2: '}'
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
    // InternalMyDsl.g:2243:1: rule__CRUDOperations__Group_1_3__15 : rule__CRUDOperations__Group_1_3__15__Impl ;
    public final void rule__CRUDOperations__Group_1_3__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2247:1: ( rule__CRUDOperations__Group_1_3__15__Impl )
            // InternalMyDsl.g:2248:2: rule__CRUDOperations__Group_1_3__15__Impl
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
    // InternalMyDsl.g:2254:1: rule__CRUDOperations__Group_1_3__15__Impl : ( '}' ) ;
    public final void rule__CRUDOperations__Group_1_3__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2258:1: ( ( '}' ) )
            // InternalMyDsl.g:2259:1: ( '}' )
            {
            // InternalMyDsl.g:2259:1: ( '}' )
            // InternalMyDsl.g:2260:2: '}'
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
    // InternalMyDsl.g:2270:1: rule__CRUDOperations__Group_1_3_8__0 : rule__CRUDOperations__Group_1_3_8__0__Impl rule__CRUDOperations__Group_1_3_8__1 ;
    public final void rule__CRUDOperations__Group_1_3_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2274:1: ( rule__CRUDOperations__Group_1_3_8__0__Impl rule__CRUDOperations__Group_1_3_8__1 )
            // InternalMyDsl.g:2275:2: rule__CRUDOperations__Group_1_3_8__0__Impl rule__CRUDOperations__Group_1_3_8__1
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
    // InternalMyDsl.g:2282:1: rule__CRUDOperations__Group_1_3_8__0__Impl : ( ',' ) ;
    public final void rule__CRUDOperations__Group_1_3_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2286:1: ( ( ',' ) )
            // InternalMyDsl.g:2287:1: ( ',' )
            {
            // InternalMyDsl.g:2287:1: ( ',' )
            // InternalMyDsl.g:2288:2: ','
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
    // InternalMyDsl.g:2297:1: rule__CRUDOperations__Group_1_3_8__1 : rule__CRUDOperations__Group_1_3_8__1__Impl ;
    public final void rule__CRUDOperations__Group_1_3_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2301:1: ( rule__CRUDOperations__Group_1_3_8__1__Impl )
            // InternalMyDsl.g:2302:2: rule__CRUDOperations__Group_1_3_8__1__Impl
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
    // InternalMyDsl.g:2308:1: rule__CRUDOperations__Group_1_3_8__1__Impl : ( ( rule__CRUDOperations__CriteriaAssignment_1_3_8_1 ) ) ;
    public final void rule__CRUDOperations__Group_1_3_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2312:1: ( ( ( rule__CRUDOperations__CriteriaAssignment_1_3_8_1 ) ) )
            // InternalMyDsl.g:2313:1: ( ( rule__CRUDOperations__CriteriaAssignment_1_3_8_1 ) )
            {
            // InternalMyDsl.g:2313:1: ( ( rule__CRUDOperations__CriteriaAssignment_1_3_8_1 ) )
            // InternalMyDsl.g:2314:2: ( rule__CRUDOperations__CriteriaAssignment_1_3_8_1 )
            {
             before(grammarAccess.getCRUDOperationsAccess().getCriteriaAssignment_1_3_8_1()); 
            // InternalMyDsl.g:2315:2: ( rule__CRUDOperations__CriteriaAssignment_1_3_8_1 )
            // InternalMyDsl.g:2315:3: rule__CRUDOperations__CriteriaAssignment_1_3_8_1
            {
            pushFollow(FOLLOW_2);
            rule__CRUDOperations__CriteriaAssignment_1_3_8_1();

            state._fsp--;


            }

             after(grammarAccess.getCRUDOperationsAccess().getCriteriaAssignment_1_3_8_1()); 

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
    // InternalMyDsl.g:2324:1: rule__CRUDOperations__Group_1_3_13__0 : rule__CRUDOperations__Group_1_3_13__0__Impl rule__CRUDOperations__Group_1_3_13__1 ;
    public final void rule__CRUDOperations__Group_1_3_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2328:1: ( rule__CRUDOperations__Group_1_3_13__0__Impl rule__CRUDOperations__Group_1_3_13__1 )
            // InternalMyDsl.g:2329:2: rule__CRUDOperations__Group_1_3_13__0__Impl rule__CRUDOperations__Group_1_3_13__1
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
    // InternalMyDsl.g:2336:1: rule__CRUDOperations__Group_1_3_13__0__Impl : ( ',' ) ;
    public final void rule__CRUDOperations__Group_1_3_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2340:1: ( ( ',' ) )
            // InternalMyDsl.g:2341:1: ( ',' )
            {
            // InternalMyDsl.g:2341:1: ( ',' )
            // InternalMyDsl.g:2342:2: ','
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
    // InternalMyDsl.g:2351:1: rule__CRUDOperations__Group_1_3_13__1 : rule__CRUDOperations__Group_1_3_13__1__Impl ;
    public final void rule__CRUDOperations__Group_1_3_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2355:1: ( rule__CRUDOperations__Group_1_3_13__1__Impl )
            // InternalMyDsl.g:2356:2: rule__CRUDOperations__Group_1_3_13__1__Impl
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
    // InternalMyDsl.g:2362:1: rule__CRUDOperations__Group_1_3_13__1__Impl : ( ( rule__CRUDOperations__EntriesAssignment_1_3_13_1 ) ) ;
    public final void rule__CRUDOperations__Group_1_3_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2366:1: ( ( ( rule__CRUDOperations__EntriesAssignment_1_3_13_1 ) ) )
            // InternalMyDsl.g:2367:1: ( ( rule__CRUDOperations__EntriesAssignment_1_3_13_1 ) )
            {
            // InternalMyDsl.g:2367:1: ( ( rule__CRUDOperations__EntriesAssignment_1_3_13_1 ) )
            // InternalMyDsl.g:2368:2: ( rule__CRUDOperations__EntriesAssignment_1_3_13_1 )
            {
             before(grammarAccess.getCRUDOperationsAccess().getEntriesAssignment_1_3_13_1()); 
            // InternalMyDsl.g:2369:2: ( rule__CRUDOperations__EntriesAssignment_1_3_13_1 )
            // InternalMyDsl.g:2369:3: rule__CRUDOperations__EntriesAssignment_1_3_13_1
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


    // $ANTLR start "rule__CollectionEntry__Group__0"
    // InternalMyDsl.g:2378:1: rule__CollectionEntry__Group__0 : rule__CollectionEntry__Group__0__Impl rule__CollectionEntry__Group__1 ;
    public final void rule__CollectionEntry__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2382:1: ( rule__CollectionEntry__Group__0__Impl rule__CollectionEntry__Group__1 )
            // InternalMyDsl.g:2383:2: rule__CollectionEntry__Group__0__Impl rule__CollectionEntry__Group__1
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
    // InternalMyDsl.g:2390:1: rule__CollectionEntry__Group__0__Impl : ( ( rule__CollectionEntry__ValueNameAssignment_0 ) ) ;
    public final void rule__CollectionEntry__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2394:1: ( ( ( rule__CollectionEntry__ValueNameAssignment_0 ) ) )
            // InternalMyDsl.g:2395:1: ( ( rule__CollectionEntry__ValueNameAssignment_0 ) )
            {
            // InternalMyDsl.g:2395:1: ( ( rule__CollectionEntry__ValueNameAssignment_0 ) )
            // InternalMyDsl.g:2396:2: ( rule__CollectionEntry__ValueNameAssignment_0 )
            {
             before(grammarAccess.getCollectionEntryAccess().getValueNameAssignment_0()); 
            // InternalMyDsl.g:2397:2: ( rule__CollectionEntry__ValueNameAssignment_0 )
            // InternalMyDsl.g:2397:3: rule__CollectionEntry__ValueNameAssignment_0
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
    // InternalMyDsl.g:2405:1: rule__CollectionEntry__Group__1 : rule__CollectionEntry__Group__1__Impl rule__CollectionEntry__Group__2 ;
    public final void rule__CollectionEntry__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2409:1: ( rule__CollectionEntry__Group__1__Impl rule__CollectionEntry__Group__2 )
            // InternalMyDsl.g:2410:2: rule__CollectionEntry__Group__1__Impl rule__CollectionEntry__Group__2
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
    // InternalMyDsl.g:2417:1: rule__CollectionEntry__Group__1__Impl : ( ':' ) ;
    public final void rule__CollectionEntry__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2421:1: ( ( ':' ) )
            // InternalMyDsl.g:2422:1: ( ':' )
            {
            // InternalMyDsl.g:2422:1: ( ':' )
            // InternalMyDsl.g:2423:2: ':'
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
    // InternalMyDsl.g:2432:1: rule__CollectionEntry__Group__2 : rule__CollectionEntry__Group__2__Impl ;
    public final void rule__CollectionEntry__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2436:1: ( rule__CollectionEntry__Group__2__Impl )
            // InternalMyDsl.g:2437:2: rule__CollectionEntry__Group__2__Impl
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
    // InternalMyDsl.g:2443:1: rule__CollectionEntry__Group__2__Impl : ( ( rule__CollectionEntry__Alternatives_2 ) ) ;
    public final void rule__CollectionEntry__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2447:1: ( ( ( rule__CollectionEntry__Alternatives_2 ) ) )
            // InternalMyDsl.g:2448:1: ( ( rule__CollectionEntry__Alternatives_2 ) )
            {
            // InternalMyDsl.g:2448:1: ( ( rule__CollectionEntry__Alternatives_2 ) )
            // InternalMyDsl.g:2449:2: ( rule__CollectionEntry__Alternatives_2 )
            {
             before(grammarAccess.getCollectionEntryAccess().getAlternatives_2()); 
            // InternalMyDsl.g:2450:2: ( rule__CollectionEntry__Alternatives_2 )
            // InternalMyDsl.g:2450:3: rule__CollectionEntry__Alternatives_2
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
    // InternalMyDsl.g:2459:1: rule__ConnectionStatement__UnorderedGroup : rule__ConnectionStatement__UnorderedGroup__0 {...}?;
    public final void rule__ConnectionStatement__UnorderedGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getConnectionStatementAccess().getUnorderedGroup());
        	
        try {
            // InternalMyDsl.g:2464:1: ( rule__ConnectionStatement__UnorderedGroup__0 {...}?)
            // InternalMyDsl.g:2465:2: rule__ConnectionStatement__UnorderedGroup__0 {...}?
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
    // InternalMyDsl.g:2473:1: rule__ConnectionStatement__UnorderedGroup__Impl : ( ({...}? => ( ( ( rule__ConnectionStatement__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ConnectionStatement__Group_1__0 ) ) ) ) ) ;
    public final void rule__ConnectionStatement__UnorderedGroup__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalMyDsl.g:2478:1: ( ( ({...}? => ( ( ( rule__ConnectionStatement__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ConnectionStatement__Group_1__0 ) ) ) ) ) )
            // InternalMyDsl.g:2479:3: ( ({...}? => ( ( ( rule__ConnectionStatement__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ConnectionStatement__Group_1__0 ) ) ) ) )
            {
            // InternalMyDsl.g:2479:3: ( ({...}? => ( ( ( rule__ConnectionStatement__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ConnectionStatement__Group_1__0 ) ) ) ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( LA17_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionStatementAccess().getUnorderedGroup(), 0) ) {
                alt17=1;
            }
            else if ( LA17_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionStatementAccess().getUnorderedGroup(), 1) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:2480:3: ({...}? => ( ( ( rule__ConnectionStatement__Group_0__0 ) ) ) )
                    {
                    // InternalMyDsl.g:2480:3: ({...}? => ( ( ( rule__ConnectionStatement__Group_0__0 ) ) ) )
                    // InternalMyDsl.g:2481:4: {...}? => ( ( ( rule__ConnectionStatement__Group_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionStatementAccess().getUnorderedGroup(), 0) ) {
                        throw new FailedPredicateException(input, "rule__ConnectionStatement__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionStatementAccess().getUnorderedGroup(), 0)");
                    }
                    // InternalMyDsl.g:2481:113: ( ( ( rule__ConnectionStatement__Group_0__0 ) ) )
                    // InternalMyDsl.g:2482:5: ( ( rule__ConnectionStatement__Group_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getConnectionStatementAccess().getUnorderedGroup(), 0);
                    				

                    					selected = true;
                    				
                    // InternalMyDsl.g:2488:5: ( ( rule__ConnectionStatement__Group_0__0 ) )
                    // InternalMyDsl.g:2489:6: ( rule__ConnectionStatement__Group_0__0 )
                    {
                     before(grammarAccess.getConnectionStatementAccess().getGroup_0()); 
                    // InternalMyDsl.g:2490:6: ( rule__ConnectionStatement__Group_0__0 )
                    // InternalMyDsl.g:2490:7: rule__ConnectionStatement__Group_0__0
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
                    // InternalMyDsl.g:2495:3: ({...}? => ( ( ( rule__ConnectionStatement__Group_1__0 ) ) ) )
                    {
                    // InternalMyDsl.g:2495:3: ({...}? => ( ( ( rule__ConnectionStatement__Group_1__0 ) ) ) )
                    // InternalMyDsl.g:2496:4: {...}? => ( ( ( rule__ConnectionStatement__Group_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionStatementAccess().getUnorderedGroup(), 1) ) {
                        throw new FailedPredicateException(input, "rule__ConnectionStatement__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionStatementAccess().getUnorderedGroup(), 1)");
                    }
                    // InternalMyDsl.g:2496:113: ( ( ( rule__ConnectionStatement__Group_1__0 ) ) )
                    // InternalMyDsl.g:2497:5: ( ( rule__ConnectionStatement__Group_1__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getConnectionStatementAccess().getUnorderedGroup(), 1);
                    				

                    					selected = true;
                    				
                    // InternalMyDsl.g:2503:5: ( ( rule__ConnectionStatement__Group_1__0 ) )
                    // InternalMyDsl.g:2504:6: ( rule__ConnectionStatement__Group_1__0 )
                    {
                     before(grammarAccess.getConnectionStatementAccess().getGroup_1()); 
                    // InternalMyDsl.g:2505:6: ( rule__ConnectionStatement__Group_1__0 )
                    // InternalMyDsl.g:2505:7: rule__ConnectionStatement__Group_1__0
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
    // InternalMyDsl.g:2518:1: rule__ConnectionStatement__UnorderedGroup__0 : rule__ConnectionStatement__UnorderedGroup__Impl ( rule__ConnectionStatement__UnorderedGroup__1 )? ;
    public final void rule__ConnectionStatement__UnorderedGroup__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2522:1: ( rule__ConnectionStatement__UnorderedGroup__Impl ( rule__ConnectionStatement__UnorderedGroup__1 )? )
            // InternalMyDsl.g:2523:2: rule__ConnectionStatement__UnorderedGroup__Impl ( rule__ConnectionStatement__UnorderedGroup__1 )?
            {
            pushFollow(FOLLOW_3);
            rule__ConnectionStatement__UnorderedGroup__Impl();

            state._fsp--;

            // InternalMyDsl.g:2524:2: ( rule__ConnectionStatement__UnorderedGroup__1 )?
            int alt18=2;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // InternalMyDsl.g:2524:2: rule__ConnectionStatement__UnorderedGroup__1
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
    // InternalMyDsl.g:2530:1: rule__ConnectionStatement__UnorderedGroup__1 : rule__ConnectionStatement__UnorderedGroup__Impl ;
    public final void rule__ConnectionStatement__UnorderedGroup__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2534:1: ( rule__ConnectionStatement__UnorderedGroup__Impl )
            // InternalMyDsl.g:2535:2: rule__ConnectionStatement__UnorderedGroup__Impl
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
    // InternalMyDsl.g:2542:1: rule__MongoDB__ModelsAssignment : ( ruleModel ) ;
    public final void rule__MongoDB__ModelsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2546:1: ( ( ruleModel ) )
            // InternalMyDsl.g:2547:2: ( ruleModel )
            {
            // InternalMyDsl.g:2547:2: ( ruleModel )
            // InternalMyDsl.g:2548:3: ruleModel
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
    // InternalMyDsl.g:2557:1: rule__Model__ConnectionAssignment_0 : ( ruleConnectionStatement ) ;
    public final void rule__Model__ConnectionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2561:1: ( ( ruleConnectionStatement ) )
            // InternalMyDsl.g:2562:2: ( ruleConnectionStatement )
            {
            // InternalMyDsl.g:2562:2: ( ruleConnectionStatement )
            // InternalMyDsl.g:2563:3: ruleConnectionStatement
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
    // InternalMyDsl.g:2572:1: rule__Model__StatementsAssignment_1 : ( ruleCRUDOperationAndCollectionSchema ) ;
    public final void rule__Model__StatementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2576:1: ( ( ruleCRUDOperationAndCollectionSchema ) )
            // InternalMyDsl.g:2577:2: ( ruleCRUDOperationAndCollectionSchema )
            {
            // InternalMyDsl.g:2577:2: ( ruleCRUDOperationAndCollectionSchema )
            // InternalMyDsl.g:2578:3: ruleCRUDOperationAndCollectionSchema
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
    // InternalMyDsl.g:2587:1: rule__CRUDOperationAndCollectionSchema__SchemaAssignment_0 : ( ruleCollectionSchema ) ;
    public final void rule__CRUDOperationAndCollectionSchema__SchemaAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2591:1: ( ( ruleCollectionSchema ) )
            // InternalMyDsl.g:2592:2: ( ruleCollectionSchema )
            {
            // InternalMyDsl.g:2592:2: ( ruleCollectionSchema )
            // InternalMyDsl.g:2593:3: ruleCollectionSchema
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
    // InternalMyDsl.g:2602:1: rule__CRUDOperationAndCollectionSchema__OperationsAssignment_1 : ( ruleCRUDOperations ) ;
    public final void rule__CRUDOperationAndCollectionSchema__OperationsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2606:1: ( ( ruleCRUDOperations ) )
            // InternalMyDsl.g:2607:2: ( ruleCRUDOperations )
            {
            // InternalMyDsl.g:2607:2: ( ruleCRUDOperations )
            // InternalMyDsl.g:2608:3: ruleCRUDOperations
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
    // InternalMyDsl.g:2617:1: rule__ConnectionStatement__ConnectionStringAssignment_0_3 : ( RULE_STRING ) ;
    public final void rule__ConnectionStatement__ConnectionStringAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2621:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:2622:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:2622:2: ( RULE_STRING )
            // InternalMyDsl.g:2623:3: RULE_STRING
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
    // InternalMyDsl.g:2632:1: rule__ConnectionStatement__DatabaseNameAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__ConnectionStatement__DatabaseNameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2636:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:2637:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:2637:2: ( RULE_STRING )
            // InternalMyDsl.g:2638:3: RULE_STRING
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
    // InternalMyDsl.g:2647:1: rule__CollectionSchema__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__CollectionSchema__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2651:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2652:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2652:2: ( RULE_ID )
            // InternalMyDsl.g:2653:3: RULE_ID
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
    // InternalMyDsl.g:2662:1: rule__CollectionSchema__DefinationAssignment_3_0 : ( ruleCollectionFieldDefination ) ;
    public final void rule__CollectionSchema__DefinationAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2666:1: ( ( ruleCollectionFieldDefination ) )
            // InternalMyDsl.g:2667:2: ( ruleCollectionFieldDefination )
            {
            // InternalMyDsl.g:2667:2: ( ruleCollectionFieldDefination )
            // InternalMyDsl.g:2668:3: ruleCollectionFieldDefination
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
    // InternalMyDsl.g:2677:1: rule__CollectionSchema__DefinationAssignment_3_1_1 : ( ruleCollectionFieldDefination ) ;
    public final void rule__CollectionSchema__DefinationAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2681:1: ( ( ruleCollectionFieldDefination ) )
            // InternalMyDsl.g:2682:2: ( ruleCollectionFieldDefination )
            {
            // InternalMyDsl.g:2682:2: ( ruleCollectionFieldDefination )
            // InternalMyDsl.g:2683:3: ruleCollectionFieldDefination
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
    // InternalMyDsl.g:2692:1: rule__CollectionFieldDefination__NameAssignment_0_0 : ( RULE_ID ) ;
    public final void rule__CollectionFieldDefination__NameAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2696:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2697:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2697:2: ( RULE_ID )
            // InternalMyDsl.g:2698:3: RULE_ID
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
    // InternalMyDsl.g:2707:1: rule__CollectionFieldDefination__FieldTypeAssignment_0_2 : ( ruleFieldType ) ;
    public final void rule__CollectionFieldDefination__FieldTypeAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2711:1: ( ( ruleFieldType ) )
            // InternalMyDsl.g:2712:2: ( ruleFieldType )
            {
            // InternalMyDsl.g:2712:2: ( ruleFieldType )
            // InternalMyDsl.g:2713:3: ruleFieldType
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
    // InternalMyDsl.g:2722:1: rule__CollectionFieldDefination__StatusAssignment_0_3 : ( ( 'required' ) ) ;
    public final void rule__CollectionFieldDefination__StatusAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2726:1: ( ( ( 'required' ) ) )
            // InternalMyDsl.g:2727:2: ( ( 'required' ) )
            {
            // InternalMyDsl.g:2727:2: ( ( 'required' ) )
            // InternalMyDsl.g:2728:3: ( 'required' )
            {
             before(grammarAccess.getCollectionFieldDefinationAccess().getStatusRequiredKeyword_0_3_0()); 
            // InternalMyDsl.g:2729:3: ( 'required' )
            // InternalMyDsl.g:2730:4: 'required'
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
    // InternalMyDsl.g:2741:1: rule__CollectionFieldDefination__UniqueKeyAssignment_0_4 : ( ( 'unique' ) ) ;
    public final void rule__CollectionFieldDefination__UniqueKeyAssignment_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2745:1: ( ( ( 'unique' ) ) )
            // InternalMyDsl.g:2746:2: ( ( 'unique' ) )
            {
            // InternalMyDsl.g:2746:2: ( ( 'unique' ) )
            // InternalMyDsl.g:2747:3: ( 'unique' )
            {
             before(grammarAccess.getCollectionFieldDefinationAccess().getUniqueKeyUniqueKeyword_0_4_0()); 
            // InternalMyDsl.g:2748:3: ( 'unique' )
            // InternalMyDsl.g:2749:4: 'unique'
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
    // InternalMyDsl.g:2760:1: rule__CollectionFieldDefination__NameAssignment_1_0 : ( RULE_ID ) ;
    public final void rule__CollectionFieldDefination__NameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2764:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2765:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2765:2: ( RULE_ID )
            // InternalMyDsl.g:2766:3: RULE_ID
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
    // InternalMyDsl.g:2775:1: rule__CollectionFieldDefination__RefCollectionAssignment_1_3 : ( ( RULE_ID ) ) ;
    public final void rule__CollectionFieldDefination__RefCollectionAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2779:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:2780:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:2780:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:2781:3: ( RULE_ID )
            {
             before(grammarAccess.getCollectionFieldDefinationAccess().getRefCollectionCollectionSchemaCrossReference_1_3_0()); 
            // InternalMyDsl.g:2782:3: ( RULE_ID )
            // InternalMyDsl.g:2783:4: RULE_ID
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
    // InternalMyDsl.g:2794:1: rule__CRUDOperations__NameAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__CRUDOperations__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2798:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2799:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2799:2: ( RULE_ID )
            // InternalMyDsl.g:2800:3: RULE_ID
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
    // InternalMyDsl.g:2809:1: rule__CRUDOperations__TypeAssignment_0_3_2 : ( ruleOperation ) ;
    public final void rule__CRUDOperations__TypeAssignment_0_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2813:1: ( ( ruleOperation ) )
            // InternalMyDsl.g:2814:2: ( ruleOperation )
            {
            // InternalMyDsl.g:2814:2: ( ruleOperation )
            // InternalMyDsl.g:2815:3: ruleOperation
            {
             before(grammarAccess.getCRUDOperationsAccess().getTypeOperationEnumRuleCall_0_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getCRUDOperationsAccess().getTypeOperationEnumRuleCall_0_3_2_0()); 

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
    // InternalMyDsl.g:2824:1: rule__CRUDOperations__CollectionAssignment_0_3_5 : ( ( RULE_ID ) ) ;
    public final void rule__CRUDOperations__CollectionAssignment_0_3_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2828:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:2829:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:2829:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:2830:3: ( RULE_ID )
            {
             before(grammarAccess.getCRUDOperationsAccess().getCollectionCollectionSchemaCrossReference_0_3_5_0()); 
            // InternalMyDsl.g:2831:3: ( RULE_ID )
            // InternalMyDsl.g:2832:4: RULE_ID
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
    // InternalMyDsl.g:2843:1: rule__CRUDOperations__EntriesAssignment_0_3_8_0 : ( ruleCollectionEntry ) ;
    public final void rule__CRUDOperations__EntriesAssignment_0_3_8_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2847:1: ( ( ruleCollectionEntry ) )
            // InternalMyDsl.g:2848:2: ( ruleCollectionEntry )
            {
            // InternalMyDsl.g:2848:2: ( ruleCollectionEntry )
            // InternalMyDsl.g:2849:3: ruleCollectionEntry
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
    // InternalMyDsl.g:2858:1: rule__CRUDOperations__EntriesAssignment_0_3_8_1_1 : ( ruleCollectionEntry ) ;
    public final void rule__CRUDOperations__EntriesAssignment_0_3_8_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2862:1: ( ( ruleCollectionEntry ) )
            // InternalMyDsl.g:2863:2: ( ruleCollectionEntry )
            {
            // InternalMyDsl.g:2863:2: ( ruleCollectionEntry )
            // InternalMyDsl.g:2864:3: ruleCollectionEntry
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
    // InternalMyDsl.g:2873:1: rule__CRUDOperations__NameAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__CRUDOperations__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2877:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2878:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2878:2: ( RULE_ID )
            // InternalMyDsl.g:2879:3: RULE_ID
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


    // $ANTLR start "rule__CRUDOperations__UpdateOperationAssignment_1_3_2"
    // InternalMyDsl.g:2888:1: rule__CRUDOperations__UpdateOperationAssignment_1_3_2 : ( ( 'UPDATE' ) ) ;
    public final void rule__CRUDOperations__UpdateOperationAssignment_1_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2892:1: ( ( ( 'UPDATE' ) ) )
            // InternalMyDsl.g:2893:2: ( ( 'UPDATE' ) )
            {
            // InternalMyDsl.g:2893:2: ( ( 'UPDATE' ) )
            // InternalMyDsl.g:2894:3: ( 'UPDATE' )
            {
             before(grammarAccess.getCRUDOperationsAccess().getUpdateOperationUPDATEKeyword_1_3_2_0()); 
            // InternalMyDsl.g:2895:3: ( 'UPDATE' )
            // InternalMyDsl.g:2896:4: 'UPDATE'
            {
             before(grammarAccess.getCRUDOperationsAccess().getUpdateOperationUPDATEKeyword_1_3_2_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getCRUDOperationsAccess().getUpdateOperationUPDATEKeyword_1_3_2_0()); 

            }

             after(grammarAccess.getCRUDOperationsAccess().getUpdateOperationUPDATEKeyword_1_3_2_0()); 

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
    // $ANTLR end "rule__CRUDOperations__UpdateOperationAssignment_1_3_2"


    // $ANTLR start "rule__CRUDOperations__CollectionAssignment_1_3_4"
    // InternalMyDsl.g:2907:1: rule__CRUDOperations__CollectionAssignment_1_3_4 : ( ( RULE_ID ) ) ;
    public final void rule__CRUDOperations__CollectionAssignment_1_3_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2911:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:2912:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:2912:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:2913:3: ( RULE_ID )
            {
             before(grammarAccess.getCRUDOperationsAccess().getCollectionCollectionSchemaCrossReference_1_3_4_0()); 
            // InternalMyDsl.g:2914:3: ( RULE_ID )
            // InternalMyDsl.g:2915:4: RULE_ID
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


    // $ANTLR start "rule__CRUDOperations__CriteriaAssignment_1_3_7"
    // InternalMyDsl.g:2926:1: rule__CRUDOperations__CriteriaAssignment_1_3_7 : ( ruleCollectionEntry ) ;
    public final void rule__CRUDOperations__CriteriaAssignment_1_3_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2930:1: ( ( ruleCollectionEntry ) )
            // InternalMyDsl.g:2931:2: ( ruleCollectionEntry )
            {
            // InternalMyDsl.g:2931:2: ( ruleCollectionEntry )
            // InternalMyDsl.g:2932:3: ruleCollectionEntry
            {
             before(grammarAccess.getCRUDOperationsAccess().getCriteriaCollectionEntryParserRuleCall_1_3_7_0()); 
            pushFollow(FOLLOW_2);
            ruleCollectionEntry();

            state._fsp--;

             after(grammarAccess.getCRUDOperationsAccess().getCriteriaCollectionEntryParserRuleCall_1_3_7_0()); 

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
    // $ANTLR end "rule__CRUDOperations__CriteriaAssignment_1_3_7"


    // $ANTLR start "rule__CRUDOperations__CriteriaAssignment_1_3_8_1"
    // InternalMyDsl.g:2941:1: rule__CRUDOperations__CriteriaAssignment_1_3_8_1 : ( ruleCollectionEntry ) ;
    public final void rule__CRUDOperations__CriteriaAssignment_1_3_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2945:1: ( ( ruleCollectionEntry ) )
            // InternalMyDsl.g:2946:2: ( ruleCollectionEntry )
            {
            // InternalMyDsl.g:2946:2: ( ruleCollectionEntry )
            // InternalMyDsl.g:2947:3: ruleCollectionEntry
            {
             before(grammarAccess.getCRUDOperationsAccess().getCriteriaCollectionEntryParserRuleCall_1_3_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCollectionEntry();

            state._fsp--;

             after(grammarAccess.getCRUDOperationsAccess().getCriteriaCollectionEntryParserRuleCall_1_3_8_1_0()); 

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
    // $ANTLR end "rule__CRUDOperations__CriteriaAssignment_1_3_8_1"


    // $ANTLR start "rule__CRUDOperations__EntriesAssignment_1_3_12"
    // InternalMyDsl.g:2956:1: rule__CRUDOperations__EntriesAssignment_1_3_12 : ( ruleCollectionEntry ) ;
    public final void rule__CRUDOperations__EntriesAssignment_1_3_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2960:1: ( ( ruleCollectionEntry ) )
            // InternalMyDsl.g:2961:2: ( ruleCollectionEntry )
            {
            // InternalMyDsl.g:2961:2: ( ruleCollectionEntry )
            // InternalMyDsl.g:2962:3: ruleCollectionEntry
            {
             before(grammarAccess.getCRUDOperationsAccess().getEntriesCollectionEntryParserRuleCall_1_3_12_0()); 
            pushFollow(FOLLOW_2);
            ruleCollectionEntry();

            state._fsp--;

             after(grammarAccess.getCRUDOperationsAccess().getEntriesCollectionEntryParserRuleCall_1_3_12_0()); 

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
    // InternalMyDsl.g:2971:1: rule__CRUDOperations__EntriesAssignment_1_3_13_1 : ( ruleCollectionEntry ) ;
    public final void rule__CRUDOperations__EntriesAssignment_1_3_13_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2975:1: ( ( ruleCollectionEntry ) )
            // InternalMyDsl.g:2976:2: ( ruleCollectionEntry )
            {
            // InternalMyDsl.g:2976:2: ( ruleCollectionEntry )
            // InternalMyDsl.g:2977:3: ruleCollectionEntry
            {
             before(grammarAccess.getCRUDOperationsAccess().getEntriesCollectionEntryParserRuleCall_1_3_13_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCollectionEntry();

            state._fsp--;

             after(grammarAccess.getCRUDOperationsAccess().getEntriesCollectionEntryParserRuleCall_1_3_13_1_0()); 

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


    // $ANTLR start "rule__CollectionEntry__ValueNameAssignment_0"
    // InternalMyDsl.g:2986:1: rule__CollectionEntry__ValueNameAssignment_0 : ( RULE_ID ) ;
    public final void rule__CollectionEntry__ValueNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2990:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2991:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2991:2: ( RULE_ID )
            // InternalMyDsl.g:2992:3: RULE_ID
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
    // InternalMyDsl.g:3001:1: rule__CollectionEntry__ValueStringAssignment_2_0 : ( RULE_STRING ) ;
    public final void rule__CollectionEntry__ValueStringAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3005:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:3006:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:3006:2: ( RULE_STRING )
            // InternalMyDsl.g:3007:3: RULE_STRING
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
    // InternalMyDsl.g:3016:1: rule__CollectionEntry__ValueIntAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__CollectionEntry__ValueIntAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3020:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:3021:2: ( RULE_INT )
            {
            // InternalMyDsl.g:3021:2: ( RULE_INT )
            // InternalMyDsl.g:3022:3: RULE_INT
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


    protected DFA18 dfa18 = new DFA18(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\1\3\12\uffff";
    static final String dfa_3s = "\1\22\1\23\1\4\1\uffff\1\24\1\27\1\4\1\0\1\25\1\uffff\1\0";
    static final String dfa_4s = "\1\30\1\23\1\4\1\uffff\1\24\1\27\1\4\1\0\1\25\1\uffff\1\0";
    static final String dfa_5s = "\3\uffff\1\2\5\uffff\1\1\1\uffff";
    static final String dfa_6s = "\7\uffff\1\1\2\uffff\1\0}>";
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

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "2524:2: ( rule__ConnectionStatement__UnorderedGroup__1 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA18_10 = input.LA(1);

                         
                        int index18_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionStatementAccess().getUnorderedGroup(), 0) ) {s = 9;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getConnectionStatementAccess().getUnorderedGroup()) ) {s = 3;}

                         
                        input.seek(index18_10);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA18_7 = input.LA(1);

                         
                        int index18_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionStatementAccess().getUnorderedGroup(), 1) ) {s = 9;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getConnectionStatementAccess().getUnorderedGroup()) ) {s = 3;}

                         
                        input.seek(index18_7);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 18, _s, input);
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
