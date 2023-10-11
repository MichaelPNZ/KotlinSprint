package lesson_9

fun main() {
    val arrayOfIngredients = listOf(2, 50, 15)
    println("Какое количство порций вам надо?")
    val count = readln().toInt()

    val result = arrayOfIngredients.map { it * count }

    println("На ${count} порций вам понадобится: Яиц – ${result[0]}шт., молока – ${result[1]}мл., сливочного масла – ${result[2]}гр.")
}