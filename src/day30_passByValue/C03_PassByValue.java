package day30_passByValue;

public class C03_PassByValue {
    public static void main(String[] args) {
           /*
           javapass by value bir programlama diliridir yani bir primitive veriable argument olarak bir methoda yollaranız
           java  o variable değil ,degerini yani value methoda yollar bunada pass yapar

            */

        double etiketFiyati=100;
        yuzdenOnIndirimYap(etiketFiyati);
        yuzdenOnIndirimYap(etiketFiyati);
        System.out.println("iki indrimden sonra main method da etiket fiyatı :"+etiketFiyati);

    }

    private static void yuzdenOnIndirimYap(double etiketFiyati) {
        etiketFiyati=etiketFiyati*0.90;
        System.out.println("sizin icin %10 indirimli fiyatımız :"+etiketFiyati);
    }
}
