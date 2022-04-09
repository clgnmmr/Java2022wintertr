package day08_ifElseIfStatement;

import java.util.Scanner;

public class C04_NestedIfElse {
    public static void main(String[] args) {
        //Eger calisan kadinsa 60 yasindan buyuk oldugunda emekli olabilir,
        // calisan erkekse 65 yasindan buyukse emekli olabilir

        Scanner scan=new Scanner(System.in);

        System.out.println("lutfen cinsiyetinizi yazınız"  + "\nKadın için K \n Erkek için E harfini giriniz");

        char cinsiyet=scan.next().toUpperCase().charAt(0);

        System.out.println("lütfe yaşınızı giriniz");

        double yas= scan.nextDouble();

        if (cinsiyet=='K'){
            if (yas<0 || yas>120){
                System.out.println("lütfen girdiginiz yas degerini kontrol ediniz");
            }else if (yas<60){
                System.out.println("emekli olamazsın\n Daha" + (60-yas)+ "yıl calışmalısın");

            }else{
                System.out.println("Emekli olabilirsiniz");
            }

        } else if (cinsiyet=='E') {

            if (yas<0 || yas>120){
            System.out.println("lütfen girdiginiz yas degerini kontrol ediniz");
        }else if (yas<65){
            System.out.println("emekli olamazsın\n Daha" + (65-yas)+ "yıl calışmalısın");

        }else{
            System.out.println("Emekli olabilirsiniz");
        }



        }


        else{
                System.out.println("lütfen cinsiyet için gerekli harfi giriniz");
            }



    }
}
