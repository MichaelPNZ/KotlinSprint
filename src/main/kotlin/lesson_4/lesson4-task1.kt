package lesson_4

fun main() {
    val today = 13
    val tomorrow = 4

    println("Доступность столиков на сегодня: ${today < totalTables}. Доступность столиков на завтра: ${tomorrow < totalTables}.")
}

const val totalTables = 13