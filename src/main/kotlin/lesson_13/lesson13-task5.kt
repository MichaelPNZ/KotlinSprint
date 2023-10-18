package lesson_13

class PhoneBook5(val name: String, val phoneNumber: Long?, val company: String?) {
    fun print() { println("-Имя: ${ name }\n-Номер: ${ phoneNumber }\n-Компания: ${ company }") }
}

fun main() {

    println("Введите номер телефона(только цифры)")
    try {
        val phoneNumber = readln().toLong()
        val contact = PhoneBook5(name = "Petr", phoneNumber, company = "Pepsi")
        contact.print()
    } catch (e: Exception) {
        println("Вы ввели:  ${e.message}")
    }
}