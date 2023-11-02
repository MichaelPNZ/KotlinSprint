package lesson_19

enum class StarShip {
    TAKE_OFF {
        override fun action() {
            TODO("Not yet implemented")
        }
    },
    LANDING {
        override fun action() {
           // TODO добавить логику
        }
    },
    SHOOT {
        override fun action() {
            println("отстреливаемся от астероида")
        }
    };

    abstract fun action()

}

fun main() {

    println(StarShip.TAKE_OFF.action())
    println(StarShip.LANDING.action())
    println(StarShip.SHOOT.action())

}