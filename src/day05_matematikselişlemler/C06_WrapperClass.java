package day05_matematikselişlemler;

public class C06_WrapperClass {

    public static void main(String[] args) {

        String str1="12345";
        String str2="23456";

        System.out.println(str1+str2);// string olan şeylerin toplamını alak için kelime clasını sayısalclasına çevirmek gerekir
        //


        System.out.println(Integer.valueOf(str1)+Integer.valueOf(str2));

        //wrapper classlar,javanın bize güzelclaslar vermesi için oluşturduğu ara classlar oluşturması
        //integer.valuoff methodu sadece sayısl değerler içeren stringlerde kullanılabilir
        //bir tane bile sayı dşında karekter olursa java hata verir
        int sayi1=Integer.valueOf(str1);
        System.out.println(sayi1);//dönüştürmek içinde wrapperkullanılır


    }
}
