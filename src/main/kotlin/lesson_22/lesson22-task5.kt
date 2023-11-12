package lesson_22

import java.util.Date

data class GalacticGuide(
    val eventName: String,
    val eventDescription: String,
    val date: Date,
    val distanceFromEarth: String,
)

fun main() {

    val currentDate = Date()

    val alphaCentauri = GalacticGuide(
        "Alpha Centauri",
        "тройная звёздная система в созвездии Центавра",
        currentDate,
        "4,36 световых года"
    )

    val eventName = alphaCentauri.component1()
    val eventDescription = alphaCentauri.component2()
    val date = alphaCentauri.component3()
    val distanceFromEarth = alphaCentauri.component4()

    println(
        """Название места: $eventName.
        |Описание места: $eventDescription.
        |Дата и время события: $date.
        |Расстояние $eventName от Земли в световых годах: $distanceFromEarth.""".trimMargin()
    )

}