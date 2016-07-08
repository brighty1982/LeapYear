package com.uw

import spock.lang.Specification

class LeapYearSpec extends Specification{

    def "Value divided by 4 is Leap Year"(){

        given:
        def year = 1996

        when:
        LeapYear leapYear = new LeapYear(year)

        then:
        leapYear.isLeap == true

    }

    def "Value divided by 100 is not a Leap Year"(){

        given:
        def year = 1900

        when:
        LeapYear leapYear = new LeapYear(year)

        then:
        leapYear.isLeap == false
    }

    def "Value divided by 400 is a Leap Year"(){

        given:
        def year = 2000

        when:
        LeapYear leapYear = new LeapYear(year)

        then:
        leapYear.isLeap == true
    }

    def "Value is not divisble by 4 then it is not a Leap Year"(){

        given:
        def year = 2001

        when:
        LeapYear leapYear = new LeapYear(year)

        then:
        leapYear.isLeap == false
    }

}
