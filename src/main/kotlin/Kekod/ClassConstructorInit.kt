package Kekod

/**
 * Constructor: yaratıcı, oluşturucu.
 * Primary constructer paremetreleri ilk olarak vermeye devam edersek ilk olarak init bloğu çalışacak.
 * secondery constructor u çalıştırırken içinde ki parametrelerden biri primary constructor da varsa ilk baş primary constructor ve init sonra secondery constructor çalışacak.
 * yani primary ve secondr constructor da da init bloğuna giriyoruz.
 * Peki neden böyle bir durum oluyor.Java da ki tüm constructorlar birbirinden bağımsızdır. Ama kotlin de secondery constructor lar mecburi bir şekilde primary constructor u this ile işaret etmek zorundalar.
 * constructor yazısını eğer annotation veya visibility modifier beliteceksek yazmamız lazım*/