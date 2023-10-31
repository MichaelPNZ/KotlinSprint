package lesson_15


abstract class WeatherStationStats{

    abstract val temperature: Double
    abstract val precipitationAmount: Int

}

class Temperature(
    override val temperature: Double,
    override val precipitationAmount: Int,
) : WeatherStationStats()

class PrecipitationAmount(
    override val temperature: Double,
    override val precipitationAmount: Int,
) : WeatherStationStats()

class WeatherServer(
    val temperature: Double,
    val precipitationAmount: Int,
) {

    fun sendMessage(parameter: WeatherStationStats) {
        if (temperature == parameter.temperature ) println("Температура: ${temperature}")
        else println("Количество осадков: ${precipitationAmount}")
    }
}

fun main() {
    val temperature = Temperature(22.4, 200)
    val precipitationAmount = PrecipitationAmount(11.1, 233)

    val messageOne = WeatherServer(temperature.temperature, precipitationAmount.precipitationAmount)
    messageOne.sendMessage(precipitationAmount)
}

