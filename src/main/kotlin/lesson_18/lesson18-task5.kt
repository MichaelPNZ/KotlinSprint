package lesson_18

import java.awt.Graphics

open class Shape(val x: Float, val y: Float) {
    open fun draw(g: Graphics) {}
}

class Point(x: Float, y: Float) : Shape(x, y) {
    override fun draw(g: Graphics) {
        g.fillOval(x.toInt(), y.toInt(), 1, 1)
    }
}

class Square(x: Float, y: Float, val size: Int) : Shape(x, y) {
    override fun draw(g: Graphics) {
        g.fillRect(x.toInt(), y.toInt(), size, size)
    }
}

class Circle(x: Float, y: Float, val radius: Int) : Shape(x, y) {
    override fun draw(g: Graphics) {
        val diameter = radius * 2
        g.fillOval(x.toInt() - radius, y.toInt() - radius, diameter, diameter)
    }
}

class Screen(val width: Int, val height: Int) {
    private val shapes = mutableListOf<Shape>()

    fun draw(shape: Shape) {
        shapes.add(shape)
    }

    fun render(g: Graphics) {
        for (shape in shapes) {
            shape.draw(g)
        }
    }
}
