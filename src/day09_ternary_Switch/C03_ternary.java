package day09_ternary_Switch;

public class C03_ternary {
    public static void main(String[] args) {

         int sayi=150;
         // verilen sayının 3 veya daha cok basamaklı olup olmadığını kontrol eden bir tenary yazın
        // ve sonucu yazdırıan bir ternary yazdırın

        String cıktı=sayi>=100 ? "sayi 3 veya daha cok basamaklı" : "sayi negativ veya uc basamaktan kucuk";
        // ternary bize sonuc döndürdüğü ıcın ya bu sonucu direk yazdırmalıyız yada sonuca data turune  uygun bir veriable
        // atama yapailliriz

        System.out.println("girdiginiz sayi analizi"+cıktı);

    }
}
