class BinTree  {
    constructor(data, leftTree, rightTree) {
        this.data=data;
        if(!this.data==="nil")
        {
            this.left=leftTree;
            this.right=rightTree;
        }
        else
        {
            this.left=null;
            this.right=null;
        }
    }

    getData(){return this.data;}
    getLeft(){return this.left;}
    getRight(){return this.right;}

    setLeft(leftTree) {
        if(leftTree.getData()!="nil") this.left=leftTree;
    }
    setRight(rightTree) {
        if(rightTree.getData()!="nil") this.right=rightTree;
    }
};

//return the head of a tree, if it has no left son return null
function head(tree) {
    if(tree.getLeft()!=null) return tree.getLeft();
    return null;
};

//return the tail of a tree, if it has no right son return itself
function tail(tree) {
    if(tree.getRight()!=null) return tree.getRight();
    return null;
};

//from an array of things, construct a BinTree of these things
function cons(args) { // à partir de plusieurs BinTree dans un array, retourne un bintree
    if(args != null)
    {
        if(args.length == 0) return new BinTree("nil",null,null);
        var tree = args.shift(); //shift removes from the beginning of the array
        if(args.length <= 0)
        {
            return tree; // new BinTree(tree, null, null)
        }
        else
        {
            return new BinTree("cons", tree, cons(args));
        }
    }
};

//from an array of things, create a list BinTree of these things
function list(args) {
    if(args != null)
    {
        if(args.length == 0) return new BinTree("nil",null,null);
        var tree = args.shift(); //shift removes from the beginning of the array
        if(args.length <= 0)
        {
            return new BinTree("list", tree, new BinTree("nil",null,null));
        }
        else
        {
            return new BinTree("list", tree, list(args));
        }
    }
};

//TODO
//from a given operand, apply it
function evaluate(operand,tree1,tree2) {
    /*if (operand==="AND")
    { //
        if(tree1.getData()==="nil" || tree2.getData()==="nil") return new BinTree("nil",null,null)
        else return new BinTree("cons",new BinTree("nil",null,null),new BinTree("nil",null,null));
    }else if(operand==="OR")
    {
        if(tree1.getData()==="nil" || tree2.getData()==="nil") return new BinTree("nil",null,null)
        else return new BinTree("cons",new BinTree("nil",null,null),new BinTree("nil",null,null));
    }else if(operand==="EQ")
    {
        if(tree1.getData()==="nil" || tree2.getData()==="nil") return new BinTree("nil",null,null)
        else return new BinTree("cons",new BinTree("nil",null,null),new BinTree("nil",null,null));
    }
    return null;*/
};

//TODO
//Evaluate if two trees are equals
function evaluateEQ(tree1,tree2)
{
    /* 
    if (tree1.getLeft() != null && tree2.getLeft() == null)
    {
        return false;
    }
    if (tree1.getLeft() == null && tree2.getLeft() != null)
    {
        return false;
    }
    if (tree1.getRight() != null && tree2.getRight() == null)
    {
        return false;
    }
    if (tree1.getRight() == null && tree2.getRight() != null)
    {
        return false;
    }
    if (tree1.getRight() == null && tree2.getRight() == null && tree1.getLeft() != null)
    {
        return tree1.getData() === tree2.getData() && evaluateEQ(tree1.getLeft(), tree2.getLeft());
    }
    if (tree1.getLeft() == null && tree2.getLeft() == null && tree1.getRight() != null)
    {
        return tree1.getData() === tree2.getData() && evaluateEQ(tree1.getRight(), tree2.getRight());
    }
    if (tree1.getLeft() == null && tree1.getRight() == null)
    {
        return tree1.getData() === tree2.getData();
    }
    if (tree1.getData() === tree2.getData() && evaluateEQ(tree1.getLeft(), tree2.getLeft()) && evaluateEQ(tree1.getRight(), tree2.getRight()))
    {
        return true;
    }
    return false;
    */
    return tree1 == tree2;
};

//Check if a given tree is not nil
function isTrue(tree)
{
    if (tree.getData() === "nil") return false;
    return true;
};

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
                    res = list(args);
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



/*var bt = new BinTree("nil",null,null);
var bt2 = new BinTree("nil",null,null);
//console.log(bt.getData(),bt.getLeft(),bt.getRight()); //should print nilnullnull
console.log(isTrue(bt)); //should be false

console.log(bintreeFromString("(cons(nil)(nil))")) //should print a bin tree with data cons and nil in right and left sons
console.log(bintreeFromString("(list(nil)(nil))"))
var args=[]
args.push(bt)
args.push(bt2)
console.log(list(args))

console.log(bintreeFromInt(5))
console.log(intFromBintree(bintreeFromInt(5)))
console.log(bintreeFromString("(cons(cons(nil)(nil))(nil))"))*/


module.exports = {
    BinTree: BinTree,
    head: head,
    tail: tail,
    cons: cons,
    list: list,
    evaluate: evaluate,
    evaluateEQ: evaluateEQ,
    isTrue: isTrue,
    bintreeFromString: bintreeFromString,
    bintreeFromInt: bintreeFromInt,
    getCloseParenthesis: getCloseParenthesis,
    getOpenParenthesis: getOpenParenthesis
};
