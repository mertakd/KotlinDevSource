package JetBrainsAcademy.Classes.SealedClass

/**
 *A sealed class is abstract, so it can't be instantiated. val customError = CustomError() ->not working
 * visibility modifiers olarak protected veya private olmak zorunda
 * */




//sealed class must be private or protected:
sealed class CustomError {

    constructor(type: String) {} // protected (default)
    private constructor(type: String, code: Int) {} // private

    //public constructor() {} //  Public gives error
}



// Sealed class vs enum
//enum tek bir tür kabul ederken, sealed farklı türlerde olabilir
//Enum örneğinde manager hata verir string olduğu için

//enum miras alamazken, sealed alabilir.

enum class Staff(numberOfLessons: Int)  {
    //TEACHER(2), MANAGER("Manager is managing")
}


sealed class Staff2 {
    class Teacher(val numberOfLessons: Int) : Staff2()
    class Manager(val Responsibility: String) : Staff2()
    object Worker : Staff2()
}




open class Person {
    fun whoAmI(name: String): String {
        return "I am $name"
    }
}


sealed class Staff3 : Person() {
    class Teacher(val numberOfLessons: Int) : Staff3()
    class Manager(val Responsibility: String) : Staff3()
    object Worker : Staff3()
}

//enum class Staff : Person() {
    //...//  çalışmaz
//}

fun main3() {
    val worker = Staff3.Worker
    println(worker.whoAmI("Worker"))
}






//Sealed classes and the when expression
sealed class Staff4 {
    class Teacher(val numberOfLessons: Int) : Staff4()
    class Manager(val Responsibility: String) : Staff4()
    object Worker : Staff4()
}

fun listTheTasks(staff: Staff4) = when (staff) {
    is Staff4.Teacher -> println("The teacher has ${staff.numberOfLessons} lessons today")
    is Staff4.Manager -> println("The manager is doing ${staff.Responsibility} today")
    Staff4.Worker -> println("Worker is fixing the projector for profs in CS, all respect to him.")
}


fun main() {
    val teacher = Staff4.Teacher(3)
    val worker = Staff4.Worker
    listTheTasks(teacher)
    listTheTasks(worker)

}

// output:
// The teacher has 3 lessons today
// Worker is fixing the projector for profs in CS, all respect to him.

