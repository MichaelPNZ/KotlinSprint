package lesson_5

fun main() {

    print("Сложи 5+7=")
    val botCheck = readLine()!!.toInt()

    if (botCheck == TRUE_RESULT_BOT_CHECK) { println("Добро пожаловать!") }
    else { println("Доступ запрещен.") }
}

const val TRUE_RESULT_BOT_CHECK = 12