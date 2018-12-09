import {
    BinTree,
    head,
    tail,
    cons,
    list,
    evaluate,
    evaluateEQ,
    isTrue } as bt from 'BinTree.js';

function nop(){
}

function nil(){
    return new BinTree("nil",null,null);
}

function cons(addr2,addr3){
    var args=[];
    args.push(Object.assign(Object.create(Object.getPrototypeOf(addr2)),addr2)); //clone the addr2
    args.push(Object.assign(Object.create(Object.getPrototypeOf(addr3)),addr3)); //clone the addr3
    return bt.cons(args); //return the new bintree
}

function list(addr2,addr3){
    var args=[];
    args.push(Object.assign(Object.create(Object.getPrototypeOf(addr2)),addr2)); //clone the addr2
    args.push(Object.assign(Object.create(Object.getPrototypeOf(addr3)),addr3)); //clone the addr3
    return bt.list(args); //return the new bintree
}

function hd(addr2){
    return bt.head(Object.assign(Object.create(Object.getPrototypeOf(addr2)),addr2));
}

function tl(addr2){
    return bt.tail(Object.assign(Object.create(Object.getPrototypeOf(addr2)),addr2));
}

function not(addr2){
    return !(bt.isTrue(addr2));
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
    return bt.bintreeFromString(addr2);
}

//Convert string to BinTree
//string should be written as "(cons X Y)" or "(list X Y)" or "(nil)" where X and Y are arguments in the same form
function bintreeFromString(str)
{
    var res = new BinTree("nil", null, null);

    //if the parameter is an int, wrong function
    if (Number.isInteger(str))
    {
        res = bintreeFromInt(str);
    } //if it's a string and correctly written, we start parsing to create an adequate bintree
    else if(str.charAt(0) === '(')
    {
        var i = 0;
        if (str.charAt(i) == '(')
        {
            if (str.substring(i+1, i+4) === "nil")
            {
                return res;
            }
            else if (str.substring(i+1, i+5) === "cons" || str.substring(i+1, i+5) === "list")
            {
                var cmd = str.substring(i+1, i+5);
                var args=[];

                var openParenthesis = getOpenParenthesis(str, i+5);
                i = openParenthesis;
                var closeParenthesis = getCloseParenthesis(str, i);
                var tree1 = bintreeFromString(str.substring((i), closeParenthesis));

                openParenthesis = getOpenParenthesis(str, closeParenthesis);
                closeParenthesis = getCloseParenthesis(str, openParenthesis);
                var tree2 = bintreeFromString(str.substring(openParenthesis, closeParenthesis));

                args.push(tree1);
                args.push(tree2);

                if (cmd === "cons")
                {
                    res = cons(args);
                }
                else if (cmd === "list")
                {
                    args.push(new BinTree("nil", null, null));
                }
                else
                {
                throw "Error in creating the tree from the string";
                }
            }
            else
            {
                throw "Error in creating the tree from the string";
            }
        }
    }
    else
    {
        res = new BinTree(str, null, null);
    }
    return res;
};


//Parsing : Find the position of the next '(' parenthesis of a string
function getOpenParenthesis(str, position)
{
    while(str.charAt(position) !== '(')
    {
        position++;
    }
    return position;
};

//Parsing : Find the position of the next ')' parenthesis of a string, from a '(' parenthesis
function getCloseParenthesis(str, position)
{
    if(str.charAt(position) !== '(')
    {
        return -1;
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
                found = true;
            }
            else
            {
                nbOpenParenthesis--;
            }
        }
        else if(str.charAt(position) === '(')
        {
            nbOpenParenthesis++;
        }
    }
    return position;
};

//construct a bintree from a given int
function bintreeFromInt(int)
{
    var res = new BinTree("nil", null, null);
    if (int != 0)
    {
        for(i = 0; i < int; i++)
        {
            var nil = new BinTree("nil", null, null);
            res = new BinTree("cons", nil, res);
        }
    }
    return res;
};

//return an int from a given bintree
function intFromBintree(tree)
{
    var res = 0;
    if(tree != null)
    {
        if(tree.getData() === "cons" || tree.getData === "list")
        {
            res++;
            res += intFromBintree(tree.getLeft());
            res += intFromBintree(tree.getRight());
        }
    }
    return res;
};

//console.log(nil())
var a = new BinTree("nil",null,null);
var b = new BinTree("nil",null,null);
var res = cons(a,b);
console.log(res);
a = new BinTree("cons",null,null);
console.log(res);
console.log(hd(res));
console.log(not(b));
