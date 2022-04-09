package day37_inheritance_constructor;

import day36_inheritance.parent_Child.Parent;

public class Child extends Parent {
    /*
    bir class bir child class yaptıgımızd parent clastaki constructor a
    ulasması gerekir bu durumda parent clastaki constructor un
     accsess modifier ugun bir modifier yapılmalıdır.

     */

    Child(){
        super();

        System.out.println("chid class parametresiz cons");

    }
    Child(int s){
        //tum child class taki tum constructorların ilk satırına yerlestirdigi
        //     javanın yerlestirigi constructor parametresizdir yani
        //
        //     super();
        System.out.println("Child class parametreli cons.");
    }
    Child(int sayi1,int sayi2){
        /*
        eger  parent classtan parametresiz contructor caımasın istersek
        super in icine parametre yerlestirerek
        parentdaki parametreli constructor calıstırmız oluruz.
         */
        super(sayi1,sayi2);
        System.out.println("ikiparametreli child constructor");
    }

    public static void main(String[] args) {
        Child child = new Child();
        Child child1 = new Child(5);
        Child chil2=new Child(6,8);

    }



}
