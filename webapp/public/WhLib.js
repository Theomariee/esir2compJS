let bt = require('./BinTree.js')

function nop(){
}

function nil(){
    return new bt.BinTree("nil",null,null);
}

function cons(addr2,addr3){
    var args=[];
    args.push(addr2); //clone the addr2
	if(addr3 != null){
		args.push(addr3); //clone the addr3
	}
    return bt.cons(args); //return the new bintree
}

function list(addr2,addr3){
    var args=[];
    args.push(Object.assign(Object.create(Object.getPrototypeOf(addr2)),addr2)); //clone the addr2
    args.push(Object.assign(Object.create(Object.getPrototypeOf(addr3)),addr3)); //clone the addr3
    return bt.list(args); //return the new bintree
}

function hd(addr2){
    return bt.head(addr2);
}

function tl(addr2){
    return bt.tail(addr2);
}

function not(addr2){
	if (bt.isTrue(addr2)){
		return new bt.BinTree("nil",null,null);
	}
	else{
		return new bt.BinTree("cons", new bt.BinTree("nil",null,null), new bt.BinTree("nil",null,null));
	}
}

function isTrue(tree){
	return bt.isTrue(tree);
}

function and(addr2,addr3){
    return bt.evaluate("AND",addr2,addr3);
}

function or(addr2,addr3){
    return bt.evaluate("OR",addr2,addr3);
}

function eq(addr2,addr3){
    return bt.evaluate("EQ",addr2,addr3);
}

function symb(addr2){ //here, a symbol is given so we need to return a bintree with the symbol as data
    return bintreeFromString(addr2);
}

/**
 * Converts a char sequence representing a BinTree to an actual BinTree object.
 * !! : The char sequence should be written as "(cons X Y)" or "(list X Y)" or "(nil)" 
 *      where X and Y are arguments in the same form.
 * @param {*} str : Char Sequence representing a BinTree.
 */
function bintreeFromString(str)
{
    var res = new bt.BinTree("nil", null, null);
    /* if the parameter is an int, launch function bintreeFromInt. */
    if (Number.isInteger(parseInt(str)))
    {
        res = bintreeFromInt(parseInt(str));
    }
    /* if it's a string and correctly written, we start parsing to create an adequate BinTree. */
    else if(str.charAt(0) === '(')
    {
        var i = 0;
        if (str.substring(i+1, i+5) === "cons" || str.substring(i+1, i+5) === "list")
        {
            if(str.charAt(str.length - 1) != ')'){
                return "Erreur, pas de parenthèse fermante englobant l'expression entiere."
            }else if(str.charAt(5) == ')'){
                return new bt.BinTree("nil", null, null)
            }

            if (str.charAt(i+5) != ' ')
            {
                return "Il faut un espace apres un cons/list. Veuillez reformuler votre BinTree."
            }
            var cmd;
            if ("cons" === str.substring(i+1, i+5) || "list" === str.substring(i+1, i+5)){
                cmd = str.substring(i+1, i+5) ;
            }else{
                return "Opening Parenthesis found but not followed by a cons nor a list."
            }
            var args=[], newNode = "", whitespaces = 0;
            i = 6;        
            while(i < str.length){
                if(str.charAt(i) == ' ' || str.charAt(i) == ')'){       
                    if(str.charAt(i) == ' ')
                    {
                        if (whitespaces > 1)
                        {
                            return "Erreur, plus d'un espace entre chaque terme."
                        }
                        whitespaces++;
                    }
                    if(newNode !== "")
                    {
                        args.push(new bt.BinTree(newNode, null, null));
                        whitespaces = 0;
                        newNode = "";
                    }
                    i++;
                    continue;
                }
                if(str.charAt(i) == "(") /* Case : one or multiple cons expressions in str */
                {
                    var closeParenthesis = getCloseParenthesis(str, i);
                    args.push(bintreeFromString(str.substring(i, closeParenthesis + 1)));
                    i += str.substring(i, closeParenthesis + 1).length
                }
                else /* no cons expression - only nil or symbols in str */
                {
                    newNode = newNode + str.charAt(i)
                }
                i++
            }
            if(str.charAt(i - 2) == ' '){return "Erreur, un ou plusieurs espace(s) en trop avant la parenthese fermante."}
            
            if (cmd === "cons"){
                res = bt.cons(args);
            }
            if (cmd === "list"){
                res = bt.list(args);
            } 
        }
    }
    else //we create a symbol
    {
        res = new bt.BinTree(str, null, null);
    }
    return res;
};


/**
 * Parsing : Finding the position of the next '(' parenthesis of a char sequence representing a BinTree.
 * @param {*} str : Char Sequence representing a BinTree object.
 * @param {*} position : Integer representing our position in str.
 * @returns position of the next '('.
 */
function getOpenParenthesis(str, position)
{
    while(str.charAt(position) !== '('  && position <= str.length)
    {
        position++
    }
    if(position > str.length){
        return -1
    }
    return position
};

/**
 * Parsing : Finding the position of the next ')' parenthesis of a string, from a '(' parenthesis.
 * @param {*} str : Char Sequence representing a BinTree object.
 * @param {*} position : Integer representing the position of the previous opening parenthesis.
 * @returns position of the closing parenthesis, if there was an opening parenthesis found previously.
 */
function getCloseParenthesis(str, position)
{
    if(str.charAt(position) !== '(')
    {
        return -1
    }
    var nbOpenParenthesis = 1;
    var found = false;
    while(!found)
    {
        position++;
        if(str.charAt(position) === ')')
        {
            if (nbOpenParenthesis == 1)
            {
                found = true
            }
            else
            {
                nbOpenParenthesis--
            }
        }
        else if(str.charAt(position) === '(')
        {
            nbOpenParenthesis++
        }
    }
    return position
};
/**
 * Converts a given BinTree object to an Integer.
 * @param {*} tree : BinTree object. 
 * @returns Integer representing param tree.
  */
function intFromBintree(tree)
{
    var res = 0;
    if(tree != null)
    {
        if(tree.getData() === "cons" || tree.getData() === "list")
        {
            res++;
            res += intFromBintree(tree.getLeft());
            res += intFromBintree(tree.getRight())
        }
    }
    return res
};
/**
 * Constructs a bintree from a given Integer.
 * @param {*} int : Integer to convert.
 * @returns BinTree.
  */
function bintreeFromInt(int)
{
    var res = new bt.BinTree("nil", null, null)
    if (int != 0)
    {
        for(i = 0; i < int; i++)
        {
            var tmp = new bt.BinTree("nil", null, null);
            res = new bt.BinTree("cons", tmp, res) 
        }
    }
    return res
};

module.exports = {
    bt: bt,
    nop: nop,
    nil: nil,
    cons: cons,
    list: list,
    hd: hd,
    tl: tl,
    not: not,
    and:  and,
    or: or,
    eq: eq,
    symb: symb,
    bintreeFromString: bintreeFromString,
    intFromBintree: intFromBintree,
    bintreeFromInt: bintreeFromInt,
    getCloseParenthesis: getCloseParenthesis,
    getOpenParenthesis: getOpenParenthesis
};
