package day13_stringManipulation;

public class C01_SubString {
    public static void main(String[] args) {





        String str="Java ile IT cok guzel";

        System.out.println(str.substring(5));//ilr ıt cok guzel
         //mehmet hoca ile IT cok guzel

        System.out.println(str.replace("Java","Mehmet hoca"));

        System.out.println("mehmet hoca "+str.substring(5));
        System.out.println(str.substring(9));//yazilan index inclusive
         //eger bir index ten sona kadar olan parcayı degil belirli bir parcayı almak istersek iki parametre yazmak geekiyor
        //str.substring(baslangıcindex,bitisindexi)

        System.out.println(str.substring(0,5));// (Java )
        System.out.println(str.substring(0,1));
        //bana 6. harfi string olarak bulun

        String harf=str.substring(5,6);
        System.out.println(harf);
        str="Java gun gectikce guzellesiyor";

        System.out.println(str.substring(7,7));//hiclik getirir

     //  System.out.println(str.substring(5,2));//bitiş indexi baslangıc indexinden kucuk  olamaz

        System.out.println(str.substring(str.length()-1));//son harfi verir
        //son 5 harfi yazdıralım
        System.out.println(str.substring(str.length()-5));

        System.out.println(str.substring(str.length()-5));//son karekterden sonra karekter yok o yüzden hiclik getirir.

    }
}
