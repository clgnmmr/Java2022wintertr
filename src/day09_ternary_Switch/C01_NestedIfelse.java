package day09_ternary_Switch;

import java.util.Scanner;

public class C01_NestedIfelse {
    public static void main(String[] args) {

        //Soru12)Kullanıcıdan 4 basamakli bir sayi girmesini isteyin. Girdiği sayi 5’e
        //bölünüyorsa son rakamını kontrol edin. Son rakamı 0 ise ekrana “5’e bölünen
        //çift sayı” yazdırın. Son rakamı 0 değil ise “5’e bölünen tek sayı” yazdırın.
        //Girdiği password 5’e bölünmüyorsa ekrana “Tekrar deneyin” yazdırın

 Scanner scan=new Scanner(System.in);
        System.out.println("lütfen 4 basamaklı pozitif bir tamsayı giriniz");
  int sayi=scan.nextInt();


 if (sayi<1000 || sayi>9999){ //istenmeyen durumu yazıyoruz
     System.out.println("lütfen 4 basamaklı sayi giriniz");


        }else if(sayi%5==0){// 4 basamaklı sayı 5 tambölünüyor

     if (sayi%10==0){//4 basamaklı 5 ile bölünebilen ve sonrakamı 0 olabilen
         System.out.println("'5' e bolunen çift sayi");

     }else{
         System.out.println("'5' e bölünen teksayı ");

     }


    }else{
     System.out.println("tekrar deneyiniz");


    }
}
}
