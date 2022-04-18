package day47_linkedlist;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class C01_LinkedList {
    public static void main(String[] args) {
        /*
        linkedlist in iki tane parent interface vardır.
        Linked list oluştururken data turu olarak;
        Linkedlist secersek iki parenttaki tum methodlar kullanılabilr.

        list secilistrse sedace list interfaceindeki methodlar

        deque/Queue secersek : deque deki methodları kullanabilirz.
         */

        LinkedList ll1 = new LinkedList();
        ll1.add("kadir");


        List<String> ll2=new LinkedList<>();

        ll2.add("l");
        ll2.remove(0);


        Deque<String> ll3=new LinkedList<>();

        ll3.add("f");
        ll3.addFirst("kk");











    }
}
