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

    val result = (
            (isDamage == IS_DAMAGE)
            && (crewNumber in MIN_CREW_NUMBER..MAX_CREW_NUMBER)
            && (wireBoxes >= WIRE_BOXES)
            && (isClean == IS_CLEAN || !IS_CLEAN)
            )
            || (
            (isDamage == !IS_DAMAGE)
            && (crewNumber == MAX_CREW_NUMBER)
            && (isClean == IS_CLEAN)
            && (wireBoxes > WIRE_BOXES)
                    )

    println("Корабля может приступать к долгосрочному плаванию: $result")
}

const val IS_DAMAGE = false
const val MIN_CREW_NUMBER = 55
const val MAX_CREW_NUMBER = 70
const val WIRE_BOXES = 50
const val IS_CLEAN = true