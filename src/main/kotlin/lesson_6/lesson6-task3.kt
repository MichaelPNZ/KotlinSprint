package lesson_6

fun main() {

    println("Введите количество секунд: ")
    val seconds = readln().toInt()
    var timer = seconds

    while (timer > 0) {
        println("Осталось секунд: ${timer--}")
        Thread.sleep(1000)
    }
    println("Время вышло")
}