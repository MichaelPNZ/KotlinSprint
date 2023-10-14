package lesson_11


class User (
    val id: Int,
    val login: String,
    val password: String,
    val email: String,
)

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
    println("""${userOne.id}
        |${userOne.login}
        |${userOne.password}
        |${userOne.email}""".trimMargin())

    println()
    println("""${userTwo.id}
        |${userTwo.login}
        |${userTwo.password}
        |${userTwo.email}""".trimMargin())
}