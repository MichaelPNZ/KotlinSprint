package lesson_18

import kotlin.math.pow

open class Package {

    open fun getTypePackage(): String = ""

}

class RectangularPackage(
    private val height: Double,
    private val width: Double,
    private val length: Double,
) : Package() {
    override fun getTypePackage(): String {
        return "Площадь поверхности посылки: ${2 * ((height * width) + (height * length) + (width * length))}"
    }
}

class CubicPackage(
    private val edgeLengths: Double,
) : Package() {
    override fun getTypePackage(): String {
        return "Площадь поверхности посылки: ${6 * edgeLengths.pow(2.0)}"
    }
}

fun main() {

    val rectangularPackage = RectangularPackage(12.0, 3.9, 5.3)
    val cubicPackage = CubicPackage(23.5)

    println(rectangularPackage.getTypePackage())
    println(cubicPackage.getTypePackage())

}