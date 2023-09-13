package lesson_2

fun main() {
    val studentOne = 3
    val studentTwo = 4
    val studentThree = 3
    val studentFour = 5

    val averageScore = (studentOne + studentTwo + studentThree + studentFour) / 4.0

    println(String.format("%.2f", averageScore))
}