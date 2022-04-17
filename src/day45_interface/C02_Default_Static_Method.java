package day45_interface;

public class C02_Default_Static_Method implements I01_Default_Static {
   /*
   bir ınterface default ve static olarak tanımlanan ve bodys olan
   methodların override edilmesi mecbur değldir
   eger static olarak tanımlanmıssa zaten override edemeyiz
    */


    @Override
    public void method1() {
        System.out.println("child class method1");

    }

 /*
  parent intefcedeki  default olarak tanımlanan methodu istersek override ederiz istersek etmeyiz override
  etmezsek method cagrıldıgnda parent ınterface deki calışır
  override edersek child classdaki overriding calşır
  @Override
    public void method2() {
        System.out.println("child class method2");
    }*/

    public static void main(String[] args) {
        /*
        ınterfacede static olarak uretilen methoda static yontemlere ile ulaşıla bilir
         */
        I01_Default_Static.method3();

        C02_Default_Static_Method obj=new C02_Default_Static_Method();
        obj.method1();// child class calışır
        obj.method2();// ınterface calısır
       // obj.method3();// eski classlarda static bir uyeye static olmayan
    }
}