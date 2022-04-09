package day33_varargs_stringBuilder;

public class C06_StringBuilder {
    public static void main(String[] args) {


        StringBuilder sb1=new StringBuilder("Prize Dikkat");


        System.out.println(sb1.insert(12," Ediniz"));// Prize DikkatEdiniz
        String str="hayatta cok guzel seyler var.";
        System.out.println(sb1.insert(0,str,0,8));// hayatta Prize DikkatEdiniz

        System.out.println(sb1.reverse());// culeyi tersten yazdırırır
        System.out.println(sb1.reverse());// culeyi tersten yazdırırır.geri duzeldi

        System.out.println(sb1.equals(str));
        System.out.println(sb1);
        System.out.println(sb1.substring(1,3));
        System.out.println(sb1);

    }
}
