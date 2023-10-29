package lesson_15

interface SearchComponents {

    fun search(name: String, components: List<Components>) {
        println("Найти: ${name}")
        println("Выполняется поиск")
        var countItem = 0

        for (component in components) {

            if (component.name == name) println("${name} найден, количество ${component.count}")
            else {
                countItem += 1
                if (components.size == countItem) println("${name} не найден.")
            }
        }
    }
}

abstract class Store {
    abstract val name: String
    abstract val count: Int
}

class Tools(
    override val name: String,
    override val count: Int,
) : Store(), SearchComponents

class Components (
    override val name: String,
    override val count: Int,
) : Store()

fun main() {
    val componentsOne = Components("afaf", 5)
    val componentsTwo = Components("fgher", 3)
    val componentsThree = Components("fghfgh", 66)
    val componentsFour = Components("tjjtj", 34)

    val toolOne = Tools("Drill", 2)

    toolOne.search("tjjtj", listOf(componentsOne, componentsTwo, componentsThree, componentsFour))
}