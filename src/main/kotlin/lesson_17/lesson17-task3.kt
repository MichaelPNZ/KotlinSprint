package lesson_17


class Folder(name: String, fileCount: Int, private val isSecret: Boolean) {

    val name: String = name
        get() = if (isSecret) "скрытая папка" else field

    val fileCount: Int = fileCount
        get() = if (isSecret) 0 else field

}

fun main() {
    val hiddenFolder = Folder("Моя папка", 6, true)

    println("Имя папки: ${hiddenFolder.name}")
    println("Количество файлов в папке: ${hiddenFolder.fileCount}")
}
