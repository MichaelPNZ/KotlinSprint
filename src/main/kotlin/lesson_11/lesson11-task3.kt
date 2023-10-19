package lesson_11

class Room(
    val id: Int,
    val coverRoom: String,
    val nameRoom: String,
    val participantList: Member,
    val userName: String,
    var status: String,
) {
    fun longPressed() {
        println("Было долгое нажатие")
        println(userName)
    }

    fun testPrint() {
        println("""
            |Проверка информации
            |${id}
            |${coverRoom}
            |${nameRoom}
            |${participantList.list}
            |${userName}
            |${status}
            |-------------------
        """.trimIndent())
    }

    class Member(val list: List<String>) {}
}

fun main() {
    val memberOne = Room.Member(listOf("Petya", "Kolya"))
    val memberTwo = Room.Member(listOf("Katya", "Kolya"))
    val memberThree = Room.Member(listOf("Petya", "Kolya", "Tolya"))

    val room1 = Room(
        id = 1,
        coverRoom = "Картанка бабочки",
        nameRoom = "бабочки",
        participantList = memberOne ,
        userName = memberOne.list[0],
        status = "пользователь заглушен"
    )

    val room2 = Room(
        id = 2,
        coverRoom = "Картанка колеса",
        nameRoom = "обсуждение колес",
        participantList = memberTwo,
        userName = memberTwo.list[1],
        status = "разговаривает"
    )

    val room3 = Room(
        id = 3,
        coverRoom = "Картанка монитора",
        nameRoom = "мониторы тут",
        participantList = memberThree,
        userName = memberThree.list[2],
        status = "микрофон выключен"
    )

    room1.testPrint()
    room1.longPressed()
    room2.testPrint()
    room2.longPressed()
    room3.testPrint()
    room3.longPressed()
}