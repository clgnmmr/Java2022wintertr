package day04_dataCasting_Increment;

public class C02_AutoWidening {
    public static void main(String[] args) {

        boolean dogrumu=true;
        //String str=dogrumu;//sol string sağ boolean olunca kabul etmez

        byte sayi1= 44 ;
        System.out.println(sayi1);//44


        short sayi2=sayi1;
        //eşitliğin solu short sağı ise byte olmasına ragmen java itiraz etmiyor
        //deger olarak atanan data turu variable data turunda küçük olduğu için sorun yapmaz
        // auto widening

        System.out.println(sayi2);


        double sayi3=sayi2;
        System.out.println(sayi3);



    }
}
