package lesson_12

class Weather() {

    var temperatureOfDay = 18
    var temperatureOfNight = 10
    var isRain = false
    var pressure = 750

    fun print() { println("температура днем: ${temperatureOfDay}, температура ночью: ${temperatureOfNight}, давление: ${pressure}, дождь: ${isRain}.") }
}

fun main() {
    val weather = Weather()
    weather.temperatureOfDay = 24
    weather.temperatureOfNight = 14
    weather.isRain = true
    weather.pressure = 720
    weather.print()

    val weather2 = Weather()
    weather2.temperatureOfDay = 30
    weather2.temperatureOfNight = 20
    weather2.isRain = false
    weather2.pressure = 760
    weather2.print()
}

