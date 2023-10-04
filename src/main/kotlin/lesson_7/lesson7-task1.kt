package lesson_7

fun main() {

    val symbol1 = 'a'..'z'
    val symbol2 = 1..9
    var password = ""

    for (i in 1..3) {

        password += symbol1.random()
        password += symbol2.random()
    }

    println(password)
}