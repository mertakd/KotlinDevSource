package JetBrainsAcademy.Classes.Generics.GenericsAndAny

class GenericType<T>(val t: T){
    fun get(): T{
        return t
    }
}

class NonGenericClass(val value: Any){
    fun get(): Any{
        return value
    }
}


fun main1() {

    val stringInstance: GenericType<String> = GenericType<String>("abc")
    val stringField = stringInstance.get()
    println(stringField)


    // non generic
    val nonGenericInstance: NonGenericClass = NonGenericClass("abc")
    //val str: String = nonGenericInstance.get() // Compile-time error: Type mismatch
    val str: String = nonGenericInstance.get() as String // "abc"


    //Hata Durumu
    //instance yi stringe çevirdik ama gelen değer integer olduğu için run-time da hata verir.
    val instance: NonGenericClass = NonGenericClass(123)
    val string: String = instance.get() as String // throws java.lang.ClassCastException



    //Generic yapının faydası

    //Açık bir tür dönüşümü gerçekleştirmeye gerek olmadığından, hiçbir zaman çalışma zamanı(runtime) istisnası yaşamayız
    //Yanlış bir şey yaparsak bunu derleme zamanında(compile-time.) görebiliriz.
    val stringInstance2: GenericType<String> = GenericType<String>("abc")

    val str2: String = stringInstance.get() // There is no type-casting here
    //val num2: Int = stringInstance2.get() // It does not compile

}


//Jenerikler, tip kontrol sorumluluklarını Kotlin derleyicisine kaydırarak tip güvenliği sağlar.
class PairGneric<T,P>(var first: T, var second: P){

    fun changeFirst(newValue: T){
        first = newValue
    }

    fun changeSecond(newValue: P){
        second = newValue
    }

    fun printData(){
        println("Value:")
        println("first = $first")
        println("second = $second")
    }
}



class PairNonGeneric(var first: Any, var second: Any){

    fun changeFirst(newValue: Any){
        first = newValue
    }

    fun changeSecond(newValue: Any){
        second = newValue
    }

    fun printData(){
        println("Value:")
        println("first = $first")
        println("second = $second")
    }

}


fun main() {

    val genericPair: PairGneric<String, Int> = PairGneric("John",8)
    val nonGenericPair: PairNonGeneric = PairNonGeneric("Kate",18)

    //genericPair.changeFirst(8)
    nonGenericPair.changeSecond("smith")
}

