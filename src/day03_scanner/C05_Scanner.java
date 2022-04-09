package day03_scanner;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("lütfen çemberin yarıçapını giriniz");
        double yarıCap= scan.nextDouble();
        System.out.println("giridiğiniz yarıçap:" + yarıCap);
        System.out.println("cemberin çevresi:" +2*3.14*yarıCap);
        System.out.println("dairenin alanı :" + 3.14*yarıCap*yarıCap);
    }
}
