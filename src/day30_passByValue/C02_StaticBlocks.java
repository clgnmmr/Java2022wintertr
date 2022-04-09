package day30_passByValue;

public class C02_StaticBlocks {

    {
        /*
        static olmayan bloklar ise obje olusturulurken calışır

        static bloklar sadece 1 kere en basta calışır
        static olmyan bloklar her obje olusturulurken yeniden calısır
         */
        System.out.println("static olmayan blok calıştı");
    }
    static{
        System.out.println("static blok calıştı");
    }

    public static void main(String[] args) {
        System.out.println("main method calıştı");
    C02_StaticBlocks obj1=new C02_StaticBlocks();
    C02_StaticBlocks obj2=new C02_StaticBlocks();

    }
}
