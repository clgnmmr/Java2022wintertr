package day11_stringmanipulation;

public class C02_Equals {
    public static void main(String[] args) {

        String str1="Ali Can";
        String str2="Ali"+" Can";

        System.out.println("str = " + str1);
        System.out.println("str2 = " + str2);

        System.out.println("== ile karsılastır :"+(str1==str2));//true
        System.out.println("equals ile karsılastır :"+str1.equals(str2));//true

        String str3=str1+"";
        System.out.println("str3 = " + str3);
        System.out.println("== ile karsılastır :"+(str3==str2));//false
        System.out.println("equals ile karsılastır :"+str3.equals(str2));//true

        //String de ==(double equals) her zman dogru sonuc vermez
        // bunun icin emin oldugumux equals methodunu kullanmayı tercih ederiz

        String str5="hasan";

        String str6="HASAN";

        System.out.println(str5.equals(str6));//false

        System.out.println(str5.toUpperCase().equals(str6));//true




    }
}
