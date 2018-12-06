const express = require('express');
const path = require('path')
const bodyParser = require('body-parser');
const routes = require('./routes/index');

const app = express();

app.set('views', path.join(__dirname, 'views'));
app.set('view engine', 'pug');

app.use(bodyParser.urlencoded({ extended: true }));
app.use('/', routes);

app.use(express.static(path.join(__dirname, 'public')));	// gives access to 'public' folder for static resources (WhLib, etc)

module.exports = app;