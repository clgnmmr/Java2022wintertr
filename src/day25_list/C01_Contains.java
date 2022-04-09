package day25_list;

import java.util.ArrayList;
import java.util.List;

public class C01_Contains {
    public static void main(String[] args) {


        List<String> harfler=new ArrayList<>();

        harfler.add("D");
        harfler.add("M");
        harfler.add(1,"K");
        harfler.add(0,"T");

        System.out.println(harfler);

        System.out.println(harfler.contains("T"));//var mı yok diye sorar boolean olara döner


        List<String> karakterler= new ArrayList<>();

        karakterler.add("M");
        karakterler.add("T");

        System.out.println(harfler.containsAll(karakterler));//true
        karakterler.add("F");

        System.out.println(harfler.containsAll(karakterler));//false



    }
}
