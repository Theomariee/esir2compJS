const express = require('express');
const path = require('path')
const bodyParser = require('body-parser');
const routes = require('./routes/index');

var appDir = path.dirname(require.main.filename);
console.log(appDir);

const app = express();

app.set('views', path.join(__dirname, 'views'));
app.set('view engine', 'pug');

app.use(bodyParser.urlencoded({ extended: true }));
app.use('/', routes);

module.exports = app;