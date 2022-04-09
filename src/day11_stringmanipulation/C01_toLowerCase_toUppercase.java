package day11_stringmanipulation;

import java.util.Locale;

public class C01_toLowerCase_toUppercase {
    public static void main(String[] args) {

        String str="Java Guzeldir";

        //biz String methodlerinı arka arkaya kullanabiliriz
        //mesal ikinci kelimenin ilk harfini kucuk olarak yazdıralım


        //str.charAt(5); böyle yazdığımızda sonuc artık string değil cha olucaktır
        //dolasıyla Stringde yapmak istediğimix tüm değişiklikleri
        //once yapıp sonra charAt() methodunu kullanmalıyız

        System.out.println(str.toLowerCase().charAt(5));

        //boslukta bir karekterdir ,karekterler 0 danbaşlar

        System.out.println(str.toUpperCase(Locale.forLanguageTag("tr")));
        System.out.println(str.toLowerCase(Locale.forLanguageTag("fr")));

    }
}
