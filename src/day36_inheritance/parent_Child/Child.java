package day36_inheritance.parent_Child;

public class Child extends Parent {


    Child(){
        super();

        System.out.println("Chid cons. calısti");
    }

    // tum class larda biz gormasek bile javanın olusturdugu default constructur.vardır.


    //Extends keyword kulanan  classlardaki
    // tum constructor ların ilk satırında biz görmesek bile

    /* super()*/

    // constructor call vardır
    //yani parent clasın parametresiz constructor call = super() methodu
    public static void main(String[] args) {

        Child child=new Child();


    }
}
