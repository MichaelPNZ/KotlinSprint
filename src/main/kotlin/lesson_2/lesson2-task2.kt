package lesson_2

fun main() {
    val stuffCount = 50
    val stuffSalary = 30000
    val internshipCount = 30
    val internshipSalary = 20000

    val staffSalaryFund = stuffCount * stuffSalary
    println("Расходы на ЗП постоянных сотрудников: $staffSalaryFund")

    val internSalaryFund = internshipCount * internshipSalary
    val sumSalary = staffSalaryFund + internSalaryFund
    println("Общие расходы по ЗП после прихода стажеров: $sumSalary")

    val averageSalary = sumSalary / (stuffCount + internshipCount)
    println("Средняя ЗП: $averageSalary")
}