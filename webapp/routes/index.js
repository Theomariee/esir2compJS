const express = require('express');
const router = express.Router();
const fs = require('fs');
var exec = require('child_process').exec;

// render la page
router.get('/', (req, res) => {
	res.render('index');
	if (fs.existsSync('temp/main.txt')) {
		fs.readFile("temp/main.txt", 'utf-8', function (err, data) {
		    if (err) throw err;
		    var test = data.split(',').length;
		    console.log(test);
		});
	}
});

//appelé en ajax, exécute le jar et affiche renvoie ses sorties standard et erreur pour afficher dans la "console" 
router.post('/compile', (req, res) => {
	var whilePrgm = req.body.whilePrgm;
	var debugMode = req.body.debugMode;
	debugMode = (debugMode == 'true');
	var debugOption = "";
	
	fs.writeFile("temp/input.wh", whilePrgm, function(err) {
	    if(err) {
	        return console.log(err);
	    }
	    console.log("WHILE program saved!");
	});

	// delete compiled.js if it exists
	if (fs.existsSync('temp/compiled.js')) {
    	fs.unlinkSync('temp/compiled.js'); 
	}
	
	if(debugMode) {
	    debugOption = " -a";
	}
	
	exec('java -jar ../livrables/whc1/whc.jar temp/input.wh -o temp/compiled.js' + debugOption, function (error, stdout, stderr){
		console.log('Sending jar file output to client');	
		console.log(stdout);
		console.log(stderr);
		res.json({'jarPrints': stdout + stderr});
		if(error !== null){
			console.log("Error -> "+error);
			res.json({'data': error})
		}
	});
});

// appelé en ajax si la requête /compile est successful (cad le fichier compiled.js a dû être généré)
router.get('/output', (req, res) => {
	if (fs.existsSync('temp/compiled.js')) {
		fs.readFile("temp/compiled.js", 'utf-8', function (err, data) {
		    if (err) {
		    	throw err;
		    }else{
			    console.log('Sending JS output to client');
			    res.json({'compiledJS': data});		    	
		    }
		});
	}else{
		var error = 'temp/compiled.js not found';
		res.json({'compiledJS': error});
	}
});

// récupère le nombre de paramètres via le fichier txt généré par le jar
router.get('/parameters', (req, res) => {
	if (fs.existsSync('temp/main.txt')) {
		fs.readFile('temp/main.txt', 'utf-8', function (err, data) {
		    if (err) {
		    	throw err;
		    }else{
		    	// on suppose que le .txt est la forme X,Y,....
				var params = data.split(',');
				res.json({'params': params});
		    }
		});
	}else{
		var error = 'temp/main.txt not found';
		res.json({'error': error});
	}
});



module.exports = router;

