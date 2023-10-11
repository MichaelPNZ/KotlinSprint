package lesson_11

class User (
    val id: Int,
    val login: String,
    var password: String,
    val email: String,
    var bio: String,
) {
    fun printInformation() {
        println("--------------------")
        println("Проверка информации")
        println(id)
        println(login)
        println(password)
        println(email)
        println(bio)
        println("--------------------")
        println()
    }

    fun getInformationOnConsole() {
        val information = readln()
        bio = information
    }

    fun changedPassword() {
        var isChanged = false

        while (!isChanged) {
            println("Введите пароль")
            val passwordUser = readln()
            if (passwordUser == password) {
                isChanged = true
                println("Введите новый пароль")
                val newPassword = readln()
                password = newPassword
                println("Пароль изменен на: ${newPassword}")
            } else {
                println("Пароль не верный")
            }
        }
    }

    fun getStringForUser(text: String) {
        println("Уважаемый ,${login}, отправляем Вам информацию: ${text}")
    }
}

fun main() {
    val user = User(
        id = 1,
        login = "qwerty",
        password = "asdfg",
        email = "zxcvb@gmail.com",
        bio = "",
    )

    println("Заполни информацию о себе")
    user.getInformationOnConsole()
    user.changedPassword()
    user.printInformation()
    user.getStringForUser(user.bio)
}