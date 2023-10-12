package lesson_12

class Weather2(_temperatureOfDay: Int, _temperatureOfNight: Int, _isRain: Boolean, _pressure: Int) {

    var temperatureOfDay = _temperatureOfDay
    var temperatureOfNight = _temperatureOfNight
    var isRain = _isRain
    var pressure = _pressure

    fun print() { println("температура днем: ${temperatureOfDay}, температура ночью: ${temperatureOfNight}, давление: ${pressure}, дождь: ${isRain}.") }
}

fun main() {
    val weather = Weather2(_temperatureOfDay = 28, _temperatureOfNight = 15, _isRain = false, _pressure = 770)
    weather.print()

    val weather2 = Weather2(_temperatureOfDay = 5, _temperatureOfNight = -10, _isRain = false, _pressure = 750)
    weather2.print()
}