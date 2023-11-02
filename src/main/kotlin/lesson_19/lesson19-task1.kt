package lesson_19

enum class Fish {
    GUPPY,
    ANGELFISH,
    GOLDFISH,
    SIAMESE_FIGHTING_FISH,
}


fun main() {

    for (i in Fish.entries) println(i)

}