package lesson_21


fun Collection<Int>.evenNumbersSum(list: List<Int>) {
    var sum = 0
    list.forEach { i ->
        if (i % 2 == 0) {
            sum += i
        }
    }
    println(sum)
}

fun main() {

    val listNumber = listOf<Int>()

    listNumber.evenNumbersSum(listOf(1, 2, 3, 4, 5, 6, 7))

}