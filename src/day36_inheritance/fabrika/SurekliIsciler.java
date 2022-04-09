package day36_inheritance.fabrika;

public class SurekliIsciler extends Isci {
    public static void main(String[] args) {



        SurekliIsciler surIsc1=new SurekliIsciler();
        surIsc1.persNo=5001;
        surIsc1.isim="Cem";
        surIsc1.soyIsim="Akay";
        surIsc1.statu="Isci";
        surIsc1.saatUcreti=12;
        surIsc1.maas= surIsc1.maasHesapla();
        System.out.println(surIsc1);

    }

    @Override
    public String toString() {
        return "SurekliIsciler{" +
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
