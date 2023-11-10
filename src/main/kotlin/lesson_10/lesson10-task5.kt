package lesson_10

val users: Map<String, String> = mapOf("user123" to "password123")
val productsInCart = listOf("ProductA", "ProductB", "ProductC")

fun authenticate(username: String, password: String): String? {
    val storedPassword = users[username]

    return if (storedPassword == password) generateAccessToken()
    else null
}

fun generateAccessToken(): String {
    val numberSet = 0..9
    val charsetLowCase =  'a'..'z'
    val charsetUpperCase = 'A'..'Z'
    var token = ""
    val allChars = numberSet + charsetLowCase + charsetUpperCase

    for (i in 1..32) {
        token += allChars.random()
    }

    return token
}

fun getCartContents(accessToken: String): List<String>? {
    return if (validateToken(accessToken)) productsInCart
    else null
}

fun validateToken(accessToken: String): Boolean {
    return accessToken.isNotBlank()
}

fun main() {
    val username = "user123"
    val password = "password123"

    val accessToken = authenticate(username, password)

    if (accessToken != null) {
        val cartContents = getCartContents(accessToken)
        if (cartContents != null) {
            println("Содержимое корзины:")
            cartContents.forEach { println(it) }
        } else {
            println("Ошибка: не удалось получить корзину.")
        }
    } else {
        println("Ошибка: неверные логин или пароль.")
    }
}