package day04_dataCasting_Increment;

public class C04_ExplicitNarrowing {
    public static void main(String[] args) {


        int sayi1=879;
        double sayi2=10;

        double sayi3=sayi1/sayi2;
        System.out.println(sayi3);

        int sayi4=(int) (sayi1/sayi2);// böyle yaparak data kaybının sorumluluğu üstümüze alınır ama normalde
                                     // int=double olmaz ,int=int
        //int sayi4= sayi1/ (int) sayi2);
        System.out.println(sayi4);

        int sayi5=140;
       // byte sayi6=sayi5 // sağ taraftki intbüyüktür byte dan

        byte sayi6=(byte) sayi5;

        System.out.println(sayi6);//burda byte en fazla 127 gider (byte -127,128arasında) bundan sonra -128den başlar
        // ve ekler sonuç -116 olur

    }



}
