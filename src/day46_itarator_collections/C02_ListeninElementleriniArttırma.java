package day46_itarator_collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class C02_ListeninElementleriniArttırma {
    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(7);
        list.add(8);
        list.add(6);
        list.add(9);
        System.out.println(list);

        /* //listenin tum elemenlerini bize getirmesi icin

        iteratorun hsNext be next() methodlarını beraber kullanacaguz
         */

        ListIterator itr=list.listIterator();

        while (itr.hasNext()){// yanında element oldugu müddetce calısacak

           Object sayi= itr.next();
            itr.set((Integer)sayi+3);
            //itr.set((itr.next()) + 3);
        }

        System.out.println(list);

    }
}
