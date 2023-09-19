package lesson_4

fun main() {
    print("наличие поврежденний корпуса: ")
    val damage = readLine().toBoolean()
    print("текущий состав экипажа: ")
    val crewNumber = readLine()?.toInt()
    print("количество ящиков с провизией на борту: ")
    val wireBoxes = readln().toInt()
    print("благоприятность метеоусловий: ")
    val  weather = readLine().toBoolean()

    var result = false

    if ((damage == false) && (crewNumber in "55".toInt().."70".toInt()) && (wireBoxes >= 50) && (weather == true || false)) {
        result = true
    }

    if ((damage == true) && (crewNumber == 70) && (weather == true) && (wireBoxes > 50)) {
        result = true
    }

    println("Корабля может приступать к долгосрочному плаванию: $result")
}

