package lesson_11

class Room(
    val id: Int,
    val coverRoom: String,
    val nameRoom: String,
    val participantList: List<String>,
    val userName: String,
    var status: String,
) {
    fun longPressed() {
        println("Было долгое нажатие")
        println(userName)
    }

    fun testPrint() {
        println("-------------------")
        println(id)
        println(coverRoom)
        println(nameRoom)
        println(participantList)
        println(userName)
        println(status)
        println("-------------------")
    }
}

fun main() {
    val room1 = Room(
        id = 1,
        coverRoom = "Картанка бабочки",
        nameRoom = "бабочки",
        participantList = arrayListOf("Petya", "Kolya"),
        userName = "Petya",
        status = "пользователь заглушен"
    )

    val room2 = Room(
        id = 2,
        coverRoom = "Картанка колеса",
        nameRoom = "обсуждение колес",
        participantList = arrayListOf("Petya", "Kolya"),
        userName = "Kolya",
        status = "разговаривает"
    )

    val room3 = Room(
        id = 3,
        coverRoom = "Картанка монитора",
        nameRoom = "мониторы тут",
        participantList = arrayListOf("Petya", "Kolya", "Tolya"),
        userName = "Tolya",
        status = "микрофон выключен"
    )

    room1.testPrint()
    room1.longPressed()
    room2.testPrint()
    room2.longPressed()
    room3.testPrint()
    room3.longPressed()
}