package lesson_21

fun String.vowelCount(): Int {
    return count { it.lowercase() in "aeiou" }
}

fun main() {

    val string = "hello"
    println(string.vowelCount())

}