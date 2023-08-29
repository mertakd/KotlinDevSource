package JetBrainsAcademy.Classes.Inheritance.InheritanceAndConstructor

open class Base5(val num: Int, var isZero: Int = 0, val str: String = "Europe"){
    constructor(num: Int, str: String) : this(num,0,str)
}


class Derived5 : Base5{
    constructor(num: Int, isZero: Int, str: String) : super(num, 0, str)
}



class Derived6 : Base5 {
    constructor(num: Int) : super(num)
    constructor(num: Int, str: String) : super(num,str)
}


open class Circle {
    open val radius: Double = 0.0
}

class Cylinder(var height: Double) : Circle() {
    override val radius: Double = 5.0
    val result = height * radius
}
