package JetBrainsAcademy.Classes.DataClass.ToString

class BerryHolder2(val weight: Int)

val raspberryWeight = BerryHolder2(10)
val strawberryWeight = BerryHolder2(15)
val blueberryWeight = BerryHolder2(20)


fun main1() {
    println(raspberryWeight.toString()) // BerryHolder@6f496d9f
    println(strawberryWeight) // BerryHolder@723279cf
    println(blueberryWeight) // BerryHolder@10f87f48
}

//Any üst sınıftır. Tüm sınıflar Any? sınıflarını miras alır. prinln any gözüküyor


fun main2() {
    val nonString = 1.0

    println(nonString.toString())   // 1.0
    println(nonString)  // 1.0

    /* The output is the same: println just implicitly called toString() for Double object */
}



// 3.Overriding toString()
// düz class larda toString i ocerride etmezsek nesnenin adresini gösterir println. override edersek verilen değeri string olarak gösterir.
class BerryHolder(val weight:Int){
    override fun toString(): String {
        return weight.toString()
    }

}

fun main3() {
    println(BerryHolder(10))
}




class User(val id:Int, val login:String, val email:String){

    override fun toString(): String {
        return "User{id=$id, login=$login, email=$email}"
    }
}

fun mainuser1() {

    //val user = User1(1,"uncle_bob", "martin@gmail.com")
    //println(user)
}




// 4.Overriding toString(): Inheritance
//üst sınıfta override edildiği için, alt sınıfın book özelliği çıktı da gözükmez.
open class User2(val id: Int, val login: String, val email: String) {
    override fun toString(): String {
        return "User{id=$id, login=$login, email=$email}"
    }
}

class Author2(id: Int, login: String, email: String, val books: String): User2(id, login, email) {

}

fun main22() {

    val user = User2(1, "marys01", "mary0101@gmail.com")
    val author = Author2(2, "srafael", "rsabatini@gmail.com", "Captain Blood: His Odyssey")
    println(user)   // User{id=1, login=marys01, email=mary0101@gmail.com}
    println(author) // User{id=2, login=srafael, email=rsabatini@gmail.com}
}



/*
*
* alt sınıfta override ettiğimiz için çıktı da book özelliği gösterildi
*
class Author3(id: Int, login: String, email: String, val books: String): User(id, login, email) {
    override fun toString(): String {
        return "Author{id=$id, login=$login, email=$email}, books: $books"
    }
}

val user = User(1, "marys01", "mary0101@gmail.com")
val author = Author(2, "ohwilde", "wilde1854@mail.ie", "Someone’s portrait")

println(user)   // User{id=1, login=marys01, email=mary0101@gmail.com}
println(author) // Author{id=2, login=ohwilde, email=wilde1854@mail.ie}, books: Someone’s portrait

*/



/*
* üst sınıfın özelliklerini super kullanarak çağoırıyor sadece kendi özelliği olan book u ekliyor.
*
class Author(id: Int, login: String, email: String, val books: String): User(id, login, email) {
    override fun toString(): String {
        return "Author: ${super.toString()};\nBooks: $books"
    }
}

val author1 = Author(1, "uncle_bob",
    "rmartin@objectmentor.com",
    "\n1.\"Clean Code: A Handbook of Agile Software Craftsmanship\" \n2.\"Agile Software Development: Principles, Patterns and Practices\"")
val author2 = Author(2, "ltlst",
    "leotolstoy@mail.com",
    "\n1.\"Anna Karenina\" \n2.\"The Death of Ivan Ilyich\" \n3.\"War and Peace\"")

println(author1)
println()
println(author2)

 */