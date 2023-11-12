package lesson_22


class ViewMadel(data: String) {

    private val mainScreenState = MainScreenState(data)

    private data class MainScreenState(
        val data: String,
        val isLoading: Boolean = false,
    )

    fun loadData() {
        println("отсутствие данных")
        if (mainScreenState.data.isNotEmpty()) {
            println("загрузка данных")
            val buffer = mainScreenState.copy(isLoading = true)
            println(buffer)
            println("наличие загруженных данных")
        }
    }

}

fun main() {

    val viewState = ViewMadel("asdad")
    viewState.loadData()

}