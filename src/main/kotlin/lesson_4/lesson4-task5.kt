package lesson_4

fun main() {
    print("наличие поврежденний корпуса: ")
    val isDamage = readLine().toBoolean()
    print("текущий состав экипажа: ")
    val crewNumber = readLine()?.toInt()
    print("количество ящиков с провизией на борту: ")
    val wireBoxes = readln().toInt()
    print("благоприятность метеоусловий: ")
    val  isClean = readLine().toBoolean()

    var result = false

    if ((isDamage == false) && (crewNumber in "55".toInt().."70".toInt()) && (wireBoxes >= 50) && (isClean == true || false)) {
        result = true
    }

    if ((isDamage == true) && (crewNumber == 70) && (isClean == true) && (wireBoxes > 50)) {
        result = true
    }

    println("Корабля может приступать к долгосрочному плаванию: $result")
}

