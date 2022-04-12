package day41_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C02_FileInputStream {
    public static void main(String[] args)  {
        /*
        bir code yazılırken olasi exception lar on gorulup exception olustugunda javanın ne yapması istedeigimiz
        belirtilmelidir
        1-eger exception calıstıgında kodun calısmasını ıstemıyorsak
        method isminin yanına olusabilecek exceptionu ddeklare edebilir
        2-eger exception olussada kodun calısmasını devam etmesini istiyorsak
        sorun olusturabilecek kodu try catch blogunun icine alır

        tyr bloguna sorun cıkabilecek kodu yazarız
        catch excepton durumunda javanın ne yapmasi isdegimizi yazabilirz
         */
        String dosyaYolu="src/day40_exceptions/Dosya";


        try {
            FileInputStream fis=new FileInputStream(dosyaYolu);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
