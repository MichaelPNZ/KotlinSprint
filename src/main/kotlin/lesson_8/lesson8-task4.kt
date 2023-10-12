package lesson_8

fun main() {
    val arrayOfIngredients = arrayOf("перец","яйцо","сыр","картофель","майонез","кукуруза","лук")
    println("Список ингредиентов: ${arrayOfIngredients.joinToString()}")
    println("Какой ингредиент вы хотите заменить?")
    val changedIngredient = readln()

    if (changedIngredient in arrayOfIngredients) {
        println("Какой ингредиент добавыть?")
        val newIngredient = readln()
        arrayOfIngredients.set(arrayOfIngredients.indexOf(changedIngredient), newIngredient)
        println("Готово! Вы сохранили следующий список: ${arrayOfIngredients.joinToString()}")
    } else {
        println("Такого ингредиента нет в списке!")
    }
}