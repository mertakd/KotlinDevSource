package JetBrainsAcademy.Classes.Inheritance.InheritanceAndConstructor

/**
 * Türetilmiş bir sınıf, kendi çoklu kurucu şemasını oluşturmak için temel sınıfın çoklu kurucularından yararlanabilir.
 * */

//1.Inheritance and primary constructor

//Temel sınıfın yapıcı parametreleri varsa, türetilmiş sınıfın bunlarla ilgilenmesi gerekir.
//Temel sınıf düzgün şekilde başlatılmamışsa Kotlin bir programın derlenmesine izin vermez. Aşağıdaki örnekler, birincil kurucu aracılığıyla temel sınıf başlatmanın bazı durumlarını göstermektedir.
//Diğer tüm parametreler yeni özellikler değildir ve temel sınıf Book'un ilgili özelliklerini başlatmak için kullanılırlar.
//NoInfoBook sınıfı, temel sınıfı başlatmak için kullanılan yalnızca 2 parametreye sahiptir.

open class Book1

class Fiction1 : Book1()
//Book1() un cınstructor parantezi olmak zorunda miras alınırken.



//verilecek örnekde publisher hariç diğer parametreler üst class book un constructor ını başlatmak için verilir. yani alt sınıfları yeni property si değil aslında book un intialize ediyor. yeni property sadece publisher.
open class Book(val title: String, val author: String = "Unknown",
                val genre: String = "Unknown", val isbn: Long = 0)

class ExtBook(val publisher: String = "Unknown", title: String,
              genre: String = "Unknown", author: String = "Unknown",
              isbn: Long = 0) : Book(title, author, genre, isbn)

class NoInfoBook(title: String, author: String = "Unknown") : Book(title, author)

class FictionBook(title: String, author: String = "Unknown",
                  isbn: Long = 0) : Book(title, author, genre = "fiction", isbn)


fun main2() {

    val fiction = FictionBook("alice harikalar","james skalon",95)
    println( fiction.genre)
}





// 2.Inheritance and secondary constructor

open class Base(val beta:Int, val gamma:Int, var message:String = ""){
    constructor(beta: Int, message: String = "") : this(beta,0,message)
    // Bu kurucu, this(beta, 0, message) ifadesi ile birincil kurucuya çağrı yapıyor. Bu da demek oluyor ki, ikincil kurucu aslında birincil kurucuyu çağırarak nesneyi başlatıyor.
}


class Derived(val alpha:Int, beta: Int, gamma: Int, message: String = "") : Base(beta, gamma, message){
    constructor(alpha: Int, beta: Int, message: String = "") : this(alpha, beta, 0, message)
}

fun main1() {
    Base(10)
    Base(10,20)
    Base(10,20,"my message")
    Base(10,"my message")
}
//Temel sınıfın ikincil kurucusu, this anahtar sözcüğü aracılığıyla birincil kurucuya yetki verme işlemini kullanıyor




//DERİVED SINIFI SECODEY CONSTRUCTER LAR İLE DAHA FAZLA KONTROL ALTINA ALINIYOR
open class Base2(val beta: Int, val gamma: Int = 0, var message: String = "")

class Derived2 : Base2 {
    val alpha: Int

    constructor(alphaConstr: Int, beta: Int) : super(beta) {
        alpha = alphaConstr
    }

    constructor(alphaConstr: Int, beta: Int, gamma: Int) : super(beta, gamma) {
        alpha = alphaConstr
    }

    constructor(alphaConstr: Int, beta: Int, gamma: Int, message: String) : super(beta, gamma, message) {
        alpha = alphaConstr
    }

    constructor(alphaConstr: Int, beta: Int, message: String) : super(beta, message = message) {
        alpha = alphaConstr
    }
}



//SIRALAMA
open class Base3(val message: String, val email: String){

    init {
        println("Base class init")
    }

    constructor(email: String) : this("no message",email) {
        println("base class secodry")
    }
}

class Derived3(email: String) : Base3(email){

    init {
        println("derived class init")
    }
    constructor() : this("example.com"){
        println("derived class secondery")
    }
}


fun main3() {

    println("deriveddddddddddddddd")
    val myDerived = Derived3()
    println(myDerived.email)
}
