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
        if(args.length == 0)
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

module.exports = {
    BinTree: BinTree,
    head: head,
    tail: tail,
    cons: cons,
    list: list,
    evaluate: evaluate,
    evaluateEQ: evaluateEQ,
    isTrue: isTrue
};