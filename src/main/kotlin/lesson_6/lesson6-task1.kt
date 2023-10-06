package lesson_6

fun main() {
    var authorization = false

    var login = ""
    var password = ""

    while (!authorization) {
        if (login.isEmpty() && password.isEmpty()) {
            println("Создайте логин: ")
            login = readln()
            println("Создайте пароль: ")
            password = readln()
        } else {
            println("Введите логин: ")
            val inputLogin = readln()
            println("Введите пароль: ")
            val inputPassword = readln()

            if ((inputLogin == login) && (inputPassword == password)) {
                authorization = true
                println("Авторизация прошла успешно")
            } else {
                println("Логин и пароль не верны!")
            }
        }
    }
}

