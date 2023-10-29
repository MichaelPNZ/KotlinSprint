package lesson_13

class PhoneBook3(val name: String, val phoneNumber: Long, val company: String? = null) {
    fun print() { println("-Имя: ${ name }\n-Номер: ${ phoneNumber }\n-Компания: ${ company ?: "<не указано>" }") }
}

fun main() {
    val contactInfoList = listOf(PhoneBook3("Michael", 8999888471, "Adidas"),
        PhoneBook3("Timofey", 89998887799),
        PhoneBook3("Janna", 89998887854, "null"),
        PhoneBook3("Katrin", 89998887547, "Rostics"),
        PhoneBook3("Rafik", 89998887235))

    contactInfoList.forEach() { it.print() }
}