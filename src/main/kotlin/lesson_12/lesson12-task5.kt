package lesson_12

import java.util.Random

class Weather3(val temperatureOfDay: Int, val temperatureOfNight: Int, val isRain: Boolean, val pressure: Int)

fun main() {
    val random = Random()
    val list = mutableListOf<Weather3>()
    var medianTempOfDay: Long = 0
    var medianTempOfNight: Long = 0
    var medianRain = 0
    var medianPressure: Long = 0

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

    println("""Среднее значение температур днем:${medianTempOfDay / list.size}
        |Среднее значение температур ночью: ${medianTempOfNight / list.size}
        |Среднее атмосферное давление: ${medianPressure / list.size}
        |Дождливых дней: ${medianRain}
    """.trimMargin())
}