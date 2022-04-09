package day07_ıfElseStatements;

import java.util.Scanner;

public class C08_HaftanıngunlarıIfElseIf {
    public static void main(String[] args) {

        //Soru 3) Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
        //  Ornek:  gun=Pazar output = “Hafta sonu”
        // gun=Sali output = “Hafta ici”
        // *** String icin equals method’unu kullanin

        //pazar veya cumartesi ise ===>haftasonu
        //pazartesi veya sali veya çarşamba veya perşembe veya cuma ise===>hafta içi

        Scanner scan=new Scanner(System.in);

        System.out.println("lütfen gün ismini yazınız");

        String gunIsmi= scan.next().toLowerCase();

        if (gunIsmi.equals("pazar")||gunIsmi.equals("cumartesi")){

            System.out.println("girdiğiniz gün  : hafta sonu");

            if (gunIsmi.equals("pazar")){

              System.out.println( "girdiğiniz gün : 7. gundur");

          }else{

              System.out.println("girdiğiniz gün : 6. gundur");}

        }else if (gunIsmi.equals("pazartesi")||gunIsmi.equals("salı")||
                gunIsmi.equals("carsamba")||gunIsmi.equals("persembe")||
                gunIsmi.equals("cuma")){


            System.out.println("girdiğiniz gün hafta ici");

            if (gunIsmi.equals("pazartesi")){

                System.out.println("girdiğiniz gun \n 1.\t gundur");
            }
            else if (gunIsmi.equals("salı")){
                System.out.println("girdiğiniz gun : 2. gundur");
            }
            else if(gunIsmi.equals("carsamba")){
                System.out.println("girdiğiniz gun : 3. gundur");
            }
            else if(gunIsmi.equals("persembe")){
                System.out.println("girdiğiniz gun : 4. gundur");

            }
            else {
                System.out.println("girdiğiniz gun : 5. gundur");
            }

        }else{
            System.out.println("lütfen gecerli bir gun ismi giriniz");

        }
        //eger if else if .... statement else ile bitiyorsa
        //olosılıklardan sadece bir tanesi mutlaka calisir
        //java ilk bulduğu true a ait sonucu yazdırır
        //ve kalan sonuclara bakmaz

        //if else if .... cumleleri else ile bitiyorsa
        //olasılıklardan saddece bir tanesi mutlaka calisir


    }
}
