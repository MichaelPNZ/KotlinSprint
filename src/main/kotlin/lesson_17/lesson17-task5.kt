package lesson_17

class User(log: String, pass: String) {

    var login: String = log
        set(value) {
            field = value
            println("Вы успешно поменяли логин.")
        }

    val longPassword = pass.length

    var password: String = pass
        get() {
            field = "*".repeat(longPassword)
            return println(field).toString()
        }
        set(value) {
            println("Вы не можете изменить пароль")
        }

}

fun main() {

    val user = User("qwerty", "zxcvbyyyyyyyyyyy")
    user.login = "asas"
    user.password

}