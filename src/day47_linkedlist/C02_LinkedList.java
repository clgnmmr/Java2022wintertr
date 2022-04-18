package day47_linkedlist;

import java.util.Deque;
import java.util.LinkedList;

public class C02_LinkedList {

    /*
    listten gelen ozellikleri biliyoruz onun icin dequeden gellen ozelliklere bakalım.
     */
    public static void main(String[] args) {

        Deque<Integer> ll1=new LinkedList<>();

        ll1.addFirst(10);// bsa element ekler
        ll1.addLast(20);// sona element ekler
        System.out.println(ll1);
        System.out.println(ll1.element());// ilk elementi getirir. ama listeden cıkarmaz.//yoksa exceptions fırlatır

        System.out.println(ll1.getLast());// son elementi silmeden bizze dondurur

        System.out.println(ll1.getFirst());

        ll1.offer(30);
        ll1.offerLast(50);
        ll1.offerFirst(40);
        System.out.println(ll1);
        System.out.println(ll1.peek());//ilk element donduuryor,bulamazsa null donduruyor.

        ll1.poll();


    }

}
