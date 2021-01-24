data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {
    override fun compareTo(other: MyDate): Int {
        when
        {
            this.year > other.year -> return 3
            this.year < other.year -> return -3
            this.month > other.month -> return 2
            this.month < other.month -> return -2
            this.dayOfMonth > other.dayOfMonth -> return 1
            this.dayOfMonth > other.dayOfMonth -> return -1
        }
        return 0
    }
}

fun test(date1: MyDate, date2: MyDate) {
    // this code should compile:
    println(date1 < date2)
}
