package day27_constructor;

public class Toyota {

    String marka="Toyota";
    int tekerAdedi=4;
    boolean motoruVarMi=true;
    String model;
    String yakit;
    int yil;

    public void maxHiz(){
        if (yakit.equals("Benzin")){

            System.out.println("Benzinli araclar max 240 km/saat hız yapar");

        }else if (yakit.equals("Dizel")){

            System.out.println("Dizel araclar max 260 km/saat hız yapar");

        }


    }
    public void renkTercihleri(){
        if (model.equals("Coralla")){
            System.out.println(" Corolla renk secenekleri kirmizi ve beyaz ");
        }else if (model.equals("Yaris")){

            System.out.println("Yaris ren secenekleri mavi ve sari ");
        }


    }

}
