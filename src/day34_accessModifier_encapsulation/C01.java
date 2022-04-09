package day34_accessModifier_encapsulation;

public class C01 {

    private static int sayi=10;
    private static String str="Java";

    static int acikSayi=20;
    String acikString="Hi";
    public static int acık=5;
    protected static int a=5;

   protected C01(){

        // bu constructurun accesss modifier ı yazmadıgımız için default access modifierdır
        //dolaysı ile içinde oldugumuz pakttin dışında obje olusturulamaz.

    }

     private C01(int num){
        System.out.println("parametreli constructur calıştı");

    }

    private void method1(){

    }

}
