package lesson_20

fun main() {

    val listOfElements = listOf("1111", "2222", "3333", "4444")

    val even = listOfElements.mapIndexed { index, element ->
        {if (index % 2 == 0) println("Нажат элемент $element")}
    }

    even.forEach { even -> even() }
}