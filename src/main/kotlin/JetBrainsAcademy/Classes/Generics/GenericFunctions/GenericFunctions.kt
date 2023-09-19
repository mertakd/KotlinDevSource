package JetBrainsAcademy.Classes.Generics.GenericFunctions


fun <T> doSomething(t: T): T {
    return t
}





//Generic functions can also take or return values of non-generic types
fun <T> calculateLength(list: List<T>): Int {
    return list.size
}

fun main22() {

    var list = listOf("hello", "from", "hyperskill")
    println(calculateLength<String>(list)) //3
    //arguman type belirtilmeli.<String>

    println(calculateLength(list)) // 3
    //tip çıkarımı da yapar.
}



//Tıpkı generic sınıflar gibi, generic işlevler de çeşitli tür parametrelerine sahip olabilir.
fun <T,U> multipleDoSomething(t: T, u: U){
    // do something
}







interface MyInterface<T>

fun <T, F : MyInterface<T>> genericFun() {}

fun main346345645() {
    genericFun<_, MyInterface<String>>() // The first T is inferred as String,
    // because the second T is explicitly defined as String.
}







// Generic methods
class NonGenericClass {

    fun <T> someGenericMethod(t: T): T {

        return t
    }
}


fun main23() {
    var item = NonGenericClass()
    var value = item.someGenericMethod("Hello!")
    println(value)
}



//Bir sınıfa üye olmadığınızda bazı işlevler eklemenize olanak tanıyan uzantı işlevlerini kullanabilirsiniz.
class BiggerBox<T>(var value1: T, var value2: T) {}

fun <T> BiggerBox<T>.changeBoxes() {
    val tmp = this.value1
    this.value1 = this.value2
    this.value2 = tmp
}

fun main() {
    var box = BiggerBox("hyperskill", "kotlin")
    println("${box.value1} and ${box.value2}")// hyperskill and kotlin
    box.changeBoxes()
    println("${box.value1} and ${box.value2}")// kotlin and hyperskill
}







/*
*Bu örnekte, someGenericMethod fonksiyonu T türünden bir değeri alır (stringValue) ve U türünden bir değeri de alır (intValue), ancak fonksiyon
*sadece T değerini döndürürken U üzerinde herhangi bir işlem yapmaz. Bu nedenle, U türünden gelen intValue değeri fonksiyon içinde kullanılmaz ve
*sadece stringValue değeri geri döndürülür.   */


class GenericClass<T>{

    fun <U> someGenericMethod(t: T, u: U): T{
        // Sadece T türündeki değeri döndürüyoruz, U üzerinde işlem yapmıyoruz
        return t
    }
}


fun main9999() {

    val genericObject = GenericClass<String>()

    val stringValue = "merhaba dünya!"
    val intValue = 42

    val result = genericObject.someGenericMethod(stringValue,intValue)
    println(result)
}