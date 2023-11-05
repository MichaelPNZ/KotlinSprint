package lesson_18

open class CRM() {

    open fun getOrder() {}
    open fun getListOrders() {}

}

class Order(
    private val numberOrder: Int,
    private val product: String,
    private val productList: List<String>,
) : CRM() {
    override fun getOrder() {
        return println("Заказ №$numberOrder, товар: $product")
    }

    override fun getListOrders() {
        return println("Заказаны следующие товары: ${productList}")
    }

}

fun main() {

    val orderFirst = Order(1, "Phone", listOf("Phone", "Case", "cable", "sim"))
    val orderSecond = Order(2, "TV", listOf("TV", "TV_Box", "cable", "SoundBar"))

    orderFirst.getOrder()
    orderSecond.getListOrders()

}

