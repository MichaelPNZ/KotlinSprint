package lesson_22

class RegularBook(
    val bookName: String,
    val bookAuthor: String,
)

data class DataBook(
    val bookName: String,
    val bookAuthor: String,
)

fun main() {

    val book1 = RegularBook("Harry Potter", "J. K. Rowling")
    val book2 = RegularBook("Harry Potter", "J. K. Rowling")

    val book3 = DataBook("Harry Potter", "J. K. Rowling")
    val book4 = DataBook("Harry Potter", "J. K. Rowling")

    println(book1 == book2)
    println(book3 == book4)

}