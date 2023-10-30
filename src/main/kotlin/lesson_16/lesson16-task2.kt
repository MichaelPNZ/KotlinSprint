package lesson_16

import kotlin.math.pow

class Circle(private val radius: Double) {
    private val pi = 3.14

    fun getSquare() {
        println("Площадь круга равна: ${pi * radius.pow(2.0)}")
    }

    fun getCircumference() {
        println("Длина окружности круга равна: ${2 * pi * radius}")
    }
}

fun main() {

    val circle = Circle(12.2)
    circle.getSquare()
    circle.getCircumference()

}