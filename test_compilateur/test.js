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
    describe('testing the semantics for the while incrementation program', function() {
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

        it('incrementing a simple bintree should return 2', function() {
            //push each argument that you want to pass to the function
            valueArgs.push(1); //TODO AFTER MARLON CHANGED THE BINTREE : "(cons nil)"
            
            testFunction = appendFunctionString(args, valueArgs, testFunction, functionName);
            
            //console.log(testFunction);
            eval(testFunction);
            //console.log(res);

            //assert each result
            assert.equal(whlib.intFromBintree(res[0]),2);
        });
    });

    describe('testing the semantics for the while decrementation program', function() {
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
            console.log(res);

            //assert each result
            assert.equal(whlib.intFromBintree(res[0]),0);
            assert.isTrue(bt.evaluateEQ(res[0],new BinTree("nil",null,null)));
        });
    });

});