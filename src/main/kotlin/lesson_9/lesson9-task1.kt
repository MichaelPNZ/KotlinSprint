package lesson_9

fun main() {
    val arrayOfIngredients = listOf("перец","яйцо","сыр","картофель","майонез","кукуруза","лук")
    println("В рецепте есть следующие ингредиенты:")
    arrayOfIngredients.forEach { println(it) }
}