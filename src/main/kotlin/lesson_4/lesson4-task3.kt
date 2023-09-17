package lesson_4

fun main() {
    val sun = true
    val openTent = true
    val humidity = 20
    val season = "зима"

    println("Благоприятные ли условия сейчас для роста бобовых? ${
        (sun == SUN) &&
                (openTent == OPEN_TENT) &&
                (humidity == AIR_HUMIDITY) &&
                (season != SEASON)
    }")
}

const val SUN = true
const val OPEN_TENT = true
const val AIR_HUMIDITY = 20
const val SEASON = "зима"