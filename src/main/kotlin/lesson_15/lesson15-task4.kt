package lesson_15

interface SearchComponents {

    fun search(name: String)
}

abstract class Product {
    abstract val name: String
    abstract val count: Int
}

class Tool(
    override val name: String,
    override val count: Int,
    val components: List<Component>,
) : Product(), SearchComponents {

    override fun search(name: String, ) {
        println("Найти: ${name}")
        println("Выполняется поиск")

        for (component in components) {

            if (component.name == name) {
                println("${name} найден, количество ${component.count}")
                return
            }

        }

        println("${name} не найден.")
    }
}

class Component (
    override val name: String,
    override val count: Int,
) : Product()

fun main() {
    val componentsOne = Component("afaf", 5)
    val componentsTwo = Component("fgher", 3)
    val componentsThree = Component("fghfgh", 66)
    val componentsFour = Component("tjjtj", 34)

    val toolOne = Tool("Drill", 2, listOf(componentsOne, componentsTwo, componentsThree, componentsFour))

    toolOne.search("tjjtj")
}