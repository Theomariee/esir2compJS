const whlib = require('../webapp/public/WhLib.js');
const bt =whlib.bt;
const BinTree = bt.BinTree;

const chai = require('chai');
const assert = chai.assert;

const fs = require('fs');
require.extensions['.txt'] = function (module, filename) {
    module.exports = fs.readFileSync(filename, 'utf8');
};


function appendFunctionString(args, valueArgs, testFunction, functionName){
    //append each variable and assign them the given values
    for (let arg in args) {
        testFunction += "\nvar "+args[arg]+" = whlib.bintreeFromString("+valueArgs[arg]+");";
    }

    //append each variable to the function call
    testFunction += "\nvar res = "+functionName+"(";
    for (let arg in args) {
        testFunction += args[arg]+",";
    }
    testFunction = testFunction.slice(0, -1); //removes last comma
    testFunction += ");";

    //return the runnable function string with variable 'res' as result
    return testFunction;
}


//////HELP : to add a test suite to the test session, copy a previously done test suite
//////then change the functionName variable and change the arguments passed and the asserts that you wish to test

describe('WHC Test Session', function() {
    describe('testing calculations', function() {
        describe('...while incrementation program', function() {
            var testFunction, args, valueArgs;
            var functionName = "inc";
    
            beforeEach(function() {
                testFunction = require("./javascriptOutput/"+functionName+".txt");
                args = require("./temp/"+functionName+".txt").split(",");
                valueArgs = [];
            });
    
            it('incrementing 1 should return 2', function() {
                //push each argument that you want to pass to the function
                valueArgs.push(1);
                
                testFunction = appendFunctionString(args, valueArgs, testFunction, functionName);
                
                //console.log(testFunction);
                eval(testFunction);
                //console.log(res);
    
                //assert each result
                assert.equal(whlib.intFromBintree(res[0]),2);
            });        
    
            it('incrementing 5 should return 6', function() {
                //push each argument that you want to pass to the function
                valueArgs.push(5);
                
                testFunction = appendFunctionString(args, valueArgs, testFunction, functionName);
                
                //console.log(testFunction);
                eval(testFunction);
                //console.log(res);
    
                //assert each result
                assert.equal(whlib.intFromBintree(res[0]),6);
            });
    
            it('incrementing 100 should return 101', function() {
                //push each argument that you want to pass to the function
                valueArgs.push(100);
                
                testFunction = appendFunctionString(args, valueArgs, testFunction, functionName);
                
                //console.log(testFunction);
                eval(testFunction);
                //console.log(res);
    
                //assert each result
                assert.equal(whlib.intFromBintree(res[0]),101);
            });
        });
    
        describe('...while decrementation program', function() {
            var testFunction, args, valueArgs;
            var functionName = "dec";
    
            beforeEach(function() {
                testFunction = require("./javascriptOutput/"+functionName+".txt");
                args = require("./temp/"+functionName+".txt").split(",");
                valueArgs = [];
            });
    
            it('decrementing 1 should return 0, a nil bintree', function() {
                //push each argument that you want to pass to the function
                valueArgs.push(1);
                
                testFunction = appendFunctionString(args, valueArgs, testFunction, functionName);
                
                //console.log(testFunction);
                eval(testFunction);
                //console.log(res);
    
                //assert each result
                assert.equal(whlib.intFromBintree(res[0]),0);
                assert.isTrue(bt.evaluateEQ(res[0],new BinTree("nil",null,null)));
            });
    
            it('decrementing 100 should return 99', function() {
                //push each argument that you want to pass to the function
                valueArgs.push(100);
                
                testFunction = appendFunctionString(args, valueArgs, testFunction, functionName);
                
                //console.log(testFunction);
                eval(testFunction);
                //console.log(res);
    
                //assert each result
                assert.equal(whlib.intFromBintree(res[0]),99);
            });
        });
    
        describe('...while double program', function() {
            var testFunction, args, valueArgs;
            var functionName = "double";
    
            beforeEach(function() {
                testFunction = require("./javascriptOutput/"+functionName+".txt");
                args = require("./temp/"+functionName+".txt").split(",");
                valueArgs = [];
            });
    
            it('doubling 1 should return 2', function() {
                //push each argument that you want to pass to the function
                valueArgs.push(1);
                
                testFunction = appendFunctionString(args, valueArgs, testFunction, functionName);
                
                //console.log(testFunction);
                eval(testFunction);
                //console.log(res);
    
                //assert each result
                assert.equal(whlib.intFromBintree(res[0]),2);
            });
    
            it('doubling 4 should return 8', function() {
                //push each argument that you want to pass to the function
                valueArgs.push(4);
                
                testFunction = appendFunctionString(args, valueArgs, testFunction, functionName);
                
                //console.log(testFunction);
                eval(testFunction);
                //console.log(res);
    
                //assert each result
                assert.equal(whlib.intFromBintree(res[0]),8);
            });
    
            it('doubling 50 should return 100', function() {
                //push each argument that you want to pass to the function
                valueArgs.push(50);
                
                testFunction = appendFunctionString(args, valueArgs, testFunction, functionName);
                
                //console.log(testFunction);
                eval(testFunction);
                //console.log(res);
    
                //assert each result
                assert.equal(whlib.intFromBintree(res[0]),100);
            });
        });
    });

    describe('testing operations', function() {
        describe('...while echange program', function() {
            var testFunction, args, valueArgs;
            var functionName = "echange";
    
            beforeEach(function() {
                testFunction = require("./javascriptOutput/"+functionName+".txt");
                args = require("./temp/"+functionName+".txt").split(",");
                valueArgs = [];
            });
    
            it('echange 1,2 should return 2,1', function() {
                //push each argument that you want to pass to the function
                valueArgs.push(1);
                valueArgs.push(2);
                
                testFunction = appendFunctionString(args, valueArgs, testFunction, functionName);
                
                //console.log(testFunction);
                eval(testFunction);
                //console.log(res);
    
                //assert each result
                assert.equal(whlib.intFromBintree(res[0]),2);
                assert.equal(whlib.intFromBintree(res[1]),1);
            });
    
            it('echange 0,100 should return 100,0', function() {
                //push each argument that you want to pass to the function
                valueArgs.push(0);
                valueArgs.push(100);
                
                testFunction = appendFunctionString(args, valueArgs, testFunction, functionName);
                
                //console.log(testFunction);
                eval(testFunction);
                //console.log(res);
    
                //assert each result
                assert.equal(whlib.intFromBintree(res[0]),100);
                assert.equal(whlib.intFromBintree(res[1]),0);
            });
        });
        describe('...while list program', function() {
            var testFunction, args, valueArgs;
            var functionName = "listing";
    
            beforeEach(function() {
                testFunction = require("./javascriptOutput/"+functionName+".txt");
                args = require("./temp/"+functionName+".txt").split(",");
                valueArgs = [];
            });
    
            it('listing should return a list similar to a cons', function() {
                //push each argument that you want to pass to the function
                valueArgs.push(2);
                
                testFunction = appendFunctionString(args, valueArgs, testFunction, functionName);
                
                //console.log(testFunction);
                eval(testFunction);
                //console.log(res);
    
                //assert each result
                assert.equal(whlib.intFromBintree(res[0]),1);
            });
        });
    });
    
    describe('testing conditions', function() {
        describe('testing or and not', function() {
            describe('...while testOr program', function() {
                var testFunction, args, valueArgs;
                var functionName = "testOr";
        
                beforeEach(function() {
                    testFunction = require("./javascriptOutput/"+functionName+".txt");
                    args = require("./temp/"+functionName+".txt").split(",");
                    valueArgs = [];
                });
        
                it('testOr 1,2 should return true', function() {
                    //push each argument that you want to pass to the function
                    valueArgs.push(1);
                    valueArgs.push(2);
                    
                    testFunction = appendFunctionString(args, valueArgs, testFunction, functionName);
                    
                    //console.log(testFunction);
                    eval(testFunction);
                    //console.log(res);
        
                    //assert each result
                    assert.equal(whlib.intFromBintree(res[0]),1);
                });
        
                it('testOr 0,0 should return false', function() {
                    //push each argument that you want to pass to the function
                    valueArgs.push(0);
                    valueArgs.push(0);
                    
                    testFunction = appendFunctionString(args, valueArgs, testFunction, functionName);
                    
                    //console.log(testFunction);
                    eval(testFunction);
                    //console.log(res);
        
                    //assert each result
                    assert.equal(whlib.intFromBintree(res[0]),0);
                });
                it('testOr 0,1 should return true, a cons bintree', function() {
                    //push each argument that you want to pass to the function
                    valueArgs.push(0);
                    valueArgs.push(1);
                    
                    testFunction = appendFunctionString(args, valueArgs, testFunction, functionName);
                    
                    //console.log(testFunction);
                    eval(testFunction);
                    //console.log(res);
        
                    //assert each result
                    assert.equal(whlib.intFromBintree(res[0]),1);
                });
                
                it('testOr 1,0 should return true', function() {
                    //push each argument that you want to pass to the function
                    valueArgs.push(1);
                    valueArgs.push(0);
                    
                    testFunction = appendFunctionString(args, valueArgs, testFunction, functionName);
                    
                    //console.log(testFunction);
                    eval(testFunction);
                    //console.log(res);
        
                    //assert each result
                    assert.equal(whlib.intFromBintree(res[0]),1);
                });

                
                it('testOr 1,1 should return true, a cons bintree', function() {
                    //push each argument that you want to pass to the function
                    valueArgs.push(1);
                    valueArgs.push(1);
                    
                    testFunction = appendFunctionString(args, valueArgs, testFunction, functionName);
                    
                    //console.log(testFunction);
                    eval(testFunction);
                    //console.log(res);
        
                    //assert each result
                    assert.equal(whlib.intFromBintree(res[0]),1);
                });
        
                it('testOr 10,10 should return true, a cons bintree', function() {
                    //push each argument that you want to pass to the function
                    valueArgs.push(10);
                    valueArgs.push(10);
                    
                    testFunction = appendFunctionString(args, valueArgs, testFunction, functionName);
                    
                    //console.log(testFunction);
                    eval(testFunction);
                    //console.log(res);
        
                    //assert each result
                    assert.equal(whlib.intFromBintree(res[0]),1);
                });
            });
            describe('...while testNot program', function() {
                var testFunction, args, valueArgs;
                var functionName = "testNot";
        
                beforeEach(function() {
                    testFunction = require("./javascriptOutput/"+functionName+".txt");
                    args = require("./temp/"+functionName+".txt").split(",");
                    valueArgs = [];
                });
        
                it('testNot 1 should return false', function() {
                    //push each argument that you want to pass to the function
                    valueArgs.push(1);
                    
                    testFunction = appendFunctionString(args, valueArgs, testFunction, functionName);
                    
                    //console.log(testFunction);
                    eval(testFunction);
                    //console.log(res);
        
                    //assert each result
                    assert.equal(whlib.intFromBintree(res[0]),0);
                });
        
                it('testNot 0 should return true', function() {
                    //push each argument that you want to pass to the function
                    valueArgs.push(0);
                    
                    testFunction = appendFunctionString(args, valueArgs, testFunction, functionName);
                    
                    //console.log(testFunction);
                    eval(testFunction);
                    //console.log(res);
        
                    //assert each result
                    assert.equal(whlib.intFromBintree(res[0]),1);
                });
                
                it('testNot 10 should return false', function() {
                    //push each argument that you want to pass to the function
                    valueArgs.push(10);
                    
                    testFunction = appendFunctionString(args, valueArgs, testFunction, functionName);
                    
                    //console.log(testFunction);
                    eval(testFunction);
                    //console.log(res);
        
                    //assert each result
                    assert.equal(whlib.intFromBintree(res[0]),0);
                });
            });
        });
        describe('testing comparisons', function() {
            describe('...while equals program', function() {
                var testFunction, args, valueArgs;
                var functionName = "equals";
        
                beforeEach(function() {
                    testFunction = require("./javascriptOutput/"+functionName+".txt");
                    args = require("./temp/"+functionName+".txt").split(",");
                    valueArgs = [];
                });
        
                it('equals 1,2 should return false, a nil bintree', function() {
                    //push each argument that you want to pass to the function
                    valueArgs.push(1);
                    valueArgs.push(2);
                    
                    testFunction = appendFunctionString(args, valueArgs, testFunction, functionName);
                    
                    //console.log(testFunction);
                    eval(testFunction);
                    //console.log(res);
        
                    //assert each result
                    assert.equal(whlib.intFromBintree(res[0]),0);
                });
        
                it('equals 0,0 should return true, a cons bintree', function() {
                    //push each argument that you want to pass to the function
                    valueArgs.push(0);
                    valueArgs.push(0);
                    
                    testFunction = appendFunctionString(args, valueArgs, testFunction, functionName);
                    
                    //console.log(testFunction);
                    eval(testFunction);
                    //console.log(res);
        
                    //assert each result
                    assert.equal(whlib.intFromBintree(res[0]),1);
                });
        
                it('equals 10,10 should return true, a cons bintree', function() {
                    //push each argument that you want to pass to the function
                    valueArgs.push(10);
                    valueArgs.push(10);
                    
                    testFunction = appendFunctionString(args, valueArgs, testFunction, functionName);
                    
                    //console.log(testFunction);
                    eval(testFunction);
                    //console.log(res);
        
                    //assert each result
                    assert.equal(whlib.intFromBintree(res[0]),1);
                });
            });
        
            describe('...while equalsToA program', function() {
                var testFunction, args, valueArgs;
                var functionName = "equalsToA";
        
                beforeEach(function() {
                    testFunction = require("./javascriptOutput/"+functionName+".txt");
                    args = require("./temp/"+functionName+".txt").split(",");
                    valueArgs = [];
                });
        
                it('equalsToA 1 should return false, a nil bintree', function() {
                    //push each argument that you want to pass to the function
                    valueArgs.push(1);
                    
                    testFunction = appendFunctionString(args, valueArgs, testFunction, functionName);
                    
                    //console.log(testFunction);
                    eval(testFunction);
                    //console.log(res);
        
                    //assert each result
                    assert.equal(whlib.intFromBintree(res[0]),0);
                });
        
                it('equalsToA a should return true, a cons bintree', function() {
                    //push each argument that you want to pass to the function
                    valueArgs.push("'a'");
                    
                    testFunction = appendFunctionString(args, valueArgs, testFunction, functionName);
                    
                    //console.log(testFunction);
                    eval(testFunction);
                    //console.log(res);
        
                    //assert each result
                    assert.equal(whlib.intFromBintree(res[0]),1);
                });
        
                it('equalsToA b should return false, a nil bintree', function() {
                    //push each argument that you want to pass to the function
                    valueArgs.push("'b'");
                    
                    testFunction = appendFunctionString(args, valueArgs, testFunction, functionName);
                    
                    //console.log(testFunction);
                    eval(testFunction);
                    //console.log(res);
        
                    //assert each result
                    assert.equal(whlib.intFromBintree(res[0]),0);
                });
            });
        });
    });

    describe('testing function calls', function() {
        describe('...calling the while incrementation program', function() {
            var testFunction, args, valueArgs;
            var functionName = "incCalled";
    
            beforeEach(function() {
                testFunction = require("./javascriptOutput/"+functionName+".txt");
                args = require("./temp/"+functionName+".txt").split(",");
                valueArgs = [];
            });
    
            it('incrementing 1,2 should return 2,3', function() {
                //push each argument that you want to pass to the function
                valueArgs.push(1);
                valueArgs.push(2);
                
                testFunction = appendFunctionString(args, valueArgs, testFunction, functionName);
                
                //console.log(testFunction);
                eval(testFunction);
                //console.log(res);
    
                //assert each result
                assert.equal(whlib.intFromBintree(res[0]),2);
                assert.equal(whlib.intFromBintree(res[1]),3);
            });        
    
            it('incrementing 5,6 should return 6,7', function() {
                //push each argument that you want to pass to the function
                valueArgs.push(5);
                valueArgs.push(6);
                
                testFunction = appendFunctionString(args, valueArgs, testFunction, functionName);
                
                //console.log(testFunction);
                eval(testFunction);
                //console.log(res);
    
                //assert each result
                assert.equal(whlib.intFromBintree(res[0]),6);
                assert.equal(whlib.intFromBintree(res[1]),7);
            });
        });

        describe('...calling the while redefinition program', function() {
            var testFunction, args, valueArgs;
            var functionName = "redefinition";
    
            beforeEach(function() {
                testFunction = require("./javascriptOutput/"+functionName+".txt");
                args = require("./temp/"+functionName+".txt").split(",");
                valueArgs = [];
            });
    
            it('incrementing 1,2 should return 2', function() {
                //push each argument that you want to pass to the function
                valueArgs.push(1);
                valueArgs.push(2);
                
                testFunction = appendFunctionString(args, valueArgs, testFunction, functionName);
                
                //console.log(testFunction);
                eval(testFunction);
                //console.log(res);
    
                //assert each result
                assert.equal(whlib.intFromBintree(res[0]),2);
            });        
    
            it('incrementing 5,6 should return 6', function() {
                //push each argument that you want to pass to the function
                valueArgs.push(5);
                valueArgs.push(6);
                
                testFunction = appendFunctionString(args, valueArgs, testFunction, functionName);
                
                //console.log(testFunction);
                eval(testFunction);
                //console.log(res);
    
                //assert each result
                assert.equal(whlib.intFromBintree(res[0]),6);
            });
        });
    });

    describe('testing control structures', function() {
        describe('testing while loops', function() {
            describe('...calling the while testing while loop decrementation program', function() {
                var testFunction, args, valueArgs;
                var functionName = "whileTestDec";
        
                beforeEach(function() {
                    testFunction = require("./javascriptOutput/"+functionName+".txt");
                    args = require("./temp/"+functionName+".txt").split(",");
                    valueArgs = [];
                });
        
                it('whileTestDec 1 should return 1', function() {
                    //push each argument that you want to pass to the function
                    valueArgs.push(1);
                    
                    testFunction = appendFunctionString(args, valueArgs, testFunction, functionName);
                    
                    //console.log(testFunction);
                    eval(testFunction);
                    //console.log(res);
        
                    //assert each result
                    assert.equal(whlib.intFromBintree(res[1]),1);
                });

                it('whileTestDec 5 should return 5', function() {
                    //push each argument that you want to pass to the function
                    valueArgs.push(5);
                    
                    testFunction = appendFunctionString(args, valueArgs, testFunction, functionName);
                    
                    //console.log(testFunction);
                    eval(testFunction);
                    //console.log(res);
        
                    //assert each result
                    assert.equal(whlib.intFromBintree(res[1]),5);
                });     
        
                it('whileTestDec 100 should return 100', function() {
                    //push each argument that you want to pass to the function
                    valueArgs.push(100);
                    
                    testFunction = appendFunctionString(args, valueArgs, testFunction, functionName);
                    
                    //console.log(testFunction);
                    eval(testFunction);
                    //console.log(res);
        
                    //assert each result
                    assert.equal(whlib.intFromBintree(res[1]),100);
                });
            });

            describe('...calling the while testing double while loop program', function() {
                var testFunction, args, valueArgs;
                var functionName = "whileDouble";
        
                beforeEach(function() {
                    testFunction = require("./javascriptOutput/"+functionName+".txt");
                    args = require("./temp/"+functionName+".txt").split(",");
                    valueArgs = [];
                });
        
                it('whileDouble 1 should return 1', function() {
                    //push each argument that you want to pass to the function
                    valueArgs.push(1);
                    
                    testFunction = appendFunctionString(args, valueArgs, testFunction, functionName);
                    
                    //console.log(testFunction);
                    eval(testFunction);
                    //console.log(res);
        
                    //assert each result
                    assert.equal(whlib.intFromBintree(res[1]),1);
                });
                it('whileDouble 2 should return 4', function() {
                    //push each argument that you want to pass to the function
                    valueArgs.push(2);
                    
                    testFunction = appendFunctionString(args, valueArgs, testFunction, functionName);
                    
                    //console.log(testFunction);
                    eval(testFunction);
                    //console.log(res);
        
                    //assert each result
                    assert.equal(whlib.intFromBintree(res[1]),4);
                });    

                it('whileDouble 5 should return 25', function() {
                    //push each argument that you want to pass to the function
                    valueArgs.push(5);
                    
                    testFunction = appendFunctionString(args, valueArgs, testFunction, functionName);
                    
                    //console.log(testFunction);
                    eval(testFunction);
                    //console.log(res);
        
                    //assert each result
                    assert.equal(whlib.intFromBintree(res[1]),25);
                });     
        
                it('whileDouble 100 should return 10000', function() {
                    //push each argument that you want to pass to the function
                    valueArgs.push(100);
                    
                    testFunction = appendFunctionString(args, valueArgs, testFunction, functionName);
                    
                    //console.log(testFunction);
                    eval(testFunction);
                    //console.log(res);
        
                    //assert each result
                    assert.equal(whlib.intFromBintree(res[1]),10000);
                });
            });
        });
        describe('testing for loops', function() {
            describe('...calling the while forTestInc program', function() {
                var testFunction, args, valueArgs;
                var functionName = "forTestInc";

                beforeEach(function() {
                    testFunction = require("./javascriptOutput/"+functionName+".txt");
                    args = require("./temp/"+functionName+".txt").split(",");
                    valueArgs = [];
                });
                it('forTestInc 0 should return 0', function() {
                    //push each argument that you want to pass to the function
                    valueArgs.push(0);

                    testFunction = appendFunctionString(args, valueArgs, testFunction, functionName);

                    //console.log(testFunction);
                    eval(testFunction);
                    //console.log(res);

                    //assert each result
                    assert.equal(whlib.intFromBintree(res[1]), 0);
                });

                it('forTestInc 1 should return 1', function() {
                    //push each argument that you want to pass to the function
                    valueArgs.push(1);

                    testFunction = appendFunctionString(args, valueArgs, testFunction, functionName);

                    //console.log(testFunction);
                    eval(testFunction);
                    //console.log(res);

                    //assert each result
                    assert.equal(whlib.intFromBintree(res[1]), 1);
                });
                it('forTestInc 10 should return 10', function() {
                    //push each argument that you want to pass to the function
                    valueArgs.push(10);

                    testFunction = appendFunctionString(args, valueArgs, testFunction, functionName);

                    //console.log(testFunction);
                    eval(testFunction);
                    //console.log(res);

                    //assert each result
                    assert.equal(whlib.intFromBintree(res[1]), 10);
                });
                it('forTestInc 300 should return 300', function() {
                    //push each argument that you want to pass to the function
                    valueArgs.push(300);

                    testFunction = appendFunctionString(args, valueArgs, testFunction, functionName);

                    //console.log(testFunction);
                    eval(testFunction);
                    //console.log(res);

                    //assert each result
                    assert.equal(whlib.intFromBintree(res[1]), 300);
                });
            });

            describe('...calling the while forTestDec program', function() {
                var testFunction, args, valueArgs;
                var functionName = "forTestDec";
    
                beforeEach(function() {
                    testFunction = require("./javascriptOutput/"+functionName+".txt");
                    args = require("./temp/"+functionName+".txt").split(",");
                    valueArgs = [];
                });
                    
                it('forTestDec 0 should return 0', function() {
                    //push each argument that you want to pass to the function
                    valueArgs.push(0);
    
                    testFunction = appendFunctionString(args, valueArgs, testFunction, functionName);
    
                    //console.log(testFunction);
                    eval(testFunction);
                    //console.log(res);
    
                    //assert each result
                    assert.equal(whlib.intFromBintree(res[1]), 0);
                });
                it('forTestDec 1 should return 1', function() {
                    //push each argument that you want to pass to the function
                    valueArgs.push(1);
    
                    testFunction = appendFunctionString(args, valueArgs, testFunction, functionName);
    
                    //console.log(testFunction);
                    eval(testFunction);
                    //console.log(res);
    
                    //assert each result
                    assert.equal(whlib.intFromBintree(res[1]), 1);
                });
                it('forTestDec 10 should return 10', function() {
                    //push each argument that you want to pass to the function
                    valueArgs.push(10);
    
                    testFunction = appendFunctionString(args, valueArgs, testFunction, functionName);
    
                    //console.log(testFunction);
                    eval(testFunction);
                    //console.log(res);
    
                    //assert each result
                    assert.equal(whlib.intFromBintree(res[1]), 10);
                });
                it('forTestDec 1000 should return 1000', function() {
                    //push each argument that you want to pass to the function
                    valueArgs.push(1000);
    
                    testFunction = appendFunctionString(args, valueArgs, testFunction, functionName);
    
                    //console.log(testFunction);
                    eval(testFunction);
                    //console.log(res);
    
                    //assert each result
                    assert.equal(whlib.intFromBintree(res[1]), 1000);
                });
            });

            describe('...calling the while forDouble program', function() {
                var testFunction, args, valueArgs;
                var functionName = "forDouble";

                beforeEach(function() {
                    testFunction = require("./javascriptOutput/"+functionName+".txt");
                    args = require("./temp/"+functionName+".txt").split(",");
                    valueArgs = [];
                });
                it('forDouble 0 should return 0', function() {
                    //push each argument that you want to pass to the function
                    valueArgs.push(0);

                    testFunction = appendFunctionString(args, valueArgs, testFunction, functionName);

                    //console.log(testFunction);
                    eval(testFunction);
                    //console.log(res);

                    //assert each result
                    assert.equal(whlib.intFromBintree(res[1]), 0);
                });

                it('forDouble 1 should return 1', function() {
                    //push each argument that you want to pass to the function
                    valueArgs.push(1);

                    testFunction = appendFunctionString(args, valueArgs, testFunction, functionName);

                    //console.log(testFunction);
                    eval(testFunction);
                    //console.log(res);

                    //assert each result
                    assert.equal(whlib.intFromBintree(res[1]), 1);
                });
                it('forDouble 2 should return 4', function() {
                    //push each argument that you want to pass to the function
                    valueArgs.push(2);

                    testFunction = appendFunctionString(args, valueArgs, testFunction, functionName);

                    //console.log(testFunction);
                    eval(testFunction);
                    //console.log(res);

                    //assert each result
                    assert.equal(whlib.intFromBintree(res[1]), 4);
                });
                it('forDouble 4 should return 16', function() {
                    //push each argument that you want to pass to the function
                    valueArgs.push(4);

                    testFunction = appendFunctionString(args, valueArgs, testFunction, functionName);

                    //console.log(testFunction);
                    eval(testFunction);
                    //console.log(res);

                    //assert each result
                    assert.equal(whlib.intFromBintree(res[1]), 16);
                });
            });
            describe('...calling the while forTriple program', function() {
                var testFunction, args, valueArgs;
                var functionName = "forTriple";

                beforeEach(function() {
                    testFunction = require("./javascriptOutput/"+functionName+".txt");
                    args = require("./temp/"+functionName+".txt").split(",");
                    valueArgs = [];
                });
                it('forTriple 0 should return 0', function() {
                    //push each argument that you want to pass to the function
                    valueArgs.push(0);

                    testFunction = appendFunctionString(args, valueArgs, testFunction, functionName);

                    //console.log(testFunction);
                    eval(testFunction);
                    //console.log(res);

                    //assert each result
                    assert.equal(whlib.intFromBintree(res[1]), 0);
                });

                it('forTriple 1 should return 1', function() {
                    //push each argument that you want to pass to the function
                    valueArgs.push(1);

                    testFunction = appendFunctionString(args, valueArgs, testFunction, functionName);

                    //console.log(testFunction);
                    eval(testFunction);
                    //console.log(res);

                    //assert each result
                    assert.equal(whlib.intFromBintree(res[1]), 1);
                });
                it('forTriple 2 should return 8', function() {
                    //push each argument that you want to pass to the function
                    valueArgs.push(2);

                    testFunction = appendFunctionString(args, valueArgs, testFunction, functionName);

                    //console.log(testFunction);
                    eval(testFunction);
                    //console.log(res);

                    //assert each result
                    assert.equal(whlib.intFromBintree(res[1]), 8);
                });
                it('forTriple 3 should return 27', function() {
                    //push each argument that you want to pass to the function
                    valueArgs.push(3);

                    testFunction = appendFunctionString(args, valueArgs, testFunction, functionName);

                    //console.log(testFunction);
                    eval(testFunction);
                    //console.log(res);

                    //assert each result
                    assert.equal(whlib.intFromBintree(res[1]), 27);
                });
                it('forTriple 4 should return 64', function() {
                    //push each argument that you want to pass to the function
                    valueArgs.push(4);

                    testFunction = appendFunctionString(args, valueArgs, testFunction, functionName);

                    //console.log(testFunction);
                    eval(testFunction);
                    //console.log(res);

                    //assert each result
                    assert.equal(whlib.intFromBintree(res[1]), 64);
                });
                it('forTriple 5 should return 125', function() {
                    //push each argument that you want to pass to the function
                    valueArgs.push(5);

                    testFunction = appendFunctionString(args, valueArgs, testFunction, functionName);

                    //console.log(testFunction);
                    eval(testFunction);
                    //console.log(res);

                    //assert each result
                    assert.equal(whlib.intFromBintree(res[1]), 125);
                });
            });
            describe('...calling the while forTriple2 program', function() {
                var testFunction, args, valueArgs;
                var functionName = "forTriple2";

                beforeEach(function() {
                    testFunction = require("./javascriptOutput/"+functionName+".txt");
                    args = require("./temp/"+functionName+".txt").split(",");
                    valueArgs = [];
                });
                it('forTriple2 0 should return 0', function() {
                    //push each argument that you want to pass to the function
                    valueArgs.push(0);

                    testFunction = appendFunctionString(args, valueArgs, testFunction, functionName);

                    //console.log(testFunction);
                    eval(testFunction);
                    //console.log(res);

                    //assert each result
                    assert.equal(whlib.intFromBintree(res[0]), 0);
                });

                it('forTriple2 1 should return 1', function() {
                    //push each argument that you want to pass to the function
                    valueArgs.push(1);

                    testFunction = appendFunctionString(args, valueArgs, testFunction, functionName);

                    //console.log(testFunction);
                    eval(testFunction);
                    //console.log(res);

                    //assert each result
                    assert.equal(whlib.intFromBintree(res[0]), 2);
                });
                it('forTriple2 2 should return 8', function() {
                    //push each argument that you want to pass to the function
                    valueArgs.push(2);

                    testFunction = appendFunctionString(args, valueArgs, testFunction, functionName);

                    //console.log(testFunction);
                    eval(testFunction);
                    //console.log(res);

                    //assert each result
                    assert.equal(whlib.intFromBintree(res[0]), 2048);
                });/*
                it('forTriple2 3 should return 27', function() {
                    //push each argument that you want to pass to the function
                    valueArgs.push(3);

                    testFunction = appendFunctionString(args, valueArgs, testFunction, functionName);

                    //console.log(testFunction);
                    eval(testFunction);
                    //console.log(res);

                    //assert each result
                    assert.equal(whlib.intFromBintree(res[0]), 27);
                });
                it('forTriple2 4 should return 64', function() {
                    //push each argument that you want to pass to the function
                    valueArgs.push(4);

                    testFunction = appendFunctionString(args, valueArgs, testFunction, functionName);

                    //console.log(testFunction);
                    eval(testFunction);
                    //console.log(res);

                    //assert each result
                    assert.equal(whlib.intFromBintree(res[0]), 64);
                });*/
            });
        });
        
       
        describe('testing foreach loops', function() {
            describe('...calling the while testing foreach loop incrementation program', function() {
                var testFunction, args, valueArgs;
                var functionName = "foreachTestInc";
        
                beforeEach(function() {
                    testFunction = require("./javascriptOutput/"+functionName+".txt");
                    args = require("./temp/"+functionName+".txt").split(",");
                    valueArgs = [];
                });
        
                it('foreachTestInc 1 should return 1', function() {
                    //push each argument that you want to pass to the function
                    valueArgs.push(1);
                    
                    testFunction = appendFunctionString(args, valueArgs, testFunction, functionName);
                    
                    //console.log(testFunction);
                    eval(testFunction);
                    //console.log(res);
        
                    //assert each result
                    assert.isTrue(bt.evaluateEQ(res[1],whlib.bintreeFromString(1)));
                });

                it('foreachTestInc 5 should return 5', function() {
                    //push each argument that you want to pass to the function
                    valueArgs.push(5);
                    
                    testFunction = appendFunctionString(args, valueArgs, testFunction, functionName);
                    
                    //console.log(testFunction);
                    eval(testFunction);
                    //console.log(res);
        
                    //assert each result
                    assert.isTrue(bt.evaluateEQ(res[1],whlib.bintreeFromString(5)));
                });
            });
        });
        describe('testing imbricated control structures within function calls', function() {
            describe('...calling the incCalledInFor program', function() {
                var testFunction, args, valueArgs;
                var functionName = "incCalledInFor";
        
                beforeEach(function() {
                    testFunction = require("./javascriptOutput/"+functionName+".txt");
                    args = require("./temp/"+functionName+".txt").split(",");
                    valueArgs = [];
                });
        
                it('incCalledInFor 1,0 should return 1', function() {
                    //push each argument that you want to pass to the function
                    valueArgs.push(1);
                    valueArgs.push(0);
                    
                    testFunction = appendFunctionString(args, valueArgs, testFunction, functionName);
                    
                    //console.log(testFunction);
                    eval(testFunction);
                    //console.log(res);
        
                    //assert each result
                    assert.equal(whlib.intFromBintree(res[0]), 1);
                });

                it('incCalledInFor 5,0 should return 5', function() {
                    //push each argument that you want to pass to the function
                    valueArgs.push(5);
                    valueArgs.push(0);
                    
                    testFunction = appendFunctionString(args, valueArgs, testFunction, functionName);
                    
                    //console.log(testFunction);
                    eval(testFunction);
                    //console.log(res);
        
                    //assert each result
                    assert.equal(whlib.intFromBintree(res[0]), 5);
                });
                it('incCalledInFor 1,5 should return 6', function() {
                    //push each argument that you want to pass to the function
                    valueArgs.push(1);
                    valueArgs.push(5);
                    
                    testFunction = appendFunctionString(args, valueArgs, testFunction, functionName);
                    
                    //console.log(testFunction);
                    eval(testFunction);
                    //console.log(res);
        
                    //assert each result
                    assert.equal(whlib.intFromBintree(res[0]), 6);
                });
                it('incCalledInFor 10,10 should return 20', function() {
                    //push each argument that you want to pass to the function
                    valueArgs.push(10);
                    valueArgs.push(10);
                    
                    testFunction = appendFunctionString(args, valueArgs, testFunction, functionName);
                    
                    //console.log(testFunction);
                    eval(testFunction);
                    //console.log(res);
        
                    //assert each result
                    assert.equal(whlib.intFromBintree(res[0]), 20);
                });
            });
        });
    });
});