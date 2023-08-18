package HeadFirstKotlin.Inheritance

/**
 * INHERITANCE ÖNEMİ
 * Kalıtımla tasarım yaptığınızda, bir sınıfa ortak kod koyarsınız ve ardından diğer daha spesifik sınıfların bu kodu devralmasına izin verirsiniz. Kodu değiştirmeniz gerektiğinde, yalnızca tek bir yerde güncellemeniz gerekir ve değişiklikler, bu davranışı devralan tüm sınıflara yansıtılır.
 * Ortak kodu içeren sınıfa SUPERCLASS, ondan miras alan sınıflara da SUBCLASSES denir. Base class - derived class da deniliyor.
 * Bir üst sınıf, bir veya daha fazla alt sınıf tarafından miras alınan ortak özellikler ve işlevler içerir.
 * Bir alt sınıf, fazladan özellikler ve işlevler içerebilir ve devraldığı şeyleri geçersiz kılabilir.
 *
 * Bir sınıfı üst sınıf olarak kullanmak için open olarak bildirilmesi gerekir. Geçersiz kılmak istediğiniz her şey de open olmalıdır.
 * val ise değer override edilir, var ise override edilmesine gerek yok alt sınıfta init bloğunda çağırılır.
 *
 * Bir işlevin veya özelliğin sınıf hiyerarşisinde daha aşağılarda geçersiz kılınmasını durdurmak istiyorsanız, önüne final ekleyebilirsiniz.
 * */




open class Animal{
    open val image = ""
    open val food = ""
    open val habitat = ""
    val hunger = 10



    open fun makeNoise(){
        println("The Animal is making a noise")
    }

    open fun eat(){
        println("The Animal is eating")
    }

    open fun roam(){
        println("The Animal is roaming")
    }

    open fun sleep(){
        println("The Animal is sleeping")
    }


}



class Hippo : Animal(){

    override val image: String = "hippo.jpg"

    override val food: String = "grass"

    override val habitat: String = "water"


    override fun makeNoise() {
        println("Grunt! Grunt!")
    }


    override fun eat() {
        println("The Hippo is eating $food ")
    }



}

















open class Car(val make:String, val model:String){

}

class ConvertibleCar(make_param:String, model_param:String) : Car(make_param, model_param){

}
//Üst sınıf oluşturucu parametreler içeriyorsa, oluşturucuyu çağırdığınızda bu parametreler için değerler iletmeniz gerekir. Örnek olarak, oluşturucusunda marka ve model adlı iki parametreye sahip bir Araba sınıfınız olduğunu varsayalım
//Üst sınıf oluşturucu parametreler içeriyorsa, oluşturucuyu çağırdığınızda bu parametreler için değerler iletmeniz gerekir. Örnek olarak, oluşturucusunda marka ve model adlı iki parametreye sahip bir Araba sınıfınız olduğunu varsayalım
