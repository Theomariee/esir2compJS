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
        if(leftTree.getData()!="nil")
            this.left=leftTree;
    }
    setRight(rightTree) {
        if(rightTree.getData()!="nil")
            this.right=rightTree;
    }

    head(tree) {
        if(tree.getLeft()!=null)
            return tree.getLeft();
        return null;
    }
    tail(tree) {
        if(tree.getRight()!=null)
            return tree.Right();
        return null;
    }

    cons(params) { // à partir de plusieurs BinTree dans un array, retourne un bintree
        if(params!=null)
        {
            var tree = params.shift(); //shift removes from the beginning of the array
            if(params.length==0)
            {
                return tree;
            }else{
                return new BinTree("cons",tree,this.cons(params));
            }
        }
    }

    list(params) { // à partir de plusieurs BinTree dans un array, retourne un bintree
        if(params!=null)
        {
            var tree = params.shift(); //shift removes from the beginning of the array
            if(params.length==0)
            {
                return new BinTree("list",tree,new BinTree("nil",null,null));
            }else{
                return new BinTree("list",tree,this.list(params));
            }
        }
    }
}

var bt = new BinTree("nil",null,null);
//var bt = new BinTree("hi",new BinTree("nil",null,null),null);
console.log(bt.getData(),bt.getLeft(),bt.getRight());

var params = [1,2,3]
var constructedTree = bt.cons(params);
console.log(constructedTree);

params = [1,2,3]
var listTree = bt.list(params);
console.log(listTree);
console.log(listTree.right.right);


module.exports = BinTree;
//const BinTree = require('./BinTree.js') pour inclure puis var bt = new BinTree("nil",null,null);
