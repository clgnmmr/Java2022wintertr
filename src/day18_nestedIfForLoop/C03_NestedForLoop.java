package day18_nestedIfForLoop;

public class C03_NestedForLoop {
    public static void main(String[] args) {
        /*

         *
         * *
         * * *
         * * * *
         * * * * *
         * * * *
         * * *
         * *
         *


         */ //bu şekli for loop ile gösterebiliriz

        int input=6;
        for (int i=1; i<=input; i++){

            for (int j=1; j<=i; j++){

                System.out.print("* ");
            }

            System.out.println("");
        }

        for (int i=1; i<=input-1; i++){

            for (int j=1; j<=input-i; j++){

                System.out.print("* ");
            }

            System.out.println("");
        }



        for (int i = 1; i <= input; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        for (int i = 1; i <= input-1; i++) {
            for (int j = 1; j <= input - i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }


    }
}
