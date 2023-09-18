package JetBrainsAcademy.Projects.CoffeeMachine.Andromeda.Generics



fun <T> log(x: T) {
    println(x)
}

fun log(x: String) {
    println(x)
}

fun log(x: Int) {
    println(x)
}

fun log(x: Double) {
    println(x)
}

fun log(x: Float) {
    println(x)
}


fun main1() {
    log<Int>(15)
    log("hello")
    log(12.4f)
}









/**
 * Buradaki interface implemente edileceği zaman tip belirtilmelidir. Belirtilen tiple beraber
 * compiler x in String olacağını bilir ve ona göre override eder.
 */

interface Logger<T> {
    fun log(x: T)
}


class StringLogger : Logger<String> {
    override fun log(x: String) {

    }
}













/**
 * Variance super type ile sub type ın arasındaki ilişkinin ne olacağına
 * karar verir.
 *
 *
 */

/**
 * Parametre -> in position -> contravariance -> alt sınıf yerine üst sınıf kullanabilme
 * Return -> out position -> covariance -> üst sınıf yerine alt sınıf kullanabilme
 */



interface AnimalGeneric

interface DogAnimal : AnimalGeneric

interface AnimalGenericImplementation : AnimalGeneric

interface CatAnimal : AnimalGeneric

class Cavalier : DogAnimal

class British : CatAnimal

interface SuperType {
    fun match(subject: CatAnimal): DogAnimal
}

interface SubType : SuperType {
    /**
     * A subtype must accept at least the same range of types as its supertype declares.
     * A subtype must return at most the same range of types as its supertype declares.
     */
    override fun match(subject: CatAnimal): DogAnimal
}

class SubTypeImplementation : SubType {
    override fun match(subject: CatAnimal): Cavalier {
        return Cavalier()
    }
}

fun createSubType() = SubTypeImplementation()














// INVARIANCE
open class A {
    //some methods & member variable
}

class B : A() {
    // some mehods & member variables
}

/**
 * Invariance; tam olarak belirlenen tipin kullanılmasıdır
 * tipi a ise atanan değer de a olmak zorunda, tipi b ise atana da b olmak zorunda
 */
class InvarianceGenericClass<T : A> {

}

fun mainInvariance() {

    val invariance1: InvarianceGenericClass<A> = InvarianceGenericClass<A>()
    val invariance2: InvarianceGenericClass<B> = InvarianceGenericClass<B>()
}












//COVARIANCE

open class SuperHuman {
    // some methods & member variables
}

class Child : SuperHuman() {
    // some methods & member variables
}
/**
 * Covariance; super type yerine subtype kullanılması
 * Sadece out position da kullanılabilir. Yani fonksiyonun return type ı olarak kullanılabilir.
 * val property olarak kullanılabilir, var property olarak kullanılmaz
 */
class CovarianceGenericClass<out T : SuperHuman>

/**
 * Contravariance; subtype yerine supertype ın kullanılması
 * Sadece in position da yani parametre olarak kullanılabilir.
 * out position olarak kullanılmaz yani val ya da var property olarak kullanılmaz
 */
class ContravarianceGenericClass<in T : SuperHuman>







//covariance örnek


open class Mammal(val name: String) {
    fun eat() {

    }

    fun sleep() {

    }
}



data class Kitty(val kittyName: String, val isTwoFingered: Boolean) : Mammal(kittyName) {

    /*fun eat() {}

    fun sleep() {}*/
}

data class Lion(val lionName: String) : Mammal(lionName) {
    /*fun eat() {}

    fun sleep() {}*/
}


/**
 * Burada Mammal belirtilip Kitty gönderilebilmesinin sebebi List in out ile işaretlenip
 * covariance sağlamasıdır. Covariance gönderilen tipin alt tipinin de gönderilmesini
 * sağlar. Fonksiyon parametresi ile gönderilen parametre eşleşmediklerinde kabul
 * kriterleri, bunların en azından tanımlanan tipin alt türü olmasıdır.
 *
 * Covariance sadece tek yollu gider. Yani Lion Mammal in alt tipidir diyebiliriz ancak
 * Mammal bir Lion dur diyemeyiz.
 *
 *
 */

//üst sınıf yerine alt sınıfı kullanabildik out ile. bu şekil yapmasaydık bir çok feed fonksiyonu yazmak zorunda kalacaktık. buna da contravariance denir.
fun feed(elements: List<Mammal>) {
    elements.forEach {
        it.eat()
    }
}

/**
 * Contravariance, covariance ın tam tersidir. Yani Mammal bir Kitty derken
 * Kitty bir Mammaldır denilemez. Contravariance in ile işaretlenerek yapılır.
 */

/*fun feed(elements: List<Kitty>) {
    elements.forEach {
        it.eat()
    }
}

fun feed(elements: List<Lion>) {
    elements.forEach {
        it.eat()
    }
}*/
fun mainCovarianceExample() {
    val kitties = listOf(
        Kitty("A", false), Kitty("B", false), Kitty("C", false)
    )

    val lions = listOf(Lion("D"), Lion("E"))

    // Covariance
    //bir çok fonksiyon yerine tek bir fonksiyon yazdık.
    feed(kitties)
    feed(lions)
}












// Invariance
interface Device

class Computer : Device
class Telephone : Device

fun addComputer(list: MutableList<Any>) {
    list.add(Computer())
}


fun mainInvariance2() {

    val telephones = mutableListOf(
        Telephone(), Telephone(), Telephone()
    )
    // addComputer(telephones)

    println(telephones)
}








//input output

interface SomeInterface<in I, out O> {
    fun someFunction(p: I): O
}


class SomeImplementation : SomeInterface<Int, String> {
    override fun someFunction(i: Int): String {
        return "Received: $i"
    }
}

fun main() {
    val implementation = SomeImplementation()
    val result: String = implementation.someFunction(42)
    println(result)
}
