package com.uw

import com.sun.org.apache.xpath.internal.operations.Bool

class LeapYear {

    Boolean isLeap

    LeapYear(def year){
        isLeap = isDiv400(year) || (isDiv4(year) && !isDiv100(year))
    }

    Boolean isDiv4(def year){
        year % 4 == 0
    }

    Boolean isDiv100(def year){
        year % 100 == 0
    }

    Boolean isDiv400(def year){
        year % 400 == 0
    }
}
