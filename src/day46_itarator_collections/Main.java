package day46_itarator_collections;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static String SearchingChallenge(String str) {
        // code goes here
        String [] arr=str.split(" ");
        System.out.println(Arrays.toString(arr));
        String str1="z";
        int count=0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length() ; j++) {
                for (int k = 0; k <arr[i].length(); k++) {
                    if (arr[i].charAt(j)==arr[i].charAt(k)) {
                        count++;


                    }

                }
                if (count ==2){
                   if (str1.charAt(0)>arr[i].charAt(j)){
                       str1= arr[i].substring(j,j+1);
                        str=arr[i];
                   }

                }

                count=0;
            }

        }




        return str;
    }


    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(SearchingChallenge(s.nextLine()));
    }



}
