package day24_lists;

import java.util.ArrayList;
import java.util.List;

public class C02_Remove {
    public static void main(String[] args) {


        List<String> isimler=new ArrayList<>();

        isimler.add("aykut");
        isimler.add("ali");
        isimler.add(2,"fatma");
        isimler.add("kadir");

        System.out.println(isimler);

        isimler.remove("kadir");// true //bunun doğru oldugunu anlamak için bir boolean data türüne atayarak yazdırabiliriz
        System.out.println(isimler);
        System.out.println(isimler.remove(2));

    }
}
