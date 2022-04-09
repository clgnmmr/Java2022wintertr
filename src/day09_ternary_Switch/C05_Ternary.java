package day09_ternary_Switch;

public class C05_Ternary {
    public static void main(String[] args) {
        // bazen ternary iki sonucun data turlerifarkılı olabilir




        int sayi=50;
        //ternary bize sonuc getirdiğinden ya sonucu direk yazdırmalıyız
        // veya bir degişgene atamalıyız
        //eger sonuclar farklı data turlerinde ise
        //atama yapacağımız variabledata turu tk olacagından
        //atama yapamayız
        //sadece dırek yazdırbiliriz

        System.out.println(sayi > 100 ? sayi * sayi : "sayı 100 den buyuk olmalı");
    }
}
