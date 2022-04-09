package day08_ifElseIfStatement;

import java.util.Scanner;

public class C03_SayiKontrol {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen iki sayı giriniz");

        double sayi1= scan.nextDouble();
        double sayi2= scan.nextDouble();


        if (sayi1>0 && sayi2>0){
            System.out.println("girdiğiniz iki sayıda pzitif olduğundan toplamları =" + (sayi1+sayi2));
        }else if (sayi1<0 && sayi2<0){
            System.out.println("girdiğiniz iki sayıda negatif olduğundan çarpımları =" + (sayi1*sayi2));
        }else if (sayi1>0 && sayi2<0 || sayi1<0 && sayi2>0){// burda sayi1*sayi2<0 isenegatiftir bir tanesi
            System.out.println("girdiğiniz iki sayıda farklı işaret olduğundan işlem yapamazsın =");
        }else{
            System.out.println("''sıfır çarpmadayutan elemandır''");
        }


    }
}
