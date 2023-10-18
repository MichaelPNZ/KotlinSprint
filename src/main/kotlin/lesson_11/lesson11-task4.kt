package lesson_11

class Contact(
    val image: String,
    val firstName: String,
    val secondName: String,
    val iconButton: List<String>,
    val nameButton: List<String>,
    val phone: List<String>,
    val phoneNumber: List<String>,
    val faceTime: String,
    val iCloud: String,
    val emailICloud: String,
    val friendName: CloseContact,
) {
    fun printUserInfo() {
        println(image)
        println("${firstName} ${secondName}")
    }

    fun printButtons() { forEach(iconButton, nameButton) }

    fun printPhoneNumber() { forEach(phone, phoneNumber) }

    fun printFaceTime() { println("${faceTime} ${iconButton[2]} ${iconButton[1]}") }

    fun printICloud() {
        println(iCloud)
        println(emailICloud)
    }

    fun printFriends() { forEach(friendName) }

    fun forEach(string: List<String>, string2: List<String>) {
        var index = 0
        for (i in 1..string.size) {
            println(string[index])
            println(string2[index])
            index += 1
        }
    }
    fun forEach(string: CloseContact) {
        var index = 0
        for (i in 1..string.id.size) {
            println(string.name[index])
            index += 1
        }
    }
}

class CloseContact(
    val id: List<Int>,
    val name: List<String>,
)

fun main() {
    val contact = Contact(
        image = "MouseImage",
        firstName= "First Name",
        secondName= "Second Name",
        iconButton = listOf("MassageIcon", "PhoneCallingIcon", "VideoCallingIcon", "EmailIcon"),
        nameButton = listOf("написать", "вызов", "видео", "почта"),
        phone = listOf("сотовый", "домашний"),
        phoneNumber = listOf("8 (999) 999-42-42", "8 (999) 888-42-42"),
        faceTime = "FaceTime",
        iCloud = "ICloud",
        emailICloud = "mail@mail.ru",
        friendName = CloseContact(id = listOf(1,2,3), name = listOf("Petya", "Valya", "Shura"))
    )

    contact.printUserInfo()
    println()
    contact.printButtons()
    println()
    contact.printPhoneNumber()
    println()
    contact.printFaceTime()
    println()
    contact.printICloud()
    println()
    contact.printFriends()
}