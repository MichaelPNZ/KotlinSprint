package lesson_15

interface CargoTransportation {

    fun downloadCargo()
    fun unloadCargo()

}

interface PassengerTransportation {

    fun downloadPassengers()
    fun unloadPassengers()

}

interface TrafficPermit {

    fun getPermit()

}

abstract class Car : TrafficPermit, PassengerTransportation {
    abstract val passengersCount: Int
    abstract var permit: Boolean

    override fun getPermit() {
        if (passengersCount <= MAX_PASSENGERS_OF_PASSENGER_CAR) {
            println("Разрешение на выезд получено")
            permit = true
        } else {
            println("Разрешение на выезд не получено")
        }
    }

    override fun downloadPassengers() {
        if (permit) println("Сели ${passengersCount} пассажир")
        else println("${passengersCount} пассажира не вмещает, максимум ${MAX_PASSENGERS_OF_PASSENGER_CAR}!")
    }

    override fun unloadPassengers() {
        if (permit) println("Вышли ${passengersCount} пассажир")
    }
}

class Truck(
    override val passengersCount: Int,
    val capacity: Int,
    override var permit: Boolean = false,
) : Car(), CargoTransportation {

    override fun getPermit() {
        if (passengersCount <= MAX_PASSENGERS_OF_TRUCK && capacity <= MAX_CAPACITY_OF_TRUCK) {
            println("Разрешение на выезд получено")
            permit = true
        } else {
            println("Разрешение на выезд не получено")
        }
    }

    override fun downloadPassengers() {
        if (permit) println("Сели ${passengersCount} пассажир")
        else println("${passengersCount} пассажира не вмещает, максимум ${MAX_PASSENGERS_OF_TRUCK}!")
    }

    override fun downloadCargo() {
        if (capacity > MAX_CAPACITY_OF_TRUCK) println("${capacity}т. не вмещает, максимум ${MAX_CAPACITY_OF_TRUCK}т. груза!")
        else if (permit) println("Загрузили ${capacity}т. груза")
    }

    override fun unloadCargo() {
        if (permit) println("Разгрузили ${capacity}т. груза")
    }
}

class PassengerCar(
    override val passengersCount: Int,
    override var permit: Boolean = false,
) : Car()

fun main() {

    val truck = Truck(1, 2)
    truck.getPermit()
    truck.downloadPassengers()
    truck.downloadCargo()
    truck.unloadPassengers()
    truck.unloadCargo()

    val truckTwo = Truck(2, 1)
    truckTwo.getPermit()
    truckTwo.downloadPassengers()
    truckTwo.downloadCargo()
    truckTwo.unloadPassengers()
    truckTwo.unloadCargo()

    val car = PassengerCar(3)
    car.getPermit()
    car.downloadPassengers()
    car.unloadPassengers()

    val carTwo = PassengerCar(2)
    carTwo.getPermit()
    carTwo.downloadPassengers()
    carTwo.unloadPassengers()

}

const val MAX_PASSENGERS_OF_TRUCK = 1
const val MAX_PASSENGERS_OF_PASSENGER_CAR = 3
const val MAX_CAPACITY_OF_TRUCK = 2
