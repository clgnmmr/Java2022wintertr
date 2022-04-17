package day44_interface;

public interface C01_Interface {
    /*
     tam soyutlama full abstraction olusturmak istersek abstract classları degil interface kullanırız

     */
    public static final int sayi=20;


     default void a(){

         System.out.println("yazılır ");
     }

}
