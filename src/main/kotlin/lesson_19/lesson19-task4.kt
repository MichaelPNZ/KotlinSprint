package lesson_19

enum class AmmunitionType(val damage: Int) {
    BLUE(5),
    GREEN(10),
    RED(20)
}

class Tank {

private var currentAmmunition: AmmunitionType? = null

    fun changeAmmunition(ammunitionType: AmmunitionType) {
        currentAmmunition = ammunitionType
        println("Заряжены $currentAmmunition патроны!")
    }

    fun shot() {
        currentAmmunition?.let { ammunitionType -> println("Нанесено ${ammunitionType.damage} единиц урона") }
    }

}

fun main() {

    val tank = Tank()

    tank.changeAmmunition(AmmunitionType.RED)
    tank.shot()
    tank.changeAmmunition(AmmunitionType.BLUE)
    tank.shot()
    tank.changeAmmunition(AmmunitionType.GREEN)
    tank.shot()

}