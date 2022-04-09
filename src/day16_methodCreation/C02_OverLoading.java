package day16_methodCreation;

public class C02_OverLoading {
    public static void main(String[] args) {

        String str="Bu da gecer ya Huu";
        System.out.println(str.indexOf("d"));//3
        System.out.println(str.indexOf("a",5));// 13
        System.out.println(str.substring('a',5));
        // bir class ta aynı isimde birden fazla method olmasına overloding denir
        //ya parametre sayısı farklı olmalı
        //veya parametre sayisi ayni ise
        //argumentlerin data türleri farlı olmalıdır.
        System.out.println(str.indexOf('a',5));

    }
}
