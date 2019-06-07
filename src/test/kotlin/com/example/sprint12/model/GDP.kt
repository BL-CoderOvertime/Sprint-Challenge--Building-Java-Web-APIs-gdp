package com.example.sprint12.model

import java.util.concurrent.atomic.AtomicLong

class GDP{
    var id: Long = 0
    var countryGdp: Long = 0
    var name = ""

    constructor(toClone: GDP) {
        this.id = toClone.id
        this.countryGdp = toClone.countryGdp
        this.name = toClone.name
    }

    constructor(name: String,countryGdp: String) {
        this.id = counter.incrementAndGet()
        this.countryGdp = countryGdp.toLong()
        this.name = name
    }

    companion object {
        private val counter = AtomicLong()
    }
}