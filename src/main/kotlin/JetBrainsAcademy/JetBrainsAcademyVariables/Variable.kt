package JetBrainsAcademy.JetBrainsAcademyVariables

fun main() {



    /**
     * değişken adlarına idendifier tanımlayıcı denir
     * var a val atanabilir.
     * değişkene değer atamazsan hata fırlatır
     *
     * val tipini değiştirebilir miyiz?
     *
     * // list creation
     * val myMutableList = mutableListOf(1, 2, 3, 4, 5)
     * // trying to update the list
     * myMutableList = mutableListOf(1, 2, 3, 4, 5, 6) // error line
     *
     * val değişkenine yeni bir liste atıyamıyoruz.
     * ama değişkenin kendisini değil temsil ettiği listeyi değiştirebiliriz
     *
     * // list creation
     * val myMutableList = mutableListOf(1, 2, 3, 4, 5)
     * // adding a new element
     * myMutableList.add(6)   // it works
     * // printing the list
     * println(myMutableList) // [1, 2, 3, 4, 5, 6]
     *
     * Java programlama diline aşina iseniz, Kotlin val değişkenlerini Java final değişkenleri olarak düşünmeniz daha kolay olabilir.
     * Oldukça benzerdirler: her ikisi de değişkene yeniden değer atamayı yasaklar, ancak nesnenin dahili durumunun değiştirilmesine izin verir.
     *
     * const val : Kotlin'de, bir derleme zamanı sabiti bildirmek için val anahtar sözcüğünden önce kullanılan bir const değiştirici de vardır. Bir const değişkeninin değeri derleme zamanında bilinir ve çalışma zamanında değiştirilmez
     *
     * NESNE
     * Kotlinde her değişken bir nesnedir ınt yada string olabilir.
     * val msg = "Hi"
     * println(msg.length) // 2
     * msg.length burdaki length property yani özelliktir.
     * behaviour(davranış):nesnelerin davranışını temsil eder. örnek hazır fonksiyonlardır. ör: repeat() fonksiyonu
     *
     * head first kotlin
     * state: Bir nesnenin durumu, nesneyle ilişkili verileri, yani özelliklerini ve değerlerini ifade eder. Örneğin sayısal bir nesne, 5, 42 veya 3.12 gibi (nesnenin türüne bağlı olarak) sayısal bir değere sahiptir. Bir Char nesnesi, tek bir karakter olan bir değere sahiptir. Bir Boole değeri ya doğrudur ya da yanlıştır.
     * behaviour: Bir nesnenin davranışı, nesnenin yapabileceği veya ona yapılabilecek şeyleri tanımlar. Örneğin, bir String büyük harfle yazılabilir. Sayısal nesneler, temel matematiği nasıl gerçekleştireceklerini bilirler ve değerlerini farklı bir sayısal türdeki bir nesneye dönüştürürler. Nesnenin davranışı, işlevleri aracılığıyla ortaya çıkar
     *
     * song class ı düşün title,artist properties oluyor. yani properties(özellikler) nesne ile alakalı bilgilerdir.
     *
     * Bir nesnenin yapabileceği şeyler onun işlevleridir. Bir nesnenin davranışını(behaviour) belirlerler ve nesnenin özelliklerini(properties) kullanabilirler. Örneğin, Dog sınıfının bir havlama işlevi olabilir ve Song sınıfının bir çalma işlevi olabilir.
     *
     *
     * int ilkel bir veri türü, string nesne referasnlı olacaktır.
     * var str: String = "Hello, world!"
     *"Hello, world!" bir nesne
     * str, merhaba dünya nesnesinin referansını tutar.
     * Dolayısıyla, bu durumda, str bir nesnenin kendisi değil, String türündeki bir nesneye yapılan bir başvurudur.
     * Diğer bir deyişle str, "Merhaba dünya!" nesnesinin hafıza adresini tutan bir değişkendir. str'yi "Merhaba dünya!" nesnesine bir işaretçi olarak düşünebilirsiniz.
     *
     * val msg1 = "Hi"
     * val msg2 = msg1
     * Başka bir deyişle, = işareti nesnenin kendisini kopyalamaz, yalnızca nesneye yapılan bir başvuruyu kopyalar.
     * string,int değişmez türlerdir ancak referans olarak kopyalayabiliriz.
     *
     * HEAD FİRST KOTLİN
     * Değişkeni val kullanarak bildirirseniz, nesneye yapılan başvuru sonsuza kadar değişkende kalır ve değiştirilemez.
       Ancak bunun yerine var anahtar kelimesini kullanırsanız, değişkene başka bir değer atayabilirsiniz.
       Örnek olarak, x'e 6 değeri atamak için x = 6 kodunu kullanırsak, bu, 6 değerine sahip yeni bir Int nesnesi oluşturur ve x'e bir referans koyar.
       Bu, orijinal referansın yerini alır: SAYFA 95


     *var x = 5
      var y = x
    Derleyici, x'in bir Int nesnesi olduğunu görür, dolayısıyla y'nin de bir Int türüne sahip olması gerektiğini bilir.
    İkinci bir Int nesnesi oluşturmak yerine, x değişkeninin değeri y değişkenine atanır. Ama bu ne anlama geliyor?
    Bu, "x'teki bitleri al, onların bir kopyasını yap ve bu kopyayı y'ye yapıştır" demek gibi bir şey.
    Bu, hem x hem de y'nin aynı nesneye referanslar içerdiği anlamına gelir.
     İki tane referans bardağı, bir tane nesne.

     */




    /**
     * DEĞİŞKENLER İLE İLGİLİ SORULAR
     * In Kotlin, something that allows you to access the state of an object is referred to as property.
     * TÜRKÇE
     * Kotlin'de, bir nesnenin durumuna erişmenizi sağlayan bir şeye özellik denir.
     * Bir değişkenin özelliğine nasıl erişebilirsiniz?
     * variable.property
     * spaceship.color
     *
     *
     * How many objects are created here?
     *
     * val lineOne = "Happy New Year,"
     * val lineTwo = lineOne
     * val lineThree = lineOne
     * CEVAP : 1
     *
     *
     *
     *
     *
     *
     * Kotlin'de iki değişkenin aynı nesneye atıfta bulunduğunu kontrol etmek için hangi yapı kullanılır?
     * cevap ===   */


    /*var sum = 0
    var countOdd = 0
    var countEven = 0
    val intsList = listOf<Int>(25, 14, 32, 13, 11, 55, 32, 21)

    for (i in intsList) {
        if (i % 2 == 0) {
            sum += i
            countEven++
        } else {
            countOdd++
        }
    }
    println(sum)*/


}