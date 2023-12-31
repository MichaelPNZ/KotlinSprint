package lesson_6

fun main() {
    val number = (1..9).random()
    var attempts = 5
    println("Угадайте число!")

    while (attempts-- > 0) {
        println("Введите свое число: ")
        val playerNumber = readln().toInt()

        when {
            playerNumber == number -> {
                println("Это была великолепная игра!")
                break
            }
            attempts == 0 -> {
                println("Неверно! Остальсь попыток: ${attempts}")
                println("Было загадано число ${number}")
            }
            else -> println("Неверно! Остальсь попыток: ${attempts}")
        }
    }
}