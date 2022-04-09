package day13_stringManipulation;

public class C03_Cte_Rte {
    public static void main(String[] args) {
         /*
        int sayi="ali can";//syntax hatalarını java yazdıgımızda gorur
        ve altını çizer
        tumprojede alti cizili bir kod varsa
        projede hic bir class calşmaz
         */

        String str1="javada jer sey çok guzel";
         System.out.println(str1.substring(100));// ne zman bunu calıştırmaya kalkarsak ekranda hata verir

        //hatalar konusu compile time eror hatası yazarken olan hatalar
        //run time eror calıştırdıktan sonra ortaya cıkar

    }
}
