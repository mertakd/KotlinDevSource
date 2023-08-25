package Kekod.Classes

/**
 * Expression: herhhangi bir yapıyı, bir değişkenin eşitliğine yazıyorsak expression kullanımı diyoruz.object i de bu şeki kullanabiliyoruz.
 *
 * Arka plan yani java kodunda private static final olarak tutuluyor. çünkü düz bir değişken gibi tutuyoruz.yani object olmasından kaynaklı değil. (java da final: Bir sınıfı final olarak işaretlemek, bu sınıfın başka sınıflar tarafından alt sınıf olarak genişletilemez olduğu anlamına gelir. Yani bu sınıfın alt sınıfları oluşturulamaz.final fonksiyon override edilemez.final değişkeni bir kez atanır ve sonra değiştirilemez.)
 * inline function 1:00:17 -> inline high order nesnesi oluşturma işlemini iptal eder.
 * kullan at, sınıf olarak kullanmak istemiyorsak kullan at object tanımlaması yapabiliriz.
   Yani sadece bir class içinde bu yapıyı kullanacaksak object expression kullanılabilir.
   İsimsiz class ve isimsiz interface ler oluşturmamızı sağlıyor. kullan at class veya interface diye tabir edilir
 * sade bir object değişkeni yani üst sınıfları olmayan. Türü Any dir.
 * iki veya daha fazla üst sınıf varsa tip belirtmemiz gerekiyor. tek kullanırsak gerekmez.
   Tip olarak neyi tanımlıyorsak sadece ona ulaşabiliriz main de. class tanımlarsak, interface in metoduna ulaşamayız.

 * */


interface Print2{
    fun onPrint()
}


open class User(val age:Int){

    open fun getUserFullName(){}
}





val fullName: User  = object : Print2, User(23){

    val firstName = "Mert"
    val surName = "Akdoğan"


    override fun onPrint() {
        println("Fulll name = $firstName $surName")
    }


    override fun getUserFullName() {
        super.getUserFullName()
    }


    override fun toString(): String {
        return "$firstName $surName"
    }


}


fun main() {

    fullName.getUserFullName()
    //fullName.onPint() erişilemiyor
}