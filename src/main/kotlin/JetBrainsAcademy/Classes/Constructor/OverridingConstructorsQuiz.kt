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
open class Animal(val name:String, val age: Int)

class Dog(name: String, age: Int) : Animal(name, age){

    var breed: String = ""

    constructor(name: String, age: Int, breed: String) : this(name, age){
        this.breed = breed
    }

}

fun main12() {

    val dog1 = Dog("buddy",3)
    val dog2 = Dog("chralie",5,"labrador")

    println("${dog1.name} is ${dog1.age} years old.")
    println("${dog2.name} is ${dog2.age} years old and is a ${dog2.breed}.")
}


// Quiz 2
open class Person3(val name: String){

    var age: Int = 0

    constructor(name: String, age: Int) : this(name){
        this.age = age
    }
}
class Employee3(name: String,age: Int,val id: Int) : Person3(name,age)

fun main3() {
    val person3 = Person3("mert")
    val person4 = Person3("davut",29)
    val employee3 = Employee3("kerem",30,234)
}



// Quiz 3
open class Animal1(val name: String, val age: Int)

class Dog1(name:String,age: Int) : Animal1(name, age)



//Quiz4 Andromeda

class Lecture{

    constructor(person1: Person1){
        person1.lecture.add(this)
        //Lecture sınıfının nesnesini oluşturmak yerine this ilegeçirdik
    }
}


class Person1(val lecture: MutableList<Lecture> = mutableListOf())

