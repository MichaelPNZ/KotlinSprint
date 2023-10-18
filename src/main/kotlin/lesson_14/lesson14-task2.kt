package lesson_14

open class LinerOne(
    val name: String,
    val speed: Int,
    val passengers: Int = 5000,
) {
    open fun loadingMethod() { println("$name выдвигает горизонтальный трап со шкафута") }
}

class CargoOne(
    name: String,
    speed: Int,
    passengers: Int,
    val tonnage: Int = 40000,
) : LinerOne(name, speed, passengers) {
    override fun loadingMethod() { println("$name корабль активирует погрузочный кран") }
}

class IcebreakerOne(
    name: String,
    speed: Int,
    passengers: Int,
    val iceBreaking: String = "Может колоть лёд",
) : LinerOne(name, speed, passengers) {
    override fun loadingMethod() { println("$name открывает ворота со стороны кормы.") }
}

fun main() {
    val linerOne = LinerOne("Лайнер", 15)
    println("${linerOne.name}, скорость: ${linerOne.speed}, пассажиров: ${linerOne.passengers}")
    linerOne.loadingMethod()
    val cargoOne = CargoOne("Грузовой", 10, 1000)
    println("${cargoOne.name}, скорость: ${cargoOne.speed}, пассажиров: ${cargoOne.passengers}, грузоподъемность: ${cargoOne.tonnage}")
    cargoOne.loadingMethod()
    val icebreakerOne = IcebreakerOne("Ледокол", 5, 700)
    println("${icebreakerOne.name}, скорость: ${icebreakerOne.speed}, пассажиров: ${icebreakerOne.passengers}, ${icebreakerOne.iceBreaking}")
    icebreakerOne.loadingMethod()
}