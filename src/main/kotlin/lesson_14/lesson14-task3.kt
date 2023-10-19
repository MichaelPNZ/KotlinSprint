package lesson_14

import kotlin.math.PI
import kotlin.math.pow
import kotlin.math.roundToInt

abstract class Figure {
    abstract val color: String
    abstract fun calculatingSquare(): Double
    abstract fun calculatingPerimeter(): Double
}

class Circle(
    override val color: String,
    val radius: Double
) : Figure() {
    override fun calculatingSquare(): Double { return PI * radius.pow(2.0) }

    override fun calculatingPerimeter(): Double { return 2 * PI * radius }
}

class Rectangle(
    override val color: String,
    val width: Double,
    val height: Double,
) : Figure() {
    override fun calculatingSquare(): Double { return width * height }

    override fun calculatingPerimeter(): Double { return (width + height) * 2 }
}

fun main() {
    val circleOne = Circle("White", 5.0)
    val circleTwo = Circle("White", 2.7)
    val circleThree = Circle("Black", 4.1)
    val circleFour = Circle("Black", 9.3)
    val rectangleOne = Rectangle("White", 7.6, 5.0)
    val rectangleTwo = Rectangle("White", 4.1, 19.0)
    val rectangleThree = Rectangle("Black", 2.9, 3.1)
    val rectangleFour = Rectangle("Black", 6.3, 2.8)

    val allSquare =
        circleOne.calculatingSquare() + circleTwo.calculatingSquare() + rectangleOne.calculatingSquare() + rectangleTwo.calculatingSquare()
    val allPerimeter =
        circleThree.calculatingPerimeter() + circleFour.calculatingPerimeter() + rectangleThree.calculatingPerimeter() + rectangleFour.calculatingPerimeter()

    println("Сумма периметров всех черных фигур: ${allPerimeter.roundToInt()}")
    println("Сумма площадей всех белых фигур: ${allSquare.roundToInt()}")
}