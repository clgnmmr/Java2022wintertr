package day48_collections;

import java.util.HashSet;
import java.util.Set;

public class C02_Hash {
    public static void main(String[] args) {

        String str="Java cok guzel";

        System.out.println(str.hashCode());


        String str2="Hava cok guzel";

        System.out.println(str2.hashCode());


        Set<Integer> set = new HashSet<>();

        set.add(100);
        System.out.println(set.hashCode());
        set.add(10);
        System.out.println(set.hashCode());


    }


}
