package lesson_3

fun main() {
    val message = "D2-D4;0"
    val splittedString = message.split('-', ';')

    val whereFrom = splittedString[0]
    val where = splittedString[1]
    val numberMotion = splittedString[2]

    println(whereFrom)
    println(where)
    println(numberMotion)
}