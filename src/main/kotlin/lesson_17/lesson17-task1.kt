package lesson_17

class Quiz() {

    var question: String = ""
        get() = field
        set(value: String) {
            field = value
        }
    var answer: String = ""
        set(value: String) {
            field = value
        }
}