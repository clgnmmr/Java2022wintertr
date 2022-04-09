package day26_forEachLoop_constructor;

import java.util.ArrayList;
import java.util.List;

public class C02_ForEackLoop {
    public static void main(String[] args) {

        //10 elementli bir list oluşturalım
        int arr[]={1,2,3,4,5,6,7,8,9,10};

        List<Integer> arrList = new ArrayList<>();

        for (int each:arr){
            arrList.add(each);
        }
        System.out.println(arrList);

        //sayılar listesinde 3 e bolunemeyen sayıları yazdıralım
        //for each loop ile


        for (int each :arrList){

            if (each%3!=0) {

                System.out.print(each + " ");
            }
        }






    }
}
