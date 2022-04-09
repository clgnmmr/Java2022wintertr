package day19_doWhileLoop;

public class C03_DoWhileLoop {
    public static void main(String[] args) {
        //kullanıcıdan alınan sayıyı
        //while loop ile sayıların yazdıralm
        int input=3;

        int sayi=1;
        int sayac=0;


        while (sayi<input){

            System.out.println(sayi);
            sayac++;
            sayi++;
        }
        System.out.println("sayac :"+sayac);


        //aynı soruyu do while loop ile yapalım


       sayi=1;
        sayac=0;

        do {
            System.out.println(sayi);
            sayi++;
            sayac++;
        }while(sayi<input);
        System.out.println("sayac :"+sayac);

    }
}
