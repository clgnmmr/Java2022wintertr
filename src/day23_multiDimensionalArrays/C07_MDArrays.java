package day23_multiDimensionalArrays;

import java.util.Scanner;

public class C07_MDArrays {
    public static void main(String[] args) {
        //Soru 5) Kullanicidan bir cumle isteyin ve cumledeki kelime sayisini yazdirin


        Scanner scan=new Scanner(System.in);


        System.out.print("lutfen bir cümle giriniz :");
        String cümle=scan.nextLine();


        String arr[]=cümle.split(" ");

        System.out.println("girdiginiz cumledeki kelime sayısı :"+arr.length);
    }
}
