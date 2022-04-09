package day15_methodCreation;

public class C07_MethodCreation {
    public static void main(String[] args) {



        //stringi yazdıran bir method oluşturalım
        // stringyazdır(str);
        // hosgeldiniz diyen bir method oluşturun
        //  hosgeldinyazdır();
        // kapanma mesajı yazan bir method oluşuralım
        //  kapanmaMethodu();

       hosgeldinyazdır();


      // stringyazdır("Java gun gectikce guzellesiyor");
      // kapanmaMethodu();
/*
burda method içine bazı ethodları kullandıgımızda birbirini kullanır ve tek methodla istediğin herşeyi yazdırabiilirsin

 */

    }

    private static void kapanmaMethodu() {
        System.out.println("Bizi tercih ettiginiz icin tesekkur ederiz");
    }

   public static void hosgeldinyazdır() {
        System.out.println("Hosgeldin");
        stringyazdır("Boylede olur");
    }

    private static void stringyazdır(String str) {
        System.out.println(str);
        kapanmaMethodu();
    }
}
