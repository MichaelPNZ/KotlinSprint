package lesson_14

abstract class CelestialObject {
    abstract val name: String
    abstract val isAtmosphere: Boolean
    abstract val isBoarding: Boolean
}

class Planet(
    override val name: String,
    override val isAtmosphere: Boolean,
    override val isBoarding: Boolean,
    val listOfSatellite: List<String>,
) : CelestialObject() {}

class Satellite(
    override val name: String,
    override val isAtmosphere: Boolean,
    override val isBoarding: Boolean,
) : CelestialObject() {}

fun main() {
    val satelliteOne = Satellite("Satellite One", true, false)
    val satelliteTwo = Satellite("Satellite Two", false, true)

    val planet = Planet("Honor", true, true, listOf(satelliteOne.name, satelliteTwo.name))
    println("Планета ${planet.name} имеет спутники: ${planet.listOfSatellite} ")
}