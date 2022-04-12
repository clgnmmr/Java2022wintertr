package day42_exceptions;

import java.util.Scanner;

public class C03_IllegalArgumentException  {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int yas=scan.nextInt();

        if (yas<=0 || yas>120 ){
            //System.out.print("Lutfen gecerli bir yas giriniz :");
            throw new IllegalArgumentException();
        }else System.out.println("uygun yas giridniz tesekkurler :");
    }
}
