package day36_inheritance.fabrika;

public class Memur extends Muhasebe {


    public static void main(String[] args) {

        Memur memur1=new Memur();
        //memeur1objesi memur class objesi olmasına ragmen inherantec
        //ettigi muhasebe ve onunda parent olan personel classlarındaki
        //tum daatları alabilir.

       // personel classdan
        memur1.persNo=1001;
        memur1.isim="Ahmet";
        memur1.soyIsim="Tepecik";
        memur1.adres="Sivas";
        memur1.tel="2557632256";

        // muhasebe class ından

        memur1.saatUcreti=10;
        memur1.maas=memur1.maasHesapla();
        memur1.statu="Memur";

        System.out.println(memur1);



        Memur memur2=new Memur();
        memur2.persNo=1002;
        memur2.saatUcreti=20;
        memur2.maas= memur2.maasHesapla();
        System.out.println(memur2);
    }


    @Override
    public String toString() {
        return "Memur{" +
                "saatUcreti=" + saatUcreti +
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
