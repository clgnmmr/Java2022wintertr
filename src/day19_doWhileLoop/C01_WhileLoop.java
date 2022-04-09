package day19_doWhileLoop;

public class C01_WhileLoop {
    public static void main(String[] args) {
//Kullanicidan bir sayi alin ve bu sayiyi tam bolen sayilari ve toplam kac tane olduklarini ekranda yazdirin


        int input=30;

        //forloop ilede yapabiliriz
        //while loop ile yapacagız

        int bolen=1;
        int sayac=0;

        while(bolen<=input){

            if (input%bolen==0){
               System.out.print(bolen+" ");//burda sayıyı bolen sayıları yazdırmış oluruz
                sayac++;
            }
bolen++;
        }
        System.out.println("");
        System.out.println(input+" sayısını bolen  "+sayac+"  adet sayı vardır");



    }
}
