package JetBrainsAcademy.Projects.CoffeeMachine.JetBrainsAcademy.LambdaExpressions.InlineFunctions

fun mainss() {
    val time = measureTimeMillis {
        // do some time-consuming operation
        Thread.sleep(1000)
    }
    println("Time taken: $time milliseconds")
}



inline fun measureTimeMillis(block: () -> Unit): Long {
    val startTime = System.currentTimeMillis()
    block()
    return System.currentTimeMillis() - startTime
}





inline fun <reified T> printType() {
    println(T::class.qualifiedName)
}

fun main() {
    printType<String>() // Burada çağrılan fonksiyon String türü için çalışacak ve bu türün adını yazdıracak
    printType<Int>()    // Aynı şekilde, bu da Int türünün adını yazdıracak
}