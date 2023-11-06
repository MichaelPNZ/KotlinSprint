package lesson_19

enum class Gender() {
    MAN,
    WOMAN,
    OTHER
}

data class Person(val name: String, val gender: Gender)

fun main() {

    val personList = mutableListOf<Person>()

    println(
        """Здраствуйте! Пожалуйста, введите данные о 5-ти людях.
        |Имя c заглавной буквы, пол английскими буквами (man/woman/other)""".trimMargin()
    )

    for (i in 1..5) {
        println("Введите имя $i:")
        val name = readln()
        println("Имя \"$name\" добавлено")

        println("Введите пол:")
        val gender = readln()

        val genderType = when (gender.uppercase()) {
            "MAN" -> {
                println("Пол \"$gender\" добавлен")
                Gender.MAN
            }

            "WOMAN" -> {
                println("Пол \"$gender\" добавлен")
                Gender.WOMAN
            }

            "OTHER" -> {
                println("Пол \"$gender\" добавлен")
                Gender.OTHER
            }

            else -> {
                println("Неверное значение пола. Повторите ввод.")
                continue
            }
        }

        val person = Person(name, genderType)
        personList.add(person)

    }

    println("Список людей в Картотеке:")
    for ((index, person) in personList.withIndex()) {
        println("${index + 1}. Имя: ${person.name}, Пол: ${person.gender}")
    }

}