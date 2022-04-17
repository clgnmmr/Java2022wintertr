package day43_garbage_abstractClass;

public class C01_Final {
    final static double pi=3.14;
    final static String okulIsmi="kolej";

    public static void main(String[] args) {
        final int sayi=10;
        /*
        heryerde kullanılır ama yeni deger ataması yapılamaz
         */
        //sayi=10; bunu kabul etmez ,değiştiremicek değerler kullanmak iyidir örnek pi sayısı


    }
    public static final void  method1(){
        System.out.println("parent class final method 1");
    }
}
