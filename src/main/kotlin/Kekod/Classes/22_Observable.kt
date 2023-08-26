package Kekod.Classes


import kotlin.math.max
import kotlin.properties.Delegates

/**
 * 55.dk = livedata örneği
 * Observable : Basitçe bir değişkenin değeri set edilirken  yani değeri değiştirilirken, bir high-order yada interface yardımıyla bunu dışarıya bildirmemiz işlemine observable pattern deniliyor.
 * Bir değişkene değer atandığında bilgi sahibi olmak istiyorsak, bize birinin haber vermesini istiyorsak observable pattern kullanıyoruz.
 * observable pattern: herhangi bir değişkenin değeri deşirken yani set lenirken, bir interface i yada bir high-order ı ayağa kaldır.
 *
 * Live Data: backend e istekk attık diyelim balance bilgisi için, gelen değer için user içindekki  balance değerini ve text view değerini güncelle demek yerine, live data ile ilgili textview ı  newValue ile otomatik günceller.
değerin eski ve yeni değerini veriyor. iki veriyi karşılaştırmak için kullanılabilir küçük işlemlerde. ama genel bu pattern yerine live data kullanıyoruz. ama live data da  observable pattern kullanıyor.
 *
 * ("Initialized Value") ilk değer atamasında alacağı değer. türü strint int olursa ınt verilmeli
 * property parametresi: property hakkında bilgi sahibi olmamızı sağlıyor.
 *
 *
 * observable unit dönerken, vetoable boolean dönüyor.
 * vetoable farkı high-ordder ın son satırında boolean bir değer bekliyor
 * true yu kabul ediyor, false da bu değer değişikliğinini görmezden geliyorum diyor.
yani veto etme hakkı var. değer atamasını yaptırmayabilirsiniz.
 *
 * */


class User99{

    var name:String by Delegates.observable("Initialized Value"){property, oldValue, newValue ->
        println("$oldValue -> $newValue")
    }



    var max: Int by Delegates.vetoable(0){property, oldValue, newValue ->

        if (newValue > oldValue) true else throw IllegalArgumentException("New value must be larger than old value")
        newValue > oldValue
    }


    var max2: Int by Delegates.observable(0){property, oldValue, newValue ->

        true
    }

}


fun main() {

    val user = User99()
    user.name = "first"
    user.name = "second"

    var max = user.max
    println(max) //0

    max = 10
    println(max) //10

    max = 5 // will fail with IllegalArgumentException

    println(max) //0















    val deneme = DenemeObservable(object : Notify{
        override fun onNotify(oldValue: Int, newValue: Int) {
            println("Old balance: $oldValue, New balance: $newValue")
        }

    })
    deneme.balance = 1231



    //High-Order olarak kullanma
    val denemeHighOrder = DenemeObservable2{ oldValue, newValue ->
        println("Old balance: $oldValue, New balance: $newValue")
    }
}



//bu yapı uzun hali, kısa olsun diye yukarıda observable tasarlanmış
//observable pattern: herhangi bir değişkenin değeri deşirken yani set lenirken, bir interface i yada bir high-order ı ayağa kaldır.
interface Notify{
    fun onNotify(oldValue:Int, newValue:Int)
}


class DenemeObservable(val notify: Notify){

    var balance: Int = 0
        set(value) {
            notify.onNotify(field, value)
            field = value
        }
}



//High-Order olarak kullanma
class DenemeObservable2(val notify: (Int, Int) -> Unit){

    var balance: Int = 0
        set(value) {
            notify(field, value)
            field = value
        }
}




