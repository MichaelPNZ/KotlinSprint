package lesson_8

fun main() {
    val arrayOfIngredients = arrayOf("квас", "картошка", "яйцо", "лук", "огурец", "колбаса", "сметана", "зелень")

    println("Введите ингредиент: ")
    val ingredient = readLine().toString()

    if (arrayOfIngredients.contains(ingredient)) println("Ингредиент ${ingredient} в рецепте есть")
    else println("Такого ингредиента в рецепте нет")
}