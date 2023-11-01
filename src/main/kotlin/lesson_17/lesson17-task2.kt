package lesson_17

class Ship(name: String) {

    var name = name
        set(value) {
            println("Изменять имя нельзя!")
        }
    val averageSpeed = 20
    val homePort = "Vladivostok"

}

fun main() {

    val ship = Ship("Vol'niy")
    println(ship.name)
    ship.name = "sdad"
    println(ship.name)

}