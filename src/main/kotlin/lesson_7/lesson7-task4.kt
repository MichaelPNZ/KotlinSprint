package lesson_7

fun main() {
    println("На сколько секунд поставить таймер: ")
    val timer = readln().toInt()

    for (second in timer downTo 0) {
        Thread.sleep(1000)
        println("Осталось: ${second} секунд.")
    }
    println("Время вышло.")
}