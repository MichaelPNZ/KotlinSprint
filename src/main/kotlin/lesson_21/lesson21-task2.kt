package lesson_21


fun Collection<Int>.evenNumbersSum() : Int {
    return this.filter { it % 2 == 0 }.sum()
}

fun main() {

    val listNumber = listOf(1, 2, 3, 4, 5, 6, 7)
    println(listNumber.evenNumbersSum())

}