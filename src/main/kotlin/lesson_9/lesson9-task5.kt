package lesson_9

fun main() {
    val array = mutableListOf<String>()
    println("Введите 5 ингредиентов")

    for (i in 1..5) {
        println("Ингредиент ${i}: ")
        val ingredient = readln()

        if (array.contains(ingredient)) continue
        else array.add(ingredient)
    }

    val separator = ","
    val sortedArray = array.sorted().joinToString(separator).replaceFirstChar { it.uppercase() }
    sortedArray.forEach { print(it) }
}