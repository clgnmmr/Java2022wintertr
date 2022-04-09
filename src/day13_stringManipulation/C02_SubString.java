package day13_stringManipulation;

public class C02_SubString {
    public static void main(String[] args) {

        // 1-48 of 104 results for "nutella"
        //bu aramada sonucundaki bulunan sonuc sayısı 100 den cok ıse yarar
        //az ise "az sonuc bulundu

        String str="1-48 of 7000 results for \"nutella\"";// 104 be kadr artarsa artsın ona göre sonuc verecektir

        int ilkSpace=str.indexOf(" "); //4
        int ikinciSpace=str.indexOf(" ",ilkSpace+1);
        int ucuncuSpace=str.indexOf(" ",ikinciSpace+1);


        String aramaSonucSayisiStr=str.substring(ikinciSpace+1,ucuncuSpace);//104

        System.out.println(aramaSonucSayisiStr);

        int aramaSonucSayisiInt=Integer.valueOf(aramaSonucSayisiStr);//artık elimizde 104 var sayı olarak


        if (aramaSonucSayisiInt>100){
            System.out.println("Super");

        }else System.out.println("az sonuc bulundu");


    }
}
