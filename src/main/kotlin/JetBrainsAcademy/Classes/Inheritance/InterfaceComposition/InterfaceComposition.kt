package JetBrainsAcademy.Classes.Inheritance.InterfaceComposition

interface FirstInterface {
    fun f() { print("First") }
    fun g()
}

interface SecondInterface {
    fun f() { print("Second") }
    fun g() { print("g") }
}

class FirstClass : FirstInterface {
    override fun g() { print("g") }
}

/*
class SecondClass : FirstInterface, SecondInterface {
    override fun f() { print("Class")}
}

* ÇATIŞMA OLUYOR ,  iki işlev imzası arasında seçim yapamaz.
*/


class SecondClass : FirstInterface, SecondInterface{

    override fun f() {
        println("class")
    }

    override fun g() {
        super.g()
    }
}




//çatışma durumu
interface FirstInterfaceEx {
    fun f() { print("First") }
    fun g() { print("not g") }
}

interface SecondInterfaceEx {
    fun f() { print("Second") }
    fun g() { print("g") }
}


class ThirdClass : FirstInterfaceEx, SecondInterfaceEx{

    override fun f() {
        super<FirstInterfaceEx>.f()
        super<SecondInterfaceEx>.f()
    }

    override fun g() {
        super<SecondInterfaceEx>.g()
    }
}



// Composition
//Gördüğünüz gibi bir tasarım modeli olarak kalıtımın kendi kusurları vardır. Aynı kodun yeniden kullanımını sağlayan bir alternatif var ve buna kompozisyon deniyor
// kompozisyon. Birden fazla arayüzden türetilmiş bir sınıf oluşturmak yerine, bu arayüzleri uygulayan iki nesne(obeject) oluşturun ve bunların örneklerini ihtiyacınız olan sınıfta kullanın.
//Farklı sınıfların işlevlerini, örneklerini başka bir sınıfta kullanarak birleştirmek.

//Doğru örnek(instance) kombinasyonlarını kullanarak varlıkların(entities) oluşturulmasını basitleştirme
//Kalıtımla aynı kod yeniden kullanılabilirliğine ulaşmak, ancak farklı bir yapısal yaklaşımla.
interface Level {
    fun getLevel(): Int
}

interface Enemy {
    fun isEnemy(): Boolean
}

interface Class {
    fun getClass(): String
}



/*
class DangerousEnemyWarrior : Level, Enemy, Class
{
    override fun getLevel(): Int { return 10 }

    override fun isEnemy(): Boolean { return true }

    override fun getClass(): String { return "Warrior" }
}
*/





//Tüm bu nesneleri yalnızca bir kez yaratmamız gerekiyor

object Dangerous : Level {
    override fun getLevel(): Int {
        return 10
    }
}

object NotDangerous : Level{
    override fun getLevel(): Int {
        return 1
    }
}

object Foe : Enemy{
    override fun isEnemy(): Boolean {
        return true
    }
}

object Friend : Enemy{
    override fun isEnemy(): Boolean {
        return false
    }
}

object Warrior : Class {
    override fun getClass(): String {
        return "Warrior"
    }
}

object Wizard : Class{
    override fun getClass(): String {
        return "Wizard"
    }
}


//Ve sonra bunları istediğimiz kadar kullanmakta özgürüz!
class DangerousKotlinEnemyWarrior : Level by Dangerous, Enemy by Foe, Class by Warrior

class NotDangerousFriendlyWizard : Level by NotDangerous, Enemy by Friend, Class by Wizard