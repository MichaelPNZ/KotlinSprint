package lesson_16

class Order() {

    private val orderNumber = 1
    var orderStatus = "Заказ №${orderNumber} принят"

    private fun changeOrderStatus(newOrderStatus: String) { orderStatus = newOrderStatus }

    fun sendApplication(newOrderStatus: String){ changeOrderStatus(newOrderStatus) }

}

fun main() {

    val order = Order()
    println(order.orderStatus)
    order.sendApplication("Заказ готов")
    println(order.orderStatus)

}