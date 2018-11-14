package compilation.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalWhileLanguageLexer extends Lexer {
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

    public InternalWhileLanguageLexer() {;} 
    public InternalWhileLanguageLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalWhileLanguageLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalWhileLanguage.g"; }

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWhileLanguage.g:11:7: ( 'function' )
            // InternalWhileLanguage.g:11:9: 'function'
            {
            match("function"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWhileLanguage.g:12:7: ( ':' )
            // InternalWhileLanguage.g:12:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWhileLanguage.g:13:7: ( '%' )
            // InternalWhileLanguage.g:13:9: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWhileLanguage.g:14:7: ( 'read' )
            // InternalWhileLanguage.g:14:9: 'read'
            {
            match("read"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWhileLanguage.g:15:7: ( ',' )
            // InternalWhileLanguage.g:15:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWhileLanguage.g:16:7: ( 'write' )
            // InternalWhileLanguage.g:16:9: 'write'
            {
            match("write"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWhileLanguage.g:17:7: ( ':=' )
            // InternalWhileLanguage.g:17:9: ':='
            {
            match(":="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWhileLanguage.g:18:7: ( 'nop' )
            // InternalWhileLanguage.g:18:9: 'nop'
            {
            match("nop"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWhileLanguage.g:19:7: ( ';' )
            // InternalWhileLanguage.g:19:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWhileLanguage.g:20:7: ( 'foreach' )
            // InternalWhileLanguage.g:20:9: 'foreach'
            {
            match("foreach"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWhileLanguage.g:21:7: ( 'in' )
            // InternalWhileLanguage.g:21:9: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWhileLanguage.g:22:7: ( 'do' )
            // InternalWhileLanguage.g:22:9: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWhileLanguage.g:23:7: ( 'od' )
            // InternalWhileLanguage.g:23:9: 'od'
            {
            match("od"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWhileLanguage.g:24:7: ( 'if' )
            // InternalWhileLanguage.g:24:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWhileLanguage.g:25:7: ( 'then' )
            // InternalWhileLanguage.g:25:9: 'then'
            {
            match("then"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWhileLanguage.g:26:7: ( 'else' )
            // InternalWhileLanguage.g:26:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWhileLanguage.g:27:7: ( 'fi' )
            // InternalWhileLanguage.g:27:9: 'fi'
            {
            match("fi"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWhileLanguage.g:28:7: ( 'for' )
            // InternalWhileLanguage.g:28:9: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWhileLanguage.g:29:7: ( 'while' )
            // InternalWhileLanguage.g:29:9: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWhileLanguage.g:30:7: ( 'nil' )
            // InternalWhileLanguage.g:30:9: 'nil'
            {
            match("nil"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWhileLanguage.g:31:7: ( '(' )
            // InternalWhileLanguage.g:31:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWhileLanguage.g:32:7: ( 'cons' )
            // InternalWhileLanguage.g:32:9: 'cons'
            {
            match("cons"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWhileLanguage.g:33:7: ( ')' )
            // InternalWhileLanguage.g:33:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWhileLanguage.g:34:7: ( 'list' )
            // InternalWhileLanguage.g:34:9: 'list'
            {
            match("list"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWhileLanguage.g:35:7: ( 'hd' )
            // InternalWhileLanguage.g:35:9: 'hd'
            {
            match("hd"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWhileLanguage.g:36:7: ( 'tl' )
            // InternalWhileLanguage.g:36:9: 'tl'
            {
            match("tl"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWhileLanguage.g:37:7: ( '!' )
            // InternalWhileLanguage.g:37:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWhileLanguage.g:38:7: ( 'and' )
            // InternalWhileLanguage.g:38:9: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWhileLanguage.g:39:7: ( 'or' )
            // InternalWhileLanguage.g:39:9: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWhileLanguage.g:40:7: ( '=?' )
            // InternalWhileLanguage.g:40:9: '=?'
            {
            match("=?"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "RULE_VARIABLE"
    public final void mRULE_VARIABLE() throws RecognitionException {
        try {
            int _type = RULE_VARIABLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWhileLanguage.g:1564:15: ( 'A' .. 'Z' ( 'A' .. 'Z' | 'a' .. 'z' )* )
            // InternalWhileLanguage.g:1564:17: 'A' .. 'Z' ( 'A' .. 'Z' | 'a' .. 'z' )*
            {
            matchRange('A','Z'); 
            // InternalWhileLanguage.g:1564:26: ( 'A' .. 'Z' | 'a' .. 'z' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='A' && LA1_0<='Z')||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalWhileLanguage.g:
            	    {
            	    if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_VARIABLE"

    // $ANTLR start "RULE_SYMBOL"
    public final void mRULE_SYMBOL() throws RecognitionException {
        try {
            int _type = RULE_SYMBOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWhileLanguage.g:1566:13: ( 'a' .. 'z' ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' )* ( ( ( '-' | '+' | '.' | '/' | '_' | '&' ) | '->' ) ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' )+ )* ( '!' | '?' )? )
            // InternalWhileLanguage.g:1566:15: 'a' .. 'z' ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' )* ( ( ( '-' | '+' | '.' | '/' | '_' | '&' ) | '->' ) ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' )+ )* ( '!' | '?' )?
            {
            matchRange('a','z'); 
            // InternalWhileLanguage.g:1566:24: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalWhileLanguage.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalWhileLanguage.g:1566:54: ( ( ( '-' | '+' | '.' | '/' | '_' | '&' ) | '->' ) ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' )+ )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='&'||LA5_0=='+'||(LA5_0>='-' && LA5_0<='/')||LA5_0=='_') ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalWhileLanguage.g:1566:55: ( ( '-' | '+' | '.' | '/' | '_' | '&' ) | '->' ) ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' )+
            	    {
            	    // InternalWhileLanguage.g:1566:55: ( ( '-' | '+' | '.' | '/' | '_' | '&' ) | '->' )
            	    int alt3=2;
            	    int LA3_0 = input.LA(1);

            	    if ( (LA3_0=='-') ) {
            	        int LA3_1 = input.LA(2);

            	        if ( (LA3_1=='>') ) {
            	            alt3=2;
            	        }
            	        else if ( ((LA3_1>='0' && LA3_1<='9')||(LA3_1>='A' && LA3_1<='Z')||(LA3_1>='a' && LA3_1<='z')) ) {
            	            alt3=1;
            	        }
            	        else {
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 3, 1, input);

            	            throw nvae;
            	        }
            	    }
            	    else if ( (LA3_0=='&'||LA3_0=='+'||(LA3_0>='.' && LA3_0<='/')||LA3_0=='_') ) {
            	        alt3=1;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 3, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt3) {
            	        case 1 :
            	            // InternalWhileLanguage.g:1566:56: ( '-' | '+' | '.' | '/' | '_' | '&' )
            	            {
            	            if ( input.LA(1)=='&'||input.LA(1)=='+'||(input.LA(1)>='-' && input.LA(1)<='/')||input.LA(1)=='_' ) {
            	                input.consume();

            	            }
            	            else {
            	                MismatchedSetException mse = new MismatchedSetException(null,input);
            	                recover(mse);
            	                throw mse;}


            	            }
            	            break;
            	        case 2 :
            	            // InternalWhileLanguage.g:1566:82: '->'
            	            {
            	            match("->"); 


            	            }
            	            break;

            	    }

            	    // InternalWhileLanguage.g:1566:88: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' )+
            	    int cnt4=0;
            	    loop4:
            	    do {
            	        int alt4=2;
            	        int LA4_0 = input.LA(1);

            	        if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||(LA4_0>='a' && LA4_0<='z')) ) {
            	            alt4=1;
            	        }


            	        switch (alt4) {
            	    	case 1 :
            	    	    // InternalWhileLanguage.g:
            	    	    {
            	    	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	    	        input.consume();

            	    	    }
            	    	    else {
            	    	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	    	        recover(mse);
            	    	        throw mse;}


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


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // InternalWhileLanguage.g:1566:120: ( '!' | '?' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='!'||LA6_0=='?') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalWhileLanguage.g:
                    {
                    if ( input.LA(1)=='!'||input.LA(1)=='?' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SYMBOL"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWhileLanguage.g:1568:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalWhileLanguage.g:1568:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalWhileLanguage.g:1568:11: ( '^' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='^') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalWhileLanguage.g:1568:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalWhileLanguage.g:1568:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='9')||(LA8_0>='A' && LA8_0<='Z')||LA8_0=='_'||(LA8_0>='a' && LA8_0<='z')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalWhileLanguage.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWhileLanguage.g:1570:10: ( ( '0' .. '9' )+ )
            // InternalWhileLanguage.g:1570:12: ( '0' .. '9' )+
            {
            // InternalWhileLanguage.g:1570:12: ( '0' .. '9' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalWhileLanguage.g:1570:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWhileLanguage.g:1572:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalWhileLanguage.g:1572:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalWhileLanguage.g:1572:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\"') ) {
                alt12=1;
            }
            else if ( (LA12_0=='\'') ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalWhileLanguage.g:1572:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalWhileLanguage.g:1572:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop10:
                    do {
                        int alt10=3;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0=='\\') ) {
                            alt10=1;
                        }
                        else if ( ((LA10_0>='\u0000' && LA10_0<='!')||(LA10_0>='#' && LA10_0<='[')||(LA10_0>=']' && LA10_0<='\uFFFF')) ) {
                            alt10=2;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalWhileLanguage.g:1572:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalWhileLanguage.g:1572:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalWhileLanguage.g:1572:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalWhileLanguage.g:1572:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop11:
                    do {
                        int alt11=3;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0=='\\') ) {
                            alt11=1;
                        }
                        else if ( ((LA11_0>='\u0000' && LA11_0<='&')||(LA11_0>='(' && LA11_0<='[')||(LA11_0>=']' && LA11_0<='\uFFFF')) ) {
                            alt11=2;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalWhileLanguage.g:1572:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalWhileLanguage.g:1572:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWhileLanguage.g:1574:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalWhileLanguage.g:1574:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalWhileLanguage.g:1574:24: ( options {greedy=false; } : . )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0=='*') ) {
                    int LA13_1 = input.LA(2);

                    if ( (LA13_1=='/') ) {
                        alt13=2;
                    }
                    else if ( ((LA13_1>='\u0000' && LA13_1<='.')||(LA13_1>='0' && LA13_1<='\uFFFF')) ) {
                        alt13=1;
                    }


                }
                else if ( ((LA13_0>='\u0000' && LA13_0<=')')||(LA13_0>='+' && LA13_0<='\uFFFF')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalWhileLanguage.g:1574:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWhileLanguage.g:1576:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalWhileLanguage.g:1576:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalWhileLanguage.g:1576:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\u0000' && LA14_0<='\t')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\uFFFF')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalWhileLanguage.g:1576:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            // InternalWhileLanguage.g:1576:40: ( ( '\\r' )? '\\n' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='\n'||LA16_0=='\r') ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalWhileLanguage.g:1576:41: ( '\\r' )? '\\n'
                    {
                    // InternalWhileLanguage.g:1576:41: ( '\\r' )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0=='\r') ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalWhileLanguage.g:1576:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWhileLanguage.g:1578:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalWhileLanguage.g:1578:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalWhileLanguage.g:1578:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='\t' && LA17_0<='\n')||LA17_0=='\r'||LA17_0==' ') ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalWhileLanguage.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWhileLanguage.g:1580:16: ( . )
            // InternalWhileLanguage.g:1580:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalWhileLanguage.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | RULE_VARIABLE | RULE_SYMBOL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt18=39;
        alt18 = dfa18.predict(input);
        switch (alt18) {
            case 1 :
                // InternalWhileLanguage.g:1:10: T__13
                {
                mT__13(); 

                }
                break;
            case 2 :
                // InternalWhileLanguage.g:1:16: T__14
                {
                mT__14(); 

                }
                break;
            case 3 :
                // InternalWhileLanguage.g:1:22: T__15
                {
                mT__15(); 

                }
                break;
            case 4 :
                // InternalWhileLanguage.g:1:28: T__16
                {
                mT__16(); 

                }
                break;
            case 5 :
                // InternalWhileLanguage.g:1:34: T__17
                {
                mT__17(); 

                }
                break;
            case 6 :
                // InternalWhileLanguage.g:1:40: T__18
                {
                mT__18(); 

                }
                break;
            case 7 :
                // InternalWhileLanguage.g:1:46: T__19
                {
                mT__19(); 

                }
                break;
            case 8 :
                // InternalWhileLanguage.g:1:52: T__20
                {
                mT__20(); 

                }
                break;
            case 9 :
                // InternalWhileLanguage.g:1:58: T__21
                {
                mT__21(); 

                }
                break;
            case 10 :
                // InternalWhileLanguage.g:1:64: T__22
                {
                mT__22(); 

                }
                break;
            case 11 :
                // InternalWhileLanguage.g:1:70: T__23
                {
                mT__23(); 

                }
                break;
            case 12 :
                // InternalWhileLanguage.g:1:76: T__24
                {
                mT__24(); 

                }
                break;
            case 13 :
                // InternalWhileLanguage.g:1:82: T__25
                {
                mT__25(); 

                }
                break;
            case 14 :
                // InternalWhileLanguage.g:1:88: T__26
                {
                mT__26(); 

                }
                break;
            case 15 :
                // InternalWhileLanguage.g:1:94: T__27
                {
                mT__27(); 

                }
                break;
            case 16 :
                // InternalWhileLanguage.g:1:100: T__28
                {
                mT__28(); 

                }
                break;
            case 17 :
                // InternalWhileLanguage.g:1:106: T__29
                {
                mT__29(); 

                }
                break;
            case 18 :
                // InternalWhileLanguage.g:1:112: T__30
                {
                mT__30(); 

                }
                break;
            case 19 :
                // InternalWhileLanguage.g:1:118: T__31
                {
                mT__31(); 

                }
                break;
            case 20 :
                // InternalWhileLanguage.g:1:124: T__32
                {
                mT__32(); 

                }
                break;
            case 21 :
                // InternalWhileLanguage.g:1:130: T__33
                {
                mT__33(); 

                }
                break;
            case 22 :
                // InternalWhileLanguage.g:1:136: T__34
                {
                mT__34(); 

                }
                break;
            case 23 :
                // InternalWhileLanguage.g:1:142: T__35
                {
                mT__35(); 

                }
                break;
            case 24 :
                // InternalWhileLanguage.g:1:148: T__36
                {
                mT__36(); 

                }
                break;
            case 25 :
                // InternalWhileLanguage.g:1:154: T__37
                {
                mT__37(); 

                }
                break;
            case 26 :
                // InternalWhileLanguage.g:1:160: T__38
                {
                mT__38(); 

                }
                break;
            case 27 :
                // InternalWhileLanguage.g:1:166: T__39
                {
                mT__39(); 

                }
                break;
            case 28 :
                // InternalWhileLanguage.g:1:172: T__40
                {
                mT__40(); 

                }
                break;
            case 29 :
                // InternalWhileLanguage.g:1:178: T__41
                {
                mT__41(); 

                }
                break;
            case 30 :
                // InternalWhileLanguage.g:1:184: T__42
                {
                mT__42(); 

                }
                break;
            case 31 :
                // InternalWhileLanguage.g:1:190: RULE_VARIABLE
                {
                mRULE_VARIABLE(); 

                }
                break;
            case 32 :
                // InternalWhileLanguage.g:1:204: RULE_SYMBOL
                {
                mRULE_SYMBOL(); 

                }
                break;
            case 33 :
                // InternalWhileLanguage.g:1:216: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 34 :
                // InternalWhileLanguage.g:1:224: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 35 :
                // InternalWhileLanguage.g:1:233: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 36 :
                // InternalWhileLanguage.g:1:245: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 37 :
                // InternalWhileLanguage.g:1:261: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 38 :
                // InternalWhileLanguage.g:1:277: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 39 :
                // InternalWhileLanguage.g:1:285: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA18 dfa18 = new DFA18(this);
    static final String DFA18_eotS =
        "\1\uffff\1\44\1\47\1\uffff\1\44\1\uffff\2\44\1\uffff\5\44\1\uffff\1\44\1\uffff\2\44\1\uffff\1\44\1\37\1\101\1\44\1\37\2\uffff\3\37\2\uffff\2\44\1\112\1\44\1\uffff\1\102\3\uffff\1\44\1\uffff\4\44\1\uffff\1\121\1\122\1\123\1\124\1\125\1\44\1\127\1\44\1\uffff\1\44\1\uffff\1\44\1\133\1\uffff\1\44\1\uffff\1\101\7\uffff\1\44\1\137\1\uffff\4\44\1\143\1\144\5\uffff\1\44\1\uffff\3\44\1\uffff\1\151\2\44\1\uffff\1\154\2\44\2\uffff\1\157\1\160\1\161\1\162\1\uffff\2\44\1\uffff\1\165\1\166\4\uffff\2\44\2\uffff\1\44\1\172\1\173\2\uffff";
    static final String DFA18_eofS =
        "\174\uffff";
    static final String DFA18_minS =
        "\1\0\1\60\1\75\1\uffff\1\60\1\uffff\2\60\1\uffff\5\60\1\uffff\1\60\1\uffff\2\60\1\uffff\1\60\1\77\2\60\1\101\2\uffff\2\0\1\52\2\uffff\2\60\1\41\1\60\1\uffff\1\60\3\uffff\1\60\1\uffff\4\60\1\uffff\5\41\1\60\1\41\1\60\1\uffff\1\60\1\uffff\1\60\1\41\1\uffff\1\60\1\uffff\1\60\7\uffff\1\60\1\41\1\uffff\4\60\2\41\5\uffff\1\60\1\uffff\3\60\1\uffff\1\41\2\60\1\uffff\1\41\2\60\2\uffff\4\41\1\uffff\2\60\1\uffff\2\41\4\uffff\2\60\2\uffff\1\60\2\41\2\uffff";
    static final String DFA18_maxS =
        "\1\uffff\1\172\1\75\1\uffff\1\172\1\uffff\2\172\1\uffff\5\172\1\uffff\1\172\1\uffff\2\172\1\uffff\1\172\1\77\3\172\2\uffff\2\uffff\1\57\2\uffff\4\172\1\uffff\1\172\3\uffff\1\172\1\uffff\4\172\1\uffff\10\172\1\uffff\1\172\1\uffff\2\172\1\uffff\1\172\1\uffff\1\172\7\uffff\2\172\1\uffff\6\172\5\uffff\1\172\1\uffff\3\172\1\uffff\3\172\1\uffff\3\172\2\uffff\4\172\1\uffff\2\172\1\uffff\2\172\4\uffff\2\172\2\uffff\3\172\2\uffff";
    static final String DFA18_acceptS =
        "\3\uffff\1\3\1\uffff\1\5\2\uffff\1\11\5\uffff\1\25\1\uffff\1\27\2\uffff\1\33\5\uffff\1\41\1\42\3\uffff\1\46\1\47\4\uffff\1\40\1\uffff\1\7\1\2\1\3\1\uffff\1\5\4\uffff\1\11\10\uffff\1\25\1\uffff\1\27\2\uffff\1\33\1\uffff\1\36\1\uffff\1\37\1\41\1\42\1\43\1\44\1\45\1\46\2\uffff\1\21\6\uffff\1\13\1\16\1\14\1\15\1\35\1\uffff\1\32\3\uffff\1\31\3\uffff\1\22\3\uffff\1\10\1\24\4\uffff\1\34\2\uffff\1\4\2\uffff\1\17\1\20\1\26\1\30\2\uffff\1\6\1\23\3\uffff\1\12\1\1";
    static final String DFA18_specialS =
        "\1\0\32\uffff\1\2\1\1\137\uffff}>";
    static final String[] DFA18_transitionS = {
            "\11\37\2\36\2\37\1\36\22\37\1\36\1\23\1\33\2\37\1\3\1\37\1\34\1\16\1\20\2\37\1\5\2\37\1\35\12\32\1\2\1\10\1\37\1\25\3\37\32\26\3\37\1\30\1\31\1\37\1\24\1\27\1\17\1\12\1\15\1\1\1\27\1\22\1\11\2\27\1\21\1\27\1\7\1\13\2\27\1\4\1\27\1\14\2\27\1\6\3\27\uff85\37",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\10\43\1\42\5\43\1\41\5\43\1\40\5\43",
            "\1\46",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\4\43\1\51\25\43",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\7\43\1\54\11\43\1\53\10\43",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\10\43\1\56\5\43\1\55\13\43",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\5\43\1\61\7\43\1\60\14\43",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\16\43\1\62\13\43",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\3\43\1\63\15\43\1\64\10\43",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\7\43\1\65\3\43\1\66\16\43",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\13\43\1\67\16\43",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\16\43\1\71\13\43",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\10\43\1\73\21\43",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\3\43\1\74\26\43",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\15\43\1\76\14\43",
            "\1\77",
            "\12\102\7\uffff\32\100\4\uffff\1\102\1\uffff\32\100",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\32\43",
            "\32\102\4\uffff\1\102\1\uffff\32\102",
            "",
            "",
            "\0\104",
            "\0\104",
            "\1\105\4\uffff\1\106",
            "",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\15\43\1\110\14\43",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\21\43\1\111\10\43",
            "\1\44\4\uffff\1\44\4\uffff\1\44\1\uffff\3\44\12\43\5\uffff\1\44\1\uffff\32\43\4\uffff\1\45\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\32\43",
            "",
            "\12\113\7\uffff\32\113\6\uffff\32\113",
            "",
            "",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\1\114\31\43",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\10\43\1\115\21\43",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\10\43\1\116\21\43",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\17\43\1\117\12\43",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\13\43\1\120\16\43",
            "",
            "\1\44\4\uffff\1\44\4\uffff\1\44\1\uffff\3\44\12\43\5\uffff\1\44\1\uffff\32\43\4\uffff\1\45\1\uffff\32\43",
            "\1\44\4\uffff\1\44\4\uffff\1\44\1\uffff\3\44\12\43\5\uffff\1\44\1\uffff\32\43\4\uffff\1\45\1\uffff\32\43",
            "\1\44\4\uffff\1\44\4\uffff\1\44\1\uffff\3\44\12\43\5\uffff\1\44\1\uffff\32\43\4\uffff\1\45\1\uffff\32\43",
            "\1\44\4\uffff\1\44\4\uffff\1\44\1\uffff\3\44\12\43\5\uffff\1\44\1\uffff\32\43\4\uffff\1\45\1\uffff\32\43",
            "\1\44\4\uffff\1\44\4\uffff\1\44\1\uffff\3\44\12\43\5\uffff\1\44\1\uffff\32\43\4\uffff\1\45\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\4\43\1\126\25\43",
            "\1\44\4\uffff\1\44\4\uffff\1\44\1\uffff\3\44\12\43\5\uffff\1\44\1\uffff\32\43\4\uffff\1\45\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\22\43\1\130\7\43",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\15\43\1\131\14\43",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\22\43\1\132\7\43",
            "\1\44\4\uffff\1\44\4\uffff\1\44\1\uffff\3\44\12\43\5\uffff\1\44\1\uffff\32\43\4\uffff\1\45\1\uffff\32\43",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\3\43\1\134\26\43",
            "",
            "\12\102\7\uffff\32\100\4\uffff\1\102\1\uffff\32\100",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\2\43\1\135\27\43",
            "\1\44\4\uffff\1\44\4\uffff\1\44\1\uffff\3\44\12\43\5\uffff\1\44\1\uffff\32\43\4\uffff\1\45\1\uffff\4\43\1\136\25\43",
            "",
            "\12\113\7\uffff\32\113\4\uffff\1\45\1\uffff\32\113",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\3\43\1\140\26\43",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\23\43\1\141\6\43",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\13\43\1\142\16\43",
            "\1\44\4\uffff\1\44\4\uffff\1\44\1\uffff\3\44\12\43\5\uffff\1\44\1\uffff\32\43\4\uffff\1\45\1\uffff\32\43",
            "\1\44\4\uffff\1\44\4\uffff\1\44\1\uffff\3\44\12\43\5\uffff\1\44\1\uffff\32\43\4\uffff\1\45\1\uffff\32\43",
            "",
            "",
            "",
            "",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\15\43\1\145\14\43",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\4\43\1\146\25\43",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\22\43\1\147\7\43",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\23\43\1\150\6\43",
            "",
            "\1\44\4\uffff\1\44\4\uffff\1\44\1\uffff\3\44\12\43\5\uffff\1\44\1\uffff\32\43\4\uffff\1\45\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\23\43\1\152\6\43",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\1\153\31\43",
            "",
            "\1\44\4\uffff\1\44\4\uffff\1\44\1\uffff\3\44\12\43\5\uffff\1\44\1\uffff\32\43\4\uffff\1\45\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\4\43\1\155\25\43",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\4\43\1\156\25\43",
            "",
            "",
            "\1\44\4\uffff\1\44\4\uffff\1\44\1\uffff\3\44\12\43\5\uffff\1\44\1\uffff\32\43\4\uffff\1\45\1\uffff\32\43",
            "\1\44\4\uffff\1\44\4\uffff\1\44\1\uffff\3\44\12\43\5\uffff\1\44\1\uffff\32\43\4\uffff\1\45\1\uffff\32\43",
            "\1\44\4\uffff\1\44\4\uffff\1\44\1\uffff\3\44\12\43\5\uffff\1\44\1\uffff\32\43\4\uffff\1\45\1\uffff\32\43",
            "\1\44\4\uffff\1\44\4\uffff\1\44\1\uffff\3\44\12\43\5\uffff\1\44\1\uffff\32\43\4\uffff\1\45\1\uffff\32\43",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\10\43\1\163\21\43",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\2\43\1\164\27\43",
            "",
            "\1\44\4\uffff\1\44\4\uffff\1\44\1\uffff\3\44\12\43\5\uffff\1\44\1\uffff\32\43\4\uffff\1\45\1\uffff\32\43",
            "\1\44\4\uffff\1\44\4\uffff\1\44\1\uffff\3\44\12\43\5\uffff\1\44\1\uffff\32\43\4\uffff\1\45\1\uffff\32\43",
            "",
            "",
            "",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\16\43\1\167\13\43",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\7\43\1\170\22\43",
            "",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\15\43\1\171\14\43",
            "\1\44\4\uffff\1\44\4\uffff\1\44\1\uffff\3\44\12\43\5\uffff\1\44\1\uffff\32\43\4\uffff\1\45\1\uffff\32\43",
            "\1\44\4\uffff\1\44\4\uffff\1\44\1\uffff\3\44\12\43\5\uffff\1\44\1\uffff\32\43\4\uffff\1\45\1\uffff\32\43",
            "",
            ""
    };

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | RULE_VARIABLE | RULE_SYMBOL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA18_0 = input.LA(1);

                        s = -1;
                        if ( (LA18_0=='f') ) {s = 1;}

                        else if ( (LA18_0==':') ) {s = 2;}

                        else if ( (LA18_0=='%') ) {s = 3;}

                        else if ( (LA18_0=='r') ) {s = 4;}

                        else if ( (LA18_0==',') ) {s = 5;}

                        else if ( (LA18_0=='w') ) {s = 6;}

                        else if ( (LA18_0=='n') ) {s = 7;}

                        else if ( (LA18_0==';') ) {s = 8;}

                        else if ( (LA18_0=='i') ) {s = 9;}

                        else if ( (LA18_0=='d') ) {s = 10;}

                        else if ( (LA18_0=='o') ) {s = 11;}

                        else if ( (LA18_0=='t') ) {s = 12;}

                        else if ( (LA18_0=='e') ) {s = 13;}

                        else if ( (LA18_0=='(') ) {s = 14;}

                        else if ( (LA18_0=='c') ) {s = 15;}

                        else if ( (LA18_0==')') ) {s = 16;}

                        else if ( (LA18_0=='l') ) {s = 17;}

                        else if ( (LA18_0=='h') ) {s = 18;}

                        else if ( (LA18_0=='!') ) {s = 19;}

                        else if ( (LA18_0=='a') ) {s = 20;}

                        else if ( (LA18_0=='=') ) {s = 21;}

                        else if ( ((LA18_0>='A' && LA18_0<='Z')) ) {s = 22;}

                        else if ( (LA18_0=='b'||LA18_0=='g'||(LA18_0>='j' && LA18_0<='k')||LA18_0=='m'||(LA18_0>='p' && LA18_0<='q')||LA18_0=='s'||(LA18_0>='u' && LA18_0<='v')||(LA18_0>='x' && LA18_0<='z')) ) {s = 23;}

                        else if ( (LA18_0=='^') ) {s = 24;}

                        else if ( (LA18_0=='_') ) {s = 25;}

                        else if ( ((LA18_0>='0' && LA18_0<='9')) ) {s = 26;}

                        else if ( (LA18_0=='\"') ) {s = 27;}

                        else if ( (LA18_0=='\'') ) {s = 28;}

                        else if ( (LA18_0=='/') ) {s = 29;}

                        else if ( ((LA18_0>='\t' && LA18_0<='\n')||LA18_0=='\r'||LA18_0==' ') ) {s = 30;}

                        else if ( ((LA18_0>='\u0000' && LA18_0<='\b')||(LA18_0>='\u000B' && LA18_0<='\f')||(LA18_0>='\u000E' && LA18_0<='\u001F')||(LA18_0>='#' && LA18_0<='$')||LA18_0=='&'||(LA18_0>='*' && LA18_0<='+')||(LA18_0>='-' && LA18_0<='.')||LA18_0=='<'||(LA18_0>='>' && LA18_0<='@')||(LA18_0>='[' && LA18_0<=']')||LA18_0=='`'||(LA18_0>='{' && LA18_0<='\uFFFF')) ) {s = 31;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA18_28 = input.LA(1);

                        s = -1;
                        if ( ((LA18_28>='\u0000' && LA18_28<='\uFFFF')) ) {s = 68;}

                        else s = 31;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA18_27 = input.LA(1);

                        s = -1;
                        if ( ((LA18_27>='\u0000' && LA18_27<='\uFFFF')) ) {s = 68;}

                        else s = 31;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 18, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}