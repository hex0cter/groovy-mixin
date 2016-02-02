package com.hex0cter.groovy.test

import spock.lang.Specification

/**
 * CollectionSpec Test
 */
class CollectionSpec extends Specification {
    def "take sample from a collection"() {
        expect:
        collection.sample().isPartOf collection

        where:
        collection | _
        [1, 2, 3]  | _
        (1..1000)  | _
        (1..15.9)  | _
    }
}
