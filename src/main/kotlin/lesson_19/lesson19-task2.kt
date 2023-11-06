package lesson_19

enum class Category {
    CLOTHES {
        override fun getCategoryName(): String {
            return "Одежда"
        }
    },
    OFFICE_SUPPLIES {
        override fun getCategoryName(): String {
            return "Канцелярские товары"
        }
    },
    DIFFERENT {
        override fun getCategoryName(): String {
            return "Разное"
        }
    };

    abstract fun getCategoryName(): String

}

class Product(
    val name: String,
    val id: Int,
    val category: String,
) {

    fun printProductInfo() {
        println("id товара \"$id\", название \"$name\", категория \"${category}\".")
    }

}

fun main() {

    val productOne = Product("плащ", 1313, Category.CLOTHES.getCategoryName())
    val productTwo = Product("ручка", 13345, Category.OFFICE_SUPPLIES.getCategoryName())
    val productThree = Product("сковорода", 522, Category.DIFFERENT.getCategoryName())
    val productFour = Product("карандаши", 46, Category.OFFICE_SUPPLIES.getCategoryName())

    productOne.printProductInfo()
    productTwo.printProductInfo()
    productThree.printProductInfo()
    productFour.printProductInfo()

}