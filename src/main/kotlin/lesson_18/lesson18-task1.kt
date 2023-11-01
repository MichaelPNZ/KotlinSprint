package lesson_18

open class CRM() {

    open fun getOrder() = ""

}

class OrderOne(
    private val numberOrder: Int,
    private val product: String,
) : CRM() {
    override fun getOrder(): String {
        return "Заказ №$numberOrder, товар: $product"
    }
}

class OrderTwo(
    private val numberOrder: Int,
    private val product: List<String>,
) : CRM() {
    override fun getOrder(): String {
        return "Заказ №$numberOrder. Заказаны следующие товары: $product"
    }
}

fun main() {

    val orderFirst = OrderOne(1, "Phone")
    val orderSecond = OrderTwo(2, listOf("Case", "cable", "sim"))

    val list = arrayOf<CRM>(orderFirst, orderSecond)

    showAllOrders(list)

}

fun showAllOrders(orders: Array<CRM>) {
    orders.forEach {
        println(it.getOrder())
    }
}