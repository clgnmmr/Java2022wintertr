package day04_dataCasting_Increment;

public class C05_IncrementDecrement {
    public static void main(String[] args) {

        int sayi=20;
        System.out.println(sayi+10);
     //bu satırda sayıyı 10 arttırmadım sayının 10 fazlasını yazzdırdım

        System.out.println(sayi);// eger atama yapmazsak sayıda yaptıgımız arttırma veya azaltma kalıcı olmaz
        // kayıt edilmesini istiyorsanız

        sayi=sayi+10;

        System.out.println(sayi);

        System.out.println(sayi=sayi+=10);// 40

        System.out.println(sayi+=10);// üstteki ile aynıdır ve sayının değeri değişir
        System.out.println(sayi);




    }
}
