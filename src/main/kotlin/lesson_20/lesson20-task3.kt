package lesson_20

class Gamer (val isKey: Boolean)

val openDoor: (Gamer) -> Unit = {
    if (it.isKey) println("Игрок открыл дверь")
    else println("Дверь заперта, у вас нет ключа")
}

fun main() {

    val gamer = Gamer(true)

    openDoor(gamer)

}