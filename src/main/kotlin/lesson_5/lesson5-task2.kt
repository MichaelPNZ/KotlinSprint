package lesson_5

import java.time.LocalDate

fun main() {

    println("Введите год своего рождения: ")
    val userAge = readLine()!!.toInt()
    val currentDate = LocalDate.now().year
    val currentAge = currentDate - userAge

    val resultText = if (currentAge >= AGE_OF_MAJORITY) "Показать экран со скрытым контентом"
    else if (userAge == 16 || userAge == 17) "Показать экран с ограниченным контентом"
    else "Вернуться на главный экран приложения"

    println(resultText)
}

const val AGE_OF_MAJORITY = 18

