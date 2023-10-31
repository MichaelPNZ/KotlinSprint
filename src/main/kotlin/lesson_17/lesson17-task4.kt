package lesson_17

class PackagePoint(private val numberPackage: Int) {

    private var movementCount = 0

    var currentLocation = ""
        set(value) {
            field = value
            movementCount += 1
            println("Посылка №${numberPackage}, текущая локация ${currentLocation}.")
            println("Перемещение №${movementCount}.")
        }

}

fun main() {

    val packageOne = PackagePoint(122)
    packageOne.currentLocation = "asasd"
    packageOne.currentLocation = "asasd"
    packageOne.currentLocation = "qefq"
    packageOne.currentLocation = "dbdb"

}