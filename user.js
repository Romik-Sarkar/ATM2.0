const mongoose = require('mongoose');
const Joi = require('joi');


const userSchema = new mongoose.Schema({
    username: {
        type: String,
        
    },

    email: {
        type: String
    },
  
    password: {
        type: String,
        max: 1024,
        min: 6
    },
    


});

function validateUser(user) {
    const schema = {
        username: Joi.string().min(5).max(50).required(),
        email: Joi.string().min(5).max(255).required().email(),
        password: Joi.string().min(5).max(255).required()
    };
    return Joi.validate(user, schema);
}

module.exports = mongoose.model('User', userSchema);
exports.validate = validateUser;