package lesson_15

abstract class User {
    abstract val name: String

    abstract fun sendMessage(message: String)

    fun readMessage() {
        println("Полозователь ${name} прочел сообщение.")
    }
}

class Member(
    override val name: String,
) : User() {

    var currentMessage: String = ""

    override fun sendMessage(message: String) {
        currentMessage = message
        println("${name}: ${message}")
    }

}

class Administrator(
    override val name: String,
) : User() {

    var currentMessage: String = ""

    fun deletedMessage(message: String) {
        println("Сообщение <${message}> удалено")
    }

    fun deletedMember(name: String) {
        println("Пользователь <${name}> удален")
    }

    override fun sendMessage(message: String) {
        currentMessage = message
        println("${name}: ${message}")
    }

}

fun main() {
    val memberOne = Member("Petr")
    val memberTwo = Member("Yana")
    val memberThree = Member("Olya")

    val administratorOne = Administrator("Ivan")
    val administratorTwo = Administrator("Dima")
    val administratorThree = Administrator("Katya")

    memberOne.sendMessage("Hello!")
    memberTwo.readMessage()
    memberThree.readMessage()

    administratorOne.sendMessage("Hi!")
    administratorTwo.deletedMember(memberOne.name)
    administratorThree.deletedMessage(administratorOne.currentMessage)
}