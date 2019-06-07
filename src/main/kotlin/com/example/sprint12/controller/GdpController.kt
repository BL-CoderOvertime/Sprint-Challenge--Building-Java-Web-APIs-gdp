package com.example.sprint12.controller

import com.example.sprint12.CheckGdp
import com.example.sprint12.GdpList
import com.example.sprint12.Sprint12Application
import com.example.sprint12.exception.ResourceNotFoundException
import com.example.sprint12.model.GDP
import com.example.sprint12.ourGdpList
import org.slf4j.LoggerFactory
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.servlet.ModelAndView
import kotlin.math.roundToInt

private val logger = LoggerFactory.getLogger(GdpController::class.java)

@RestController
class GdpController{

    // localhost:2019/names
    @RequestMapping(value = "/names")
    fun getSortedByName():ResponseEntity<*>{
        logger.info("/names accessed")
        var sortedList = ourGdpList.gdpList.sortedWith(compareBy{it.name})
        return ResponseEntity(sortedList, HttpStatus.OK)
    }

    // localhost:2019/economy
    @RequestMapping(value = "/economy")
    fun getSortedByGdp():ResponseEntity<*>{
        logger.info("/economy accessed")
        var sortedList = ourGdpList.gdpList.sortedWith(compareByDescending{it.countryGdp})
        return ResponseEntity(sortedList, HttpStatus.OK)
    }

    // localhost:2019/country/{id}
    @RequestMapping(value = "/country/{id}")
    fun getById(@PathVariable id:Long):ResponseEntity<*>{
        logger.info("/country/$id accessed")

        val rtnGDP = ourGdpList.findGDP(object : CheckGdp {
            override fun test(g: GDP): Boolean {
                return when (g.id) {
                    id -> true
                    else -> false
                }
            }
        })

        if (rtnGDP == null) {
            throw ResourceNotFoundException("GDPCountry with id $id not found")
        } else {
        }
        return ResponseEntity(rtnGDP, HttpStatus.OK)
    }

    // localhost:2019/country/stats/median
    @RequestMapping(value = "/country/stats/median")
    fun getByMedianGDP():ResponseEntity<*>{
        logger.info("/country/stats/median accessed")

        var sortedList = ourGdpList.gdpList.sortedWith(compareBy{it.countryGdp})
        var rtnGDP : GDP? = null

        if(ourGdpList.gdpList.size%2 == 0){
            val returnIndex = (sortedList.size/2).toDouble()
            when(Math.random().roundToInt()){
                0 -> rtnGDP = sortedList[returnIndex.toInt()]
                1 -> rtnGDP = sortedList[returnIndex.roundToInt()]
            }
        }
        else {
            rtnGDP = sortedList[sortedList.size/2]
        }
        return ResponseEntity(rtnGDP, HttpStatus.OK)
    }


    // localhost:2019/economy/table
    @RequestMapping(value = "/economy/table")
    fun displayEconomyTable(): ModelAndView {
        logger.info("/economy/table accessed")

        var mav = ModelAndView()
        mav.viewName = "gdps"
        mav.addObject("gdpList", ourGdpList.gdpList)

        return mav
    }
/*    // localhost:2019/total
    @RequestMapping(value = "/total")
    fun getTotalGDP():ResponseEntity<*>{
        logger.info("/total accessed")
    }
    // localhost:2019/names/{startLetter}/{endLetter}
    @RequestMapping(value = "/names/{startLetter}/{endLetter}")
    fun getByNameRange(@PathVariable startLetter: String, @PathVariable endLetter: String):ResponseEntity<*>{
        logger.info("/names/$startLetter/$endLetter accessed")
    }
    // localhost:2019/gdp/list/{startGdp}/{endGdp}
    @RequestMapping(value = "/gdp/list/{startGdp}/{endGdp}")
    fun getByGdpRange(@PathVariable startGdp: Long, @PathVariable endGdp: Long):ResponseEntity<*>{
        logger.info("/gdp/list/$startGdp/$endGdp accessed")
    }*/
}