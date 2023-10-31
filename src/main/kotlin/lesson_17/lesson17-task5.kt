package lesson_17

class User(private var log: String, private val pass: String) {

    var login: String
        get() = log
        set(value) {
            println("Вы успешно поменяли логин.")
        }

    var password: String
        get() = pass.forEach { char -> print("*") }.toString()
        set(value) {
            println("Вы не можете изменить пароль")
        }

}

fun main() {

    val user = User("qwerty", "zxcvb")
    user.login = "asas"
    user.password

}