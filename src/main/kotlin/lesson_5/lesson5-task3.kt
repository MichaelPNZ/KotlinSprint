package lesson_5

fun main() {
    println("Отгадайте два числа от 1 до 100")
    println("Введите первое число: ")
    val firstNumber = readln().toInt()
    println("Введите второе число: ")
    val secondNumber = readln().toInt()
    val winNumber = "Выигрышные числа: $FIRST_NUMBER и $SECOND_NUMBER"

    if (((firstNumber == FIRST_NUMBER) && (secondNumber == SECOND_NUMBER))
        || ((firstNumber == SECOND_NUMBER) && (secondNumber == FIRST_NUMBER))) {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if ((firstNumber == FIRST_NUMBER) || (secondNumber == SECOND_NUMBER)) {
        println("Вы выиграли утешительный приз!")
        println(winNumber)
    } else {
        println("Неудача! Крутите барабан!")
        println(winNumber)
    }
}

const val FIRST_NUMBER = 12
const val SECOND_NUMBER = 48
