package lesson_21


fun Map<String, Int>.maxCategory(): String? {
    val maxValueName = this.maxByOrNull { entry -> entry.value }
    return maxValueName?.key
}

fun main() {

    val skill = mapOf("aaaaa" to 10, "ppppp" to 20, "ssssss" to 20)
    println(skill.maxCategory())

}