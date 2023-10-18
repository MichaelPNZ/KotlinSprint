package lesson_12

class Weather3(val temperatureOfDay: Int, val temperatureOfNight: Int, val isRain: Boolean, val pressure: Int)

fun main() {
    val random = kotlin.random.Random
    val list = mutableListOf<Weather3>()
    var medianTempOfDay = listOf<Int>()
    var medianTempOfNight = listOf<Int>()
    var medianRain = 0
    var medianPressure = listOf<Int>()

    for (i in 1..10) {
        list += Weather3(temperatureOfDay = (10..29).random(),
        temperatureOfNight = (5..20).random(),
        isRain = random.nextBoolean(),
        pressure = (700..800).random())
    }

    for (i in list) {
        medianTempOfDay += i.temperatureOfDay
        medianTempOfNight += i.temperatureOfNight
        medianPressure += i.pressure

        if (i.isRain) { medianRain += 1 }
    }

    println("""Среднее значение температур днем:${ medianTempOfDay.average() }
        |Среднее значение температур ночью: ${ medianTempOfNight.average() }
        |Среднее атмосферное давление: ${ medianPressure.average() }
        |Дождливых дней: ${ medianRain }
    """.trimMargin())
}