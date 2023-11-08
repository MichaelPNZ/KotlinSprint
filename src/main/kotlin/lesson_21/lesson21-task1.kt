package lesson_21

fun String.vowelCount(string: String): Int {
    var vowels = 0

    for (char in string) {
        if (char.lowercase() in "aeiou") {
            vowels++
        }
    }

    return vowels
}

fun main() {

    val string = String()
    println(string.vowelCount("hello"))

}