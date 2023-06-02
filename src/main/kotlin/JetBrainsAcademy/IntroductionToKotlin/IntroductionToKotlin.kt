package JetBrainsAcademy.IntroductionToKotlin

class IntroductionToKotlin {

    /**
     * bir ifade (statement) bir komutu veya işlemi temsil ederken, bir ifade (expression) bir değer döndürür. İfadeler, genellikle bir değer atama, matematiksel işlem, fonksiyon çağrısı veya koşul ifadesi gibi durumlarda kullanılır.
     * Statement (İfade):
     * Bir ifade (statement), bir komut veya işlemi temsil eder ve genellikle bir sonuç döndürmez. İşte birkaç örnek:
     * a) Değer atanması:
     *
     * kotlin
     * Copy code
     * val x = 5
     * Bu ifade, x değişkenine 5 değerini atar. İşlem sonucunda herhangi bir değer dönmese de bir işlem gerçekleştirilir.
     *
     * b) Döngü:
     *
     * kotlin
     * Copy code
     * for (i in 1..5) {
     *     println(i)
     * }
     * Bu ifade, 1'den 5'e kadar olan sayıları ekrana yazdırır. Burada döngü ifadesi bir işlemi gerçekleştirir, ancak bir değer döndürmez.
     *
     *
     * Expression (İfade):
     * Bir ifade (expression), bir değer döndüren bir parçacıktır. İşte örnekler:
     * a) Matematiksel ifade:
     *
     * kotlin
     * Copy code
     * val result = 2 + 2
     * Bu ifade, 2 + 2 işlemi sonucunda elde edilen değeri result değişkenine atar. İşlem sonucunda bir değer döndürülür.
     *
     * b) Fonksiyon çağrısı:
     *
     * kotlin
     * Copy code
     * val length = "Hello, World!".length
     * Bu ifade, "Hello, World!" metninin uzunluğunu döndüren length fonksiyonunu çağırır. Fonksiyon çağrısı sonucunda bir değer döndürülür.
     *
     * c) Koşul ifadesi:
     *
     * kotlin
     * Copy code
     * val x = if (condition) 5 else 10
     * Bu ifade, bir koşula (condition) bağlı olarak 5 veya 10 değerini döndürür. Koşul ifadesi sonucunda bir değer döndürülür.
     *
     *
     * Keyword: fun,val,var
     * identifier: fun connectInternet  -> connectInternet indetifier oluyor.
     *
     *
     * DEĞİŞKENLER
     * var: değişebilir ama aynı tipte olacak int ken string yapamayız değeri
     * Bir değer atanmadan önce bir val değişkeni kullanılırsa, derleyici ayrıca bir hata üretir:
        val boolFalse: Boolean
        println(boolFalse) // error line
     *Yukarıdaki kodla, Variable 'boolFalse' must be initialized hatası alırsınız. Düzeltmek için değişkene erişmeden önce bir değer atayın
        val boolFalse: Boolean // not initialized
        boolFalse = false      // initialized
        println(boolFalse)     // no errors here
     *Bir val değişkeninin değerinin herhangi bir kısıtlama olmaksızın bir var değişkenine yeniden atanabileceğine ve düzenli bir değişkenin değerinin gerektiği kadar değiştirilebileceğine dikkat edin.
            val count = 10
            var cnt = count
            cnt = 20 // no errors here, cnt is not a constant
     *mutable list de val kullnarak direk listeye bir değer eklersek hata alırız ama list.add yaparsak yeni değer ekliyebiliriz ve böylece val değerini değiştirebiliriz.
       Bir val değişkeninin dahili durumunu değiştirmek her zaman mümkündür: değişkeni yeniden atamak yasak olsa da içeriği başka şekillerde değiştirilebilir
    Bir const değişkeninin değeri derleme zamanında bilinir ve çalışma zamanında değiştirilmez:
      Yalnızca bir String veya ilkel türde bir değişkenle kullanılabilir:string,char,int,double. mesela bir array atanamaz.
      Ayrıca, const değişkenlerinin herhangi bir işlevin dışında en üst düzeyde(top level) bildirilmesi gerekir

     *ATAMALAR
     *var a: Int
      a += 5 // compile-time error, Variable 'a' must be initialized
     *prefix form
        var a = 10
        val b = ++a
        println(a)  // a = 11
        println(b)  // b = 11
        Önce a değişkeninin değeri bir artırılır ve ardından değeri b değişkenine atanır. Yani, a ve b'nin ikisi de 11'dir.
        var a = 10
        val b = --a
        println(a)  // a = 9
        println(b)  // b = 9
     *postfix form
        var a = 10
        val b = a++
        println(a)  // a = 11
        println(b)  // b = 10*/
}