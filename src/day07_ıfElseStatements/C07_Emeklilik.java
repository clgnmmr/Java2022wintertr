package day07_ıfElseStatements;

import java.util.Scanner;

public class C07_Emeklilik {
    public static void main(String[] args) {
        //kullanıcıdan yasını isteyin //65 veya daha vüyükse emekli olabilirsin
        //65 den küçükse emekli olamazsa yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen yaşınızı giriniz" );

        int sayi= scan.nextInt();

        if (sayi>=65){
            System.out.println("emekli olabilirsiniz");
        }else {
            System.out.println("emekli olabilirsin ");
            System.out.println(65-sayi + "   sene daha calismalisin");
            //if else statements larda iki  durumdan sadece ve sadece biri calısır
            //ikisininde birden calisma ihtimali =====> yok
            // ikisininde calismama ihtimali ======> yok
        }






}
}
