package lesson_22

class BookRegular(
    val bookName: String,
    val bookAuthor: String,
)

data class BookData(
    val bookName: String,
    val bookAuthor: String,
)

fun main() {

    val book1 = BookRegular("Harry Potter", "J. K. Rowling")

    val book2 = BookData("Harry Potter", "J. K. Rowling")

    println(book1) // Будет распечатано строковое представление объекта по умолчанию.
    println(book2) // Получаем переопределенную функцию toString()

}