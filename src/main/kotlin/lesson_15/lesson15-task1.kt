package lesson_15

interface Movable {

    fun fly()
    fun swim()

}

abstract class Animal : Movable { abstract val name: String }

class Crucian (override val name: String ) : Animal() {

    override fun fly() { println("$name не может летать") }
    override fun swim() { println("$name может плавать") }

}
class Seagull (override val name: String ) : Animal() {

    override fun fly() { println("$name может летать") }
    override fun swim() { println("$name может плавать") }

}

class Duck (override val name: String ) : Animal() {

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