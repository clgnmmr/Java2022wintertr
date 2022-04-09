package day12_stringManipulation;

import java.util.Scanner;

public class C05_replaceAll {
    public static void main(String[] args) {

        //kullanıcıdan isim soy isim bilgisini alıp
        //butun harfleri * yapalım

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen isim ve soyisim yaziniz");
        String isimSoyisim=scan.nextLine();
        System.out.println(isimSoyisim.replaceAll("\\S","*"));


}
}
