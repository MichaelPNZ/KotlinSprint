package lesson_6

fun main() {
    var attempts = 3

    while (attempts > 0) {
        val numberOne = (1..9).random()
        val numberTwo = (1..9).random()
        println("Докажи, что ты не бот! Реши пример: ${numberOne}+${numberTwo}=")
        val result = readLine()!!.toInt()
        attempts--

        if (result == (numberOne + numberTwo)) {
            attempts = 0
            println("Добро пожаловать!")
        } else if (attempts == 0) {
            println("Доступ запрещен")
        } else {
            println("Неверно. Осталось попыток: ${attempts}")
        }
    }

}