package Kekod.Classes

import java.lang.reflect.Field


/*
* normalde sınıf üyeleri private olursa dışarıdan erişilemez
* ama reflection ile bu kuralı delebiliyoruz. reflaction ile encapsilation u delmiş oluyoruz.
* bir değere erişmek zorundaysak kullanabiliriz ama mecbur olmadıkça kullanılmamalı.
* bir kütüphane kullanıyoruz diyelim bunun private bir özelliğine erişemk istiyoruz reflaction kullanılabilir.
* android de progard-obfuscate de reflaction da sorun çıkarabilir. apk işlemini obfuscate işlemi yapılır
  sınıflar isimlere map lenir.*/
class Wallpaper{

    private val imageUrl: String = "www.kekod.com"



}

fun main() {

    val wallPaper = Wallpaper()





    val imageUrlField: Field = wallPaper.javaClass.getDeclaredField("imageUrl")
    imageUrlField.isAccessible = true

    //2.yolu
    val imageUrlFieldName = wallPaper.javaClass.declaredFields[0].name
    val imageUrlField2: Field = wallPaper.javaClass.getDeclaredField(imageUrlFieldName)
    imageUrlField2.isAccessible = true

    val imageUrlString = imageUrlField.get(wallPaper)
    val imageUrlString2 = imageUrlField.get(wallPaper)
    println(imageUrlString)
    println(imageUrlString2)
}