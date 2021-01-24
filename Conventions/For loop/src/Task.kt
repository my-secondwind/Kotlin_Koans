class DateRange(val start: MyDate, val end: MyDate) : Iterable<MyDate>{
    override fun iterator(): Iterator<MyDate> {
        return object : Iterator<MyDate> {
            var current = start
            override fun hasNext(): Boolean {
                return current <= end
            }

            override fun next(): MyDate {
                if (!hasNext()) throw NoSuchElementException()
                return current.also{current = it.followingDate()}
            }
        }
    }

}

fun iterateOverDateRange(firstDate: MyDate, secondDate: MyDate, handler: (MyDate) -> Unit) {
    for (date in firstDate..secondDate) {
        handler(date)
    }
}