package lesson_3

fun main() {
    val helloTextDay = "Добрый день"
    val helloTextEvening = "Добрый вечер"
    val userName = "Михаил"

    var helloText = "$helloTextDay, $userName!"
    println(helloText)
    helloText = "$helloTextEvening, $userName!"
    println(helloText)
}
