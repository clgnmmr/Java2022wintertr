package day11_stringmanipulation;

import java.util.Locale;
import java.util.Scanner;

public class C04_length {
    public static void main(String[] args) {
        //kullanıcıdan ismini alıp baş harfini ve son harfini büyük harflerle yazdırın

        Scanner scan =new Scanner(System.in);
        System.out.println( "lütfen isminizi giriniz");
        String isim=scan.nextLine();

        System.out.println("ilk harf :"+isim.toUpperCase(Locale.forLanguageTag("tr")).charAt(0));

        System.out.println("son harf:"+isim.toUpperCase(Locale.forLanguageTag("tr")).
                charAt(isim.length()-1));

        System.out.println("sondan 3 üncü harfi :"+isim.toUpperCase(Locale.forLanguageTag("tr")).charAt(isim.length()-3));


        String str1="";
        System.out.println(str1.length());

        String str2=null;

        System.out.println(str2);

        System.out.println(str2.length());//hata veririr

        String str3;
        //System.out.println(str3.length()); değer atanmadığı için çalışmaz
        //str3 ve str2 ye değer atanmamıstir
        //str2 null pointer ile isaretlendiginden java durumun kontrol altında oldugunu bilir
        //geriye kalan kodun çalışmasına engel olmaz
        //anack str3 e bir deger ataması olmayınca java altını kırmızı cizer
        //ve bu durum duzeltilinceye kadar kodun geriye kalanın calısmasına izin vermez

    }
}
