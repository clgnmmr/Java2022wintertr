package day38_inheritance_overriding;

public class Isci extends Personel {
    public String statu="Isci";
    public String haklar="Iscıler kıdem tazinatı alır.";
public String ikramiye="Iscıler yılda bi ikramiye alır";



    public void  mesai(){
        System.out.println("Isciler haftalık 40 saat calisir.");
    }

    public void maasHesaplama(){
        System.out.println("Iscı 30 gun 8 saat 10 euro :"+30*8*10+" ucret alır");
    }
}