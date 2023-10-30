package lesson_14

open class LinerOne(
    val name: String,
    val speed: Int,
    val passengers: Int = 5000,
) {
    open fun load() { println("$name выдвигает горизонтальный трап со шкафута") }
}

class CargoOne(
    name: String,
    speed: Int,
    passengers: Int,
    val tonnage: Int = 40000,
) : LinerOne(name, speed, passengers) {
    override fun load() { println("$name корабль активирует погрузочный кран") }
}

class IcebreakerOne(
    name: String,
    speed: Int,
    passengers: Int,
    val iceBreaking: Boolean,
) : LinerOne(name, speed, passengers) {
    override fun load() { println("$name открывает ворота со стороны кормы.") }
}

fun main() {
    val linerOne = LinerOne("Лайнер", 15)
    println("${linerOne.name}, скорость: ${linerOne.speed}, пассажиров: ${linerOne.passengers}")

    linerOne.load()

    val cargoOne = CargoOne("Грузовой", 10, 1000)
    println("${cargoOne.name}, скорость: ${cargoOne.speed}, пассажиров: ${cargoOne.passengers}, грузоподъемность: ${cargoOne.tonnage}")

    cargoOne.load()

    val icebreakerOne = IcebreakerOne("Ледокол", 5, 700, true)
    println("${icebreakerOne.name}, скорость: ${icebreakerOne.speed}, пассажиров: ${icebreakerOne.passengers}, может колоть лёд: ${icebreakerOne.iceBreaking}")

    icebreakerOne.load()
}