package lesson_18

abstract class Animal {
    abstract val name: String
    abstract val food: String

    fun play(): String {
        return "$name - играет"
    }

    fun eat(): String {
        return "$name - ест $food"
    }

    fun sleep(): String {
        return "$name - спит"
    }

}

class Fox(
    override val name: String,
    override val food: String = "ягоды",
) : Animal()

class Dog(
    override val name: String,
    override val food: String = "кости",
) : Animal()

class Cat(
    override val name: String,
    override val food: String = "рыбу",
) : Animal()

fun main() {

    val animalOne = Fox("Лиса")
    val animalTwo = Dog("Собака")
    val animalThree = Cat("Кот")

    val list = arrayOf<Animal>(animalOne, animalTwo, animalThree)

    showAllAnimals(list)

}

fun showAllAnimals(animals: Array<Animal>) {
    animals.forEach {
        println(it.eat())
        println(it.play())
        println(it.sleep())
    }
}

