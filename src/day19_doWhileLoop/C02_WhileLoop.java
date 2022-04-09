package day19_doWhileLoop;

public class C02_WhileLoop {
    public static void main(String[] args) {

        //kullanıcıdan bir sayı alın ve bu sayının rakamları toplamını yazdırınız



        int input=785692;
        int rakam=0;
        int rakamlartoplamı=0;

        while (input>0){
            rakam=input%10;
            System.out.print(rakam+" ");

            rakamlartoplamı+=rakam;
            input/=10;

        }
        System.out.println("");
        System.out.println(rakamlartoplamı);//lopp içinde yazarsan her seferinde toplamı yapar





    }
}
