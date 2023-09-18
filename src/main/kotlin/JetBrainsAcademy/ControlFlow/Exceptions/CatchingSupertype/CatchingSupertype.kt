package JetBrainsAcademy.Projects.CoffeeMachine.JetBrainsAcademy.ControlFlow.Exceptions.CatchingSupertype




//yanlış sıralama excetion en üst sınıf(süper tip) olduğu için kendisi çağırılır
fun main99() {

    val input = readln()

    try {
        println(100 / input.toInt())
    } catch (e: Exception) {
        println("What else can go wrong!")
    } catch (e: NumberFormatException) {
        println("You didn't type an INT number!")
    } catch (e: ArithmeticException) {
        println("You typed 0!")
    }
}




//doğru sıralama
fun main98() {
    val input = readln()
    try {
        println(100 / input.toInt())
    } catch (e: NumberFormatException) {
        println("You didn't type an INT number!")
    } catch (e: ArithmeticException) {
        println("You typed 0!")
    } catch (e: Exception) {
        println("What else can go wrong!")
    }
}







// hepsini bir arada yakalamak
// çoklu kontrol yaparsak Exception  ele almak best practise dir
fun main() {
    val input = readln()
    try {
        println(100 / input.toInt())
    } catch (e: Exception) {
        when (e) {
            is NumberFormatException -> println("You didn't type an INT number!")
            is ArithmeticException -> println("You typed 0!")
            else -> println("What else can go wrong!")
        }
    }
}