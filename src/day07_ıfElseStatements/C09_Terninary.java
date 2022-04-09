package day07_ıfElseStatements;

import java.util.Scanner;

public class C09_Terninary {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);

        System.out.println("lütfen gün ismini yazınız");

        String gunIsmi= scan.next().toLowerCase();

            if (!gunIsmi.equals("pazar")){
                System.out.println("yanlıs gun \n tekrar giriniz");
            }
       String cıktı= gunIsmi.equals("pazar") ? ("girdiğiniz gün  : hafta sonu") : ("girdiğiniz gün  : hatalı");
        System.out.println(cıktı);

    }
}
