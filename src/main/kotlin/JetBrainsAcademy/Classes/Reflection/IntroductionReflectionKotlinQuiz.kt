package JetBrainsAcademy.Projects.CoffeeMachine.JetBrainsAcademy.Classes.Reflection

//SÖZEL

//1
//Reflection disadvantages include:
//Maintenance: it's difficult to find bugs at compile time
//Security: it can access and modify private members
//Performance: reflection requires extra time for processing the structure of the code



//2
//Advantages
//Code with reflection can:

//Observe and modify itself at runtime


//3
//Java class
//What property in Kotlin returns the runtime Java class representation of the class of an object at runtime?
//javaClass



//4
//Metaprogramming uses
//Metaprogramming can be used in:

//Functional programming
//
//Frameworks, libraries, functional and reactive programming in general
//
//Testing
//
//Building and maintaining dynamic applications




//5
//Metaprogramming tools
//In Kotlin, metaprogramming can be done with the help of:

//Annotations
//Kotlin reflection
//Java reflection












//Quiz1
//What is inside ?
//There is a class called Secret. Please use this valuable information and print all the fields inside it using Java reflection.
class Secret
fun main20() {
    val secret = Secret()
    val secretFields = secret.javaClass.declaredFields
    secretFields.forEach { println(it) }
}





//Quiz2
//No secrets with reflections
//There is a class called Secret. Please use this valuable information to invoke all the methods inside it using Java reflection and print them.
fun main21() {
    val secret = Secret()
    val methods = secret.javaClass.declaredMethods
    methods.forEach {
        it.isAccessible = true
        println(it.invoke(secret))
    }
}
