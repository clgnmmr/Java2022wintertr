package day25_list;

import java.util.ArrayList;
import java.util.List;

public class C08_ListedeElemanlarınYeriniDegistirme {
    public static void main(String[] args) {
        // Verilen bir listede, istenen iki index'deki elementlerin yerini
        // kalici olarak degistiren bir method olusturun
        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(1);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(6);
        sayilar.add(1);
        sayilar.add(7);
        int ilkIndex=4;
        int ikinciIndex=0;

        sayilar= swapElements(sayilar,ilkIndex,ikinciIndex);

        System.out.println(sayilar);
    }
    public static List<Integer> swapElements(List<Integer> sayilar, int ilkIndex, int ikinciIndex) {
        // bir tem sayi olusturup
        // verilen indexlerdeki sayilari yer degistirin
        // indexleri kontrol edip sinirin otesinde index verildiyse uyari mesaji yazdirin

                  List<Integer> yeniList = new ArrayList<>();

        if ((sayilar.size()>ilkIndex && ilkIndex>=0)  &&      (sayilar.size()>ikinciIndex && ikinciIndex>=0) ){

            if (ilkIndex<ikinciIndex) {
                yeniList.add(sayilar.remove(ilkIndex));
                yeniList.add(sayilar.remove(ikinciIndex - 1));


                sayilar.add(ilkIndex, yeniList.remove(1));
                sayilar.add(ikinciIndex, yeniList.remove(0));

            }else if (ilkIndex>ikinciIndex){

                yeniList.add(sayilar.remove(ilkIndex));
                yeniList.add(sayilar.remove(ikinciIndex ));

                sayilar.add(ilkIndex-1, yeniList.remove(1));
                sayilar.add(ikinciIndex, yeniList.remove(0));


            }else System.out.println("aynı indexler yer değiştirilemez");



        }else
            System.out.println("girdiginiz indexlerden biri ve ya ikisi değişiklik yapılacak listenin indexleri sınırları içerisinde değildir");



        return sayilar;


    }
}
