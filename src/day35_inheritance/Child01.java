package day35_inheritance;

public class Child01 extends Parent{


    public static void main(String[] args) {
       /*
       child class hiçbir objeye itiyac duymadan parent clastaki variabllara veye methodlara ulaşabilir
        */

        System.out.println(isim);
        System.out.println(fabrika);
        method1();
        method2();

    }

}
