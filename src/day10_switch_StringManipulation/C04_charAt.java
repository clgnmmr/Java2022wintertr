package day10_switch_StringManipulation;

public class C04_charAt {
    public static void main(String[] args) {

        //stringde herhangibir karekteri almak istedgimizde o harfi indeksni kullanarak
        //str.charat(istenenindex) yazabiliriz

        String str1="Java Cok Guzel";


        //J yi yazdıralm

        System.out.println(str1.charAt(0));
        // g yiyazdıralım
        System.out.println(str1.charAt(9));

        //va yazdıralım
        System.out.println(""+str1.charAt(2)+str1.charAt(3));

        //cOK seklinde yazdırın

        System.out.println(""+str1.toLowerCase().charAt(5)+str1.toUpperCase().charAt(6)+str1.toUpperCase().charAt(7));

        //son harfi yazdır
        //string de 14 harf var ,son harfin indeksi 14-1 dir
        System.out.println(str1.charAt(14-1));//uzunluk -1
        System.out.println(str1.charAt(str1.length()-1));









    }
}
