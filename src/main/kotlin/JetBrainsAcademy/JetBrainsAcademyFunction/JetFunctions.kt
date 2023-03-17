package JetBrainsAcademy.JetBrainsAcademyFunction

fun main() {


    //val result1= sum(2,5) //7

    //val result2 = sum(result1,4) //11


    // println(identity(1500))
    //println(sum(12,55))
    //println(get3())

    //val lastDigit = extractLastDigit(45)
    //println(lastDigit)

    //println(isPositive(-2))
}


/*
fun sum(a:Int, b:Int):Int{
    val result = a + b
    return result
}

fun identity(a:Int):Int{
    return a
}

fun sum2(a:Int,b:Int):Int{
    return a+b
}

fun get3():Int{
    return 3
}*/


/*fun max(
    a: Int,
    b: Int,
):Int{
    //argumanların sonuna virgül koyabilirsin 1.4 sürümünden sonra
}*/



              //Unit Function

/*fun printAB(a:Int, b:Int){
    println(a)
    println(b)
    *//**
     * The function prints the values of a and b
     *//*
}

fun printSum(a:Int,b:Int):Unit{
    println(a+b)
}*/
/**

fun extractLastDigit(number:Int):Int{
    val lastDigit = number % 10
    return lastDigit
}
 *bu işlev, bir sayının son basamağını çıkarır ve sonra onu döndürür

*/


fun isPositive(number:Int):Boolean{
    return number > 0
    //pozitif mi negatif mi
}

fun getGreeting(): String {
    return "hello"   // Ends the function
    println("hello") // Will not be executed
}


             //Single-expression functions

//kısa yazılışlar ve tip belirtmeyebiliriz
fun sum(a:Int,b:Int):Int = a + b
fun sum2(a:Int,b:Int) = a + b


fun sayHello():Unit = println("Hello")
fun sayHello2() = println("Hello")

fun isPositive2(number: Int):Boolean = number > 0
fun isPositive3(number: Int) = number > 0


fun theAnswer1() = 42   // short and clear -idiom function-

fun theAnswer2(): Int { // equivalent common function
    return 42
}