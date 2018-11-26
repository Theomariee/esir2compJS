const express = require('express');
const router = express.Router();

/*router.get('/', (req, res) => {
  res.send('It works!');
});*/

router.get('/', (req, res) => {
	res.render('index');
});


router.post('/test', (req, res) => {
	console.log('Executing jar');
	var exec = require('child_process').exec;
	exec('java -jar testjar.jar', function (error, stdout, stderr){
		console.log('Sending jar output to client');
		res.json({'data': stdout})
		if(error !== null){
			console.log("Error -> "+error);
			res.json({'data': error})
		}
	});
});

module.exports = router;

