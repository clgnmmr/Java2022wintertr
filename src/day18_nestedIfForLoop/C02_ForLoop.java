package day18_nestedIfForLoop;

public class C02_ForLoop {
    /*Soru 12 ) Kullanicidan pozitif bir rakam girmesini isteyin ve girilen rakama gore asagidaki sekli cizdirin
     *
     * *
     * * *
     * * * *

     */
    public static void main(String[] args) {


                int input=5;

                for (int i=1; i<=input; i++){

                    for (int j=1; j<=i; j++){

                        System.out.print("* ");
                    }

                    System.out.println("");
                }



    }

}
