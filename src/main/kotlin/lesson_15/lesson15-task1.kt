package lesson_15

interface MovableFly {

    fun fly()

}

interface MovableSwim {

    fun swim()

}

abstract class Animal { abstract val name: String }

class Crucian (override val name: String ) : Animal(), MovableSwim {

    override fun swim() { println("$name может плавать") }

}
class Seagull (override val name: String ) : Animal(), MovableSwim, MovableFly {

    override fun fly() { println("$name может летать") }
    override fun swim() { println("$name может плавать") }

}

class Duck (override val name: String ) : Animal(), MovableSwim, MovableFly {

    override fun fly() { println("$name может летать") }
    override fun swim() { println("$name может плавать") }

}

fun main() {
    val crucian = Crucian("Карась")
    val seagull = Seagull("Чайка")
    val duck = Duck("Утка")

    crucian.swim()
    seagull.swim()
    seagull.fly()
    duck.swim()
    duck.fly()
}