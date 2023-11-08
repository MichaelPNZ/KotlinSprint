package lesson_18

open class CRM() {

    open fun getOrder() {}

}

class Order : CRM() {
    fun getOrder(numberOrder: Int, product: String) {
        return println("Заказ №$numberOrder, товар: $product")
    }

    fun getOrder(numberOrder: Int, productList: List<String>) {
        return println("Заказ №$numberOrder, заказаны следующие товары: ${productList}")
    }

}

fun main() {

    val orderFirst = Order()

    orderFirst.getOrder(1, "Phone")
    orderFirst.getOrder(2, listOf("Phone", "Case", "cable", "sim"))

}

