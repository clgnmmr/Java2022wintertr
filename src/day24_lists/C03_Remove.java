package day24_lists;

import java.util.ArrayList;
import java.util.List;

public class C03_Remove {
    public static void main(String[] args) {

        List<Integer> sayılar=new ArrayList<>();

        sayılar.add(5);// [5]
        sayılar.add(3);// [5,3]
        sayılar.add(0,7);// [7,5,3]
        sayılar.add(2,7);//[7,5,7,3]


        sayılar.remove(3);//index olrak 3 deki elementi siler

         // sayılar.remove(5);
       //sayılardan oluşan bir listde objeyi vererek element silme methodu calışmaz
        //sayı değeri girdiğimizde java otomatik olarak sayıyı index abul eder.


        //int sayi=5; yapıp kaldırmak istesekte primitive oldugu için index kabul eder ama

        Integer sayi=5;
        sayılar.remove(sayi);
        System.out.println(sayılar);
        sayılar.remove(Integer.valueOf(7));

        System.out.println(sayılar);
    }
}
