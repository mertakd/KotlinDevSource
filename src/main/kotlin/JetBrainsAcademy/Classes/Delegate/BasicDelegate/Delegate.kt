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




//delegasyon ile print fonksiyonunu yazmamız gerekmiyor.
class MyNewClass(base: MyInterface) : MyInterface by base {

    override val msg = "Delegate sends regards."


// Ancak, bu sınıfın bir farkı vardır: MyNewClass sınıfı, delegasyon (delegation) kullanarak MyInterface'i bir başka sınıfa (burada base olarak adlandırılan bir sınıfa) devreder.

}


fun main123() {

    val delegate = MyImplementation() //delegate

    val delegatingObj = MyNewClass(delegate)
    println(delegatingObj.msg)

    println(delegatingObj.print())
    //delege.print() yazdığımız zaman bu fonksiyon çağrılır. Yani, MyNewClass sınıfı bu görevi MyImplementation'a (temsilci) devreder.
}













interface ICallbackReceiver {
    fun onBeforeAction()
    fun onAfterAction()
    fun action(function: () -> Unit) {
        onBeforeAction()
        function()
        onAfterAction()
    }
}

// Defines the contract for logging
interface ILogger {
    fun getStubDateTime() = "05.11.2022-14:31:04" // placeholder date and time

    val format: String
        get() = "[${getStubDateTime()}]: "

    fun print(s: String)
}



// Simple implementation of ILogger interface
class BasicLogger : ILogger {
    override fun print(s: String) = println(format + s)
}

// Implementation of ICallbackReceiver that uses BasicLogger for printing
class ConsoleNotifier(logger: ILogger) : ICallbackReceiver, ILogger by logger {
    val onBeforeStr = "OnBefore!"
    val onAfterStr = "OnAfter!"

    // "print" is delegated to "logger"
    override fun onBeforeAction() = print(onBeforeStr)
    override fun onAfterAction() = print(onAfterStr)
}



class ExampleParser(notifier: ConsoleNotifier, logger: BasicLogger) :
    ICallbackReceiver by notifier,
    ILogger by logger {

    fun start() = action { parseFiles() }

    fun parseFiles() {
        print("Parsing...")
        // do some file parsing
    }
}