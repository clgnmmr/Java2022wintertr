package day11_stringmanipulation;

import java.util.Scanner;

public class C03_equalsIgnorCase {
    public static void main(String[] args) {
        //kullanıcıya derse katılıp katılmak istemedgini sorun
        //evet derse  cevabını"derse katılımınız alınmıstır"yazdırın
        //hayır derse cevabını ve "sonraki derslerimize bekleriz"yazdırın

        Scanner scan =new Scanner(System.in);

        System.out.println("Derse katılmak ister misiniz ? \n evet veya hayır yazınız");
        String cevap=scan.next();

        if (cevap.equalsIgnoreCase("evet")){
            System.out.println("cevabınız :"+cevap+" derse katılımınız onaylanmıstır");

        }else  if (cevap.equalsIgnoreCase("hayır")){
            System.out.println("cevabınız :"+cevap+" sonraki derslere katılımınızı bekleriz");

        }else {
            System.out.println("lütfen evet veya hayır yazınız");
            // bunu kullanmamızın nedeni alınan cevabı direk verebilmek yoksa touppercase kulanılır ama
            // kullanıcın cevabı değişir şifrleder de buu kullanmak önemli
        }
    }
}
