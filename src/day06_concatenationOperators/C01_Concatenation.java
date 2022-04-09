package day06_concatenationOperators;

public class C01_Concatenation {
    public static void main(String[] args) {



            String str1="Java";
            String str2="Guzel";

            int sayi1=5;
            int sayi2=3;

            //java5güzel yazdırın
            System.out.println(str1+sayi1+str2);

            //2güzel15 yazdır

            System.out.println(sayi1-sayi2+str2+sayi1*sayi2);//PARENteze almadan yapılıyor çünkü işlem sırası karışmıyor


            //Java22
            System.out.println(str1+(sayi1-sayi2)+(sayi1-sayi2));

            //53güzel

            System.out.println(sayi1+(sayi2+str2));
            System.out.println(""+sayi1+sayi2+str2);
        /*
        eğer sayılardan oluşan bir string varsa ve biz bunu int cevirmekistersek
        interger.valuOf(str)

        bir sayiyi stringe çevirmek istersek
        ""+sayi
         */







    }
}
