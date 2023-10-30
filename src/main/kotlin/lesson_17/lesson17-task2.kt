package lesson_17

class Ship() {

    var name = "Vol'niy"
        set(value) {
            println("Изменять имя нельзя!")
        }
    val averageSpeed = 20
    val homePort = "Vladivostok"

}

fun main() {

    val ship = Ship()
    println(ship.name)
    ship.name = "sdad"
    println(ship.name)

}