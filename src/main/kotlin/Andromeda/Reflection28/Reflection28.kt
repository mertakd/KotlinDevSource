package JetBrainsAcademy.Projects.CoffeeMachine.Andromeda.Reflection28

import java.lang.reflect.Constructor


/**
 * Reflection yazılan kodun yapısının çalışma zamanında incelenmesine olanak sağlayan bir yapıdır. Örneğin bir
 * property nin tipini öğrenme, private ise public yapma gibi işlemler yapılabilir
 */
/**
 * Eğer bir sınıfın üyesi veya extension fonksiyonu kullanılmak istenirse; String::length
 */


class ReflectionClass

fun main1A() {
    /**
     * Nesne örneği değil, sınıfın referansını yani sınıfın kendisini almış oluyoruz.
     * Burada dönen tip KClass şeklindedir. Kotlin Class, Java Class (JVM tarafındaki) referansı ile aynı değildir.
     */
    val reflectionKotlin = ReflectionClass::class
    //sınıfın  kendisini almış olduk
    println(reflectionKotlin.constructors.size)
    //bu sınıfın bir çok özelliğini alabiliyoruz.
    println(reflectionKotlin.isOpen)

    // val name: String = "Hello"

    // val length = name.length

    /**
     * Kotlin Class, Java Class referansı ile aynı değildir. JVM tarafındaki sınıfı almak için .java kullanılmalıdır.
     */
    val reflectionJava = ReflectionClass::class.java
    println(reflectionJava.constructors.size)
}











fun main1() {

    val isEmptyStringList: List<String>.() -> Boolean = List<String>::isEmpty

    val names = listOf("Halil", "Metehan", "Serdar", "İbrahim")
    println(names.isEmptyStringList())
    //names.isEmpty() diye kontrol etmektense, isEmpty() fonksiyon haline çevirmiş oluyoruz.daha da kontrol edilmiş hale getirmiş oluyoruz.


}













fun isEven(x: Int) = x % 2 == 0

fun main2() {
    val numbers = listOf(1, 2, 3)
    println(numbers.filter(::isEven))
    // bu fonksiyon referance , reflaction değil.


}











fun length(x: String) = x.length

fun <A, B, C> unionCondition(f: (B) -> C, g: (A) -> B): (A) -> C {
    return {
        f(g(it))
    }
}

fun main3() {

    val names = listOf("Halil", "Metehan", "Serdar", "İbrahim")

    val oddLengthPredicate = unionCondition(::isEven, ::length)
    println(names.filter(oddLengthPredicate))
    // elemanşların uzunluğu çift olanları filtreliyor.
}













var counter = 1
fun main4() {
    //annotation prosesing ler de kullanılıyor reflection un bu tarz kullanımı
    //bir sınıfa kod yazarak fonksiyon tanımlamış oluyoruz.
    //sınıfın istediğimiz gibi davranmasını sağlıyoruz.
    //class a bir property koymuş oluyoruz. bunun private mı public mi olacağını belirtiyoruz. Reflection un kullanım yerleri genelde burası.

    println(::counter.get())
    println(::counter.name)
    ::counter.set(2)
    println(counter)

}












fun main5() {

    /**
     * Property referansı tek bir parametre beklenen fonksiyonlar kullanılabilir
     */

    val names = listOf("Halil", "Metehan", "Serdar", "İbrahim")
    println(names.map(String::length))


    //uzun yolu
    println(names.map {
        it.length
    })
}











data class UserData(var name: String)

fun main6() {
    val name = UserData::name
    println(name.get(UserData("Halil")))
}







class Empty

fun createEmpty(initializer: () -> Empty) {
    val empty = initializer()
}
fun main7() {
    /**
     * Constructorsız bir sınıfın reflection ile kullanımı
     */
    createEmpty(::Empty)
}












class ClassWithPrivateConstructor private constructor() {

    fun getName(): String = "Hello"
}

fun createPrivateClassWithReflection(): ClassWithPrivateConstructor {
    return (ClassWithPrivateConstructor::class.java.declaredConstructors[0].apply {
        isAccessible = true
    } as Constructor<ClassWithPrivateConstructor>).newInstance()
    //CLASS ımız private olmasına rağmen instance sini oluşturmak istiyorsak
    //bottomsheet in height private bunu bu şekil public yapıyoruz.
}


fun main8() {

    val private = createPrivateClassWithReflection()
    private.getName()


}










//kotlin ile reflection
class ClassWithPrivateProperty {
    private val name: String = "Hello From Private Property"
}
/*

fun main() {
    val classWithPrivateProperty = ClassWithPrivateProperty()
    val field = ClassWithPrivateProperty::class.memberProperties.find {
        it.name == "name"
    }

    field?.let {
        it.isAccessible = true
        val value = it.get(classWithPrivateProperty)
        println(value)
    }
}

*/


