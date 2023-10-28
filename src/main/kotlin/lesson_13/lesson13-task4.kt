package lesson_13

class PhoneBook4(val name: String, val phoneNumber: Long?, val company: String? = null) {
    fun print() { println("-Имя: ${ name }\n-Номер: ${ phoneNumber }\n-Компания: ${ if (company?.isEmpty() == true) "<не указано>" else company }") }
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

        if (phoneNumber != null) { listContact += PhoneBook4(name, phoneNumber, company) }

        println("Продолжаем? Дальше/Стоп")
        val userAnswer = readln()

        if (userAnswer.equals("стоп", ignoreCase = true)) { isNext = false }
    }
    listContact.forEach() { it.print() }
}