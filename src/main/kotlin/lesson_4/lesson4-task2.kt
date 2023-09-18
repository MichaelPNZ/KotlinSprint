package lesson_4

fun main() {
    val weightCargoOne = 20
    val volumeCargoOne = 80

    val weightCargoTwo = 50
    val volumeCargoTwo = 100

    println("Груз весом $weightCargoOne и объемом $volumeCargoOne соответствуем категории 'Average': ${
        weightCargoOne >= MIN_WEIGHT_AVERAGE &&
                weightCargoOne <= MAX_WEIGHT_AVERAGE &&
                volumeCargoOne < VOLUME_AVERAGE
    }")
    println("Груз весом $weightCargoTwo и объемом $volumeCargoTwo соответствуем категории 'Average': ${
        weightCargoTwo >= MIN_WEIGHT_AVERAGE &&
                weightCargoTwo <= MAX_WEIGHT_AVERAGE &&
                volumeCargoTwo < VOLUME_AVERAGE
    }")
}

const val MIN_WEIGHT_AVERAGE = 35
const val MAX_WEIGHT_AVERAGE = 100
const val VOLUME_AVERAGE = 100