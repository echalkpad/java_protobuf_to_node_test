var express = require('express');
var request = require('request');
var protoBuf = require("protobufjs");

var builder = protoBuf.loadProtoFile('../src/main/resources/instrument.proto');

var app = express();

var port = process.env.PORT || 3000;

app.get('/protobuf', function(req, res) {
  request.get('http://localhost:8080/protobuf', function(error, response, body) {
    if (error) {
      console.log(error);
      res.send(error);
    } else {
      var bytemsg = JSON.parse(body).bytes;
      var Instrument = builder.build('instrument');
      var translated = Instrument.Instrument.decode(bytemsg);
      res.send({
        original: bytemsg,
        translated: translated
      });
    }
  });
});

app.listen(port, function() {
  console.log('Running on port: ' + port);
});

