package lesson_7

fun main() {
    println("Введите число: ")
    val number = readln().toInt()

    for (even in 0..number) {
        Thread.sleep(500)
        if (even % 2 == 0) {
            if (even == 0) {
                continue
            }
            println(even)
        }
    }
}