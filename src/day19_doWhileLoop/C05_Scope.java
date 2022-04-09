package day19_doWhileLoop;

public class C05_Scope {

    //bir metthod içerisinde oluşturulan veriable sadece oluşturuldukları methodda kullanılabilirler
    // tum methodların kullanabilmasını istedigimiz veriableları Class levelda oluştururuz.

    //Class levelda oluşturdugumuz veriable
    // --static yaparsak tum methodlar kullanabilir
    // --static olmazsa(instance) o zman sadece static olmayan methodlarda kullanılır

    //loop içinde oluşturaln veriable lar loop içerind kullanılablir ama loopun dışında kullanılamaz



    static String kurs="java";

    int level=10;

    public static void main(String[] args) {

        int sayi=10;
        System.out.println(kurs);
        //System.out.println(level); burda çalışmaz static olması gerekir


        for (int i =0; i <10 ; i++) {
            System.out.println(i);
        }


    }
    public static void method1(){
      //sayi=15;   bu burda çalışmaz
        System.out.println(kurs);

    }
    public void method2(){//statik olmadanda method olur ama statik grubunda olanlar static methodlarda çalışırlar
        System.out.println(kurs);
        System.out.println(level);//burda çalışır ve static olmadıgı için
    }

}
