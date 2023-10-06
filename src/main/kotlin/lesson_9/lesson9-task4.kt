package lesson_9

fun main() {
    println("Введите 5 ингредиентов через запятую:")
    val ingredient = readln()
    val arrayOfIngredients = ingredient.split(",").toList()

    val sortedArray = arrayOfIngredients.sorted()
    println(sortedArray.joinToString())
}