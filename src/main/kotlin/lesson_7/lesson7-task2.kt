package lesson_7

fun main() {
    var authorization = false

    while (authorization == false) {
        val randomNumber = (1000..9999).random()
        println("Ваш код авторизации: ${randomNumber}")
        println("Введите полученный код: ")
        val code = readln().toInt()

        when {
            code == randomNumber -> {
                println("Добра пожаловать!")
                authorization = true
            }
            else -> println("Код введен неверно.")
        }
    }
}