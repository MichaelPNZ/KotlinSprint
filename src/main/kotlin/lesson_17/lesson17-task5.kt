package lesson_17

class User(log: String, pass: String) {

    var login: String = log
        set(value) {
            field = value
            println("Вы успешно поменяли логин.")
        }

    var password: String = pass
        get() = field.forEach { char -> print("*") }.toString()
        set(value) {
            field = value
            println("Вы не можете изменить пароль")
        }

}

fun main() {

    val user = User("qwerty", "zxcvb")
    user.login = "asas"
    user.password = "hh"

}