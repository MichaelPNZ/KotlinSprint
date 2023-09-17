package lesson_4

fun main() {
    val day = 5
    val typeProgram = day % 2

    val program = """
      Упражнения для рук: ${typeProgram != 0}
      Упражнения для ног: ${typeProgram == 0}
      Упражнения для спины: ${typeProgram == 0}
      Упражнения для пресса: ${typeProgram != 0}
    """.trimIndent()
    println(program)
}