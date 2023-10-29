package lesson_15

abstract class Forum {
    abstract val name: String
    abstract val message: String

    fun sendMessage() { println("${name}: ${message}") }

    fun readMessage() {
        println("Полозователь ${name} прочел сообщение.")
    }
}

class Member(
    override val name: String,
    override val message: String,
) : Forum()

class Administrator(
    override val name: String,
    override val message: String,
) : Forum() {

    fun deletedMessage() { println("Сообщение <${message}> удалено") }

    fun deletedMember() { println("Пользователь <${name}> удален") }

}

fun main() {
    val memberOne = Member("Petr", "Hello!")
    val memberTwo = Member("Yana", "Hello!! =)")
    val memberThree = Member("Olya", "Hello!!!!!")

    val administratorOne = Administrator("Ivan", "Hi!")
    val administratorTwo = Administrator("Dima", "Hi!!!")
    val administratorThree = Administrator("Katya", "Hi!!!!!!")

    memberOne.sendMessage()
    memberTwo.readMessage()
    memberThree.readMessage()

    administratorOne.sendMessage()
    administratorTwo.deletedMember()
    administratorThree.deletedMessage()
}