package day38_inheritance_overriding;

public class Personel {

    public String statu="Personel";
    public String haklar="Tum personel esit haklara sahiptir";
public String izin="tum personel yılda haftada 4 gun izin yapabilir.";


    public void  mesai(){
        System.out.println("Tum personel 5 gun , gunde 8 saat calısır.");
    }

    public void maasHesaplama(){
        System.out.println("tum prsonel 30 gun 8 saat 10 euro :"+30*8*10+" ucret alır");
    }
}
