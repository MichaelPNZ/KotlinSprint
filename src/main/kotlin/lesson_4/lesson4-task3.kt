package lesson_4

fun main() {
    val isSunny = true
    val isAwningOpen = true
    val humidity = 20
    val season = "зима"

    println("Благоприятные ли условия сейчас для роста бобовых? ${
        (isSunny == IS_SUN) &&
                (isAwningOpen == IS_AWNING_OPEN) &&
                (humidity == AIR_HUMIDITY) &&
                (season != SEASON)
    }")
}

const val IS_SUN = true
const val IS_AWNING_OPEN = true
const val AIR_HUMIDITY = 20
const val SEASON = "зима"