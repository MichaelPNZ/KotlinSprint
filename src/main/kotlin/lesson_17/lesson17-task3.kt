package lesson_17


class Folder(val name: String, private val fileCount: Int, private val isSecret: Boolean) {
    val folderName: String
        get() = if (isSecret) "скрытая папка" else name

    val folderFileCount: Int
        get() = if (isSecret) 0 else fileCount
}

fun main() {
    val hiddenFolder = Folder("Моя папка", 6, false)

    println("Имя папки: ${hiddenFolder.folderName}")
    println("Количество файлов в папке: ${hiddenFolder.folderFileCount}")
}
