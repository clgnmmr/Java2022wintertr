package day46_itarator_collections;

import java.util.Scanner;

public class Main {
    public static String SearchingChallenge(String str) {
        // code goes here
        String str1="";
        int count=0;
        for(int i=0 ; i<str.length() ; i++){
            for(int j=i+1 ; j<str.length(); j++){
                if(str.charAt(i)==str.charAt(j)) {
                    count++;
                }
            }
            if(count>=2){

                str1+=str.substring(i,i+1);
            }


        }




        return str1;
    }


    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(SearchingChallenge(s.nextLine()));
    }



}
