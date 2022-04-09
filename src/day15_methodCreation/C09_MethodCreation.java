package day15_methodCreation;

public class C09_MethodCreation {
    public static void main(String[] args) {


        String isim="yasemin";
        String soyisim="sarı";
        String kkNo="1234567890128756";

        //eger bir methodddan bir işlem yapmasını
        // ve yaptıgı islemi bize getirmesini isterseniz
        //return type  void değil,bize getireceği data türünde olmalıdır
       // isimSoyisimGizle(isim,soyisim);
        String gizlenmisIsimSoyisim=isimSoyisimGizle(isim,soyisim);

        System.out.println(gizlenmisIsimSoyisim);
        //bnaa isim ve soy ismin gizlenmiiş halini getirmesini istiyorum
        //beklediğim dönüş String olur.
        // void  String dönüşür

       // krediKartıGizle (kkNo);
        String gizlenmisKKNo=krediKartıGizle(kkNo);
        System.out.println(gizlenmisKKNo);
        // yazdırmak her zman temel amac değildir
        //temel amac dğişiklikleri kayıt edebilmek









    }




    public static String krediKartıGizle(String kkNo) {

        String yeniKKNo="**** **** **** "+kkNo.substring(kkNo.length()-4);
return yeniKKNo;
    }






    public static String isimSoyisimGizle(String isim, String soyisim) {

        String yenisim=isim.substring(0,1).toUpperCase()+
                isim.substring(1).replaceAll("\\S","*");



        String yeniSoyIsim=soyisim.substring(0,1).toUpperCase()+
                soyisim.substring(1).replaceAll("\\S","*");

       //method olusturmada ucun cu adım method calısınca sadece bir şey mi yazdıracak
       //yoksa bize bir bize bir data mı döndurecek buna karar vermektir
       // bu soruda gizlenmiş isim soyisim dondurması istendiğinden return type void değil string seçti
       //ve mmethodun sonuna return edilecek datayı yazdık
        return yenisim+ " "+yeniSoyIsim;
    }





}


