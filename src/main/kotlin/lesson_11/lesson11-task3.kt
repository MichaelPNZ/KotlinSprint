package lesson_11

class Room(
    val id: Int,
    val coverRoom: String,
    val nameRoom: String,
    val participantList: List<Member>,
    val userName: String,
    var status: String,
) {
    fun longPressed() {
        println("Было долгое нажатие")
        println(userName)
    }

    fun printContact() {
        println("Список контактов:")
        participantList.forEach { println(it.user) }
    }

    fun testPrint() {
        println(
            """
            |-------------------
            |Проверка информации
            |${id}
            |${coverRoom}
            |${nameRoom}
            |${userName}
            |${status}
        """.trimIndent()
        )
    }
}

class Member(val user: String)

fun main() {
    val memberOne = Member("Petya")
    val memberTwo = Member("Katya")
    val memberThree = Member("Tolya")

    val room1 = Room(
        id = 1,
        coverRoom = "Картанка бабочки",
        nameRoom = "бабочки",
        participantList = listOf(memberOne, memberTwo, memberThree),
        userName = memberOne.user,
        status = "пользователь заглушен"
    )

    val room2 = Room(
        id = 2,
        coverRoom = "Картанка колеса",
        nameRoom = "обсуждение колес",
        participantList = listOf(memberOne, memberTwo),
        userName = memberTwo.user,
        status = "разговаривает"
    )

    val room3 = Room(
        id = 3,
        coverRoom = "Картанка монитора",
        nameRoom = "мониторы тут",
        participantList = listOf(memberTwo, memberThree),
        userName = memberThree.user,
        status = "микрофон выключен"
    )

    room1.testPrint()
    room1.printContact()
    room1.longPressed()
    room2.testPrint()
    room2.printContact()
    room2.longPressed()
    room3.testPrint()
    room3.printContact()
    room3.longPressed()
}