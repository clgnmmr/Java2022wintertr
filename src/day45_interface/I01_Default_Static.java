package day45_interface;

public interface I01_Default_Static {
    /*
    ınter facelerde sadece abstract methodlar bulunur

    bodys olan concrete bir method olusturmak istedigimizde
    java cte verir

    ancak java8 ve uzeri versiyonlarda istisnai olarak
    static veya default olarak tanımlanan methodlar bodysi olabilir
    ancak burada kullanılan default keywordu acses modifiar değildir.

    cunku inter facelede  tum methodlar public ve abstracttır.
    assagıda ornekte gorulebileciği gibi default olarak tanımlnmış bir methoda access modifier olarak public yazabilirsin
    (access modifier yazmasak da java method public olarak kabul edecektir)
     */

    void method1();

    default  void method2(){
        System.out.println("Interface deki defaut method");
    }


   public static void method3(){
        System.out.println("Interface deki static method");
    }
}
