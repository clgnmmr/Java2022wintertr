package day07_ıfElseStatements;

import java.util.Scanner;

public class C04_TekCiftSayı {
    public static void main(String[] args) {
        // bir tamsayı iste ve tek mi çift mi olduğunu yazdır


        Scanner scan =new Scanner(System.in);
        System.out.println("lütfen bir tam sayı giriniz");

        int sayi= scan.nextInt();


        if (sayi%2==0){
            System.out.println("girilen sayı çift sayıdır");
        }
        if (sayi%2!=0){
            System.out.println("girilen sayı tek sayı");

        }
        //normalde bir tam sayı ya tektir veya çifttir ,üçncü bir durum yoktur
        //o zman tek olması ve çift olmasını iki ayrı if ile değil
        //if else ile tek statements yapmak daha güzel olur


        //ıf else ile çözüm

        if (sayi%2==0){System.out.println("girdiğiniz sayı çift sayidir");
        }else {System.out.println("girdiğiniz sayı tek sayıdır");}

        //if (sayi%2==0){
        // System.out.println("girdiğiniz sayı çift sayidir");}
        //   else {System.out.println("girdiğiniz sayı tek sayıdır");}

    }
}
