package lesson_11

class User (
    val id: Int,
    val login: String,
    var password: String,
    val email: String,
    var bio: String?,
) {
    fun printInformation() {
        println("""--------------------
            |Проверка информации
            |${id}
            |${login}
            |${password}
            |${email}
            |${bio}
            |--------------------
        """.trimMargin())
    }

    fun getInformationOnConsole() {
        val information = readln()
        bio = information
    }

    fun changedPassword() {
        println("Введите пароль")
        val passwordUser = readln()

        if (passwordUser != password) { println("Пароль не верный") }

        while (passwordUser == password) {
            println("Введите новый пароль")
            val newPassword = readln()
            password = newPassword
            println("Пароль изменен на: ${newPassword}")
        }
    }

    fun getStringForUser(text: String) { println("Уважаемый ,${login}, отправляем Вам информацию: ${text}") }
}

fun main() {
    val user = User(
        id = 1,
        login = "qwerty",
        password = "asdfg",
        email = "zxcvb@gmail.com",
        bio = null,
    )

    println("Заполни информацию о себе")
    user.getInformationOnConsole()
    user.changedPassword()
    user.printInformation()
    user.getStringForUser(user.bio ?: "")
}