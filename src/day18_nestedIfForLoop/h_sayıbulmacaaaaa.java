package day18_nestedIfForLoop;

import java.util.Random;
import java.util.Scanner;

public class h_sayıbulmacaaaaa {
    public static void main(String[] args) {


        Random rnd=new Random();
        int sayi=rnd.nextInt(100);  // burasi 100'den kucuk rastgele bir sayi olusturur
        System.out.println(sayi);

        Scanner scan=new Scanner(System.in);


        int tahminAdedi=0;


        while (sayi>=1 && sayi<100) {
            System.out.println("Lutfen bir tahminde bulunun");
            int tahmin = scan.nextInt();

            tahminAdedi++;

      if (5-tahminAdedi!=0){
          System.out.println( (5-tahminAdedi)+" "+"tahmin hakkınız kaldı");

      }else {
          System.out.println("tahmin hakkınız bitmiştir");



      }
        if (tahmin==sayi){

                System.out.println("Dogru tahminde bulundunuz");


                break;


             }else if (tahmin>sayi){
                System.out.println("Tahmininizi kucuktun");


             }else{ System.out.println("tahmininizi buyultun");}






        }    System.out.println("girdiginiz tahmin sayısı :"+tahminAdedi+"  buldugunuz sayı :"+sayi);








        }
}
