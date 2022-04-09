package day11_stringmanipulation;

import java.util.Scanner;

public class C05_IndexOf {
    public static void main(String[] args) {


        String str1="Java bir baska guzel";
// istersek char olarak verdigimiz bir harfin indexini bize dondurur.
        System.out.println(str1.indexOf('J'));// 0
//istersek bir harf yada metinin olarak verdigimiz string in index döndürür
        System.out.println(str1.indexOf("l"));// 19

        System.out.println(str1.length()-1);// 19
        System.out.println(str1.indexOf("aska"));//10


        //aynı harfeten birden fazla varsa
        System.out.println(str1.indexOf("b"));// 5 ilk buldugunu dogru eslesmenin indexini doondurur

        System.out.println(str1.indexOf('b', 5));// once 5 inci index gider
            //bu methodda java aramaya fromindex olarak yazdıgımız ındexten baslar
        //(inclusive)


        //vrilen stringdeki ikinci harfinin indeksini bulalım

        int ilkIndex=str1.indexOf('a');//1
        System.out.println(str1.indexOf('a',ilkIndex+1));// 3


        //
        String str2="Java bir baska guzel valla cok guzel";

        //20. indexten sonra guzel aratınn
        System.out.println(str2.indexOf("guzel", 20));// 31

        //String de olmayan bir harf
        System.out.println(str2.indexOf("y"));// y yok demesi lazım ama return  type'i index
                                            // yok demenin sayısal karsılıgı olarak -1 döndurmayi tercih eder

        //kullanıcıdan mail adresini isteyin @isareti icer miyorsa gecersiz yazdırın
        //iceriyorsa mailiniz kabul edildi

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen mailinizi yazın");
        String mail=scan.next();

        //OZET : index of methodu içerisine yazılan string ve ya charın metinde hangi indexte olduunu bize döndürür
        //eger ardıgımmız metin ve ya char yoksa olmadıgının delili olarak -1 döndurur

        if (mail.indexOf("@")==-1){
            System.out.println("gecersiz");
        }else{
            System.out.println("mailiniz kabul edildi");
        }


    }
}
