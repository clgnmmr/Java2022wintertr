package day26_forEachLoop_constructor;

public class C01_ForEachLoop {
    public static void main(String[] args) {

int arr[]={2,4,6,8,11};


        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");

        }
        System.out.println("");

        //for each loop ile yapmak
        //for each loop calışmak için hedef bir collection vermeliyiz

        for (int each:arr){

            System.out.print(each+" ");

        }

        //avantajı :index baslangıc degeri bitiş degeri gibi detaylarla
        //ugraşmamıza gerek kalmadan collections dan tum elementleri bize getirir
        // dezavantaj : index e baglı bir işlem yapamayız



    }
}
