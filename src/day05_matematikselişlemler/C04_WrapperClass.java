package day05_matematikselişlemler;

public class C04_WrapperClass {
    public static void main(String[] args) {

        String str="java";
        int sayi=10;
        System.out.println(str.toUpperCase());
        //non-primitive data türleri data depolamak yanında bir çok faydalı methoda sahiptir ancak primitive
        //data türlerinin böyle bir özelliği yoktur
        //primitive data türleri sadece değerleri saklar


        //primitive data türleri içinde bazı methodlar gerekli olduğunda java ara bir çözüm üretmiştir
        //java her bir primitive data türünü için bir de non-primitive olarak kullanabilmek için özel classlar oluşturmuş
        //ve bunlara wrapper class adını vermiştir

        double sayi2=20.5;
        Double sayi3=15.2;

        //sayi3 wrapper class olan double clasını kullandığından sayı3. dediğimizde bir çok method gellir
        System.out.println(sayi3.doubleValue());//bu şekillde kullanılabilir



    }
}
