package day34_accessModifier_encapsulation;

public class C02_AccessModifier {
    public static void main(String[] args) {

        C01 obj1 = new C01();

        obj1.acikString="Bye";
        C01.acikSayi=20;


        // C01.sayi=15; private   access modifier oldugundan başka classtan erişilemez
        // private methoda ulaşılamaz

        //C01 obj2=new C01(5);private oldugundan başka clas kullanamaz;
    }
}
