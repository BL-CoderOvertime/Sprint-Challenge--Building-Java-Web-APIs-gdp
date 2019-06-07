package com.example.sprint12.model

import com.example.sprint12.exception.ValidationError
import java.text.SimpleDateFormat
import java.util.*

class ErrorDetail {


    var title: String = ""
    var status: Int = 0
    var detail: String = ""
    private var timestamp: String = ""
    var developerMessage: String = ""
    private val errors = HashMap<String, List<ValidationError>>()


    fun setTimestamp(timestamp: Long) {
        this.timestamp = SimpleDateFormat("dd MMM yyyy HH:mm:ss:SSS Z").format(Date(timestamp))
    }

}