package day05_matematikselişlemler;

import java.util.Scanner;

public class C03_RakamlarToplamınıBulma {
    public static void main(String[] args) {

      //kullanıcıdan aldığınız 4 basaklı bir sayının basamaklardaki rakamlar toplamını bulunuz

        Scanner scan=new Scanner(System.in);

        System.out.println("lütfen 4 basamaklı bir tam sayi giriniz");

        int sayi=scan.nextInt();

        int rakam=0;
        int rakamlarToplamı=0;
        //1.adım r=o rt=0 sayi=7532

        rakam=sayi%10;
        rakamlarToplamı+=rakam;
        sayi/=10;
        //1.adım r=2 rt=2 sayi=753

        rakam=sayi%10;
        rakamlarToplamı+=rakam;
        sayi/=10;
        //1.adım r=3 rt=5 sayi=75

        rakam=sayi%10;
        rakamlarToplamı+=rakam;
        sayi/=10;
        //1.adım r=5 rt=10 sayi=7

        rakam=sayi%10;
        rakamlarToplamı+=rakam;
        sayi/=10;
        //1.adım r=7 rt=17 sayi=0

        System.out.println("girdiiniz sayının rakamlar toplamı :"  +rakamlarToplamı);




    }
}
