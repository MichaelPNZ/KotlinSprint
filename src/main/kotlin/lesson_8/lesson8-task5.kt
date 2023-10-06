package lesson_8

fun main() {
    val arrayOfIngredients = mutableListOf<String>()
    println("Сколько ингредиентов вы хотите добавить в рецепт?")
    val count = readln().toInt()

    for (i in 1..count) {
        println("Введите название ингредиента:")
        val ingredient = readln()
        arrayOfIngredients.add(ingredient)
    }
    println("Список ваших ингредиентов: ${ arrayOfIngredients.joinToString() }.")
}