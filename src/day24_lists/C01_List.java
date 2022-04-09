package day24_lists;

import day23_multiDimensionalArrays.C06_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_List {
    public static void main(String[] args) {


        int [] arr={};

        //bu arraye  ekleyelim


        arr= C06_Arrays.arrayeElemanEkle(arr,5);

        System.out.println(Arrays.toString(arr));//5

        arr= C06_Arrays.arrayeElemanEkle(arr,3);

        System.out.println(Arrays.toString(arr));//3

       //bir list oluşturalım


        List<Integer> sayılarList=new ArrayList<>();
        System.out.println(sayılarList);// []



        sayılarList.add(5);// [5]
        sayılarList.add(3);// [5,3]
        sayılarList.add(0,7);// [7,5,3]
        sayılarList.add(2,7);//[7,5,7,3]
        System.out.println(sayılarList);//[7,5,7,3]






    }

}
