package day19_doWhileLoop;

import java.util.Scanner;

public class C04_DoWhileLoop {
    public static void main(String[] args) {
        //Kullanicidan toplamak uzere pozitif sayilar isteyin, islemi bitirmek icin 0’a basmasini soyleyin.
        // Kullanici yanlislikla negative sayi girerse
        // o sayiyi dikkate almayin ve “Negatif sayi giremezsiniz” yazdirip basa donun
        // Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini, yanlislikla
        // kac negative sayi girdigini ve girdigi
        // pozitif sayilarin toplaminin kac oldugunu yazdirin



        Scanner scan=new Scanner(System.in);
        int sayi=0;
        int toplam=0;
        int sayacpozitif=0;
        int sayacnegative=0;




        do{
            System.out.println("Lutfen pozitif bir tam sayı girin \n işlemi bitirmek için sıfıra basın");
            sayi=scan.nextInt();
            if (sayi<0){
                System.out.println( "negatif sayı giremezsiniz");
          sayacnegative++;

            }else if (sayi>0){
                toplam+=sayi;
             sayacpozitif++;
            }

        }while(sayi!=0);
        System.out.println("yanlışlıkla girilen negatif sayı adedi ="+sayacnegative);
        System.out.println("girilen pozitif sayı adedi ="+sayacpozitif);
        System.out.println("girilen pozitif sayıların toplamı :"+toplam);

    }
}
