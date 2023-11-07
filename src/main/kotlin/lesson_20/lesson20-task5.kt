package lesson_20

class Robot(val listString: List<String>) {

    fun say(): String {
        return listString.shuffled().first()
    }

    val invertString: () -> Unit = {
        println(say().reversed())
    }

}

fun main() {

    val string = Robot(listOf("Hello!", "Bay", "Yes", "No"))

    println(string.say())
    string.invertString()

}