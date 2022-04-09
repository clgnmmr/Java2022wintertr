package day07_ıfElseStatements;

public class C02_IfStatements {
    public static void main(String[] args) {


        int a=10;
        int b=20;


        if (a<b && b<100){
            System.out.println("isteğiniz gerçekleşecek");
            System.out.println("body içindeki tum kodlar çalışır");
         }
        if (a>0) System.out.println("suslu parentez olmazsa sadece bir satır çalışır");//bu şekildede kod çalışır ama çalışır mı çalışmazmm belli değil

        System.out.println("ikinci satırda çalıştı");
       }
    }
