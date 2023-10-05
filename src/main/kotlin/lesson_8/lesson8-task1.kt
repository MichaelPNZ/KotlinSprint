package lesson_8

fun main() {
    var day = 1
    val dayOfWeek = 7
    var arrayOfWeek = intArrayOf()

    for (views in day..dayOfWeek) {
        when(day) {
            1 -> println("Введите количество просмотров за понедельник:")
            2 -> println("Введите количество просмотров за вторник:")
            3 -> println("Введите количество просмотров за среду:")
            4 -> println("Введите количество просмотров за четверг:")
            5 -> println("Введите количество просмотров за пятницу:")
            6 -> println("Введите количество просмотров за субботу:")
            7 -> println("Введите количество просмотров за воскресенье:")
        }
        val numberOfViews = readln().toInt()
        day ++
        arrayOfWeek += numberOfViews
    }
    println("Всего просмотров за неделю: ${arrayOfWeek.sum()}")
}