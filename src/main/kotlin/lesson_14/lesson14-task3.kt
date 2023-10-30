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
    override fun calculatingSquare(): Double = PI * radius.pow(2.0)

    override fun calculatingPerimeter(): Double = 2 * PI * radius
}

class Rectangle(
    override val color: String,
    val width: Double,
    val height: Double,
) : Figure() {
    override fun calculatingSquare(): Double = width * height

    override fun calculatingPerimeter(): Double = (width + height) * 2
}

fun main() {
    val circleOne = Circle(WHITE_COLOR, 5.0)
    val circleTwo = Circle(WHITE_COLOR, 2.7)
    val circleThree = Circle(BLACK_COLOR, 4.1)
    val circleFour = Circle(BLACK_COLOR, 9.3)

    val rectangleOne = Rectangle(WHITE_COLOR, 7.6, 5.0)
    val rectangleTwo = Rectangle(WHITE_COLOR, 4.1, 19.0)
    val rectangleThree = Rectangle(BLACK_COLOR, 2.9, 3.1)
    val rectangleFour = Rectangle(BLACK_COLOR, 6.3, 2.8)

    val allFigure = listOf(circleOne, circleTwo, circleThree, circleFour, rectangleOne, rectangleTwo, rectangleThree, rectangleFour)

    var allSquareWhiteFigure = 0.0
    var allPerimeterBlackFigure = 0.0

    for (i in allFigure.filter { it.color == WHITE_COLOR }) allSquareWhiteFigure += i.calculatingSquare()
    for (i in allFigure.filter { it.color == BLACK_COLOR }) allPerimeterBlackFigure += i.calculatingPerimeter()

    println("Сумма периметров всех черных фигур: ${allPerimeterBlackFigure.roundToInt()}")
    println("Сумма площадей всех белых фигур: ${ allSquareWhiteFigure.roundToInt() }")
}

const val WHITE_COLOR = "White"
const val BLACK_COLOR = "Black"