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

    /**
     * SİMPLE CHAT NOTLARI
     * VERİ TÜRLERİ
     * Tip Çıkarımı
        val greeting // error
        greeting = "hello"

        val greeting: String // ok
        greeting = "hello"*/


    /**
     * TÜR DÖNÜŞTÜRME
       *int den double  dönütürüyoruz. ama ilk değer değişmiyor iki değişken ile yeni bir double türü yaratıyoruz
       *küçük değer büyük değere dönüşebilir int den long a dönüşüm gibi.
       *char unicodetable daki sigelere tekabul eder dönüşüme uğradığında.
       *double long a dönüşür.
       *long ve double int e dönüşebilir. Ama type overflow yani tip taşması olabilir
       *string boolean a bile dönüştürülür ama char a dönüştürülemez. */



    /**BOOLEAN*/
    /*
    * Since Kotlin 1.4, you can read a Boolean value like this:
    val b: Boolean = readLine().toBoolean()

    and since Kotlin 1.6, you can read a Boolean value like this:
    val b: Boolean = readln().toBoolean()
    *
    * //STRİNG İ BOOLEAN A ÇEVİRME
     println("true".toBooleanStrict())     // true
    // println("True".toBooleanStrict())  // program crashes
    println("false".toBooleanStrict())    // false
    // println("faLse".toBooleanStrict()) // program crashes

    println("true".toBooleanStrictOrNull())  // true
    println("false".toBooleanStrictOrNull()) // false
    println("faLse".toBooleanStrictOrNull()) // null


    */


    /**OBJECTS*/

    //STATE AND BEHAVIOR
    /*
    * Variables and values just point to objects.
    (Değişkenler ve değerler sadece nesneleri işaret eder).
     Böylece değişkenler yardımıyla nesnelerle çalışabilirsiniz. Basit bir nesne örneği, bir mesajı saklayan bir String'dir. Daha yakından bakalım
     * Her şeyden önce, bir mesajın bir STATE(durumu ) vardır: sadece bir sembol dizisini değil, aynı zamanda dizinin boyutunu, yani mesajın uzunluğunu da içerir.
       Kotlin'de, bir nesnenin durumuna erişmenizi sağlayan şeye PROPERTY(özellik) denir. Sadece bir nokta koyun ve nesnenin arkasına özelliğin adını yazın, istediğinizi elde edeceksiniz!
       Suppose you have a simple String variable msg: val msg = "Hi". The length property gives us the length of the string:

        val msg = "Hi"
        println(msg.length) // 2
         -Burada Hi nesnedir. değişken ise yani val msg value yani değer oluyor.

     *Fonksiyonlar nesnelerin BEHAVIOUR(davranışını) temsil eder. These functions are also called member functions or methods.
       Sözdizimi benzerdir: sadece bir nokta koyun. Örneğin, tekrar() üye fonksiyonunu kullanarak mesajımızı tekrarlayabiliriz:
       val msg = "Hi"
       println(msg.repeat(3)) // "HiHiHi"*/


     //REFERANSA GÖRE KOPYALAMA (COPYING BY REFERENCE)
    /*Bir hesaba bağlı birkaç kartınız olabilir. Bu kartlardan biriyle bir şey satın alırsanız, kartlar farklı olsa bile o banka hesabından para harcarsınız.
      Kotlin'de de benzer kurallar geçerlidir. Bir değişken oluşturup ona bir nesne atarsanız, başka bir değişken de aynı nesneyi işaret edebilir.
      val msg1 = "Hi"
      val msg2 = msg1

      val msg1, val msg2  ->  "Hi".
       There will be two values pointing to a single object "Hi". Tek bir "Hi" nesnesine işaret eden iki değer olacaktır:
       In other words, the = sign does not copy the object itself, it only copies a reference to it. Başka bir deyişle, = işareti nesnenin kendisini kopyalamaz, yalnızca nesneye yapılan bir başvuruyu kopyalar.
       Bir değişkenin değeri atandığında, aslında bellekteki nesneye yapılan bir referansın kopyası atanmış olur.


       //MUTABILITY (DEĞİŞKENLİK)
       *data class Person(val name: String)

        val person1 = Person("Alice") // Person tipinde bir nesne oluşturuluyor
        val person2 = person1 // person1 nesnesine yapılan referans, person2'ye atanıyor
        person1.name = "Bob" // person1'in name özelliği değiştiriliyor

        println(person2.name) // person2'nin name özelliği yazdırılıyor

        Bu örnekte, person1 bir Person nesnesini temsil ederken, person2 ise person1'e yapılan referansın bir kopyasını temsil eder. person1.name'e yapılan değişiklik, person2 üzerinde de etkili olur çünkü her ikisi de aynı bellek alanını paylaşırlar. Bu nedenle, println(person2.name) ifadesi "Bob" değerini yazdırır.

        Bu örneklerde görüldüğü gibi, = işareti ile bir nesneye referans atandığında, aslında bellekteki aynı nesneye yapılan bir başvurunun kopyası atanmış olur. Bu durumda, bir değişken üzerinde yapılan değişiklik, bellekteki nesneye etki eder ve tüm ilgili referanslar tarafından görülür.

        Referans değişken ismidir:    = işareti ile bir nesneye referans atandığında, aslında referans değişkeninin değeri değişir. Bu durumda, referans değişkeninin ismi ve değeri arasındaki ilişki kopmaz, yalnızca değer atanırken nesnenin bellekteki konumuna yapılan referansın kopyası atanır.


        *Birden çok değişkene atanan bir nesneyi, bu değişkenlerden birinin değerini değiştirerek değiştirirseniz ne olur? Nesnenin türüne bağlıdır. Bir nesne değiştirilebilir(mutable) veya değişmez(immutable) olabilir.
         Kotlin'de Int, String, Float ve Double'ın nesneler olduğunu zaten biliyorsunuz.Ama bir nüans var. Örneğin, Int veya String değişkenleri, diğer programlama dillerindeki ilkel veri türleri gibi davranır, ancak aynı zamanda nesnelerdir - başka bir deyişle değiştirilemez nesnelerdir(unchangeable objects.). Nasıl çalıştığına bakalım:
            var a: Int = 100
            val anotherA: Int = a
            println(a == anotherA)  // true
            println(a === anotherA) // true
            a = 200
            println(a == anotherA)  // false
            println(a === anotherA) // false
            Gördüğünüz gibi, a = 200 değişkeninin değerini değiştirdiğimizde, nesnesini değiştirmiyoruz - a değişkenine, 200 değerine sahip nesneye yeni bir referans atanıyor.
            a 200 oldu, anotherA nı değeri 100 kaldı. tek nesneyi işaret ediyorken iki nesne oldu sanırım?


        Bir örneğe bakalım, ancak şimdi Double veri türüyle:
        var d1: Double = 1.5
        val d2 = d1
        println(d1 === d2) // true
        d1 += 1            // d1 is 2.5 now
        println(d1 === d2) // false
        Nesne değişmez ise değiştiremezsiniz ama başka bir nesne kullanabilir ve bu yeni nesneyi aynı değişkene atayabilirsiniz.Değişkeni yeniden atadığınızda, yeni bir nesneyi işaret edecek ve diğer değişkenler yine de eski nesneyi gösterecektir. Dizeler veya sayılar gibi temel türler değişmezdir, bu nedenle referans olarak kopyalamak güvenlidir.


        var a: Int = 100
        var b: Int = 200

        val anotherA: Int = a
        val anotherB: Int = b

        println(a)          // 100
        println(anotherA)   // 100
        println(b)          // 200
        println(anotherB)   // 200

        a = 300
        println(a)          // 300
        println(anotherA)   // 100 (değişmedi)
        println(b)          // 200
        println(anotherB)   // 200

        Bu örnekte, a ve b değişkenleri sırasıyla 100 ve 200 değerlerini temsil eden Int nesnelerini işaret eder. Ardından anotherA ve anotherB değişkenleri, a ve b değişkenlerinin değerlerini temsil eden aynı Int nesnelerini işaret eder.
        a'nın değeri 300 olarak değiştirildiğinde, a değişkeni artık 300 değerini temsil eden başka bir Int nesnesini işaret eder. Ancak, anotherA hala eski nesneyi (100 değerini temsil eden nesneyi) işaret eder. Bu nedenle, println(anotherA) ifadesi 100 değerini verir.
        b değişkeninin değeri değişmediğinden, anotherB hala b'nin değerini temsil eden aynı nesneyi (200 değerini temsil eden nesneyi) işaret eder. Bu nedenle, println(anotherB) ifadesi 200 değerini verir.
        Bu örnek, a ve anotherA değişkenlerinin aynı nesneyi (100 değerini temsil eden Int nesnesini) işaret ettiği, ancak a'nın değeri değiştirildiğinde anotherA'nın bu değişiklikten etkilenmediğini göstermektedir. Aynı şekilde, b ve anotherB değişkenlerinin aynı nesneyi (200 değerini temsil eden Int nesnesini) işaret ettiği görülmektedir.

        Hayır, val olmasından değil, temel veri türlerinin (primitive types) immutable (değiştirilemez) olmasından dolayı anotherA değeri değişmiyor.
        Temel veri türleri olan Int, Double, Boolean, Char gibi türler immutable yani değiştirilemez özelliktedir. Bu nedenle, bu türlerin değişkenlerinin değeri değiştirilemez. Eğer bir val değişkenine başka bir değer atanmaya çalışırsa, hata alınır.
        Yani, val değişkeni olsun veya olmasın, temel veri türlerinin kendileri değiştirilemezdir. val değişkeni sadece bir kez değer atanabilen (read-only) bir değişken olduğu için, bir kez değer atandıktan sonra değiştirilemez.

        -referans kpyalama ve yeni nesne oluşturma arasında ki fark

        data class Person(var name: String)

        fun main() {
            val person1 = Person("Alice")
            val person2 = person1 // person2, person1'in referansını kopyalar

            println(person1.name) // Alice
            println(person2.name) // Alice

            person1.name = "Bob"

            println(person1.name) // Bob
            println(person2.name) // Bob, person2 da değişir çünkü aynı nesneyi işaret ediyor

            val person3 = Person("Charlie")
            val person4 = Person("Charlie") // person4, yeni bir nesne oluşturur

            println(person3.name) // Charlie
            println(person4.name) // Charlie

            person3.name = "Dave"

            println(person3.name) // Dave
            println(person4.name) // Charlie, person4 değişmez çünkü farklı nesneyi işaret ediyor


            Yukarıdaki örnekte, person1 ve person2 aynı nesneyi işaret ederken, person3 ve person4 farklı nesneleri işaret eder. Değişikliklerin nasıl etkilendiğini görebilirsiniz. person1 ve person2 aynı nesneyi işaret ettikleri için değişiklikler her ikisini de etkilerken, person3 ve person4 farklı nesneleri işaret ettikleri için değişiklikler sadece ilgili nesneyi etkiler.

            Bu şekilde, referansın kopyalanması ve yeni bir nesnenin oluşturulması arasındaki farkı daha iyi anlayabilirsiniz.




            //Referans ve Nesne kopyalama arasında ki fark

                data class Person(val name: String)

                fun main() {
                    val person1 = Person("Alice")
                    val person2 = person1 // Referans kopyalama

                    val person3 = Person(person1.name) // Nesne kopyalama

                    println(person1 == person2) // true, referans kopyalama
                    println(person1 == person3) // true, nesne kopyalama

                    person1.name = "Bob" // person1'in name özelliğini değiştirir

                    println(person1.name) // Bob
                    println(person2.name) // Bob, referans kopyalama
                    println(person3.name) // Alice, nesne kopyalama


                    -Yukarıdaki örnekte, person1 ve person2 referans kopyalamayı temsil ederken, person3 nesne kopyalamayı temsil eder. person1 ve person2 aynı nesneyi işaret ettikleri için person1'in adını değiştirdiğimizde person2 da etkilenir. Ancak person3, person1'in tamamen yeni bir kopyası olduğu için değişiklikten etkilenmez.
                    -Bu şekilde, referans kopyalama ve nesne kopyalama arasındaki farkı daha iyi anlayabilirsiniz. Referans kopyalama, aynı nesneyi işaret eden yeni bir referans oluştururken, nesne kopyalama tamamen yeni bir nesne yaratır.

        */


}