package day21_arrays;

import java.util.Arrays;

public class C01_Arrays {
    public static void main(String[] args) {
        // array i nasıl deklere ederiz
        //data türü,arrayin ismi ve koseli parentez yazarak aray deklare edilir


        int arr[]={1,2,3};//boyle arrays olarak kabul eder
        int[] arr2={1,2,3};
        int  [] arr3={1,5,25};

        double arr4[]= {10.2, 25, 3.5};

        String [] arr5={"ali","ahmet","n"};

        String [] arr7;

        arr7= new String[]{ "1"};
        //kullanmadan önce mutlaka değer ataması yapmamız gerekir

        System.out.println(Arrays.toString(arr7));

        int arr8[]=new int[5];//java icinde 5 tane default deger lolan bir arrays oluşturur
                                // [0,0,0,0,0]
        arr8= new int[3];



    }
}
