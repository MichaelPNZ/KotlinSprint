package lesson_4

fun main() {
    val day = 5
    val isEven = day % 2
    val hands = 1
    val legs = 2
    val back = 2
    val press = 1

    val program = """
      Упражнения для рук: ${isEven == hands}
      Упражнения для ног: ${isEven == legs}
      Упражнения для спины: ${isEven == back}
      Упражнения для пресса: ${isEven == press}
    """.trimIndent()

    println(program)
}