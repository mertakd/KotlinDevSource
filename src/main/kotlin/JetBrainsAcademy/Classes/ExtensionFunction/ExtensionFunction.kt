package JetBrainsAcademy.Classes.ExtensionFunction

//Özetle, burada bahsedilen sorun, mevcut sınıflara doğrudan üye fonksiyon ekleyememek ve bunun yerine uzantı fonksiyonları kullanarak bu sınıflara yeni fonksiyonlar eklemenin nasıl bir çözüm olduğunu anlatmaktadır.
//string değiştirilemeyen sınıftır bu yüzden direk üye fonksiyon eklenemez.bu yüzden de extension fonksiyonlar kullanılır.

//genişletilecek sınıfa(mesela String sınıfı) receiver type.
//Her zamanki gibi aynı imzayla iki işlevi tanımlayamazsınız.
// Bir uzantı işlevine zaten var olan adı vermek istiyorsanız, işlevin imzasını değiştirmeniz gerekir; örneğin, argümanlarını değiştirin.



fun String.repeated(): String = this + this

fun main1() {

    println("ha".repeated())

}




//Uzantı işlevinde bir nesnenin field ına, üye işlevinde olduğu kadar kolay bir şekilde erişebilirsiniz.
//Bu nesneye receiver object denir.
//Diğer işlevler gibi, uzantı işlevlerinin de argüman alabileceğini ve alıcı türüyle aynı tür de dahil olmak üzere herhangi bir türde değer döndürebileceğini unutmayın
//.first() ve .toUpperCase()  de extension function örneğidir.
//member function lar her zaman kazanır extension lara karşı.


class Client(val name: String, val age: Int)

fun Client.getInfo() = "$name $age"  // Client is the receiver type


fun main2() {

    val client = Client("John", 32)
    println(client.getInfo())  // client is the receiver object
}




// 3.Extension function vs member function

class A {
    fun member() = println("hi from member")
}

fun A.extension() = println("hi from extension")


fun main() {

    A().member()
    A().extension()
}