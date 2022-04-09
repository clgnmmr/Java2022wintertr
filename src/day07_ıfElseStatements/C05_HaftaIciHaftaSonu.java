package day07_ıfElseStatements;

import java.util.Scanner;

public class C05_HaftaIciHaftaSonu {
    public static void main(String[] args) {

        //Soru 3) Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
        //  Ornek:  gun=Pazar output = “Hafta sonu”
        // gun=Sali output = “Hafta ici”
        // *** String icin equals method’unu kullanin

        //pazar veya cumartesi ise ===>haftasonu
        //pazartesi veya sali veya çarşamba veya perşembe veya cuma ise===>hafta içi


        //String case sensitive dir yani pazar ,PAZAR,Pazar hep farlı kelimelerdir
        //bu durumdan string methodlarından yardım alırız


        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen gün ismini yazınız");

        String gınIsmi=scan.next().toLowerCase();//kullanıcı nasıl yazara yazsın biz küçük harfe çeviyoruz

       //string ifadelerde == kullanılması tavsiye edilmez
        // cünkü beklediğimizden farkli sonuc verebilir

        if (gınIsmi.equals("pazar")||gınIsmi.equals("cumartesi")){
            System.out.println("girdiğiniz gunhafta sonu");
        }

        if (gınIsmi.equals("pazartesi")||gınIsmi.equals("salı")||gınIsmi.equals("carsamba")||gınIsmi.equals("persembe")||gınIsmi.equals("cuma")){
            System.out.println("girdiğiniz gun hafta ıcı");
        }
    }






}
