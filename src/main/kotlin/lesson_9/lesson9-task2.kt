package lesson_9

fun main() {
    val arrayOfIngredients = mutableListOf("Лук", "Яйцо", "Колбаса")
    println("В рецепте есть базовые ингредиенты: ${arrayOfIngredients.joinToString()}")
    println("Желаете добавить еще?")
    val answer = readln()

    if (answer.equals("да", ignoreCase = true)) {
        println("Какой ингредиент вы хотите добавить?")
        val newIngredient = readln()
        arrayOfIngredients.add(newIngredient)
        println("Теперь в рецепте есть следующие ингредиенты: ${arrayOfIngredients.joinToString()}")
         }
    else { return }
}