class BinTree {
    constructor(data, leftTree, rightTree) {
        this.data=data;
        if(this.data!="nil")
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
    //return the head of a tree, if it has no left son return null
    hd(tree) {
        if(tree.getLeft()!=null) return tree.getLeft();
        return null;
    }
    //return the tail of a tree, if it has no right son return itself
    tl(tree) {
        if(tree.getRight()!=null) return tree.getRight();
        return null;
    }

    //from an array of things, construct a BinTree of these things
    cons(params) { // à partir de plusieurs BinTree dans un array, retourne un bintree
        if(params != null)
        {
            var tree = params.shift(); //shift removes from the beginning of the array
            if(params.length == 0)
            {
                return tree;
            }
            else
            {
                return new BinTree("cons", tree, this.cons(params));
            }
        }
    }

    //from an array of things, create a list BinTree of these things
    list(params) {
        if(params != null)
        {
            var tree = params.shift(); //shift removes from the beginning of the array
            if(params.length == 0)
            {
                return new BinTree("list", tree, new BinTree("nil",null,null));
            }
            else
            {
                return new BinTree("list", tree, this.list(params));
            }
        }
    }

    //TODO
    //from a given operand, apply it
    /*evaluate(operand,tree1,tree2) {
        if (operand==="AND")
        {
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
        return null;
    }*/

    //TODO
    //Evaluate if two trees are equals
    evaluateEQ(tree1,tree2)
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
    }

    //Check if a given tree is not nil
    isTrue(tree)
    {
        if (!tree.getData() === "nil") return true;
        return false;
    }

    //TOCOMPLETE
    //Convert string to BinTree
    //string should be written as "(cons X Y)" or "(list X Y)" or "(nil)" where X and Y are arguments in the same form
    convertStrToBinTree(str)
    {
        var ret = new BinTree(str, null, null);
        var nb=0;

        //si entier, mauvaise fonction
        if (Number.isInteger(str))
        {
            ret = convertIntToBinTree(str);
        } //si string, on parse
        else if(str.charAt(0) === '(')
        {
            //c'est une forme while (...)
            var i = 0;
            if (str.charAt(i) == '(') //CONS OR LIST
            {
                if (str.substring(i+1, 3) === "nil")
                {
                    return ret; //Return BinTree("nil",null,null)
                }
                else if (str.substring(i+1, 4) === "cons" || str.substring(i+1, 4) === "list")
                {
                    var cmd = str.substring(i+1, 4);

                    var args=[];

                    i += getNextOpeningParenthesis(str, i+5); //i+5 = char juste après "cons", recup place prochaine '('
                    var closing = getIndexClosingParenthesis(str, i); //recup ')' associee
                    var tree1 = convertStrToBinTree(str.Substring((i), closing - i)); //string contenant tout le premier param du cons
                    var nextOpening = getNextOpeningParenthesis(str, closing); //recup '(' suivant la ')' du premier param -> ouverture second param
                    var tree2 = convertStrToBinTree(str.Substring(nextOpening, getIndexClosingParenthesis(str, nextOpening) - (nextOpening))); //string contenant tout le second param

                    args.push(tree1);

                    if (cmd === "cons")
                    {
                        ret = cons(args); //creation du BinTree avec les deux param (cons)
                    }
                    else if (cmd === "list")
                    {
                        ret = list(args); // creation du BinTree avec les deux param (list)
                    }
                    else
                    {
                       throw "Parsing bug";
                    }
                }
                else
                {
                    throw "Parsing bug";
                }
            }
        }
        else
        {
            //c'est un symbole
            ret = new BinTree(str, null, null);
        }
        return ret;
    }
}

var bt = new BinTree("nil",null,null);
var bt2 = new BinTree("nil",null,null);
//var bt = new BinTree("hi",new BinTree("nil",null,null),null);
//console.log(bt.getData(),bt.getLeft(),bt.getRight());
//console.log(bt.isTrue(bt));
console.log(bt === bt2);

var params = [1,2,3]
var constructedTree = bt.cons(params);
console.log(constructedTree);

params = [1,2,3]
var listTree = bt.list(params);
console.log(listTree);
console.log(listTree.right.right);


module.exports = BinTree;
//const BinTree = require('./BinTree.js') pour inclure puis var bt = new BinTree("nil",null,null);
