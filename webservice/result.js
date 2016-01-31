var React = require('react');

var parseResult = function(result) {
  if (result !== '') {
    var jsonResult = JSON.parse(result);
    return {
      original: jsonResult.original,
      translated: JSON.stringify(jsonResult.translated)
    }
  }
  else  {
    return {
      original: '',
      translated: ''
    }
  }

  JSON.parse(result);
  console.log(result);
};

var Result = React.createClass({

  render: function() {
    return(
        <div className="container-fluid">
          <p>Original: {parseResult(this.props.data).original}</p>
          <p>Translated: {parseResult(this.props.data).translated}</p>
        </div>
    );
  }
});

module.exports = Result;