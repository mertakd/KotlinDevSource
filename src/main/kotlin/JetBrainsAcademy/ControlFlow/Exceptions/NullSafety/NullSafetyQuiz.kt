package JetBrainsAcademy.Projects.CoffeeMachine.JetBrainsAcademy.ControlFlow.Exceptions.NullSafety

// Quiz Basic

//Which one is the real name of an operator in Kotlin?
//elvis


//Why is !! considered a dangerous operator?
//It may produce a NullPointerException.



// kotlin de var olan operatörler
//  !!    !      ?





//Which operations are NullPointerException-safe?
//Elvis operator
//
//Wrapping variables with if-else checks
//
//?. operator










// Quiz 1
fun main1() {
    val age: Int? = null
    val name: String? = "Bob"
    val nickname: String? = null
    val length: Int = nickname?.length ?: 0
    println("$age ${name?.length} $length")

    //null 3 0

}



// Quiz 2
fun main2() {

    val line = readlnOrNull() ?: error("error!!!")
    println("Elvis says: $line")
}


//Quiz 3
fun main3() {
    val nullString: String? = "mert"
    nullString?.isEmpty() != false
    //Eğer nullString null veya boş bir dize ise, bu ifade false dönecektir.
}



//Quiz 4
fun main4() {

    val bottle: Boolean? = true
    bottle?: 0

    if (bottle != null) bottle else 0



    //bottle?.volume
    //if (bottle == null) null else bottle.volume

    //bottle!!.length
    //if (bottle == null) throw NullPointerException() else bottle.length
}








// Quiz 5
fun main5() {

    val number = readLine()!!.toInt()
    val result = round(number) ?: 0
    println(result)


}

fun round(number : Int): Int?{
    return if (number >= 1000) null else number
}








// Quiz 6
fun check(name: String): String?{
    return if (name.length > 5) null else name
}

fun main6() {
    val argument = readLine()!!
    val result = check(argument)
    println(result?.length?: 0)
}


fun main() {


}





