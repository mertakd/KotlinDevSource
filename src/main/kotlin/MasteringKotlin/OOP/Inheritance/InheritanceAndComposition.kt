package MasteringKotlin.OOP.Inheritance

/**
 * Nesne yönelimli kod yazarken, genellikle kodu yeniden kullanmak, ilişkileri daha esnek hale getirmek ve verilerimizi daha verimli bir şekilde modellemek için kalıtım ve kompozisyondan yararlanmak isteriz.
 * Kotlin'de ortak bir işlevsellik tanımlamak veya sınıf şablonları sağlamak için kullanılabilecek arayüzler tanımlayabiliriz.*/



interface GameObject{
    val id: String
    fun update(currentTime: Long)

}

class Player : GameObject{

    //override val id = "playerId"  -> expression ifadesi de olur.
    override val id: String
        get() = "playerId"
    //custom accessor kullanımı

    override fun update(currentTime: Long) {
        TODO("Not yet implemented")
    }
}





//interface de değer default olarak tnımlanırsa miras alan yerde kullanılma zorunluluğu kalkar

interface GameObject2 {
    val id: String
        get() = "defaultId"
    fun update(currentTime: Long)
}


class Player2 : GameObject2 {
    // no longer required to override id
    override fun update(currentTime: Long) {
        TODO("Not yet implemented")
    }
}







//Interface inheritance

//Bir arayüz başka bir arayüzden miras alabilir.

interface Movable: GameObject{
    fun move(currentTime:Long)


}


class Player3 : Movable{

    override val id: String
        get() = TODO("Not yet implemented")

    override fun update(currentTime: Long) {
        TODO("Not yet implemented")
    }
    override fun move(currentTime: Long) {
        TODO("Not yet implemented")
    }
}
//Daha sonra Movable'ı uygulayan herhangi bir sınıfın, hem Movable hem de GameObject'ten yöntemleri uygulaması gerekecek, aksi takdirde soyut olarak işaretlenecektir







//Implementing multiple interfaces
//Bir sınıf, birden çok arabirim uygulayabilir. Bu, Kotlin'de kompozisyon elde etmenin bir yoludur. Kesin kalıtım hiyerarşilerine ait olmak yerine, tüm sınıflar belirli davranışları tanımlayan arabirimler uygulayabilir.

interface Drawable {
    fun draw()
    fun update(currentTime: Long)
}




class Player6 : Movable, Drawable {

    override val id: String
        get() = TODO("Not yet implemented")

    override fun update(currentTime: Long) {
        TODO("Not yet implemented")
    }

    override fun move(currentTime: Long) {
        TODO("Not yet implemented")
    }

    override fun draw() {
        TODO("Not yet implemented")
    }
}
// hem Movable hem de Drawable bir update() yöntemi tanımlasa da, bunun yalnızca bir kez geçersiz kılınması gerektiğini göreceğiz:
