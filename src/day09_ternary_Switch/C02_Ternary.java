package day09_ternary_Switch;

import java.util.Scanner;

public class C02_Ternary {
    public static void main(String[] args) {


        //ternary ile yapılan tum islemler ,if else ilede yapılabilir
        //if else yerine ternary tercih edilebilmesinin nedeni yapınaınn basit ve anlaşılır olmasıdır
        //ternary içersinde kompleks kodlar olmaz
        //sadece sonuc ve ya bizisonucs goturen basit islemker olabiilir

        // kullanıcıdn bir tam sayı alıp tek mı cıft mı yazdıran bir kod yazalım

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen pozitif bir tamsayı giriniz ");

        int sayi=scan.nextInt();

        if (sayi%2==0){
            System.out.println("sayı çifts ayı");
        }else {
            System.out.println("sayı tek");
        }


        System.out.println(sayi%2==0 ? "sayı cift" : "sayi tek");

    }
}
