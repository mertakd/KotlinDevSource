package JetBrainsAcademy.Classes.Generics.TypeBounds



// Daha sonra nesnelerini depolamak istediğimiz sınıfları yaratırız:
open class Book {}
class Magazine : Book() {}
class Stone {}


class Storage<T : Book>() {
    // some code
}


fun main11() {
    val storage1 = Storage<Book>()
    val storage2 = Storage<Magazine>()

    // val storage3 = Storage<Stone>() // compile-time error
    //  Type parameter 'Stone' is not within its bounds. -> hatası
    // Bu bir derleme zamanı hatası olduğundan, bu sorunu gerçek bir uygulamada ortaya çıkmadan önce yakalarız. Bu, tür sınırlarının kullanımını güvenli hale getirir.
}




//Usage with functions
fun <T : Book> sortByDate(list: List<T>) {

}

fun main() {
    /* create instances */
    var listOne: List<Magazine> = listOf();
    var listTwo: List<String> = listOf();

    /* invoke methods */
    sortByDate(listOne) // OK because Magazine is a subtype of Book
    //sortByDate(listTwo) // Error: String is not a subtype of Book
}
