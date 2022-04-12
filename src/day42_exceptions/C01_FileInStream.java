package day42_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C01_FileInStream {
    public static void main(String[] args) {


        String dosyaYolu="src/day41_exceptions/Dosya";


        try {
            FileInputStream fis=new FileInputStream(dosyaYolu);
            int k=0;
            while (  (k=fis.read())   !=-1){
                System.out.print((char)k);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        /*
        } catch (IOException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
         */
        /*
        eger parent child iliskisi varsa sadece parent exception yazabiliriz
        yada once child exception yazılır sonra parent exception yazılır

         */
        /*

        exception lar icinde parent child iliskisi mevcuttur.
        eger bir kod icin birden fazla exception olusma ihtimali varsa
        oncelikle olası exception lar parent-child iliskisi tasıyor mu bakmamız gerekir
        eger parent child iliskisi yoksa
         */


    }
}
