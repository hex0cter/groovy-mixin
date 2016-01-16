# Mixin for Groovy language

[![Build Status](https://travis-ci.org/hex0cter/groovy-mixin.svg?branch=master)](https://travis-ci.org/hex0cter/groovy-mixin)


This library contains some shortcuts for you to use groovy more easily.

## Sample

Missing the sample function from Ruby? Here it is. By enabling this library you can


```groovy
  [1, 2, 3, 4, 5].sample
  (1..5).sample
```

both gives you a random number from 1 to 5.


```groovy
  5.in [1, 2, 3, 4, 5]
  3.in (1..5)
```

both returns true.

