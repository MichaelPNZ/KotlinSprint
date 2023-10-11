package lesson_10

fun main() {
    getValid(getLogin(), getPassword())
}

fun getLogin() : String? {
    println("Enter login:")
    return readLine()
}

fun getPassword() : String? {
    println("Enter password:")
    return readLine()
}

fun getValid(login: String?, password: String?) {
    if ((login!!.length >= 4) && (password!!.length >= 4)) println("Вы зарегестрированны!")
    else println("Логин или пароль недостаточно длинные")
}