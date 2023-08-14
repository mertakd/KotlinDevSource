package Kekod.Classes


/**
 *
 *      Nested Inner Class
 *
 */

//----------------------------------------------------------------------------------------------------------------------

/**
--Class icinde class yaziyorsak bunun ismi nested class oluyor (adi farkli olabilir)
--Nesned class ın ön eki yok, inner class ın ön eki var.
--Amacı bu iç içe class lar birbiriyle alakalı classlar olcak, harici bir dosya açmamak için bu yapılıyor.
--mesela adapter class içerisinde viewHolder kullanıyorlar. viewholder farklı bir dosya da kullanılmasın diye iç içe yazılıyor.
--Örneğin, bir RecyclerView Adapter sınıfında ViewHolder'ları inner sınıf olarak kullanabilirsiniz, böylece ViewHolder içindeki görünümlere ve verilere Adapter'ın diğer üyelerinden erişebilirsiniz.
--Örnek olarak, inner sınıfı RecyclerView Adapter'ında ViewHolder olarak kullanmak gibi durumlar inner sınıfların örneğidir. Ancak, örneğin dış sınıfın sadece belirli bir amacı gerçekleştirmek için bir iç sınıfa ihtiyacı varsa ve bu iç sınıf dış sınıfın özelliklerine erişim sağlamak zorunda değilse, normal iç içe sınıf kullanabilirsiniz.

---Nested class'lar outer class'in uye propoerty'lerine ya da fonksiyonlarina erisemezler
Nested class'lar static olarak sanklanirlar. Bundan dolayi da outer class uzerinden nested class ulasmak istemeniz durumunda ;

--Outer.NestedClass()
                    seklinde erisilebilir.




+++Inner class'lar static olarak tutulmazlar. Bundan dolayi erisim yapmak istedigimizde
--Outer().InnerClass()
                      seklinde outer class'in da instance'ini olusturmamiz gerekmektedir.
                      bundan dolayi inner class outer class'in tum elemanlarina ulasabilir, private olsa dahi.

***Nesned Class lar neden üst class a erişmez? Nesned ve Inner Class arasında fark nedir?
--- memory leak(1:21:00):  static keyword u memory den kendimiz silmiyorsak, nesnesini uygulama ayakta olduğu sürece tutan veriler. Yani kullanılsa da kullanılmasa da memory de kalıyor.
    normalde bir ddeğişken oluşturduğumuzda bir class içinde, o class da işimiz var ken o değişken memory de tutulur.O class dan çıktıysak o class ı artık kullanmıyorsak garbage collection kullanılmayan verileri memory den temizler.
    statik bir şey yazınca garbage buna tokunmuyor.uygulama ayakta olduğu sürece silinmiyor. uygulama kapanırsa her türlü sattik olsa da silinir.
    Inner class da nesne oluşturup dış class outer a ulaşabiliyoruz. nesned class da da aynı durum olduğunu farz edelim o zaman outer class ının da memory den silinmemesine neden olacaktı.yani parazit gibi düşün nesned öldürelemiyor, outer a da tutunuyor onun da öldürülmesine izin vermiyor.
    Yani yanlışlıkla, sadece nesned class memory tutluyor zannediyorken bununla beraber çok daha büyük yapıları, class ları da silinmez hale getirebiliriz bilinçli olmadan.mesela context i statik e bağlamak büyük hata
    Bu durumlar da iş te memory leak dediğimiz out of memory hatası alıyoruz.
    * Memory de Outer un nesnesi oluşmadığı için statik olduğu için, yani Outer ın içinde ki değişkenkler memory ye koyulmadı.
      Bu nedenle memory de olmayan bir şeye erişemeyiz.
    * Inner class a erişebilmemiz için Outer2 nin nesnesini oluşturuyoruz. Ama Nesned Class da Outer ın nesnesi oluşmuyor
      //Outer.NestedClass().printName()
      //Outer2().InnerClass().printName()

    *Kısa Özet: Nesned class arka planda static class olarak tutulur.Outer class ın herhangi bir üye değişkeni veya fonskiyonuna erişemez.
                Inner Class ise arka planda statik class olarak değil, normal bir class olarak tutulur.Üst class Outer un değişkeni private olsa dahi herhangi bir değişkene erişebilir.Yada herhangi bir fonksiyonunu kullanabiliriz.
                Outer.NestedClass().printName(outer)    ->   memory leak olur.


--- Inner class'in icerisinde yeni bir nested class eklenememektedir. Ancak yine inner class ekleyebiliriz.

+++ Nested class'in icerisine yeni bir nested ya da inner class ekleyebiliriz.




--!!-- NOT --!!--
Static tutulan class islem bitse de CPU'dan otomatik temizlenmez (garbage collector), performansi etkiler bu nedenle.




 */


//----------------------------------------------------------------------------------------------------------------------

// outer  -> dis anlaminda

class Outer {
    private val name = "Kuday"
    val surName = "Ogunlu"

    fun getAge(): Int = 27

    class NestedClass {
        fun printName() {
            //name
            //surname
            //age               --> ustteki siniftakilere erisemez: nestedClass
        }
    }
}


//----------------------------------------------------------------------------------------------------------------------


interface OuterIntergace {
    class DenemeA
    interface NestedInterface
}

//----------------------------------------------------------------------------------------------------------------------


class Outer2 {
    private val name = "Kuday"
    val surName = "Ogunlu"

    fun getAge(): Int = 27

    inner class InnerClass {
        fun printName() {
            name                        // icinde oldugu class'in parametre ve fonksiyonlarina erisebiliyor: Inner class
            surName
            getAge()
        }
    }

}


//----------------------------------------------------------------------------------------------------------------------
fun main() {


    val outer = Outer()
    outer.getAge()
    outer.surName
    // outer.name

    val outer2 = Outer2()
    outer2.getAge()
    outer2.surName
    // outer2.name

    outer2.InnerClass().printName()



    Outer().getAge()

    Outer.NestedClass().printName()         // Duz, ozel olmayan bir nested class kullandik, bu yuzden () kullanmadik.
    // Outer().NestedClass().printName()  outer ın nesnesini oluşturmaya çalışıyor.

    Outer2().InnerClass().printName()       // Inner kullandik o nedenle () eklememiz gerekti.Yani inner kullanırsak Outer un nesnesini oluşturmamız gerekecek.


}


//----------------------------------------------------------------------------------------------------------------------


//----------------------------------------------------------------------------------------------------------------------