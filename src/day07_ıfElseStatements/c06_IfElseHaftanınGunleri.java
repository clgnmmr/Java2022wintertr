package day07_ıfElseStatements;

import java.util.Scanner;

public class c06_IfElseHaftanınGunleri {
    public static void main(String[] args) {
        //Soru 3) Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
        //  Ornek:  gun=Pazar output = “Hafta sonu”
        // gun=Sali output = “Hafta ici”
        // *** String icin equals method’unu kullanin

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen gün ismini yazınız");

        String gunIsmi= scan.next().toUpperCase();//hepsi büyük harf olarak alınacak

        if (gunIsmi.equals("PAZAR")||gunIsmi.equals("CUMARTESİ")){ //burda harflerin büyük istenildiği için büyük harfle yazılması gerek
            System.out.println("girdiğiniz gun :hafta sonu");
        }else {
            System.out.println("girdiğiniz gün: hafta ici");}


    }
}
