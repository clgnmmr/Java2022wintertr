package day04_dataCasting_Increment;

public class C03_Casting {
    public static void main(String[] args) {


        int sayi1=8;
        int sayi2=4;
        System.out.println(sayi1/sayi2);

        sayi2=3;

        System.out.println(sayi1/sayi2);

        sayi1=22;
        System.out.println(sayi1/sayi2);
    // java int sayı bbirbirine bölerse int olarak verir
        //eğer , den sonra küsürat varsa siler

        sayi1=4786;
        sayi2=10;

        sayi1=sayi1/sayi2;
        System.out.println(sayi1);
        sayi1=sayi1/sayi2;
        System.out.println(sayi1);
        sayi1=sayi1/sayi2;
        System.out.println(sayi1);

        sayi1=4895;
        double sayi3=10;

       //sayi1=sayi1/sayi3; // java iki farkı sayı data türürnü iişleme koyduğumuzda java küçük olan data türü iiçin
                          //autoweiting yapar.sağ taraf int,soltaraf double olur buda hata verir

        System.out.println(sayi1/sayi3);
        System.out.println(sayi3/sayi1);


    }


}
