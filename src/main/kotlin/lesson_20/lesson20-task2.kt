package lesson_20

class Gamer(
    var name: String,
    var currentHealth: Int,
    val maxHealth: Int,
)

val healing: (Gamer) -> Unit = { gamer ->
    val healthToRestore = gamer.maxHealth - gamer.currentHealth
    if (healthToRestore > 0) {
        println("${gamer.name} использует лечебное зелье.")
        gamer.currentHealth = gamer.maxHealth
        println("${gamer.name} восстановил $healthToRestore здоровья. Теперь его здоровье: ${gamer.maxHealth}")
    } else {
        println("${gamer.name} уже полностью здоров.")
    }
}

fun main() {

    val gamer = Gamer("Person", 300, 500)
    healing(gamer)
    healing(gamer)
}