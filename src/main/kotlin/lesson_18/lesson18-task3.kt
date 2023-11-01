package lesson_18

open class Animal {

    open fun play() = ""
    open fun eat() = ""
    open fun sleep() = ""

}

class Fox(
    private val name: String,
    private val food: String = "ягоды",
) : Animal() {
    override fun play(): String {
        return "$name - играет"
    }

    override fun eat(): String {
        return "$name - ест $food"
    }

    override fun sleep(): String {
        return "$name - спит"
    }
}

class Dog(
    private val name: String,
    private val food: String = "кости",
) : Animal() {
    override fun play(): String {
        return "$name - играет"
    }

    override fun eat(): String {
        return "$name - ест $food"
    }

    override fun sleep(): String {
        return "$name - спит"
    }
}

class Cat(
    private val name: String,
    private val food: String = "рыбу",
) : Animal() {
    override fun play(): String {
        return "$name - играет"
    }

    override fun eat(): String {
        return "$name - ест $food"
    }

    override fun sleep(): String {
        return "$name - спит"
    }
}

fun main() {

    val animalOne = Fox("Лиса")
    val animalTwo = Dog("Собака")
    val animalThree = Cat("Кот")

    val list = arrayOf<Animal>(animalOne, animalTwo, animalThree)

    showAllAnimals(list)

}

fun showAllAnimals(notes: Array<Animal>) {
    notes.forEach {
        println(it.eat())
        println(it.play())
        println(it.sleep())
    }
}

