package lesson_17

class PackagePoint(val numberPackage: Int, _currentLocation: String) {

    private var movementCount = 0

    var currentLocation = _currentLocation
        set(value) {
            field = value
            movementCount += 1
            println("Посылка №${numberPackage}, текущая локация ${currentLocation}.")
            println("Перемещение №${movementCount}.")
        }

}

fun main() {

    val packageOne = PackagePoint(122, "Moscow")
    println("Посылка №${packageOne.numberPackage}, текущая локация ${packageOne.currentLocation}.")
    packageOne.currentLocation = "Rostov"
    packageOne.currentLocation = "Penza"
    packageOne.currentLocation = "Ufa"
    packageOne.currentLocation = "Omsk"

}