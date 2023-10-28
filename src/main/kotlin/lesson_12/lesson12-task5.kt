package lesson_12

class Weather4(val temperatureOfDay: Int, val temperatureOfNight: Int, val isRain: Boolean, val pressure: Int)

fun main() {
    val random = kotlin.random.Random
    val list = mutableListOf<Weather4>()
    var medianRain = 0

    for (i in 1..10) {
        list += Weather4(
            temperatureOfDay = (10..29).random(),
            temperatureOfNight = (5..20).random(),
            isRain = random.nextBoolean(),
            pressure = (700..800).random()
        )
    }

    for (i in list) {
        if (i.isRain) { medianRain += 1 }
    }

    println(
        """Среднее значение температур днем:${list.map { it.temperatureOfDay }.average()}
        |Среднее значение температур ночью: ${list.map { it.temperatureOfNight }.average()}
        |Среднее атмосферное давление: ${list.map { it.pressure }.average()}
        |Дождливых дней: ${medianRain}
    """.trimMargin()
    )
}