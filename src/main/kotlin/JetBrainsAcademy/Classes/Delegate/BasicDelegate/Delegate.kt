package JetBrainsAcademy.Classes.Delegate.BasicDelegate

/**
 * Kotlin programlama dilinde arabirimler (interfaces) ve delegasyon (delegation) kavramlarını kullanarak bir sınıfın işlevselliğini başka bir sınıfa aktarmayı göstermektedir.
 * Çoğu programlama, bazen birkaç değişiklikle, mevcut kodun yeniden kullanılmasını içerir.
   Örneğin, nesne yönelimli programlamada (Kotlin'de durum böyledir), kodun yeniden kullanımı için ana araç, daha önce ele aldığımız (İNHERİTANCE)kalıtımdır (ve dolayısıyla kompozisyondur)
   Bu konu başlığımızda mirasa(Inheritance) alternatif olan Delegate tartışacağız.

 * Yetkilendirme, uygulamayı sağlamak(implementation) yerine belirli bir nesneyi(object) kullanma sürecidir ve bunun tam olarak nasıl çalıştığına bir göz atacağız
 * Delegasyon, bir sınıfın belirli davranışlarını başka bir nesneye devretme mekanizmasıdır. Bu sayede, bir sınıfın kodunu kopyala-yapıştır yapmadan başka bir sınıfın davranışlarını kullanabilirsiniz.
 *
 * Delegate Bir sınıfın veya nesnenin, sağlanan arayüz(interface) uygulamasının işlevselliğini kullanmasına olanak tanır.
 *
 * */


interface MyInterface {
    fun print()
    val msg: String
}

class MyImplementation : MyInterface {
    override fun print() {
        println(msg)
    }

    override val msg: String = "MyImplementation sends regards!"
}





class MyNewClass(base: MyInterface) : MyInterface by base {

    override val msg = "Delegate sends regards."


// Ancak, bu sınıfın bir farkı vardır: MyNewClass sınıfı, delegasyon (delegation) kullanarak MyInterface'i bir başka sınıfa (burada base olarak adlandırılan bir sınıfa) devreder.

}


fun main() {

    val a = MyImplementation()


    println("delegate oluyor")
    val delegate = MyNewClass(a)
    println(delegate.msg)
    println(delegate.print())
}