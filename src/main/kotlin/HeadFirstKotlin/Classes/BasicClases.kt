package HeadFirstKotlin.Classes

/**
 * Sınıflar, kendi nesne türlerinizi oluşturmanıza ve bunların özelliklerini(properties) ve işlevlerini(functions) tanımlamanıza izin veren şablonlardır.
 * You’ll meet constructors, initializer blocks, getters and setters, and you’ll discover how they can be used to protect your properties.
 * Son olarak, veri gizlemenin tüm Kotlin koduna nasıl yerleştirildiğini öğrenerek zamandan, emekten ve çok sayıda tuş vuruşundan tasarruf etmenizi sağlar.
 * hatırlatma var x = 6, burada nesnenin referansı(referance to object) x e atanır.
 *
 * Bir nesnenin kendisi hakkında bildiği şeyler onun özellikleridir(properties).
 * Bir nesnenin yapabileceği şeyler onun işlevleridir(functions).Bir nesnenin davranışını belirlerler ve nesnenin özelliklerini kullanabilirler. Örneğin, Dog sınıfının bir havlama işlevi olabilir ve Song sınıfının bir çalma işlevi olabilir.Bir nesnenin yapabileceği şeyler onun işlevleridir.
 *
 * A function that’s defined inside a class is called a member function. It’s  sometimes called a method.
 *
 *
 * CONSTRUCTOR
 * Görünüşe göre Dog adlı bir işlevi çağırıyoruz. Ama bir işlev gibi görünse ve hissettirse de, öyle değil. Bunun yerine, Dog yapıcısını(constructor) çağırıyoruz.
 * Bir nesneyi başlattığınızda bir yapıcı(constructor) çalışır. Özellikleri(property) tanımlamak ve onları başlatmak için kullanılır.
 * Yapıcı, bir nesneyi başlatmak için gereken kodu içerir. Nesne bir referansa atanmadan önce çalışır, bu da devreye girip nesneyi kullanıma hazır hale getirmek için bir şeyler yapma şansınız olduğu anlamına gelir. Çoğu kişi, bir nesnenin özelliklerini tanımlamak ve onlara değerler atamak için yapıcıları kullanır.
 *Dog yapıcısı üç özellik tanımlar: ad, ağırlık ve cins. Her Köpek bu özelliklere sahiptir ve Köpek oluşturulduğunda, yapıcı her özelliğe bir değer atar. Bu, her Köpeğin durumunu başlatır ve doğru şekilde kurulmasını sağlar
 *
 *Arka planı
 * Sistem, Dog yapıcısına iletilen her bağımsız değişken için bir nesne oluşturur.It creates a String with a value of “Fido”, an Int with a value of 70,and a String with a value of “Mixed”.
 * Sistem, yeni bir Dog nesnesi için alan tahsis eder ve Dog yapıcısı çağrılır.
 * Dog yapıcısı üç özellik tanımlar: isim, ağırlık ve cins.
    Perde arkasında, her özellik(property) bir değişkendir. Yapıcıda tanımlandığı gibi, her özellik için uygun türde bir değişken oluşturulur.
 *Köpeğin özellik değişkenlerinin her birine, uygun değer nesnesine bir referans atanır
    Örneğin, name özelliğine "Fido" String nesnesine bir başvuru atanır ve bu böyle devam eder.
 *Son olarak, Köpek nesnesine bir başvuru, myDog adlı yeni bir Köpek değişkenine atanır.
 *
 *
 * Bu doğru—özellik, nesne için yerel olan bir değişkendir. Bu, değişkenler hakkında zaten öğrendiğiniz her şeyin özellikler için geçerli olduğu anlamına gelir. Örneğin, val anahtar kelimesini kullanarak bir özellik tanımlarsanız, bu, ona yeni bir değer atayamayacağınız anlamına gelir. Ancak, var kullanılarak tanımlanan tüm özellikleri güncelleyebilirsiniz.


 *An object is sometimes known as an instance of a particular class, so its  properties are sometimes called instance variables.
  Bir nesne bazen belirli bir sınıfın örneği olarak bilinir, bu nedenle özelliklerine bazen örnek değişkenler denir.


 *CONSTRUCTOR DIŞINDA PROPERTYLERİ TANIMLAMA VE INIT BLOGU
 *Sınıfın ana gövdesinde özellikleri tanımlamak, bunları yapıcıya eklemekten çok daha fazla esneklik sağlar, çünkü bu, artık her birini bir parametre değeriyle başlatmanız gerekmediği anlamına gelir.
 *Yapıcıya dahil etmeden bir özelliğe varsayılan bir değer atamak istediğinizi varsayalım. Örneğin, Dog sınıfına bir aktivite özelliği eklemek ve bunu "Walks" değeri içeren varsayılan bir dizi ile başlatmak isteyebilirsiniz.
 *
 *  Bir özelliği bu şekilde başlatmak, ona basit bir değer veya ifade atamak istiyorsanız iyi sonuç verir.
 * Bir özelliği basit bir ifadeden daha karmaşık bir şeye başlatmanız gerekiyorsa veya her nesne oluşturulduğunda çalıştırmak istediğiniz fazladan kod varsa, bir veya daha fazla başlatıcı bloğu kullanabilirsiniz
 * Başlatıcı blokları, nesne başlatıldığında, yapıcı çağrıldıktan hemen sonra yürütülür ve önlerine init anahtar sözcüğü eklenir. Aşağıda, bir Dog nesnesi başlatıldığında bir mesaj yazdıran bir başlatıcı bloğu örneği verilmiştir
 * Bu aynı zamanda bir sınıfta tanımladığınız tüm özellikler için de geçerlidir: özellikleri kullanmaya çalışmadan önce başlatmanız gerekir.
 *
 *
 * GETTER SETTER
 * Bir özelliğin dönüş değerini değiştirmek veya bir özelliğe atanmadan önce bir değeri doğrulamak istiyorsanız, kendi alıcılarınızı ve ayarlayıcılarınızı yazabilirsiniz.
 * Alıcılar ve ayarlayıcılar, özellik değerlerini almanızı ve ayarlamanızı sağlar. Bir alıcının hayattaki tek amacı, belirli bir alıcının alması gereken değer her ne ise, bir dönüş değeri geri göndermektir. Ve bir ayarlayıcı, bir bağımsız değişken değeri alma ve onu bir özelliğin değerini ayarlamak için kullanma şansı için yaşar ve nefes alır.
 *
 * Köpeğin ağırlığını kilogram cinsinden döndürmek için özel bir getter
 * Biz atamadan önce Köpeğin ağırlığı için önerilen bir değeri doğrulamak için özel bir setter.
 * */



/*


class Dog(val name:String, var weight:Int, breed_param:String){

    fun bark(){
        println(if (weight < 20) "Yip!" else "Woof!")
    }

    val activities = arrayOf("Walks")

    val breed = breed_param.uppercase()


    val weightInKgs:Double
        get() = weight / 2.2
}


class Dog2(val name:String, weight_param:Int, breed_param:String){


    val breed = breed_param.uppercase()


    var weight = weight_param
        set(value) {
            if (value > 0) field = value
        }
}


fun main() {

    println("my dog 2")
    var myDog2 =Dog2("Keko",70,"mix")
    myDog2.weight = -1
    println(myDog2.weight)


    println("my dog")
    var myDog = Dog("Fido", 70, "Mixed")
    println(myDog.name)
    //myDog.weight = 75
    myDog.bark()

    println( myDog.weightInKgs)


    var dogs = arrayOf(Dog("Fido",70, "Mixed"),  Dog("Ripper",10,"Poodle"))
    dogs[1].weight = 15
    dogs[1].bark()
    dogs[0].name

    println("My Array Dog")
    var myArrayDog = Dog("vahsi",30,"super cins")


    println(myArrayDog.name)
    println(myArrayDog.breed)

    println("${myArrayDog.name}, cinsi de ${myArrayDog.breed} ${myArrayDog.activities[0]}")

}


class Song(val title:String, val artist:String){

    fun play(){
        println("Playing the song $title by $artist")
    }

    fun stop(){
        println("Stopped playing $title")
    }
}


fun main1() {

    val songOne = Song("The Mesopotamiams","They Might Be Giants")
    val songTwo = Song("Going Underground","The Jam")
    val songThree = Song("Make me smile","Steve Harley")

    songTwo.play()
    songTwo.stop()
    songThree.play()
}
*/


class Dog(val name: String,
          weight_param: Int,
          breed_param: String) {

    init {
        print("Dog $name has been created. ")
    }

    var activities = arrayOf("Walks")

    val breed = breed_param.uppercase()

    init {
        println("The breed is $breed.")
    }

    var weight = weight_param
        set(value) {
            if (value > 0) field = value
        }

    val weightInKgs: Double
        get() = weight / 2.2


    fun bark() {
        println(if (weight < 20) "Yip!" else "Woof!")
    }
}
fun main() {
    val myDog = Dog("Fido", 70, "Mixed")
    myDog.bark()
    myDog.weight = 75
    println("Weight in Kgs is ${myDog.weightInKgs}")
    myDog.weight = -2
    println("Weight is ${myDog.weight}")
    myDog.activities = arrayOf("Walks", "Fetching balls", "Frisbee")
    for (item in myDog.activities) {
        println("My dog enjoys $item")
    }
    val dogs = arrayOf(Dog("Kelpie", 20, "Westie"), Dog("Ripper", 10, "Poodle"))
    dogs[1].bark()
    dogs[1].weight = 15
    println("Weight for ${dogs[1].name} is ${dogs[1].weight}")
}

