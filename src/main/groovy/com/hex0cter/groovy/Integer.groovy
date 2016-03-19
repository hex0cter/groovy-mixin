package com.hex0cter.groovy

/**
 * Internal class
 */
class TimeUnit {
    enum Unit {
        YEAR,
        MONTH,
        WEEK,
        DAY,
        HOUR,
        MINUTE,
        SECOND,
    }
    def unit
    def amount

    @SuppressWarnings('UnnecessaryGetter')
    Date getAgo() {
        amount = -amount
        getLater()
    }

    Date getLater() {
        Calendar rightNow = Calendar.instance
        switch (unit) {
            case Unit.YEAR:
                rightNow.add(Calendar.YEAR, amount)
                break
            case Unit.DAY:
                rightNow.add(Calendar.DAY_OF_MONTH, amount)
                break
            case Unit.MONTH:
                rightNow.add(Calendar.MONTH, amount)
                break
            case Unit.HOUR:
                rightNow.add(Calendar.HOUR, amount)
                break
            case Unit.MINUTE:
                rightNow.add(Calendar.MINUTE, amount)
                break
            case Unit.SECOND:
                rightNow.add(Calendar.SECOND, amount)
                break
        }
        rightNow.time
    }
}

/**
 * Class integer
 */
@SuppressWarnings('UnnecessaryPackageReference')
class Integer {
    static TimeUnit getYears(java.lang.Integer amount) {
        new TimeUnit(unit: TimeUnit.Unit.YEAR, amount: amount)
    }

    static TimeUnit getMonths(java.lang.Integer amount) {
        new TimeUnit(unit: TimeUnit.Unit.MONTH, amount: amount)
    }

    static TimeUnit getDays(java.lang.Integer amount) {
        new TimeUnit(unit: TimeUnit.Unit.DAY, amount: amount)
    }

    static TimeUnit getHours(java.lang.Integer amount) {
        new TimeUnit(unit: TimeUnit.Unit.HOUR, amount: amount)
    }

    static TimeUnit getMinutes(java.lang.Integer amount) {
        new TimeUnit(unit: TimeUnit.Unit.MINUTE, amount: amount)
    }

    static TimeUnit getSeconds(java.lang.Integer amount) {
        new TimeUnit(unit: TimeUnit.Unit.SECOND, amount: amount)
    }
}
