package lesson_15

interface CargoTransportation {

    fun downloadCargo()
    fun unloadCargo()

}

interface PassengerTransportation {

    fun downloadPassengers()
    fun unloadPassengers()

}

abstract class Car : PassengerTransportation {
    abstract val maxPassengers: Int
    abstract val passengersCount: Int
    abstract var permit: Boolean

    override fun downloadPassengers() {
        if (passengersCount <= maxPassengers) {
            permit = true
            println("Сели ${passengersCount} пассажир")
        } else println("${passengersCount} пассажира не вмещает, максимум ${maxPassengers}!")
    }

    override fun unloadPassengers() {
        if (permit) println("Вышли ${passengersCount} пассажир")
    }
}

class Truck(
    override val maxPassengers: Int,
    override val passengersCount: Int,
    val capacity: Int,
    val maxCapacity: Int,
    override var permit: Boolean = false,
) : Car(), CargoTransportation {

    override fun downloadCargo() {
        if (capacity > maxCapacity) {
            permit = true
            println("${capacity}т. не вмещает, максимум ${maxCapacity}т. груза!")
        } else if (permit) println("Загрузили ${capacity}т. груза")
    }

    override fun unloadCargo() {
        if (permit) println("Разгрузили ${capacity}т. груза")
    }
}

class PassengerCar(
    override val maxPassengers: Int,
    override val passengersCount: Int,
    override var permit: Boolean = false,
) : Car()

fun main() {

    val truck = Truck(1, 1, 2, 2)
    truck.downloadPassengers()
    truck.downloadCargo()
    truck.unloadPassengers()
    truck.unloadCargo()

    val truckTwo = Truck(1, 2, 1, 2)
    truckTwo.downloadPassengers()
    truckTwo.downloadCargo()
    truckTwo.unloadPassengers()
    truckTwo.unloadCargo()

    val car = PassengerCar(3, 3)
    car.downloadPassengers()
    car.unloadPassengers()

    val carTwo = PassengerCar(3, 2)
    carTwo.downloadPassengers()
    carTwo.unloadPassengers()

}
