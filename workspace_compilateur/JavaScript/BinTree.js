class BinTree  {
    /**
     * Constructor of the BinTree class.
     * @param {*} data : Value of the node.
     * @param {*} leftTree : data's left BinTree.
     * @param {*} rightTree : data's right BinTree.
     */
    constructor(data, leftTree, rightTree) 
    {
        this.data = data;
        if(this.data != "nil")
        {
            this.left = leftTree;
            this.right = rightTree;
        }
        else
        {
            this.left = null;
            this.right = null;
        }
    }

    getData()
    {
        return this.data;
    }
    getLeft()
    {
        return this.left;
    }
    getRight()
    {
        return this.right;
    }

    setLeft(leftTree) 
    {
        if(leftTree.getData() != "nil")
        { 
            this.left=leftTree;
        }
    }
    setRight(rightTree) 
    {
        if(rightTree.getData() != "nil")
        {
            this.right=rightTree;
        } 
    }

    toString() {
        var str = "(";
        str += this.data.toString();
        if (this.left != null){
            str += this.left.toString();
        } 
        if (this.right != null){
            str += this.right.toString();
        }
        str += ")";
        return str
    }
};
/**
 * @param {*} tree : BinTree object.
 * @returns the head of tree. If its left son equals to null, will return null.
 */
function head(tree) {
    if(tree.getLeft() != null){
        return tree.getLeft()
    }
    return null
};
/**
 * @param {*} tree : BinTree object.
 * @returns the tail of tree. If its right son equals to null, will return null.
 */
function tail(tree) {
    if(tree.getRight() != null){
        return tree.getRight()
    }
    return null
};

/**
 * If the array contains less than 2 objects, it will produce a (nil) BinTree.
 * Else :
 *  The BinTree's root node is a cons, with the first element has a left son and another cons has a right son.
 *  The last cons contains the last 2 elements of the array.
 * Ex : array = {nil, nil, nil}. cons(array) will produce : (cons nil (cons nil nil)).
 * @param {*} args : array<BinTree> 
 * @returns BinTree object with the BinTrees in args.
 */
function cons(args) 
{
    if(args != null)
    {
        if(args.length == 0) {
            return new BinTree("nil", null, null)
        }
        
        var tree = args.shift(); 
        if(args.length <= 0)
        {
            return tree
        }
        else
        {
            return new BinTree("cons", tree, cons(args))
        }
    }
};

/**
 * Same as cons function but we have lists instead of cons, 
 *  and we have an additional (nil) at the end of the BinTree. 
 * @param {*} args : array<BinTree>
 * @returns List of BinTrees from a given array of BinTrees. (nil) if it has less than 2 elements.
 */
function list(args) 
{
    if(args != null)
    {
        if(args.length == 0)
        {
            return new BinTree("nil", null, null)
        }

        var tree = args.shift(); 
        if(args.length <= 0)
        {
            return new BinTree("list", tree, new BinTree("nil", null, null))
        }
        else
        {
            return new BinTree("list", tree, list(args))
        }
    }
};

/**
 * Apply the given operand to the trees.
 * @param {} operand : Given operand, can be either AND, OR or EQ
 * @param {*} tree1 : BinTree object (left side).
 * @param {*} tree2 : BinTree object (right side).
 * @returns case AND : (nil) if one of the elements equals to (nil), (cons(nil)(nil)) else.
 *          case OR : (nil) if both of the elements are equal to (nil), (cons(nil)(nil)) else.
 *          case EQ : (nil) if the elements are not equal, (cons(nil)(nil)) else.
 */
function evaluate(operand, tree1, tree2) {
   if (operand === "AND")
    { 
        if(tree1.getData() === "nil" || tree2.getData() === "nil")
        {
            return new BinTree("nil", null, null)
        } 
        else
        {
            return new BinTree("cons", new BinTree("nil", null, null), new BinTree("nil", null, null))
        } 
    }else if(operand === "OR")
    {
        if(tree1.getData() === "nil" && tree2.getData() === "nil")
        {
           return new BinTree("nil", null, null) 
        } 
        else
        {
            return new BinTree("cons", new BinTree("nil", null, null), new BinTree("nil", null, null))
        }
    }
    else if(operand === "EQ")
    {
        if( ! evaluateEQ(tree1, tree2))
        {
            return new BinTree("nil", null, null)
        }
        else
        {
            return new BinTree("cons", new BinTree("nil", null, null), new BinTree("nil", null, null))
        }
    }
    return null
};

/**
 * Evaluates tree1 and tree2 and tells if they are equal or not.
 * This function stringifies tree1 and tree2's params and compares tree1's params with tree2's params.  
 * @param {*} tree1 : BinTree object.
 * @param {*} tree2 : BinTree object.
 */
function evaluateEQ(tree1, tree2)
{ 
    return JSON.stringify(tree1) === JSON.stringify(tree2)
};

/**
 * Checks if a given tree is not equal to nil.
 * @param {*} tree : BinTree object.
 */
function isTrue(tree)
{
    return tree.getData() !== "nil"
};

/**
 * Converts a char sequence representing a BinTree to an actual BinTree object.
 * !! : The char sequence should be written as "(cons X Y)" or "(list X Y)" or "(nil)" 
 *      where X and Y are arguments in the same form.
 * @param {*} str : Char Sequence representing a BinTree.
 */
function bintreeFromString(str)
{
    var res = new BinTree("nil", null, null);

    //if the parameter is an int, launch function bintreeFromInt.
    if (Number.isInteger(parseInt(str)))
    {
        res = bintreeFromInt(parseInt(str))
    } 
    //if it's a string and correctly written, we start parsing to create an adequate BinTree.
    else if(str.charAt(0) === '(')
    {
        var i = 0;
        if (str.charAt(i) == '(')
        {
            if (str.substring(i+1, i+4) === "nil")
            {
                return res
            }
            else if (str.substring(i+1, i+5) === "cons" || str.substring(i+1, i+5) === "list")
            {
                var cmd = str.substring(i+1, i+5);
                var args=[];

                var openParenthesis = getOpenParenthesis(str, i+5);
                if(openParenthesis != -1){
                    i = openParenthesis;
                    var closeParenthesis = getCloseParenthesis(str, i);
                    var tree1 = bintreeFromString(str.substring((i), closeParenthesis));
                    args.push(tree1);
                
                    openParenthesis = getOpenParenthesis(str, closeParenthesis);
                    if(openParenthesis != -1){
                        closeParenthesis = getCloseParenthesis(str, openParenthesis);
                        var tree2 = bintreeFromString(str.substring(openParenthesis, closeParenthesis));
                        args.push(tree2);
                    }
                }
                if (cmd === "cons")
                {
                    res = cons(args)
                }
                else if (cmd === "list")
                {
                    res = list(args)
                }
                else
                {
                    throw "Error in creating the tree from the string"
                }
            }
            else
            {
                throw "Error in creating the tree from the string"
            }
        }
    }
    else //we create a symbol
    {
        res = new BinTree(str, null, null)
    }
    return res
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
    var res = new BinTree("nil", null, null)
    if (int != 0)
    {
        for(i = 0; i < int; i++)
        {
            var nil = new BinTree("nil", null, null);
            res = new BinTree("cons", nil, res)
        }
    }
    return res
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
    getOpenParenthesis: getOpenParenthesis,
    intFromBintree : intFromBintree
};