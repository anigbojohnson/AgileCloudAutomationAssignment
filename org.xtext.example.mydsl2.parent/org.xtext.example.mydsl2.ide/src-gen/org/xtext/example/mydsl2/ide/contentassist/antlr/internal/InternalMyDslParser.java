package org.xtext.example.mydsl2.ide.contentassist.antlr.internal;

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
import org.xtext.example.mydsl2.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'GET'", "'DELETE'", "'INSERT'", "'String'", "'Number'", "'Boolean'", "'Date'", "'DatabaseParameters'", "'{'", "'Connection'", "','", "'database'", "'}'", "'Collection'", "':'", "'ref'", "'task:'", "'operation:'", "'collection:'", "'input:'", "'update:'", "'required'", "'unique'", "'UPDATE,'"
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


    // $ANTLR start "entryRuleOperationStatement"
    // InternalMyDsl.g:103:1: entryRuleOperationStatement : ruleOperationStatement EOF ;
    public final void entryRuleOperationStatement() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleOperationStatement EOF )
            // InternalMyDsl.g:105:1: ruleOperationStatement EOF
            {
             before(grammarAccess.getOperationStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleOperationStatement();

            state._fsp--;

             after(grammarAccess.getOperationStatementRule()); 
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
    // $ANTLR end "entryRuleOperationStatement"


    // $ANTLR start "ruleOperationStatement"
    // InternalMyDsl.g:112:1: ruleOperationStatement : ( ( rule__OperationStatement__Group__0 ) ) ;
    public final void ruleOperationStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__OperationStatement__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__OperationStatement__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__OperationStatement__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__OperationStatement__Group__0 )
            {
             before(grammarAccess.getOperationStatementAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__OperationStatement__Group__0 )
            // InternalMyDsl.g:119:4: rule__OperationStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OperationStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOperationStatementAccess().getGroup()); 

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
    // $ANTLR end "ruleOperationStatement"


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


    // $ANTLR start "entryRuleMakeStatement"
    // InternalMyDsl.g:153:1: entryRuleMakeStatement : ruleMakeStatement EOF ;
    public final void entryRuleMakeStatement() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleMakeStatement EOF )
            // InternalMyDsl.g:155:1: ruleMakeStatement EOF
            {
             before(grammarAccess.getMakeStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleMakeStatement();

            state._fsp--;

             after(grammarAccess.getMakeStatementRule()); 
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
    // $ANTLR end "entryRuleMakeStatement"


    // $ANTLR start "ruleMakeStatement"
    // InternalMyDsl.g:162:1: ruleMakeStatement : ( ( rule__MakeStatement__Group__0 ) ) ;
    public final void ruleMakeStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__MakeStatement__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__MakeStatement__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__MakeStatement__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__MakeStatement__Group__0 )
            {
             before(grammarAccess.getMakeStatementAccess().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__MakeStatement__Group__0 )
            // InternalMyDsl.g:169:4: rule__MakeStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MakeStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMakeStatementAccess().getGroup()); 

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
    // $ANTLR end "ruleMakeStatement"


    // $ANTLR start "entryRuleDictionaryEntry"
    // InternalMyDsl.g:178:1: entryRuleDictionaryEntry : ruleDictionaryEntry EOF ;
    public final void entryRuleDictionaryEntry() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleDictionaryEntry EOF )
            // InternalMyDsl.g:180:1: ruleDictionaryEntry EOF
            {
             before(grammarAccess.getDictionaryEntryRule()); 
            pushFollow(FOLLOW_1);
            ruleDictionaryEntry();

            state._fsp--;

             after(grammarAccess.getDictionaryEntryRule()); 
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
    // $ANTLR end "entryRuleDictionaryEntry"


    // $ANTLR start "ruleDictionaryEntry"
    // InternalMyDsl.g:187:1: ruleDictionaryEntry : ( ( rule__DictionaryEntry__Alternatives ) ) ;
    public final void ruleDictionaryEntry() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__DictionaryEntry__Alternatives ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__DictionaryEntry__Alternatives ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__DictionaryEntry__Alternatives ) )
            // InternalMyDsl.g:193:3: ( rule__DictionaryEntry__Alternatives )
            {
             before(grammarAccess.getDictionaryEntryAccess().getAlternatives()); 
            // InternalMyDsl.g:194:3: ( rule__DictionaryEntry__Alternatives )
            // InternalMyDsl.g:194:4: rule__DictionaryEntry__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DictionaryEntry__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDictionaryEntryAccess().getAlternatives()); 

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
    // $ANTLR end "ruleDictionaryEntry"


    // $ANTLR start "entryRuleOtherOperationStatement"
    // InternalMyDsl.g:203:1: entryRuleOtherOperationStatement : ruleOtherOperationStatement EOF ;
    public final void entryRuleOtherOperationStatement() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleOtherOperationStatement EOF )
            // InternalMyDsl.g:205:1: ruleOtherOperationStatement EOF
            {
             before(grammarAccess.getOtherOperationStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleOtherOperationStatement();

            state._fsp--;

             after(grammarAccess.getOtherOperationStatementRule()); 
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
    // $ANTLR end "entryRuleOtherOperationStatement"


    // $ANTLR start "ruleOtherOperationStatement"
    // InternalMyDsl.g:212:1: ruleOtherOperationStatement : ( ( rule__OtherOperationStatement__Alternatives ) ) ;
    public final void ruleOtherOperationStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__OtherOperationStatement__Alternatives ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__OtherOperationStatement__Alternatives ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__OtherOperationStatement__Alternatives ) )
            // InternalMyDsl.g:218:3: ( rule__OtherOperationStatement__Alternatives )
            {
             before(grammarAccess.getOtherOperationStatementAccess().getAlternatives()); 
            // InternalMyDsl.g:219:3: ( rule__OtherOperationStatement__Alternatives )
            // InternalMyDsl.g:219:4: rule__OtherOperationStatement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__OtherOperationStatement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOtherOperationStatementAccess().getAlternatives()); 

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
    // $ANTLR end "ruleOtherOperationStatement"


    // $ANTLR start "entryRuleTaskDictionaryEntry"
    // InternalMyDsl.g:228:1: entryRuleTaskDictionaryEntry : ruleTaskDictionaryEntry EOF ;
    public final void entryRuleTaskDictionaryEntry() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleTaskDictionaryEntry EOF )
            // InternalMyDsl.g:230:1: ruleTaskDictionaryEntry EOF
            {
             before(grammarAccess.getTaskDictionaryEntryRule()); 
            pushFollow(FOLLOW_1);
            ruleTaskDictionaryEntry();

            state._fsp--;

             after(grammarAccess.getTaskDictionaryEntryRule()); 
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
    // $ANTLR end "entryRuleTaskDictionaryEntry"


    // $ANTLR start "ruleTaskDictionaryEntry"
    // InternalMyDsl.g:237:1: ruleTaskDictionaryEntry : ( ( rule__TaskDictionaryEntry__Group__0 ) ) ;
    public final void ruleTaskDictionaryEntry() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__TaskDictionaryEntry__Group__0 ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__TaskDictionaryEntry__Group__0 ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__TaskDictionaryEntry__Group__0 ) )
            // InternalMyDsl.g:243:3: ( rule__TaskDictionaryEntry__Group__0 )
            {
             before(grammarAccess.getTaskDictionaryEntryAccess().getGroup()); 
            // InternalMyDsl.g:244:3: ( rule__TaskDictionaryEntry__Group__0 )
            // InternalMyDsl.g:244:4: rule__TaskDictionaryEntry__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TaskDictionaryEntry__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTaskDictionaryEntryAccess().getGroup()); 

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
    // $ANTLR end "ruleTaskDictionaryEntry"


    // $ANTLR start "entryRuleOperation"
    // InternalMyDsl.g:253:1: entryRuleOperation : ruleOperation EOF ;
    public final void entryRuleOperation() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( ruleOperation EOF )
            // InternalMyDsl.g:255:1: ruleOperation EOF
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
    // InternalMyDsl.g:262:1: ruleOperation : ( ( rule__Operation__Alternatives ) ) ;
    public final void ruleOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( ( rule__Operation__Alternatives ) ) )
            // InternalMyDsl.g:267:2: ( ( rule__Operation__Alternatives ) )
            {
            // InternalMyDsl.g:267:2: ( ( rule__Operation__Alternatives ) )
            // InternalMyDsl.g:268:3: ( rule__Operation__Alternatives )
            {
             before(grammarAccess.getOperationAccess().getAlternatives()); 
            // InternalMyDsl.g:269:3: ( rule__Operation__Alternatives )
            // InternalMyDsl.g:269:4: rule__Operation__Alternatives
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


    // $ANTLR start "entryRuleFieldType"
    // InternalMyDsl.g:278:1: entryRuleFieldType : ruleFieldType EOF ;
    public final void entryRuleFieldType() throws RecognitionException {
        try {
            // InternalMyDsl.g:279:1: ( ruleFieldType EOF )
            // InternalMyDsl.g:280:1: ruleFieldType EOF
            {
             before(grammarAccess.getFieldTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleFieldType();

            state._fsp--;

             after(grammarAccess.getFieldTypeRule()); 
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
    // $ANTLR end "entryRuleFieldType"


    // $ANTLR start "ruleFieldType"
    // InternalMyDsl.g:287:1: ruleFieldType : ( ( rule__FieldType__Alternatives ) ) ;
    public final void ruleFieldType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:291:2: ( ( ( rule__FieldType__Alternatives ) ) )
            // InternalMyDsl.g:292:2: ( ( rule__FieldType__Alternatives ) )
            {
            // InternalMyDsl.g:292:2: ( ( rule__FieldType__Alternatives ) )
            // InternalMyDsl.g:293:3: ( rule__FieldType__Alternatives )
            {
             before(grammarAccess.getFieldTypeAccess().getAlternatives()); 
            // InternalMyDsl.g:294:3: ( rule__FieldType__Alternatives )
            // InternalMyDsl.g:294:4: rule__FieldType__Alternatives
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


    // $ANTLR start "rule__DictionaryEntry__Alternatives"
    // InternalMyDsl.g:302:1: rule__DictionaryEntry__Alternatives : ( ( ( rule__DictionaryEntry__Group_0__0 ) ) | ( ( rule__DictionaryEntry__Group_1__0 ) ) );
    public final void rule__DictionaryEntry__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:306:1: ( ( ( rule__DictionaryEntry__Group_0__0 ) ) | ( ( rule__DictionaryEntry__Group_1__0 ) ) )
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
                    // InternalMyDsl.g:307:2: ( ( rule__DictionaryEntry__Group_0__0 ) )
                    {
                    // InternalMyDsl.g:307:2: ( ( rule__DictionaryEntry__Group_0__0 ) )
                    // InternalMyDsl.g:308:3: ( rule__DictionaryEntry__Group_0__0 )
                    {
                     before(grammarAccess.getDictionaryEntryAccess().getGroup_0()); 
                    // InternalMyDsl.g:309:3: ( rule__DictionaryEntry__Group_0__0 )
                    // InternalMyDsl.g:309:4: rule__DictionaryEntry__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DictionaryEntry__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDictionaryEntryAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:313:2: ( ( rule__DictionaryEntry__Group_1__0 ) )
                    {
                    // InternalMyDsl.g:313:2: ( ( rule__DictionaryEntry__Group_1__0 ) )
                    // InternalMyDsl.g:314:3: ( rule__DictionaryEntry__Group_1__0 )
                    {
                     before(grammarAccess.getDictionaryEntryAccess().getGroup_1()); 
                    // InternalMyDsl.g:315:3: ( rule__DictionaryEntry__Group_1__0 )
                    // InternalMyDsl.g:315:4: rule__DictionaryEntry__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DictionaryEntry__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDictionaryEntryAccess().getGroup_1()); 

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
    // $ANTLR end "rule__DictionaryEntry__Alternatives"


    // $ANTLR start "rule__OtherOperationStatement__Alternatives"
    // InternalMyDsl.g:323:1: rule__OtherOperationStatement__Alternatives : ( ( ( rule__OtherOperationStatement__Group_0__0 ) ) | ( ( rule__OtherOperationStatement__Group_1__0 ) ) );
    public final void rule__OtherOperationStatement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:327:1: ( ( ( rule__OtherOperationStatement__Group_0__0 ) ) | ( ( rule__OtherOperationStatement__Group_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==27) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==19) ) {
                    int LA3_2 = input.LA(3);

                    if ( (LA3_2==28) ) {
                        int LA3_3 = input.LA(4);

                        if ( (LA3_3==34) ) {
                            alt3=2;
                        }
                        else if ( ((LA3_3>=11 && LA3_3<=13)) ) {
                            alt3=1;
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
                    // InternalMyDsl.g:328:2: ( ( rule__OtherOperationStatement__Group_0__0 ) )
                    {
                    // InternalMyDsl.g:328:2: ( ( rule__OtherOperationStatement__Group_0__0 ) )
                    // InternalMyDsl.g:329:3: ( rule__OtherOperationStatement__Group_0__0 )
                    {
                     before(grammarAccess.getOtherOperationStatementAccess().getGroup_0()); 
                    // InternalMyDsl.g:330:3: ( rule__OtherOperationStatement__Group_0__0 )
                    // InternalMyDsl.g:330:4: rule__OtherOperationStatement__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OtherOperationStatement__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOtherOperationStatementAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:334:2: ( ( rule__OtherOperationStatement__Group_1__0 ) )
                    {
                    // InternalMyDsl.g:334:2: ( ( rule__OtherOperationStatement__Group_1__0 ) )
                    // InternalMyDsl.g:335:3: ( rule__OtherOperationStatement__Group_1__0 )
                    {
                     before(grammarAccess.getOtherOperationStatementAccess().getGroup_1()); 
                    // InternalMyDsl.g:336:3: ( rule__OtherOperationStatement__Group_1__0 )
                    // InternalMyDsl.g:336:4: rule__OtherOperationStatement__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OtherOperationStatement__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOtherOperationStatementAccess().getGroup_1()); 

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
    // $ANTLR end "rule__OtherOperationStatement__Alternatives"


    // $ANTLR start "rule__TaskDictionaryEntry__Alternatives_2"
    // InternalMyDsl.g:344:1: rule__TaskDictionaryEntry__Alternatives_2 : ( ( ( rule__TaskDictionaryEntry__ValueStringAssignment_2_0 ) ) | ( ( rule__TaskDictionaryEntry__ValueIntAssignment_2_1 ) ) );
    public final void rule__TaskDictionaryEntry__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:348:1: ( ( ( rule__TaskDictionaryEntry__ValueStringAssignment_2_0 ) ) | ( ( rule__TaskDictionaryEntry__ValueIntAssignment_2_1 ) ) )
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
                    // InternalMyDsl.g:349:2: ( ( rule__TaskDictionaryEntry__ValueStringAssignment_2_0 ) )
                    {
                    // InternalMyDsl.g:349:2: ( ( rule__TaskDictionaryEntry__ValueStringAssignment_2_0 ) )
                    // InternalMyDsl.g:350:3: ( rule__TaskDictionaryEntry__ValueStringAssignment_2_0 )
                    {
                     before(grammarAccess.getTaskDictionaryEntryAccess().getValueStringAssignment_2_0()); 
                    // InternalMyDsl.g:351:3: ( rule__TaskDictionaryEntry__ValueStringAssignment_2_0 )
                    // InternalMyDsl.g:351:4: rule__TaskDictionaryEntry__ValueStringAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TaskDictionaryEntry__ValueStringAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTaskDictionaryEntryAccess().getValueStringAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:355:2: ( ( rule__TaskDictionaryEntry__ValueIntAssignment_2_1 ) )
                    {
                    // InternalMyDsl.g:355:2: ( ( rule__TaskDictionaryEntry__ValueIntAssignment_2_1 ) )
                    // InternalMyDsl.g:356:3: ( rule__TaskDictionaryEntry__ValueIntAssignment_2_1 )
                    {
                     before(grammarAccess.getTaskDictionaryEntryAccess().getValueIntAssignment_2_1()); 
                    // InternalMyDsl.g:357:3: ( rule__TaskDictionaryEntry__ValueIntAssignment_2_1 )
                    // InternalMyDsl.g:357:4: rule__TaskDictionaryEntry__ValueIntAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__TaskDictionaryEntry__ValueIntAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getTaskDictionaryEntryAccess().getValueIntAssignment_2_1()); 

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
    // $ANTLR end "rule__TaskDictionaryEntry__Alternatives_2"


    // $ANTLR start "rule__Operation__Alternatives"
    // InternalMyDsl.g:365:1: rule__Operation__Alternatives : ( ( 'GET' ) | ( 'DELETE' ) | ( 'INSERT' ) );
    public final void rule__Operation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:369:1: ( ( 'GET' ) | ( 'DELETE' ) | ( 'INSERT' ) )
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
                    // InternalMyDsl.g:370:2: ( 'GET' )
                    {
                    // InternalMyDsl.g:370:2: ( 'GET' )
                    // InternalMyDsl.g:371:3: 'GET'
                    {
                     before(grammarAccess.getOperationAccess().getGETKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getOperationAccess().getGETKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:376:2: ( 'DELETE' )
                    {
                    // InternalMyDsl.g:376:2: ( 'DELETE' )
                    // InternalMyDsl.g:377:3: 'DELETE'
                    {
                     before(grammarAccess.getOperationAccess().getDELETEKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getOperationAccess().getDELETEKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:382:2: ( 'INSERT' )
                    {
                    // InternalMyDsl.g:382:2: ( 'INSERT' )
                    // InternalMyDsl.g:383:3: 'INSERT'
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
    // InternalMyDsl.g:392:1: rule__FieldType__Alternatives : ( ( 'String' ) | ( 'Number' ) | ( 'Boolean' ) | ( 'Date' ) );
    public final void rule__FieldType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:396:1: ( ( 'String' ) | ( 'Number' ) | ( 'Boolean' ) | ( 'Date' ) )
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
                    // InternalMyDsl.g:397:2: ( 'String' )
                    {
                    // InternalMyDsl.g:397:2: ( 'String' )
                    // InternalMyDsl.g:398:3: 'String'
                    {
                     before(grammarAccess.getFieldTypeAccess().getStringKeyword_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getFieldTypeAccess().getStringKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:403:2: ( 'Number' )
                    {
                    // InternalMyDsl.g:403:2: ( 'Number' )
                    // InternalMyDsl.g:404:3: 'Number'
                    {
                     before(grammarAccess.getFieldTypeAccess().getNumberKeyword_1()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getFieldTypeAccess().getNumberKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:409:2: ( 'Boolean' )
                    {
                    // InternalMyDsl.g:409:2: ( 'Boolean' )
                    // InternalMyDsl.g:410:3: 'Boolean'
                    {
                     before(grammarAccess.getFieldTypeAccess().getBooleanKeyword_2()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getFieldTypeAccess().getBooleanKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:415:2: ( 'Date' )
                    {
                    // InternalMyDsl.g:415:2: ( 'Date' )
                    // InternalMyDsl.g:416:3: 'Date'
                    {
                     before(grammarAccess.getFieldTypeAccess().getDateKeyword_3()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getFieldTypeAccess().getDateKeyword_3()); 

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
    // InternalMyDsl.g:425:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:429:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalMyDsl.g:430:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalMyDsl.g:437:1: rule__Model__Group__0__Impl : ( ( rule__Model__ConnectionAssignment_0 ) ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:441:1: ( ( ( rule__Model__ConnectionAssignment_0 ) ) )
            // InternalMyDsl.g:442:1: ( ( rule__Model__ConnectionAssignment_0 ) )
            {
            // InternalMyDsl.g:442:1: ( ( rule__Model__ConnectionAssignment_0 ) )
            // InternalMyDsl.g:443:2: ( rule__Model__ConnectionAssignment_0 )
            {
             before(grammarAccess.getModelAccess().getConnectionAssignment_0()); 
            // InternalMyDsl.g:444:2: ( rule__Model__ConnectionAssignment_0 )
            // InternalMyDsl.g:444:3: rule__Model__ConnectionAssignment_0
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
    // InternalMyDsl.g:452:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:456:1: ( rule__Model__Group__1__Impl )
            // InternalMyDsl.g:457:2: rule__Model__Group__1__Impl
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
    // InternalMyDsl.g:463:1: rule__Model__Group__1__Impl : ( ( rule__Model__StatementsAssignment_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:467:1: ( ( ( rule__Model__StatementsAssignment_1 )* ) )
            // InternalMyDsl.g:468:1: ( ( rule__Model__StatementsAssignment_1 )* )
            {
            // InternalMyDsl.g:468:1: ( ( rule__Model__StatementsAssignment_1 )* )
            // InternalMyDsl.g:469:2: ( rule__Model__StatementsAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getStatementsAssignment_1()); 
            // InternalMyDsl.g:470:2: ( rule__Model__StatementsAssignment_1 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==24) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:470:3: rule__Model__StatementsAssignment_1
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


    // $ANTLR start "rule__OperationStatement__Group__0"
    // InternalMyDsl.g:479:1: rule__OperationStatement__Group__0 : rule__OperationStatement__Group__0__Impl rule__OperationStatement__Group__1 ;
    public final void rule__OperationStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:483:1: ( rule__OperationStatement__Group__0__Impl rule__OperationStatement__Group__1 )
            // InternalMyDsl.g:484:2: rule__OperationStatement__Group__0__Impl rule__OperationStatement__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__OperationStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OperationStatement__Group__1();

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
    // $ANTLR end "rule__OperationStatement__Group__0"


    // $ANTLR start "rule__OperationStatement__Group__0__Impl"
    // InternalMyDsl.g:491:1: rule__OperationStatement__Group__0__Impl : ( ( rule__OperationStatement__SchemaAssignment_0 ) ) ;
    public final void rule__OperationStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:495:1: ( ( ( rule__OperationStatement__SchemaAssignment_0 ) ) )
            // InternalMyDsl.g:496:1: ( ( rule__OperationStatement__SchemaAssignment_0 ) )
            {
            // InternalMyDsl.g:496:1: ( ( rule__OperationStatement__SchemaAssignment_0 ) )
            // InternalMyDsl.g:497:2: ( rule__OperationStatement__SchemaAssignment_0 )
            {
             before(grammarAccess.getOperationStatementAccess().getSchemaAssignment_0()); 
            // InternalMyDsl.g:498:2: ( rule__OperationStatement__SchemaAssignment_0 )
            // InternalMyDsl.g:498:3: rule__OperationStatement__SchemaAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__OperationStatement__SchemaAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getOperationStatementAccess().getSchemaAssignment_0()); 

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
    // $ANTLR end "rule__OperationStatement__Group__0__Impl"


    // $ANTLR start "rule__OperationStatement__Group__1"
    // InternalMyDsl.g:506:1: rule__OperationStatement__Group__1 : rule__OperationStatement__Group__1__Impl ;
    public final void rule__OperationStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:510:1: ( rule__OperationStatement__Group__1__Impl )
            // InternalMyDsl.g:511:2: rule__OperationStatement__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OperationStatement__Group__1__Impl();

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
    // $ANTLR end "rule__OperationStatement__Group__1"


    // $ANTLR start "rule__OperationStatement__Group__1__Impl"
    // InternalMyDsl.g:517:1: rule__OperationStatement__Group__1__Impl : ( ( rule__OperationStatement__OperationsAssignment_1 )* ) ;
    public final void rule__OperationStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:521:1: ( ( ( rule__OperationStatement__OperationsAssignment_1 )* ) )
            // InternalMyDsl.g:522:1: ( ( rule__OperationStatement__OperationsAssignment_1 )* )
            {
            // InternalMyDsl.g:522:1: ( ( rule__OperationStatement__OperationsAssignment_1 )* )
            // InternalMyDsl.g:523:2: ( rule__OperationStatement__OperationsAssignment_1 )*
            {
             before(grammarAccess.getOperationStatementAccess().getOperationsAssignment_1()); 
            // InternalMyDsl.g:524:2: ( rule__OperationStatement__OperationsAssignment_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==27) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:524:3: rule__OperationStatement__OperationsAssignment_1
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__OperationStatement__OperationsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getOperationStatementAccess().getOperationsAssignment_1()); 

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
    // $ANTLR end "rule__OperationStatement__Group__1__Impl"


    // $ANTLR start "rule__ConnectionStatement__Group_0__0"
    // InternalMyDsl.g:533:1: rule__ConnectionStatement__Group_0__0 : rule__ConnectionStatement__Group_0__0__Impl rule__ConnectionStatement__Group_0__1 ;
    public final void rule__ConnectionStatement__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:537:1: ( rule__ConnectionStatement__Group_0__0__Impl rule__ConnectionStatement__Group_0__1 )
            // InternalMyDsl.g:538:2: rule__ConnectionStatement__Group_0__0__Impl rule__ConnectionStatement__Group_0__1
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
    // InternalMyDsl.g:545:1: rule__ConnectionStatement__Group_0__0__Impl : ( 'DatabaseParameters' ) ;
    public final void rule__ConnectionStatement__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:549:1: ( ( 'DatabaseParameters' ) )
            // InternalMyDsl.g:550:1: ( 'DatabaseParameters' )
            {
            // InternalMyDsl.g:550:1: ( 'DatabaseParameters' )
            // InternalMyDsl.g:551:2: 'DatabaseParameters'
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
    // InternalMyDsl.g:560:1: rule__ConnectionStatement__Group_0__1 : rule__ConnectionStatement__Group_0__1__Impl rule__ConnectionStatement__Group_0__2 ;
    public final void rule__ConnectionStatement__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:564:1: ( rule__ConnectionStatement__Group_0__1__Impl rule__ConnectionStatement__Group_0__2 )
            // InternalMyDsl.g:565:2: rule__ConnectionStatement__Group_0__1__Impl rule__ConnectionStatement__Group_0__2
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
    // InternalMyDsl.g:572:1: rule__ConnectionStatement__Group_0__1__Impl : ( '{' ) ;
    public final void rule__ConnectionStatement__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:576:1: ( ( '{' ) )
            // InternalMyDsl.g:577:1: ( '{' )
            {
            // InternalMyDsl.g:577:1: ( '{' )
            // InternalMyDsl.g:578:2: '{'
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
    // InternalMyDsl.g:587:1: rule__ConnectionStatement__Group_0__2 : rule__ConnectionStatement__Group_0__2__Impl rule__ConnectionStatement__Group_0__3 ;
    public final void rule__ConnectionStatement__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:591:1: ( rule__ConnectionStatement__Group_0__2__Impl rule__ConnectionStatement__Group_0__3 )
            // InternalMyDsl.g:592:2: rule__ConnectionStatement__Group_0__2__Impl rule__ConnectionStatement__Group_0__3
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
    // InternalMyDsl.g:599:1: rule__ConnectionStatement__Group_0__2__Impl : ( 'Connection' ) ;
    public final void rule__ConnectionStatement__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:603:1: ( ( 'Connection' ) )
            // InternalMyDsl.g:604:1: ( 'Connection' )
            {
            // InternalMyDsl.g:604:1: ( 'Connection' )
            // InternalMyDsl.g:605:2: 'Connection'
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
    // InternalMyDsl.g:614:1: rule__ConnectionStatement__Group_0__3 : rule__ConnectionStatement__Group_0__3__Impl rule__ConnectionStatement__Group_0__4 ;
    public final void rule__ConnectionStatement__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:618:1: ( rule__ConnectionStatement__Group_0__3__Impl rule__ConnectionStatement__Group_0__4 )
            // InternalMyDsl.g:619:2: rule__ConnectionStatement__Group_0__3__Impl rule__ConnectionStatement__Group_0__4
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
    // InternalMyDsl.g:626:1: rule__ConnectionStatement__Group_0__3__Impl : ( ( rule__ConnectionStatement__ConnectionStringAssignment_0_3 ) ) ;
    public final void rule__ConnectionStatement__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:630:1: ( ( ( rule__ConnectionStatement__ConnectionStringAssignment_0_3 ) ) )
            // InternalMyDsl.g:631:1: ( ( rule__ConnectionStatement__ConnectionStringAssignment_0_3 ) )
            {
            // InternalMyDsl.g:631:1: ( ( rule__ConnectionStatement__ConnectionStringAssignment_0_3 ) )
            // InternalMyDsl.g:632:2: ( rule__ConnectionStatement__ConnectionStringAssignment_0_3 )
            {
             before(grammarAccess.getConnectionStatementAccess().getConnectionStringAssignment_0_3()); 
            // InternalMyDsl.g:633:2: ( rule__ConnectionStatement__ConnectionStringAssignment_0_3 )
            // InternalMyDsl.g:633:3: rule__ConnectionStatement__ConnectionStringAssignment_0_3
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
    // InternalMyDsl.g:641:1: rule__ConnectionStatement__Group_0__4 : rule__ConnectionStatement__Group_0__4__Impl ;
    public final void rule__ConnectionStatement__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:645:1: ( rule__ConnectionStatement__Group_0__4__Impl )
            // InternalMyDsl.g:646:2: rule__ConnectionStatement__Group_0__4__Impl
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
    // InternalMyDsl.g:652:1: rule__ConnectionStatement__Group_0__4__Impl : ( ',' ) ;
    public final void rule__ConnectionStatement__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:656:1: ( ( ',' ) )
            // InternalMyDsl.g:657:1: ( ',' )
            {
            // InternalMyDsl.g:657:1: ( ',' )
            // InternalMyDsl.g:658:2: ','
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
    // InternalMyDsl.g:668:1: rule__ConnectionStatement__Group_1__0 : rule__ConnectionStatement__Group_1__0__Impl rule__ConnectionStatement__Group_1__1 ;
    public final void rule__ConnectionStatement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:672:1: ( rule__ConnectionStatement__Group_1__0__Impl rule__ConnectionStatement__Group_1__1 )
            // InternalMyDsl.g:673:2: rule__ConnectionStatement__Group_1__0__Impl rule__ConnectionStatement__Group_1__1
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
    // InternalMyDsl.g:680:1: rule__ConnectionStatement__Group_1__0__Impl : ( 'database' ) ;
    public final void rule__ConnectionStatement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:684:1: ( ( 'database' ) )
            // InternalMyDsl.g:685:1: ( 'database' )
            {
            // InternalMyDsl.g:685:1: ( 'database' )
            // InternalMyDsl.g:686:2: 'database'
            {
             before(grammarAccess.getConnectionStatementAccess().getDatabaseKeyword_1_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getConnectionStatementAccess().getDatabaseKeyword_1_0()); 

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
    // InternalMyDsl.g:695:1: rule__ConnectionStatement__Group_1__1 : rule__ConnectionStatement__Group_1__1__Impl rule__ConnectionStatement__Group_1__2 ;
    public final void rule__ConnectionStatement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:699:1: ( rule__ConnectionStatement__Group_1__1__Impl rule__ConnectionStatement__Group_1__2 )
            // InternalMyDsl.g:700:2: rule__ConnectionStatement__Group_1__1__Impl rule__ConnectionStatement__Group_1__2
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
    // InternalMyDsl.g:707:1: rule__ConnectionStatement__Group_1__1__Impl : ( ( rule__ConnectionStatement__DatabaseAssignment_1_1 ) ) ;
    public final void rule__ConnectionStatement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:711:1: ( ( ( rule__ConnectionStatement__DatabaseAssignment_1_1 ) ) )
            // InternalMyDsl.g:712:1: ( ( rule__ConnectionStatement__DatabaseAssignment_1_1 ) )
            {
            // InternalMyDsl.g:712:1: ( ( rule__ConnectionStatement__DatabaseAssignment_1_1 ) )
            // InternalMyDsl.g:713:2: ( rule__ConnectionStatement__DatabaseAssignment_1_1 )
            {
             before(grammarAccess.getConnectionStatementAccess().getDatabaseAssignment_1_1()); 
            // InternalMyDsl.g:714:2: ( rule__ConnectionStatement__DatabaseAssignment_1_1 )
            // InternalMyDsl.g:714:3: rule__ConnectionStatement__DatabaseAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ConnectionStatement__DatabaseAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getConnectionStatementAccess().getDatabaseAssignment_1_1()); 

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
    // InternalMyDsl.g:722:1: rule__ConnectionStatement__Group_1__2 : rule__ConnectionStatement__Group_1__2__Impl ;
    public final void rule__ConnectionStatement__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:726:1: ( rule__ConnectionStatement__Group_1__2__Impl )
            // InternalMyDsl.g:727:2: rule__ConnectionStatement__Group_1__2__Impl
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
    // InternalMyDsl.g:733:1: rule__ConnectionStatement__Group_1__2__Impl : ( '}' ) ;
    public final void rule__ConnectionStatement__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:737:1: ( ( '}' ) )
            // InternalMyDsl.g:738:1: ( '}' )
            {
            // InternalMyDsl.g:738:1: ( '}' )
            // InternalMyDsl.g:739:2: '}'
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


    // $ANTLR start "rule__MakeStatement__Group__0"
    // InternalMyDsl.g:749:1: rule__MakeStatement__Group__0 : rule__MakeStatement__Group__0__Impl rule__MakeStatement__Group__1 ;
    public final void rule__MakeStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:753:1: ( rule__MakeStatement__Group__0__Impl rule__MakeStatement__Group__1 )
            // InternalMyDsl.g:754:2: rule__MakeStatement__Group__0__Impl rule__MakeStatement__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__MakeStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MakeStatement__Group__1();

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
    // $ANTLR end "rule__MakeStatement__Group__0"


    // $ANTLR start "rule__MakeStatement__Group__0__Impl"
    // InternalMyDsl.g:761:1: rule__MakeStatement__Group__0__Impl : ( 'Collection' ) ;
    public final void rule__MakeStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:765:1: ( ( 'Collection' ) )
            // InternalMyDsl.g:766:1: ( 'Collection' )
            {
            // InternalMyDsl.g:766:1: ( 'Collection' )
            // InternalMyDsl.g:767:2: 'Collection'
            {
             before(grammarAccess.getMakeStatementAccess().getCollectionKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getMakeStatementAccess().getCollectionKeyword_0()); 

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
    // $ANTLR end "rule__MakeStatement__Group__0__Impl"


    // $ANTLR start "rule__MakeStatement__Group__1"
    // InternalMyDsl.g:776:1: rule__MakeStatement__Group__1 : rule__MakeStatement__Group__1__Impl rule__MakeStatement__Group__2 ;
    public final void rule__MakeStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:780:1: ( rule__MakeStatement__Group__1__Impl rule__MakeStatement__Group__2 )
            // InternalMyDsl.g:781:2: rule__MakeStatement__Group__1__Impl rule__MakeStatement__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__MakeStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MakeStatement__Group__2();

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
    // $ANTLR end "rule__MakeStatement__Group__1"


    // $ANTLR start "rule__MakeStatement__Group__1__Impl"
    // InternalMyDsl.g:788:1: rule__MakeStatement__Group__1__Impl : ( ( rule__MakeStatement__NameAssignment_1 ) ) ;
    public final void rule__MakeStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:792:1: ( ( ( rule__MakeStatement__NameAssignment_1 ) ) )
            // InternalMyDsl.g:793:1: ( ( rule__MakeStatement__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:793:1: ( ( rule__MakeStatement__NameAssignment_1 ) )
            // InternalMyDsl.g:794:2: ( rule__MakeStatement__NameAssignment_1 )
            {
             before(grammarAccess.getMakeStatementAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:795:2: ( rule__MakeStatement__NameAssignment_1 )
            // InternalMyDsl.g:795:3: rule__MakeStatement__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MakeStatement__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMakeStatementAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__MakeStatement__Group__1__Impl"


    // $ANTLR start "rule__MakeStatement__Group__2"
    // InternalMyDsl.g:803:1: rule__MakeStatement__Group__2 : rule__MakeStatement__Group__2__Impl rule__MakeStatement__Group__3 ;
    public final void rule__MakeStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:807:1: ( rule__MakeStatement__Group__2__Impl rule__MakeStatement__Group__3 )
            // InternalMyDsl.g:808:2: rule__MakeStatement__Group__2__Impl rule__MakeStatement__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__MakeStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MakeStatement__Group__3();

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
    // $ANTLR end "rule__MakeStatement__Group__2"


    // $ANTLR start "rule__MakeStatement__Group__2__Impl"
    // InternalMyDsl.g:815:1: rule__MakeStatement__Group__2__Impl : ( '{' ) ;
    public final void rule__MakeStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:819:1: ( ( '{' ) )
            // InternalMyDsl.g:820:1: ( '{' )
            {
            // InternalMyDsl.g:820:1: ( '{' )
            // InternalMyDsl.g:821:2: '{'
            {
             before(grammarAccess.getMakeStatementAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getMakeStatementAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__MakeStatement__Group__2__Impl"


    // $ANTLR start "rule__MakeStatement__Group__3"
    // InternalMyDsl.g:830:1: rule__MakeStatement__Group__3 : rule__MakeStatement__Group__3__Impl rule__MakeStatement__Group__4 ;
    public final void rule__MakeStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:834:1: ( rule__MakeStatement__Group__3__Impl rule__MakeStatement__Group__4 )
            // InternalMyDsl.g:835:2: rule__MakeStatement__Group__3__Impl rule__MakeStatement__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__MakeStatement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MakeStatement__Group__4();

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
    // $ANTLR end "rule__MakeStatement__Group__3"


    // $ANTLR start "rule__MakeStatement__Group__3__Impl"
    // InternalMyDsl.g:842:1: rule__MakeStatement__Group__3__Impl : ( ( rule__MakeStatement__Group_3__0 )? ) ;
    public final void rule__MakeStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:846:1: ( ( ( rule__MakeStatement__Group_3__0 )? ) )
            // InternalMyDsl.g:847:1: ( ( rule__MakeStatement__Group_3__0 )? )
            {
            // InternalMyDsl.g:847:1: ( ( rule__MakeStatement__Group_3__0 )? )
            // InternalMyDsl.g:848:2: ( rule__MakeStatement__Group_3__0 )?
            {
             before(grammarAccess.getMakeStatementAccess().getGroup_3()); 
            // InternalMyDsl.g:849:2: ( rule__MakeStatement__Group_3__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:849:3: rule__MakeStatement__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MakeStatement__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMakeStatementAccess().getGroup_3()); 

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
    // $ANTLR end "rule__MakeStatement__Group__3__Impl"


    // $ANTLR start "rule__MakeStatement__Group__4"
    // InternalMyDsl.g:857:1: rule__MakeStatement__Group__4 : rule__MakeStatement__Group__4__Impl ;
    public final void rule__MakeStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:861:1: ( rule__MakeStatement__Group__4__Impl )
            // InternalMyDsl.g:862:2: rule__MakeStatement__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MakeStatement__Group__4__Impl();

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
    // $ANTLR end "rule__MakeStatement__Group__4"


    // $ANTLR start "rule__MakeStatement__Group__4__Impl"
    // InternalMyDsl.g:868:1: rule__MakeStatement__Group__4__Impl : ( '}' ) ;
    public final void rule__MakeStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:872:1: ( ( '}' ) )
            // InternalMyDsl.g:873:1: ( '}' )
            {
            // InternalMyDsl.g:873:1: ( '}' )
            // InternalMyDsl.g:874:2: '}'
            {
             before(grammarAccess.getMakeStatementAccess().getRightCurlyBracketKeyword_4()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getMakeStatementAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__MakeStatement__Group__4__Impl"


    // $ANTLR start "rule__MakeStatement__Group_3__0"
    // InternalMyDsl.g:884:1: rule__MakeStatement__Group_3__0 : rule__MakeStatement__Group_3__0__Impl rule__MakeStatement__Group_3__1 ;
    public final void rule__MakeStatement__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:888:1: ( rule__MakeStatement__Group_3__0__Impl rule__MakeStatement__Group_3__1 )
            // InternalMyDsl.g:889:2: rule__MakeStatement__Group_3__0__Impl rule__MakeStatement__Group_3__1
            {
            pushFollow(FOLLOW_11);
            rule__MakeStatement__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MakeStatement__Group_3__1();

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
    // $ANTLR end "rule__MakeStatement__Group_3__0"


    // $ANTLR start "rule__MakeStatement__Group_3__0__Impl"
    // InternalMyDsl.g:896:1: rule__MakeStatement__Group_3__0__Impl : ( ( rule__MakeStatement__EntriesAssignment_3_0 ) ) ;
    public final void rule__MakeStatement__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:900:1: ( ( ( rule__MakeStatement__EntriesAssignment_3_0 ) ) )
            // InternalMyDsl.g:901:1: ( ( rule__MakeStatement__EntriesAssignment_3_0 ) )
            {
            // InternalMyDsl.g:901:1: ( ( rule__MakeStatement__EntriesAssignment_3_0 ) )
            // InternalMyDsl.g:902:2: ( rule__MakeStatement__EntriesAssignment_3_0 )
            {
             before(grammarAccess.getMakeStatementAccess().getEntriesAssignment_3_0()); 
            // InternalMyDsl.g:903:2: ( rule__MakeStatement__EntriesAssignment_3_0 )
            // InternalMyDsl.g:903:3: rule__MakeStatement__EntriesAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__MakeStatement__EntriesAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getMakeStatementAccess().getEntriesAssignment_3_0()); 

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
    // $ANTLR end "rule__MakeStatement__Group_3__0__Impl"


    // $ANTLR start "rule__MakeStatement__Group_3__1"
    // InternalMyDsl.g:911:1: rule__MakeStatement__Group_3__1 : rule__MakeStatement__Group_3__1__Impl ;
    public final void rule__MakeStatement__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:915:1: ( rule__MakeStatement__Group_3__1__Impl )
            // InternalMyDsl.g:916:2: rule__MakeStatement__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MakeStatement__Group_3__1__Impl();

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
    // $ANTLR end "rule__MakeStatement__Group_3__1"


    // $ANTLR start "rule__MakeStatement__Group_3__1__Impl"
    // InternalMyDsl.g:922:1: rule__MakeStatement__Group_3__1__Impl : ( ( rule__MakeStatement__Group_3_1__0 )* ) ;
    public final void rule__MakeStatement__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:926:1: ( ( ( rule__MakeStatement__Group_3_1__0 )* ) )
            // InternalMyDsl.g:927:1: ( ( rule__MakeStatement__Group_3_1__0 )* )
            {
            // InternalMyDsl.g:927:1: ( ( rule__MakeStatement__Group_3_1__0 )* )
            // InternalMyDsl.g:928:2: ( rule__MakeStatement__Group_3_1__0 )*
            {
             before(grammarAccess.getMakeStatementAccess().getGroup_3_1()); 
            // InternalMyDsl.g:929:2: ( rule__MakeStatement__Group_3_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==21) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDsl.g:929:3: rule__MakeStatement__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__MakeStatement__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getMakeStatementAccess().getGroup_3_1()); 

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
    // $ANTLR end "rule__MakeStatement__Group_3__1__Impl"


    // $ANTLR start "rule__MakeStatement__Group_3_1__0"
    // InternalMyDsl.g:938:1: rule__MakeStatement__Group_3_1__0 : rule__MakeStatement__Group_3_1__0__Impl rule__MakeStatement__Group_3_1__1 ;
    public final void rule__MakeStatement__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:942:1: ( rule__MakeStatement__Group_3_1__0__Impl rule__MakeStatement__Group_3_1__1 )
            // InternalMyDsl.g:943:2: rule__MakeStatement__Group_3_1__0__Impl rule__MakeStatement__Group_3_1__1
            {
            pushFollow(FOLLOW_13);
            rule__MakeStatement__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MakeStatement__Group_3_1__1();

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
    // $ANTLR end "rule__MakeStatement__Group_3_1__0"


    // $ANTLR start "rule__MakeStatement__Group_3_1__0__Impl"
    // InternalMyDsl.g:950:1: rule__MakeStatement__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__MakeStatement__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:954:1: ( ( ',' ) )
            // InternalMyDsl.g:955:1: ( ',' )
            {
            // InternalMyDsl.g:955:1: ( ',' )
            // InternalMyDsl.g:956:2: ','
            {
             before(grammarAccess.getMakeStatementAccess().getCommaKeyword_3_1_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getMakeStatementAccess().getCommaKeyword_3_1_0()); 

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
    // $ANTLR end "rule__MakeStatement__Group_3_1__0__Impl"


    // $ANTLR start "rule__MakeStatement__Group_3_1__1"
    // InternalMyDsl.g:965:1: rule__MakeStatement__Group_3_1__1 : rule__MakeStatement__Group_3_1__1__Impl ;
    public final void rule__MakeStatement__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:969:1: ( rule__MakeStatement__Group_3_1__1__Impl )
            // InternalMyDsl.g:970:2: rule__MakeStatement__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MakeStatement__Group_3_1__1__Impl();

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
    // $ANTLR end "rule__MakeStatement__Group_3_1__1"


    // $ANTLR start "rule__MakeStatement__Group_3_1__1__Impl"
    // InternalMyDsl.g:976:1: rule__MakeStatement__Group_3_1__1__Impl : ( ( rule__MakeStatement__EntriesAssignment_3_1_1 ) ) ;
    public final void rule__MakeStatement__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:980:1: ( ( ( rule__MakeStatement__EntriesAssignment_3_1_1 ) ) )
            // InternalMyDsl.g:981:1: ( ( rule__MakeStatement__EntriesAssignment_3_1_1 ) )
            {
            // InternalMyDsl.g:981:1: ( ( rule__MakeStatement__EntriesAssignment_3_1_1 ) )
            // InternalMyDsl.g:982:2: ( rule__MakeStatement__EntriesAssignment_3_1_1 )
            {
             before(grammarAccess.getMakeStatementAccess().getEntriesAssignment_3_1_1()); 
            // InternalMyDsl.g:983:2: ( rule__MakeStatement__EntriesAssignment_3_1_1 )
            // InternalMyDsl.g:983:3: rule__MakeStatement__EntriesAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__MakeStatement__EntriesAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMakeStatementAccess().getEntriesAssignment_3_1_1()); 

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
    // $ANTLR end "rule__MakeStatement__Group_3_1__1__Impl"


    // $ANTLR start "rule__DictionaryEntry__Group_0__0"
    // InternalMyDsl.g:992:1: rule__DictionaryEntry__Group_0__0 : rule__DictionaryEntry__Group_0__0__Impl rule__DictionaryEntry__Group_0__1 ;
    public final void rule__DictionaryEntry__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:996:1: ( rule__DictionaryEntry__Group_0__0__Impl rule__DictionaryEntry__Group_0__1 )
            // InternalMyDsl.g:997:2: rule__DictionaryEntry__Group_0__0__Impl rule__DictionaryEntry__Group_0__1
            {
            pushFollow(FOLLOW_16);
            rule__DictionaryEntry__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DictionaryEntry__Group_0__1();

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
    // $ANTLR end "rule__DictionaryEntry__Group_0__0"


    // $ANTLR start "rule__DictionaryEntry__Group_0__0__Impl"
    // InternalMyDsl.g:1004:1: rule__DictionaryEntry__Group_0__0__Impl : ( ( rule__DictionaryEntry__NameAssignment_0_0 ) ) ;
    public final void rule__DictionaryEntry__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1008:1: ( ( ( rule__DictionaryEntry__NameAssignment_0_0 ) ) )
            // InternalMyDsl.g:1009:1: ( ( rule__DictionaryEntry__NameAssignment_0_0 ) )
            {
            // InternalMyDsl.g:1009:1: ( ( rule__DictionaryEntry__NameAssignment_0_0 ) )
            // InternalMyDsl.g:1010:2: ( rule__DictionaryEntry__NameAssignment_0_0 )
            {
             before(grammarAccess.getDictionaryEntryAccess().getNameAssignment_0_0()); 
            // InternalMyDsl.g:1011:2: ( rule__DictionaryEntry__NameAssignment_0_0 )
            // InternalMyDsl.g:1011:3: rule__DictionaryEntry__NameAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__DictionaryEntry__NameAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getDictionaryEntryAccess().getNameAssignment_0_0()); 

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
    // $ANTLR end "rule__DictionaryEntry__Group_0__0__Impl"


    // $ANTLR start "rule__DictionaryEntry__Group_0__1"
    // InternalMyDsl.g:1019:1: rule__DictionaryEntry__Group_0__1 : rule__DictionaryEntry__Group_0__1__Impl rule__DictionaryEntry__Group_0__2 ;
    public final void rule__DictionaryEntry__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1023:1: ( rule__DictionaryEntry__Group_0__1__Impl rule__DictionaryEntry__Group_0__2 )
            // InternalMyDsl.g:1024:2: rule__DictionaryEntry__Group_0__1__Impl rule__DictionaryEntry__Group_0__2
            {
            pushFollow(FOLLOW_17);
            rule__DictionaryEntry__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DictionaryEntry__Group_0__2();

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
    // $ANTLR end "rule__DictionaryEntry__Group_0__1"


    // $ANTLR start "rule__DictionaryEntry__Group_0__1__Impl"
    // InternalMyDsl.g:1031:1: rule__DictionaryEntry__Group_0__1__Impl : ( ':' ) ;
    public final void rule__DictionaryEntry__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1035:1: ( ( ':' ) )
            // InternalMyDsl.g:1036:1: ( ':' )
            {
            // InternalMyDsl.g:1036:1: ( ':' )
            // InternalMyDsl.g:1037:2: ':'
            {
             before(grammarAccess.getDictionaryEntryAccess().getColonKeyword_0_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getDictionaryEntryAccess().getColonKeyword_0_1()); 

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
    // $ANTLR end "rule__DictionaryEntry__Group_0__1__Impl"


    // $ANTLR start "rule__DictionaryEntry__Group_0__2"
    // InternalMyDsl.g:1046:1: rule__DictionaryEntry__Group_0__2 : rule__DictionaryEntry__Group_0__2__Impl rule__DictionaryEntry__Group_0__3 ;
    public final void rule__DictionaryEntry__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1050:1: ( rule__DictionaryEntry__Group_0__2__Impl rule__DictionaryEntry__Group_0__3 )
            // InternalMyDsl.g:1051:2: rule__DictionaryEntry__Group_0__2__Impl rule__DictionaryEntry__Group_0__3
            {
            pushFollow(FOLLOW_18);
            rule__DictionaryEntry__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DictionaryEntry__Group_0__3();

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
    // $ANTLR end "rule__DictionaryEntry__Group_0__2"


    // $ANTLR start "rule__DictionaryEntry__Group_0__2__Impl"
    // InternalMyDsl.g:1058:1: rule__DictionaryEntry__Group_0__2__Impl : ( ( rule__DictionaryEntry__FieldTypeAssignment_0_2 ) ) ;
    public final void rule__DictionaryEntry__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1062:1: ( ( ( rule__DictionaryEntry__FieldTypeAssignment_0_2 ) ) )
            // InternalMyDsl.g:1063:1: ( ( rule__DictionaryEntry__FieldTypeAssignment_0_2 ) )
            {
            // InternalMyDsl.g:1063:1: ( ( rule__DictionaryEntry__FieldTypeAssignment_0_2 ) )
            // InternalMyDsl.g:1064:2: ( rule__DictionaryEntry__FieldTypeAssignment_0_2 )
            {
             before(grammarAccess.getDictionaryEntryAccess().getFieldTypeAssignment_0_2()); 
            // InternalMyDsl.g:1065:2: ( rule__DictionaryEntry__FieldTypeAssignment_0_2 )
            // InternalMyDsl.g:1065:3: rule__DictionaryEntry__FieldTypeAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__DictionaryEntry__FieldTypeAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getDictionaryEntryAccess().getFieldTypeAssignment_0_2()); 

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
    // $ANTLR end "rule__DictionaryEntry__Group_0__2__Impl"


    // $ANTLR start "rule__DictionaryEntry__Group_0__3"
    // InternalMyDsl.g:1073:1: rule__DictionaryEntry__Group_0__3 : rule__DictionaryEntry__Group_0__3__Impl rule__DictionaryEntry__Group_0__4 ;
    public final void rule__DictionaryEntry__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1077:1: ( rule__DictionaryEntry__Group_0__3__Impl rule__DictionaryEntry__Group_0__4 )
            // InternalMyDsl.g:1078:2: rule__DictionaryEntry__Group_0__3__Impl rule__DictionaryEntry__Group_0__4
            {
            pushFollow(FOLLOW_18);
            rule__DictionaryEntry__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DictionaryEntry__Group_0__4();

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
    // $ANTLR end "rule__DictionaryEntry__Group_0__3"


    // $ANTLR start "rule__DictionaryEntry__Group_0__3__Impl"
    // InternalMyDsl.g:1085:1: rule__DictionaryEntry__Group_0__3__Impl : ( ( rule__DictionaryEntry__StatusAssignment_0_3 )? ) ;
    public final void rule__DictionaryEntry__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1089:1: ( ( ( rule__DictionaryEntry__StatusAssignment_0_3 )? ) )
            // InternalMyDsl.g:1090:1: ( ( rule__DictionaryEntry__StatusAssignment_0_3 )? )
            {
            // InternalMyDsl.g:1090:1: ( ( rule__DictionaryEntry__StatusAssignment_0_3 )? )
            // InternalMyDsl.g:1091:2: ( rule__DictionaryEntry__StatusAssignment_0_3 )?
            {
             before(grammarAccess.getDictionaryEntryAccess().getStatusAssignment_0_3()); 
            // InternalMyDsl.g:1092:2: ( rule__DictionaryEntry__StatusAssignment_0_3 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==32) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:1092:3: rule__DictionaryEntry__StatusAssignment_0_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__DictionaryEntry__StatusAssignment_0_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDictionaryEntryAccess().getStatusAssignment_0_3()); 

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
    // $ANTLR end "rule__DictionaryEntry__Group_0__3__Impl"


    // $ANTLR start "rule__DictionaryEntry__Group_0__4"
    // InternalMyDsl.g:1100:1: rule__DictionaryEntry__Group_0__4 : rule__DictionaryEntry__Group_0__4__Impl ;
    public final void rule__DictionaryEntry__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1104:1: ( rule__DictionaryEntry__Group_0__4__Impl )
            // InternalMyDsl.g:1105:2: rule__DictionaryEntry__Group_0__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DictionaryEntry__Group_0__4__Impl();

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
    // $ANTLR end "rule__DictionaryEntry__Group_0__4"


    // $ANTLR start "rule__DictionaryEntry__Group_0__4__Impl"
    // InternalMyDsl.g:1111:1: rule__DictionaryEntry__Group_0__4__Impl : ( ( rule__DictionaryEntry__UniqueKeyAssignment_0_4 )? ) ;
    public final void rule__DictionaryEntry__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1115:1: ( ( ( rule__DictionaryEntry__UniqueKeyAssignment_0_4 )? ) )
            // InternalMyDsl.g:1116:1: ( ( rule__DictionaryEntry__UniqueKeyAssignment_0_4 )? )
            {
            // InternalMyDsl.g:1116:1: ( ( rule__DictionaryEntry__UniqueKeyAssignment_0_4 )? )
            // InternalMyDsl.g:1117:2: ( rule__DictionaryEntry__UniqueKeyAssignment_0_4 )?
            {
             before(grammarAccess.getDictionaryEntryAccess().getUniqueKeyAssignment_0_4()); 
            // InternalMyDsl.g:1118:2: ( rule__DictionaryEntry__UniqueKeyAssignment_0_4 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==33) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:1118:3: rule__DictionaryEntry__UniqueKeyAssignment_0_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__DictionaryEntry__UniqueKeyAssignment_0_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDictionaryEntryAccess().getUniqueKeyAssignment_0_4()); 

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
    // $ANTLR end "rule__DictionaryEntry__Group_0__4__Impl"


    // $ANTLR start "rule__DictionaryEntry__Group_1__0"
    // InternalMyDsl.g:1127:1: rule__DictionaryEntry__Group_1__0 : rule__DictionaryEntry__Group_1__0__Impl rule__DictionaryEntry__Group_1__1 ;
    public final void rule__DictionaryEntry__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1131:1: ( rule__DictionaryEntry__Group_1__0__Impl rule__DictionaryEntry__Group_1__1 )
            // InternalMyDsl.g:1132:2: rule__DictionaryEntry__Group_1__0__Impl rule__DictionaryEntry__Group_1__1
            {
            pushFollow(FOLLOW_16);
            rule__DictionaryEntry__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DictionaryEntry__Group_1__1();

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
    // $ANTLR end "rule__DictionaryEntry__Group_1__0"


    // $ANTLR start "rule__DictionaryEntry__Group_1__0__Impl"
    // InternalMyDsl.g:1139:1: rule__DictionaryEntry__Group_1__0__Impl : ( ( rule__DictionaryEntry__NameAssignment_1_0 ) ) ;
    public final void rule__DictionaryEntry__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1143:1: ( ( ( rule__DictionaryEntry__NameAssignment_1_0 ) ) )
            // InternalMyDsl.g:1144:1: ( ( rule__DictionaryEntry__NameAssignment_1_0 ) )
            {
            // InternalMyDsl.g:1144:1: ( ( rule__DictionaryEntry__NameAssignment_1_0 ) )
            // InternalMyDsl.g:1145:2: ( rule__DictionaryEntry__NameAssignment_1_0 )
            {
             before(grammarAccess.getDictionaryEntryAccess().getNameAssignment_1_0()); 
            // InternalMyDsl.g:1146:2: ( rule__DictionaryEntry__NameAssignment_1_0 )
            // InternalMyDsl.g:1146:3: rule__DictionaryEntry__NameAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__DictionaryEntry__NameAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getDictionaryEntryAccess().getNameAssignment_1_0()); 

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
    // $ANTLR end "rule__DictionaryEntry__Group_1__0__Impl"


    // $ANTLR start "rule__DictionaryEntry__Group_1__1"
    // InternalMyDsl.g:1154:1: rule__DictionaryEntry__Group_1__1 : rule__DictionaryEntry__Group_1__1__Impl rule__DictionaryEntry__Group_1__2 ;
    public final void rule__DictionaryEntry__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1158:1: ( rule__DictionaryEntry__Group_1__1__Impl rule__DictionaryEntry__Group_1__2 )
            // InternalMyDsl.g:1159:2: rule__DictionaryEntry__Group_1__1__Impl rule__DictionaryEntry__Group_1__2
            {
            pushFollow(FOLLOW_19);
            rule__DictionaryEntry__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DictionaryEntry__Group_1__2();

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
    // $ANTLR end "rule__DictionaryEntry__Group_1__1"


    // $ANTLR start "rule__DictionaryEntry__Group_1__1__Impl"
    // InternalMyDsl.g:1166:1: rule__DictionaryEntry__Group_1__1__Impl : ( ':' ) ;
    public final void rule__DictionaryEntry__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1170:1: ( ( ':' ) )
            // InternalMyDsl.g:1171:1: ( ':' )
            {
            // InternalMyDsl.g:1171:1: ( ':' )
            // InternalMyDsl.g:1172:2: ':'
            {
             before(grammarAccess.getDictionaryEntryAccess().getColonKeyword_1_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getDictionaryEntryAccess().getColonKeyword_1_1()); 

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
    // $ANTLR end "rule__DictionaryEntry__Group_1__1__Impl"


    // $ANTLR start "rule__DictionaryEntry__Group_1__2"
    // InternalMyDsl.g:1181:1: rule__DictionaryEntry__Group_1__2 : rule__DictionaryEntry__Group_1__2__Impl rule__DictionaryEntry__Group_1__3 ;
    public final void rule__DictionaryEntry__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1185:1: ( rule__DictionaryEntry__Group_1__2__Impl rule__DictionaryEntry__Group_1__3 )
            // InternalMyDsl.g:1186:2: rule__DictionaryEntry__Group_1__2__Impl rule__DictionaryEntry__Group_1__3
            {
            pushFollow(FOLLOW_13);
            rule__DictionaryEntry__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DictionaryEntry__Group_1__3();

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
    // $ANTLR end "rule__DictionaryEntry__Group_1__2"


    // $ANTLR start "rule__DictionaryEntry__Group_1__2__Impl"
    // InternalMyDsl.g:1193:1: rule__DictionaryEntry__Group_1__2__Impl : ( 'ref' ) ;
    public final void rule__DictionaryEntry__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1197:1: ( ( 'ref' ) )
            // InternalMyDsl.g:1198:1: ( 'ref' )
            {
            // InternalMyDsl.g:1198:1: ( 'ref' )
            // InternalMyDsl.g:1199:2: 'ref'
            {
             before(grammarAccess.getDictionaryEntryAccess().getRefKeyword_1_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getDictionaryEntryAccess().getRefKeyword_1_2()); 

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
    // $ANTLR end "rule__DictionaryEntry__Group_1__2__Impl"


    // $ANTLR start "rule__DictionaryEntry__Group_1__3"
    // InternalMyDsl.g:1208:1: rule__DictionaryEntry__Group_1__3 : rule__DictionaryEntry__Group_1__3__Impl ;
    public final void rule__DictionaryEntry__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1212:1: ( rule__DictionaryEntry__Group_1__3__Impl )
            // InternalMyDsl.g:1213:2: rule__DictionaryEntry__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DictionaryEntry__Group_1__3__Impl();

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
    // $ANTLR end "rule__DictionaryEntry__Group_1__3"


    // $ANTLR start "rule__DictionaryEntry__Group_1__3__Impl"
    // InternalMyDsl.g:1219:1: rule__DictionaryEntry__Group_1__3__Impl : ( ( rule__DictionaryEntry__RefDictionaryAssignment_1_3 ) ) ;
    public final void rule__DictionaryEntry__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1223:1: ( ( ( rule__DictionaryEntry__RefDictionaryAssignment_1_3 ) ) )
            // InternalMyDsl.g:1224:1: ( ( rule__DictionaryEntry__RefDictionaryAssignment_1_3 ) )
            {
            // InternalMyDsl.g:1224:1: ( ( rule__DictionaryEntry__RefDictionaryAssignment_1_3 ) )
            // InternalMyDsl.g:1225:2: ( rule__DictionaryEntry__RefDictionaryAssignment_1_3 )
            {
             before(grammarAccess.getDictionaryEntryAccess().getRefDictionaryAssignment_1_3()); 
            // InternalMyDsl.g:1226:2: ( rule__DictionaryEntry__RefDictionaryAssignment_1_3 )
            // InternalMyDsl.g:1226:3: rule__DictionaryEntry__RefDictionaryAssignment_1_3
            {
            pushFollow(FOLLOW_2);
            rule__DictionaryEntry__RefDictionaryAssignment_1_3();

            state._fsp--;


            }

             after(grammarAccess.getDictionaryEntryAccess().getRefDictionaryAssignment_1_3()); 

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
    // $ANTLR end "rule__DictionaryEntry__Group_1__3__Impl"


    // $ANTLR start "rule__OtherOperationStatement__Group_0__0"
    // InternalMyDsl.g:1235:1: rule__OtherOperationStatement__Group_0__0 : rule__OtherOperationStatement__Group_0__0__Impl rule__OtherOperationStatement__Group_0__1 ;
    public final void rule__OtherOperationStatement__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1239:1: ( rule__OtherOperationStatement__Group_0__0__Impl rule__OtherOperationStatement__Group_0__1 )
            // InternalMyDsl.g:1240:2: rule__OtherOperationStatement__Group_0__0__Impl rule__OtherOperationStatement__Group_0__1
            {
            pushFollow(FOLLOW_8);
            rule__OtherOperationStatement__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OtherOperationStatement__Group_0__1();

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
    // $ANTLR end "rule__OtherOperationStatement__Group_0__0"


    // $ANTLR start "rule__OtherOperationStatement__Group_0__0__Impl"
    // InternalMyDsl.g:1247:1: rule__OtherOperationStatement__Group_0__0__Impl : ( 'task:' ) ;
    public final void rule__OtherOperationStatement__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1251:1: ( ( 'task:' ) )
            // InternalMyDsl.g:1252:1: ( 'task:' )
            {
            // InternalMyDsl.g:1252:1: ( 'task:' )
            // InternalMyDsl.g:1253:2: 'task:'
            {
             before(grammarAccess.getOtherOperationStatementAccess().getTaskKeyword_0_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getOtherOperationStatementAccess().getTaskKeyword_0_0()); 

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
    // $ANTLR end "rule__OtherOperationStatement__Group_0__0__Impl"


    // $ANTLR start "rule__OtherOperationStatement__Group_0__1"
    // InternalMyDsl.g:1262:1: rule__OtherOperationStatement__Group_0__1 : rule__OtherOperationStatement__Group_0__1__Impl ;
    public final void rule__OtherOperationStatement__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1266:1: ( rule__OtherOperationStatement__Group_0__1__Impl )
            // InternalMyDsl.g:1267:2: rule__OtherOperationStatement__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OtherOperationStatement__Group_0__1__Impl();

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
    // $ANTLR end "rule__OtherOperationStatement__Group_0__1"


    // $ANTLR start "rule__OtherOperationStatement__Group_0__1__Impl"
    // InternalMyDsl.g:1273:1: rule__OtherOperationStatement__Group_0__1__Impl : ( ( rule__OtherOperationStatement__Group_0_1__0 ) ) ;
    public final void rule__OtherOperationStatement__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1277:1: ( ( ( rule__OtherOperationStatement__Group_0_1__0 ) ) )
            // InternalMyDsl.g:1278:1: ( ( rule__OtherOperationStatement__Group_0_1__0 ) )
            {
            // InternalMyDsl.g:1278:1: ( ( rule__OtherOperationStatement__Group_0_1__0 ) )
            // InternalMyDsl.g:1279:2: ( rule__OtherOperationStatement__Group_0_1__0 )
            {
             before(grammarAccess.getOtherOperationStatementAccess().getGroup_0_1()); 
            // InternalMyDsl.g:1280:2: ( rule__OtherOperationStatement__Group_0_1__0 )
            // InternalMyDsl.g:1280:3: rule__OtherOperationStatement__Group_0_1__0
            {
            pushFollow(FOLLOW_2);
            rule__OtherOperationStatement__Group_0_1__0();

            state._fsp--;


            }

             after(grammarAccess.getOtherOperationStatementAccess().getGroup_0_1()); 

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
    // $ANTLR end "rule__OtherOperationStatement__Group_0__1__Impl"


    // $ANTLR start "rule__OtherOperationStatement__Group_0_1__0"
    // InternalMyDsl.g:1289:1: rule__OtherOperationStatement__Group_0_1__0 : rule__OtherOperationStatement__Group_0_1__0__Impl rule__OtherOperationStatement__Group_0_1__1 ;
    public final void rule__OtherOperationStatement__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1293:1: ( rule__OtherOperationStatement__Group_0_1__0__Impl rule__OtherOperationStatement__Group_0_1__1 )
            // InternalMyDsl.g:1294:2: rule__OtherOperationStatement__Group_0_1__0__Impl rule__OtherOperationStatement__Group_0_1__1
            {
            pushFollow(FOLLOW_20);
            rule__OtherOperationStatement__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OtherOperationStatement__Group_0_1__1();

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
    // $ANTLR end "rule__OtherOperationStatement__Group_0_1__0"


    // $ANTLR start "rule__OtherOperationStatement__Group_0_1__0__Impl"
    // InternalMyDsl.g:1301:1: rule__OtherOperationStatement__Group_0_1__0__Impl : ( '{' ) ;
    public final void rule__OtherOperationStatement__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1305:1: ( ( '{' ) )
            // InternalMyDsl.g:1306:1: ( '{' )
            {
            // InternalMyDsl.g:1306:1: ( '{' )
            // InternalMyDsl.g:1307:2: '{'
            {
             before(grammarAccess.getOtherOperationStatementAccess().getLeftCurlyBracketKeyword_0_1_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getOtherOperationStatementAccess().getLeftCurlyBracketKeyword_0_1_0()); 

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
    // $ANTLR end "rule__OtherOperationStatement__Group_0_1__0__Impl"


    // $ANTLR start "rule__OtherOperationStatement__Group_0_1__1"
    // InternalMyDsl.g:1316:1: rule__OtherOperationStatement__Group_0_1__1 : rule__OtherOperationStatement__Group_0_1__1__Impl rule__OtherOperationStatement__Group_0_1__2 ;
    public final void rule__OtherOperationStatement__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1320:1: ( rule__OtherOperationStatement__Group_0_1__1__Impl rule__OtherOperationStatement__Group_0_1__2 )
            // InternalMyDsl.g:1321:2: rule__OtherOperationStatement__Group_0_1__1__Impl rule__OtherOperationStatement__Group_0_1__2
            {
            pushFollow(FOLLOW_21);
            rule__OtherOperationStatement__Group_0_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OtherOperationStatement__Group_0_1__2();

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
    // $ANTLR end "rule__OtherOperationStatement__Group_0_1__1"


    // $ANTLR start "rule__OtherOperationStatement__Group_0_1__1__Impl"
    // InternalMyDsl.g:1328:1: rule__OtherOperationStatement__Group_0_1__1__Impl : ( 'operation:' ) ;
    public final void rule__OtherOperationStatement__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1332:1: ( ( 'operation:' ) )
            // InternalMyDsl.g:1333:1: ( 'operation:' )
            {
            // InternalMyDsl.g:1333:1: ( 'operation:' )
            // InternalMyDsl.g:1334:2: 'operation:'
            {
             before(grammarAccess.getOtherOperationStatementAccess().getOperationKeyword_0_1_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getOtherOperationStatementAccess().getOperationKeyword_0_1_1()); 

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
    // $ANTLR end "rule__OtherOperationStatement__Group_0_1__1__Impl"


    // $ANTLR start "rule__OtherOperationStatement__Group_0_1__2"
    // InternalMyDsl.g:1343:1: rule__OtherOperationStatement__Group_0_1__2 : rule__OtherOperationStatement__Group_0_1__2__Impl rule__OtherOperationStatement__Group_0_1__3 ;
    public final void rule__OtherOperationStatement__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1347:1: ( rule__OtherOperationStatement__Group_0_1__2__Impl rule__OtherOperationStatement__Group_0_1__3 )
            // InternalMyDsl.g:1348:2: rule__OtherOperationStatement__Group_0_1__2__Impl rule__OtherOperationStatement__Group_0_1__3
            {
            pushFollow(FOLLOW_11);
            rule__OtherOperationStatement__Group_0_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OtherOperationStatement__Group_0_1__3();

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
    // $ANTLR end "rule__OtherOperationStatement__Group_0_1__2"


    // $ANTLR start "rule__OtherOperationStatement__Group_0_1__2__Impl"
    // InternalMyDsl.g:1355:1: rule__OtherOperationStatement__Group_0_1__2__Impl : ( ( rule__OtherOperationStatement__TypeAssignment_0_1_2 ) ) ;
    public final void rule__OtherOperationStatement__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1359:1: ( ( ( rule__OtherOperationStatement__TypeAssignment_0_1_2 ) ) )
            // InternalMyDsl.g:1360:1: ( ( rule__OtherOperationStatement__TypeAssignment_0_1_2 ) )
            {
            // InternalMyDsl.g:1360:1: ( ( rule__OtherOperationStatement__TypeAssignment_0_1_2 ) )
            // InternalMyDsl.g:1361:2: ( rule__OtherOperationStatement__TypeAssignment_0_1_2 )
            {
             before(grammarAccess.getOtherOperationStatementAccess().getTypeAssignment_0_1_2()); 
            // InternalMyDsl.g:1362:2: ( rule__OtherOperationStatement__TypeAssignment_0_1_2 )
            // InternalMyDsl.g:1362:3: rule__OtherOperationStatement__TypeAssignment_0_1_2
            {
            pushFollow(FOLLOW_2);
            rule__OtherOperationStatement__TypeAssignment_0_1_2();

            state._fsp--;


            }

             after(grammarAccess.getOtherOperationStatementAccess().getTypeAssignment_0_1_2()); 

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
    // $ANTLR end "rule__OtherOperationStatement__Group_0_1__2__Impl"


    // $ANTLR start "rule__OtherOperationStatement__Group_0_1__3"
    // InternalMyDsl.g:1370:1: rule__OtherOperationStatement__Group_0_1__3 : rule__OtherOperationStatement__Group_0_1__3__Impl rule__OtherOperationStatement__Group_0_1__4 ;
    public final void rule__OtherOperationStatement__Group_0_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1374:1: ( rule__OtherOperationStatement__Group_0_1__3__Impl rule__OtherOperationStatement__Group_0_1__4 )
            // InternalMyDsl.g:1375:2: rule__OtherOperationStatement__Group_0_1__3__Impl rule__OtherOperationStatement__Group_0_1__4
            {
            pushFollow(FOLLOW_22);
            rule__OtherOperationStatement__Group_0_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OtherOperationStatement__Group_0_1__4();

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
    // $ANTLR end "rule__OtherOperationStatement__Group_0_1__3"


    // $ANTLR start "rule__OtherOperationStatement__Group_0_1__3__Impl"
    // InternalMyDsl.g:1382:1: rule__OtherOperationStatement__Group_0_1__3__Impl : ( ',' ) ;
    public final void rule__OtherOperationStatement__Group_0_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1386:1: ( ( ',' ) )
            // InternalMyDsl.g:1387:1: ( ',' )
            {
            // InternalMyDsl.g:1387:1: ( ',' )
            // InternalMyDsl.g:1388:2: ','
            {
             before(grammarAccess.getOtherOperationStatementAccess().getCommaKeyword_0_1_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getOtherOperationStatementAccess().getCommaKeyword_0_1_3()); 

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
    // $ANTLR end "rule__OtherOperationStatement__Group_0_1__3__Impl"


    // $ANTLR start "rule__OtherOperationStatement__Group_0_1__4"
    // InternalMyDsl.g:1397:1: rule__OtherOperationStatement__Group_0_1__4 : rule__OtherOperationStatement__Group_0_1__4__Impl rule__OtherOperationStatement__Group_0_1__5 ;
    public final void rule__OtherOperationStatement__Group_0_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1401:1: ( rule__OtherOperationStatement__Group_0_1__4__Impl rule__OtherOperationStatement__Group_0_1__5 )
            // InternalMyDsl.g:1402:2: rule__OtherOperationStatement__Group_0_1__4__Impl rule__OtherOperationStatement__Group_0_1__5
            {
            pushFollow(FOLLOW_13);
            rule__OtherOperationStatement__Group_0_1__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OtherOperationStatement__Group_0_1__5();

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
    // $ANTLR end "rule__OtherOperationStatement__Group_0_1__4"


    // $ANTLR start "rule__OtherOperationStatement__Group_0_1__4__Impl"
    // InternalMyDsl.g:1409:1: rule__OtherOperationStatement__Group_0_1__4__Impl : ( 'collection:' ) ;
    public final void rule__OtherOperationStatement__Group_0_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1413:1: ( ( 'collection:' ) )
            // InternalMyDsl.g:1414:1: ( 'collection:' )
            {
            // InternalMyDsl.g:1414:1: ( 'collection:' )
            // InternalMyDsl.g:1415:2: 'collection:'
            {
             before(grammarAccess.getOtherOperationStatementAccess().getCollectionKeyword_0_1_4()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getOtherOperationStatementAccess().getCollectionKeyword_0_1_4()); 

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
    // $ANTLR end "rule__OtherOperationStatement__Group_0_1__4__Impl"


    // $ANTLR start "rule__OtherOperationStatement__Group_0_1__5"
    // InternalMyDsl.g:1424:1: rule__OtherOperationStatement__Group_0_1__5 : rule__OtherOperationStatement__Group_0_1__5__Impl rule__OtherOperationStatement__Group_0_1__6 ;
    public final void rule__OtherOperationStatement__Group_0_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1428:1: ( rule__OtherOperationStatement__Group_0_1__5__Impl rule__OtherOperationStatement__Group_0_1__6 )
            // InternalMyDsl.g:1429:2: rule__OtherOperationStatement__Group_0_1__5__Impl rule__OtherOperationStatement__Group_0_1__6
            {
            pushFollow(FOLLOW_23);
            rule__OtherOperationStatement__Group_0_1__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OtherOperationStatement__Group_0_1__6();

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
    // $ANTLR end "rule__OtherOperationStatement__Group_0_1__5"


    // $ANTLR start "rule__OtherOperationStatement__Group_0_1__5__Impl"
    // InternalMyDsl.g:1436:1: rule__OtherOperationStatement__Group_0_1__5__Impl : ( ( rule__OtherOperationStatement__CollectionAssignment_0_1_5 ) ) ;
    public final void rule__OtherOperationStatement__Group_0_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1440:1: ( ( ( rule__OtherOperationStatement__CollectionAssignment_0_1_5 ) ) )
            // InternalMyDsl.g:1441:1: ( ( rule__OtherOperationStatement__CollectionAssignment_0_1_5 ) )
            {
            // InternalMyDsl.g:1441:1: ( ( rule__OtherOperationStatement__CollectionAssignment_0_1_5 ) )
            // InternalMyDsl.g:1442:2: ( rule__OtherOperationStatement__CollectionAssignment_0_1_5 )
            {
             before(grammarAccess.getOtherOperationStatementAccess().getCollectionAssignment_0_1_5()); 
            // InternalMyDsl.g:1443:2: ( rule__OtherOperationStatement__CollectionAssignment_0_1_5 )
            // InternalMyDsl.g:1443:3: rule__OtherOperationStatement__CollectionAssignment_0_1_5
            {
            pushFollow(FOLLOW_2);
            rule__OtherOperationStatement__CollectionAssignment_0_1_5();

            state._fsp--;


            }

             after(grammarAccess.getOtherOperationStatementAccess().getCollectionAssignment_0_1_5()); 

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
    // $ANTLR end "rule__OtherOperationStatement__Group_0_1__5__Impl"


    // $ANTLR start "rule__OtherOperationStatement__Group_0_1__6"
    // InternalMyDsl.g:1451:1: rule__OtherOperationStatement__Group_0_1__6 : rule__OtherOperationStatement__Group_0_1__6__Impl rule__OtherOperationStatement__Group_0_1__7 ;
    public final void rule__OtherOperationStatement__Group_0_1__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1455:1: ( rule__OtherOperationStatement__Group_0_1__6__Impl rule__OtherOperationStatement__Group_0_1__7 )
            // InternalMyDsl.g:1456:2: rule__OtherOperationStatement__Group_0_1__6__Impl rule__OtherOperationStatement__Group_0_1__7
            {
            pushFollow(FOLLOW_8);
            rule__OtherOperationStatement__Group_0_1__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OtherOperationStatement__Group_0_1__7();

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
    // $ANTLR end "rule__OtherOperationStatement__Group_0_1__6"


    // $ANTLR start "rule__OtherOperationStatement__Group_0_1__6__Impl"
    // InternalMyDsl.g:1463:1: rule__OtherOperationStatement__Group_0_1__6__Impl : ( 'input:' ) ;
    public final void rule__OtherOperationStatement__Group_0_1__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1467:1: ( ( 'input:' ) )
            // InternalMyDsl.g:1468:1: ( 'input:' )
            {
            // InternalMyDsl.g:1468:1: ( 'input:' )
            // InternalMyDsl.g:1469:2: 'input:'
            {
             before(grammarAccess.getOtherOperationStatementAccess().getInputKeyword_0_1_6()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getOtherOperationStatementAccess().getInputKeyword_0_1_6()); 

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
    // $ANTLR end "rule__OtherOperationStatement__Group_0_1__6__Impl"


    // $ANTLR start "rule__OtherOperationStatement__Group_0_1__7"
    // InternalMyDsl.g:1478:1: rule__OtherOperationStatement__Group_0_1__7 : rule__OtherOperationStatement__Group_0_1__7__Impl rule__OtherOperationStatement__Group_0_1__8 ;
    public final void rule__OtherOperationStatement__Group_0_1__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1482:1: ( rule__OtherOperationStatement__Group_0_1__7__Impl rule__OtherOperationStatement__Group_0_1__8 )
            // InternalMyDsl.g:1483:2: rule__OtherOperationStatement__Group_0_1__7__Impl rule__OtherOperationStatement__Group_0_1__8
            {
            pushFollow(FOLLOW_14);
            rule__OtherOperationStatement__Group_0_1__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OtherOperationStatement__Group_0_1__8();

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
    // $ANTLR end "rule__OtherOperationStatement__Group_0_1__7"


    // $ANTLR start "rule__OtherOperationStatement__Group_0_1__7__Impl"
    // InternalMyDsl.g:1490:1: rule__OtherOperationStatement__Group_0_1__7__Impl : ( '{' ) ;
    public final void rule__OtherOperationStatement__Group_0_1__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1494:1: ( ( '{' ) )
            // InternalMyDsl.g:1495:1: ( '{' )
            {
            // InternalMyDsl.g:1495:1: ( '{' )
            // InternalMyDsl.g:1496:2: '{'
            {
             before(grammarAccess.getOtherOperationStatementAccess().getLeftCurlyBracketKeyword_0_1_7()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getOtherOperationStatementAccess().getLeftCurlyBracketKeyword_0_1_7()); 

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
    // $ANTLR end "rule__OtherOperationStatement__Group_0_1__7__Impl"


    // $ANTLR start "rule__OtherOperationStatement__Group_0_1__8"
    // InternalMyDsl.g:1505:1: rule__OtherOperationStatement__Group_0_1__8 : rule__OtherOperationStatement__Group_0_1__8__Impl rule__OtherOperationStatement__Group_0_1__9 ;
    public final void rule__OtherOperationStatement__Group_0_1__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1509:1: ( rule__OtherOperationStatement__Group_0_1__8__Impl rule__OtherOperationStatement__Group_0_1__9 )
            // InternalMyDsl.g:1510:2: rule__OtherOperationStatement__Group_0_1__8__Impl rule__OtherOperationStatement__Group_0_1__9
            {
            pushFollow(FOLLOW_14);
            rule__OtherOperationStatement__Group_0_1__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OtherOperationStatement__Group_0_1__9();

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
    // $ANTLR end "rule__OtherOperationStatement__Group_0_1__8"


    // $ANTLR start "rule__OtherOperationStatement__Group_0_1__8__Impl"
    // InternalMyDsl.g:1517:1: rule__OtherOperationStatement__Group_0_1__8__Impl : ( ( rule__OtherOperationStatement__Group_0_1_8__0 )? ) ;
    public final void rule__OtherOperationStatement__Group_0_1__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1521:1: ( ( ( rule__OtherOperationStatement__Group_0_1_8__0 )? ) )
            // InternalMyDsl.g:1522:1: ( ( rule__OtherOperationStatement__Group_0_1_8__0 )? )
            {
            // InternalMyDsl.g:1522:1: ( ( rule__OtherOperationStatement__Group_0_1_8__0 )? )
            // InternalMyDsl.g:1523:2: ( rule__OtherOperationStatement__Group_0_1_8__0 )?
            {
             before(grammarAccess.getOtherOperationStatementAccess().getGroup_0_1_8()); 
            // InternalMyDsl.g:1524:2: ( rule__OtherOperationStatement__Group_0_1_8__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:1524:3: rule__OtherOperationStatement__Group_0_1_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OtherOperationStatement__Group_0_1_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOtherOperationStatementAccess().getGroup_0_1_8()); 

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
    // $ANTLR end "rule__OtherOperationStatement__Group_0_1__8__Impl"


    // $ANTLR start "rule__OtherOperationStatement__Group_0_1__9"
    // InternalMyDsl.g:1532:1: rule__OtherOperationStatement__Group_0_1__9 : rule__OtherOperationStatement__Group_0_1__9__Impl rule__OtherOperationStatement__Group_0_1__10 ;
    public final void rule__OtherOperationStatement__Group_0_1__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1536:1: ( rule__OtherOperationStatement__Group_0_1__9__Impl rule__OtherOperationStatement__Group_0_1__10 )
            // InternalMyDsl.g:1537:2: rule__OtherOperationStatement__Group_0_1__9__Impl rule__OtherOperationStatement__Group_0_1__10
            {
            pushFollow(FOLLOW_12);
            rule__OtherOperationStatement__Group_0_1__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OtherOperationStatement__Group_0_1__10();

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
    // $ANTLR end "rule__OtherOperationStatement__Group_0_1__9"


    // $ANTLR start "rule__OtherOperationStatement__Group_0_1__9__Impl"
    // InternalMyDsl.g:1544:1: rule__OtherOperationStatement__Group_0_1__9__Impl : ( '}' ) ;
    public final void rule__OtherOperationStatement__Group_0_1__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1548:1: ( ( '}' ) )
            // InternalMyDsl.g:1549:1: ( '}' )
            {
            // InternalMyDsl.g:1549:1: ( '}' )
            // InternalMyDsl.g:1550:2: '}'
            {
             before(grammarAccess.getOtherOperationStatementAccess().getRightCurlyBracketKeyword_0_1_9()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getOtherOperationStatementAccess().getRightCurlyBracketKeyword_0_1_9()); 

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
    // $ANTLR end "rule__OtherOperationStatement__Group_0_1__9__Impl"


    // $ANTLR start "rule__OtherOperationStatement__Group_0_1__10"
    // InternalMyDsl.g:1559:1: rule__OtherOperationStatement__Group_0_1__10 : rule__OtherOperationStatement__Group_0_1__10__Impl ;
    public final void rule__OtherOperationStatement__Group_0_1__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1563:1: ( rule__OtherOperationStatement__Group_0_1__10__Impl )
            // InternalMyDsl.g:1564:2: rule__OtherOperationStatement__Group_0_1__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OtherOperationStatement__Group_0_1__10__Impl();

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
    // $ANTLR end "rule__OtherOperationStatement__Group_0_1__10"


    // $ANTLR start "rule__OtherOperationStatement__Group_0_1__10__Impl"
    // InternalMyDsl.g:1570:1: rule__OtherOperationStatement__Group_0_1__10__Impl : ( '}' ) ;
    public final void rule__OtherOperationStatement__Group_0_1__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1574:1: ( ( '}' ) )
            // InternalMyDsl.g:1575:1: ( '}' )
            {
            // InternalMyDsl.g:1575:1: ( '}' )
            // InternalMyDsl.g:1576:2: '}'
            {
             before(grammarAccess.getOtherOperationStatementAccess().getRightCurlyBracketKeyword_0_1_10()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getOtherOperationStatementAccess().getRightCurlyBracketKeyword_0_1_10()); 

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
    // $ANTLR end "rule__OtherOperationStatement__Group_0_1__10__Impl"


    // $ANTLR start "rule__OtherOperationStatement__Group_0_1_8__0"
    // InternalMyDsl.g:1586:1: rule__OtherOperationStatement__Group_0_1_8__0 : rule__OtherOperationStatement__Group_0_1_8__0__Impl rule__OtherOperationStatement__Group_0_1_8__1 ;
    public final void rule__OtherOperationStatement__Group_0_1_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1590:1: ( rule__OtherOperationStatement__Group_0_1_8__0__Impl rule__OtherOperationStatement__Group_0_1_8__1 )
            // InternalMyDsl.g:1591:2: rule__OtherOperationStatement__Group_0_1_8__0__Impl rule__OtherOperationStatement__Group_0_1_8__1
            {
            pushFollow(FOLLOW_11);
            rule__OtherOperationStatement__Group_0_1_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OtherOperationStatement__Group_0_1_8__1();

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
    // $ANTLR end "rule__OtherOperationStatement__Group_0_1_8__0"


    // $ANTLR start "rule__OtherOperationStatement__Group_0_1_8__0__Impl"
    // InternalMyDsl.g:1598:1: rule__OtherOperationStatement__Group_0_1_8__0__Impl : ( ( rule__OtherOperationStatement__EntriesAssignment_0_1_8_0 ) ) ;
    public final void rule__OtherOperationStatement__Group_0_1_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1602:1: ( ( ( rule__OtherOperationStatement__EntriesAssignment_0_1_8_0 ) ) )
            // InternalMyDsl.g:1603:1: ( ( rule__OtherOperationStatement__EntriesAssignment_0_1_8_0 ) )
            {
            // InternalMyDsl.g:1603:1: ( ( rule__OtherOperationStatement__EntriesAssignment_0_1_8_0 ) )
            // InternalMyDsl.g:1604:2: ( rule__OtherOperationStatement__EntriesAssignment_0_1_8_0 )
            {
             before(grammarAccess.getOtherOperationStatementAccess().getEntriesAssignment_0_1_8_0()); 
            // InternalMyDsl.g:1605:2: ( rule__OtherOperationStatement__EntriesAssignment_0_1_8_0 )
            // InternalMyDsl.g:1605:3: rule__OtherOperationStatement__EntriesAssignment_0_1_8_0
            {
            pushFollow(FOLLOW_2);
            rule__OtherOperationStatement__EntriesAssignment_0_1_8_0();

            state._fsp--;


            }

             after(grammarAccess.getOtherOperationStatementAccess().getEntriesAssignment_0_1_8_0()); 

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
    // $ANTLR end "rule__OtherOperationStatement__Group_0_1_8__0__Impl"


    // $ANTLR start "rule__OtherOperationStatement__Group_0_1_8__1"
    // InternalMyDsl.g:1613:1: rule__OtherOperationStatement__Group_0_1_8__1 : rule__OtherOperationStatement__Group_0_1_8__1__Impl ;
    public final void rule__OtherOperationStatement__Group_0_1_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1617:1: ( rule__OtherOperationStatement__Group_0_1_8__1__Impl )
            // InternalMyDsl.g:1618:2: rule__OtherOperationStatement__Group_0_1_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OtherOperationStatement__Group_0_1_8__1__Impl();

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
    // $ANTLR end "rule__OtherOperationStatement__Group_0_1_8__1"


    // $ANTLR start "rule__OtherOperationStatement__Group_0_1_8__1__Impl"
    // InternalMyDsl.g:1624:1: rule__OtherOperationStatement__Group_0_1_8__1__Impl : ( ( rule__OtherOperationStatement__Group_0_1_8_1__0 )* ) ;
    public final void rule__OtherOperationStatement__Group_0_1_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1628:1: ( ( ( rule__OtherOperationStatement__Group_0_1_8_1__0 )* ) )
            // InternalMyDsl.g:1629:1: ( ( rule__OtherOperationStatement__Group_0_1_8_1__0 )* )
            {
            // InternalMyDsl.g:1629:1: ( ( rule__OtherOperationStatement__Group_0_1_8_1__0 )* )
            // InternalMyDsl.g:1630:2: ( rule__OtherOperationStatement__Group_0_1_8_1__0 )*
            {
             before(grammarAccess.getOtherOperationStatementAccess().getGroup_0_1_8_1()); 
            // InternalMyDsl.g:1631:2: ( rule__OtherOperationStatement__Group_0_1_8_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==21) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMyDsl.g:1631:3: rule__OtherOperationStatement__Group_0_1_8_1__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__OtherOperationStatement__Group_0_1_8_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getOtherOperationStatementAccess().getGroup_0_1_8_1()); 

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
    // $ANTLR end "rule__OtherOperationStatement__Group_0_1_8__1__Impl"


    // $ANTLR start "rule__OtherOperationStatement__Group_0_1_8_1__0"
    // InternalMyDsl.g:1640:1: rule__OtherOperationStatement__Group_0_1_8_1__0 : rule__OtherOperationStatement__Group_0_1_8_1__0__Impl rule__OtherOperationStatement__Group_0_1_8_1__1 ;
    public final void rule__OtherOperationStatement__Group_0_1_8_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1644:1: ( rule__OtherOperationStatement__Group_0_1_8_1__0__Impl rule__OtherOperationStatement__Group_0_1_8_1__1 )
            // InternalMyDsl.g:1645:2: rule__OtherOperationStatement__Group_0_1_8_1__0__Impl rule__OtherOperationStatement__Group_0_1_8_1__1
            {
            pushFollow(FOLLOW_13);
            rule__OtherOperationStatement__Group_0_1_8_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OtherOperationStatement__Group_0_1_8_1__1();

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
    // $ANTLR end "rule__OtherOperationStatement__Group_0_1_8_1__0"


    // $ANTLR start "rule__OtherOperationStatement__Group_0_1_8_1__0__Impl"
    // InternalMyDsl.g:1652:1: rule__OtherOperationStatement__Group_0_1_8_1__0__Impl : ( ',' ) ;
    public final void rule__OtherOperationStatement__Group_0_1_8_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1656:1: ( ( ',' ) )
            // InternalMyDsl.g:1657:1: ( ',' )
            {
            // InternalMyDsl.g:1657:1: ( ',' )
            // InternalMyDsl.g:1658:2: ','
            {
             before(grammarAccess.getOtherOperationStatementAccess().getCommaKeyword_0_1_8_1_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getOtherOperationStatementAccess().getCommaKeyword_0_1_8_1_0()); 

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
    // $ANTLR end "rule__OtherOperationStatement__Group_0_1_8_1__0__Impl"


    // $ANTLR start "rule__OtherOperationStatement__Group_0_1_8_1__1"
    // InternalMyDsl.g:1667:1: rule__OtherOperationStatement__Group_0_1_8_1__1 : rule__OtherOperationStatement__Group_0_1_8_1__1__Impl ;
    public final void rule__OtherOperationStatement__Group_0_1_8_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1671:1: ( rule__OtherOperationStatement__Group_0_1_8_1__1__Impl )
            // InternalMyDsl.g:1672:2: rule__OtherOperationStatement__Group_0_1_8_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OtherOperationStatement__Group_0_1_8_1__1__Impl();

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
    // $ANTLR end "rule__OtherOperationStatement__Group_0_1_8_1__1"


    // $ANTLR start "rule__OtherOperationStatement__Group_0_1_8_1__1__Impl"
    // InternalMyDsl.g:1678:1: rule__OtherOperationStatement__Group_0_1_8_1__1__Impl : ( ( rule__OtherOperationStatement__EntriesAssignment_0_1_8_1_1 ) ) ;
    public final void rule__OtherOperationStatement__Group_0_1_8_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1682:1: ( ( ( rule__OtherOperationStatement__EntriesAssignment_0_1_8_1_1 ) ) )
            // InternalMyDsl.g:1683:1: ( ( rule__OtherOperationStatement__EntriesAssignment_0_1_8_1_1 ) )
            {
            // InternalMyDsl.g:1683:1: ( ( rule__OtherOperationStatement__EntriesAssignment_0_1_8_1_1 ) )
            // InternalMyDsl.g:1684:2: ( rule__OtherOperationStatement__EntriesAssignment_0_1_8_1_1 )
            {
             before(grammarAccess.getOtherOperationStatementAccess().getEntriesAssignment_0_1_8_1_1()); 
            // InternalMyDsl.g:1685:2: ( rule__OtherOperationStatement__EntriesAssignment_0_1_8_1_1 )
            // InternalMyDsl.g:1685:3: rule__OtherOperationStatement__EntriesAssignment_0_1_8_1_1
            {
            pushFollow(FOLLOW_2);
            rule__OtherOperationStatement__EntriesAssignment_0_1_8_1_1();

            state._fsp--;


            }

             after(grammarAccess.getOtherOperationStatementAccess().getEntriesAssignment_0_1_8_1_1()); 

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
    // $ANTLR end "rule__OtherOperationStatement__Group_0_1_8_1__1__Impl"


    // $ANTLR start "rule__OtherOperationStatement__Group_1__0"
    // InternalMyDsl.g:1694:1: rule__OtherOperationStatement__Group_1__0 : rule__OtherOperationStatement__Group_1__0__Impl rule__OtherOperationStatement__Group_1__1 ;
    public final void rule__OtherOperationStatement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1698:1: ( rule__OtherOperationStatement__Group_1__0__Impl rule__OtherOperationStatement__Group_1__1 )
            // InternalMyDsl.g:1699:2: rule__OtherOperationStatement__Group_1__0__Impl rule__OtherOperationStatement__Group_1__1
            {
            pushFollow(FOLLOW_8);
            rule__OtherOperationStatement__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OtherOperationStatement__Group_1__1();

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
    // $ANTLR end "rule__OtherOperationStatement__Group_1__0"


    // $ANTLR start "rule__OtherOperationStatement__Group_1__0__Impl"
    // InternalMyDsl.g:1706:1: rule__OtherOperationStatement__Group_1__0__Impl : ( 'task:' ) ;
    public final void rule__OtherOperationStatement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1710:1: ( ( 'task:' ) )
            // InternalMyDsl.g:1711:1: ( 'task:' )
            {
            // InternalMyDsl.g:1711:1: ( 'task:' )
            // InternalMyDsl.g:1712:2: 'task:'
            {
             before(grammarAccess.getOtherOperationStatementAccess().getTaskKeyword_1_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getOtherOperationStatementAccess().getTaskKeyword_1_0()); 

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
    // $ANTLR end "rule__OtherOperationStatement__Group_1__0__Impl"


    // $ANTLR start "rule__OtherOperationStatement__Group_1__1"
    // InternalMyDsl.g:1721:1: rule__OtherOperationStatement__Group_1__1 : rule__OtherOperationStatement__Group_1__1__Impl ;
    public final void rule__OtherOperationStatement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1725:1: ( rule__OtherOperationStatement__Group_1__1__Impl )
            // InternalMyDsl.g:1726:2: rule__OtherOperationStatement__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OtherOperationStatement__Group_1__1__Impl();

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
    // $ANTLR end "rule__OtherOperationStatement__Group_1__1"


    // $ANTLR start "rule__OtherOperationStatement__Group_1__1__Impl"
    // InternalMyDsl.g:1732:1: rule__OtherOperationStatement__Group_1__1__Impl : ( ( rule__OtherOperationStatement__Group_1_1__0 ) ) ;
    public final void rule__OtherOperationStatement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1736:1: ( ( ( rule__OtherOperationStatement__Group_1_1__0 ) ) )
            // InternalMyDsl.g:1737:1: ( ( rule__OtherOperationStatement__Group_1_1__0 ) )
            {
            // InternalMyDsl.g:1737:1: ( ( rule__OtherOperationStatement__Group_1_1__0 ) )
            // InternalMyDsl.g:1738:2: ( rule__OtherOperationStatement__Group_1_1__0 )
            {
             before(grammarAccess.getOtherOperationStatementAccess().getGroup_1_1()); 
            // InternalMyDsl.g:1739:2: ( rule__OtherOperationStatement__Group_1_1__0 )
            // InternalMyDsl.g:1739:3: rule__OtherOperationStatement__Group_1_1__0
            {
            pushFollow(FOLLOW_2);
            rule__OtherOperationStatement__Group_1_1__0();

            state._fsp--;


            }

             after(grammarAccess.getOtherOperationStatementAccess().getGroup_1_1()); 

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
    // $ANTLR end "rule__OtherOperationStatement__Group_1__1__Impl"


    // $ANTLR start "rule__OtherOperationStatement__Group_1_1__0"
    // InternalMyDsl.g:1748:1: rule__OtherOperationStatement__Group_1_1__0 : rule__OtherOperationStatement__Group_1_1__0__Impl rule__OtherOperationStatement__Group_1_1__1 ;
    public final void rule__OtherOperationStatement__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1752:1: ( rule__OtherOperationStatement__Group_1_1__0__Impl rule__OtherOperationStatement__Group_1_1__1 )
            // InternalMyDsl.g:1753:2: rule__OtherOperationStatement__Group_1_1__0__Impl rule__OtherOperationStatement__Group_1_1__1
            {
            pushFollow(FOLLOW_20);
            rule__OtherOperationStatement__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OtherOperationStatement__Group_1_1__1();

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
    // $ANTLR end "rule__OtherOperationStatement__Group_1_1__0"


    // $ANTLR start "rule__OtherOperationStatement__Group_1_1__0__Impl"
    // InternalMyDsl.g:1760:1: rule__OtherOperationStatement__Group_1_1__0__Impl : ( '{' ) ;
    public final void rule__OtherOperationStatement__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1764:1: ( ( '{' ) )
            // InternalMyDsl.g:1765:1: ( '{' )
            {
            // InternalMyDsl.g:1765:1: ( '{' )
            // InternalMyDsl.g:1766:2: '{'
            {
             before(grammarAccess.getOtherOperationStatementAccess().getLeftCurlyBracketKeyword_1_1_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getOtherOperationStatementAccess().getLeftCurlyBracketKeyword_1_1_0()); 

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
    // $ANTLR end "rule__OtherOperationStatement__Group_1_1__0__Impl"


    // $ANTLR start "rule__OtherOperationStatement__Group_1_1__1"
    // InternalMyDsl.g:1775:1: rule__OtherOperationStatement__Group_1_1__1 : rule__OtherOperationStatement__Group_1_1__1__Impl rule__OtherOperationStatement__Group_1_1__2 ;
    public final void rule__OtherOperationStatement__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1779:1: ( rule__OtherOperationStatement__Group_1_1__1__Impl rule__OtherOperationStatement__Group_1_1__2 )
            // InternalMyDsl.g:1780:2: rule__OtherOperationStatement__Group_1_1__1__Impl rule__OtherOperationStatement__Group_1_1__2
            {
            pushFollow(FOLLOW_24);
            rule__OtherOperationStatement__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OtherOperationStatement__Group_1_1__2();

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
    // $ANTLR end "rule__OtherOperationStatement__Group_1_1__1"


    // $ANTLR start "rule__OtherOperationStatement__Group_1_1__1__Impl"
    // InternalMyDsl.g:1787:1: rule__OtherOperationStatement__Group_1_1__1__Impl : ( 'operation:' ) ;
    public final void rule__OtherOperationStatement__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1791:1: ( ( 'operation:' ) )
            // InternalMyDsl.g:1792:1: ( 'operation:' )
            {
            // InternalMyDsl.g:1792:1: ( 'operation:' )
            // InternalMyDsl.g:1793:2: 'operation:'
            {
             before(grammarAccess.getOtherOperationStatementAccess().getOperationKeyword_1_1_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getOtherOperationStatementAccess().getOperationKeyword_1_1_1()); 

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
    // $ANTLR end "rule__OtherOperationStatement__Group_1_1__1__Impl"


    // $ANTLR start "rule__OtherOperationStatement__Group_1_1__2"
    // InternalMyDsl.g:1802:1: rule__OtherOperationStatement__Group_1_1__2 : rule__OtherOperationStatement__Group_1_1__2__Impl rule__OtherOperationStatement__Group_1_1__3 ;
    public final void rule__OtherOperationStatement__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1806:1: ( rule__OtherOperationStatement__Group_1_1__2__Impl rule__OtherOperationStatement__Group_1_1__3 )
            // InternalMyDsl.g:1807:2: rule__OtherOperationStatement__Group_1_1__2__Impl rule__OtherOperationStatement__Group_1_1__3
            {
            pushFollow(FOLLOW_22);
            rule__OtherOperationStatement__Group_1_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OtherOperationStatement__Group_1_1__3();

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
    // $ANTLR end "rule__OtherOperationStatement__Group_1_1__2"


    // $ANTLR start "rule__OtherOperationStatement__Group_1_1__2__Impl"
    // InternalMyDsl.g:1814:1: rule__OtherOperationStatement__Group_1_1__2__Impl : ( ( rule__OtherOperationStatement__TypeAssignment_1_1_2 ) ) ;
    public final void rule__OtherOperationStatement__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1818:1: ( ( ( rule__OtherOperationStatement__TypeAssignment_1_1_2 ) ) )
            // InternalMyDsl.g:1819:1: ( ( rule__OtherOperationStatement__TypeAssignment_1_1_2 ) )
            {
            // InternalMyDsl.g:1819:1: ( ( rule__OtherOperationStatement__TypeAssignment_1_1_2 ) )
            // InternalMyDsl.g:1820:2: ( rule__OtherOperationStatement__TypeAssignment_1_1_2 )
            {
             before(grammarAccess.getOtherOperationStatementAccess().getTypeAssignment_1_1_2()); 
            // InternalMyDsl.g:1821:2: ( rule__OtherOperationStatement__TypeAssignment_1_1_2 )
            // InternalMyDsl.g:1821:3: rule__OtherOperationStatement__TypeAssignment_1_1_2
            {
            pushFollow(FOLLOW_2);
            rule__OtherOperationStatement__TypeAssignment_1_1_2();

            state._fsp--;


            }

             after(grammarAccess.getOtherOperationStatementAccess().getTypeAssignment_1_1_2()); 

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
    // $ANTLR end "rule__OtherOperationStatement__Group_1_1__2__Impl"


    // $ANTLR start "rule__OtherOperationStatement__Group_1_1__3"
    // InternalMyDsl.g:1829:1: rule__OtherOperationStatement__Group_1_1__3 : rule__OtherOperationStatement__Group_1_1__3__Impl rule__OtherOperationStatement__Group_1_1__4 ;
    public final void rule__OtherOperationStatement__Group_1_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1833:1: ( rule__OtherOperationStatement__Group_1_1__3__Impl rule__OtherOperationStatement__Group_1_1__4 )
            // InternalMyDsl.g:1834:2: rule__OtherOperationStatement__Group_1_1__3__Impl rule__OtherOperationStatement__Group_1_1__4
            {
            pushFollow(FOLLOW_13);
            rule__OtherOperationStatement__Group_1_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OtherOperationStatement__Group_1_1__4();

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
    // $ANTLR end "rule__OtherOperationStatement__Group_1_1__3"


    // $ANTLR start "rule__OtherOperationStatement__Group_1_1__3__Impl"
    // InternalMyDsl.g:1841:1: rule__OtherOperationStatement__Group_1_1__3__Impl : ( 'collection:' ) ;
    public final void rule__OtherOperationStatement__Group_1_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1845:1: ( ( 'collection:' ) )
            // InternalMyDsl.g:1846:1: ( 'collection:' )
            {
            // InternalMyDsl.g:1846:1: ( 'collection:' )
            // InternalMyDsl.g:1847:2: 'collection:'
            {
             before(grammarAccess.getOtherOperationStatementAccess().getCollectionKeyword_1_1_3()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getOtherOperationStatementAccess().getCollectionKeyword_1_1_3()); 

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
    // $ANTLR end "rule__OtherOperationStatement__Group_1_1__3__Impl"


    // $ANTLR start "rule__OtherOperationStatement__Group_1_1__4"
    // InternalMyDsl.g:1856:1: rule__OtherOperationStatement__Group_1_1__4 : rule__OtherOperationStatement__Group_1_1__4__Impl rule__OtherOperationStatement__Group_1_1__5 ;
    public final void rule__OtherOperationStatement__Group_1_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1860:1: ( rule__OtherOperationStatement__Group_1_1__4__Impl rule__OtherOperationStatement__Group_1_1__5 )
            // InternalMyDsl.g:1861:2: rule__OtherOperationStatement__Group_1_1__4__Impl rule__OtherOperationStatement__Group_1_1__5
            {
            pushFollow(FOLLOW_23);
            rule__OtherOperationStatement__Group_1_1__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OtherOperationStatement__Group_1_1__5();

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
    // $ANTLR end "rule__OtherOperationStatement__Group_1_1__4"


    // $ANTLR start "rule__OtherOperationStatement__Group_1_1__4__Impl"
    // InternalMyDsl.g:1868:1: rule__OtherOperationStatement__Group_1_1__4__Impl : ( ( rule__OtherOperationStatement__CollectionAssignment_1_1_4 ) ) ;
    public final void rule__OtherOperationStatement__Group_1_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1872:1: ( ( ( rule__OtherOperationStatement__CollectionAssignment_1_1_4 ) ) )
            // InternalMyDsl.g:1873:1: ( ( rule__OtherOperationStatement__CollectionAssignment_1_1_4 ) )
            {
            // InternalMyDsl.g:1873:1: ( ( rule__OtherOperationStatement__CollectionAssignment_1_1_4 ) )
            // InternalMyDsl.g:1874:2: ( rule__OtherOperationStatement__CollectionAssignment_1_1_4 )
            {
             before(grammarAccess.getOtherOperationStatementAccess().getCollectionAssignment_1_1_4()); 
            // InternalMyDsl.g:1875:2: ( rule__OtherOperationStatement__CollectionAssignment_1_1_4 )
            // InternalMyDsl.g:1875:3: rule__OtherOperationStatement__CollectionAssignment_1_1_4
            {
            pushFollow(FOLLOW_2);
            rule__OtherOperationStatement__CollectionAssignment_1_1_4();

            state._fsp--;


            }

             after(grammarAccess.getOtherOperationStatementAccess().getCollectionAssignment_1_1_4()); 

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
    // $ANTLR end "rule__OtherOperationStatement__Group_1_1__4__Impl"


    // $ANTLR start "rule__OtherOperationStatement__Group_1_1__5"
    // InternalMyDsl.g:1883:1: rule__OtherOperationStatement__Group_1_1__5 : rule__OtherOperationStatement__Group_1_1__5__Impl rule__OtherOperationStatement__Group_1_1__6 ;
    public final void rule__OtherOperationStatement__Group_1_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1887:1: ( rule__OtherOperationStatement__Group_1_1__5__Impl rule__OtherOperationStatement__Group_1_1__6 )
            // InternalMyDsl.g:1888:2: rule__OtherOperationStatement__Group_1_1__5__Impl rule__OtherOperationStatement__Group_1_1__6
            {
            pushFollow(FOLLOW_8);
            rule__OtherOperationStatement__Group_1_1__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OtherOperationStatement__Group_1_1__6();

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
    // $ANTLR end "rule__OtherOperationStatement__Group_1_1__5"


    // $ANTLR start "rule__OtherOperationStatement__Group_1_1__5__Impl"
    // InternalMyDsl.g:1895:1: rule__OtherOperationStatement__Group_1_1__5__Impl : ( 'input:' ) ;
    public final void rule__OtherOperationStatement__Group_1_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1899:1: ( ( 'input:' ) )
            // InternalMyDsl.g:1900:1: ( 'input:' )
            {
            // InternalMyDsl.g:1900:1: ( 'input:' )
            // InternalMyDsl.g:1901:2: 'input:'
            {
             before(grammarAccess.getOtherOperationStatementAccess().getInputKeyword_1_1_5()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getOtherOperationStatementAccess().getInputKeyword_1_1_5()); 

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
    // $ANTLR end "rule__OtherOperationStatement__Group_1_1__5__Impl"


    // $ANTLR start "rule__OtherOperationStatement__Group_1_1__6"
    // InternalMyDsl.g:1910:1: rule__OtherOperationStatement__Group_1_1__6 : rule__OtherOperationStatement__Group_1_1__6__Impl rule__OtherOperationStatement__Group_1_1__7 ;
    public final void rule__OtherOperationStatement__Group_1_1__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1914:1: ( rule__OtherOperationStatement__Group_1_1__6__Impl rule__OtherOperationStatement__Group_1_1__7 )
            // InternalMyDsl.g:1915:2: rule__OtherOperationStatement__Group_1_1__6__Impl rule__OtherOperationStatement__Group_1_1__7
            {
            pushFollow(FOLLOW_14);
            rule__OtherOperationStatement__Group_1_1__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OtherOperationStatement__Group_1_1__7();

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
    // $ANTLR end "rule__OtherOperationStatement__Group_1_1__6"


    // $ANTLR start "rule__OtherOperationStatement__Group_1_1__6__Impl"
    // InternalMyDsl.g:1922:1: rule__OtherOperationStatement__Group_1_1__6__Impl : ( '{' ) ;
    public final void rule__OtherOperationStatement__Group_1_1__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1926:1: ( ( '{' ) )
            // InternalMyDsl.g:1927:1: ( '{' )
            {
            // InternalMyDsl.g:1927:1: ( '{' )
            // InternalMyDsl.g:1928:2: '{'
            {
             before(grammarAccess.getOtherOperationStatementAccess().getLeftCurlyBracketKeyword_1_1_6()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getOtherOperationStatementAccess().getLeftCurlyBracketKeyword_1_1_6()); 

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
    // $ANTLR end "rule__OtherOperationStatement__Group_1_1__6__Impl"


    // $ANTLR start "rule__OtherOperationStatement__Group_1_1__7"
    // InternalMyDsl.g:1937:1: rule__OtherOperationStatement__Group_1_1__7 : rule__OtherOperationStatement__Group_1_1__7__Impl rule__OtherOperationStatement__Group_1_1__8 ;
    public final void rule__OtherOperationStatement__Group_1_1__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1941:1: ( rule__OtherOperationStatement__Group_1_1__7__Impl rule__OtherOperationStatement__Group_1_1__8 )
            // InternalMyDsl.g:1942:2: rule__OtherOperationStatement__Group_1_1__7__Impl rule__OtherOperationStatement__Group_1_1__8
            {
            pushFollow(FOLLOW_14);
            rule__OtherOperationStatement__Group_1_1__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OtherOperationStatement__Group_1_1__8();

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
    // $ANTLR end "rule__OtherOperationStatement__Group_1_1__7"


    // $ANTLR start "rule__OtherOperationStatement__Group_1_1__7__Impl"
    // InternalMyDsl.g:1949:1: rule__OtherOperationStatement__Group_1_1__7__Impl : ( ( rule__OtherOperationStatement__Group_1_1_7__0 )? ) ;
    public final void rule__OtherOperationStatement__Group_1_1__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1953:1: ( ( ( rule__OtherOperationStatement__Group_1_1_7__0 )? ) )
            // InternalMyDsl.g:1954:1: ( ( rule__OtherOperationStatement__Group_1_1_7__0 )? )
            {
            // InternalMyDsl.g:1954:1: ( ( rule__OtherOperationStatement__Group_1_1_7__0 )? )
            // InternalMyDsl.g:1955:2: ( rule__OtherOperationStatement__Group_1_1_7__0 )?
            {
             before(grammarAccess.getOtherOperationStatementAccess().getGroup_1_1_7()); 
            // InternalMyDsl.g:1956:2: ( rule__OtherOperationStatement__Group_1_1_7__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:1956:3: rule__OtherOperationStatement__Group_1_1_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OtherOperationStatement__Group_1_1_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOtherOperationStatementAccess().getGroup_1_1_7()); 

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
    // $ANTLR end "rule__OtherOperationStatement__Group_1_1__7__Impl"


    // $ANTLR start "rule__OtherOperationStatement__Group_1_1__8"
    // InternalMyDsl.g:1964:1: rule__OtherOperationStatement__Group_1_1__8 : rule__OtherOperationStatement__Group_1_1__8__Impl rule__OtherOperationStatement__Group_1_1__9 ;
    public final void rule__OtherOperationStatement__Group_1_1__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1968:1: ( rule__OtherOperationStatement__Group_1_1__8__Impl rule__OtherOperationStatement__Group_1_1__9 )
            // InternalMyDsl.g:1969:2: rule__OtherOperationStatement__Group_1_1__8__Impl rule__OtherOperationStatement__Group_1_1__9
            {
            pushFollow(FOLLOW_25);
            rule__OtherOperationStatement__Group_1_1__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OtherOperationStatement__Group_1_1__9();

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
    // $ANTLR end "rule__OtherOperationStatement__Group_1_1__8"


    // $ANTLR start "rule__OtherOperationStatement__Group_1_1__8__Impl"
    // InternalMyDsl.g:1976:1: rule__OtherOperationStatement__Group_1_1__8__Impl : ( '}' ) ;
    public final void rule__OtherOperationStatement__Group_1_1__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1980:1: ( ( '}' ) )
            // InternalMyDsl.g:1981:1: ( '}' )
            {
            // InternalMyDsl.g:1981:1: ( '}' )
            // InternalMyDsl.g:1982:2: '}'
            {
             before(grammarAccess.getOtherOperationStatementAccess().getRightCurlyBracketKeyword_1_1_8()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getOtherOperationStatementAccess().getRightCurlyBracketKeyword_1_1_8()); 

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
    // $ANTLR end "rule__OtherOperationStatement__Group_1_1__8__Impl"


    // $ANTLR start "rule__OtherOperationStatement__Group_1_1__9"
    // InternalMyDsl.g:1991:1: rule__OtherOperationStatement__Group_1_1__9 : rule__OtherOperationStatement__Group_1_1__9__Impl rule__OtherOperationStatement__Group_1_1__10 ;
    public final void rule__OtherOperationStatement__Group_1_1__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1995:1: ( rule__OtherOperationStatement__Group_1_1__9__Impl rule__OtherOperationStatement__Group_1_1__10 )
            // InternalMyDsl.g:1996:2: rule__OtherOperationStatement__Group_1_1__9__Impl rule__OtherOperationStatement__Group_1_1__10
            {
            pushFollow(FOLLOW_25);
            rule__OtherOperationStatement__Group_1_1__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OtherOperationStatement__Group_1_1__10();

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
    // $ANTLR end "rule__OtherOperationStatement__Group_1_1__9"


    // $ANTLR start "rule__OtherOperationStatement__Group_1_1__9__Impl"
    // InternalMyDsl.g:2003:1: rule__OtherOperationStatement__Group_1_1__9__Impl : ( ( rule__OtherOperationStatement__Group_1_1_9__0 )? ) ;
    public final void rule__OtherOperationStatement__Group_1_1__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2007:1: ( ( ( rule__OtherOperationStatement__Group_1_1_9__0 )? ) )
            // InternalMyDsl.g:2008:1: ( ( rule__OtherOperationStatement__Group_1_1_9__0 )? )
            {
            // InternalMyDsl.g:2008:1: ( ( rule__OtherOperationStatement__Group_1_1_9__0 )? )
            // InternalMyDsl.g:2009:2: ( rule__OtherOperationStatement__Group_1_1_9__0 )?
            {
             before(grammarAccess.getOtherOperationStatementAccess().getGroup_1_1_9()); 
            // InternalMyDsl.g:2010:2: ( rule__OtherOperationStatement__Group_1_1_9__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==21) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:2010:3: rule__OtherOperationStatement__Group_1_1_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OtherOperationStatement__Group_1_1_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOtherOperationStatementAccess().getGroup_1_1_9()); 

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
    // $ANTLR end "rule__OtherOperationStatement__Group_1_1__9__Impl"


    // $ANTLR start "rule__OtherOperationStatement__Group_1_1__10"
    // InternalMyDsl.g:2018:1: rule__OtherOperationStatement__Group_1_1__10 : rule__OtherOperationStatement__Group_1_1__10__Impl ;
    public final void rule__OtherOperationStatement__Group_1_1__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2022:1: ( rule__OtherOperationStatement__Group_1_1__10__Impl )
            // InternalMyDsl.g:2023:2: rule__OtherOperationStatement__Group_1_1__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OtherOperationStatement__Group_1_1__10__Impl();

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
    // $ANTLR end "rule__OtherOperationStatement__Group_1_1__10"


    // $ANTLR start "rule__OtherOperationStatement__Group_1_1__10__Impl"
    // InternalMyDsl.g:2029:1: rule__OtherOperationStatement__Group_1_1__10__Impl : ( '}' ) ;
    public final void rule__OtherOperationStatement__Group_1_1__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2033:1: ( ( '}' ) )
            // InternalMyDsl.g:2034:1: ( '}' )
            {
            // InternalMyDsl.g:2034:1: ( '}' )
            // InternalMyDsl.g:2035:2: '}'
            {
             before(grammarAccess.getOtherOperationStatementAccess().getRightCurlyBracketKeyword_1_1_10()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getOtherOperationStatementAccess().getRightCurlyBracketKeyword_1_1_10()); 

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
    // $ANTLR end "rule__OtherOperationStatement__Group_1_1__10__Impl"


    // $ANTLR start "rule__OtherOperationStatement__Group_1_1_7__0"
    // InternalMyDsl.g:2045:1: rule__OtherOperationStatement__Group_1_1_7__0 : rule__OtherOperationStatement__Group_1_1_7__0__Impl rule__OtherOperationStatement__Group_1_1_7__1 ;
    public final void rule__OtherOperationStatement__Group_1_1_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2049:1: ( rule__OtherOperationStatement__Group_1_1_7__0__Impl rule__OtherOperationStatement__Group_1_1_7__1 )
            // InternalMyDsl.g:2050:2: rule__OtherOperationStatement__Group_1_1_7__0__Impl rule__OtherOperationStatement__Group_1_1_7__1
            {
            pushFollow(FOLLOW_11);
            rule__OtherOperationStatement__Group_1_1_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OtherOperationStatement__Group_1_1_7__1();

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
    // $ANTLR end "rule__OtherOperationStatement__Group_1_1_7__0"


    // $ANTLR start "rule__OtherOperationStatement__Group_1_1_7__0__Impl"
    // InternalMyDsl.g:2057:1: rule__OtherOperationStatement__Group_1_1_7__0__Impl : ( ( rule__OtherOperationStatement__EntriesAssignment_1_1_7_0 ) ) ;
    public final void rule__OtherOperationStatement__Group_1_1_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2061:1: ( ( ( rule__OtherOperationStatement__EntriesAssignment_1_1_7_0 ) ) )
            // InternalMyDsl.g:2062:1: ( ( rule__OtherOperationStatement__EntriesAssignment_1_1_7_0 ) )
            {
            // InternalMyDsl.g:2062:1: ( ( rule__OtherOperationStatement__EntriesAssignment_1_1_7_0 ) )
            // InternalMyDsl.g:2063:2: ( rule__OtherOperationStatement__EntriesAssignment_1_1_7_0 )
            {
             before(grammarAccess.getOtherOperationStatementAccess().getEntriesAssignment_1_1_7_0()); 
            // InternalMyDsl.g:2064:2: ( rule__OtherOperationStatement__EntriesAssignment_1_1_7_0 )
            // InternalMyDsl.g:2064:3: rule__OtherOperationStatement__EntriesAssignment_1_1_7_0
            {
            pushFollow(FOLLOW_2);
            rule__OtherOperationStatement__EntriesAssignment_1_1_7_0();

            state._fsp--;


            }

             after(grammarAccess.getOtherOperationStatementAccess().getEntriesAssignment_1_1_7_0()); 

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
    // $ANTLR end "rule__OtherOperationStatement__Group_1_1_7__0__Impl"


    // $ANTLR start "rule__OtherOperationStatement__Group_1_1_7__1"
    // InternalMyDsl.g:2072:1: rule__OtherOperationStatement__Group_1_1_7__1 : rule__OtherOperationStatement__Group_1_1_7__1__Impl ;
    public final void rule__OtherOperationStatement__Group_1_1_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2076:1: ( rule__OtherOperationStatement__Group_1_1_7__1__Impl )
            // InternalMyDsl.g:2077:2: rule__OtherOperationStatement__Group_1_1_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OtherOperationStatement__Group_1_1_7__1__Impl();

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
    // $ANTLR end "rule__OtherOperationStatement__Group_1_1_7__1"


    // $ANTLR start "rule__OtherOperationStatement__Group_1_1_7__1__Impl"
    // InternalMyDsl.g:2083:1: rule__OtherOperationStatement__Group_1_1_7__1__Impl : ( ( rule__OtherOperationStatement__Group_1_1_7_1__0 )* ) ;
    public final void rule__OtherOperationStatement__Group_1_1_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2087:1: ( ( ( rule__OtherOperationStatement__Group_1_1_7_1__0 )* ) )
            // InternalMyDsl.g:2088:1: ( ( rule__OtherOperationStatement__Group_1_1_7_1__0 )* )
            {
            // InternalMyDsl.g:2088:1: ( ( rule__OtherOperationStatement__Group_1_1_7_1__0 )* )
            // InternalMyDsl.g:2089:2: ( rule__OtherOperationStatement__Group_1_1_7_1__0 )*
            {
             before(grammarAccess.getOtherOperationStatementAccess().getGroup_1_1_7_1()); 
            // InternalMyDsl.g:2090:2: ( rule__OtherOperationStatement__Group_1_1_7_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==21) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalMyDsl.g:2090:3: rule__OtherOperationStatement__Group_1_1_7_1__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__OtherOperationStatement__Group_1_1_7_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getOtherOperationStatementAccess().getGroup_1_1_7_1()); 

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
    // $ANTLR end "rule__OtherOperationStatement__Group_1_1_7__1__Impl"


    // $ANTLR start "rule__OtherOperationStatement__Group_1_1_7_1__0"
    // InternalMyDsl.g:2099:1: rule__OtherOperationStatement__Group_1_1_7_1__0 : rule__OtherOperationStatement__Group_1_1_7_1__0__Impl rule__OtherOperationStatement__Group_1_1_7_1__1 ;
    public final void rule__OtherOperationStatement__Group_1_1_7_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2103:1: ( rule__OtherOperationStatement__Group_1_1_7_1__0__Impl rule__OtherOperationStatement__Group_1_1_7_1__1 )
            // InternalMyDsl.g:2104:2: rule__OtherOperationStatement__Group_1_1_7_1__0__Impl rule__OtherOperationStatement__Group_1_1_7_1__1
            {
            pushFollow(FOLLOW_13);
            rule__OtherOperationStatement__Group_1_1_7_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OtherOperationStatement__Group_1_1_7_1__1();

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
    // $ANTLR end "rule__OtherOperationStatement__Group_1_1_7_1__0"


    // $ANTLR start "rule__OtherOperationStatement__Group_1_1_7_1__0__Impl"
    // InternalMyDsl.g:2111:1: rule__OtherOperationStatement__Group_1_1_7_1__0__Impl : ( ',' ) ;
    public final void rule__OtherOperationStatement__Group_1_1_7_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2115:1: ( ( ',' ) )
            // InternalMyDsl.g:2116:1: ( ',' )
            {
            // InternalMyDsl.g:2116:1: ( ',' )
            // InternalMyDsl.g:2117:2: ','
            {
             before(grammarAccess.getOtherOperationStatementAccess().getCommaKeyword_1_1_7_1_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getOtherOperationStatementAccess().getCommaKeyword_1_1_7_1_0()); 

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
    // $ANTLR end "rule__OtherOperationStatement__Group_1_1_7_1__0__Impl"


    // $ANTLR start "rule__OtherOperationStatement__Group_1_1_7_1__1"
    // InternalMyDsl.g:2126:1: rule__OtherOperationStatement__Group_1_1_7_1__1 : rule__OtherOperationStatement__Group_1_1_7_1__1__Impl ;
    public final void rule__OtherOperationStatement__Group_1_1_7_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2130:1: ( rule__OtherOperationStatement__Group_1_1_7_1__1__Impl )
            // InternalMyDsl.g:2131:2: rule__OtherOperationStatement__Group_1_1_7_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OtherOperationStatement__Group_1_1_7_1__1__Impl();

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
    // $ANTLR end "rule__OtherOperationStatement__Group_1_1_7_1__1"


    // $ANTLR start "rule__OtherOperationStatement__Group_1_1_7_1__1__Impl"
    // InternalMyDsl.g:2137:1: rule__OtherOperationStatement__Group_1_1_7_1__1__Impl : ( ( rule__OtherOperationStatement__EntriesAssignment_1_1_7_1_1 ) ) ;
    public final void rule__OtherOperationStatement__Group_1_1_7_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2141:1: ( ( ( rule__OtherOperationStatement__EntriesAssignment_1_1_7_1_1 ) ) )
            // InternalMyDsl.g:2142:1: ( ( rule__OtherOperationStatement__EntriesAssignment_1_1_7_1_1 ) )
            {
            // InternalMyDsl.g:2142:1: ( ( rule__OtherOperationStatement__EntriesAssignment_1_1_7_1_1 ) )
            // InternalMyDsl.g:2143:2: ( rule__OtherOperationStatement__EntriesAssignment_1_1_7_1_1 )
            {
             before(grammarAccess.getOtherOperationStatementAccess().getEntriesAssignment_1_1_7_1_1()); 
            // InternalMyDsl.g:2144:2: ( rule__OtherOperationStatement__EntriesAssignment_1_1_7_1_1 )
            // InternalMyDsl.g:2144:3: rule__OtherOperationStatement__EntriesAssignment_1_1_7_1_1
            {
            pushFollow(FOLLOW_2);
            rule__OtherOperationStatement__EntriesAssignment_1_1_7_1_1();

            state._fsp--;


            }

             after(grammarAccess.getOtherOperationStatementAccess().getEntriesAssignment_1_1_7_1_1()); 

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
    // $ANTLR end "rule__OtherOperationStatement__Group_1_1_7_1__1__Impl"


    // $ANTLR start "rule__OtherOperationStatement__Group_1_1_9__0"
    // InternalMyDsl.g:2153:1: rule__OtherOperationStatement__Group_1_1_9__0 : rule__OtherOperationStatement__Group_1_1_9__0__Impl rule__OtherOperationStatement__Group_1_1_9__1 ;
    public final void rule__OtherOperationStatement__Group_1_1_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2157:1: ( rule__OtherOperationStatement__Group_1_1_9__0__Impl rule__OtherOperationStatement__Group_1_1_9__1 )
            // InternalMyDsl.g:2158:2: rule__OtherOperationStatement__Group_1_1_9__0__Impl rule__OtherOperationStatement__Group_1_1_9__1
            {
            pushFollow(FOLLOW_26);
            rule__OtherOperationStatement__Group_1_1_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OtherOperationStatement__Group_1_1_9__1();

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
    // $ANTLR end "rule__OtherOperationStatement__Group_1_1_9__0"


    // $ANTLR start "rule__OtherOperationStatement__Group_1_1_9__0__Impl"
    // InternalMyDsl.g:2165:1: rule__OtherOperationStatement__Group_1_1_9__0__Impl : ( ',' ) ;
    public final void rule__OtherOperationStatement__Group_1_1_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2169:1: ( ( ',' ) )
            // InternalMyDsl.g:2170:1: ( ',' )
            {
            // InternalMyDsl.g:2170:1: ( ',' )
            // InternalMyDsl.g:2171:2: ','
            {
             before(grammarAccess.getOtherOperationStatementAccess().getCommaKeyword_1_1_9_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getOtherOperationStatementAccess().getCommaKeyword_1_1_9_0()); 

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
    // $ANTLR end "rule__OtherOperationStatement__Group_1_1_9__0__Impl"


    // $ANTLR start "rule__OtherOperationStatement__Group_1_1_9__1"
    // InternalMyDsl.g:2180:1: rule__OtherOperationStatement__Group_1_1_9__1 : rule__OtherOperationStatement__Group_1_1_9__1__Impl rule__OtherOperationStatement__Group_1_1_9__2 ;
    public final void rule__OtherOperationStatement__Group_1_1_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2184:1: ( rule__OtherOperationStatement__Group_1_1_9__1__Impl rule__OtherOperationStatement__Group_1_1_9__2 )
            // InternalMyDsl.g:2185:2: rule__OtherOperationStatement__Group_1_1_9__1__Impl rule__OtherOperationStatement__Group_1_1_9__2
            {
            pushFollow(FOLLOW_8);
            rule__OtherOperationStatement__Group_1_1_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OtherOperationStatement__Group_1_1_9__2();

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
    // $ANTLR end "rule__OtherOperationStatement__Group_1_1_9__1"


    // $ANTLR start "rule__OtherOperationStatement__Group_1_1_9__1__Impl"
    // InternalMyDsl.g:2192:1: rule__OtherOperationStatement__Group_1_1_9__1__Impl : ( 'update:' ) ;
    public final void rule__OtherOperationStatement__Group_1_1_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2196:1: ( ( 'update:' ) )
            // InternalMyDsl.g:2197:1: ( 'update:' )
            {
            // InternalMyDsl.g:2197:1: ( 'update:' )
            // InternalMyDsl.g:2198:2: 'update:'
            {
             before(grammarAccess.getOtherOperationStatementAccess().getUpdateKeyword_1_1_9_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getOtherOperationStatementAccess().getUpdateKeyword_1_1_9_1()); 

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
    // $ANTLR end "rule__OtherOperationStatement__Group_1_1_9__1__Impl"


    // $ANTLR start "rule__OtherOperationStatement__Group_1_1_9__2"
    // InternalMyDsl.g:2207:1: rule__OtherOperationStatement__Group_1_1_9__2 : rule__OtherOperationStatement__Group_1_1_9__2__Impl rule__OtherOperationStatement__Group_1_1_9__3 ;
    public final void rule__OtherOperationStatement__Group_1_1_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2211:1: ( rule__OtherOperationStatement__Group_1_1_9__2__Impl rule__OtherOperationStatement__Group_1_1_9__3 )
            // InternalMyDsl.g:2212:2: rule__OtherOperationStatement__Group_1_1_9__2__Impl rule__OtherOperationStatement__Group_1_1_9__3
            {
            pushFollow(FOLLOW_14);
            rule__OtherOperationStatement__Group_1_1_9__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OtherOperationStatement__Group_1_1_9__3();

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
    // $ANTLR end "rule__OtherOperationStatement__Group_1_1_9__2"


    // $ANTLR start "rule__OtherOperationStatement__Group_1_1_9__2__Impl"
    // InternalMyDsl.g:2219:1: rule__OtherOperationStatement__Group_1_1_9__2__Impl : ( '{' ) ;
    public final void rule__OtherOperationStatement__Group_1_1_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2223:1: ( ( '{' ) )
            // InternalMyDsl.g:2224:1: ( '{' )
            {
            // InternalMyDsl.g:2224:1: ( '{' )
            // InternalMyDsl.g:2225:2: '{'
            {
             before(grammarAccess.getOtherOperationStatementAccess().getLeftCurlyBracketKeyword_1_1_9_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getOtherOperationStatementAccess().getLeftCurlyBracketKeyword_1_1_9_2()); 

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
    // $ANTLR end "rule__OtherOperationStatement__Group_1_1_9__2__Impl"


    // $ANTLR start "rule__OtherOperationStatement__Group_1_1_9__3"
    // InternalMyDsl.g:2234:1: rule__OtherOperationStatement__Group_1_1_9__3 : rule__OtherOperationStatement__Group_1_1_9__3__Impl rule__OtherOperationStatement__Group_1_1_9__4 ;
    public final void rule__OtherOperationStatement__Group_1_1_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2238:1: ( rule__OtherOperationStatement__Group_1_1_9__3__Impl rule__OtherOperationStatement__Group_1_1_9__4 )
            // InternalMyDsl.g:2239:2: rule__OtherOperationStatement__Group_1_1_9__3__Impl rule__OtherOperationStatement__Group_1_1_9__4
            {
            pushFollow(FOLLOW_14);
            rule__OtherOperationStatement__Group_1_1_9__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OtherOperationStatement__Group_1_1_9__4();

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
    // $ANTLR end "rule__OtherOperationStatement__Group_1_1_9__3"


    // $ANTLR start "rule__OtherOperationStatement__Group_1_1_9__3__Impl"
    // InternalMyDsl.g:2246:1: rule__OtherOperationStatement__Group_1_1_9__3__Impl : ( ( rule__OtherOperationStatement__Group_1_1_9_3__0 )? ) ;
    public final void rule__OtherOperationStatement__Group_1_1_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2250:1: ( ( ( rule__OtherOperationStatement__Group_1_1_9_3__0 )? ) )
            // InternalMyDsl.g:2251:1: ( ( rule__OtherOperationStatement__Group_1_1_9_3__0 )? )
            {
            // InternalMyDsl.g:2251:1: ( ( rule__OtherOperationStatement__Group_1_1_9_3__0 )? )
            // InternalMyDsl.g:2252:2: ( rule__OtherOperationStatement__Group_1_1_9_3__0 )?
            {
             before(grammarAccess.getOtherOperationStatementAccess().getGroup_1_1_9_3()); 
            // InternalMyDsl.g:2253:2: ( rule__OtherOperationStatement__Group_1_1_9_3__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMyDsl.g:2253:3: rule__OtherOperationStatement__Group_1_1_9_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OtherOperationStatement__Group_1_1_9_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOtherOperationStatementAccess().getGroup_1_1_9_3()); 

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
    // $ANTLR end "rule__OtherOperationStatement__Group_1_1_9__3__Impl"


    // $ANTLR start "rule__OtherOperationStatement__Group_1_1_9__4"
    // InternalMyDsl.g:2261:1: rule__OtherOperationStatement__Group_1_1_9__4 : rule__OtherOperationStatement__Group_1_1_9__4__Impl ;
    public final void rule__OtherOperationStatement__Group_1_1_9__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2265:1: ( rule__OtherOperationStatement__Group_1_1_9__4__Impl )
            // InternalMyDsl.g:2266:2: rule__OtherOperationStatement__Group_1_1_9__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OtherOperationStatement__Group_1_1_9__4__Impl();

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
    // $ANTLR end "rule__OtherOperationStatement__Group_1_1_9__4"


    // $ANTLR start "rule__OtherOperationStatement__Group_1_1_9__4__Impl"
    // InternalMyDsl.g:2272:1: rule__OtherOperationStatement__Group_1_1_9__4__Impl : ( '}' ) ;
    public final void rule__OtherOperationStatement__Group_1_1_9__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2276:1: ( ( '}' ) )
            // InternalMyDsl.g:2277:1: ( '}' )
            {
            // InternalMyDsl.g:2277:1: ( '}' )
            // InternalMyDsl.g:2278:2: '}'
            {
             before(grammarAccess.getOtherOperationStatementAccess().getRightCurlyBracketKeyword_1_1_9_4()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getOtherOperationStatementAccess().getRightCurlyBracketKeyword_1_1_9_4()); 

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
    // $ANTLR end "rule__OtherOperationStatement__Group_1_1_9__4__Impl"


    // $ANTLR start "rule__OtherOperationStatement__Group_1_1_9_3__0"
    // InternalMyDsl.g:2288:1: rule__OtherOperationStatement__Group_1_1_9_3__0 : rule__OtherOperationStatement__Group_1_1_9_3__0__Impl rule__OtherOperationStatement__Group_1_1_9_3__1 ;
    public final void rule__OtherOperationStatement__Group_1_1_9_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2292:1: ( rule__OtherOperationStatement__Group_1_1_9_3__0__Impl rule__OtherOperationStatement__Group_1_1_9_3__1 )
            // InternalMyDsl.g:2293:2: rule__OtherOperationStatement__Group_1_1_9_3__0__Impl rule__OtherOperationStatement__Group_1_1_9_3__1
            {
            pushFollow(FOLLOW_11);
            rule__OtherOperationStatement__Group_1_1_9_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OtherOperationStatement__Group_1_1_9_3__1();

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
    // $ANTLR end "rule__OtherOperationStatement__Group_1_1_9_3__0"


    // $ANTLR start "rule__OtherOperationStatement__Group_1_1_9_3__0__Impl"
    // InternalMyDsl.g:2300:1: rule__OtherOperationStatement__Group_1_1_9_3__0__Impl : ( ( rule__OtherOperationStatement__EntriesAssignment_1_1_9_3_0 ) ) ;
    public final void rule__OtherOperationStatement__Group_1_1_9_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2304:1: ( ( ( rule__OtherOperationStatement__EntriesAssignment_1_1_9_3_0 ) ) )
            // InternalMyDsl.g:2305:1: ( ( rule__OtherOperationStatement__EntriesAssignment_1_1_9_3_0 ) )
            {
            // InternalMyDsl.g:2305:1: ( ( rule__OtherOperationStatement__EntriesAssignment_1_1_9_3_0 ) )
            // InternalMyDsl.g:2306:2: ( rule__OtherOperationStatement__EntriesAssignment_1_1_9_3_0 )
            {
             before(grammarAccess.getOtherOperationStatementAccess().getEntriesAssignment_1_1_9_3_0()); 
            // InternalMyDsl.g:2307:2: ( rule__OtherOperationStatement__EntriesAssignment_1_1_9_3_0 )
            // InternalMyDsl.g:2307:3: rule__OtherOperationStatement__EntriesAssignment_1_1_9_3_0
            {
            pushFollow(FOLLOW_2);
            rule__OtherOperationStatement__EntriesAssignment_1_1_9_3_0();

            state._fsp--;


            }

             after(grammarAccess.getOtherOperationStatementAccess().getEntriesAssignment_1_1_9_3_0()); 

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
    // $ANTLR end "rule__OtherOperationStatement__Group_1_1_9_3__0__Impl"


    // $ANTLR start "rule__OtherOperationStatement__Group_1_1_9_3__1"
    // InternalMyDsl.g:2315:1: rule__OtherOperationStatement__Group_1_1_9_3__1 : rule__OtherOperationStatement__Group_1_1_9_3__1__Impl ;
    public final void rule__OtherOperationStatement__Group_1_1_9_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2319:1: ( rule__OtherOperationStatement__Group_1_1_9_3__1__Impl )
            // InternalMyDsl.g:2320:2: rule__OtherOperationStatement__Group_1_1_9_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OtherOperationStatement__Group_1_1_9_3__1__Impl();

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
    // $ANTLR end "rule__OtherOperationStatement__Group_1_1_9_3__1"


    // $ANTLR start "rule__OtherOperationStatement__Group_1_1_9_3__1__Impl"
    // InternalMyDsl.g:2326:1: rule__OtherOperationStatement__Group_1_1_9_3__1__Impl : ( ( rule__OtherOperationStatement__Group_1_1_9_3_1__0 )* ) ;
    public final void rule__OtherOperationStatement__Group_1_1_9_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2330:1: ( ( ( rule__OtherOperationStatement__Group_1_1_9_3_1__0 )* ) )
            // InternalMyDsl.g:2331:1: ( ( rule__OtherOperationStatement__Group_1_1_9_3_1__0 )* )
            {
            // InternalMyDsl.g:2331:1: ( ( rule__OtherOperationStatement__Group_1_1_9_3_1__0 )* )
            // InternalMyDsl.g:2332:2: ( rule__OtherOperationStatement__Group_1_1_9_3_1__0 )*
            {
             before(grammarAccess.getOtherOperationStatementAccess().getGroup_1_1_9_3_1()); 
            // InternalMyDsl.g:2333:2: ( rule__OtherOperationStatement__Group_1_1_9_3_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==21) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalMyDsl.g:2333:3: rule__OtherOperationStatement__Group_1_1_9_3_1__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__OtherOperationStatement__Group_1_1_9_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getOtherOperationStatementAccess().getGroup_1_1_9_3_1()); 

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
    // $ANTLR end "rule__OtherOperationStatement__Group_1_1_9_3__1__Impl"


    // $ANTLR start "rule__OtherOperationStatement__Group_1_1_9_3_1__0"
    // InternalMyDsl.g:2342:1: rule__OtherOperationStatement__Group_1_1_9_3_1__0 : rule__OtherOperationStatement__Group_1_1_9_3_1__0__Impl rule__OtherOperationStatement__Group_1_1_9_3_1__1 ;
    public final void rule__OtherOperationStatement__Group_1_1_9_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2346:1: ( rule__OtherOperationStatement__Group_1_1_9_3_1__0__Impl rule__OtherOperationStatement__Group_1_1_9_3_1__1 )
            // InternalMyDsl.g:2347:2: rule__OtherOperationStatement__Group_1_1_9_3_1__0__Impl rule__OtherOperationStatement__Group_1_1_9_3_1__1
            {
            pushFollow(FOLLOW_13);
            rule__OtherOperationStatement__Group_1_1_9_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OtherOperationStatement__Group_1_1_9_3_1__1();

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
    // $ANTLR end "rule__OtherOperationStatement__Group_1_1_9_3_1__0"


    // $ANTLR start "rule__OtherOperationStatement__Group_1_1_9_3_1__0__Impl"
    // InternalMyDsl.g:2354:1: rule__OtherOperationStatement__Group_1_1_9_3_1__0__Impl : ( ',' ) ;
    public final void rule__OtherOperationStatement__Group_1_1_9_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2358:1: ( ( ',' ) )
            // InternalMyDsl.g:2359:1: ( ',' )
            {
            // InternalMyDsl.g:2359:1: ( ',' )
            // InternalMyDsl.g:2360:2: ','
            {
             before(grammarAccess.getOtherOperationStatementAccess().getCommaKeyword_1_1_9_3_1_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getOtherOperationStatementAccess().getCommaKeyword_1_1_9_3_1_0()); 

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
    // $ANTLR end "rule__OtherOperationStatement__Group_1_1_9_3_1__0__Impl"


    // $ANTLR start "rule__OtherOperationStatement__Group_1_1_9_3_1__1"
    // InternalMyDsl.g:2369:1: rule__OtherOperationStatement__Group_1_1_9_3_1__1 : rule__OtherOperationStatement__Group_1_1_9_3_1__1__Impl ;
    public final void rule__OtherOperationStatement__Group_1_1_9_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2373:1: ( rule__OtherOperationStatement__Group_1_1_9_3_1__1__Impl )
            // InternalMyDsl.g:2374:2: rule__OtherOperationStatement__Group_1_1_9_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OtherOperationStatement__Group_1_1_9_3_1__1__Impl();

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
    // $ANTLR end "rule__OtherOperationStatement__Group_1_1_9_3_1__1"


    // $ANTLR start "rule__OtherOperationStatement__Group_1_1_9_3_1__1__Impl"
    // InternalMyDsl.g:2380:1: rule__OtherOperationStatement__Group_1_1_9_3_1__1__Impl : ( ( rule__OtherOperationStatement__EntriesAssignment_1_1_9_3_1_1 ) ) ;
    public final void rule__OtherOperationStatement__Group_1_1_9_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2384:1: ( ( ( rule__OtherOperationStatement__EntriesAssignment_1_1_9_3_1_1 ) ) )
            // InternalMyDsl.g:2385:1: ( ( rule__OtherOperationStatement__EntriesAssignment_1_1_9_3_1_1 ) )
            {
            // InternalMyDsl.g:2385:1: ( ( rule__OtherOperationStatement__EntriesAssignment_1_1_9_3_1_1 ) )
            // InternalMyDsl.g:2386:2: ( rule__OtherOperationStatement__EntriesAssignment_1_1_9_3_1_1 )
            {
             before(grammarAccess.getOtherOperationStatementAccess().getEntriesAssignment_1_1_9_3_1_1()); 
            // InternalMyDsl.g:2387:2: ( rule__OtherOperationStatement__EntriesAssignment_1_1_9_3_1_1 )
            // InternalMyDsl.g:2387:3: rule__OtherOperationStatement__EntriesAssignment_1_1_9_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__OtherOperationStatement__EntriesAssignment_1_1_9_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getOtherOperationStatementAccess().getEntriesAssignment_1_1_9_3_1_1()); 

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
    // $ANTLR end "rule__OtherOperationStatement__Group_1_1_9_3_1__1__Impl"


    // $ANTLR start "rule__TaskDictionaryEntry__Group__0"
    // InternalMyDsl.g:2396:1: rule__TaskDictionaryEntry__Group__0 : rule__TaskDictionaryEntry__Group__0__Impl rule__TaskDictionaryEntry__Group__1 ;
    public final void rule__TaskDictionaryEntry__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2400:1: ( rule__TaskDictionaryEntry__Group__0__Impl rule__TaskDictionaryEntry__Group__1 )
            // InternalMyDsl.g:2401:2: rule__TaskDictionaryEntry__Group__0__Impl rule__TaskDictionaryEntry__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__TaskDictionaryEntry__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TaskDictionaryEntry__Group__1();

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
    // $ANTLR end "rule__TaskDictionaryEntry__Group__0"


    // $ANTLR start "rule__TaskDictionaryEntry__Group__0__Impl"
    // InternalMyDsl.g:2408:1: rule__TaskDictionaryEntry__Group__0__Impl : ( ( rule__TaskDictionaryEntry__ValueNameAssignment_0 ) ) ;
    public final void rule__TaskDictionaryEntry__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2412:1: ( ( ( rule__TaskDictionaryEntry__ValueNameAssignment_0 ) ) )
            // InternalMyDsl.g:2413:1: ( ( rule__TaskDictionaryEntry__ValueNameAssignment_0 ) )
            {
            // InternalMyDsl.g:2413:1: ( ( rule__TaskDictionaryEntry__ValueNameAssignment_0 ) )
            // InternalMyDsl.g:2414:2: ( rule__TaskDictionaryEntry__ValueNameAssignment_0 )
            {
             before(grammarAccess.getTaskDictionaryEntryAccess().getValueNameAssignment_0()); 
            // InternalMyDsl.g:2415:2: ( rule__TaskDictionaryEntry__ValueNameAssignment_0 )
            // InternalMyDsl.g:2415:3: rule__TaskDictionaryEntry__ValueNameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__TaskDictionaryEntry__ValueNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTaskDictionaryEntryAccess().getValueNameAssignment_0()); 

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
    // $ANTLR end "rule__TaskDictionaryEntry__Group__0__Impl"


    // $ANTLR start "rule__TaskDictionaryEntry__Group__1"
    // InternalMyDsl.g:2423:1: rule__TaskDictionaryEntry__Group__1 : rule__TaskDictionaryEntry__Group__1__Impl rule__TaskDictionaryEntry__Group__2 ;
    public final void rule__TaskDictionaryEntry__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2427:1: ( rule__TaskDictionaryEntry__Group__1__Impl rule__TaskDictionaryEntry__Group__2 )
            // InternalMyDsl.g:2428:2: rule__TaskDictionaryEntry__Group__1__Impl rule__TaskDictionaryEntry__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__TaskDictionaryEntry__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TaskDictionaryEntry__Group__2();

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
    // $ANTLR end "rule__TaskDictionaryEntry__Group__1"


    // $ANTLR start "rule__TaskDictionaryEntry__Group__1__Impl"
    // InternalMyDsl.g:2435:1: rule__TaskDictionaryEntry__Group__1__Impl : ( ':' ) ;
    public final void rule__TaskDictionaryEntry__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2439:1: ( ( ':' ) )
            // InternalMyDsl.g:2440:1: ( ':' )
            {
            // InternalMyDsl.g:2440:1: ( ':' )
            // InternalMyDsl.g:2441:2: ':'
            {
             before(grammarAccess.getTaskDictionaryEntryAccess().getColonKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getTaskDictionaryEntryAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__TaskDictionaryEntry__Group__1__Impl"


    // $ANTLR start "rule__TaskDictionaryEntry__Group__2"
    // InternalMyDsl.g:2450:1: rule__TaskDictionaryEntry__Group__2 : rule__TaskDictionaryEntry__Group__2__Impl ;
    public final void rule__TaskDictionaryEntry__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2454:1: ( rule__TaskDictionaryEntry__Group__2__Impl )
            // InternalMyDsl.g:2455:2: rule__TaskDictionaryEntry__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TaskDictionaryEntry__Group__2__Impl();

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
    // $ANTLR end "rule__TaskDictionaryEntry__Group__2"


    // $ANTLR start "rule__TaskDictionaryEntry__Group__2__Impl"
    // InternalMyDsl.g:2461:1: rule__TaskDictionaryEntry__Group__2__Impl : ( ( rule__TaskDictionaryEntry__Alternatives_2 ) ) ;
    public final void rule__TaskDictionaryEntry__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2465:1: ( ( ( rule__TaskDictionaryEntry__Alternatives_2 ) ) )
            // InternalMyDsl.g:2466:1: ( ( rule__TaskDictionaryEntry__Alternatives_2 ) )
            {
            // InternalMyDsl.g:2466:1: ( ( rule__TaskDictionaryEntry__Alternatives_2 ) )
            // InternalMyDsl.g:2467:2: ( rule__TaskDictionaryEntry__Alternatives_2 )
            {
             before(grammarAccess.getTaskDictionaryEntryAccess().getAlternatives_2()); 
            // InternalMyDsl.g:2468:2: ( rule__TaskDictionaryEntry__Alternatives_2 )
            // InternalMyDsl.g:2468:3: rule__TaskDictionaryEntry__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__TaskDictionaryEntry__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getTaskDictionaryEntryAccess().getAlternatives_2()); 

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
    // $ANTLR end "rule__TaskDictionaryEntry__Group__2__Impl"


    // $ANTLR start "rule__ConnectionStatement__UnorderedGroup"
    // InternalMyDsl.g:2477:1: rule__ConnectionStatement__UnorderedGroup : rule__ConnectionStatement__UnorderedGroup__0 {...}?;
    public final void rule__ConnectionStatement__UnorderedGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getConnectionStatementAccess().getUnorderedGroup());
        	
        try {
            // InternalMyDsl.g:2482:1: ( rule__ConnectionStatement__UnorderedGroup__0 {...}?)
            // InternalMyDsl.g:2483:2: rule__ConnectionStatement__UnorderedGroup__0 {...}?
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
    // InternalMyDsl.g:2491:1: rule__ConnectionStatement__UnorderedGroup__Impl : ( ({...}? => ( ( ( rule__ConnectionStatement__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ConnectionStatement__Group_1__0 ) ) ) ) ) ;
    public final void rule__ConnectionStatement__UnorderedGroup__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalMyDsl.g:2496:1: ( ( ({...}? => ( ( ( rule__ConnectionStatement__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ConnectionStatement__Group_1__0 ) ) ) ) ) )
            // InternalMyDsl.g:2497:3: ( ({...}? => ( ( ( rule__ConnectionStatement__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ConnectionStatement__Group_1__0 ) ) ) ) )
            {
            // InternalMyDsl.g:2497:3: ( ({...}? => ( ( ( rule__ConnectionStatement__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ConnectionStatement__Group_1__0 ) ) ) ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( LA20_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionStatementAccess().getUnorderedGroup(), 0) ) {
                alt20=1;
            }
            else if ( LA20_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionStatementAccess().getUnorderedGroup(), 1) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalMyDsl.g:2498:3: ({...}? => ( ( ( rule__ConnectionStatement__Group_0__0 ) ) ) )
                    {
                    // InternalMyDsl.g:2498:3: ({...}? => ( ( ( rule__ConnectionStatement__Group_0__0 ) ) ) )
                    // InternalMyDsl.g:2499:4: {...}? => ( ( ( rule__ConnectionStatement__Group_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionStatementAccess().getUnorderedGroup(), 0) ) {
                        throw new FailedPredicateException(input, "rule__ConnectionStatement__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionStatementAccess().getUnorderedGroup(), 0)");
                    }
                    // InternalMyDsl.g:2499:113: ( ( ( rule__ConnectionStatement__Group_0__0 ) ) )
                    // InternalMyDsl.g:2500:5: ( ( rule__ConnectionStatement__Group_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getConnectionStatementAccess().getUnorderedGroup(), 0);
                    				

                    					selected = true;
                    				
                    // InternalMyDsl.g:2506:5: ( ( rule__ConnectionStatement__Group_0__0 ) )
                    // InternalMyDsl.g:2507:6: ( rule__ConnectionStatement__Group_0__0 )
                    {
                     before(grammarAccess.getConnectionStatementAccess().getGroup_0()); 
                    // InternalMyDsl.g:2508:6: ( rule__ConnectionStatement__Group_0__0 )
                    // InternalMyDsl.g:2508:7: rule__ConnectionStatement__Group_0__0
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
                    // InternalMyDsl.g:2513:3: ({...}? => ( ( ( rule__ConnectionStatement__Group_1__0 ) ) ) )
                    {
                    // InternalMyDsl.g:2513:3: ({...}? => ( ( ( rule__ConnectionStatement__Group_1__0 ) ) ) )
                    // InternalMyDsl.g:2514:4: {...}? => ( ( ( rule__ConnectionStatement__Group_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionStatementAccess().getUnorderedGroup(), 1) ) {
                        throw new FailedPredicateException(input, "rule__ConnectionStatement__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionStatementAccess().getUnorderedGroup(), 1)");
                    }
                    // InternalMyDsl.g:2514:113: ( ( ( rule__ConnectionStatement__Group_1__0 ) ) )
                    // InternalMyDsl.g:2515:5: ( ( rule__ConnectionStatement__Group_1__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getConnectionStatementAccess().getUnorderedGroup(), 1);
                    				

                    					selected = true;
                    				
                    // InternalMyDsl.g:2521:5: ( ( rule__ConnectionStatement__Group_1__0 ) )
                    // InternalMyDsl.g:2522:6: ( rule__ConnectionStatement__Group_1__0 )
                    {
                     before(grammarAccess.getConnectionStatementAccess().getGroup_1()); 
                    // InternalMyDsl.g:2523:6: ( rule__ConnectionStatement__Group_1__0 )
                    // InternalMyDsl.g:2523:7: rule__ConnectionStatement__Group_1__0
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
    // InternalMyDsl.g:2536:1: rule__ConnectionStatement__UnorderedGroup__0 : rule__ConnectionStatement__UnorderedGroup__Impl ( rule__ConnectionStatement__UnorderedGroup__1 )? ;
    public final void rule__ConnectionStatement__UnorderedGroup__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2540:1: ( rule__ConnectionStatement__UnorderedGroup__Impl ( rule__ConnectionStatement__UnorderedGroup__1 )? )
            // InternalMyDsl.g:2541:2: rule__ConnectionStatement__UnorderedGroup__Impl ( rule__ConnectionStatement__UnorderedGroup__1 )?
            {
            pushFollow(FOLLOW_3);
            rule__ConnectionStatement__UnorderedGroup__Impl();

            state._fsp--;

            // InternalMyDsl.g:2542:2: ( rule__ConnectionStatement__UnorderedGroup__1 )?
            int alt21=2;
            alt21 = dfa21.predict(input);
            switch (alt21) {
                case 1 :
                    // InternalMyDsl.g:2542:2: rule__ConnectionStatement__UnorderedGroup__1
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
    // InternalMyDsl.g:2548:1: rule__ConnectionStatement__UnorderedGroup__1 : rule__ConnectionStatement__UnorderedGroup__Impl ;
    public final void rule__ConnectionStatement__UnorderedGroup__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2552:1: ( rule__ConnectionStatement__UnorderedGroup__Impl )
            // InternalMyDsl.g:2553:2: rule__ConnectionStatement__UnorderedGroup__Impl
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
    // InternalMyDsl.g:2560:1: rule__MongoDB__ModelsAssignment : ( ruleModel ) ;
    public final void rule__MongoDB__ModelsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2564:1: ( ( ruleModel ) )
            // InternalMyDsl.g:2565:2: ( ruleModel )
            {
            // InternalMyDsl.g:2565:2: ( ruleModel )
            // InternalMyDsl.g:2566:3: ruleModel
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
    // InternalMyDsl.g:2575:1: rule__Model__ConnectionAssignment_0 : ( ruleConnectionStatement ) ;
    public final void rule__Model__ConnectionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2579:1: ( ( ruleConnectionStatement ) )
            // InternalMyDsl.g:2580:2: ( ruleConnectionStatement )
            {
            // InternalMyDsl.g:2580:2: ( ruleConnectionStatement )
            // InternalMyDsl.g:2581:3: ruleConnectionStatement
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
    // InternalMyDsl.g:2590:1: rule__Model__StatementsAssignment_1 : ( ruleOperationStatement ) ;
    public final void rule__Model__StatementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2594:1: ( ( ruleOperationStatement ) )
            // InternalMyDsl.g:2595:2: ( ruleOperationStatement )
            {
            // InternalMyDsl.g:2595:2: ( ruleOperationStatement )
            // InternalMyDsl.g:2596:3: ruleOperationStatement
            {
             before(grammarAccess.getModelAccess().getStatementsOperationStatementParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOperationStatement();

            state._fsp--;

             after(grammarAccess.getModelAccess().getStatementsOperationStatementParserRuleCall_1_0()); 

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


    // $ANTLR start "rule__OperationStatement__SchemaAssignment_0"
    // InternalMyDsl.g:2605:1: rule__OperationStatement__SchemaAssignment_0 : ( ruleMakeStatement ) ;
    public final void rule__OperationStatement__SchemaAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2609:1: ( ( ruleMakeStatement ) )
            // InternalMyDsl.g:2610:2: ( ruleMakeStatement )
            {
            // InternalMyDsl.g:2610:2: ( ruleMakeStatement )
            // InternalMyDsl.g:2611:3: ruleMakeStatement
            {
             before(grammarAccess.getOperationStatementAccess().getSchemaMakeStatementParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleMakeStatement();

            state._fsp--;

             after(grammarAccess.getOperationStatementAccess().getSchemaMakeStatementParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__OperationStatement__SchemaAssignment_0"


    // $ANTLR start "rule__OperationStatement__OperationsAssignment_1"
    // InternalMyDsl.g:2620:1: rule__OperationStatement__OperationsAssignment_1 : ( ruleOtherOperationStatement ) ;
    public final void rule__OperationStatement__OperationsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2624:1: ( ( ruleOtherOperationStatement ) )
            // InternalMyDsl.g:2625:2: ( ruleOtherOperationStatement )
            {
            // InternalMyDsl.g:2625:2: ( ruleOtherOperationStatement )
            // InternalMyDsl.g:2626:3: ruleOtherOperationStatement
            {
             before(grammarAccess.getOperationStatementAccess().getOperationsOtherOperationStatementParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOtherOperationStatement();

            state._fsp--;

             after(grammarAccess.getOperationStatementAccess().getOperationsOtherOperationStatementParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__OperationStatement__OperationsAssignment_1"


    // $ANTLR start "rule__ConnectionStatement__ConnectionStringAssignment_0_3"
    // InternalMyDsl.g:2635:1: rule__ConnectionStatement__ConnectionStringAssignment_0_3 : ( RULE_STRING ) ;
    public final void rule__ConnectionStatement__ConnectionStringAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2639:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:2640:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:2640:2: ( RULE_STRING )
            // InternalMyDsl.g:2641:3: RULE_STRING
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


    // $ANTLR start "rule__ConnectionStatement__DatabaseAssignment_1_1"
    // InternalMyDsl.g:2650:1: rule__ConnectionStatement__DatabaseAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__ConnectionStatement__DatabaseAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2654:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:2655:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:2655:2: ( RULE_STRING )
            // InternalMyDsl.g:2656:3: RULE_STRING
            {
             before(grammarAccess.getConnectionStatementAccess().getDatabaseSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getConnectionStatementAccess().getDatabaseSTRINGTerminalRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__ConnectionStatement__DatabaseAssignment_1_1"


    // $ANTLR start "rule__MakeStatement__NameAssignment_1"
    // InternalMyDsl.g:2665:1: rule__MakeStatement__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MakeStatement__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2669:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2670:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2670:2: ( RULE_ID )
            // InternalMyDsl.g:2671:3: RULE_ID
            {
             before(grammarAccess.getMakeStatementAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMakeStatementAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__MakeStatement__NameAssignment_1"


    // $ANTLR start "rule__MakeStatement__EntriesAssignment_3_0"
    // InternalMyDsl.g:2680:1: rule__MakeStatement__EntriesAssignment_3_0 : ( ruleDictionaryEntry ) ;
    public final void rule__MakeStatement__EntriesAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2684:1: ( ( ruleDictionaryEntry ) )
            // InternalMyDsl.g:2685:2: ( ruleDictionaryEntry )
            {
            // InternalMyDsl.g:2685:2: ( ruleDictionaryEntry )
            // InternalMyDsl.g:2686:3: ruleDictionaryEntry
            {
             before(grammarAccess.getMakeStatementAccess().getEntriesDictionaryEntryParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDictionaryEntry();

            state._fsp--;

             after(grammarAccess.getMakeStatementAccess().getEntriesDictionaryEntryParserRuleCall_3_0_0()); 

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
    // $ANTLR end "rule__MakeStatement__EntriesAssignment_3_0"


    // $ANTLR start "rule__MakeStatement__EntriesAssignment_3_1_1"
    // InternalMyDsl.g:2695:1: rule__MakeStatement__EntriesAssignment_3_1_1 : ( ruleDictionaryEntry ) ;
    public final void rule__MakeStatement__EntriesAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2699:1: ( ( ruleDictionaryEntry ) )
            // InternalMyDsl.g:2700:2: ( ruleDictionaryEntry )
            {
            // InternalMyDsl.g:2700:2: ( ruleDictionaryEntry )
            // InternalMyDsl.g:2701:3: ruleDictionaryEntry
            {
             before(grammarAccess.getMakeStatementAccess().getEntriesDictionaryEntryParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDictionaryEntry();

            state._fsp--;

             after(grammarAccess.getMakeStatementAccess().getEntriesDictionaryEntryParserRuleCall_3_1_1_0()); 

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
    // $ANTLR end "rule__MakeStatement__EntriesAssignment_3_1_1"


    // $ANTLR start "rule__DictionaryEntry__NameAssignment_0_0"
    // InternalMyDsl.g:2710:1: rule__DictionaryEntry__NameAssignment_0_0 : ( RULE_ID ) ;
    public final void rule__DictionaryEntry__NameAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2714:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2715:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2715:2: ( RULE_ID )
            // InternalMyDsl.g:2716:3: RULE_ID
            {
             before(grammarAccess.getDictionaryEntryAccess().getNameIDTerminalRuleCall_0_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDictionaryEntryAccess().getNameIDTerminalRuleCall_0_0_0()); 

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
    // $ANTLR end "rule__DictionaryEntry__NameAssignment_0_0"


    // $ANTLR start "rule__DictionaryEntry__FieldTypeAssignment_0_2"
    // InternalMyDsl.g:2725:1: rule__DictionaryEntry__FieldTypeAssignment_0_2 : ( ruleFieldType ) ;
    public final void rule__DictionaryEntry__FieldTypeAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2729:1: ( ( ruleFieldType ) )
            // InternalMyDsl.g:2730:2: ( ruleFieldType )
            {
            // InternalMyDsl.g:2730:2: ( ruleFieldType )
            // InternalMyDsl.g:2731:3: ruleFieldType
            {
             before(grammarAccess.getDictionaryEntryAccess().getFieldTypeFieldTypeParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFieldType();

            state._fsp--;

             after(grammarAccess.getDictionaryEntryAccess().getFieldTypeFieldTypeParserRuleCall_0_2_0()); 

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
    // $ANTLR end "rule__DictionaryEntry__FieldTypeAssignment_0_2"


    // $ANTLR start "rule__DictionaryEntry__StatusAssignment_0_3"
    // InternalMyDsl.g:2740:1: rule__DictionaryEntry__StatusAssignment_0_3 : ( ( 'required' ) ) ;
    public final void rule__DictionaryEntry__StatusAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2744:1: ( ( ( 'required' ) ) )
            // InternalMyDsl.g:2745:2: ( ( 'required' ) )
            {
            // InternalMyDsl.g:2745:2: ( ( 'required' ) )
            // InternalMyDsl.g:2746:3: ( 'required' )
            {
             before(grammarAccess.getDictionaryEntryAccess().getStatusRequiredKeyword_0_3_0()); 
            // InternalMyDsl.g:2747:3: ( 'required' )
            // InternalMyDsl.g:2748:4: 'required'
            {
             before(grammarAccess.getDictionaryEntryAccess().getStatusRequiredKeyword_0_3_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getDictionaryEntryAccess().getStatusRequiredKeyword_0_3_0()); 

            }

             after(grammarAccess.getDictionaryEntryAccess().getStatusRequiredKeyword_0_3_0()); 

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
    // $ANTLR end "rule__DictionaryEntry__StatusAssignment_0_3"


    // $ANTLR start "rule__DictionaryEntry__UniqueKeyAssignment_0_4"
    // InternalMyDsl.g:2759:1: rule__DictionaryEntry__UniqueKeyAssignment_0_4 : ( ( 'unique' ) ) ;
    public final void rule__DictionaryEntry__UniqueKeyAssignment_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2763:1: ( ( ( 'unique' ) ) )
            // InternalMyDsl.g:2764:2: ( ( 'unique' ) )
            {
            // InternalMyDsl.g:2764:2: ( ( 'unique' ) )
            // InternalMyDsl.g:2765:3: ( 'unique' )
            {
             before(grammarAccess.getDictionaryEntryAccess().getUniqueKeyUniqueKeyword_0_4_0()); 
            // InternalMyDsl.g:2766:3: ( 'unique' )
            // InternalMyDsl.g:2767:4: 'unique'
            {
             before(grammarAccess.getDictionaryEntryAccess().getUniqueKeyUniqueKeyword_0_4_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getDictionaryEntryAccess().getUniqueKeyUniqueKeyword_0_4_0()); 

            }

             after(grammarAccess.getDictionaryEntryAccess().getUniqueKeyUniqueKeyword_0_4_0()); 

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
    // $ANTLR end "rule__DictionaryEntry__UniqueKeyAssignment_0_4"


    // $ANTLR start "rule__DictionaryEntry__NameAssignment_1_0"
    // InternalMyDsl.g:2778:1: rule__DictionaryEntry__NameAssignment_1_0 : ( RULE_ID ) ;
    public final void rule__DictionaryEntry__NameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2782:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2783:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2783:2: ( RULE_ID )
            // InternalMyDsl.g:2784:3: RULE_ID
            {
             before(grammarAccess.getDictionaryEntryAccess().getNameIDTerminalRuleCall_1_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDictionaryEntryAccess().getNameIDTerminalRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__DictionaryEntry__NameAssignment_1_0"


    // $ANTLR start "rule__DictionaryEntry__RefDictionaryAssignment_1_3"
    // InternalMyDsl.g:2793:1: rule__DictionaryEntry__RefDictionaryAssignment_1_3 : ( ( RULE_ID ) ) ;
    public final void rule__DictionaryEntry__RefDictionaryAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2797:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:2798:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:2798:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:2799:3: ( RULE_ID )
            {
             before(grammarAccess.getDictionaryEntryAccess().getRefDictionaryMakeStatementCrossReference_1_3_0()); 
            // InternalMyDsl.g:2800:3: ( RULE_ID )
            // InternalMyDsl.g:2801:4: RULE_ID
            {
             before(grammarAccess.getDictionaryEntryAccess().getRefDictionaryMakeStatementIDTerminalRuleCall_1_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDictionaryEntryAccess().getRefDictionaryMakeStatementIDTerminalRuleCall_1_3_0_1()); 

            }

             after(grammarAccess.getDictionaryEntryAccess().getRefDictionaryMakeStatementCrossReference_1_3_0()); 

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
    // $ANTLR end "rule__DictionaryEntry__RefDictionaryAssignment_1_3"


    // $ANTLR start "rule__OtherOperationStatement__TypeAssignment_0_1_2"
    // InternalMyDsl.g:2812:1: rule__OtherOperationStatement__TypeAssignment_0_1_2 : ( ruleOperation ) ;
    public final void rule__OtherOperationStatement__TypeAssignment_0_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2816:1: ( ( ruleOperation ) )
            // InternalMyDsl.g:2817:2: ( ruleOperation )
            {
            // InternalMyDsl.g:2817:2: ( ruleOperation )
            // InternalMyDsl.g:2818:3: ruleOperation
            {
             before(grammarAccess.getOtherOperationStatementAccess().getTypeOperationParserRuleCall_0_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getOtherOperationStatementAccess().getTypeOperationParserRuleCall_0_1_2_0()); 

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
    // $ANTLR end "rule__OtherOperationStatement__TypeAssignment_0_1_2"


    // $ANTLR start "rule__OtherOperationStatement__CollectionAssignment_0_1_5"
    // InternalMyDsl.g:2827:1: rule__OtherOperationStatement__CollectionAssignment_0_1_5 : ( ( RULE_ID ) ) ;
    public final void rule__OtherOperationStatement__CollectionAssignment_0_1_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2831:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:2832:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:2832:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:2833:3: ( RULE_ID )
            {
             before(grammarAccess.getOtherOperationStatementAccess().getCollectionMakeStatementCrossReference_0_1_5_0()); 
            // InternalMyDsl.g:2834:3: ( RULE_ID )
            // InternalMyDsl.g:2835:4: RULE_ID
            {
             before(grammarAccess.getOtherOperationStatementAccess().getCollectionMakeStatementIDTerminalRuleCall_0_1_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getOtherOperationStatementAccess().getCollectionMakeStatementIDTerminalRuleCall_0_1_5_0_1()); 

            }

             after(grammarAccess.getOtherOperationStatementAccess().getCollectionMakeStatementCrossReference_0_1_5_0()); 

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
    // $ANTLR end "rule__OtherOperationStatement__CollectionAssignment_0_1_5"


    // $ANTLR start "rule__OtherOperationStatement__EntriesAssignment_0_1_8_0"
    // InternalMyDsl.g:2846:1: rule__OtherOperationStatement__EntriesAssignment_0_1_8_0 : ( ruleTaskDictionaryEntry ) ;
    public final void rule__OtherOperationStatement__EntriesAssignment_0_1_8_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2850:1: ( ( ruleTaskDictionaryEntry ) )
            // InternalMyDsl.g:2851:2: ( ruleTaskDictionaryEntry )
            {
            // InternalMyDsl.g:2851:2: ( ruleTaskDictionaryEntry )
            // InternalMyDsl.g:2852:3: ruleTaskDictionaryEntry
            {
             before(grammarAccess.getOtherOperationStatementAccess().getEntriesTaskDictionaryEntryParserRuleCall_0_1_8_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTaskDictionaryEntry();

            state._fsp--;

             after(grammarAccess.getOtherOperationStatementAccess().getEntriesTaskDictionaryEntryParserRuleCall_0_1_8_0_0()); 

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
    // $ANTLR end "rule__OtherOperationStatement__EntriesAssignment_0_1_8_0"


    // $ANTLR start "rule__OtherOperationStatement__EntriesAssignment_0_1_8_1_1"
    // InternalMyDsl.g:2861:1: rule__OtherOperationStatement__EntriesAssignment_0_1_8_1_1 : ( ruleTaskDictionaryEntry ) ;
    public final void rule__OtherOperationStatement__EntriesAssignment_0_1_8_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2865:1: ( ( ruleTaskDictionaryEntry ) )
            // InternalMyDsl.g:2866:2: ( ruleTaskDictionaryEntry )
            {
            // InternalMyDsl.g:2866:2: ( ruleTaskDictionaryEntry )
            // InternalMyDsl.g:2867:3: ruleTaskDictionaryEntry
            {
             before(grammarAccess.getOtherOperationStatementAccess().getEntriesTaskDictionaryEntryParserRuleCall_0_1_8_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTaskDictionaryEntry();

            state._fsp--;

             after(grammarAccess.getOtherOperationStatementAccess().getEntriesTaskDictionaryEntryParserRuleCall_0_1_8_1_1_0()); 

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
    // $ANTLR end "rule__OtherOperationStatement__EntriesAssignment_0_1_8_1_1"


    // $ANTLR start "rule__OtherOperationStatement__TypeAssignment_1_1_2"
    // InternalMyDsl.g:2876:1: rule__OtherOperationStatement__TypeAssignment_1_1_2 : ( ( 'UPDATE,' ) ) ;
    public final void rule__OtherOperationStatement__TypeAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2880:1: ( ( ( 'UPDATE,' ) ) )
            // InternalMyDsl.g:2881:2: ( ( 'UPDATE,' ) )
            {
            // InternalMyDsl.g:2881:2: ( ( 'UPDATE,' ) )
            // InternalMyDsl.g:2882:3: ( 'UPDATE,' )
            {
             before(grammarAccess.getOtherOperationStatementAccess().getTypeUPDATEKeyword_1_1_2_0()); 
            // InternalMyDsl.g:2883:3: ( 'UPDATE,' )
            // InternalMyDsl.g:2884:4: 'UPDATE,'
            {
             before(grammarAccess.getOtherOperationStatementAccess().getTypeUPDATEKeyword_1_1_2_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getOtherOperationStatementAccess().getTypeUPDATEKeyword_1_1_2_0()); 

            }

             after(grammarAccess.getOtherOperationStatementAccess().getTypeUPDATEKeyword_1_1_2_0()); 

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
    // $ANTLR end "rule__OtherOperationStatement__TypeAssignment_1_1_2"


    // $ANTLR start "rule__OtherOperationStatement__CollectionAssignment_1_1_4"
    // InternalMyDsl.g:2895:1: rule__OtherOperationStatement__CollectionAssignment_1_1_4 : ( ( RULE_ID ) ) ;
    public final void rule__OtherOperationStatement__CollectionAssignment_1_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2899:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:2900:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:2900:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:2901:3: ( RULE_ID )
            {
             before(grammarAccess.getOtherOperationStatementAccess().getCollectionMakeStatementCrossReference_1_1_4_0()); 
            // InternalMyDsl.g:2902:3: ( RULE_ID )
            // InternalMyDsl.g:2903:4: RULE_ID
            {
             before(grammarAccess.getOtherOperationStatementAccess().getCollectionMakeStatementIDTerminalRuleCall_1_1_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getOtherOperationStatementAccess().getCollectionMakeStatementIDTerminalRuleCall_1_1_4_0_1()); 

            }

             after(grammarAccess.getOtherOperationStatementAccess().getCollectionMakeStatementCrossReference_1_1_4_0()); 

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
    // $ANTLR end "rule__OtherOperationStatement__CollectionAssignment_1_1_4"


    // $ANTLR start "rule__OtherOperationStatement__EntriesAssignment_1_1_7_0"
    // InternalMyDsl.g:2914:1: rule__OtherOperationStatement__EntriesAssignment_1_1_7_0 : ( ruleTaskDictionaryEntry ) ;
    public final void rule__OtherOperationStatement__EntriesAssignment_1_1_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2918:1: ( ( ruleTaskDictionaryEntry ) )
            // InternalMyDsl.g:2919:2: ( ruleTaskDictionaryEntry )
            {
            // InternalMyDsl.g:2919:2: ( ruleTaskDictionaryEntry )
            // InternalMyDsl.g:2920:3: ruleTaskDictionaryEntry
            {
             before(grammarAccess.getOtherOperationStatementAccess().getEntriesTaskDictionaryEntryParserRuleCall_1_1_7_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTaskDictionaryEntry();

            state._fsp--;

             after(grammarAccess.getOtherOperationStatementAccess().getEntriesTaskDictionaryEntryParserRuleCall_1_1_7_0_0()); 

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
    // $ANTLR end "rule__OtherOperationStatement__EntriesAssignment_1_1_7_0"


    // $ANTLR start "rule__OtherOperationStatement__EntriesAssignment_1_1_7_1_1"
    // InternalMyDsl.g:2929:1: rule__OtherOperationStatement__EntriesAssignment_1_1_7_1_1 : ( ruleTaskDictionaryEntry ) ;
    public final void rule__OtherOperationStatement__EntriesAssignment_1_1_7_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2933:1: ( ( ruleTaskDictionaryEntry ) )
            // InternalMyDsl.g:2934:2: ( ruleTaskDictionaryEntry )
            {
            // InternalMyDsl.g:2934:2: ( ruleTaskDictionaryEntry )
            // InternalMyDsl.g:2935:3: ruleTaskDictionaryEntry
            {
             before(grammarAccess.getOtherOperationStatementAccess().getEntriesTaskDictionaryEntryParserRuleCall_1_1_7_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTaskDictionaryEntry();

            state._fsp--;

             after(grammarAccess.getOtherOperationStatementAccess().getEntriesTaskDictionaryEntryParserRuleCall_1_1_7_1_1_0()); 

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
    // $ANTLR end "rule__OtherOperationStatement__EntriesAssignment_1_1_7_1_1"


    // $ANTLR start "rule__OtherOperationStatement__EntriesAssignment_1_1_9_3_0"
    // InternalMyDsl.g:2944:1: rule__OtherOperationStatement__EntriesAssignment_1_1_9_3_0 : ( ruleTaskDictionaryEntry ) ;
    public final void rule__OtherOperationStatement__EntriesAssignment_1_1_9_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2948:1: ( ( ruleTaskDictionaryEntry ) )
            // InternalMyDsl.g:2949:2: ( ruleTaskDictionaryEntry )
            {
            // InternalMyDsl.g:2949:2: ( ruleTaskDictionaryEntry )
            // InternalMyDsl.g:2950:3: ruleTaskDictionaryEntry
            {
             before(grammarAccess.getOtherOperationStatementAccess().getEntriesTaskDictionaryEntryParserRuleCall_1_1_9_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTaskDictionaryEntry();

            state._fsp--;

             after(grammarAccess.getOtherOperationStatementAccess().getEntriesTaskDictionaryEntryParserRuleCall_1_1_9_3_0_0()); 

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
    // $ANTLR end "rule__OtherOperationStatement__EntriesAssignment_1_1_9_3_0"


    // $ANTLR start "rule__OtherOperationStatement__EntriesAssignment_1_1_9_3_1_1"
    // InternalMyDsl.g:2959:1: rule__OtherOperationStatement__EntriesAssignment_1_1_9_3_1_1 : ( ruleTaskDictionaryEntry ) ;
    public final void rule__OtherOperationStatement__EntriesAssignment_1_1_9_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2963:1: ( ( ruleTaskDictionaryEntry ) )
            // InternalMyDsl.g:2964:2: ( ruleTaskDictionaryEntry )
            {
            // InternalMyDsl.g:2964:2: ( ruleTaskDictionaryEntry )
            // InternalMyDsl.g:2965:3: ruleTaskDictionaryEntry
            {
             before(grammarAccess.getOtherOperationStatementAccess().getEntriesTaskDictionaryEntryParserRuleCall_1_1_9_3_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTaskDictionaryEntry();

            state._fsp--;

             after(grammarAccess.getOtherOperationStatementAccess().getEntriesTaskDictionaryEntryParserRuleCall_1_1_9_3_1_1_0()); 

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
    // $ANTLR end "rule__OtherOperationStatement__EntriesAssignment_1_1_9_3_1_1"


    // $ANTLR start "rule__TaskDictionaryEntry__ValueNameAssignment_0"
    // InternalMyDsl.g:2974:1: rule__TaskDictionaryEntry__ValueNameAssignment_0 : ( RULE_ID ) ;
    public final void rule__TaskDictionaryEntry__ValueNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2978:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2979:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2979:2: ( RULE_ID )
            // InternalMyDsl.g:2980:3: RULE_ID
            {
             before(grammarAccess.getTaskDictionaryEntryAccess().getValueNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTaskDictionaryEntryAccess().getValueNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__TaskDictionaryEntry__ValueNameAssignment_0"


    // $ANTLR start "rule__TaskDictionaryEntry__ValueStringAssignment_2_0"
    // InternalMyDsl.g:2989:1: rule__TaskDictionaryEntry__ValueStringAssignment_2_0 : ( RULE_STRING ) ;
    public final void rule__TaskDictionaryEntry__ValueStringAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2993:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:2994:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:2994:2: ( RULE_STRING )
            // InternalMyDsl.g:2995:3: RULE_STRING
            {
             before(grammarAccess.getTaskDictionaryEntryAccess().getValueStringSTRINGTerminalRuleCall_2_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTaskDictionaryEntryAccess().getValueStringSTRINGTerminalRuleCall_2_0_0()); 

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
    // $ANTLR end "rule__TaskDictionaryEntry__ValueStringAssignment_2_0"


    // $ANTLR start "rule__TaskDictionaryEntry__ValueIntAssignment_2_1"
    // InternalMyDsl.g:3004:1: rule__TaskDictionaryEntry__ValueIntAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__TaskDictionaryEntry__ValueIntAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3008:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:3009:2: ( RULE_INT )
            {
            // InternalMyDsl.g:3009:2: ( RULE_INT )
            // InternalMyDsl.g:3010:3: RULE_INT
            {
             before(grammarAccess.getTaskDictionaryEntryAccess().getValueIntINTTerminalRuleCall_2_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTaskDictionaryEntryAccess().getValueIntINTTerminalRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__TaskDictionaryEntry__ValueIntAssignment_2_1"

    // Delegated rules


    protected DFA21 dfa21 = new DFA21(this);
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

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "2542:2: ( rule__ConnectionStatement__UnorderedGroup__1 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA21_7 = input.LA(1);

                         
                        int index21_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionStatementAccess().getUnorderedGroup(), 1) ) {s = 9;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getConnectionStatementAccess().getUnorderedGroup()) ) {s = 3;}

                         
                        input.seek(index21_7);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA21_10 = input.LA(1);

                         
                        int index21_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionStatementAccess().getUnorderedGroup(), 0) ) {s = 9;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getConnectionStatementAccess().getUnorderedGroup()) ) {s = 3;}

                         
                        input.seek(index21_10);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 21, _s, input);
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
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000050L});

}
