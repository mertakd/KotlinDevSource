package JetBrainsAcademy.Classes.DataClass


//Yalnızca yapıcının içindeki özelliklere güvenebilirsiniz. Örneğin, bu değiştirilmiş Client sınıfı:
//Tüm bu işlevler denge alanını dikkate almayacaktır çünkü bu, yapıcının içinde değildir.
//Bir veri sınıfının birincil yapıcısı en az bir parametreye sahip olmalı ve bu parametrelerin tümü val veya var olmalıdır.
data class Client(val name: String, val age: Int, val gender: String) {
    var balance: Int = 0


    override fun toString(): String {
        return "Client(name='$name', age=$age, gender='$gender', balance=$balance)"
    }
}





// 2.Copy and ComponentN

//Dürüst olmak gerekirse, Java'da bir nesneyi kopyalamanın gerçekten uygun bir yolu yoktur, ancak Kotlin farklıdır.
//Örneğin, Client sınıfımızın bir örneğine sahipsek ve tamamen aynı istemciyi sadece farklı bir isimle istiyorsak ne olur? Kolay!


fun main1() {
    val bob = Client("Bob",29,"Male")
    val john = bob.copy(name = "John")
    println(bob)
    println(john)

    //Client(name='Bob', age=29, gender='Male', balance=0)
    //Client(name='John', age=29, gender='Male', balance=0)

}




//destructuring declarations
//componentN() functions yapılarını kullanırsak, destructuring declarations kullanabiliyoruz.
fun main() {
    val bob = Client("Bob", 29, "Male")
    println(bob.name) // Bob
    println(bob.component1()) // Bob
    println(bob.age)  // 29
    println(bob.component2()) // 29
    println(bob.gender) // Male
    println(bob.component3()) // Male

    // destructuring
    println("destructuring")
    val (name, age, gender) = bob
    println(name) // Bob
    println(age)  // 29
    println(gender) // Male
}
