package com.hex0cter.mixin

import java.security.SecureRandom

class Collection {
    static init() {
        java.util.ArrayList.metaClass.getSample = { ->
            def random = new SecureRandom()
            def i = random.nextInt(delegate.size())
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

