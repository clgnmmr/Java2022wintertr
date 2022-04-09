package day03_scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen isminizi  yazınız");
        String isim= scan.nextLine();
        System.out.println("lütfen soyisminizi girirniz");
        String soyisim= scan.nextLine();
        System.out.println("isim - soyisim : " + isim + " " + soyisim);
    }
}
