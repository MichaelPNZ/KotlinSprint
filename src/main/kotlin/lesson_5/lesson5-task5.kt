package lesson_5

fun main() {

    val firstRandomNumber = (1..100).random()
    val secondRandomNumber = (1..100).random()

    println("Отгадайте два числа от 1 до 100")
    println("Введите первое число: ")
    val firstNumber = readln().toInt()
    println("Введите второе число: ")
    val secondNumber = readln().toInt()
    val winNumber = "Выигрышные числа: $firstRandomNumber и $secondRandomNumber"

    if ((firstNumber == firstRandomNumber) && (secondNumber == secondRandomNumber)
        || (firstNumber == secondRandomNumber) && (secondNumber == firstRandomNumber)) {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if ((firstNumber == firstRandomNumber)
        || (secondNumber == secondRandomNumber)
        || (firstNumber == secondRandomNumber)
        || (secondNumber == firstRandomNumber)) {
        println("Вы выиграли утешительный приз!")
        println(winNumber)
    } else {
        println("Неудача! Крутите барабан!")
        println(winNumber)
    }
}
