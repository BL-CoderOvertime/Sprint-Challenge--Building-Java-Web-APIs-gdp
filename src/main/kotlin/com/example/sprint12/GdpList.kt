package com.example.sprint12

import com.example.sprint12.model.GDP
import java.util.ArrayList

class GdpList{
    var gdpList = ArrayList<GDP>()

    init{
        gdpList.add(GDP("United States", "20513000"))
        gdpList.add(GDP("China", "13457267"))
        gdpList.add(GDP("Japan", "5070626"))
        gdpList.add(GDP("Germany", "4029140"))
        gdpList.add(GDP("United Kingdom", "2808899"))
        gdpList.add(GDP("France", "2794696"))
        gdpList.add(GDP("India", "2689992"))
        gdpList.add(GDP("Italy", "2086911"))
        gdpList.add(GDP("Brazil", "1909386"))
        gdpList.add(GDP("Canada", "1733706"))
        gdpList.add(GDP("South Korea", "1655608"))
        gdpList.add(GDP("Russia", "1576488"))
        gdpList.add(GDP("Spain", "1437047"))
        gdpList.add(GDP("Australia", "1427767"))
        gdpList.add(GDP("Mexico", "1199264"))
        gdpList.add(GDP("Indonesia", "1005268"))
        gdpList.add(GDP("Netherlands", "909887"))
        gdpList.add(GDP("Saudi Arabia", "769878"))
        gdpList.add(GDP("Turkey", "713513"))
        gdpList.add(GDP("Switzerland", "709118"))
        gdpList.add(GDP("Taiwan", "602678"))
        gdpList.add(GDP("Sweden", "554659"))
        gdpList.add(GDP("Poland", "549478"))
        gdpList.add(GDP("Belgium", "536055"))
        gdpList.add(GDP("Thailand", "490120"))
        gdpList.add(GDP("Argentina", "475429"))
        gdpList.add(GDP("Austria", "459401"))
        gdpList.add(GDP("Norway", "441439"))
        gdpList.add(GDP("United Arab Emirates", "432612"))
        gdpList.add(GDP("Iran", "430082"))
        gdpList.add(GDP("Nigeria", "397472"))
        gdpList.add(GDP("South Africa", "376679"))
        gdpList.add(GDP("Ireland", "366448"))
        gdpList.add(GDP("Israel", "365599"))
        gdpList.add(GDP("Hong Kong", "360315"))
        gdpList.add(GDP("Denmark", "354683"))
        gdpList.add(GDP("Malaysia", "347290"))
        gdpList.add(GDP("Singapore", "346621"))
        gdpList.add(GDP("Colombia", "336940"))
        gdpList.add(GDP("Philippines", "331678"))
        gdpList.add(GDP("Pakistan", "306987"))
        gdpList.add(GDP("Chile", "299887"))
        gdpList.add(GDP("Bangladesh", "286275"))
        gdpList.add(GDP("Finland", "276553"))
        gdpList.add(GDP("Egypt", "249471"))
        gdpList.add(GDP("Czech Republic", "244540"))
        gdpList.add(GDP("Vietnam", "241434"))
        gdpList.add(GDP("Romania", "239440"))
        gdpList.add(GDP("Portugal", "237962"))
        gdpList.add(GDP("Iraq", "230911"))
        gdpList.add(GDP("Peru", "228944"))
        gdpList.add(GDP("Greece", "218057"))
        gdpList.add(GDP("New Zealand", "205997"))
        gdpList.add(GDP("Algeria", "188342"))
        gdpList.add(GDP("Qatar", "188295"))
        gdpList.add(GDP("Kazakhstan", "184209"))
        gdpList.add(GDP("Hungary", "156393"))
        gdpList.add(GDP("Kuwait", "144523"))
        gdpList.add(GDP("Ukraine", "126390"))
        gdpList.add(GDP("Morocco", "118178"))
        gdpList.add(GDP("Angola", "114504"))
        gdpList.add(GDP("Ecuador", "107266"))
        gdpList.add(GDP("Slovakia", "106940"))
        gdpList.add(GDP("Puerto Rico", "104557"))
        gdpList.add(GDP("Venezuela", "96328"))
        gdpList.add(GDP("Sri Lanka", "92504"))
        gdpList.add(GDP("Kenya", "89591"))
        gdpList.add(GDP("Ethiopia", "83836"))
        gdpList.add(GDP("Oman", "81682"))
        gdpList.add(GDP("Dominican Republic", "81103"))
        gdpList.add(GDP("Guatemala", "79109"))
        gdpList.add(GDP("Syria", "77460"))
        gdpList.add(GDP("Myanmar", "71543"))
        gdpList.add(GDP("Luxembourg", "68993"))
        gdpList.add(GDP("Panama", "66031"))
        gdpList.add(GDP("Bulgaria", "63651"))
        gdpList.add(GDP("Uruguay", "60933"))
        gdpList.add(GDP("Costa Rica", "60816"))
        gdpList.add(GDP("Croatia", "59971"))
        gdpList.add(GDP("Belarus", "56934"))
        gdpList.add(GDP("Lebanon", "56709"))
        gdpList.add(GDP("Tanzania", "55645"))
        gdpList.add(GDP("Slovenia", "54969"))
        gdpList.add(GDP("Macau", "53961"))
        gdpList.add(GDP("Lithuania", "52468"))
        gdpList.add(GDP("Ghana", "51815"))
        gdpList.add(GDP("Serbia", "47564"))
        gdpList.add(GDP("Cote d'Ivoire", "45875"))
        gdpList.add(GDP("Azerbaijan", "45592"))
        gdpList.add(GDP("Uzbekistan", "43303"))
        gdpList.add(GDP("Libya", "43236"))
        gdpList.add(GDP("Democratic Republic of the Congo", "42692"))
        gdpList.add(GDP("Turkmenistan", "42764"))
        gdpList.add(GDP("Jordan", "41869"))
        gdpList.add(GDP("Paraguay", "41851"))
        gdpList.add(GDP("Bolivia", "41833"))
        gdpList.add(GDP("Tunisia", "41662"))
        gdpList.add(GDP("Bahrain", "39300"))
        gdpList.add(GDP("Cameroon", "38445"))
        gdpList.add(GDP("Latvia", "34286"))
        gdpList.add(GDP("Sudan", "33249"))
    }

    fun findGDP(tester: CheckGdp): GDP?{
        for (g in gdpList){
            if(tester.test(g)){
                return g
            }
        }
        return null
    }

    fun findGDPs(tester: CheckGdp): ArrayList<GDP> {
        val tempDogList = ArrayList<GDP>()

        for (g in gdpList) {
            if (tester.test(g)) {
                tempDogList.add(g)
            }
        }

        return tempDogList
    }
}