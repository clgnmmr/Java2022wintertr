package day23_multiDimensionalArrays;

public class C03_MDArrays {
    public static void main(String[] args) {
        //boyutları belirli bir arrayi elementleri girmeden oluşturalım
        //bir okulda 24 öğrenci olan 8 sınıf vardır


        int arr[][]=new int[8][24];


        //bir ilçede herbirinde 24 öğrencili 8 sınıflı 5 okul vardır

        int ilce[][][]=new int[5][8][24];

        //bir okulda 3 tane 24 kişilik,2 tane 22 kişil sınıf vardır

        int sınıf24[][]=new int[3][24];
        int sınıf22[][]=new int[2][24];

        //oluştururken  elementleri atama yaparsak farklı uzunlukta inner farklı arrayler tanımlayabiliriz

        int arr1[][]={{3,2,4},{5,6}};






    }
}
