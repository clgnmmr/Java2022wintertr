package day15_methodCreation;

public class C01_MethodCreation {
    public static void main(String[] args) {
         String str="Java ogrenmek cok zevkli";
        // str'in ilk 4 harfini almak ister

        str.substring(0,4);
        //bir program yaparken kodarımızın daha kısa ve anlaşılabilir olması için
        //surekli kullanabileceğimiz kod bloklarını hazır olarak bir yere koyma //ihtiyacımız oldukça oradan alıp kullanırız


        //methodlar robatlara benzer
        // method olusturmak bazen o method'un yapacagi isi yapmaktan zor olabilir
        // bir islemi sadece 1 kere yapacaksak method kullanmamiza gerek olmayabilir
        // ancak ozellikle cok kullancagimiz islemler icin
        // her seferinde yeniden ayni kodlari yazmak yerine
        // bu islemi yapan hazir bir method olusturmak cok daha pratiktir

        // bazen bir class'in icerisinde cok uzun kodlar yazarsak
        // tum class'in anlasilmasi zorlasabilir
        // bunun yerine kod'un belli kisimlarini ayri method'lar olarak olusturup
        // main method icerisinden istedigimiz sekilde bu methodlari yonetebiliriz.


    }
}
