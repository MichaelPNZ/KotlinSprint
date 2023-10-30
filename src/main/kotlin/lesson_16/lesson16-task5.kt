package lesson_16

class Gamer() {

    val name = "Billy"
    private var health = 300
    var power = 80

    private fun healing() {
        health += 20
        println("Здоровье опустилось ниже 200, лечимся на 20 единиц(${health}).")
    }

    fun damage() {
        health -= power
        println("Нанесено ${power} урона.")

        if ( health <= 0) {
            power = 0
            health = 0
            println("Игрок умер")
        } else if (health < 200) healing()
    }
}

fun main() {

    val gamer = Gamer()
    gamer.damage()
    gamer.damage()
    gamer.damage()
    gamer.damage()
    gamer.damage()

}