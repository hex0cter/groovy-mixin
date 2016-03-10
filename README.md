# Mixin for Groovy language

[![Build Status](https://travis-ci.org/hex0cter/groovy-mixin.svg?branch=master)](https://travis-ci.org/hex0cter/groovy-mixin)


Groovy is awesome. This library contains shortcuts to make your groovy development even more joyful.

## Collections

Missing the sample function from Ruby? Here it is. By enabling this library you can


```groovy
  [1, 2, 3, 4, 5].sample()  // Return 1 element randomly from array
  [1, 2, 3, 4, 5].sample(2) // Return 2 elements randomly from the array
  (1..5).sample()           // Return 1 element randomly from the range
```

both gives you a random number from 1 to 5.

You can also verify if an element or array of elements are included in another array or range by using

```groovy
  5.isPartOf [1, 2, 3, 4, 5] // Return true
  [1, 2].isPartOf [1, 2, 3]  // Return true
  3.isPartOf (1..5)          // Return true
```

