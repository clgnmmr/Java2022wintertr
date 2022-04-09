package day29_staticKeywords;

public class C02_StaticKeyword {
    public static void main(String[] args) {
        // baska clastaki static class uyelerine ulaşabilmek için sadece
        //class ismi.staticuye ismi yazmamız yeterlidir.


        System.out.println(C01_Static.okulTelefonu);

        C01_Static.okulTelefonu="3151565132132";

        System.out.println(C01_Static.okulTelefonu);

        //baska classtaki static olmayan class uyelerine ancak o classtan obje oluşturarak ulaşabilirz
        //ve obje ile yapılan atamalar kalıcı olarak atanmaz.

        C01_Static obj1=new C01_Static();
        C01_Static obj2=new C01_Static();


        System.out.println(obj2.okulIsmi);// yıldız koleji
        obj2.okulIsmi="Kadir Koleji";
        System.out.println(obj1.okulIsmi);// yıldız koleji
    }
}
