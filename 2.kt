class Message(var username: String) {
    fun introduce() {
        println("Привет, меня зовут $username")
    }
}

fun main() {
    val a = Message("Алексей")
   a.introduce() 
}
