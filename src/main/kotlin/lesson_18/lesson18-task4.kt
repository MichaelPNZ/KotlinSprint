package lesson_18

import kotlin.math.pow

abstract class Package {

    abstract fun areaCalculation(): String

}

class RectangularPackage(
    private val height: Double,
    private val width: Double,
    private val length: Double,
) : Package() {
    override fun areaCalculation(): String {
        return "Площадь поверхности посылки: ${2 * ((height * width) + (height * length) + (width * length))}"
    }
}

class CubicPackage(
    private val edgeLength: Double,
) : Package() {
    override fun areaCalculation(): String {
        return "Площадь поверхности посылки: ${6 * edgeLength.pow(2.0)}"
    }
}

fun main() {

    val rectangularPackage = RectangularPackage(12.0, 3.9, 5.3)
    val cubicPackage = CubicPackage(13.5)

    println(rectangularPackage.areaCalculation())
    println(cubicPackage.areaCalculation())

}