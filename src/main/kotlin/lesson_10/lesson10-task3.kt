package lesson_10

fun main() {
    println("Укажите длину пароля: ")
    val longPassword = readln().toInt()
    val password = getRandomPassword(longPassword)
    println(password)
}

fun getRandomPassword(length: Int) : String {
    val symbol1 = "!\"\\#\$%&'()*+,-./ "
    val symbol2 = '0'..'9'
    var password = ""
    for (i in 1..length / 2) {
        password += symbol1.random()
        password += symbol2.random()
    }
    return password
}