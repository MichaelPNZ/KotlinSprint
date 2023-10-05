package lesson_5


fun getRandomString(length: Int) : String {
    val charset = ('a'..'z') + ('A'..'Z') + ('0'..'9')
    return (1..length)
        .map { charset.random() }
        .joinToString("")
}
fun main() {
    println("Укажите длину пароля: ")
    val longPassword = readln().toInt()

    val password = getRandomString(longPassword)

    println(password)
}