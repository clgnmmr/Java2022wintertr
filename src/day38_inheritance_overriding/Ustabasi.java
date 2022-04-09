package day38_inheritance_overriding;

import java.util.ArrayList;

public class Ustabasi extends Isci {
    public String statu="Ustabasi";
    public String haklar="Haftada bir gun ekstra tatil hakkına sahiptir";



    public void  mesai(){
        System.out.println("Arıza varsa Ustabasi ekstra ucret almadan calısır ");
    }

    public void maasHesaplama(){
        System.out.println("Ustabasi 30 gun 8 saat 12 euro :"+30*8*12+" ucret alır");
    }

    public static void main(String[] args) {

        /*
        ıcınde buululundugumuz classdn klasik haliyle bir obje olustuursak o obje ile cagırdıgımız
        variable ve methodlade java once ıcınde bulundugumuz class bakar
        aradıgmız class uyesi icinde oldugumuz class da varsa alır getirir
        yoksa
        parent classlara bakar ilk buldugunu getirir.
         */
        Ustabasi yasin=new Ustabasi();

        System.out.println(yasin.statu);//Ustabasi
        System.out.println(yasin.haklar);//Haftada bir gun ekstra tatil hakkına sahiptir
        System.out.println(yasin.ikramiye);//Iscıler yılda bi ikramiye alır
        System.out.println(yasin.izin);//tum personel yılda haftada 4 gun izin yapabilir.

      yasin.maasHesaplama();
      yasin.mesai();

        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        /*
        eger isci ozelliklerini görmek istersek
         */


        ///////////********************///////////////
       Isci ahmet=new Ustabasi();//---------->  ONEMLİ


        System.out.println(ahmet.statu);//Isci
        System.out.println(ahmet.haklar);//Iscıler kıdem tazinatı alır.
        System.out.println(ahmet.ikramiye);//Iscıler yılda bi ikramiye alır
        System.out.println(ahmet.izin);//tum personel yılda haftada 4 gun izin yapabilir.

        ahmet.maasHesaplama();
        ahmet.mesai();

        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        //*************************************************//

        /*
        siz bir objeyi hangi class tanımlarsanız o class a ait ozelliklere sahip olur
         */
        Personel adem=new Ustabasi();

        System.out.println(adem.statu);//personel
        System.out.println(adem.haklar);//tum personel esit haklara sahiptir
      //  System.out.println(adem.ikramiye);// C:T:E verir
        System.out.println(adem.izin);// tum personel yılda 4 hafta izin kullanır


        adem.maasHesaplama();
        adem.mesai();
        /*

        Personel adem=new Ustabasi();

        ademindata turu Personel dir
        boylece biz ademi ne olarak isimlendirdigimizi bilebiliriz
        ancak ben ademin ustabası oldugunu biliyorum cunku constructoru ustabası

        ama bu yazim formatı ile ademin tum pesonel ile birlike sahip oldugu
        ortak özellikleri vurgulamak istiyorum

        bu kullanım seklinde olusturulan obje data turu olarak secilen class
        ve onun parent classlarındaki variablları kullanabilir

         */
    }
}
