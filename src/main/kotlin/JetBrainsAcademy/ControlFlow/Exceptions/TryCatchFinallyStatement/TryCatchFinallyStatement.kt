package JetBrainsAcademy.Projects.CoffeeMachine.JetBrainsAcademy.ControlFlow.Exceptions.TryCatchFinallyStatement

//Örneğin, bir dosyayla çalışırken bir istisna meydana gelebilir: o zaman, nihayet ifadesinde bu dosyanın kapanışını yazabilirsiniz.


fun main11() {
    try {
        println("Inside the try block")
        println(2 / 0) // throws ArithmeticException
    }
    catch (e: Exception) {
        println("Inside the catch block")
    }
    finally {
        println("Inside the finally block")
    }

    println("After the try-catch-finally block")
}




// neden o zaman finally ye ihtiyacımız var?
fun main22() {
    try {
        val a = 0/0 // throws ArithmeticException
    }
    finally {
        println("End of the try block") // will be executed
    }
    println("End of the program") // will not be printed
}







//Yani kod herhangi bir sayıda catch bloğu içerebilir veya hiç böyle bir blok içermeyebilir ve son olarak bloklar atlanabilir.
fun main33() {
    try {
        // code that may throw an exception
    }
    finally {
        // code will always be executed
    }
}






//Try is an expression
fun main999() {
    val number: Int = try { "abc".toInt() } catch (e: NumberFormatException) { 0 }
    println(number) // 0



    val number2: Int = try { "2a".toInt() } catch (e: NumberFormatException) { 0 }
    finally { println("Inside the finally block") }
    println(number2)
    //Inside the finally block
    //0
}



