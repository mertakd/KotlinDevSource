package JetBrainsAcademy.Classes.Abstract

/*
* Özetle, soyut bir sınıf, doğrudan somutlaştırılamayan ancak diğer sınıflar için bir plan görevi gören bir sınıftır.
* Kısmen uygulanmış bir sınıf gibi davranarak alt sınıfların miras alabileceği ve üzerine inşa edebileceği ortak bir yapı ve davranış sağlar.
*
* Diğer sınıflar gibi soyut sınıfların da yapıcıları olabilir. Bu yapıcılar sınıf özelliklerini başlatmak için kullanılır ve alt sınıfların belirli gereksinimleri karşılamasını veya başlangıç değerlerine sahip olmasını sağlamaya yardımcı olabilir.
   abstract class Animal(val id: Int)

* */



// Soyut bir sınıfın hem soyut hem de soyut olmayan üyeleri olabilir (property ve methods)
// Bir üyeyi özet olarak bildirmek için soyut anahtar sözcüğünü açıkça kullanmanız gerekir.
// Soyut bir üyenin kendi sınıfında bir gövdeye (bir uygulamaya) sahip olmadığına dikkat edin.
abstract class Animal(val id: Int) {
    //val name: String // We get here a compile-time error: property must be initialized or be abstract

    abstract fun makeSound()

    fun isSleeping(): Boolean {

        return false
    }



/*
    abstract fun isWorking(): Boolean {

        return false
    }
*/



}