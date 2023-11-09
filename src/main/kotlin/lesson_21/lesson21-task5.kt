package lesson_21

interface Map {}

fun Map.maxCategory(skills: kotlin.collections.Map<String, Int>): String {

    val maxValueExp = skills.values.max()
    var maxSkillName = ""

    for (i in skills) {
        if (i.value == maxValueExp) { maxSkillName = i.key }
    }

    return maxSkillName
}

class Person : Map

fun main() {

    val skill = Person()
    println(skill.maxCategory(mapOf("aaaaa" to 10, "ppppp" to 20, "ssssss" to 20)))

}