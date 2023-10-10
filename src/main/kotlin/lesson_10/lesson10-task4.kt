package lesson_10

fun main() {
    var isContinue = true
    var winner = 0

    while (isContinue) {
        val (numberOne, numberTwo) = getRandomNumber()

        if ((winner == 0) || (getAnswerPlayer() == "Да")) {
            getMove(numberOne, numberTwo)
            getWinner(numberOne, numberTwo)
            if (getWinGames(numberOne, numberTwo)) winner += 1
        } else {
            isContinue = false
            println("Выиграно партий: ${winner}")
        }
    }
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

fun getWinGames(numberOne: Int?, numberTwo: Int?) : Boolean {
    return numberOne!! > numberTwo!!
}

fun getAnswerPlayer() : String? {
    println("Хотите бросить кости еще раз Введите Да или Нет")
    return readLine()
}