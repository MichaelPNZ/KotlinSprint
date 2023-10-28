package lesson_14

open class Liner (
    val name: String,
    val speed: Int,
    val passengers: Int = 5000
)

class Cargo (
    name: String,
    speed: Int,
    passengers: Int,
    val tonnage: Int = 40000
) : Liner(name, speed, passengers)

class Icebreaker (
    name: String,
    speed: Int,
    passengers: Int,
    val iceBreaking: Boolean,
) : Liner(name, speed, passengers)

fun main() {
    val liner = Liner("Лайнер", 15)
    println("${liner.name}, скорость: ${liner.speed}, пассажиров: ${liner.passengers}")
    val cargo = Cargo("Грузовой", 10, 1000)
    println("${cargo.name}, скорость: ${cargo.speed}, пассажиров: ${cargo.passengers}, грузоподъемность: ${cargo.tonnage}")
    val icebreaker = Icebreaker("Ледокол", 5, 700, true)
    println("${icebreaker.name}, скорость: ${icebreaker.speed}, пассажиров: ${icebreaker.passengers}, может колоть лёд: ${icebreaker.iceBreaking}")}