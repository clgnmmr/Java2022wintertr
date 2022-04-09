package day32_dateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C04_DateTimeFormatter {
    public static void main(String[] args) {

        LocalDateTime tarihSaat=LocalDateTime.now();

        System.out.println(tarihSaat);




      /*
         format olustururken

         GUN
         d : basta 0 varsa onu yazmadan gun numarasi
         dd: tek haneli gunleri 01 gibi basina sifir yazarak gun numarasi
         DDD : yilin kacinci gunu oldugunu yazar
         E, EE, EEE : gun isminin ilk 3 harfi
         EEEE : gun isminin tamamini

         AY (Ay icin M, dakika icin m kullanilir)
         M : basta 0 varsa onu yazmadan ay numarasi
         MM: tek haneli aylari 01 gibi basina sifir yazarak ay numarasi
         MMM : Ay isminin ilk 3 harfi
         MMMM : Ay isminin tamami

         YY : yilin son iki rakamini
         YYYY : Yilin tamamini


         Saat : (24 saat uzerinden istiyorsak H, 12 saat duzeninde istiyorsak h)

         HH : saatin tamami, tek rakamli saat olursa 02 gibi
         H  : tek rakamli saat olursa sadece saati

         h:12 saat dilimine göre 1 rakam verir
         hh:12 saat dilimine göre 01 rakam verir

         m: minute 1 yazar
         mm: minute 01
         a yazarsak AM veya PM degerini yazar


         */

        DateTimeFormatter fmt=DateTimeFormatter.ofPattern("dd/MMMM/YYYY");
        System.out.println(fmt.format(tarihSaat));

        DateTimeFormatter fmt1=DateTimeFormatter.ofPattern("h:m a");
        System.out.println(fmt1.format(tarihSaat));
    }
}
