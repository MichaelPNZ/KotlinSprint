package lesson_8

fun main() {
    val arrayOfIngredients = mutableListOf("перец","яйцо","сыр","картофель","майонез","кукуруза","лук")
    println("Список ингредиентов: ${arrayOfIngredients.joinToString()}")

    println("Какой ингредиент вы хотите заменить?")
    val changedIngredient = readln()

    if (arrayOfIngredients.contains(changedIngredient)) {
        arrayOfIngredients.remove(changedIngredient)

        println("Какой ингредиент добавыть?")
        val newIngredient = readln()
        arrayOfIngredients.add(newIngredient)

        println("Готово! Вы сохранили следующий список: ${arrayOfIngredients.joinToString()}")
    } else {
        println("Такого ингредиента нет в списке!")
    }
}