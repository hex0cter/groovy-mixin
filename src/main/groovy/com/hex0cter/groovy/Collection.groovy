package com.hex0cter.groovy

import java.security.SecureRandom

/**
 * Collection mixin
 */
class Collection {
    static Object sample(final List self) {
        SecureRandom random = new SecureRandom()
        int i = random.nextInt(self.size())
        self[i]
    }

    static boolean isPartOf(final Object object, final List collection) {
        collection.contains(object)
    }
}
