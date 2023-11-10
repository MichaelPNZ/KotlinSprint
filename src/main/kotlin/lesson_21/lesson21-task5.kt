package lesson_21


interface Map {}

fun Map.maxCategory(): String {
    val person = Person()
    val maxValueExp = person.skill.values.max()
    var maxSkillName = ""

    for (i in person.skill) {
        if (i.value == maxValueExp) { maxSkillName = i.key }
    }

    return maxSkillName
}

class Person : Map {
    val skill = mapOf("aaaaa" to 10, "ppppp" to 20, "ssssss" to 20)
}

fun main() {

    val skill = Person()
    println(skill.maxCategory())

}