package day36_inheritance.fabrika;

public class Ustabasi extends Isci {
    public static void main(String[] args) {
        Ustabasi ustabasi1=new Ustabasi();

        ustabasi1.saatUcreti=15;
        ustabasi1.isim="Ali";
    ustabasi1.soyIsim="Gokcek";
    ustabasi1.maas= ustabasi1.maasHesapla();
       ustabasi1.isciStatu="Usta";
        System.out.println(ustabasi1);

    }

    @Override
    public String toString() {
        return "Ustabasi{" +
                "isciStatu='" + isciStatu + '\'' +
                ", saatUcreti=" + saatUcreti +
                ", statu='" + statu + '\'' +
                ", maas=" + maas +
                ", persNo=" + persNo +
                ", isim='" + isim + '\'' +
                ", soyIsim='" + soyIsim + '\'' +
                ", adres='" + adres + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }
}
