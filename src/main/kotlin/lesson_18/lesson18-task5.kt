package lesson_18

abstract class Shape(val x: Float, val y: Float) {
    abstract fun drawInt()
    abstract fun drawFloat()
}

class Point(x: Float, y: Float) : Shape(x, y) {

    override fun drawInt() {
        println("Рисуем точку с координатами x:${x.toInt()}, y:${y.toInt()}.")
    }

    override fun drawFloat() {
        println("Рисуем точку с координатами x:$x, y:$y.")
    }

}

class Square(x: Float, y: Float, val size: Float) : Shape(x, y) {

    override fun drawInt() {
        println("Рисуем квадрат с координатами x:${x.toInt()}, y:${y.toInt()}, длинной стороны: ${size.toInt()}.")
    }

    override fun drawFloat() {
        println("Рисуем квадрат с координатами x:${x}, y:${y}, длинной стороны: $size.")
    }

}

class Circle(x: Float, y: Float, val radius: Float) : Shape(x, y) {

    override fun drawInt() {
        println("Рисуем круг с координатами x:${x.toInt()}, y:${y.toInt()} и радиусом: ${radius.toInt()}.")
    }

    override fun drawFloat() {
        println("Рисуем круг с координатами x:${x}, y:${y} и радиусом: $radius.")
    }

}

class Screen() {

    fun drawInt(shape: Shape) {
        shape.drawInt()
    }

    fun drawFloat(shape: Shape) {
        shape.drawFloat()
    }

}

fun main() {

    val screen = Screen()

    val point = Point(2.0F, 2.0F)
    val square = Square(5.2F, 13.4F, 2.3F)
    val circle = Circle(35.2F, 22.1F, 23.6F)

    screen.drawInt(point)
    screen.drawInt(square)
    screen.drawInt(circle)

    println()

    screen.drawFloat(point)
    screen.drawFloat(square)
    screen.drawFloat(circle)

}
