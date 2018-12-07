let bt = require('./bintree');
let BinTree = bt.BinTree;

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

/*
console.log(nil())
var a = new BinTree("nil",null,null);
var b = new BinTree("nil",null,null);
var res = cons(a,b);
console.log(res);
var a = new BinTree("cons",null,null);
console.log(res);
console.log(hd(res));
console.log(not(b));*/


