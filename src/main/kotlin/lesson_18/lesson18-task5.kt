package lesson_18

class Point(val x: Float, val y: Float)

class Square(val sideLength: Float)

class Circle(val radius: Float)

class Screen {

    fun draw(x: Int, y: Int, pointInt: Point) {
        println("Рисуем точку ${pointInt.x.toInt()}, ${pointInt.y.toInt()} с координатами x:$x, y:$y.")
    }

    fun draw(x: Float, y: Float, point: Point) {
        println("Рисуем точку ${point.x}, ${point.y} с координатами x:$x, y:$y.")
    }

    fun draw(x: Int, y: Int, squareInt: Square) {
        println("Рисуем квадрат с координатами x:$x, y:$y, длинной стороны: ${squareInt.sideLength.toInt()}.")
    }

    fun draw(x: Float, y: Float, square: Square) {
        println("Рисуем квадрат с координатами x:$x, y:$y, длинной стороны: ${square.sideLength}.")
    }

    fun draw(x: Int, y: Int, circleInt: Circle) {
        println("Рисуем круг с координатами x:$x, y:$y и радиусом: ${circleInt.radius.toInt()}.")
    }

    fun draw(x: Float, y: Float, circle: Circle) {
        println("Рисуем круг с координатами x:$x, y:$y и радиусом: ${circle.radius}.")
    }

}

fun main() {

    val point = Point(2.0F, 2.0F)
    val square = Square(5.2F)
    val circle = Circle(35.2F)

    val screen = Screen()

    screen.draw(2, 4, point)
    screen.draw(1.5f, 2.5f, point)

    screen.draw(4, 7, square)
    screen.draw(3.5f, 4.5f, square)

    screen.draw(55, 1, circle)
    screen.draw(5.5f, 6.5f, circle)

}
