package JetBrainsAcademy.LambdaExpressions

class Employee(val id: Int, val name: String, val lastName: String, val telNum: String, val email: String) {

    fun printData() {
        println("Employee $id")
        println("full name: $name $lastName")
        println("tel. num: $telNum")
        println("email: $email")
    }
}

fun main() {
    val count = readLine()!!.toInt()
    createEmployees(count) { id, name, lastName, telNum, email ->
        Employee(id, name, lastName, telNum, email)
    }
}

fun createEmployees(count: Int, employeeCreator: (Int, String, String, String, String) -> Employee) {
    for (i in 1..count) {
        val (name, lastName, telNum, email) = readLine()!!.split(' ')
        val newEmployee = employeeCreator(i, name, lastName, telNum, email)
        newEmployee.printData()
    }
}


