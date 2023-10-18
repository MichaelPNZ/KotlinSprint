package lesson_13

class PhoneBook(val name: String, val phoneNumber: Long, val company: String?) {}

fun main() {
    val contact = PhoneBook("Michael", 89998887799, null ?: "")
    contact.name.length
    contact.phoneNumber
    println(contact.company?.length ?: 0)
}