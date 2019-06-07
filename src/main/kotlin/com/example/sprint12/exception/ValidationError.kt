package com.example.sprint12.exception

class ValidationError {
    var code: String? = null
    var message: String? = null

    constructor(code: String, message: String) {
        this.code = code
        this.message = message
    }

    constructor() {}
}