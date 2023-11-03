package lesson_16


class User(private val login: String, private val _password: String) {

    fun checkPassword(password: String) {
        println("Логин: ${login}")

        if (password == _password) println("Пароль верный")
        else println("Пароль не верный")
    }

}

fun main() {

    val password = User("qwerty", "zxcvb")
    password.checkPassword("zxcvb")

}