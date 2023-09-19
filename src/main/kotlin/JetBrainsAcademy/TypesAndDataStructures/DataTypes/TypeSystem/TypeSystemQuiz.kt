package JetBrainsAcademy.Projects.CoffeeMachine.JetBrainsAcademy.TypesAndDataStructures.DataTypes.TypeSystem

// Quiz Sözel

//Which type is a supertype for all non-nullable types?
//Any



//Which type is a supertype for all types?
//Any?


//Which return type signals that the function never returns controls?
//Nothing


//Which type is at the very bottom of the type hierarchy?
//Nothing






//What is the returning type of the next function?
//
//fun hello() {
//    println("Hello!")
//}

//Unit







//Analyze the body of the function carefully and specify what type of return value the compiler will output?
//
//fun checkIfNotNull() {
//    val isNull: Boolean? = null
//    if (isNull == null) {
//        throw Exception("Value is null!")
//    }
//}

//Nothing






//String length
//Write an implementation of a function named getLength that returns the length of a String, or -1 if the string is null.
fun getLength(input: String?): Int{
    return input?.length ?: -1
}








//String or Int
//Write an implementation of a function named isNumber that determines if String can be converted to Int . If it can, then return its Int value, otherwise return the same String.
//
//Tip: You can use String function .toIntOrNull()

//İşte bu noktada, neden Any türünü kullanmanız gerektiği devreye giriyor. Çünkü toIntOrNull işlevi hem Int hem de null dönebilir. Yani işlevin dönüş değeri iki farklı tür olabilir. Bu nedenle, işlevin sonucunu kabul etmek için en genel tür olan Any kullanılmıştır. Any türü, herhangi bir nesneyi temsil edebilen en genel türdür.
//Bu şekilde, isNumber işlevi hem bir tam sayıyı (Int) hem de bir dizeyi (String) veya null değerini dönebilir. Bu, işlevi daha genel amaçlı hale getirir ve farklı türlerle çalışmak istediğiniz durumlarda kullanışlı olabilir. Ancak işlevi kullanırken sonucun hangi tür olduğunu dikkate almanız gerekecektir.
fun isNumber(inpuut: String): Any{
    return inpuut.toIntOrNull() ?: inpuut
}






//Reverse me if you can
//Write a function named reverse that reverses a given Int value. If the given Int is null, then return -1.
//
//Sample Input 1:
//
//654
//Sample Output 1:
//
//456
fun reverse(input: Int?): Int{
    return input?.let {
        it.toString().reversed().toInt()
    } ?: -1
}








//The correct type system tree
//Sort the types of the type system tree in the correct way:

//Any
//Number
//Int
//Nothing








//Handling nullable types and null safety in a string program
//Implement a Kotlin program that initially has a nullable string. Your program should first print the length of the string if it's not null. Afterwards, set the string value to null and print 'Value is null!' if the string is found to be null upon checking its length. In this exercise, you need to consider null safety while dealing with nullable types in Kotlin. Your challenge is to reorder the lines of code provided to make this program work correctly.
fun main() {

    var str: String? = "Hello, World"

    print(str?.length)

    str = null

    print(str?.length ?: "Value is null!")
}