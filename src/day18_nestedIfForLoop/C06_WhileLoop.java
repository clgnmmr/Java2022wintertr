package day18_nestedIfForLoop;

import java.util.Scanner;

public class C06_WhileLoop {
    public static void main(String[] args) {
        //kullanıcıdan kaç sayı toplamak istediğini alın
        //bu sayıları alın ve ekrana yazdırını

        int sayiAdedi=3;


        Scanner scan=new Scanner(System.in);
        int sayi=0;

        int toplam=0;


/*



        for (int i=1;i<=sayiAdedi;i++){

            System.out.println("lutfen bir sayi giriniz");
            sayi= scan.nextInt();
            toplam+=sayi;
        }
        System.out.println("girilen sayı = "+sayiAdedi+"  sayinin toplamı ="+toplam);
*/
        //while  ile yapalım

        sayi=0;
        toplam=0;
        int sayac=1;
        while (sayac<=sayiAdedi){
            System.out.println("lutfen bir sayi giriniz");
            sayi= scan.nextInt();
            toplam+=sayi;
            sayac++;
        }
        System.out.println("girilen "+ sayiAdedi + " sayinin toplami : " + toplam);



    }
}
