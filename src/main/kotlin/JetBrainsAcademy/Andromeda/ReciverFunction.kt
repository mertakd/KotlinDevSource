package JetBrainsAcademy.Andromeda

//Receiver Fonksiyon
//Receiver fonksiyonlar, Kotlin'de bir nesne üzerinde çağrılan ve o nesnenin içerisindeki alanlara ve fonksiyonlara erişimi sağlayan özel fonksiyonlardır. Bu fonksiyonlar, genellikle bir sınıfın genişletilmiş işlevselliğini sağlamak veya daha okunabilir ve akıcı bir API oluşturmak için kullanılır.

data class Person(val name: String, val age: Int)

fun Person.greet() {
    println("Merhaba, ben $name. $age yaşındayım.")
}

fun main() {
    val person = Person("Ahmet", 30)
    person.greet() // "Merhaba, ben Ahmet. 30 yaşındayım." çıktısı verir
}




//fold
fun main2() {
    val numbers = listOf(1, 2, 3, 4, 5)

    val concatenatedString = numbers.fold("") { acc, number ->
        acc + number.toString()
    }

    println(concatenatedString) // "12345" çıktısı verir
}
