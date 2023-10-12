package lesson_13

class PhoneBook4(val name: String, val phoneNumber: Long?, val company: String?) {
    fun print() { println("-Имя: ${name}\n-Номер: ${phoneNumber}\n-Компания: ${company}") }
}

fun main() {
    val listContact = mutableListOf<PhoneBook4>()
    var isNext = true

    while (isNext) {
        println("Введите имя")
        val name = readln()
        println("Введите номер")
        val phoneNumber = readln().toLongOrNull()
        println("Введите имя компании, если ходите пропустить, нажмите Enter")
        val company = readln()
        listContact += PhoneBook4(name, phoneNumber, null ?: company)
        println("Продолжаем? Дальше/Стоп")
        val userAnswer = readln()

        if (userAnswer.equals("стоп", ignoreCase = true)) { isNext = false }
    }
    listContact.forEach() { it.print() }
}