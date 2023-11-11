package lesson_21

import java.io.File
import java.io.FileWriter

fun File.addText(newText: String) {
    val text = newText.lowercase() + readText()
    val writer = FileWriter(this)
    writer.use {
        it.write(text)
    }
}

fun main() {

    val newWordsFile = File("newWords.txt")
    newWordsFile.createNewFile()

    newWordsFile.addText("ooooo")

    println(newWordsFile.readText())

}