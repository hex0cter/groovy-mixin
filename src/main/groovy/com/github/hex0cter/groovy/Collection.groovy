package com.github.hex0cter.groovy

import java.security.SecureRandom

/**
 * Collection mixin
 */
class Collection {
    static Object sample(final List self, int n = 1) {
        def indice = (1..self.size()) as ArrayList

        SecureRandom random = new SecureRandom()
        Collections.shuffle(indice, random)

        def retval = []
        n.times {
            retval << self[indice[it] - 1]
        }

        switch (n) {
            case [0, 1]:
                return retval[0]
            default:
                return retval
        }
    }

    static Object getSample(final List list) {
        sample(list)
    }

    static boolean isPartOf(final def objects, final List collection) {
        def elements
        if (objects instanceof List) {
            elements = objects
        } else {
            elements = [objects]
        }

        for (element in elements) {
            if (!collection.contains(element)) {
                return false
            }
        }

        true
    }
}
