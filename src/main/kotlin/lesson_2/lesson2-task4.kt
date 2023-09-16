package lesson_2

fun main() {

    val bonusOfPercent = 20
    val cristalCount = 7
    val ironOre = 11

    val bonusCristal = cristalCount * bonusOfPercent / 100
    val bonusIronOre = ironOre * bonusOfPercent / 100

    println("Бонусные кристаллы: $bonusCristal")
    println("Бонуснная железная руда: $bonusIronOre")
}