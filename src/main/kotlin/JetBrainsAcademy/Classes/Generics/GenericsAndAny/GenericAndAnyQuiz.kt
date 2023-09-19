package JetBrainsAcademy.Classes.Generics.GenericsAndAny

// Quiz 1
class Holder(var value: Any) {
    fun set(newValue: Any) {
        value = newValue
    }

    fun get(): Any {
        return value
    }
}

fun main11() {
    val holder: Holder = Holder(0)
    holder.set(256)

    // correct the line to make the code compile
    val value: Int = holder.get() as Int

    // do not change
    println(value)
}









// Quiz 2
class Holder2<T>(val value: T) {

    fun get(): T {
        return value
    }
}
fun main12() {
    // write your code here
    val holder: Holder2<String> = Holder2<String>("This is an instance of String")

    // Do not change the code below
    val holderValue = holder.get()
    print(holderValue)

    val instance = MyClass("Hello!")
    println(instance)
}






//Quiz 3
class MyClass<T>(val t: T) {

    fun get(): T {
        return t
    }
}








//Quiz 4
class GenericClass<T>(val value: T){

    fun get(): T {
        return value
    }

}






//Quiz5
data class Box<T,P>(val name: T, val weight: P){


}











// Quiz 6
class Box2<T> (var value: T) {

    fun set(newValue: T) {
        value = newValue
    }
}

fun main6() {
    val box = Box2(0L)
    //val box:Box2<Long> = Box2<Long>(0L)
    box.set(10L)
}







// Quiz 7
class Box3<T> (var value: T) {

    fun set(newValue: T) {
        value = newValue
    }
}

fun main7() {
    //Compile-time: The Long literal does not conform to the expected type String
    //val box: Box<String> = Box<String>("")
    //box.set(10L)

    //CORRECT
    val box: Box3<Long> = Box3<Long>(15L)
    box.set(29L)

}





// Quiz 8
fun <T> returnMessage(value: T): T{
    return value
}
fun main8() {
    val result1 = returnMessage("naber canım")
    val result2 = returnMessage(62)
    println(result1)
    println(result2)
}




//Quiz 9
class NonGenericClass2(val value: Any){

    fun get(): Any{
        return value
    }
}

fun main() {

    val result = NonGenericClass2("naber canım :D")
    println(result.value)
}








//Why generics?
//Select the two reasons why you might want to use Generics instead of Any:

//Generics enhance type safety by shifting more type checking responsibilities to the compiler
//
//Generics can work with multiple classes without explicit type-casting





