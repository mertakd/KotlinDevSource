package JetBrainsAcademy.Projects.CoffeeMachine.JetBrainsAcademy.Classes.Generics.Variance


//Sözel

//1
//Using in and out
//When can we use in or out to specify the variance?

//out: function results and read-only property types; in: function parameter types




//2
//Variance
//What is variance in programming?

//Variance in generic types refers to the ability to use a more derived or less derived type than originally specified.



//3
//Contravariance
//What is contravariance?

//when for two different types A and B, the Class of A is a subtype of the Class of B if B is a subtype of A



//4
//Types
//What is a type in programming?

//It defines a set of valid values within a domain and a set of appropriate and consistent operations for the established value domain.




//5
//Invariance
//What is invariance?
//when for two different types A and B, the Class of A is neither a subtype nor a supertype of the Class of B





/*


// Quiz 1
class Course<T>
open class Person
class Student : Person()
class Teacher : Person()

fun main1() {
    //val course: Course<Person> = Course<Student>()  -> Type mismatch.
    val course: Course<Person> = Course<Person>()
}


*/





/*

// Quiz 2
open class Android(val name: String)

class AstromechDroid(name: String) : Android(name) {
    fun repair() {
        println("Repairing a starship")
    }
}

class ProtocolDroid(name: String) : Android(name) {
    fun translate() {
        println("Translating languages")
    }
}

class Republic<out T : Android>(val androids: List<@UnsafeVariance T>) {
    fun getAndroids(): List<T> {
        return androids
    }
}

fun main2() {
    val astromechDroids = listOf(AstromechDroid("R2-D2"), AstromechDroid("BB-8"))
    val protocolDroids = listOf(ProtocolDroid("C-3PO"), ProtocolDroid("D-O"))

    val republicAstromechs: Republic<AstromechDroid> = Republic(astromechDroids)
    val republicProtocols: Republic<ProtocolDroid> = Republic(protocolDroids)

    val astromechList: List<AstromechDroid> = republicAstromechs.getAndroids()
    val protocolList: List<ProtocolDroid> = republicProtocols.getAndroids()

    for (astromech in astromechList) {
        println("Astromech Droid name: ${astromech.name}")
        astromech.repair()
    }

    for (protocol in protocolList) {
        println("Protocol Droid name: ${protocol.name}")
        protocol.translate()
    }
}

*/













/*


// Quiz 3
open class Character(val name: String)

class Hero(name: String) : Character(name) {
    fun attack() {
        println("Hero is attacking")
    }
}

class Villain(name: String) : Character(name) {
    fun defend() {
        println("Villain is defending")
    }
}

class Adventure<I : Character, O : Character>(
    private var inputCharacter: I,
    private val outputCharacter: O
) {
    fun setInputCharacter(character: I) {
        this.inputCharacter = character
    }

    fun getOutputCharacter(): O {
        return outputCharacter
    }
}



fun main() {
    val link = Hero("Link")
    val ganon = Villain("Ganon")

    val adventure: Adventure<Character, Character> = Adventure(link, ganon)

    adventure.setInputCharacter(ganon)
    val outputCharacter = adventure.getOutputCharacter()

    if (outputCharacter is Villain) {
        outputCharacter.defend()
    } else {
        println("This character cannot defend!")
    }
}

*/





/*




//Quiz 4
open class Person
class Student : Person(){
    override fun toString(): String {
        return "student"
    }
}
class Teacher : Person(){
    override fun toString(): String {
        return "teacher"
    }
}

fun <T : Person> copyList(source: List<out T>, destination: MutableList<T>) {
    destination.addAll(source)
}


fun main4() {
    val persons = listOf(Person(), Student(), Teacher())
    val destinationList = mutableListOf<Person>()

    copyList(persons, destinationList)

    for (person in destinationList) {
        println(person)
    }
}



*/







/*


// Quiz 5


open class Person(val name: String)

class Student(name: String, val grade: Int) : Person(name)

class Teacher(name: String, val subject: String) : Person(name)

interface Comparator<T : Person> {
    fun compare(item1: T, item2: T): Int
}


fun main() {
    val personComparator: Comparator<Person> = object : Comparator<Person> {
        override fun compare(item1: Person, item2: Person): Int {
            return item1.name.compareTo(item2.name)
        }
    }

    val student: Student = Student("Alice", 10)
    val teacher: Teacher = Teacher("Bob", "Math")

    val result: Int = personComparator.compare(student, teacher)
    println(result) // Output: -1


}


*/




/*

open class Wizard(val name: String)

class HogwartsStudent(name: String) : Wizard(name) {
    fun study() {
        println("Studying at Hogwarts")
    }
}

class DarkWizard(name: String) : Wizard(name) {
    fun castSpell() {
        println("Casting a dark spell")
    }
}

class OrderOfThePhoenix<out T : Wizard>(private val members: MutableList<out T>) {
    fun addMember(member: @UnsafeVariance T) {
        members.add(member)
    }
}

fun main() {
    val hogwartsStudents = mutableListOf<HogwartsStudent>()
    val darkWizards = mutableListOf<DarkWizard>()

    val orderOfThePhoenixHogwarts: OrderOfThePhoenix<HogwartsStudent> = OrderOfThePhoenix(hogwartsStudents)
    val orderOfThePhoenixDark: OrderOfThePhoenix<DarkWizard> = OrderOfThePhoenix(darkWizards)

    orderOfThePhoenixHogwarts.addMember(HogwartsStudent("Harry Potter"))
    orderOfThePhoenixDark.addMember(DarkWizard("Lord Voldemort"))

    for (member in hogwartsStudents) {
        println("Hogwarts student: ${member.name}")
        member.study()
    }

    for (member in darkWizards) {
        println("Dark wizard: ${member.name}")
        member.castSpell()
    }
}

*/
