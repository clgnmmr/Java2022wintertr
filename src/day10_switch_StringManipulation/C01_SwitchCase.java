package day10_switch_StringManipulation;

import java.util.Scanner;

public class C01_SwitchCase {
    public static void main(String[] args) {

        //kullanıcıdan sayı olarak kacıncı ay oldugunu alıp
        //istenen ay ismini yazdıran bir program yazdırınız

        Scanner scan=new Scanner(System.in);

        System.out.println("lütfen kacıncı ay olduğunu giriniz");

        int ayNo=scan.nextInt();
        // bu soruyu if else ile ypabiliriz ama art arda çokalabalık ve anlaşılması guç olabilir
        //bunun yerine switch case yapısını kullana biliriz

        switch (ayNo){
            case 1:
                System.out.println("Ocak");
                break;
            case 2:
                System.out.println("Subat");
                break;
            case 3:
                System.out.println("Mart");
                break;
            case 4:
                System.out.println("Nisan");
                break;
            case 5:
                System.out.println("Mayıs");
                break;
            case 6:
                System.out.println("Haziran");
                break;
            case 7:
                System.out.println("Temmuz");
                break;
            case 8:
                System.out.println("Agustos");
                break;
            case 9:
                System.out.println("Eylül");
                break;
            case 10:
                System.out.println("Ekim");
                break;
            case 11:
                System.out.println("Kasım");
                break;
            case 12:
                System.out.println("Aralık");
                break;
               default:
                   System.out.println("lütfen gecerli bir ay numarasi giriniz");
                // switch icine yazılan veriable degerine göre ilgili case bulur
            //ve break görene kadar kodu çlıştırır eğer birek yoksa ilgili caseden asagı dogru tum caseler calısır
                //if elseteki son else gibi,geriye kalan durumları tamammen kapsayacak bir satır daha ekleyebilir
        }
    }
}
