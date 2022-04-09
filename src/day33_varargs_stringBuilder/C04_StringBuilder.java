package day33_varargs_stringBuilder;

public class C04_StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb1=new StringBuilder("yasasın java");
        System.out.println(sb1.indexOf("java"));//8
        System.out.println(sb1.lastIndexOf("s"));//4


        System.out.println(sb1.replace(0,7,"ne guzel"));//ne guzel java

        System.out.println(sb1);// ne guzel java
        //atama yapılmsa bile yapılan işlemleri atama yapar mutable

        System.out.println(sb1.toString().toUpperCase());

    }
}
