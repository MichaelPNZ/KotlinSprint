package lesson_8

fun main() {
    var arrayOfIngredients = arrayOf<String>()
    println("Сколько ингредиентов вы хотите добавить в рецепт?")
    val count = readln().toInt()

    for (i in 1..count) {
        println("Введите название ингредиента №${i}:")
        val ingredient = readln()
        arrayOfIngredients += ingredient
    }
    println("Список ваших ингредиентов: ${ arrayOfIngredients.joinToString() }.")
}