package day41_exceptions;

public class C01_Exceptions {
    public static void main(String[] args) {
        int a=10;
        int b=0;
        int c=0;

        try {
            c=a/b;
        } catch (Exception e) {
            /*
            burada yazdıgımız e javanın atayacağı exception objesi ismidir.
             */
            e.printStackTrace();
            System.out.println(e.getMessage()+"\n"+e.toString());
        }
        System.out.println(c);

    }

}
