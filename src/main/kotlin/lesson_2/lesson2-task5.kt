package lesson_2
import kotlin.math.pow
fun main() {

    val money = 70000
    val interestRate = 16.7
    val time = 20
    val compoundInterest = (1 + interestRate / 100)
    val totalMoney = money * compoundInterest.pow(time)

    print(String.format("%.3f", totalMoney))

}