package JetBrainsAcademy.Exception

/**
 * EXCEPTION
 * sözdizimsel olarak doğru olmasına ve sorunsuz bir şekilde derlenmiş olmasına rağmen, bir program çalışırken bir hata meydana gelebilir. Bu tür durumlar Kotlin'de İstisnalar olarak adlandırılır.
 * */


fun main() {

    val input = 5

    val a: Int? = try { input.toInt() } catch (e: NumberFormatException) { null }

    println(a)
}