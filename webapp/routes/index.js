const express = require('express');
const router = express.Router();
const fs = require('fs');
var exec = require('child_process').exec;

router.get('/', (req, res) => {
	res.render('index');
});

router.post('/compile', (req, res) => {
	var whilePrgm = req.body.whilePrgm;
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
	
	exec('java -jar ../livrables/whc1/whc.jar temp/input.wh -o temp/compiled.js', function (error, stdout, stderr){
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

router.get('/output', (req, res) => {
	if (fs.existsSync('temp/compiled.js')) {
		fs.readFile("temp/compiled.js", 'utf-8', function (err, data) {
		    if (err) throw err;
		    console.log('Sending JS output to client');
		    res.json({'compiledJS': data});
		});
	}else{
		var error = 'temp/compiled.js not found';
		res.json({'compiledJS': error});
	}
});

module.exports = router;

