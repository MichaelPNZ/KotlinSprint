package lesson_14

open class Message(
    val id: Int,
    val author: String,
    val text: String
)

class ChildMessage(
    id: Int,
    author: String,
    text: String,
    val parentMessageId: Int
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

    private fun printIndentedMessage(message: Message, indentLevel: Int) {
        repeat(indentLevel) { print("\t") }
        println("${message.author}: ${message.text}")
    }

    fun printChat() {
        val groupedMessages = messages.groupBy {
            if (it is ChildMessage) it.parentMessageId else it.id
        }

        val printMessages = mutableListOf<Message>()

        fun printThread(messageId: Int, indentLevel: Int) {
            val message = groupedMessages[messageId]?.first()
            if (message != null) {
                printIndentedMessage(message, indentLevel)
                printMessages.add(message)
                val childMessages = groupedMessages[messageId]?.filterIsInstance<ChildMessage>()
                childMessages?.forEach { childMessage ->
                    printThread(childMessage.id, indentLevel + 1)
                }
            }
        }

        val rootMessages = groupedMessages[0]
        rootMessages?.forEach { rootMessage ->
            printThread(rootMessage.id, 0)
        }
    }
}

fun main() {
    val chat = Chat()

    chat.addMessage("User1", "Hello, how's everyone doing?")
    chat.addMessage("User2", "I'm doing great, thanks!")
    chat.addThreadMessage("User3", "I'm good too!", parentMessageId = 1)
    chat.addThreadMessage("User1", "That's nice to hear!", parentMessageId = 3)
    chat.addMessage("User4", "I have a question.")
    chat.addMessage("User1", "Sure, what's your question?")
    chat.addThreadMessage("User4", "Can you help me with this issue?", parentMessageId = 5)

    chat
    chat.printChat()
}
