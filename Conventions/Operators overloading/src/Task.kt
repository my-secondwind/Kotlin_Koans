import TimeInterval.*

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int)

// Supported intervals that might be added to dates:
enum class TimeInterval { DAY, WEEK, YEAR }


operator fun MyDate.plus(timeInterval: TimeInterval): MyDate = addTimeIntervals(timeInterval, 1)

class DeltaTimeInterval(val timeInterval: TimeInterval, val count: Int)

operator fun TimeInterval.times(count: Int): DeltaTimeInterval = DeltaTimeInterval(this, count)

operator fun MyDate.plus(deltaTimeInterval: DeltaTimeInterval): MyDate = addTimeIntervals(deltaTimeInterval.timeInterval,
        deltaTimeInterval.count)

fun task1(today: MyDate): MyDate {
    return today + YEAR + WEEK
}

fun task2(today: MyDate): MyDate {
    return today + YEAR * 2 + WEEK * 3 + DAY * 5
}

fun main() {
    println(task1(MyDate(2020, 1, 1)))
    println(task2(MyDate(2020, 1, 1)))
}