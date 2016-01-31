var React = require('react');
var $ = require('jquery');
var request = require('request');
var Result = require('./result');

var App = React.createClass({

  getInitialState: function()
  {
    return ({
      data: ''
    });
  },

  retrieve: function(event) {
    var _this = this;
    request.get('http://localhost:8000/protobuf', function(error, response, body) {
      _this.setState({data: body});
    }.bind(this));
  },

  render: function() {
    return(
      <div>
        <div className="jumbotron container-fluid">
          <h3 style={{color:'#F88017'}}>Java Protobuf Server -&gt; Node -&gt; Browser Test</h3>
          <p>Clicking the button below will send a GET to Node. <br/>
             Node will forward the GET to a Java web server, which <br/>
             will respond with a protobuf byte array containing <br/>
             stock information (one of four companies). The Node <br/>
             server will translate this to JSON, and return it <br/>
             to the browser.</p>
          <a  href="#" className="btn btn-primary btn-lg" onClick={this.retrieve}>
            Retrieve
          </a>
        </div>
        <Result data={this.state.data}/>
      </div>
    );
  }
});

React.render(<App />, document.getElementById('app'));