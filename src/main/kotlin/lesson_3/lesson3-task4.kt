package lesson_3

fun main() {
    var whereFrom = "E2"
    var where = "E4"
    var numberMotion = 1

    var message = "$whereFrom-$where;$numberMotion"
    println(message)
    numberMotion += 1
    whereFrom = "D2"
    where = "D3"
    message = "$whereFrom-$where;$numberMotion"
    println(message)
}