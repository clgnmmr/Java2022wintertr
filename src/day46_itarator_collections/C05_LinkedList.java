package day46_itarator_collections;

import java.util.LinkedList;

public class C05_LinkedList {
    public static void main(String[] args) {
        //hem list hemde queue nun childidır.

        LinkedList<Integer> list = new LinkedList();
        list.add(0);
        list.add(10);
        list.addFirst(5);
        list.addLast(12);
        System.out.println(list);
    }
}
