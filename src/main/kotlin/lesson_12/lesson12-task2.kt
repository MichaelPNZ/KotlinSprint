package lesson_12

class Weather2(var temperatureOfDay: Int, var temperatureOfNight: Int, var isRain: Boolean, var pressure: Int) {

    fun print() { println("температура днем: ${temperatureOfDay}, температура ночью: ${temperatureOfNight}, давление: ${pressure}, дождь: ${isRain}.") }
}

fun main() {
    val weather = Weather2(temperatureOfDay = 28, temperatureOfNight = 15, isRain = false, pressure = 770)
    weather.print()

    val weather2 = Weather2(temperatureOfDay = 5, temperatureOfNight = -10, isRain = false, pressure = 750)
    weather2.print()
}