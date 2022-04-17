package day46_itarator_collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C01_Iterator {
    public static void main(String[] args) {


    List<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(7);
        list.add(8);
        list.add(6);
        list.add(9);
        System.out.println(list);

    // for each kullanarak her elementi 2 arttıralım

        for(
    Integer each:list
             )

    {


    }


    Iterator itr = list.iterator();// ıterator mthodunun olusturdugumuz liste objesi
    //uzerinde arrayList classından calıstırıyoruz.

        /*
        ıterator nasıl calısır
        bir iterator objesi olusturmak icin collection uyesi bir obje kulanmalıyız
        yani biiz bu iterator objesini bizim ornegimizde liste objesi uxerinde calısmak icin olusturmus olduk.

        biz iterator objesini olusturdugumuzda iterator collectionin ilk elementinin oncesinde gidip bekler
             [(itr)5, 7, 8, 6, 9]
           itr.hasNext() ==> true    iterator a yanında eleman var mı diye sorar,true veya false dondurur
           itr.next() ====> iterator bir sondraki elementin yanına gecer ve uzerinden atladıgı  elementi bize dondurur.
            [5,(itr) 7, 8, 6, 9] ====> bize 5 dondurur
              itr.next() ====>
             [5, 7,(itr) 8, 6, 9]====> bize 7 dondurur

              itr.remove(); iterator in elinde olan elementi sildi
              dolasıyla ust uste iki kere itr.remove(); kullanılamaz

         */

        System.out.println(itr.hasNext());// true
        System.out.println(itr.next());// 5
        System.out.println(itr.next());//7
        itr.remove();// en son elimde 7 vardı onu siler ve elinde elemen kalmaz.
        System.out.println(list);

}
}
