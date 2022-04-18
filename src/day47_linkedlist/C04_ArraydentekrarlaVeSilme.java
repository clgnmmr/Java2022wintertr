package day47_linkedlist;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C04_ArraydentekrarlaVeSilme {
    public static void main(String[] args) {
        /*
        verilen bir araydan tekrar eden bir lementleri silip
          unique elemenler olasan bir array donduren bir method yazın
         */
        int arr[]={3,5,4,6,3,1,2,7,8,6,1,4,2,8};

      arr=  benzersizYap(arr);
        System.out.println(Arrays.toString(arr));

    }

    private static int[] benzersizYap(int[] arr) {
        Set<Integer> set = new HashSet<>();
        /*
        Set<Integer> set = new TreeSet<>();  doğal sıralama buyuzden sırlar veririr.
        sette index yapısı yoktur bu yuzden for loop yerine for each loop kullanılabilir.
         */

        for (Integer each : arr) {

            set.add(each);
        }
        int [] arrBenzersiz=new int[set.size()];
        int index = 0;

        for (Integer each:set
             ) {
            arrBenzersiz[index] = each;
            index++;
        }


        return arrBenzersiz;
    }

}
