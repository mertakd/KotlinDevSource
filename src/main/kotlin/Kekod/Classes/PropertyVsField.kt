package Kekod.Classes

/**
 * Kotlin de field lar yok property ler var.
 * Property bir değişkenin get ve set fonksiyonları
 * Java daki kullanım: bir değişken field dır, variable dır.Bu değişkenin getter ve setter ları bu değişkene erişen property lerdir.Ya da bu değişkenin property leridir(özellikleridir.).
 * Bizim kotlinde değişken olarak tanımladığımız şey aslında bir property
 *
 *** Java da herşey private ama kotlin de herşey public neden?
 * Biz kotlin de gerçek anlamıyla bir değişken tanımlamıyoruz, onun get ve set fonksiyonlarını tanımlıyoruz arka planda.
 * kotlin de yazdığımız değişkenin makine kodu private bir değişken ve buna erişem public get ve set fonksiyonu olacak
 * yani biz public bir balance değişkeni oluşturduğumuzu zannederken, arka planda aslında balance yi private olarak tutuyor, get ve set fonksiyonlarını yazıyor.
 * bu yüzden kotlin de ki balance değişkeni field değil bir property dir.
 * yani kotlin de ki balance değişkeninin tanımı get ve set fonksiyonu arka planda, pravite int balance değil
 * yani kotlinde biz arka planda ki field haline erişmiyoruz bile.
 *
 * Kotlin de encapsulation ın kralı var:D
 * public String surName; java kodunu yazınca getter ve setter larını yazmamıza gerek yok. Yani java da bu şekil de encapsulation u delebiliyoruz.Buna erişip değer de atayabilirim değerini okuyadabilirim.
 * private String name; java kodunda getter setter fonksiyonlarını oluşturuyoruz.
 * Ama kotlinde bir değişken publice de olsa private da olsa arka planda her ikisi de pravite. Yani encapsulation ıu delemiyoruz kotlin de.Java da delebiliyoruz ama kotlinde buna izin yok.
 * Kotlinde arka planda public in get ve set fonksiyonları var ama private ın get ve set fonksiyoonları yok.Bu yüzden bunlara field denmiyor property deniliyor.
 * Peki visibility Modifier lar neden var? Arka planda ki get ve set fonksiyonlarını değiştiriyor.
 * Java arkaplanında ki değişkenler field, oluşturulan get ve set fonksiyonları property.
 * Yani visibility modifier lar ile kotlinde field ını tanımlamıyoruz, get ve set ini tanımlıyoruz.
 * Backing Field: arka planda, yani kotlin kodunun java tarafında ki field lara denir. BU örnekde private tanımlanan balanaca ve dept fiel ı.
 * Extension fonksiyonda exten edilen şey variable değil fonksiyon ondan adı extension function, extension valu değil.
 *ders 16: dk 25:00
 **/


class BankAccount{
    public var balance = 1_000_000
        set(value) {
            field = value // field = backing field
        }


    private var dept = 450000
}


fun main() {
    val bankAccount = BankAccount()
    println(bankAccount.balance)
    bankAccount.balance = 500_000
    println(bankAccount.balance)
}