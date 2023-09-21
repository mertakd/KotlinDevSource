package JetBrainsAcademy.Projects.CoffeeMachine.JetBrainsAcademy.Collections.Map



val students = mapOf(
    "Zhenya" to 5,
    "Vlad" to 4,
    "Nina" to 5
)
fun main1() {
    println(students) // output: {Zhenya=5, Vlad=4, Nina=5}


    //val grade = students["Nina"]
    //println("Nina's grade is: $grade") // output: Nina's grade is: 5


    val (name, grade) = Pair("Zhenya", 5) // easy way to get the first and the second values
    println("Student name is: $name And their grade is: $grade")
// output: Student name is: Zhenya And their grade is: 5

    val p = Pair(2, 3)
    println("${p.first} ${p.second}") // 2 3
    val (first, second) = p
    println("$first $second")         // 2 3


    //val (name, grade) = "Vlad" to 4
    //println("Student name is: $name And their grade is: $grade")
// output: Student name is: Vlad And their grade is: 4
}


fun main2() {
    val studentsName = mutableListOf("Zhenya", "Vlad", "Nina")
    val studentsMarks = mutableListOf(5, 4, 5)
    println("${studentsName[0]}=${studentsMarks[0]}, ${studentsName[1]}=${studentsMarks[1]}, ${studentsName[2]}=${studentsMarks[2]}")
// output: Zhenya=5, Vlad=4, Nina=5


}


fun main3() {
    //ınitialization
    val staff = mapOf<String, Int>("John" to 1000)
    val staff2 = mapOf("Mike" to 1500)

    //empty
    val emptyStringToDoubleMap = emptyMap<String, Double>()
}


fun main4() {

    val values = mapOf<String, Int>("Second" to 2, "Third" to 3)

    val map = buildMap<String, Int> {
        put("First", 1)
        putAll(values)
        put("Fourth", 4)
    }
    println(map) // output: {First=1, Second=2, Third=3, Fourth=4}
}


fun main5() {

    val employees = mapOf(
        "Mike" to 1500,
        "Jim" to 500,
        "Sara" to 1000
    )

    if (!employees.isEmpty()) {
        println("Number of employees: ${employees.size}")
        println("Mike wants to earn ${employees["Mike"]}")
    }

    val isWanted = employees.containsKey("Jim")
    println("Does Jim want to be our employee? It's $isWanted")
}


fun main() {
    val employees = mapOf(
        "Mike" to 1500,
        "Jim" to 500,
        "Sara" to 1000
    )

    for (employee in employees)
        println("${employee.key} ${employee.value}")

    for ((k, v) in employees)
        println("$k $v")
}