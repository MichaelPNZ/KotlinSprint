package lesson_14

open class Chat(
//    val id: Int,
    val name: String,
    val text: String,
    val listOfMessage: MutableMap<String, String> = mutableMapOf(),
    val listOfTreadMessage: MutableMap<Int, String> = mutableMapOf(),
) {
    fun addMessage(name: String, text: String) {
        listOfMessage.put(name, text)
    }

    fun addThreadMessage(name: String, text: String, parentMessageId: Int) {
        listOfTreadMessage.put(parentMessageId, name)
        listOfMessage.put(name, text)
    }
}

class Message(
//    id: Int,
    text: String,
    name: String,
) : Chat(name, text) {

}


class ChildMessage(
//    id: Int,
    text: String,
    name: String,
) : Chat(name, text) {

}

fun main() {
    val childMessage = ChildMessage("Katya", "adadsqawdq")
    val message = Message("Petya", "assfadf")
    val chat = Chat("Про осень", "d")
    message.listOfMessage.forEach { println("${it.key}: ${it.value}") }
}