# Mixin for Groovy language

[![Build Status](https://travis-ci.org/hex0cter/groovy-mixin.svg?branch=master)](https://travis-ci.org/hex0cter/groovy-mixin)


Groovy is awesome. This library contains shortcuts to make your groovy development even more joyful.

## Collections

Missing the sample function from Ruby? Here it is. By enabling this library you can


```groovy
  [1, 2, 3, 4, 5].sample
  (1..5).sample
```

both gives you a random number from 1 to 5.

You can also verify if a number is included in an array or range using

```groovy
  5.in [1, 2, 3, 4, 5]
  3.in (1..5)
```

both returns true.

