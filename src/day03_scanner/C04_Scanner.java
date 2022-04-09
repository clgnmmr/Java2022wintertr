package day03_scanner;


import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

         System.out.println("lütfen isminizi giriniz");

        String kullanıcıIsmi=scan.nextLine();

        System.out.println("lütfen soyadınızı giriniz ");
        String kullanıcıSoyadı= scan.nextLine();

        System.out.println("kullanıcının girdiği isim: " + kullanıcıIsmi);
        System.out.println("kullanıcının girdiği soyadı : " + kullanıcıSoyadı);

    }
}
