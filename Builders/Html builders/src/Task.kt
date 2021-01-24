fun renderProductTable(): String {
    return html {
        table {
            tr(getTitleColor()) {
                td {
                    text("Product")
                }
                td {
                    text("Price")
                }
                td {
                    text("Popularity")
                }
            }
            val products = getProducts()
            var row = 1
            products.forEachIndexed{
                index, it ->
                tr {
                    td (getCellColor(index, 0)) {
                        text(it.description)
                    }
                    td (getCellColor(index, 1)) {
                        text(it.price)
                    }
                    td (getCellColor(index, 2)) {
                        text(it.popularity)
                    }
                }
            }
        }
    }.toString()
}

fun getTitleColor() = "#b9c9fe"
fun getCellColor(index: Int, row: Int) = if ((index + row) % 2 == 0) "#dce4ff" else "#eff2ff"
