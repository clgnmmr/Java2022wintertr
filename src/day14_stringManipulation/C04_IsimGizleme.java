package day14_stringManipulation;

public class C04_IsimGizleme {
    public static void main(String[] args) {
        /*
        Soru 7) Kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin ve asagidaki gibi yazdirin
        isim-soyisim : M***** B*******
        kart no : **** **** **** 1234
         */
        String isim="yasemin";
        String soyisim="sarı";
        String kkNo="1234567890128756";

        String yenisim=isim.substring(0,1).toUpperCase()+
                isim.substring(1).replaceAll("\\S","*");


        String yeniSoyIsim=soyisim.substring(0,1).toUpperCase()+
                soyisim.substring(1).replaceAll("\\S","*");


        String yeniKKNo="**** **** **** "+kkNo.substring(kkNo.length()-4);



        System.out.println("isim-soyisim :"+yenisim+" "+yeniSoyIsim);

        System.out.println("kart no : "+yeniKKNo);

    }
}
