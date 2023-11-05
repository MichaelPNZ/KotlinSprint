package lesson_18

abstract class Dice {
    abstract val countFaces: Int

    fun rollDice(): String {
        return "Выпало число: $countFaces"
    }

}

class FourFaces(
    override val countFaces: Int = (1..4).random(),
) : Dice()

class SixFaces(
    override val countFaces: Int = (1..6).random(),
) : Dice()

class EightFaces(
    override val countFaces: Int = (1..8).random(),
) : Dice()

fun main() {

    val diceOne = FourFaces()
    val diceTwo = SixFaces()
    val diceThree = EightFaces()

    val list = arrayOf<Dice>(diceOne, diceTwo, diceThree)

    showAllFaces(list)

}

fun showAllFaces(faces: Array<Dice>) {
    faces.forEach {
        println(it.rollDice())
    }
}