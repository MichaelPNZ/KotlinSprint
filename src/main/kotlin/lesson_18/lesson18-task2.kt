package lesson_18

open class Dice {

    open fun rollDice() = ""

}

class FourFaces(
    private val countFaces: Int = (1..4).random(),
) : Dice() {
    override fun rollDice(): String {
        return "Выпало число: $countFaces"
    }
}

class SixFaces(
    private val countFaces: Int = (1..6).random(),
) : Dice() {
    override fun rollDice(): String {
        return "Выпало число: $countFaces"
    }
}

class EightFaces(
    private val countFaces: Int = (1..8).random(),
) : Dice() {
    override fun rollDice(): String {
        return "Выпало число: $countFaces"
    }
}

fun main() {

    val diceOne = FourFaces()
    val diceTwo = SixFaces()
    val diceThree = EightFaces()

    val list = arrayOf<Dice>(diceOne, diceTwo, diceThree)

    showAllNotes(list)

}

fun showAllNotes(notes: Array<Dice>) {
    notes.forEach {
        println(it.rollDice())
    }
}