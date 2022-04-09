package day08_ifElseIfStatement;

import java.util.Scanner;

public class C02_IfElse {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen Notunuzu Giriniz");


        double notSayi= scan.nextDouble();

        if (notSayi<0 || notSayi>100)
        {
            System.out.println("Lutfen Gecerli bir not Giriniz");

        }else if (notSayi<50){
            System.out.println("Notunuz D");

        }else if (  notSayi<60){
            System.out.println("Notunuz C");
        }else if ( notSayi<80){
            System.out.println("Notunuz B");
        } else {

            System.out.println("Notunuz A");

        }



    }
}
