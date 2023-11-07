package lesson_20

fun main() {

   val welcomeText: (userName: String) -> Unit = {
      println("С наступающим Новым Годом, $it!")
   }

   welcomeText("Petr")

}