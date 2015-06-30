package com.hex0cter.mixin

import java.security.SecureRandom

/**
 * Mixin for collections, i.e., ArrayList, Range
 */
class Collection {
    static init() {
        java.util.ArrayList.metaClass.getSample = { ->
            SecureRandom random = new SecureRandom()
            int i = random.nextInt(delegate.size())
            delegate[i]
        }

        groovy.lang.IntRange.metaClass.getSample = { ->
            (delegate.toArray() as List).sample
        }

        groovy.lang.ObjectRange.metaClass.getSample = { ->
            (delegate.toArray() as List).sample
        }

        java.lang.Integer.metaClass.in = { collection ->
            collection.contains(delegate)
        }
    }
}

