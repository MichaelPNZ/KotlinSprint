package lesson_4

fun main() {
    val day = 5
    val isEven = day % 2 == 0
    val hands = !isEven
    val legs = isEven
    val back = isEven
    val press = !isEven

    val program = """
      Упражнения для рук: ${hands}
      Упражнения для ног: ${legs}
      Упражнения для спины: ${back}
      Упражнения для пресса: ${press}
    """.trimIndent()

    println(program)
}