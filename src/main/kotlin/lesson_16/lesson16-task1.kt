package lesson_16

class Cube() {

    private val randomNumber = (1..6).random()

    fun printNumber() { println(randomNumber) }

}

fun main() {

    val number = Cube()
    number.printNumber()

}