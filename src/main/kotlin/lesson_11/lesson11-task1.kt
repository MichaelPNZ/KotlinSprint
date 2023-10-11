package lesson_11


class User (
    val id: Int,
    val login: String,
    val password: String,
    val email: String,
) {}

fun main() {
    val userOne = User(
        id = 1,
        login = "qwerty",
        password = "asdfg",
        email = "zxcvb@gmail.com",
    )

    val userTwo = User(
        id = 2,
        login = "uiopsgs",
        password = "hjklffhd",
        email = "nmvbcn@gmail.com",
    )
    println(userOne.id)
    println(userOne.login)
    println(userOne.password)
    println(userOne.email)
    println()
    println(userTwo.id)
    println(userTwo.login)
    println(userTwo.password)
    println(userTwo.email)
}