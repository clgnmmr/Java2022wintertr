package day16_methodCreation;

public class C01_MethodIleSifreKontrol {
    public static void main(String[] args) {
        /*
        Soru 6) Kullanicidan bir sifre girmesini isteyin. Asagidaki sartlari sagliyorsa “Sifre basari ile tanimlandi”, sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir sifre girin” yazdirin
    - Ilk harf buyuk harf olmali
    - Son harf kucuk harf olmali
    - Sifre bosluk icermemeli
    - Sifre uzunlugu en az 8 karakter olmali

         */

        String sifre="Cabc132a";

        boolean ilkHarf= ilkHarfKontrolEt(sifre);
        boolean sonHarf= sonharfKontrolEt(sifre);
        boolean bosluk=boslukKontrolEt(sifre);
        boolean  uzunluk=uzunlukKontrolEt(sifre);


        if (ilkHarf && sonHarf && bosluk && uzunluk){
            System.out.println("sifreniz basarili bir sekilde kaydedildi");
        }else System.out.println("şifrenizde düzeltilmesi gereken hatalar var");


//method yaparak kodlarımın sadeliği anlaşılırlığı ortaya çıkar


    }









    private static boolean uzunlukKontrolEt(String sifre) {
        boolean uzunlukKontrolSonucu=false;
        if (sifre.length()>=8){
            uzunlukKontrolSonucu=true;
        } else {
            System.out.println("Sifre en az 8 karakter olmali");
        }
        return uzunlukKontrolSonucu;
    }






    private static boolean boslukKontrolEt(String sifre) {
        boolean boslukSonucu=false;


        if (!sifre.contains(" ")){
            boslukSonucu=true;
        } else {
            System.out.println("sifre bosluk icermemeli");
        }
        return boslukSonucu;
    }





    private static boolean sonharfKontrolEt(String sifre) {
         boolean ilkHarfSonuc=false;
      char sonHarf=sifre.charAt(sifre.length()-1);

        if (sonHarf>='a' && sonHarf<='z'){

            ilkHarfSonuc=true;
        }else {
            System.out.println("Sifrenizin son harfi kucuk harf olmali");
        }


         return  ilkHarfSonuc;
    }










    private static boolean ilkHarfKontrolEt(String sifre) {
        char ilkHarf=sifre.charAt(0);
        boolean ilkHarfSonuc=false;
        if (ilkHarf>= 'A' && ilkHarf<='Z'){
            ilkHarfSonuc=true;
        }else {
            System.out.println("Sifrenizin ilk harfi Buyuk Harf olmali");
           // ilkHarfSonuc=false;
        }

        return ilkHarfSonuc;

    }
}
