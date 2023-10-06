package lesson_6

fun main() {

    println("Введите количество секунд: ")
    val seconds = readln().toInt()
    val timer = seconds * 1000
    Thread.sleep(timer.toLong())
    println("Прошло ${seconds} секунд")
}