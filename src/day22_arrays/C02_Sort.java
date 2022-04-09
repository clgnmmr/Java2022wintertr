package day22_arrays;

public class C02_Sort {
    public static void main(String[] args) {
        //verilen bir arrayde en kucuk ve enbuyuk degerleri yazdırın


        int arr[]={3,5,6,1,9,0,45,25,4,9,0};


        //sort methodu olmadan yapalım

        int enKucukSayi=Integer.MAX_VALUE;

        int enBuyukSayi=Integer.MIN_VALUE;

        for (int i = 0; i <arr.length; i++)  {

            if (arr[i]<enKucukSayi){
                enKucukSayi=arr[i];
            }
            if (arr[i]>enBuyukSayi){
                enBuyukSayi=arr[i];
            }
        }
        System.out.println("arraydaki en kucuk sayı :"+enKucukSayi);
        System.out.println("arraydaki en buyuk sayı :"+enBuyukSayi);


    }
}
