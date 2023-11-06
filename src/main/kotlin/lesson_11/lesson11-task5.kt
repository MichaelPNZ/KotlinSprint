package lesson_11

class MemberForum(
    val userId: Int,
    val userName: String,
)

class MessageForum(
    val authorId: Int,
    val message: String,
)

class Forum {

    private val userList = mutableListOf<MemberForum>()
    private val messageList = mutableListOf<MessageForum>()

    fun createNewUser(name: String) {
        val id = userList.size + 1
        val newUser = MemberForum(id, name)
        userList.add(newUser)
    }

    fun createNewMessage(authorId: Int, message: String) {
        val checkId = userList.any { it.userId == authorId }

        if (checkId) {
            val newMessage = MessageForum(authorId, message)
            messageList.add(newMessage)
        } else {
            println("Пользователя с id $authorId не существует.")
        }

    }

    fun printThread() {
        for (message in messageList) {
            val author = userList.find { it.userId == message.authorId }
            println("${author?.userName ?: "Unknown User"}: ${message.message}")
        }
    }

}

fun main() {

    val forum = Forum()

    forum.createNewUser("Misha")
    forum.createNewUser("Sergey")
    forum.createNewMessage(0, "Hello!")
    forum.createNewMessage(1, "Hello!!!")
    forum.printThread()

}