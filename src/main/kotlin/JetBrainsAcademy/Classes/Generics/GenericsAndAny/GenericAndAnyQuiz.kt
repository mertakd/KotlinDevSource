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