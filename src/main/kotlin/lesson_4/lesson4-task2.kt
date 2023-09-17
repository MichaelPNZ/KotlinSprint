package lesson_4

fun main() {
    val weightCargoOne = 20
    val volumeCargoOne = 80

    val weightCargoTwo = 50
    val volumeCargoTwo = 100

    println("Груз весом $weightCargoOne и объемом $volumeCargoOne соответствуем категории 'Average': ${
        weightCargoOne >= minWeightAverage &&
                weightCargoOne <= maxWeightAverage &&
                volumeCargoOne < volumeAverage
    }")
    println("Груз весом $weightCargoTwo и объемом $volumeCargoTwo соответствуем категории 'Average': ${
        weightCargoTwo >= minWeightAverage &&
                weightCargoTwo <= maxWeightAverage &&
                volumeCargoTwo < volumeAverage
    }")
}

const val minWeightAverage = 35
const val maxWeightAverage = 100
const val volumeAverage = 100