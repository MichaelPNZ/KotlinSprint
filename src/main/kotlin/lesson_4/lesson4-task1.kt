package lesson_4

fun main() {
    val today = 13
    val tomorrow = 4

    println("Доступность столиков на сегодня: ${today < TOTAL_TABLES}. Доступность столиков на завтра: ${tomorrow < TOTAL_TABLES}.")
}

const val TOTAL_TABLES = 13