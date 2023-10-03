package lesson_6

fun main() {
    var authorization = false

    var login = ""
    var password = ""

    while (authorization == false) {
        if (login == "" && password == "") {
            println("Создайте логин: ")
            login = readLine().toString()
            println("Создайте пароль: ")
            password = readLine().toString()
        } else {
            println("Введите логин: ")
            val inputLogin = readLine().toString()
            println("Введите пароль: ")
            val inputPassword = readLine().toString()

            if ((inputLogin == login) && (inputPassword == password)) {
                authorization = true
                println("Авторизация прошла успешно")
            } else {
                println("Логин и пароль не верны!")
            }
        }
    }
}

