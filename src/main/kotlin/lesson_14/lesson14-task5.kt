package lesson_14

open class Message(
    val id: Int,
    val author: String,
    val text: String,
)

class ChildMessage(
    id: Int,
    author: String,
    text: String,
    val parentMessageId: Int,
) : Message(id, author, text)

class Chat {
    private val messages = mutableListOf<Message>()

    fun addMessage(author: String, text: String) {
        val id = messages.size + 1
        val message = Message(id, author, text)
        messages.add(message)
    }

    fun addThreadMessage(author: String, text: String, parentMessageId: Int) {
        val id = messages.size + 1
        val childMessage = ChildMessage(id, author, text, parentMessageId)
        messages.add(childMessage)
    }

    fun printChat() {
        val groupedMessages = messages.groupBy {
            if (it is ChildMessage) it.parentMessageId else it.id
        }

        for (group in groupedMessages) {

            for (message in group.value) {
                if (message is ChildMessage) println("\t${message.author}: ${message.text}")
                else println("${message.author}: ${message.text}")
            }

        }

    }
}

fun main() {
    val chat = Chat()

    chat.addMessage("Alice", "Hello everyone!")
    chat.addMessage("Bob", "Hi Alice!")
    chat.addThreadMessage("Charlie", "Hi Alice!", 1)
    chat.addThreadMessage("Bobby", "Hi Alice!", 1)
    chat.addThreadMessage("John", "Hi Alice!", 1)
    chat.addThreadMessage("Dave", "Hi Bob!", 2)

    chat.printChat()
}
