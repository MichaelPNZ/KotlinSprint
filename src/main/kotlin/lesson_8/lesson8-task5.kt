package lesson_8

fun main() {
    println("Сколько ингредиентов вы хотите добавить в рецепт?")
    val arrayOfIngredients = Array(readln().toInt()) {
        println("Ингредиент: №${it + 1}")
        readln()
    }
    println("Список ваших ингредиентов: ${ arrayOfIngredients.joinToString() }.")
}