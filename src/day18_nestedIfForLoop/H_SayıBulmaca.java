package day18_nestedIfForLoop;

import java.util.Random;
import java.util.Scanner;

public class H_SayıBulmaca {
    public static void main(String[] args) {

        //bilgisayara 1 ile 100 arasında bir sayi tutturun
        //kullanıcıdan bu sayıyı tahmin etmesini isteyin
        //girilen her tahminde sayıyı  büyüt yada küçült diye kullanıcıya yol gösterin
        //kullanıcı sayıyı buldugunda kaç tahminde sayiyi buldugunu kullanıcıya yazdırın

        Random rnd=new Random();
        int sayi=rnd.nextInt(100);  // burasi 100'den kucuk rastgele bir sayi olusturur

        Scanner scan=new Scanner(System.in);

       int tahminAdedi=0;


        while (sayi>=1 && sayi<100){
            System.out.println("Lutfen bir tahminde bulunun");
            int tahmin=scan.nextInt();


            if (tahmin==sayi){
                System.out.println("Dogru tahminde bulundunuz");

                tahminAdedi++;
                break;


            }else if (tahmin>sayi){
                System.out.println("Tahmininizi kucuktun");


            }else{ System.out.println("tahmininizi buyultun");}




            tahminAdedi++;

        }
        System.out.println("girdiginiz tahmin sayısı :"+tahminAdedi+"  buldugunuz sayı :"+sayi);





    }
}
