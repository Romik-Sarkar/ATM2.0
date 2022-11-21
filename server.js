const express = require('express');
const app = express();
const mongoose = require('mongoose')
const bodyParser = require('body-parser');

app.use(express.urlencoded({ extended: false }))

mongoose.connect("mongodb+srv://real:12345@cluster0.f7ff8ip.mongodb.net/atmDB", { useNewUrlParser: true, useUnifiedTopology: true }, connected());


function connected() {
    console.log('Connected to DB');
}

app.listen(1337);

