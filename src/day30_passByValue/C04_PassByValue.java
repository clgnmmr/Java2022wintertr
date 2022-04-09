package day30_passByValue;

public class C04_PassByValue {
    //eger bir methodda yapılan bir degerin kalıcı olmasını istiyorsak
    //iki yontem kullanabilirz
    //1- variable class levelda static olarak olarak oluşturabilirim

    static double etiketFiyati;
    static double indirimYuzdesi;

    public static void main(String[] args) {

        etiketFiyati=100;
        indirimYuzdesi=10;
        kaliciIndirimYap();



    }
    public  static void kaliciIndirimYap(){
        etiketFiyati=etiketFiyati*(100-indirimYuzdesi)/100;

        System.out.println("indirim fiyatından sonraki degeri :"+etiketFiyati);
    }
}
