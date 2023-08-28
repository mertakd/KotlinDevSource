package JetBrainsAcademy.Classes.Constructor


open class Person2(open val name: String)

class Employee2(override val name: String): Person2(name)  // We override the property name.



//<---------------------------------------------------------------------------------->

//En yaygın hatalardan biri, alt sınıfta üst sınıf yapıcısını çağırmamaktır:

//open class Person(val name: String)
//class Employee(val id: Int) : Person // Error: superclass constructor call is required


//<-------------------------------------------------------------------------------->
//Ne yazık ki, bir kurucuyu doğrudan geçersiz kılmak mümkün değildir, ancak nesne yönelimli programlamada önemli bir rol oynayan alt sınıflar oluştururken üst sınıf kurucularını genişletebilirsiniz.
open class Person(val name: String){
    fun talk(){
        println("$name is talking")
    }
}

class Employee(name: String, val id: Int) : Person(name){

    fun work(){
        println("$name is working with id $id")
    }
}


fun main11() {

    val person = Person("John")
    person.talk()


    println("EMPLOYEE")
    val employee = Employee("jane",356)
    employee.talk()
    employee.work()


    //EMPLOYEE SINIFI DA TALK I ÇAĞIRABİLİYOR
}





// Quiz 1
open class Animal(val name: String, val age: Int)

class Dog(name: String, age: Int) : Animal(name, age){

    var bread: String = ""

    constructor(name: String, age: Int, breed: String) : this(name, age){
        this.bread = bread
    }
}

fun main() {

    val dog1 = Dog("buddy",3)
    val dog2 = Dog("chralie",5,"labrador")

    println("${dog1.name} is ${dog1.age} years old.")
    println("${dog2.name} is ${dog2.age} years old and is a ${dog2.bread}.")
}