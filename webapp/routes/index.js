const express = require('express');
const router = express.Router();
const fs = require('fs');
var exec = require('child_process').exec;

router.get('/', (req, res) => {
	res.render('index');
});

router.post('/compile', (req, res) => {
	var whilePrgm = req.body.whilePrgm;
	fs.writeFile("input.wh", whilePrgm, function(err) {
	    if(err) {
	        return console.log(err);
	    }
	    console.log("WHILE program saved!");
	});

	// delete compiled.js if it exists
	if (fs.existsSync('compiled.js')) {
    	fs.unlinkSync('compiled.js'); 
	}
	
	console.log('Executing jar');
	exec('java -jar ../livrables/whc1/whc.jar input.wh -o compiled.js', function (error, stdout, stderr){
		console.log('Sending jar file output to client');	
		console.log(stdout);
		res.json({'jarPrints': stdout});
		if(error !== null){
			console.log("Error -> "+error);
			res.json({'data': error})
		}
	});
});

router.get('/output', (req, res) => {
	fs.readFile("compiled.js", 'utf-8', function (err, data) {
	    if (err) throw err;
	    console.log('Sending JS output to client');
	    res.json({'compiledJS': data});
	});
});

module.exports = router;

