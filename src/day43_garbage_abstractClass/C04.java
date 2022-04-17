package day43_garbage_abstractClass;

public abstract class C04 {
/*
bir abstract classda abstract veya concrete methodalr buunubilir

child clasların abstract methodları over ride etmesi mecburken
concrete method ların override edilmesi opsiyoneldir
 */

    public abstract String  absMethod1();


    public void concreteMethod(){

        System.out.println("C04 concrete method");


    }
    public static void concreteMethod1(){


        System.out.println("C04 concrete static method");


    }

    public static void main(String[] args) {

        /*
        abstract classlara constructor sahiptir ancak abstract classlardan obje olusturulamaz.

        abstract class lar obje barındırmayan sadece  child cclassların icin uyulması sart olan
        veya opsiyonel bırakılan ozellikleritanımladıgımız bir depo class gibidir.
         */
        //C04 c=new C04();
        int a=10;
    concreteMethod1();
    System.out.println(a);

    }
}
