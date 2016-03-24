package com.github.hex0cter.groovy.test

import spock.lang.Specification

/**
 * CollectionSpec Test
 */
@SuppressWarnings(['DuplicateNumberLiteral', 'DuplicateListLiteral'])
class IntegerSpec extends Specification {
    def "numbers followed by time spec"() {
        expect:
        assert 5.years.ago
        assert 1.months.ago
        assert 2.days.ago
        assert 4.hours.ago
        assert 2.minutes.ago
        assert 3.seconds.ago

        assert 5.years.later
        assert 1.months.later
        assert 2.days.later
        assert 3.hours.later
        assert 2.minutes.later
        assert 3.seconds.later
    }

}
