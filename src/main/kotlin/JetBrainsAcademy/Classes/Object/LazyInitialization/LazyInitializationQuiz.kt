package JetBrainsAcademy.Classes.Object.LazyInitialization

fun main1() {
    val a: String by lazy {
        print("Variable a is initialized. ")
        "I love Hyperskill!"
    }

    println("Initializing a! ") // Initializing a!
    println(a) // Variable a is initialized. I love Hyperskill!
    println(a) // I love Hyperskill!
}






//quiz 2
val a: String by lazy {
    print("a")
    "c"
}
val b: String by lazy {
    print("b")
    a
}
fun main2() {
    print(b)
}




//quiz3
val a2: String by lazy {
    val b: String by lazy {
        val c: String by lazy {
            print("d")
            "c"
        }
        print("b")
        c
    }
    print("a")
    b
}
fun main11() {
    print(a2)
}



//quiz 4
class B {
    lateinit var b: String

    fun checkB() : Boolean {
        return ::b.isInitialized
    }
}




//quiz5
class Cat {
    val name: String by lazy {
        println("I prefer to ignore it")
        callName()
    }

    fun callName(): String {
        println("Input the cat name")
        return readLine() ?: ""
    }
}

fun main() {
    val cat = Cat()
    println("Cat's name: ${cat.name}")
}