package lesson_5

fun main() {

    println("Приветствую Вас, Введите свое имя: ")
    val name = readLine().toString()

    if (name == LOGIN) {
        println("Введите пароль: ")
        val password = readLine().toString()
        if (password == PASSWORD) { println("Добро пожаловать!") } else { println("Пароль не верный!") }
    } else { println("Зарегистрируйтесь!") }
}

const val LOGIN = "Zaphod"
const val PASSWORD = "PanGalactic"
