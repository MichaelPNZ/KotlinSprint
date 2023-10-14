package lesson_10

fun main() {
    println("Укажите длину пароля: ")
    val longPassword = readln().toInt()
    val password = getRandomPassword(longPassword)
    println(password)
}

fun getRandomPassword(length: Int) : String {
    val char = '!'..'+'
    val number = 0..9
    var password = ""
    for (i in 1..length / 2) {
        password += char.random()
        password += number.random()
    }
    return password
}