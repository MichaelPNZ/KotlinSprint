package lesson_22

data class Book(
    val bookName: String,
    val bookAuthor: String,
    val pageCount: Int,
)

fun main() {

    val book1 = Book("Harry Potter", "J. K. Rowling", 500)
    val (bookName, bookAuthor, pageCount) = book1

    println("$bookName, $bookAuthor, $pageCount")

}