package lesson_16

class Gamer(val name: String, var health: Int, var power: Int) {

    private var isDead = false

    fun healing(healthPoint: Int) {
        health += healthPoint
        println("Лечимся на ${health} единиц.")
    }

    fun damage(damagePoint: Int) {
        health -= damagePoint
        println("Нанесено ${damagePoint} урона.")
        deadGamer()
    }

    private fun deadGamer() {
        if (health <= 0) {
            power = 0
            health = 0
            isDead = true
            println("Игрок умер")
        }
    }
}

fun main() {

    val gamer = Gamer("Billy", 200, 50)
    gamer.damage(57)
    gamer.healing(66)
    gamer.damage(51)
    gamer.damage(50)
    gamer.damage(49)
    gamer.damage(62)

}