let bt = require('./bintree.js')
let BinTree = bt.BinTree;
var chai = require('chai');
var assert = chai.assert;


describe('test BinTree', function() {
  describe('#binTreeFromInt()', function() {
    it('Converts the value 0 to BinTree, should return the following BinTree : nil.', function() {
      assert.isTrue(bt.evaluateEQ(bt.bintreeFromInt(0), new BinTree("nil", null, null)));
    });
    it('Converts the value 1 to BinTree, should return the following BinTree : (cons nil nil).', function(){
      var t = new BinTree("nil",null,null);
      var t2 = new BinTree("nil",null,null);
      var args = [];
      args.push(t); args.push(t2);
      assert.isTrue(bt.evaluateEQ(bt.bintreeFromInt(1), bt.cons(args)));
    });
    it('Converts the value 2 to BinTree, should return the following BinTree : (cons nil (cons nil nil).', function(){
      var t = new BinTree("nil",null,null);
      var t2 = new BinTree("nil",null,null);
      var t3 = new BinTree("nil",null,null);
      var args = [];
      var args2 = [];
      args.push(t); args.push(t2); 
      args2.push(t3); args2.push(bt.cons(args));

      assert.isTrue(bt.evaluateEQ(bt.bintreeFromInt(2), bt.cons(args2)));
    });
  });
  describe('#intFromBinTree()', function(){
    it(('Converting nil to int should return the value 0.'), function(){ 
      var tree = new BinTree("nil", null, null);
    assert.equal(bt.intFromBintree(tree), 0);
    });
    it(('Converting (cons) to int should return the value 0.'), function(){
      var args = [];
      assert.equal(bt.intFromBintree(bt.cons(args)), 0);
    });
    it(('Converting (list) to int should return the value 0.'), function(){
      var args = [];
      assert.equal(bt.intFromBintree(bt.list(args)), 0);
    });

    it(('Converting (cons (nil)) to int should return the value 0.'), function(){
      var t = new BinTree("nil",null,null);
      var args = [];
      args.push(t); 
      assert.equal(bt.intFromBintree(bt.cons(args)), 0);
    });

    it(('Converting (cons(nil)(nil)) to int should return the value 1.'), function(){
      var t = new BinTree("nil",null,null);
      var t2 = new BinTree("nil",null,null);
      var args = [];
      args.push(t); args.push(t2); 
      assert.equal(bt.intFromBintree(bt.cons(args)), 1);
    });
    
    it(('Converting (list(nil)(nil)) to int should return the value 2.'), function(){ 
      var t = new BinTree("nil",null,null);
      var t2 = new BinTree("nil",null,null);
      var args = [];
      args.push(t); args.push(t2); 
      assert.equal(bt.intFromBintree(bt.list(args)), 2);
    });
    
  });

  describe(('#bintreeFromInt and #intFromBintree'), function(){
    it(('Converting int to Bintree and deconverting it, should return the same int'), function(){
        assert.isTrue(bt.evaluateEQ(5, bt.intFromBintree(bt.bintreeFromInt(5))));
    });
    it(('Deconverting and converting BinTree (cons(nil)(cons(nil)(nil))), should return the same BinTree'), function(){
        var t = bt.bintreeFromString("(cons(nil)(cons(nil)(nil)))");
        assert.isTrue(bt.evaluateEQ(t, bt.bintreeFromInt(bt.intFromBintree(t))));
    });
  });

  describe(('#bintreeFromString()'), function(){
    it(('Should convert symbol to BinTree with symbol as the only node inside the BinTree.'), function(){
      var t = new BinTree("symbol", null, null);
      assert.isTrue(bt.evaluateEQ(bt.bintreeFromString("symbol"), t));
    });
    it(('Should convert (cons) to BinTree.'), function(){
      var args = [];
      assert.isTrue(bt.evaluateEQ(bt.cons(args), bt.bintreeFromString("(cons)"))); 
    });
    it(('Should convert (list) to BinTree.'), function(){
      var args = [];
      assert.isTrue(bt.evaluateEQ(bt.list(args), bt.bintreeFromString("(list)"))); 
    });
    it(('Should convert (list) to BinTree : (cons).'), function(){
      var args = [];
      assert.isTrue(bt.evaluateEQ(bt.list(args), bt.bintreeFromString("(cons)"))); 
    });
    it(('Should convert (cons) to BinTree : (list).'), function(){
      var args = [];
      assert.isTrue(bt.evaluateEQ(bt.cons(args), bt.bintreeFromString("(list)"))); 
    });
    it(('Should convert (cons(nil)) to BinTree.'), function(){
      var t = new BinTree("nil",null,null);
      var args = [];
      args.push(t);
      assert.isTrue(bt.evaluateEQ(bt.cons(args), bt.bintreeFromString("(cons(nil))"))); 
    });
    it(('Should convert (list(nil)) to BinTree.'), function(){
      var t = new BinTree("nil",null,null);
      var args = [];
      args.push(t);
      assert.isTrue(bt.evaluateEQ(bt.list(args), bt.bintreeFromString("(list(nil))"))); 
    });
    it(('Should convert (cons(nil)(cons(nil)(nil))) to BinTree.'), function(){
      var t = new BinTree("nil",null,null);
      var t2 = new BinTree("nil",null,null);
      var t3 = new BinTree("nil",null,null);
      var args = [];
      var args2 = [];
      args.push(t); args.push(t2); 
      args2.push(t3); args2.push(bt.cons(args));
      assert.isTrue(bt.evaluateEQ(bt.cons(args2), bt.bintreeFromString("(cons(nil)(cons(nil)(nil)))")));
    });
    it(('Should convert stringified int to BinTree.'), function(){
      var t = bt.bintreeFromInt(5);
      assert.isTrue(bt.evaluateEQ(bt.bintreeFromString("5"), t));
    });
    
});

});


