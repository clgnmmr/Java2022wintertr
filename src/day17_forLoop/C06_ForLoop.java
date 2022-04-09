package day17_forLoop;

public class C06_ForLoop {
    public static void main(String[] args) {

// verilen iki harf ve aralarindaki harfleri yazdiran
// bir kod yaziniz

    char ilfHarf='c';
    char sonHarf='s';

    for (char i=ilfHarf;i<=sonHarf;i++){
        System.out.print(i+" ");
    }


    double baslangic=10;
    double bitis=20;
    double artis=0.2;

    for (double i=baslangic;i<bitis; i+=artis){
        System.out.print(i +" ");

    }

    }
}
