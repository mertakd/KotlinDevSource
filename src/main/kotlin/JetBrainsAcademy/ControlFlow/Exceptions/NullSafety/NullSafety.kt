package JetBrainsAcademy.Projects.CoffeeMachine.JetBrainsAcademy.ControlFlow.Exceptions.NullSafety

fun main55() {

    var name: String? = "Kotlin"
    val length: Int? = name?.length
    print(if (length != null) length else 0)
    println(length ?: 0)



}

fun main66() {
    var name: String? = "Kotlin"

    val length: Int = name?.length
        ?: throw Exception("The name is null")
}


fun main555() {
    println("What is your nickname?")
    val nickname = readlnOrNull()
    println("Hello, $nickname!")
}


fun main666() {
    val nullString: String? = null
    println(nullString?.length)    // null


    val emptyString: String? = ""
    println(emptyString?.length)   // 0





    val nullString2: String? = null
    println(nullString2?.length ?: -1)   // -1

    val emptyString2: String? = ""
    println(emptyString2?.length ?: -1)  // 0
}


fun main() {
    readlnOrNull() ?: error("No lines read")


    val nullString: String? = null
    println(nullString?.isNotEmpty() ?: false) // false


    val nullString2: String? = null
    print(nullString2?.isNotEmpty() == true) // false
}

fun main122() {

    // NPE : null pointer exception

    /*
    *   String name = null;
        int length = name.length();     // NullPointerException: name is null


        * Java da kontrol
            String name = null;
            if (name != null) {
                int length = name.length();
                // Null değilse gerekli işlemler yapılır
            }


        *var name: String? = null
         val length = name?.length      // length null olacaktır, null referans hatası oluşmaz
         * String?  nullable.  yani name değişkeni nullable olarak tanımlanıyor. */

    //isteğe bağlı alanalar, ör: profil güncellemesi

    //var name: String = null
    //Bu sadece name değişkeninin belirli bir değere sahip olmadığı anlamına gelir. Null olmayan(non-null) bir değişken bildirdiğimiz için bu kod derlenmeyecek.


    var name: String? = null

    println(name)


    /*
    *if (name != null) {
    print(name.length)}
    *
    *
    * print(name?.length)
    * */
}



fun main2222() {



    val name: String? = null

    val nameLength = name?.length ?: return


    println(nameLength)
}


fun main3222() {

    /*
            //SAFE CALLS

            //uzun yol

        if (city != null &&
            city.address != null &&
            city.address.street != null &&
            city.address.street.building != null
        ) {
            print(city.address.street.building.name)
        } else {
            print(null)
        }





            //kısa yol

            print(city?.address?.street?.building?.name)
            //nullable yapıyoruz değişkenleri




            city?.address  kısa yol
            (if (city == null) null else city.address)   uzun yol



            city?.address?.street
            ((if (city == null) null else city.address)?.street)

    */




    /*
    *                      //elvıs operator
    *nullable ı ele almanın başka bir yolu




    *
    *
    * */



    var name: String? = "Kotlin"
    val length: Int? = name?.length
    println(length)


    print(length ?: 0)




    //JAVA KULLANIMI



    val length1: Int = name?.length
        ?: throw Exception("The name is null")
}