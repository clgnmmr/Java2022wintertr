package day12_stringManipulation;

import java.util.Scanner;

public class C01_lastIndexOf {
    public static void main(String[] args) {

        //Kullanicidan bir cumle ve bir kelime isteyin, kelimenin cumledeki kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
        //- Girilen kelime cumlede kullanilmamis.
        //        - Girilen kelime cumlede 1 kere kullanilmis.
       // - Girilen kelime cumlede 1’den fazla kullanilmis.

        Scanner scab=new Scanner(System.in);
        System.out.println("lutfen bir cumle giriniz");
        String cumle=scab.nextLine();
        System.out.println("lutfen bir kelime giriniz");
        String kelime=scab.nextLine();

        int ilkIndex=cumle.indexOf(kelime);
        int sonIndex=cumle.lastIndexOf(kelime);

        if (ilkIndex==-1){
            System.out.println("girilen kelime cumlede kullanılmamış");

        }else if (ilkIndex==sonIndex){
            System.out.println("girilen kelime cumlede 1 kere kullanılmış");
        }else{
            System.out.println("girilen kelime cumlede1 den fazla kullanılmış");
        }



        String str="Eclipse";
        System.out.println(str.lastIndexOf("p",5));
    }

}
