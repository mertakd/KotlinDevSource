package JetBrainsAcademy.Classes.Inheritance.InheritanceAndConstructor

/**
 * Türetilmiş bir sınıf, kendi çoklu kurucu şemasını oluşturmak için temel sınıfın çoklu kurucularından yararlanabilir.
 * */

//1.Inheritance and primary constructor

//Temel sınıfın yapıcı parametreleri varsa, türetilmiş sınıfın bunlarla ilgilenmesi gerekir.
//Temel sınıf düzgün şekilde başlatılmamışsa Kotlin bir programın derlenmesine izin vermez. Aşağıdaki örnekler, birincil kurucu aracılığıyla temel sınıf başlatmanın bazı durumlarını göstermektedir.
//Diğer tüm parametreler yeni özellikler değildir ve temel sınıf Book'un ilgili özelliklerini başlatmak için kullanılırlar.
//NoInfoBook sınıfı, temel sınıfı başlatmak için kullanılan yalnızca 2 parametreye sahiptir.

open class Book1

class Fiction1 : Book1()
//Book1() un cınstructor parantezi olmak zorunda miras alınırken.



//verilecek örnekde publisher hariç diğer parametreler üst class book un constructor ını başlatmak için verilir. yani alt sınıfları yeni property si değil aslında book un intialize ediyor. yeni property sadece publisher.
open class Book(val title: String, val author: String = "Unknown",
                val genre: String = "Unknown", val isbn: Long = 0)

class ExtBook(val publisher: String = "Unknown", title: String,
              genre: String = "Unknown", author: String = "Unknown",
              isbn: Long = 0) : Book(title, author, genre, isbn)

class NoInfoBook(title: String, author: String = "Unknown") : Book(title, author)

class FictionBook(title: String, author: String = "Unknown",
                  isbn: Long = 0) : Book(title, author, genre = "fiction", isbn)





// 2.Inheritance and secondary constructor

