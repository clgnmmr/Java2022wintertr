package day08_ifElseIfStatement;

import java.util.Scanner;

public class C01_IfElseStatements {
    public static void main(String[] args) {

        //girilen bir karekterin,harf olup olmadığını bulLILM

        Scanner scan =new Scanner(System.in);

        System.out.println("lütfen bir karekter giriniz");

        char karekter=scan.next().charAt(0);


        if (karekter>='A'&& karekter<='Z'|| karekter>='a' && karekter<='z'){
            System.out.println("girdiğiniz karekter bir harf");


        }else {
            System.out.println("girdiğiniz karekter bir harf değil");
        }




    }


}
