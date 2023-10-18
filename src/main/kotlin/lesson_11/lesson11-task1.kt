package lesson_11


class User0 (
    val id: Int,
    val login: String,
    val password: String,
    val email: String,
)

fun main() {
    val user0One = User0(
        id = 1,
        login = "qwerty",
        password = "asdfg",
        email = "zxcvb@gmail.com",
    )

    val user0Two = User0(
        id = 2,
        login = "uiopsgs",
        password = "hjklffhd",
        email = "nmvbcn@gmail.com",
    )
    println("""${user0One.id}
        |${user0One.login}
        |${user0One.password}
        |${user0One.email}""".trimMargin())

    println()
    println("""${user0Two.id}
        |${user0Two.login}
        |${user0Two.password}
        |${user0Two.email}""".trimMargin())
}