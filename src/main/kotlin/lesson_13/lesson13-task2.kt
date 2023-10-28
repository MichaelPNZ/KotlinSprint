package lesson_13

class PhoneBook2(val name: String, val phoneNumber: Long, val company: String? = null) {
    fun print() { println("-Имя: ${ name }\n-Номер: ${ phoneNumber }\n-Компания: ${ company ?: "<не указано>" }") }
}

fun main() {
    val contact = PhoneBook2("Michael", 89998887799)
    contact.print()
}