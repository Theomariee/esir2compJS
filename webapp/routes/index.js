const express = require('express');
const router = express.Router();
const fs = require('fs');

/*router.get('/', (req, res) => {
  res.send('It works!');
});*/

router.get('/', (req, res) => {
	res.render('index');
	var path = require('path');
	var appDir = path.dirname(require.main.filename);
});


router.post('/test', (req, res) => {
	var whilePrgm = req.body.whilePrgm;
	fs.writeFile("input.wh", whilePrgm, function(err) {
	    if(err) {
	        return console.log(err);
	    }
	    console.log("WHILE program saved!");
	});

	console.log('Executing jar');
	var exec = require('child_process').exec;
	exec('java -jar ../livrables/whc1/whc.jar input.wh', function (error, stdout, stderr){
		console.log('Sending jar file output to client');	
		console.log(stdout);
		res.json({'data': stdout});
		if(error !== null){
			console.log("Error -> "+error);
			res.json({'data': error})
		}
	});
});

module.exports = router;

