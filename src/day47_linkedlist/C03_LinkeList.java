package day47_linkedlist;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class C03_LinkeList {
    public static void main(String[] args) {


        Deque<Integer> ll1=new LinkedList<>();

       // System.out.println(ll1.element());//bosken kullanırsak excaption fırlatır
        System.out.println(ll1.poll());// bos oldugu icin  null dondurur
        System.out.println(ll1.peek());// bos oldugu icin null dondurur

        //System.out.println(ll1.pop());//NoSuchElementException // ilk element getirir  ve siler listeden

        ll1.push(10);// her elementi listenin başına ekler add() tersi olarak
        ll1.push(20);
        System.out.println(ll1);

        System.out.println(ll1.remove()); // ilk elementi siler ve bize dondurur.
        ll1.push(30);
        ll1.push(40);
        ll1.remove(40); // listedeki index dgil değer girlir ve onu siler
       ll1.add(30);
       ll1.add(60);
       ll1.add(50);
       ll1.add(80);
        System.out.println(ll1);
        ll1.removeLastOccurrence(30);
        System.out.println(ll1);

    }
}
