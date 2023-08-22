package JetBrainsAcademy.Classes.PropertyAccessors



class Client1 {
    val name = "Unknown"
        get() {
            return field
        }
}

// or with omitted curly brackets and the body of the get() function

class Client2 {
    val name = "Unknown"
        get() = field
}

//sadece değer alırsınız  returns one value
//kotlin de her property nin field alanına erişilebilen kendi backing field ı vardır
//backing field da property value vardır buna field ile erişilir





class IntegerRepository {
    private val _list = mutableListOf<Int>() //read only
    val list: List<Int> get() = _list // backing property
}




fun main1() {
    val repository = IntegerRepository()
    //repository.list.add(1) // Error: variable list is a read-only collection: sadece okunabilir bir özelliktir ve bu nedenle üzerine ekleme gibi değişiklikler yapamazsınız.
    println(repository.list)
}

//list backing property, bir List<Int> döndüren bir "getter" fonksiyonu içerir. Bu getter fonksiyonu _list özelliğine erişir ve _list özelliğini döndürür. Yani, dışarıdan list özelliğine erişildiğinde, _list özelliği üzerinden okuma işlemi yapılır ve _list özelliği değiştirilemez.
// Sonuç olarak, bu yapı sınıfın dışarıya sadece okunabilir bir liste sunmasını sağlarken, _list özelliği ise bu listenin gerçek verisini depolar ve günceller. Bu, backing property'nin temel amacını yansıtır: gerçek veriyi saklamak ve dışarıya belli bir şekilde sunmak.



// 2.CUSTOM GETTER
class Client3 {
    val name = "Unknown"
        get() {
            println("Somebody wants to know $field name")
            return field
        }
}




fun main3() {
    val client = Client3()
    val name = client.name // prints Somebody wants to know Unknown name
    println(name)          // prints Unknown
}




//Özel bir alıcı için başka bir kullanım, başka bir şey döndürmek isteyip istemediğinizdir. Örneğin, göreviniz eksiksiz müşteri bilgilerini bir değişkende depolamak olabilir.
//Bir kişi hakkında bazı bilgileri değiştirirseniz, bu değişkeni de değiştirmeniz gerekecektir.
//Özel bir alıcı kullanıyorsanız, talep üzerine bilgi oluşturabilirsiniz.
// Aşağıdaki örnekte, Client sınıfı, client'ın yaşını saklayan bir age özelliğini ve onlar hakkında bilgi döndüren info özelliğini alır

class Client4 {
    var name: String = "Unknown"
    var age: Int = 18
    val info: String
        get() {
            return "name = $name, age = $age"
        }
}


fun main4() {
    val client = Client4()
    println(client.info) // name = Unknown, age = 18
    client.name = "Lester"
    client.age = 20
    println(client.info) // name = Lester, age = 20
}





// 3.Property Setter
//Bu işlev bir bağımsız değişken alır (geleneksel olarak value olarak adlandırılır, ancak farklı bir ad kullanabilirsiniz) ve hiçbir şey döndürmez.
//Bildiğiniz gibi alan, özelliğin mevcut değerini içerir ve farklı bir değer atayarak değiştirebilirsiniz.
//Bu durumda ayarlayıcınız basitçe name değişkeninin değerini alınan değere değiştirecektir. Bu beklenen davranıştır ve Kotlin bizim için bu işlevi oluşturur, ayarlayıcıyı kendiniz yazmanıza gerek yoktur.

// 4.Custom Setter
class Client5 {
    var name = "Unknown"
        set(value) {
            println("The name is changing. Old value is $field. New value is $value.")
            field = value
        }
}

fun main5() {
    val client = Client5()
    client.name = "Ann"   // The name is changing. Old value is Unknown. New value is Ann.
}
//Fark edebileceğiniz gibi, ayarlayıcı yalnızca özelliği değiştirmeye çalıştığınızda çağrılır, onu başlatırken değil.




//Özel bir ayarlayıcı kullanmanın başka bir yolu da, farklı bir değer atamak isteyip istemediğinizdir.
//İstemcinin yaşını saklayan bir age özelliği ekleyelim. Elbette yaş negatif olamaz. Bunu hesaba katmak istiyorsanız özel bir ayarlayıcı ekleyebilirsiniz:
class Client6 {
    var name = "Unknown"
    var age = 18
        set(value) {
            field = if (value < 0) {
                println("Age cannot be negative. Set to $defaultAge")
                defaultAge
            } else
                value
        }
    val defaultAge = 18
}

fun main6() {
    val client = Client6()
    client.age = 29      // Age cannot be negative. Set to 18.
    println(client.age)  // 18
}





//İkisi Bir Arada
class Client {
    var name = "Unknown"
        get() {
            println("Somebody wants to know $field name")
            return field
        }
        set(value) {
            println("The name is changing. Old value is $field. New value is $value.")
            field = value
        }
}

fun main7() {
    val client= Client()
    client.name = "mert"
    println(client.name)

}



fun main8() {
    val movieOne = Movie("Anna Gotter")
    movieOne.length = -24
    val movieTwo = Movie("Sky Wars")
    movieTwo.length = 15
    print(movieTwo.length - movieOne.length)
}

class Movie(val name: String) {
    var length: Int = 0
        set(value) {
            field = if (value < 0) value else -value
        }
}



fun main() {
    val smartOne = Smartphone("Ericsong")
    smartOne.price = -24
    val smartTwo = Smartphone("iNokhe")
    print(smartTwo.price - smartOne.price)
}

class Smartphone(val name: String) {
    var price: Int = -5
        get() = name.length - field
}