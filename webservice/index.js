var express = require('express');
var request = require('request');

var app = express();

var port = process.env.PORT || 3000;

app.get('/', function(req, res) {
  res.send('I\'m the middleman!');
});

app.get('/protobuf', function(req, res) {
  request.get('http://localhost:8080/protobuf', function(error, response, body) {
    if (error) {
      console.log(error);
      res.send(error);
    } else {
      res.send(body);
    }
  });
});

app.listen(port, function() {
  console.log('Running on port: ' + port);
});

