package day18_nestedIfForLoop;

public class C01_ForLoop {
    public static void main(String[] args) {

        //kullanıcan bir rakam alıp çarpım tablosu oluşturalım

        int input=3;

        int sayi=1;
        float a=sayi;


        //1 2 3
        // 2 4 6
        //3 6 9
       for (int i=1; i<=input; i++){
           for (int j=1; j<=input; j++){

               System.out.print((i*j)+ " ");
           }
           System.out.println("");//satıra asagıya taşıyacak
       }

    }
}
