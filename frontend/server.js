var express = require('express');
var app = express();

app.get('/*', function (req, res) {
    res.sendFile('./app/index.html', {root: __dirname});
});

app.listen(process.env.PORT || 3000);