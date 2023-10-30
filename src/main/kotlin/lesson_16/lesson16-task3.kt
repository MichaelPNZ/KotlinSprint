package lesson_16


class User() {

    private val login = "qwerty"
    private val password = "zxcvb"

    private fun getPassword() = password
    fun getRelevancePassword(password: String) : Boolean {
        println("Login: ${login}")
        return password == getPassword()
    }

}

fun main() {

    val password = User()

    println("Relevance password: ${password.getRelevancePassword("zxccb")}")

}