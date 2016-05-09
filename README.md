# Mixin for Groovy language

[![Build Status](https://travis-ci.org/hex0cter/groovy-mixin.svg?branch=master)](https://travis-ci.org/hex0cter/groovy-mixin)


Groovy is awesome. This library contains shortcuts to make your groovy development even more joyful.

## Collections

Missing the sample function from Ruby? Here it is. By enabling this library you can


```groovy
    [1, 2, 3, 4, 5].sample()  // Return 1 element randomly from array
    [1, 2, 3, 4, 5].sample    // Same as above: return 1 element randomly from array
    [1, 2, 3, 4, 5].sample(2) // Return 2 elements randomly from the array
    (1..5).sample()           // Return 1 element randomly from the range
    (1..5).sample             // Same as above: return 1 element randomly from the range
```

both gives you a random number from 1 to 5.

You can also verify if an element or array of elements are included in another array or range by using

```groovy
    5.isPartOf [1, 2, 3, 4, 5] // Return true
    [1, 2].isPartOf [1, 2, 3]  // Return true
    3.isPartOf (1..5)          // Return true
```

## Date

You can use the syntax below to get a dynamic date:

```groovy
    5.years.ago
    1.months.ago
    2.days.ago
    4.hours.ago
    2.minutes.ago
    3.seconds.ago
    
    5.years.later
    1.months.later
    2.days.later
    3.hours.later
    2.minutes.later
    3.seconds.later 
```

Each returns a instance of Date relative to the execution time.


## How to use it?

### Maven

Add the following dependency to your pom.xml:

```xml
    <dependency>
      <groupId>com.github.hex0cter</groupId>
      <artifactId>groovy-mixin</artifactId>
      <version>1.0.0</version>
    </dependency>
```

### Gradle

Add the following dependency to you build.gradle

```groovy
    compile 'com.github.hex0cter:groovy-mixin:1.0.0'
```

Any feedback is welcome!
