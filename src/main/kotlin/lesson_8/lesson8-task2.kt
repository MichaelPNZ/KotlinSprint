package lesson_8

fun main() {
    val arrayOfIngredients = arrayOf("квас", "картошка", "яйцо", "лук", "огурец", "колбаса", "сметана", "зелень")

    println("Введите ингредиент: ")
    val ingredient = readln()

    if (ingredient in arrayOfIngredients) println("Ингредиент ${ingredient} в рецепте есть")
    else println("Такого ингредиента в рецепте нет")
}