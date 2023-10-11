package lesson_10

fun main() {
    val (numberOne, numberTwo) = getRandomNumber()
    getMove(numberOne, numberTwo)
    getWinner(numberOne, numberTwo)
}

fun getMove(numberOne: Int?, numberTwo: Int?) {
    println("Вы бросили кубик: ${numberOne}")
    println("Компьютер бросил кубик: ${numberTwo}")
}

fun getRandomNumber(): Pair<Int, Int> = (1..6).random() to (1..6).random()

fun getWinner(numberOne: Int?, numberTwo: Int?) {
    if (numberOne!! > numberTwo!!) println("Победило человечество")
    else println("Победила машина")
}