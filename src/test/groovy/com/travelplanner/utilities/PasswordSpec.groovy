package com.travelplanner.utilities

import spock.lang.Specification
import spock.lang.Unroll

import static com.travelplanner.utilities.Password.*

class PasswordSpec extends Specification {

    String testPassword

    def 'setup'() {
        testPassword = 'abcdefghijklmnopqrstuvwxyz'
    }

    def 'computed hash code should check true for given password'() {
        given:

        when:
            def computedHash = hashPassword(testPassword)
        then:
            checkPassword(testPassword, computedHash)
    }

    @Unroll
    def 'checkPassword should not allow illegal hashPassword values for'() {
        when:
            checkPassword(testPassword, hash)
        then:
            IllegalArgumentException ex = thrown()
            ex.message == 'Invalid hash provided for comparison'
        where:
            hash << [null, 'wrong']
    }

}
