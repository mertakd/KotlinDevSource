package MasteringKotlin.OOP.Classes


/**
 * Numeric types lar, kotlin de hepsi sınıftır
 * sınıfılar default olarak kapalıdır
 * Interface ler property içerebilir.
 *
 * klasik sınıflar da kullanııcı tanımlı property ve method içermez.Ancak somutlaştırılabilir, toString ve hashcode çağırılabilir. */


class Course1{


}

/*

fun main() {

    val course = Course1()
    val displayString = course.toString()
}

*/


//Property Basics
/*
*CourseTitle parametresini iletmek için bir primary constructor ekledik
*We then define and initialize the title property using the value of courseTitle.
*
* Birincil kurucu, sınıfınızı oluşturmanın varsayılan yolu olarak kabul edilebilir ve genellikle tanımlanması gereken tek kurucu olabilir.
*
* kotlin property ler için getter ve setter üretir arka planda .*/

class Course2(courseTitle: String){
    val title = courseTitle
    var description = ""
}


fun main2() {

    val course = Course2("Mastering Kotlin")
    val courseTitle = course.title
}





/*
* From Kotlin, we can access that property name directly, as follows:

    val courseTitle = course.title

    However, from Java, we must access that property using a generated getter:
    String courseTitle = course.getTitle();
    *
    *
    *
 *Kotlin'den, property  adına herhangi bir get yapmadan doğrudan ismine başvurarak erişebiliriz.
 *Bu property,  property access syntax  olarak bilinir ve getters kullanılmasıyla ilgili syntactic sugar diye adlandırılır.
 *Özelliğe erişim sözdizimini(property access syntax ) mümkün kılan şey, Kotlin derleyicisinin bir sınıftaki herhangi bir var property si için varsayılan getter ve setter üretmesi ve herhangi bir val özelliği için getter üretmesidir.
 * */



/*
* public final class Course {

    @NotNull
    private final String title;

    @NotNull
    public final String getTitle() {
    return this.title;
    }

    public Course(@NotNull String courseTitle) {
    Intrinsics.checkParameterIsNotNull(courseTitle, "courseTitle");
    super();
    this.title = courseTitle;
    }
    *
    *
    * description var olduğu için getter ve setter method ları da ekleniyor. val da sadece getter metodu ardı.
}*/



//Custom accessors
/*
* Bazı durumlarda, varsayılan getter a  güvenmek istemeyebiliriz.
* Bu durumlarda, tanımlanmış özelliklerimizden herhangi biri için kendi özel erişimcilerimizi(custom accessors) sağlayabiliriz.
*
*aşağıdaki örnek
* Bu blok içinde, istediğimiz herhangi bir özel mantığı ekleyebiliriz.
* field a değer atayabiliyoruz
* Bu durumda field, özel ayarlayıcımız(custom setter) için destek özelliğidir(the backing property).
* field güncellenmeden description değeri yani value güncellenmez
* get de hiçbir değer argumanları iletemez.
* Custom property accessors ile, sınıflarımızın property erişim davranışını kontrol edebilir ve genişletebiliriz, bu da bize sınıflarımızın nasıl çalıştığı üzerinde daha fazla kontrol sağlar.*/

class Course(courseTitle: String){

    val title = courseTitle
    var description = ""
        set(value) {
            println("description updated to: $value")
            field = value
        }

        get() {

            return field
        }
}



/*
* Class Initialization

* sınıfın instance si ve o sınıfın properrty leri 3 şekilde çağırılabilir.
*Primary constructor
*Declaration assignment and initializer blocks
*Secondary constructor


*Bir sınıfın constructor ın da tanımlanan property ilk önce başlatılır. Daha sonra sınıf düzeyinde property atamaları ve başlatıcı blokları(init blocks) ele alınır. Sınıfı ve özelliklerini başlatmak için son şans, ikincil kuruculardadır
*
* kod constructor içine inline bir şekil de yazılmışsa(val lastName: String), derleyici constructor ın en başına bunu geçirir ve ilk olarak lastName başlatılır.*/


class Student2(_firstName: String, val lastName: String){

    val firstName= _firstName
    val id:String
    var nickName = ""

    init {
        id = generateStudentId(firstName, lastName)
    }

    val subjects:MutableList<String> = mutableListOf()


}

private fun generateStudentId(firstName: String, lastName: String): String {
    return "$firstName  $lastName  id 9"
}



/*
* lastName ilk olarak initialize edildik sonra, firstName, nickname, id, subjects initialize ediliyor.
* id değeri, nick den önce tanımlanmasına rağmen nick başlatılır, nickname değeri atandığı için, nickname başlatılana kadar init bloğu çalıştırılmıyor.*/

class Student(_firstName: String, val lastName: String){

    val firstName= _firstName
    val id:String
    var nickName = ""
    val activities: MutableList<String>

    init {
        id = generateStudentId(firstName, lastName)
    }

    val subjects:MutableList<String> = mutableListOf()

    init {
        activities = mutableListOf()
    }


}

fun main3a() {

    val student = Student("mert","akdogan")
    println("${student.firstName}, ${student.lastName}, ${student.id}, ${student.nickName}, ${student.activities}")
}


/*
* arka plan kodu
*public Student(@NotNull String _firstName, @NotNull String lastName) {
 ...
    this.lastName = lastName;
    this.firstName = _firstName;
    this.nickname = "";
    this.id = StudentKt.generateStudentId(this.firstName,
    this.lastName);
    List var4 = (List)(new ArrayList());
    this.subjects = var4;
    var4 = (List)(new ArrayList());
    this.activities = var4;
}
*
* Field ların  başlatılma sırasının her zaman sınıf bildiriminde göründükleri sıra ile aynı olmadığına dikkat edin. Örneğin, id, takma addan sonra başlatılır.  */




//ADDING METHOD
class Student3(_firstName: String, val lastName: String){

    val firstName= _firstName
    val id:String
    var nickName = ""
    val activities: MutableList<String>

    init {
        id = generateStudentId(firstName, lastName)
    }

    val subjects:MutableList<String> = mutableListOf()

    init {
        activities = mutableListOf()
    }

    fun printStudentInfo(){
        println("id:$id -> $firstName $lastName")
    }


}

fun main3b() {

    val student3 = Student3("nate","ebel")
    student3.printStudentInfo()
}






//SECONDARY CONSTRUCTOR

class School {
    var name = ""
    constructor(schoolName: String) {
        name = schoolName
    }
}


class Student5 (_firstName: String, val lastName: String) {

    constructor() : this("", "") {
// initialization logic
    }
    constructor(_firstName: String) : this(_firstName, "") {
// initialization logic
    }

}
