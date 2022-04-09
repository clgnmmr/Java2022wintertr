package day27_constructor;

public class ZRunner {
    public static void main(String[] args) {

        Z obj1=new Z("Kadir", "Tepecik",62434,true);

        System.out.println(obj1);

        Z obj2=new Z("kadir","tepecik",3254);
        System.out.println(obj2);


        Z obj3=new Z("TEPECİK","KADİR",55);

    }



}
