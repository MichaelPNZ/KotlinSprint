package lesson_16

class Order(orderNumber: Int) {

    var orderStatus = "Заказ №${orderNumber} принят"

    private fun changeOrderStatus(newOrderStatus: String) {
        orderStatus = newOrderStatus
    }

    fun sendApplication(newOrderStatus: String) {
        changeOrderStatus(newOrderStatus)
    }

}

fun main() {

    val order = Order(1)
    println(order.orderStatus)
    order.sendApplication("Заказ готов")
    println(order.orderStatus)

}