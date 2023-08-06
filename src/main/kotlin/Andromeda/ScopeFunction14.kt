package Andromeda

/**
 * Bazı nesneleri yapılandırmak, üzerinde işlem yapmak,
 * ona özel veya kendi başına geçici bir scope(alan) oluşturmak için
 * scope functions lar kullanılır
 */

/**
 * Bu fonksiyonlarda objelerin isimleri lambda expression ın receiver veya
 * argument olamasına göre değişir. eğer receiver ise (this) argument ise it
 * olarak adlandırılır.
 */



// parametresi this olarak adlandırılır.
/**
 *block: String.() burdaki String receiver olarak adlandırılıyor.Yani String unun receiver ı.Fonksiyonun dönen sonucunu alacak taraf olacağı için için receiver olarak adlandırılıyor
 *fonksiyonu çağıran ise caller olarak adlandırılıyor
 *Eğer scope fonksiyonun bunun gibi yazıldıysa bunun parametresi  this olarak adlandırılır. yani buna this olarak erişebiliriz. */
fun exampleOperationReceiver(block: String.() -> Unit) {

}

// parametresi it olarak adlandırılır.
/**
 * Fonksiyona argument olarak geliyorsa parametresi it olarak adlandırılır yani it olarak bize verir.*/
fun exampleOperationArgument(block: (String) -> Unit) {

}


fun main11() {

    /**
     * let
     * nesne it olarak adlandırılır. dönüş değeri ise lambdanın sonucu
     */

    /**
     * chaining call yapılan ve sonucun bir değere atanmadığı durumlarda
     * let kullanılır.
     * chaining call : bir nesnenin property leri çağırıldıkdan sonra, sürekli ve sıralı olarak işlem yapılıp çağırılmasına  chaining call denir.kısaca sıralı olarak çağırım yapmak.
     */

    val numbers = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)

    // chaining call
    numbers.size.plus(3).plus(34).plus(2)

    println(numbers)


    /**
     *map, arguman olarak verildiği için it, lambda expression parametre olarak aldığı için. map bir List döndürüyor.
     *burada da chaining yapılıyor
     * 2 ye bölünmüş halleriyle bir liste oluşturuyor.3 den büyük olanları filtreliyor.
     * let in son ifaddesi ne ise let in geriye döndürdüğü şey o*/
    numbers.map { it / 2 }.filter { it > 3 }.let {
        println(it)
    }



    //let in son ifaddesi ne ise let in geriye döndürdüğü şey o
    numbers.map { it / 2 }.filter { it > 3 }.let {
        println(it)
        3
        4//son döndürdüğü 4 olur
        it.size > 34 //döndürdüğü şey boolean olur.


    }

    numbers.map { it / 2 }.filter { it > 3 }.let(::println)


}



private var globalName = "Hello"

private var born = 1995

fun main2() {

    /**
     * LET 2.KULLANIMI
     * genellikle null olmayan değerleri kullanmak (null safety) ve bu amaçla
     * bir scope oluşturmak için kullanılır.
     */

    //immutable da let kullanımı.

    val name: String? = "Hello Nullable"

    val length = name?.let {
        println(it.length)
        it.length
    }


    //bu kullanımda fazladan arka planda değişken oluşmakta.ayrıca immutable yapılarda kullanılmamalı bu örnek.mesela sürekli mişlisaniye de çağırdığımız da bir fonksiyonu sürekli fazladan değişken oluşması performans açısından yük olacak
    fun parseNameLet(name: String?) {

        name ?: return //aşağıdaki yerine bunu yapmak daha mantıklı.

        name?.let {
            //some operation
        }
    }

    fun parseNameLet2(name:String?){
        if (name != null){
            name.length
            //smart cast: veriyi güvenli şeklde çekmek
        }
    }




    //global olarak let in kullanımı

    fun parseNameGlobalLet() {
        if (globalName != null) {
            //globalName.length   -> hata veriyor
            // smart cast yapılamaz. çünkü global name mutable dır. smart case yapılamıyor çünkü başka sınıf tarafından değiştirilebilir.Başka thread ulaşabilir.
            //Bu tür durumlarda dışarıdan değiştirilebileceği durumlar da smart cast yapılamaz çünkü global name mutable dır.
            //Bu gibi durumlarda arka planda değiken oluşturmayı göze alabiliriz. yani let i kullanabiliriz.
            //ama bir fonksiyonda parametre varsa let kulllanımından kaçınıyoruz.

        }

        globalName?.let {
            //null olmadığı andaki değerini kullanıyor.
        }
    }


}


// preventing shadowing it and this.birden fazla scope fonksiyon yada birbirine ait aynı değişkenler varsa genellikle shadow lama oluşuyor.Yani birbirini gölgeleme oluşuyor.bunu engellemek için de null safe ve let i kullanabiliyoruz.
fun parsePersonInfo(person: ScopePerson?) {
    var born = 1004

    born = person?.born ?: 1004

    person?.let {
        born = it.born
        //global born ve it Person ın born u.
    }
}

/**
 * chain ile kullanım arkaplanda bir sürü null  kontrole sebep olacağı için sadece null olan değer için let kullanılır.
 */

class ScopePerson(val name: String, val lastName: String, var


born:Int)



fun processNumbersLet(array: IntArray?): Int? {
    array ?: return null

    array?.filter { it > 3 }?.map { it * 2 }?.sum()
    var sum = 0

    if (array != null) {
        sum = array.filter { it > 3 }.map { it * 2 }.sum()
    }

    return array?.let {
        it.filter { number ->
            number > 3
        }.map { mappedNumber ->
            mappedNumber * 2
        }.sum()
    }
}






/**
 * with
 * nesneye this olarak erişilir. return değeri lambdanın sonucudur.
 * with extension function olmadığı için nesne parametre olarak verilir
 */

/**
 * ilk kullanımı dönen sonuca ihtiyaç olmayan durumlar içindir
 * "with this object, do the following"
 *
 * with bir sonuç döndürmez. yani unit döndürüyor.
 */

fun main3a() {

    val numbers = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)

    with(numbers) {
        println("Size is $size")
        // some operations
        // binding kullanımı wiith ile yapılır apply ile yapılmaz
    }




    /**
     * bir nesnening değerleri bir sonuç hesaplamak için gerektiğinde kullanılır
     */

    val sum = numbers.first() + numbers.last()

    with(numbers) {
        first() + last()
    }
}







//RUN
/**
 * run
 * nesneye this kullanılarak erişilir. dönüş değeri lambdanın sonucudur
 * run ile with aynı işlemi yapar ancak run extension function olarak implemente edilmiştir.
 */

/**
 * run aynı anda hem nesneyi initialize etmek ve yapılandırmak(değiştirmek) hem de bu işlemle bir dönüş
 * değeri hesaplamak için kullanılır.Yani initialize yaparken bir hesaplama işlem yapılacak ve o sonucu geri döndürecek.apply dan farkı bu.
 * With den farkı da extension fonksiyon olarak yazılması
 *
 */
fun main4a() {


    val person = ScopePerson("", "", 1994)

    getPersonInfoRun(person, 1995)




    /**
     * run aynı zamanda extension fonksiyon olmadan da kullanılır. Bu durumda nesne üzerinden çağrılmaz.
     * dönüş değeri lambdanın sonucudur
     * Birden fazla ifade yazılacaksa extension fun olmadan yani skop haline getirilmeden kullanılabiliyor.
     * Eğer değer null gelirse uygulamayı durdurmak yerine farklı bir kod parçacığından uygulamayı devam ettirmeye yarar.
     *
     */

    val fullName: String? = "Hello Hello"

    val result = fullName ?: run {
        println("Name is null")
        throw Exception("Hello Mother Fucker")
    }


}



fun getPersonInfoRun(person: ScopePerson?, born: Int): String? {
    val result = person?.run {
        // prevent name shadowing this ile
        this.born = born
        "$name $lastName ${this.born}"
    }
    return result
}







/**
 * apply
 * nesneye this kullanılarak ulaşılır. dönüş değeri nesnenin kendisidir
 */

/**
 * Sonuç döndürmeyen ve genellikle nesnenin propertyleri üzerinde işlem yapılan durumlar için kullanılır.
 * "apply the following assignment to the object" bu nesneye bu eşitlemeleri yap.
 */




val scopePerson = ScopePerson("", "", 1994)

val newPerson = scopePerson.apply {
    born = 1995
}









/**
 * also
 * nesneye it kullanılarak erişilir. dönüş değeri nesnenin kendisidir.
 */

/**
 * also nesnenin propertylerine veya fonksiyonlarına erişmekten çok nesnenin kendisi üzerinde
 * yapılan aksiyonlar ve diğer context deki this shadowunu engellemek için kullanılır.
 * "and also the following with the object"
 */


fun main() {

    val numbers = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    numbers.also {
        println("before filtering the size of numbers:${it.size}")
    }.filter {
        it > 3
    }.let {
        println("after filtering the size of numbers:${it.size}")
    }


    val scopePersonNew = ScopePerson("Outer Name", "Outer Last Name", 1994).let {
        born = 1995
        ScopePerson("Inner Name", "Inner Last Name", born).apply {
            //it.lastName = lastName
        }
    }




}













