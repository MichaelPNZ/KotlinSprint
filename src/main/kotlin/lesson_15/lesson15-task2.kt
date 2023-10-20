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
    override val temperature: Double,
    override val precipitationAmount: Int,
) : WeatherStationStats() {

    fun sendMessage(i: Any) {
        if (i == temperature) println("Температура: $i")
        else println("Количество осадков: $precipitationAmount")
    }
}

fun main() {
    val temperature = Temperature(22.4, 200)
    val precipitationAmount = PrecipitationAmount(11.1, 233)
    val message = WeatherServer(temperature.temperature, precipitationAmount.precipitationAmount)

    message.sendMessage(message.temperature)
}

