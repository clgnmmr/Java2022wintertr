package day33_varargs_stringBuilder;

public class C03_StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb1=new StringBuilder();
        StringBuilder sb2=new StringBuilder("java cok guzel");
        StringBuilder sb3=new StringBuilder(10);

        System.out.println("sb1 length :"+sb1.length());
        System.out.println("sb1 capacity :"+sb1.capacity());

        System.out.println("sb2 length :"+sb2.length());
        System.out.println("sb2 capacity :"+sb2.capacity());


        System.out.println("sb3 length :"+sb3.length());
        System.out.println("sb3 capacity :"+sb3.capacity());


        sb1.append("hersey").append(" ").append("java").append(" ").append("guzeldir").append(3).append( true);

        System.out.println(sb1);
        System.out.println("sb1 length :"+sb1.length());
        System.out.println("sb1 capacity :"+sb1.capacity());
        sb1.trimToSize();

        System.out.println("sb1 length :"+sb1.length());
        System.out.println("sb1 capacity :"+sb1.capacity());
    }
}
