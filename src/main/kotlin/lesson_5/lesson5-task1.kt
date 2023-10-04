package lesson_5

fun main() {
    val numberOne = 5
    val numberTwo = 7
    print("Сложи ${numberOne}+${numberTwo}=")
    val botCheck = readln().toInt()

    if (botCheck == numberOne + numberTwo) { println("Добро пожаловать!") }
    else { println("Доступ запрещен.") }
}