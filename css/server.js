const express = require('express');
const app = express();
const mongoose = require('mongoose')
const bodyParser = require('body-parser');

app.use(express.urlencoded({ extended: false }))

mongoose.connect("mongodb+srv://group4:s0ftwar3@bankdata.tomj87l.mongodb.net/?retryWrites=true&w=majority", { useNewUrlParser: true, useUnifiedTopology: true }, connected());


function connected() {
    console.log('Connected to DB');
}

app.get('/', function (req, res) {
    res.sendFile(__dirname + "/views/login.html")
})


app.listen(1337)

