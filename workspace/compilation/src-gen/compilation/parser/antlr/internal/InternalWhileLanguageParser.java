package compilation.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import compilation.services.WhileLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalWhileLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SYMBOL", "RULE_VARIABLE", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'function'", "':'", "'%'", "'read'", "','", "'write'", "':='", "'nop'", "';'", "'foreach'", "'in'", "'do'", "'od'", "'if'", "'then'", "'else'", "'fi'", "'for'", "'while'", "'nil'", "'('", "'cons'", "')'", "'list'", "'hd'", "'tl'", "'!'", "'and'", "'or'", "'=?'"
    };
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=6;
    public static final int RULE_WS=11;
    public static final int RULE_VARIABLE=5;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int RULE_SYMBOL=4;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__42=42;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalWhileLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalWhileLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalWhileLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "InternalWhileLanguage.g"; }



     	private WhileLanguageGrammarAccess grammarAccess;

        public InternalWhileLanguageParser(TokenStream input, WhileLanguageGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Program";
       	}

       	@Override
       	protected WhileLanguageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProgram"
    // InternalWhileLanguage.g:64:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // InternalWhileLanguage.g:64:48: (iv_ruleProgram= ruleProgram EOF )
            // InternalWhileLanguage.g:65:2: iv_ruleProgram= ruleProgram EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProgramRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleProgram=ruleProgram();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProgram; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalWhileLanguage.g:71:1: ruleProgram returns [EObject current=null] : ( (lv_functions_0_0= ruleFunction ) )* ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_functions_0_0 = null;



        	enterRule();

        try {
            // InternalWhileLanguage.g:77:2: ( ( (lv_functions_0_0= ruleFunction ) )* )
            // InternalWhileLanguage.g:78:2: ( (lv_functions_0_0= ruleFunction ) )*
            {
            // InternalWhileLanguage.g:78:2: ( (lv_functions_0_0= ruleFunction ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalWhileLanguage.g:79:3: (lv_functions_0_0= ruleFunction )
            	    {
            	    // InternalWhileLanguage.g:79:3: (lv_functions_0_0= ruleFunction )
            	    // InternalWhileLanguage.g:80:4: lv_functions_0_0= ruleFunction
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getProgramAccess().getFunctionsFunctionParserRuleCall_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_functions_0_0=ruleFunction();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				if (current==null) {
            	      					current = createModelElementForParent(grammarAccess.getProgramRule());
            	      				}
            	      				add(
            	      					current,
            	      					"functions",
            	      					lv_functions_0_0,
            	      					"compilation.WhileLanguage.Function");
            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleFunction"
    // InternalWhileLanguage.g:100:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // InternalWhileLanguage.g:100:49: (iv_ruleFunction= ruleFunction EOF )
            // InternalWhileLanguage.g:101:2: iv_ruleFunction= ruleFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFunction=ruleFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunction; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // InternalWhileLanguage.g:107:1: ruleFunction returns [EObject current=null] : (otherlv_0= 'function' ( (lv_name_1_0= RULE_SYMBOL ) ) otherlv_2= ':' ( (lv_definition_3_0= ruleDefinition ) ) ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_definition_3_0 = null;



        	enterRule();

        try {
            // InternalWhileLanguage.g:113:2: ( (otherlv_0= 'function' ( (lv_name_1_0= RULE_SYMBOL ) ) otherlv_2= ':' ( (lv_definition_3_0= ruleDefinition ) ) ) )
            // InternalWhileLanguage.g:114:2: (otherlv_0= 'function' ( (lv_name_1_0= RULE_SYMBOL ) ) otherlv_2= ':' ( (lv_definition_3_0= ruleDefinition ) ) )
            {
            // InternalWhileLanguage.g:114:2: (otherlv_0= 'function' ( (lv_name_1_0= RULE_SYMBOL ) ) otherlv_2= ':' ( (lv_definition_3_0= ruleDefinition ) ) )
            // InternalWhileLanguage.g:115:3: otherlv_0= 'function' ( (lv_name_1_0= RULE_SYMBOL ) ) otherlv_2= ':' ( (lv_definition_3_0= ruleDefinition ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getFunctionAccess().getFunctionKeyword_0());
              		
            }
            // InternalWhileLanguage.g:119:3: ( (lv_name_1_0= RULE_SYMBOL ) )
            // InternalWhileLanguage.g:120:4: (lv_name_1_0= RULE_SYMBOL )
            {
            // InternalWhileLanguage.g:120:4: (lv_name_1_0= RULE_SYMBOL )
            // InternalWhileLanguage.g:121:5: lv_name_1_0= RULE_SYMBOL
            {
            lv_name_1_0=(Token)match(input,RULE_SYMBOL,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getFunctionAccess().getNameSYMBOLTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getFunctionRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"compilation.WhileLanguage.SYMBOL");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getFunctionAccess().getColonKeyword_2());
              		
            }
            // InternalWhileLanguage.g:141:3: ( (lv_definition_3_0= ruleDefinition ) )
            // InternalWhileLanguage.g:142:4: (lv_definition_3_0= ruleDefinition )
            {
            // InternalWhileLanguage.g:142:4: (lv_definition_3_0= ruleDefinition )
            // InternalWhileLanguage.g:143:5: lv_definition_3_0= ruleDefinition
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFunctionAccess().getDefinitionDefinitionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_definition_3_0=ruleDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFunctionRule());
              					}
              					set(
              						current,
              						"definition",
              						lv_definition_3_0,
              						"compilation.WhileLanguage.Definition");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleDefinition"
    // InternalWhileLanguage.g:164:1: entryRuleDefinition returns [EObject current=null] : iv_ruleDefinition= ruleDefinition EOF ;
    public final EObject entryRuleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinition = null;


        try {
            // InternalWhileLanguage.g:164:51: (iv_ruleDefinition= ruleDefinition EOF )
            // InternalWhileLanguage.g:165:2: iv_ruleDefinition= ruleDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDefinition=ruleDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefinition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDefinition"


    // $ANTLR start "ruleDefinition"
    // InternalWhileLanguage.g:171:1: ruleDefinition returns [EObject current=null] : ( ( (lv_read_0_0= ruleRead ) ) otherlv_1= '%' ( (lv_commands_2_0= ruleCommands ) ) otherlv_3= '%' ( (lv_write_4_0= ruleWrite ) ) ) ;
    public final EObject ruleDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_read_0_0 = null;

        EObject lv_commands_2_0 = null;

        EObject lv_write_4_0 = null;



        	enterRule();

        try {
            // InternalWhileLanguage.g:177:2: ( ( ( (lv_read_0_0= ruleRead ) ) otherlv_1= '%' ( (lv_commands_2_0= ruleCommands ) ) otherlv_3= '%' ( (lv_write_4_0= ruleWrite ) ) ) )
            // InternalWhileLanguage.g:178:2: ( ( (lv_read_0_0= ruleRead ) ) otherlv_1= '%' ( (lv_commands_2_0= ruleCommands ) ) otherlv_3= '%' ( (lv_write_4_0= ruleWrite ) ) )
            {
            // InternalWhileLanguage.g:178:2: ( ( (lv_read_0_0= ruleRead ) ) otherlv_1= '%' ( (lv_commands_2_0= ruleCommands ) ) otherlv_3= '%' ( (lv_write_4_0= ruleWrite ) ) )
            // InternalWhileLanguage.g:179:3: ( (lv_read_0_0= ruleRead ) ) otherlv_1= '%' ( (lv_commands_2_0= ruleCommands ) ) otherlv_3= '%' ( (lv_write_4_0= ruleWrite ) )
            {
            // InternalWhileLanguage.g:179:3: ( (lv_read_0_0= ruleRead ) )
            // InternalWhileLanguage.g:180:4: (lv_read_0_0= ruleRead )
            {
            // InternalWhileLanguage.g:180:4: (lv_read_0_0= ruleRead )
            // InternalWhileLanguage.g:181:5: lv_read_0_0= ruleRead
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDefinitionAccess().getReadReadParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_7);
            lv_read_0_0=ruleRead();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDefinitionRule());
              					}
              					set(
              						current,
              						"read",
              						lv_read_0_0,
              						"compilation.WhileLanguage.Read");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDefinitionAccess().getPercentSignKeyword_1());
              		
            }
            // InternalWhileLanguage.g:202:3: ( (lv_commands_2_0= ruleCommands ) )
            // InternalWhileLanguage.g:203:4: (lv_commands_2_0= ruleCommands )
            {
            // InternalWhileLanguage.g:203:4: (lv_commands_2_0= ruleCommands )
            // InternalWhileLanguage.g:204:5: lv_commands_2_0= ruleCommands
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDefinitionAccess().getCommandsCommandsParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_7);
            lv_commands_2_0=ruleCommands();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDefinitionRule());
              					}
              					set(
              						current,
              						"commands",
              						lv_commands_2_0,
              						"compilation.WhileLanguage.Commands");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getDefinitionAccess().getPercentSignKeyword_3());
              		
            }
            // InternalWhileLanguage.g:225:3: ( (lv_write_4_0= ruleWrite ) )
            // InternalWhileLanguage.g:226:4: (lv_write_4_0= ruleWrite )
            {
            // InternalWhileLanguage.g:226:4: (lv_write_4_0= ruleWrite )
            // InternalWhileLanguage.g:227:5: lv_write_4_0= ruleWrite
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDefinitionAccess().getWriteWriteParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_write_4_0=ruleWrite();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDefinitionRule());
              					}
              					set(
              						current,
              						"write",
              						lv_write_4_0,
              						"compilation.WhileLanguage.Write");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleDefinition"


    // $ANTLR start "entryRuleRead"
    // InternalWhileLanguage.g:248:1: entryRuleRead returns [EObject current=null] : iv_ruleRead= ruleRead EOF ;
    public final EObject entryRuleRead() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRead = null;


        try {
            // InternalWhileLanguage.g:248:45: (iv_ruleRead= ruleRead EOF )
            // InternalWhileLanguage.g:249:2: iv_ruleRead= ruleRead EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReadRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRead=ruleRead();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRead; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRead"


    // $ANTLR start "ruleRead"
    // InternalWhileLanguage.g:255:1: ruleRead returns [EObject current=null] : (otherlv_0= 'read' ( (lv_variable_1_0= RULE_VARIABLE ) ) (otherlv_2= ',' ( (lv_variable_3_0= RULE_VARIABLE ) ) )* ) ;
    public final EObject ruleRead() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_variable_1_0=null;
        Token otherlv_2=null;
        Token lv_variable_3_0=null;


        	enterRule();

        try {
            // InternalWhileLanguage.g:261:2: ( (otherlv_0= 'read' ( (lv_variable_1_0= RULE_VARIABLE ) ) (otherlv_2= ',' ( (lv_variable_3_0= RULE_VARIABLE ) ) )* ) )
            // InternalWhileLanguage.g:262:2: (otherlv_0= 'read' ( (lv_variable_1_0= RULE_VARIABLE ) ) (otherlv_2= ',' ( (lv_variable_3_0= RULE_VARIABLE ) ) )* )
            {
            // InternalWhileLanguage.g:262:2: (otherlv_0= 'read' ( (lv_variable_1_0= RULE_VARIABLE ) ) (otherlv_2= ',' ( (lv_variable_3_0= RULE_VARIABLE ) ) )* )
            // InternalWhileLanguage.g:263:3: otherlv_0= 'read' ( (lv_variable_1_0= RULE_VARIABLE ) ) (otherlv_2= ',' ( (lv_variable_3_0= RULE_VARIABLE ) ) )*
            {
            otherlv_0=(Token)match(input,16,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getReadAccess().getReadKeyword_0());
              		
            }
            // InternalWhileLanguage.g:267:3: ( (lv_variable_1_0= RULE_VARIABLE ) )
            // InternalWhileLanguage.g:268:4: (lv_variable_1_0= RULE_VARIABLE )
            {
            // InternalWhileLanguage.g:268:4: (lv_variable_1_0= RULE_VARIABLE )
            // InternalWhileLanguage.g:269:5: lv_variable_1_0= RULE_VARIABLE
            {
            lv_variable_1_0=(Token)match(input,RULE_VARIABLE,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_variable_1_0, grammarAccess.getReadAccess().getVariableVARIABLETerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getReadRule());
              					}
              					addWithLastConsumed(
              						current,
              						"variable",
              						lv_variable_1_0,
              						"compilation.WhileLanguage.VARIABLE");
              				
            }

            }


            }

            // InternalWhileLanguage.g:285:3: (otherlv_2= ',' ( (lv_variable_3_0= RULE_VARIABLE ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==17) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalWhileLanguage.g:286:4: otherlv_2= ',' ( (lv_variable_3_0= RULE_VARIABLE ) )
            	    {
            	    otherlv_2=(Token)match(input,17,FOLLOW_10); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getReadAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalWhileLanguage.g:290:4: ( (lv_variable_3_0= RULE_VARIABLE ) )
            	    // InternalWhileLanguage.g:291:5: (lv_variable_3_0= RULE_VARIABLE )
            	    {
            	    // InternalWhileLanguage.g:291:5: (lv_variable_3_0= RULE_VARIABLE )
            	    // InternalWhileLanguage.g:292:6: lv_variable_3_0= RULE_VARIABLE
            	    {
            	    lv_variable_3_0=(Token)match(input,RULE_VARIABLE,FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_variable_3_0, grammarAccess.getReadAccess().getVariableVARIABLETerminalRuleCall_2_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getReadRule());
            	      						}
            	      						addWithLastConsumed(
            	      							current,
            	      							"variable",
            	      							lv_variable_3_0,
            	      							"compilation.WhileLanguage.VARIABLE");
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleRead"


    // $ANTLR start "entryRuleWrite"
    // InternalWhileLanguage.g:313:1: entryRuleWrite returns [EObject current=null] : iv_ruleWrite= ruleWrite EOF ;
    public final EObject entryRuleWrite() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWrite = null;


        try {
            // InternalWhileLanguage.g:313:46: (iv_ruleWrite= ruleWrite EOF )
            // InternalWhileLanguage.g:314:2: iv_ruleWrite= ruleWrite EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWriteRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleWrite=ruleWrite();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWrite; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleWrite"


    // $ANTLR start "ruleWrite"
    // InternalWhileLanguage.g:320:1: ruleWrite returns [EObject current=null] : (otherlv_0= 'write' ( (lv_variable_1_0= RULE_VARIABLE ) ) (otherlv_2= ',' ( (lv_variable_3_0= RULE_VARIABLE ) ) )* ) ;
    public final EObject ruleWrite() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_variable_1_0=null;
        Token otherlv_2=null;
        Token lv_variable_3_0=null;


        	enterRule();

        try {
            // InternalWhileLanguage.g:326:2: ( (otherlv_0= 'write' ( (lv_variable_1_0= RULE_VARIABLE ) ) (otherlv_2= ',' ( (lv_variable_3_0= RULE_VARIABLE ) ) )* ) )
            // InternalWhileLanguage.g:327:2: (otherlv_0= 'write' ( (lv_variable_1_0= RULE_VARIABLE ) ) (otherlv_2= ',' ( (lv_variable_3_0= RULE_VARIABLE ) ) )* )
            {
            // InternalWhileLanguage.g:327:2: (otherlv_0= 'write' ( (lv_variable_1_0= RULE_VARIABLE ) ) (otherlv_2= ',' ( (lv_variable_3_0= RULE_VARIABLE ) ) )* )
            // InternalWhileLanguage.g:328:3: otherlv_0= 'write' ( (lv_variable_1_0= RULE_VARIABLE ) ) (otherlv_2= ',' ( (lv_variable_3_0= RULE_VARIABLE ) ) )*
            {
            otherlv_0=(Token)match(input,18,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getWriteAccess().getWriteKeyword_0());
              		
            }
            // InternalWhileLanguage.g:332:3: ( (lv_variable_1_0= RULE_VARIABLE ) )
            // InternalWhileLanguage.g:333:4: (lv_variable_1_0= RULE_VARIABLE )
            {
            // InternalWhileLanguage.g:333:4: (lv_variable_1_0= RULE_VARIABLE )
            // InternalWhileLanguage.g:334:5: lv_variable_1_0= RULE_VARIABLE
            {
            lv_variable_1_0=(Token)match(input,RULE_VARIABLE,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_variable_1_0, grammarAccess.getWriteAccess().getVariableVARIABLETerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getWriteRule());
              					}
              					addWithLastConsumed(
              						current,
              						"variable",
              						lv_variable_1_0,
              						"compilation.WhileLanguage.VARIABLE");
              				
            }

            }


            }

            // InternalWhileLanguage.g:350:3: (otherlv_2= ',' ( (lv_variable_3_0= RULE_VARIABLE ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalWhileLanguage.g:351:4: otherlv_2= ',' ( (lv_variable_3_0= RULE_VARIABLE ) )
            	    {
            	    otherlv_2=(Token)match(input,17,FOLLOW_10); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getWriteAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalWhileLanguage.g:355:4: ( (lv_variable_3_0= RULE_VARIABLE ) )
            	    // InternalWhileLanguage.g:356:5: (lv_variable_3_0= RULE_VARIABLE )
            	    {
            	    // InternalWhileLanguage.g:356:5: (lv_variable_3_0= RULE_VARIABLE )
            	    // InternalWhileLanguage.g:357:6: lv_variable_3_0= RULE_VARIABLE
            	    {
            	    lv_variable_3_0=(Token)match(input,RULE_VARIABLE,FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_variable_3_0, grammarAccess.getWriteAccess().getVariableVARIABLETerminalRuleCall_2_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getWriteRule());
            	      						}
            	      						addWithLastConsumed(
            	      							current,
            	      							"variable",
            	      							lv_variable_3_0,
            	      							"compilation.WhileLanguage.VARIABLE");
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleWrite"


    // $ANTLR start "entryRuleAffectation"
    // InternalWhileLanguage.g:378:1: entryRuleAffectation returns [EObject current=null] : iv_ruleAffectation= ruleAffectation EOF ;
    public final EObject entryRuleAffectation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAffectation = null;


        try {
            // InternalWhileLanguage.g:378:52: (iv_ruleAffectation= ruleAffectation EOF )
            // InternalWhileLanguage.g:379:2: iv_ruleAffectation= ruleAffectation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAffectationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAffectation=ruleAffectation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAffectation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAffectation"


    // $ANTLR start "ruleAffectation"
    // InternalWhileLanguage.g:385:1: ruleAffectation returns [EObject current=null] : ( ( (lv_affectations_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_affectations_2_0= RULE_VARIABLE ) ) )* otherlv_3= ':=' ( (lv_valeurs_4_0= ruleExpr ) ) (otherlv_5= ',' ( (lv_valeurs_6_0= ruleExpr ) ) )* ) ;
    public final EObject ruleAffectation() throws RecognitionException {
        EObject current = null;

        Token lv_affectations_0_0=null;
        Token otherlv_1=null;
        Token lv_affectations_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_valeurs_4_0 = null;

        EObject lv_valeurs_6_0 = null;



        	enterRule();

        try {
            // InternalWhileLanguage.g:391:2: ( ( ( (lv_affectations_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_affectations_2_0= RULE_VARIABLE ) ) )* otherlv_3= ':=' ( (lv_valeurs_4_0= ruleExpr ) ) (otherlv_5= ',' ( (lv_valeurs_6_0= ruleExpr ) ) )* ) )
            // InternalWhileLanguage.g:392:2: ( ( (lv_affectations_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_affectations_2_0= RULE_VARIABLE ) ) )* otherlv_3= ':=' ( (lv_valeurs_4_0= ruleExpr ) ) (otherlv_5= ',' ( (lv_valeurs_6_0= ruleExpr ) ) )* )
            {
            // InternalWhileLanguage.g:392:2: ( ( (lv_affectations_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_affectations_2_0= RULE_VARIABLE ) ) )* otherlv_3= ':=' ( (lv_valeurs_4_0= ruleExpr ) ) (otherlv_5= ',' ( (lv_valeurs_6_0= ruleExpr ) ) )* )
            // InternalWhileLanguage.g:393:3: ( (lv_affectations_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_affectations_2_0= RULE_VARIABLE ) ) )* otherlv_3= ':=' ( (lv_valeurs_4_0= ruleExpr ) ) (otherlv_5= ',' ( (lv_valeurs_6_0= ruleExpr ) ) )*
            {
            // InternalWhileLanguage.g:393:3: ( (lv_affectations_0_0= RULE_VARIABLE ) )
            // InternalWhileLanguage.g:394:4: (lv_affectations_0_0= RULE_VARIABLE )
            {
            // InternalWhileLanguage.g:394:4: (lv_affectations_0_0= RULE_VARIABLE )
            // InternalWhileLanguage.g:395:5: lv_affectations_0_0= RULE_VARIABLE
            {
            lv_affectations_0_0=(Token)match(input,RULE_VARIABLE,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_affectations_0_0, grammarAccess.getAffectationAccess().getAffectationsVARIABLETerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getAffectationRule());
              					}
              					addWithLastConsumed(
              						current,
              						"affectations",
              						lv_affectations_0_0,
              						"compilation.WhileLanguage.VARIABLE");
              				
            }

            }


            }

            // InternalWhileLanguage.g:411:3: (otherlv_1= ',' ( (lv_affectations_2_0= RULE_VARIABLE ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalWhileLanguage.g:412:4: otherlv_1= ',' ( (lv_affectations_2_0= RULE_VARIABLE ) )
            	    {
            	    otherlv_1=(Token)match(input,17,FOLLOW_10); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getAffectationAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalWhileLanguage.g:416:4: ( (lv_affectations_2_0= RULE_VARIABLE ) )
            	    // InternalWhileLanguage.g:417:5: (lv_affectations_2_0= RULE_VARIABLE )
            	    {
            	    // InternalWhileLanguage.g:417:5: (lv_affectations_2_0= RULE_VARIABLE )
            	    // InternalWhileLanguage.g:418:6: lv_affectations_2_0= RULE_VARIABLE
            	    {
            	    lv_affectations_2_0=(Token)match(input,RULE_VARIABLE,FOLLOW_12); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_affectations_2_0, grammarAccess.getAffectationAccess().getAffectationsVARIABLETerminalRuleCall_1_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getAffectationRule());
            	      						}
            	      						addWithLastConsumed(
            	      							current,
            	      							"affectations",
            	      							lv_affectations_2_0,
            	      							"compilation.WhileLanguage.VARIABLE");
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_3=(Token)match(input,19,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getAffectationAccess().getColonEqualsSignKeyword_2());
              		
            }
            // InternalWhileLanguage.g:439:3: ( (lv_valeurs_4_0= ruleExpr ) )
            // InternalWhileLanguage.g:440:4: (lv_valeurs_4_0= ruleExpr )
            {
            // InternalWhileLanguage.g:440:4: (lv_valeurs_4_0= ruleExpr )
            // InternalWhileLanguage.g:441:5: lv_valeurs_4_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAffectationAccess().getValeursExprParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_11);
            lv_valeurs_4_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAffectationRule());
              					}
              					add(
              						current,
              						"valeurs",
              						lv_valeurs_4_0,
              						"compilation.WhileLanguage.Expr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalWhileLanguage.g:458:3: (otherlv_5= ',' ( (lv_valeurs_6_0= ruleExpr ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalWhileLanguage.g:459:4: otherlv_5= ',' ( (lv_valeurs_6_0= ruleExpr ) )
            	    {
            	    otherlv_5=(Token)match(input,17,FOLLOW_13); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_5, grammarAccess.getAffectationAccess().getCommaKeyword_4_0());
            	      			
            	    }
            	    // InternalWhileLanguage.g:463:4: ( (lv_valeurs_6_0= ruleExpr ) )
            	    // InternalWhileLanguage.g:464:5: (lv_valeurs_6_0= ruleExpr )
            	    {
            	    // InternalWhileLanguage.g:464:5: (lv_valeurs_6_0= ruleExpr )
            	    // InternalWhileLanguage.g:465:6: lv_valeurs_6_0= ruleExpr
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAffectationAccess().getValeursExprParserRuleCall_4_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_11);
            	    lv_valeurs_6_0=ruleExpr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getAffectationRule());
            	      						}
            	      						add(
            	      							current,
            	      							"valeurs",
            	      							lv_valeurs_6_0,
            	      							"compilation.WhileLanguage.Expr");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAffectation"


    // $ANTLR start "entryRuleNop"
    // InternalWhileLanguage.g:487:1: entryRuleNop returns [EObject current=null] : iv_ruleNop= ruleNop EOF ;
    public final EObject entryRuleNop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNop = null;


        try {
            // InternalWhileLanguage.g:487:44: (iv_ruleNop= ruleNop EOF )
            // InternalWhileLanguage.g:488:2: iv_ruleNop= ruleNop EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNopRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNop=ruleNop();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNop; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNop"


    // $ANTLR start "ruleNop"
    // InternalWhileLanguage.g:494:1: ruleNop returns [EObject current=null] : ( (lv_nop_0_0= 'nop' ) ) ;
    public final EObject ruleNop() throws RecognitionException {
        EObject current = null;

        Token lv_nop_0_0=null;


        	enterRule();

        try {
            // InternalWhileLanguage.g:500:2: ( ( (lv_nop_0_0= 'nop' ) ) )
            // InternalWhileLanguage.g:501:2: ( (lv_nop_0_0= 'nop' ) )
            {
            // InternalWhileLanguage.g:501:2: ( (lv_nop_0_0= 'nop' ) )
            // InternalWhileLanguage.g:502:3: (lv_nop_0_0= 'nop' )
            {
            // InternalWhileLanguage.g:502:3: (lv_nop_0_0= 'nop' )
            // InternalWhileLanguage.g:503:4: lv_nop_0_0= 'nop'
            {
            lv_nop_0_0=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_nop_0_0, grammarAccess.getNopAccess().getNopNopKeyword_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getNopRule());
              				}
              				setWithLastConsumed(current, "nop", lv_nop_0_0, "nop");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNop"


    // $ANTLR start "entryRuleCommands"
    // InternalWhileLanguage.g:518:1: entryRuleCommands returns [EObject current=null] : iv_ruleCommands= ruleCommands EOF ;
    public final EObject entryRuleCommands() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommands = null;


        try {
            // InternalWhileLanguage.g:518:49: (iv_ruleCommands= ruleCommands EOF )
            // InternalWhileLanguage.g:519:2: iv_ruleCommands= ruleCommands EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommandsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCommands=ruleCommands();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommands; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCommands"


    // $ANTLR start "ruleCommands"
    // InternalWhileLanguage.g:525:1: ruleCommands returns [EObject current=null] : ( ( (lv_commands_0_0= ruleCommand ) ) (otherlv_1= ';' ( (lv_commands_2_0= ruleCommand ) ) )* ) ;
    public final EObject ruleCommands() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_commands_0_0 = null;

        EObject lv_commands_2_0 = null;



        	enterRule();

        try {
            // InternalWhileLanguage.g:531:2: ( ( ( (lv_commands_0_0= ruleCommand ) ) (otherlv_1= ';' ( (lv_commands_2_0= ruleCommand ) ) )* ) )
            // InternalWhileLanguage.g:532:2: ( ( (lv_commands_0_0= ruleCommand ) ) (otherlv_1= ';' ( (lv_commands_2_0= ruleCommand ) ) )* )
            {
            // InternalWhileLanguage.g:532:2: ( ( (lv_commands_0_0= ruleCommand ) ) (otherlv_1= ';' ( (lv_commands_2_0= ruleCommand ) ) )* )
            // InternalWhileLanguage.g:533:3: ( (lv_commands_0_0= ruleCommand ) ) (otherlv_1= ';' ( (lv_commands_2_0= ruleCommand ) ) )*
            {
            // InternalWhileLanguage.g:533:3: ( (lv_commands_0_0= ruleCommand ) )
            // InternalWhileLanguage.g:534:4: (lv_commands_0_0= ruleCommand )
            {
            // InternalWhileLanguage.g:534:4: (lv_commands_0_0= ruleCommand )
            // InternalWhileLanguage.g:535:5: lv_commands_0_0= ruleCommand
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCommandsAccess().getCommandsCommandParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_14);
            lv_commands_0_0=ruleCommand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCommandsRule());
              					}
              					add(
              						current,
              						"commands",
              						lv_commands_0_0,
              						"compilation.WhileLanguage.Command");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalWhileLanguage.g:552:3: (otherlv_1= ';' ( (lv_commands_2_0= ruleCommand ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==21) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalWhileLanguage.g:553:4: otherlv_1= ';' ( (lv_commands_2_0= ruleCommand ) )
            	    {
            	    otherlv_1=(Token)match(input,21,FOLLOW_8); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getCommandsAccess().getSemicolonKeyword_1_0());
            	      			
            	    }
            	    // InternalWhileLanguage.g:557:4: ( (lv_commands_2_0= ruleCommand ) )
            	    // InternalWhileLanguage.g:558:5: (lv_commands_2_0= ruleCommand )
            	    {
            	    // InternalWhileLanguage.g:558:5: (lv_commands_2_0= ruleCommand )
            	    // InternalWhileLanguage.g:559:6: lv_commands_2_0= ruleCommand
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getCommandsAccess().getCommandsCommandParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_14);
            	    lv_commands_2_0=ruleCommand();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getCommandsRule());
            	      						}
            	      						add(
            	      							current,
            	      							"commands",
            	      							lv_commands_2_0,
            	      							"compilation.WhileLanguage.Command");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleCommands"


    // $ANTLR start "entryRuleCommand"
    // InternalWhileLanguage.g:581:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // InternalWhileLanguage.g:581:48: (iv_ruleCommand= ruleCommand EOF )
            // InternalWhileLanguage.g:582:2: iv_ruleCommand= ruleCommand EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommandRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCommand=ruleCommand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommand; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCommand"


    // $ANTLR start "ruleCommand"
    // InternalWhileLanguage.g:588:1: ruleCommand returns [EObject current=null] : ( ( (lv_command_0_0= ruleNop ) ) | ( (lv_command_1_0= ruleAffectation ) ) | ( (lv_command_2_0= ruleWhile ) ) | ( (lv_command_3_0= ruleFor ) ) | ( (lv_command_4_0= ruleIf ) ) | ( (lv_command_5_0= ruleForeach ) ) ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        EObject lv_command_0_0 = null;

        EObject lv_command_1_0 = null;

        EObject lv_command_2_0 = null;

        EObject lv_command_3_0 = null;

        EObject lv_command_4_0 = null;

        EObject lv_command_5_0 = null;



        	enterRule();

        try {
            // InternalWhileLanguage.g:594:2: ( ( ( (lv_command_0_0= ruleNop ) ) | ( (lv_command_1_0= ruleAffectation ) ) | ( (lv_command_2_0= ruleWhile ) ) | ( (lv_command_3_0= ruleFor ) ) | ( (lv_command_4_0= ruleIf ) ) | ( (lv_command_5_0= ruleForeach ) ) ) )
            // InternalWhileLanguage.g:595:2: ( ( (lv_command_0_0= ruleNop ) ) | ( (lv_command_1_0= ruleAffectation ) ) | ( (lv_command_2_0= ruleWhile ) ) | ( (lv_command_3_0= ruleFor ) ) | ( (lv_command_4_0= ruleIf ) ) | ( (lv_command_5_0= ruleForeach ) ) )
            {
            // InternalWhileLanguage.g:595:2: ( ( (lv_command_0_0= ruleNop ) ) | ( (lv_command_1_0= ruleAffectation ) ) | ( (lv_command_2_0= ruleWhile ) ) | ( (lv_command_3_0= ruleFor ) ) | ( (lv_command_4_0= ruleIf ) ) | ( (lv_command_5_0= ruleForeach ) ) )
            int alt7=6;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt7=1;
                }
                break;
            case RULE_VARIABLE:
                {
                alt7=2;
                }
                break;
            case 31:
                {
                alt7=3;
                }
                break;
            case 30:
                {
                alt7=4;
                }
                break;
            case 26:
                {
                alt7=5;
                }
                break;
            case 22:
                {
                alt7=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalWhileLanguage.g:596:3: ( (lv_command_0_0= ruleNop ) )
                    {
                    // InternalWhileLanguage.g:596:3: ( (lv_command_0_0= ruleNop ) )
                    // InternalWhileLanguage.g:597:4: (lv_command_0_0= ruleNop )
                    {
                    // InternalWhileLanguage.g:597:4: (lv_command_0_0= ruleNop )
                    // InternalWhileLanguage.g:598:5: lv_command_0_0= ruleNop
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getCommandAccess().getCommandNopParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_command_0_0=ruleNop();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getCommandRule());
                      					}
                      					set(
                      						current,
                      						"command",
                      						lv_command_0_0,
                      						"compilation.WhileLanguage.Nop");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalWhileLanguage.g:616:3: ( (lv_command_1_0= ruleAffectation ) )
                    {
                    // InternalWhileLanguage.g:616:3: ( (lv_command_1_0= ruleAffectation ) )
                    // InternalWhileLanguage.g:617:4: (lv_command_1_0= ruleAffectation )
                    {
                    // InternalWhileLanguage.g:617:4: (lv_command_1_0= ruleAffectation )
                    // InternalWhileLanguage.g:618:5: lv_command_1_0= ruleAffectation
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getCommandAccess().getCommandAffectationParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_command_1_0=ruleAffectation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getCommandRule());
                      					}
                      					set(
                      						current,
                      						"command",
                      						lv_command_1_0,
                      						"compilation.WhileLanguage.Affectation");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalWhileLanguage.g:636:3: ( (lv_command_2_0= ruleWhile ) )
                    {
                    // InternalWhileLanguage.g:636:3: ( (lv_command_2_0= ruleWhile ) )
                    // InternalWhileLanguage.g:637:4: (lv_command_2_0= ruleWhile )
                    {
                    // InternalWhileLanguage.g:637:4: (lv_command_2_0= ruleWhile )
                    // InternalWhileLanguage.g:638:5: lv_command_2_0= ruleWhile
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getCommandAccess().getCommandWhileParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_command_2_0=ruleWhile();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getCommandRule());
                      					}
                      					set(
                      						current,
                      						"command",
                      						lv_command_2_0,
                      						"compilation.WhileLanguage.While");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalWhileLanguage.g:656:3: ( (lv_command_3_0= ruleFor ) )
                    {
                    // InternalWhileLanguage.g:656:3: ( (lv_command_3_0= ruleFor ) )
                    // InternalWhileLanguage.g:657:4: (lv_command_3_0= ruleFor )
                    {
                    // InternalWhileLanguage.g:657:4: (lv_command_3_0= ruleFor )
                    // InternalWhileLanguage.g:658:5: lv_command_3_0= ruleFor
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getCommandAccess().getCommandForParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_command_3_0=ruleFor();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getCommandRule());
                      					}
                      					set(
                      						current,
                      						"command",
                      						lv_command_3_0,
                      						"compilation.WhileLanguage.For");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalWhileLanguage.g:676:3: ( (lv_command_4_0= ruleIf ) )
                    {
                    // InternalWhileLanguage.g:676:3: ( (lv_command_4_0= ruleIf ) )
                    // InternalWhileLanguage.g:677:4: (lv_command_4_0= ruleIf )
                    {
                    // InternalWhileLanguage.g:677:4: (lv_command_4_0= ruleIf )
                    // InternalWhileLanguage.g:678:5: lv_command_4_0= ruleIf
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getCommandAccess().getCommandIfParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_command_4_0=ruleIf();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getCommandRule());
                      					}
                      					set(
                      						current,
                      						"command",
                      						lv_command_4_0,
                      						"compilation.WhileLanguage.If");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalWhileLanguage.g:696:3: ( (lv_command_5_0= ruleForeach ) )
                    {
                    // InternalWhileLanguage.g:696:3: ( (lv_command_5_0= ruleForeach ) )
                    // InternalWhileLanguage.g:697:4: (lv_command_5_0= ruleForeach )
                    {
                    // InternalWhileLanguage.g:697:4: (lv_command_5_0= ruleForeach )
                    // InternalWhileLanguage.g:698:5: lv_command_5_0= ruleForeach
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getCommandAccess().getCommandForeachParserRuleCall_5_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_command_5_0=ruleForeach();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getCommandRule());
                      					}
                      					set(
                      						current,
                      						"command",
                      						lv_command_5_0,
                      						"compilation.WhileLanguage.Foreach");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleForeach"
    // InternalWhileLanguage.g:719:1: entryRuleForeach returns [EObject current=null] : iv_ruleForeach= ruleForeach EOF ;
    public final EObject entryRuleForeach() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForeach = null;


        try {
            // InternalWhileLanguage.g:719:48: (iv_ruleForeach= ruleForeach EOF )
            // InternalWhileLanguage.g:720:2: iv_ruleForeach= ruleForeach EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForeachRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleForeach=ruleForeach();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleForeach; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleForeach"


    // $ANTLR start "ruleForeach"
    // InternalWhileLanguage.g:726:1: ruleForeach returns [EObject current=null] : (otherlv_0= 'foreach' ( (lv_expr1_1_0= ruleExpr ) ) otherlv_2= 'in' ( (lv_expr2_3_0= ruleExpr ) ) otherlv_4= 'do' ( (lv_commands_5_0= ruleCommands ) ) otherlv_6= 'od' ) ;
    public final EObject ruleForeach() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_expr1_1_0 = null;

        EObject lv_expr2_3_0 = null;

        EObject lv_commands_5_0 = null;



        	enterRule();

        try {
            // InternalWhileLanguage.g:732:2: ( (otherlv_0= 'foreach' ( (lv_expr1_1_0= ruleExpr ) ) otherlv_2= 'in' ( (lv_expr2_3_0= ruleExpr ) ) otherlv_4= 'do' ( (lv_commands_5_0= ruleCommands ) ) otherlv_6= 'od' ) )
            // InternalWhileLanguage.g:733:2: (otherlv_0= 'foreach' ( (lv_expr1_1_0= ruleExpr ) ) otherlv_2= 'in' ( (lv_expr2_3_0= ruleExpr ) ) otherlv_4= 'do' ( (lv_commands_5_0= ruleCommands ) ) otherlv_6= 'od' )
            {
            // InternalWhileLanguage.g:733:2: (otherlv_0= 'foreach' ( (lv_expr1_1_0= ruleExpr ) ) otherlv_2= 'in' ( (lv_expr2_3_0= ruleExpr ) ) otherlv_4= 'do' ( (lv_commands_5_0= ruleCommands ) ) otherlv_6= 'od' )
            // InternalWhileLanguage.g:734:3: otherlv_0= 'foreach' ( (lv_expr1_1_0= ruleExpr ) ) otherlv_2= 'in' ( (lv_expr2_3_0= ruleExpr ) ) otherlv_4= 'do' ( (lv_commands_5_0= ruleCommands ) ) otherlv_6= 'od'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getForeachAccess().getForeachKeyword_0());
              		
            }
            // InternalWhileLanguage.g:738:3: ( (lv_expr1_1_0= ruleExpr ) )
            // InternalWhileLanguage.g:739:4: (lv_expr1_1_0= ruleExpr )
            {
            // InternalWhileLanguage.g:739:4: (lv_expr1_1_0= ruleExpr )
            // InternalWhileLanguage.g:740:5: lv_expr1_1_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getForeachAccess().getExpr1ExprParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_15);
            lv_expr1_1_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getForeachRule());
              					}
              					set(
              						current,
              						"expr1",
              						lv_expr1_1_0,
              						"compilation.WhileLanguage.Expr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getForeachAccess().getInKeyword_2());
              		
            }
            // InternalWhileLanguage.g:761:3: ( (lv_expr2_3_0= ruleExpr ) )
            // InternalWhileLanguage.g:762:4: (lv_expr2_3_0= ruleExpr )
            {
            // InternalWhileLanguage.g:762:4: (lv_expr2_3_0= ruleExpr )
            // InternalWhileLanguage.g:763:5: lv_expr2_3_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getForeachAccess().getExpr2ExprParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_16);
            lv_expr2_3_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getForeachRule());
              					}
              					set(
              						current,
              						"expr2",
              						lv_expr2_3_0,
              						"compilation.WhileLanguage.Expr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,24,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getForeachAccess().getDoKeyword_4());
              		
            }
            // InternalWhileLanguage.g:784:3: ( (lv_commands_5_0= ruleCommands ) )
            // InternalWhileLanguage.g:785:4: (lv_commands_5_0= ruleCommands )
            {
            // InternalWhileLanguage.g:785:4: (lv_commands_5_0= ruleCommands )
            // InternalWhileLanguage.g:786:5: lv_commands_5_0= ruleCommands
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getForeachAccess().getCommandsCommandsParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_17);
            lv_commands_5_0=ruleCommands();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getForeachRule());
              					}
              					set(
              						current,
              						"commands",
              						lv_commands_5_0,
              						"compilation.WhileLanguage.Commands");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_6=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getForeachAccess().getOdKeyword_6());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleForeach"


    // $ANTLR start "entryRuleIf"
    // InternalWhileLanguage.g:811:1: entryRuleIf returns [EObject current=null] : iv_ruleIf= ruleIf EOF ;
    public final EObject entryRuleIf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIf = null;


        try {
            // InternalWhileLanguage.g:811:43: (iv_ruleIf= ruleIf EOF )
            // InternalWhileLanguage.g:812:2: iv_ruleIf= ruleIf EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIf=ruleIf();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIf; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIf"


    // $ANTLR start "ruleIf"
    // InternalWhileLanguage.g:818:1: ruleIf returns [EObject current=null] : (otherlv_0= 'if' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'then' ( (lv_commands1_3_0= ruleCommands ) ) ( ( ( 'else' )=>otherlv_4= 'else' ) ( (lv_commands2_5_0= ruleCommands ) ) )? otherlv_6= 'fi' ) ;
    public final EObject ruleIf() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_expr_1_0 = null;

        EObject lv_commands1_3_0 = null;

        EObject lv_commands2_5_0 = null;



        	enterRule();

        try {
            // InternalWhileLanguage.g:824:2: ( (otherlv_0= 'if' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'then' ( (lv_commands1_3_0= ruleCommands ) ) ( ( ( 'else' )=>otherlv_4= 'else' ) ( (lv_commands2_5_0= ruleCommands ) ) )? otherlv_6= 'fi' ) )
            // InternalWhileLanguage.g:825:2: (otherlv_0= 'if' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'then' ( (lv_commands1_3_0= ruleCommands ) ) ( ( ( 'else' )=>otherlv_4= 'else' ) ( (lv_commands2_5_0= ruleCommands ) ) )? otherlv_6= 'fi' )
            {
            // InternalWhileLanguage.g:825:2: (otherlv_0= 'if' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'then' ( (lv_commands1_3_0= ruleCommands ) ) ( ( ( 'else' )=>otherlv_4= 'else' ) ( (lv_commands2_5_0= ruleCommands ) ) )? otherlv_6= 'fi' )
            // InternalWhileLanguage.g:826:3: otherlv_0= 'if' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'then' ( (lv_commands1_3_0= ruleCommands ) ) ( ( ( 'else' )=>otherlv_4= 'else' ) ( (lv_commands2_5_0= ruleCommands ) ) )? otherlv_6= 'fi'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getIfAccess().getIfKeyword_0());
              		
            }
            // InternalWhileLanguage.g:830:3: ( (lv_expr_1_0= ruleExpr ) )
            // InternalWhileLanguage.g:831:4: (lv_expr_1_0= ruleExpr )
            {
            // InternalWhileLanguage.g:831:4: (lv_expr_1_0= ruleExpr )
            // InternalWhileLanguage.g:832:5: lv_expr_1_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfAccess().getExprExprParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_18);
            lv_expr_1_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIfRule());
              					}
              					set(
              						current,
              						"expr",
              						lv_expr_1_0,
              						"compilation.WhileLanguage.Expr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getIfAccess().getThenKeyword_2());
              		
            }
            // InternalWhileLanguage.g:853:3: ( (lv_commands1_3_0= ruleCommands ) )
            // InternalWhileLanguage.g:854:4: (lv_commands1_3_0= ruleCommands )
            {
            // InternalWhileLanguage.g:854:4: (lv_commands1_3_0= ruleCommands )
            // InternalWhileLanguage.g:855:5: lv_commands1_3_0= ruleCommands
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfAccess().getCommands1CommandsParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_19);
            lv_commands1_3_0=ruleCommands();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIfRule());
              					}
              					set(
              						current,
              						"commands1",
              						lv_commands1_3_0,
              						"compilation.WhileLanguage.Commands");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalWhileLanguage.g:872:3: ( ( ( 'else' )=>otherlv_4= 'else' ) ( (lv_commands2_5_0= ruleCommands ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==28) && (synpred1_InternalWhileLanguage())) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalWhileLanguage.g:873:4: ( ( 'else' )=>otherlv_4= 'else' ) ( (lv_commands2_5_0= ruleCommands ) )
                    {
                    // InternalWhileLanguage.g:873:4: ( ( 'else' )=>otherlv_4= 'else' )
                    // InternalWhileLanguage.g:874:5: ( 'else' )=>otherlv_4= 'else'
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_4, grammarAccess.getIfAccess().getElseKeyword_4_0());
                      				
                    }

                    }

                    // InternalWhileLanguage.g:880:4: ( (lv_commands2_5_0= ruleCommands ) )
                    // InternalWhileLanguage.g:881:5: (lv_commands2_5_0= ruleCommands )
                    {
                    // InternalWhileLanguage.g:881:5: (lv_commands2_5_0= ruleCommands )
                    // InternalWhileLanguage.g:882:6: lv_commands2_5_0= ruleCommands
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getIfAccess().getCommands2CommandsParserRuleCall_4_1_0());
                      					
                    }
                    pushFollow(FOLLOW_20);
                    lv_commands2_5_0=ruleCommands();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getIfRule());
                      						}
                      						set(
                      							current,
                      							"commands2",
                      							lv_commands2_5_0,
                      							"compilation.WhileLanguage.Commands");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getIfAccess().getFiKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleIf"


    // $ANTLR start "entryRuleFor"
    // InternalWhileLanguage.g:908:1: entryRuleFor returns [EObject current=null] : iv_ruleFor= ruleFor EOF ;
    public final EObject entryRuleFor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFor = null;


        try {
            // InternalWhileLanguage.g:908:44: (iv_ruleFor= ruleFor EOF )
            // InternalWhileLanguage.g:909:2: iv_ruleFor= ruleFor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFor=ruleFor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFor; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFor"


    // $ANTLR start "ruleFor"
    // InternalWhileLanguage.g:915:1: ruleFor returns [EObject current=null] : (otherlv_0= 'for' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'do' ( (lv_commands_3_0= ruleCommands ) ) otherlv_4= 'od' ) ;
    public final EObject ruleFor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_expr_1_0 = null;

        EObject lv_commands_3_0 = null;



        	enterRule();

        try {
            // InternalWhileLanguage.g:921:2: ( (otherlv_0= 'for' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'do' ( (lv_commands_3_0= ruleCommands ) ) otherlv_4= 'od' ) )
            // InternalWhileLanguage.g:922:2: (otherlv_0= 'for' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'do' ( (lv_commands_3_0= ruleCommands ) ) otherlv_4= 'od' )
            {
            // InternalWhileLanguage.g:922:2: (otherlv_0= 'for' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'do' ( (lv_commands_3_0= ruleCommands ) ) otherlv_4= 'od' )
            // InternalWhileLanguage.g:923:3: otherlv_0= 'for' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'do' ( (lv_commands_3_0= ruleCommands ) ) otherlv_4= 'od'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getForAccess().getForKeyword_0());
              		
            }
            // InternalWhileLanguage.g:927:3: ( (lv_expr_1_0= ruleExpr ) )
            // InternalWhileLanguage.g:928:4: (lv_expr_1_0= ruleExpr )
            {
            // InternalWhileLanguage.g:928:4: (lv_expr_1_0= ruleExpr )
            // InternalWhileLanguage.g:929:5: lv_expr_1_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getForAccess().getExprExprParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_16);
            lv_expr_1_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getForRule());
              					}
              					set(
              						current,
              						"expr",
              						lv_expr_1_0,
              						"compilation.WhileLanguage.Expr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getForAccess().getDoKeyword_2());
              		
            }
            // InternalWhileLanguage.g:950:3: ( (lv_commands_3_0= ruleCommands ) )
            // InternalWhileLanguage.g:951:4: (lv_commands_3_0= ruleCommands )
            {
            // InternalWhileLanguage.g:951:4: (lv_commands_3_0= ruleCommands )
            // InternalWhileLanguage.g:952:5: lv_commands_3_0= ruleCommands
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getForAccess().getCommandsCommandsParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_17);
            lv_commands_3_0=ruleCommands();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getForRule());
              					}
              					set(
              						current,
              						"commands",
              						lv_commands_3_0,
              						"compilation.WhileLanguage.Commands");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getForAccess().getOdKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleFor"


    // $ANTLR start "entryRuleWhile"
    // InternalWhileLanguage.g:977:1: entryRuleWhile returns [EObject current=null] : iv_ruleWhile= ruleWhile EOF ;
    public final EObject entryRuleWhile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhile = null;


        try {
            // InternalWhileLanguage.g:977:46: (iv_ruleWhile= ruleWhile EOF )
            // InternalWhileLanguage.g:978:2: iv_ruleWhile= ruleWhile EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWhileRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleWhile=ruleWhile();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWhile; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleWhile"


    // $ANTLR start "ruleWhile"
    // InternalWhileLanguage.g:984:1: ruleWhile returns [EObject current=null] : (otherlv_0= 'while' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'do' ( (lv_commands_3_0= ruleCommands ) ) otherlv_4= 'od' ) ;
    public final EObject ruleWhile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_expr_1_0 = null;

        EObject lv_commands_3_0 = null;



        	enterRule();

        try {
            // InternalWhileLanguage.g:990:2: ( (otherlv_0= 'while' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'do' ( (lv_commands_3_0= ruleCommands ) ) otherlv_4= 'od' ) )
            // InternalWhileLanguage.g:991:2: (otherlv_0= 'while' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'do' ( (lv_commands_3_0= ruleCommands ) ) otherlv_4= 'od' )
            {
            // InternalWhileLanguage.g:991:2: (otherlv_0= 'while' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'do' ( (lv_commands_3_0= ruleCommands ) ) otherlv_4= 'od' )
            // InternalWhileLanguage.g:992:3: otherlv_0= 'while' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'do' ( (lv_commands_3_0= ruleCommands ) ) otherlv_4= 'od'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getWhileAccess().getWhileKeyword_0());
              		
            }
            // InternalWhileLanguage.g:996:3: ( (lv_expr_1_0= ruleExpr ) )
            // InternalWhileLanguage.g:997:4: (lv_expr_1_0= ruleExpr )
            {
            // InternalWhileLanguage.g:997:4: (lv_expr_1_0= ruleExpr )
            // InternalWhileLanguage.g:998:5: lv_expr_1_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getWhileAccess().getExprExprParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_16);
            lv_expr_1_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getWhileRule());
              					}
              					set(
              						current,
              						"expr",
              						lv_expr_1_0,
              						"compilation.WhileLanguage.Expr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getWhileAccess().getDoKeyword_2());
              		
            }
            // InternalWhileLanguage.g:1019:3: ( (lv_commands_3_0= ruleCommands ) )
            // InternalWhileLanguage.g:1020:4: (lv_commands_3_0= ruleCommands )
            {
            // InternalWhileLanguage.g:1020:4: (lv_commands_3_0= ruleCommands )
            // InternalWhileLanguage.g:1021:5: lv_commands_3_0= ruleCommands
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getWhileAccess().getCommandsCommandsParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_17);
            lv_commands_3_0=ruleCommands();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getWhileRule());
              					}
              					set(
              						current,
              						"commands",
              						lv_commands_3_0,
              						"compilation.WhileLanguage.Commands");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getWhileAccess().getOdKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleWhile"


    // $ANTLR start "entryRuleExpr"
    // InternalWhileLanguage.g:1046:1: entryRuleExpr returns [EObject current=null] : iv_ruleExpr= ruleExpr EOF ;
    public final EObject entryRuleExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpr = null;


        try {
            // InternalWhileLanguage.g:1046:45: (iv_ruleExpr= ruleExpr EOF )
            // InternalWhileLanguage.g:1047:2: iv_ruleExpr= ruleExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpr=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpr"


    // $ANTLR start "ruleExpr"
    // InternalWhileLanguage.g:1053:1: ruleExpr returns [EObject current=null] : ( ( (lv_valeur_0_0= 'nil' ) ) | ( (lv_valeur_1_0= RULE_VARIABLE ) ) | ( (lv_valeur_2_0= RULE_SYMBOL ) ) | (otherlv_3= '(' ( (lv_ope_4_0= 'cons' ) ) ( (lv_lexpr_5_0= ruleLexpr ) ) otherlv_6= ')' ) | (otherlv_7= '(' ( (lv_ope_8_0= 'list' ) ) ( (lv_lexpr_9_0= ruleLexpr ) ) otherlv_10= ')' ) | (otherlv_11= '(' ( (lv_ope_12_0= RULE_SYMBOL ) ) ( (lv_lexpr_13_0= ruleLexpr ) ) otherlv_14= ')' ) | (otherlv_15= '(' ( (lv_ope_16_0= 'hd' ) ) ( (lv_expr_17_0= ruleExpr ) ) otherlv_18= ')' ) | (otherlv_19= '(' ( (lv_ope_20_0= 'tl' ) ) ( (lv_expr_21_0= ruleExpr ) ) otherlv_22= ')' ) | (otherlv_23= '(' ( (lv_ope_24_0= '!' ) ) ( (lv_expr_25_0= ruleExpr ) ) otherlv_26= ')' ) | (otherlv_27= '(' ( (lv_ex1_28_0= ruleExpr ) ) ( ( (lv_ope_29_1= 'and' | lv_ope_29_2= 'or' | lv_ope_29_3= '=?' ) ) ) ( (lv_ex2_30_0= ruleExpr ) ) otherlv_31= ')' ) ) ;
    public final EObject ruleExpr() throws RecognitionException {
        EObject current = null;

        Token lv_valeur_0_0=null;
        Token lv_valeur_1_0=null;
        Token lv_valeur_2_0=null;
        Token otherlv_3=null;
        Token lv_ope_4_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_ope_8_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token lv_ope_12_0=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token lv_ope_16_0=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token lv_ope_20_0=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token lv_ope_24_0=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token lv_ope_29_1=null;
        Token lv_ope_29_2=null;
        Token lv_ope_29_3=null;
        Token otherlv_31=null;
        EObject lv_lexpr_5_0 = null;

        EObject lv_lexpr_9_0 = null;

        EObject lv_lexpr_13_0 = null;

        EObject lv_expr_17_0 = null;

        EObject lv_expr_21_0 = null;

        EObject lv_expr_25_0 = null;

        EObject lv_ex1_28_0 = null;

        EObject lv_ex2_30_0 = null;



        	enterRule();

        try {
            // InternalWhileLanguage.g:1059:2: ( ( ( (lv_valeur_0_0= 'nil' ) ) | ( (lv_valeur_1_0= RULE_VARIABLE ) ) | ( (lv_valeur_2_0= RULE_SYMBOL ) ) | (otherlv_3= '(' ( (lv_ope_4_0= 'cons' ) ) ( (lv_lexpr_5_0= ruleLexpr ) ) otherlv_6= ')' ) | (otherlv_7= '(' ( (lv_ope_8_0= 'list' ) ) ( (lv_lexpr_9_0= ruleLexpr ) ) otherlv_10= ')' ) | (otherlv_11= '(' ( (lv_ope_12_0= RULE_SYMBOL ) ) ( (lv_lexpr_13_0= ruleLexpr ) ) otherlv_14= ')' ) | (otherlv_15= '(' ( (lv_ope_16_0= 'hd' ) ) ( (lv_expr_17_0= ruleExpr ) ) otherlv_18= ')' ) | (otherlv_19= '(' ( (lv_ope_20_0= 'tl' ) ) ( (lv_expr_21_0= ruleExpr ) ) otherlv_22= ')' ) | (otherlv_23= '(' ( (lv_ope_24_0= '!' ) ) ( (lv_expr_25_0= ruleExpr ) ) otherlv_26= ')' ) | (otherlv_27= '(' ( (lv_ex1_28_0= ruleExpr ) ) ( ( (lv_ope_29_1= 'and' | lv_ope_29_2= 'or' | lv_ope_29_3= '=?' ) ) ) ( (lv_ex2_30_0= ruleExpr ) ) otherlv_31= ')' ) ) )
            // InternalWhileLanguage.g:1060:2: ( ( (lv_valeur_0_0= 'nil' ) ) | ( (lv_valeur_1_0= RULE_VARIABLE ) ) | ( (lv_valeur_2_0= RULE_SYMBOL ) ) | (otherlv_3= '(' ( (lv_ope_4_0= 'cons' ) ) ( (lv_lexpr_5_0= ruleLexpr ) ) otherlv_6= ')' ) | (otherlv_7= '(' ( (lv_ope_8_0= 'list' ) ) ( (lv_lexpr_9_0= ruleLexpr ) ) otherlv_10= ')' ) | (otherlv_11= '(' ( (lv_ope_12_0= RULE_SYMBOL ) ) ( (lv_lexpr_13_0= ruleLexpr ) ) otherlv_14= ')' ) | (otherlv_15= '(' ( (lv_ope_16_0= 'hd' ) ) ( (lv_expr_17_0= ruleExpr ) ) otherlv_18= ')' ) | (otherlv_19= '(' ( (lv_ope_20_0= 'tl' ) ) ( (lv_expr_21_0= ruleExpr ) ) otherlv_22= ')' ) | (otherlv_23= '(' ( (lv_ope_24_0= '!' ) ) ( (lv_expr_25_0= ruleExpr ) ) otherlv_26= ')' ) | (otherlv_27= '(' ( (lv_ex1_28_0= ruleExpr ) ) ( ( (lv_ope_29_1= 'and' | lv_ope_29_2= 'or' | lv_ope_29_3= '=?' ) ) ) ( (lv_ex2_30_0= ruleExpr ) ) otherlv_31= ')' ) )
            {
            // InternalWhileLanguage.g:1060:2: ( ( (lv_valeur_0_0= 'nil' ) ) | ( (lv_valeur_1_0= RULE_VARIABLE ) ) | ( (lv_valeur_2_0= RULE_SYMBOL ) ) | (otherlv_3= '(' ( (lv_ope_4_0= 'cons' ) ) ( (lv_lexpr_5_0= ruleLexpr ) ) otherlv_6= ')' ) | (otherlv_7= '(' ( (lv_ope_8_0= 'list' ) ) ( (lv_lexpr_9_0= ruleLexpr ) ) otherlv_10= ')' ) | (otherlv_11= '(' ( (lv_ope_12_0= RULE_SYMBOL ) ) ( (lv_lexpr_13_0= ruleLexpr ) ) otherlv_14= ')' ) | (otherlv_15= '(' ( (lv_ope_16_0= 'hd' ) ) ( (lv_expr_17_0= ruleExpr ) ) otherlv_18= ')' ) | (otherlv_19= '(' ( (lv_ope_20_0= 'tl' ) ) ( (lv_expr_21_0= ruleExpr ) ) otherlv_22= ')' ) | (otherlv_23= '(' ( (lv_ope_24_0= '!' ) ) ( (lv_expr_25_0= ruleExpr ) ) otherlv_26= ')' ) | (otherlv_27= '(' ( (lv_ex1_28_0= ruleExpr ) ) ( ( (lv_ope_29_1= 'and' | lv_ope_29_2= 'or' | lv_ope_29_3= '=?' ) ) ) ( (lv_ex2_30_0= ruleExpr ) ) otherlv_31= ')' ) )
            int alt10=10;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // InternalWhileLanguage.g:1061:3: ( (lv_valeur_0_0= 'nil' ) )
                    {
                    // InternalWhileLanguage.g:1061:3: ( (lv_valeur_0_0= 'nil' ) )
                    // InternalWhileLanguage.g:1062:4: (lv_valeur_0_0= 'nil' )
                    {
                    // InternalWhileLanguage.g:1062:4: (lv_valeur_0_0= 'nil' )
                    // InternalWhileLanguage.g:1063:5: lv_valeur_0_0= 'nil'
                    {
                    lv_valeur_0_0=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_valeur_0_0, grammarAccess.getExprAccess().getValeurNilKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getExprRule());
                      					}
                      					setWithLastConsumed(current, "valeur", lv_valeur_0_0, "nil");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalWhileLanguage.g:1076:3: ( (lv_valeur_1_0= RULE_VARIABLE ) )
                    {
                    // InternalWhileLanguage.g:1076:3: ( (lv_valeur_1_0= RULE_VARIABLE ) )
                    // InternalWhileLanguage.g:1077:4: (lv_valeur_1_0= RULE_VARIABLE )
                    {
                    // InternalWhileLanguage.g:1077:4: (lv_valeur_1_0= RULE_VARIABLE )
                    // InternalWhileLanguage.g:1078:5: lv_valeur_1_0= RULE_VARIABLE
                    {
                    lv_valeur_1_0=(Token)match(input,RULE_VARIABLE,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_valeur_1_0, grammarAccess.getExprAccess().getValeurVARIABLETerminalRuleCall_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getExprRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"valeur",
                      						lv_valeur_1_0,
                      						"compilation.WhileLanguage.VARIABLE");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalWhileLanguage.g:1095:3: ( (lv_valeur_2_0= RULE_SYMBOL ) )
                    {
                    // InternalWhileLanguage.g:1095:3: ( (lv_valeur_2_0= RULE_SYMBOL ) )
                    // InternalWhileLanguage.g:1096:4: (lv_valeur_2_0= RULE_SYMBOL )
                    {
                    // InternalWhileLanguage.g:1096:4: (lv_valeur_2_0= RULE_SYMBOL )
                    // InternalWhileLanguage.g:1097:5: lv_valeur_2_0= RULE_SYMBOL
                    {
                    lv_valeur_2_0=(Token)match(input,RULE_SYMBOL,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_valeur_2_0, grammarAccess.getExprAccess().getValeurSYMBOLTerminalRuleCall_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getExprRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"valeur",
                      						lv_valeur_2_0,
                      						"compilation.WhileLanguage.SYMBOL");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalWhileLanguage.g:1114:3: (otherlv_3= '(' ( (lv_ope_4_0= 'cons' ) ) ( (lv_lexpr_5_0= ruleLexpr ) ) otherlv_6= ')' )
                    {
                    // InternalWhileLanguage.g:1114:3: (otherlv_3= '(' ( (lv_ope_4_0= 'cons' ) ) ( (lv_lexpr_5_0= ruleLexpr ) ) otherlv_6= ')' )
                    // InternalWhileLanguage.g:1115:4: otherlv_3= '(' ( (lv_ope_4_0= 'cons' ) ) ( (lv_lexpr_5_0= ruleLexpr ) ) otherlv_6= ')'
                    {
                    otherlv_3=(Token)match(input,33,FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getExprAccess().getLeftParenthesisKeyword_3_0());
                      			
                    }
                    // InternalWhileLanguage.g:1119:4: ( (lv_ope_4_0= 'cons' ) )
                    // InternalWhileLanguage.g:1120:5: (lv_ope_4_0= 'cons' )
                    {
                    // InternalWhileLanguage.g:1120:5: (lv_ope_4_0= 'cons' )
                    // InternalWhileLanguage.g:1121:6: lv_ope_4_0= 'cons'
                    {
                    lv_ope_4_0=(Token)match(input,34,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_ope_4_0, grammarAccess.getExprAccess().getOpeConsKeyword_3_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getExprRule());
                      						}
                      						setWithLastConsumed(current, "ope", lv_ope_4_0, "cons");
                      					
                    }

                    }


                    }

                    // InternalWhileLanguage.g:1133:4: ( (lv_lexpr_5_0= ruleLexpr ) )
                    // InternalWhileLanguage.g:1134:5: (lv_lexpr_5_0= ruleLexpr )
                    {
                    // InternalWhileLanguage.g:1134:5: (lv_lexpr_5_0= ruleLexpr )
                    // InternalWhileLanguage.g:1135:6: lv_lexpr_5_0= ruleLexpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExprAccess().getLexprLexprParserRuleCall_3_2_0());
                      					
                    }
                    pushFollow(FOLLOW_22);
                    lv_lexpr_5_0=ruleLexpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExprRule());
                      						}
                      						set(
                      							current,
                      							"lexpr",
                      							lv_lexpr_5_0,
                      							"compilation.WhileLanguage.Lexpr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_6=(Token)match(input,35,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getExprAccess().getRightParenthesisKeyword_3_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalWhileLanguage.g:1158:3: (otherlv_7= '(' ( (lv_ope_8_0= 'list' ) ) ( (lv_lexpr_9_0= ruleLexpr ) ) otherlv_10= ')' )
                    {
                    // InternalWhileLanguage.g:1158:3: (otherlv_7= '(' ( (lv_ope_8_0= 'list' ) ) ( (lv_lexpr_9_0= ruleLexpr ) ) otherlv_10= ')' )
                    // InternalWhileLanguage.g:1159:4: otherlv_7= '(' ( (lv_ope_8_0= 'list' ) ) ( (lv_lexpr_9_0= ruleLexpr ) ) otherlv_10= ')'
                    {
                    otherlv_7=(Token)match(input,33,FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getExprAccess().getLeftParenthesisKeyword_4_0());
                      			
                    }
                    // InternalWhileLanguage.g:1163:4: ( (lv_ope_8_0= 'list' ) )
                    // InternalWhileLanguage.g:1164:5: (lv_ope_8_0= 'list' )
                    {
                    // InternalWhileLanguage.g:1164:5: (lv_ope_8_0= 'list' )
                    // InternalWhileLanguage.g:1165:6: lv_ope_8_0= 'list'
                    {
                    lv_ope_8_0=(Token)match(input,36,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_ope_8_0, grammarAccess.getExprAccess().getOpeListKeyword_4_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getExprRule());
                      						}
                      						setWithLastConsumed(current, "ope", lv_ope_8_0, "list");
                      					
                    }

                    }


                    }

                    // InternalWhileLanguage.g:1177:4: ( (lv_lexpr_9_0= ruleLexpr ) )
                    // InternalWhileLanguage.g:1178:5: (lv_lexpr_9_0= ruleLexpr )
                    {
                    // InternalWhileLanguage.g:1178:5: (lv_lexpr_9_0= ruleLexpr )
                    // InternalWhileLanguage.g:1179:6: lv_lexpr_9_0= ruleLexpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExprAccess().getLexprLexprParserRuleCall_4_2_0());
                      					
                    }
                    pushFollow(FOLLOW_22);
                    lv_lexpr_9_0=ruleLexpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExprRule());
                      						}
                      						set(
                      							current,
                      							"lexpr",
                      							lv_lexpr_9_0,
                      							"compilation.WhileLanguage.Lexpr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_10=(Token)match(input,35,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getExprAccess().getRightParenthesisKeyword_4_3());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalWhileLanguage.g:1202:3: (otherlv_11= '(' ( (lv_ope_12_0= RULE_SYMBOL ) ) ( (lv_lexpr_13_0= ruleLexpr ) ) otherlv_14= ')' )
                    {
                    // InternalWhileLanguage.g:1202:3: (otherlv_11= '(' ( (lv_ope_12_0= RULE_SYMBOL ) ) ( (lv_lexpr_13_0= ruleLexpr ) ) otherlv_14= ')' )
                    // InternalWhileLanguage.g:1203:4: otherlv_11= '(' ( (lv_ope_12_0= RULE_SYMBOL ) ) ( (lv_lexpr_13_0= ruleLexpr ) ) otherlv_14= ')'
                    {
                    otherlv_11=(Token)match(input,33,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getExprAccess().getLeftParenthesisKeyword_5_0());
                      			
                    }
                    // InternalWhileLanguage.g:1207:4: ( (lv_ope_12_0= RULE_SYMBOL ) )
                    // InternalWhileLanguage.g:1208:5: (lv_ope_12_0= RULE_SYMBOL )
                    {
                    // InternalWhileLanguage.g:1208:5: (lv_ope_12_0= RULE_SYMBOL )
                    // InternalWhileLanguage.g:1209:6: lv_ope_12_0= RULE_SYMBOL
                    {
                    lv_ope_12_0=(Token)match(input,RULE_SYMBOL,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_ope_12_0, grammarAccess.getExprAccess().getOpeSYMBOLTerminalRuleCall_5_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getExprRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"ope",
                      							lv_ope_12_0,
                      							"compilation.WhileLanguage.SYMBOL");
                      					
                    }

                    }


                    }

                    // InternalWhileLanguage.g:1225:4: ( (lv_lexpr_13_0= ruleLexpr ) )
                    // InternalWhileLanguage.g:1226:5: (lv_lexpr_13_0= ruleLexpr )
                    {
                    // InternalWhileLanguage.g:1226:5: (lv_lexpr_13_0= ruleLexpr )
                    // InternalWhileLanguage.g:1227:6: lv_lexpr_13_0= ruleLexpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExprAccess().getLexprLexprParserRuleCall_5_2_0());
                      					
                    }
                    pushFollow(FOLLOW_22);
                    lv_lexpr_13_0=ruleLexpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExprRule());
                      						}
                      						set(
                      							current,
                      							"lexpr",
                      							lv_lexpr_13_0,
                      							"compilation.WhileLanguage.Lexpr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_14=(Token)match(input,35,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_14, grammarAccess.getExprAccess().getRightParenthesisKeyword_5_3());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalWhileLanguage.g:1250:3: (otherlv_15= '(' ( (lv_ope_16_0= 'hd' ) ) ( (lv_expr_17_0= ruleExpr ) ) otherlv_18= ')' )
                    {
                    // InternalWhileLanguage.g:1250:3: (otherlv_15= '(' ( (lv_ope_16_0= 'hd' ) ) ( (lv_expr_17_0= ruleExpr ) ) otherlv_18= ')' )
                    // InternalWhileLanguage.g:1251:4: otherlv_15= '(' ( (lv_ope_16_0= 'hd' ) ) ( (lv_expr_17_0= ruleExpr ) ) otherlv_18= ')'
                    {
                    otherlv_15=(Token)match(input,33,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getExprAccess().getLeftParenthesisKeyword_6_0());
                      			
                    }
                    // InternalWhileLanguage.g:1255:4: ( (lv_ope_16_0= 'hd' ) )
                    // InternalWhileLanguage.g:1256:5: (lv_ope_16_0= 'hd' )
                    {
                    // InternalWhileLanguage.g:1256:5: (lv_ope_16_0= 'hd' )
                    // InternalWhileLanguage.g:1257:6: lv_ope_16_0= 'hd'
                    {
                    lv_ope_16_0=(Token)match(input,37,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_ope_16_0, grammarAccess.getExprAccess().getOpeHdKeyword_6_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getExprRule());
                      						}
                      						setWithLastConsumed(current, "ope", lv_ope_16_0, "hd");
                      					
                    }

                    }


                    }

                    // InternalWhileLanguage.g:1269:4: ( (lv_expr_17_0= ruleExpr ) )
                    // InternalWhileLanguage.g:1270:5: (lv_expr_17_0= ruleExpr )
                    {
                    // InternalWhileLanguage.g:1270:5: (lv_expr_17_0= ruleExpr )
                    // InternalWhileLanguage.g:1271:6: lv_expr_17_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExprAccess().getExprExprParserRuleCall_6_2_0());
                      					
                    }
                    pushFollow(FOLLOW_22);
                    lv_expr_17_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExprRule());
                      						}
                      						set(
                      							current,
                      							"expr",
                      							lv_expr_17_0,
                      							"compilation.WhileLanguage.Expr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_18=(Token)match(input,35,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_18, grammarAccess.getExprAccess().getRightParenthesisKeyword_6_3());
                      			
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalWhileLanguage.g:1294:3: (otherlv_19= '(' ( (lv_ope_20_0= 'tl' ) ) ( (lv_expr_21_0= ruleExpr ) ) otherlv_22= ')' )
                    {
                    // InternalWhileLanguage.g:1294:3: (otherlv_19= '(' ( (lv_ope_20_0= 'tl' ) ) ( (lv_expr_21_0= ruleExpr ) ) otherlv_22= ')' )
                    // InternalWhileLanguage.g:1295:4: otherlv_19= '(' ( (lv_ope_20_0= 'tl' ) ) ( (lv_expr_21_0= ruleExpr ) ) otherlv_22= ')'
                    {
                    otherlv_19=(Token)match(input,33,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_19, grammarAccess.getExprAccess().getLeftParenthesisKeyword_7_0());
                      			
                    }
                    // InternalWhileLanguage.g:1299:4: ( (lv_ope_20_0= 'tl' ) )
                    // InternalWhileLanguage.g:1300:5: (lv_ope_20_0= 'tl' )
                    {
                    // InternalWhileLanguage.g:1300:5: (lv_ope_20_0= 'tl' )
                    // InternalWhileLanguage.g:1301:6: lv_ope_20_0= 'tl'
                    {
                    lv_ope_20_0=(Token)match(input,38,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_ope_20_0, grammarAccess.getExprAccess().getOpeTlKeyword_7_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getExprRule());
                      						}
                      						setWithLastConsumed(current, "ope", lv_ope_20_0, "tl");
                      					
                    }

                    }


                    }

                    // InternalWhileLanguage.g:1313:4: ( (lv_expr_21_0= ruleExpr ) )
                    // InternalWhileLanguage.g:1314:5: (lv_expr_21_0= ruleExpr )
                    {
                    // InternalWhileLanguage.g:1314:5: (lv_expr_21_0= ruleExpr )
                    // InternalWhileLanguage.g:1315:6: lv_expr_21_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExprAccess().getExprExprParserRuleCall_7_2_0());
                      					
                    }
                    pushFollow(FOLLOW_22);
                    lv_expr_21_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExprRule());
                      						}
                      						set(
                      							current,
                      							"expr",
                      							lv_expr_21_0,
                      							"compilation.WhileLanguage.Expr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_22=(Token)match(input,35,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_22, grammarAccess.getExprAccess().getRightParenthesisKeyword_7_3());
                      			
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalWhileLanguage.g:1338:3: (otherlv_23= '(' ( (lv_ope_24_0= '!' ) ) ( (lv_expr_25_0= ruleExpr ) ) otherlv_26= ')' )
                    {
                    // InternalWhileLanguage.g:1338:3: (otherlv_23= '(' ( (lv_ope_24_0= '!' ) ) ( (lv_expr_25_0= ruleExpr ) ) otherlv_26= ')' )
                    // InternalWhileLanguage.g:1339:4: otherlv_23= '(' ( (lv_ope_24_0= '!' ) ) ( (lv_expr_25_0= ruleExpr ) ) otherlv_26= ')'
                    {
                    otherlv_23=(Token)match(input,33,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_23, grammarAccess.getExprAccess().getLeftParenthesisKeyword_8_0());
                      			
                    }
                    // InternalWhileLanguage.g:1343:4: ( (lv_ope_24_0= '!' ) )
                    // InternalWhileLanguage.g:1344:5: (lv_ope_24_0= '!' )
                    {
                    // InternalWhileLanguage.g:1344:5: (lv_ope_24_0= '!' )
                    // InternalWhileLanguage.g:1345:6: lv_ope_24_0= '!'
                    {
                    lv_ope_24_0=(Token)match(input,39,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_ope_24_0, grammarAccess.getExprAccess().getOpeExclamationMarkKeyword_8_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getExprRule());
                      						}
                      						setWithLastConsumed(current, "ope", lv_ope_24_0, "!");
                      					
                    }

                    }


                    }

                    // InternalWhileLanguage.g:1357:4: ( (lv_expr_25_0= ruleExpr ) )
                    // InternalWhileLanguage.g:1358:5: (lv_expr_25_0= ruleExpr )
                    {
                    // InternalWhileLanguage.g:1358:5: (lv_expr_25_0= ruleExpr )
                    // InternalWhileLanguage.g:1359:6: lv_expr_25_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExprAccess().getExprExprParserRuleCall_8_2_0());
                      					
                    }
                    pushFollow(FOLLOW_22);
                    lv_expr_25_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExprRule());
                      						}
                      						set(
                      							current,
                      							"expr",
                      							lv_expr_25_0,
                      							"compilation.WhileLanguage.Expr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_26=(Token)match(input,35,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_26, grammarAccess.getExprAccess().getRightParenthesisKeyword_8_3());
                      			
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalWhileLanguage.g:1382:3: (otherlv_27= '(' ( (lv_ex1_28_0= ruleExpr ) ) ( ( (lv_ope_29_1= 'and' | lv_ope_29_2= 'or' | lv_ope_29_3= '=?' ) ) ) ( (lv_ex2_30_0= ruleExpr ) ) otherlv_31= ')' )
                    {
                    // InternalWhileLanguage.g:1382:3: (otherlv_27= '(' ( (lv_ex1_28_0= ruleExpr ) ) ( ( (lv_ope_29_1= 'and' | lv_ope_29_2= 'or' | lv_ope_29_3= '=?' ) ) ) ( (lv_ex2_30_0= ruleExpr ) ) otherlv_31= ')' )
                    // InternalWhileLanguage.g:1383:4: otherlv_27= '(' ( (lv_ex1_28_0= ruleExpr ) ) ( ( (lv_ope_29_1= 'and' | lv_ope_29_2= 'or' | lv_ope_29_3= '=?' ) ) ) ( (lv_ex2_30_0= ruleExpr ) ) otherlv_31= ')'
                    {
                    otherlv_27=(Token)match(input,33,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_27, grammarAccess.getExprAccess().getLeftParenthesisKeyword_9_0());
                      			
                    }
                    // InternalWhileLanguage.g:1387:4: ( (lv_ex1_28_0= ruleExpr ) )
                    // InternalWhileLanguage.g:1388:5: (lv_ex1_28_0= ruleExpr )
                    {
                    // InternalWhileLanguage.g:1388:5: (lv_ex1_28_0= ruleExpr )
                    // InternalWhileLanguage.g:1389:6: lv_ex1_28_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExprAccess().getEx1ExprParserRuleCall_9_1_0());
                      					
                    }
                    pushFollow(FOLLOW_27);
                    lv_ex1_28_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExprRule());
                      						}
                      						set(
                      							current,
                      							"ex1",
                      							lv_ex1_28_0,
                      							"compilation.WhileLanguage.Expr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalWhileLanguage.g:1406:4: ( ( (lv_ope_29_1= 'and' | lv_ope_29_2= 'or' | lv_ope_29_3= '=?' ) ) )
                    // InternalWhileLanguage.g:1407:5: ( (lv_ope_29_1= 'and' | lv_ope_29_2= 'or' | lv_ope_29_3= '=?' ) )
                    {
                    // InternalWhileLanguage.g:1407:5: ( (lv_ope_29_1= 'and' | lv_ope_29_2= 'or' | lv_ope_29_3= '=?' ) )
                    // InternalWhileLanguage.g:1408:6: (lv_ope_29_1= 'and' | lv_ope_29_2= 'or' | lv_ope_29_3= '=?' )
                    {
                    // InternalWhileLanguage.g:1408:6: (lv_ope_29_1= 'and' | lv_ope_29_2= 'or' | lv_ope_29_3= '=?' )
                    int alt9=3;
                    switch ( input.LA(1) ) {
                    case 40:
                        {
                        alt9=1;
                        }
                        break;
                    case 41:
                        {
                        alt9=2;
                        }
                        break;
                    case 42:
                        {
                        alt9=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 0, input);

                        throw nvae;
                    }

                    switch (alt9) {
                        case 1 :
                            // InternalWhileLanguage.g:1409:7: lv_ope_29_1= 'and'
                            {
                            lv_ope_29_1=(Token)match(input,40,FOLLOW_13); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_ope_29_1, grammarAccess.getExprAccess().getOpeAndKeyword_9_2_0_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getExprRule());
                              							}
                              							setWithLastConsumed(current, "ope", lv_ope_29_1, null);
                              						
                            }

                            }
                            break;
                        case 2 :
                            // InternalWhileLanguage.g:1420:7: lv_ope_29_2= 'or'
                            {
                            lv_ope_29_2=(Token)match(input,41,FOLLOW_13); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_ope_29_2, grammarAccess.getExprAccess().getOpeOrKeyword_9_2_0_1());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getExprRule());
                              							}
                              							setWithLastConsumed(current, "ope", lv_ope_29_2, null);
                              						
                            }

                            }
                            break;
                        case 3 :
                            // InternalWhileLanguage.g:1431:7: lv_ope_29_3= '=?'
                            {
                            lv_ope_29_3=(Token)match(input,42,FOLLOW_13); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_ope_29_3, grammarAccess.getExprAccess().getOpeEqualsSignQuestionMarkKeyword_9_2_0_2());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getExprRule());
                              							}
                              							setWithLastConsumed(current, "ope", lv_ope_29_3, null);
                              						
                            }

                            }
                            break;

                    }


                    }


                    }

                    // InternalWhileLanguage.g:1444:4: ( (lv_ex2_30_0= ruleExpr ) )
                    // InternalWhileLanguage.g:1445:5: (lv_ex2_30_0= ruleExpr )
                    {
                    // InternalWhileLanguage.g:1445:5: (lv_ex2_30_0= ruleExpr )
                    // InternalWhileLanguage.g:1446:6: lv_ex2_30_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExprAccess().getEx2ExprParserRuleCall_9_3_0());
                      					
                    }
                    pushFollow(FOLLOW_22);
                    lv_ex2_30_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExprRule());
                      						}
                      						set(
                      							current,
                      							"ex2",
                      							lv_ex2_30_0,
                      							"compilation.WhileLanguage.Expr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_31=(Token)match(input,35,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_31, grammarAccess.getExprAccess().getRightParenthesisKeyword_9_4());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleExpr"


    // $ANTLR start "entryRuleLexpr"
    // InternalWhileLanguage.g:1472:1: entryRuleLexpr returns [EObject current=null] : iv_ruleLexpr= ruleLexpr EOF ;
    public final EObject entryRuleLexpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLexpr = null;


        try {
            // InternalWhileLanguage.g:1472:46: (iv_ruleLexpr= ruleLexpr EOF )
            // InternalWhileLanguage.g:1473:2: iv_ruleLexpr= ruleLexpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLexprRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLexpr=ruleLexpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLexpr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLexpr"


    // $ANTLR start "ruleLexpr"
    // InternalWhileLanguage.g:1479:1: ruleLexpr returns [EObject current=null] : ( ( (lv_exprs_0_0= ruleExpr ) ) ( (lv_exprs_1_0= ruleExpr ) )* ) ;
    public final EObject ruleLexpr() throws RecognitionException {
        EObject current = null;

        EObject lv_exprs_0_0 = null;

        EObject lv_exprs_1_0 = null;



        	enterRule();

        try {
            // InternalWhileLanguage.g:1485:2: ( ( ( (lv_exprs_0_0= ruleExpr ) ) ( (lv_exprs_1_0= ruleExpr ) )* ) )
            // InternalWhileLanguage.g:1486:2: ( ( (lv_exprs_0_0= ruleExpr ) ) ( (lv_exprs_1_0= ruleExpr ) )* )
            {
            // InternalWhileLanguage.g:1486:2: ( ( (lv_exprs_0_0= ruleExpr ) ) ( (lv_exprs_1_0= ruleExpr ) )* )
            // InternalWhileLanguage.g:1487:3: ( (lv_exprs_0_0= ruleExpr ) ) ( (lv_exprs_1_0= ruleExpr ) )*
            {
            // InternalWhileLanguage.g:1487:3: ( (lv_exprs_0_0= ruleExpr ) )
            // InternalWhileLanguage.g:1488:4: (lv_exprs_0_0= ruleExpr )
            {
            // InternalWhileLanguage.g:1488:4: (lv_exprs_0_0= ruleExpr )
            // InternalWhileLanguage.g:1489:5: lv_exprs_0_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLexprAccess().getExprsExprParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_28);
            lv_exprs_0_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLexprRule());
              					}
              					add(
              						current,
              						"exprs",
              						lv_exprs_0_0,
              						"compilation.WhileLanguage.Expr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalWhileLanguage.g:1506:3: ( (lv_exprs_1_0= ruleExpr ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=RULE_SYMBOL && LA11_0<=RULE_VARIABLE)||(LA11_0>=32 && LA11_0<=33)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalWhileLanguage.g:1507:4: (lv_exprs_1_0= ruleExpr )
            	    {
            	    // InternalWhileLanguage.g:1507:4: (lv_exprs_1_0= ruleExpr )
            	    // InternalWhileLanguage.g:1508:5: lv_exprs_1_0= ruleExpr
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getLexprAccess().getExprsExprParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_28);
            	    lv_exprs_1_0=ruleExpr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getLexprRule());
            	      					}
            	      					add(
            	      						current,
            	      						"exprs",
            	      						lv_exprs_1_0,
            	      						"compilation.WhileLanguage.Expr");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleLexpr"

    // $ANTLR start synpred1_InternalWhileLanguage
    public final void synpred1_InternalWhileLanguage_fragment() throws RecognitionException {   
        // InternalWhileLanguage.g:874:5: ( 'else' )
        // InternalWhileLanguage.g:874:6: 'else'
        {
        match(input,28,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalWhileLanguage

    // Delegated rules

    public final boolean synpred1_InternalWhileLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalWhileLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA10 dfa10 = new DFA10(this);
    static final String dfa_1s = "\15\uffff";
    static final String dfa_2s = "\1\4\3\uffff\2\4\7\uffff";
    static final String dfa_3s = "\1\41\3\uffff\1\47\1\52\7\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\3\2\uffff\1\11\1\5\1\10\1\4\1\7\1\12\1\6";
    static final String dfa_5s = "\15\uffff}>";
    static final String[] dfa_6s = {
            "\1\3\1\2\32\uffff\1\1\1\4",
            "",
            "",
            "",
            "\1\5\1\13\32\uffff\2\13\1\11\1\uffff\1\7\1\12\1\10\1\6",
            "\2\14\32\uffff\2\14\6\uffff\3\13",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1060:2: ( ( (lv_valeur_0_0= 'nil' ) ) | ( (lv_valeur_1_0= RULE_VARIABLE ) ) | ( (lv_valeur_2_0= RULE_SYMBOL ) ) | (otherlv_3= '(' ( (lv_ope_4_0= 'cons' ) ) ( (lv_lexpr_5_0= ruleLexpr ) ) otherlv_6= ')' ) | (otherlv_7= '(' ( (lv_ope_8_0= 'list' ) ) ( (lv_lexpr_9_0= ruleLexpr ) ) otherlv_10= ')' ) | (otherlv_11= '(' ( (lv_ope_12_0= RULE_SYMBOL ) ) ( (lv_lexpr_13_0= ruleLexpr ) ) otherlv_14= ')' ) | (otherlv_15= '(' ( (lv_ope_16_0= 'hd' ) ) ( (lv_expr_17_0= ruleExpr ) ) otherlv_18= ')' ) | (otherlv_19= '(' ( (lv_ope_20_0= 'tl' ) ) ( (lv_expr_21_0= ruleExpr ) ) otherlv_22= ')' ) | (otherlv_23= '(' ( (lv_ope_24_0= '!' ) ) ( (lv_expr_25_0= ruleExpr ) ) otherlv_26= ')' ) | (otherlv_27= '(' ( (lv_ex1_28_0= ruleExpr ) ) ( ( (lv_ope_29_1= 'and' | lv_ope_29_2= 'or' | lv_ope_29_3= '=?' ) ) ) ( (lv_ex2_30_0= ruleExpr ) ) otherlv_31= ')' ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000C4500020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000300000030L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000070000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000300000032L});

}