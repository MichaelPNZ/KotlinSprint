package lesson_12

class Weather3(val temperatureOfDay: Int, val temperatureOfNight: Int, val isRain: Boolean = false, val pressure: Int) {
    fun print() {
        println("температура днем: ${temperatureOfDay}, температура ночью: ${temperatureOfNight}, давление: ${pressure}, дождь: ${isRain}.")
    }
}

fun main() {
    val weather = Weather3(temperatureOfDay = 28, temperatureOfNight = 15, isRain = true, pressure = 770)
    weather.print()

    val weather2 = Weather3(temperatureOfDay = 5, temperatureOfNight = -10, pressure = 750)
    weather2.print()
}