package day27_constructor;

public class Z {

    String isim;
    String soyIsim;
    int numara;
    boolean gercekMi;


    public Z(String name, String sName, int no, boolean grc) {

        isim = name;
        soyIsim=sName;
        numara=no;
        gercekMi=grc;

    }

    public Z(String isim,String soyIsim,int numara){
        this.isim =isim;
        this. soyIsim = soyIsim;
        this. numara = numara;
//burda aynı isimler olunca karşısına this bu demek gerekir.
    }




    public String toString() {


        return("Isim :"+isim+", Soyisim :"+soyIsim+", Numara :"+numara+", gercekmi :"+gercekMi);
    }


}
