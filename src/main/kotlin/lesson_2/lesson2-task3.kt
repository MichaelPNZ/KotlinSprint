package lesson_2

fun main() {
    val hour = 9
    val minute = 39
    val travelTime = 457

    val travelTimeOfHour = travelTime / 60
    val travelTimeOfMinute = travelTime % 60

    val arrivalTimeMinute = minute + travelTimeOfMinute
    val arrivalHour = hour + travelTimeOfHour + (arrivalTimeMinute / 60)
    val arrivalMinute = arrivalTimeMinute % 60

    println("Время прибытия поезда: $arrivalHour:$arrivalMinute")
}