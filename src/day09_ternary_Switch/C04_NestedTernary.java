package day09_ternary_Switch;

public class C04_NestedTernary {
    public static void main(String[] args) {

        //verilen sayının pozitifmi ne gativ mi olduğunu kontrol edip
        //0 veya pozitif sayı ise tek veya cift
        // negatif sayı ise -100 den büyük veya kucuk
        //oldugunu belirleyen bir ternary yazınız
        int sayi=20;// scanner ypmak yerine kullanıcıdn almış gibi yaparak hızlı kod yazıyoruz


        if (sayi>=0){
            if (sayi%2==0){
                System.out.println("sayi pozitif cift sayi");
            }else{
                System.out.println("sayi pozitif  tek sayi");

            }




}
        else {
            if (sayi < -100) {
                System.out.println("sayi -100 den kucuk negatif sayi");

            } else {
                System.out.println("sayi -100 den buyuk negatif sayi");
            }

        }



        String sonuc=sayi>=0 ?
                              (sayi%2==0?"pozitif cift sayi":"pozitif tek sayi"):
                                                                                 (sayi<-100?"-100 den kucuk negatif sayı":"-100 den büyük negatif sayi" );
        System.out.println(sonuc);
        // bu sistem parentezler kalktıgındada calısır ama cozebilmek ıcın ugraştırır: parentezler daha okunaklı yapar
    }
}
