package day02_veriables;

public class c01_veriables {
    public static void main(   String[] args   ) {
        // bir variable olustururken icerisine koyacagim datanin alabilecegi degerlere uygun
        // bir data turu saecmeliyiz
        // ornegin bir sehrin nufusundan bahsediyorsak
        // variable'imizin data turu String, boolean, char veya double olamaz
        // geriye kalan tamsayi turlerinden sehrin nufusunu icine alabilecek buyuklukte bir data turu seceiliriz
        // biz kurs boyunca genelde tam sayilar icin int, ondalikli sayilar icin double kullanacagiz
        System.out.println(    "Hello World yazdiran Javayi halleder "    );
        int level=1;
        System.out.println(level);
        boolean ogrenciMi= true;
        boolean yagisVarMi=false;
        System.out.println(ogrenciMi);
        char ozelSembol='&';
        char sayi='2';
        char harf='K';
        System.out.println(harf);

        double sayi5=5;
        int sayi6=2;
        double sonuc=sayi5/sayi6;
        System.out.println(sonuc);
    }
}