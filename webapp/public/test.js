
let wh = require('./WhLib.js');
let bt =wh.bt;
let BinTree = bt.BinTree;
var chai = require('chai');
var assert = chai.assert;


describe('BinTree Test Session', function() {
  describe('#binTreeFromInt()', function() {
    it('Converts the value 0 to BinTree, should return the following BinTree : nil.', function() {
      assert.isTrue(bt.evaluateEQ(wh.bintreeFromInt(0), new BinTree("nil", null, null)));
    });
    it('Converts the value 1 to BinTree, should return the following BinTree : (cons nil nil).', function(){
      var t = new BinTree("nil", null, null);
      var t2 = new BinTree("nil", null, null);
      var args = [];
      args.push(t); args.push(t2);
      assert.isTrue(bt.evaluateEQ(wh.bintreeFromInt(1), bt.cons(args)));
    });
    it('Converts the value 2 to BinTree, should return the following BinTree : (cons nil (cons nil nil).', function(){
      var t = new BinTree("nil", null, null);
      var t2 = new BinTree("nil", null, null);
      var t3 = new BinTree("nil", null, null);
      var args = [];
      var args2 = [];
      args.push(t); args.push(t2); 
      args2.push(t3); args2.push(bt.cons(args));

      assert.isTrue(bt.evaluateEQ(wh.bintreeFromInt(2), bt.cons(args2)));
    });
  });
  describe('#intFromBinTree()', function(){
    it(('Converting nil to int should return the value 0.'), function(){ 
      var tree = new BinTree("nil", null, null);
      assert.equal(wh.intFromBintree(tree), 0);
    });
    it(('Converting (cons) to int should return the value 0.'), function(){
      var args = [];
      assert.equal(wh.intFromBintree(bt.cons(args)), 0);
    });
    it(('Converting (list) to int should return the value 0.'), function(){
      var args = [];
      assert.equal(wh.intFromBintree(bt.list(args)), 0);
    });

    it(('Converting (cons (nil)) to int should return the value 0.'), function(){
      var t = new BinTree("nil", null, null);
      var args = [];
      args.push(t); 
      assert.equal(wh.intFromBintree(bt.cons(args)), 0);
    });

    it(('Converting (cons(nil)(nil)) to int should return the value 1.'), function(){
      var t = new BinTree("nil", null, null);
      var t2 = new BinTree("nil", null, null);
      var args = [];
      args.push(t); args.push(t2); 
      assert.equal(wh.intFromBintree(bt.cons(args)), 1);
    });
    
    it(('Converting (list(nil)(nil)) to int should return the value 2.'), function(){ 
      var t = new BinTree("nil", null, null);
      var t2 = new BinTree("nil", null, null);
      var args = [];
      args.push(t); args.push(t2); 
      assert.equal(wh.intFromBintree(bt.list(args)), 2);
    });
  });

  describe(('#bintreeFromInt and #intFromBintree'), function(){
    it(('Converting int to Bintree and deconverting it, should return the same int'), function(){
        assert.equal(5, wh.intFromBintree(wh.bintreeFromInt(5)));
    });
  /*  it(('Deconverting and converting BinTree (cons(nil)(cons(nil)(nil))), should return the same BinTree'), function(){
        var t = wh.bintreeFromString("(cons nil nil nil)");
        assert.isTrue(bt.evaluateEQ(t, wh.bintreeFromInt(wh.intFromBintree(t))));
    });*/
  });
  
  describe(('#bintreeFromString()'), function(){
    it(('Should convert a stringified int to a BinTree.'), function(){
      var t = wh.bintreeFromInt(5);
      assert.isTrue(bt.evaluateEQ(wh.bintreeFromString("5"), t));
    });
    it(('Converting nil to a BinTree.'), function(){
      var t = new BinTree("nil", null, null);
      assert.isTrue(bt.evaluateEQ(wh.bintreeFromString("nil"), t))
    });
    it(('Should convert a symbol to BinTree with symbol as the only node inside the BinTree.'), function(){
      var t = new BinTree("symbol", null, null);
      assert.isTrue(bt.evaluateEQ(wh.bintreeFromString("symbol"), t));
    });
    it(('Should convert the following char sequence : (cons) to a BinTree.'), function(){
      var t = new bt.BinTree("nil", null, null);
      assert.isTrue(bt.evaluateEQ(t, wh.bintreeFromString("(cons)"))); 
    });
    it(('Should convert the following char sequence : (list) to a BinTree.'), function(){
      var args = [];
      assert.isTrue(bt.evaluateEQ(bt.list(args), wh.bintreeFromString("(list)"))); 
    });
    it(('Should convert the following char sequence : (list) to a BinTree : (cons).'), function(){
      var args = [];
      assert.isTrue(bt.evaluateEQ(bt.list(args), wh.bintreeFromString("(cons)"))); 
    });
    it(('Should convert the following char sequence : (cons) to a BinTree : (list).'), function(){
      var args = [];
      assert.isTrue(bt.evaluateEQ(bt.cons(args), wh.bintreeFromString("(list)"))); 
    });
    it(('Should convert the following char sequence : (cons nil) to a BinTree.'), function(){
      var t = new BinTree("nil", null, null);
      var args = [];
      args.push(t);
      assert.isTrue(bt.evaluateEQ(bt.cons(args), wh.bintreeFromString("(cons nil)"))); 
    });
    it(('Should convert the following char sequence : (list nil) to a BinTree.'), function(){
      var t = new BinTree("nil", null, null);
      var args = [];
      args.push(t);
    
      assert.isTrue(bt.evaluateEQ(bt.list(args), wh.bintreeFromString("(list nil)"))); 
    });
    it(('Should convert the following char sequence : (list nil nil) to a BinTree.'), function(){
      var args = [];
      args.push(new BinTree("nil", null, null));
      args.push(new BinTree("nil", null, null));    
      assert.isTrue(bt.evaluateEQ(bt.list(args), wh.bintreeFromString("(list nil nil)"))); 
    });
    it(('Should convert the following char sequence : (cons nil nil nil bonjour) to a BinTree.'), function(){
      var args = [];
      args.push(new BinTree("nil", null, null));
      args.push(new BinTree("nil", null, null));
      args.push(new BinTree("nil", null, null));
      args.push(new BinTree("bonjour", null, null));
      assert.isTrue(bt.evaluateEQ(bt.cons(args), wh.bintreeFromString("(cons nil nil nil bonjour)"))); 
    });
    it(('Should convert the following char sequence : (list nil nil nil) to a BinTree.'), function(){
      var args = [];
      args.push(new BinTree("nil", null, null));
      args.push(new BinTree("nil", null, null));
      args.push(new BinTree("nil", null, null));    
      assert.isTrue(bt.evaluateEQ(bt.list(args), wh.bintreeFromString("(list nil nil nil)"))); 
    });
    describe(('EXPRESSIONS THAT SHOULD NOT BE CONVERTED'), function() {
      it(('(cons nil nil )     : Additionnal space(s) before the closing parenthesis.'), function(){
        var args = [];
        args.push(new BinTree("nil", null, null));
        args.push(new BinTree("nil", null, null));
        assert.isFalse(bt.evaluateEQ(bt.cons(args), wh.bintreeFromString("(cons nil nil )"))); 
      });
      it(('(cons nil nil       : Missing closing parenthesis.'), function(){
        var args = [];
        args.push(new BinTree("nil", null, null));
        args.push(new BinTree("nil", null, null));
        assert.isFalse(bt.evaluateEQ(bt.cons(args), wh.bintreeFromString("(cons nil nil"))); 
      });
      it(('(cons   nil  nil)   : Additionnal whitespaces between two terms.'), function(){
        var args = [];
        args.push(new BinTree("nil", null, null));
        args.push(new BinTree("nil", null, null));
        assert.isFalse(bt.evaluateEQ(bt.cons(args), wh.bintreeFromString("(cons  nil  nil"))); 
      });
    });
      

    /*it(('Should convert the following char sequence : (cons nil (cons nil nil)) to a BinTree.'), function(){
      var t = new BinTree("nil", null, null);
      var t2 = new BinTree("nil", null, null);
      var t3 = new BinTree("nil", null, null);
      var args = [];
      var args2 = [];
      args.push(t); args.push(t2); 
      args2.push(t3); args2.push(bt.cons(args));
      assert.isTrue(bt.evaluateEQ(bt.cons(args2), wh.bintreeFromString("(cons nil (cons nil  nil))")));
    });*/
    
  });

  describe(('#BinTree.ToString()'), function(){
    it(('Should print the literal expression of the BinTree : (nil)'), function(){
      var t = new BinTree("nil", null, null);

      assert.equal(t.toString(), "(nil)");
    });
    it(('Should print the literal expression of the BinTree : (cons)'), function(){
      var args = []; 

      assert.equal(bt.list(args).toString(), "(nil)");
    });
    it(('Should print the literal expression of the BinTree : (list)'), function(){
      var args = []; 

      assert.equal(bt.list(args).toString(), "(nil)");
    });
    it(('Should print the literal expression of the BinTree : (cons(nil)(nil))'), function(){
      var t1 = new BinTree("nil", null, null);
      var t2 = new BinTree("nil", null, null);
      var args = []; 
      args.push(t1); args.push(t2);

      assert.equal(bt.cons(args).toString(), "(cons(nil)(nil))");
    });
    it(('Should print the literal expression of the BinTree : (list(nil)(list(nil)(list(nil)(nil))))'), function(){
      var t1 = new BinTree("nil", null, null);
      var t2 = new BinTree("nil", null, null);
      var t3 = new BinTree("nil", null, null);
      var args = []; 
      args.push(t1); args.push(t2); args.push(t3);

      assert.equal(bt.list(args).toString(), "(list(nil)(list(nil)(list(nil)(nil))))")
    });
  });

});
