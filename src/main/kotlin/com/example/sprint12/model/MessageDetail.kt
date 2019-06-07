package com.example.sprint12.model

import java.io.Serializable
import java.awt.SystemColor.text



class MessageDetail:Serializable{
    var text = ""
    var priority = 0
    var secret = true

    constructor(text: String, priority: Int, secret: Boolean) {
        this.text = text
        this.priority = priority
        this.secret = secret
    }


    override fun toString(): String {
        return "MessageDetail{text='$text', priority=$priority, secret=$secret}"
    }

}