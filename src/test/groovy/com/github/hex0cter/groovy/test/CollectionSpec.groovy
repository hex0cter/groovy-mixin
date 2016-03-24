package com.github.hex0cter.groovy.test

import spock.lang.Specification

/**
 * CollectionSpec Test
 */
@SuppressWarnings(['DuplicateNumberLiteral', 'DuplicateListLiteral'])
class CollectionSpec extends Specification {
    def "take sample from a collection"() {
        expect:
        collection.sample.isPartOf collection
        collection.sample().isPartOf collection
        collection.sample(3).isPartOf collection

        where:
        collection | _
        [1, 2, 3]  | _
        (10..100)  | _
        (3..15.9)  | _
    }

    def 'an element belongs to a collection'() {
        expect:
        1.isPartOf collection
        [1, 2].isPartOf collection

        where:
        collection | _
        [1, 2, 3]  | _
        (1..100)   | _
        (1..15.9)  | _
    }
}
