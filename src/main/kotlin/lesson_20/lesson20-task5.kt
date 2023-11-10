package lesson_20

class Robot {

    val string = listOf("Hello!", "Bay", "Yes", "No")

    fun say(): String {
        return string.shuffled().first()
    }

    val setModifier: () -> Unit = {
        println(say().reversed())
    }

}

fun main() {

    val robot = Robot()

    println(robot.say())
    robot.setModifier()

}