package lesson_22

data class Book(
    val bookName: String,
    val bookAuthor: String,
    val pageCount: Int,
)

fun main() {

    val book1 = Book("Harry Potter", "J. K. Rowling", 500)

    val bookName = book1.component1()
    val bookAuthor = book1.component2()
    val pageCount = book1.component3()

    println("$bookName, $bookAuthor, $pageCount")

}