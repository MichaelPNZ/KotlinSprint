package lesson_13

class PhoneBook3(val name: String, val phoneNumber: Long, val company: String?) {
    fun print() { println("-Имя: ${ name }\n-Номер: ${ phoneNumber }\n-Компания: ${ company }") }
}

fun main() {
    val list = listOf(PhoneBook3("Michael", 8999888471, "Adidas"),
        PhoneBook3("Timofey", 89998887799, null ?: "<не указано>"),
        PhoneBook3("Janna", 89998887854, "null"),
        PhoneBook3("Katrin", 89998887547, "Rostics"),
        PhoneBook3("Rafik", 89998887235, null ?: "<не указано>"))

    list.forEach() { it.print() }
}