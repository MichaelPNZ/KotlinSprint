package lesson_20

class Gamer (val hasKey: Boolean) {

    fun hasKey(): Boolean { return hasKey }

}

    val openDoor = { gamer: Gamer ->
        if (gamer.hasKey()) println("Игрок открыл дверь")
        else println("Дверь заперта, у вас нет ключа")
    }

fun main() {

    val gamer = Gamer(true)

    openDoor(gamer)

}