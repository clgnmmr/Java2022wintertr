package day05_matematikselişlemler;

public class C01_PreIncrementPostIncrement {
    public static void main(String[] args) {

        int sayi=10;

        sayi++;
        System.out.println(sayi);
        sayi++;
        System.out.println(sayi);
        //eger 11 ve 12 de yaptığım işlemi tek satrda yaparsam
        // java ikiişlemden önce hangisi yapıcağını bilmek ister

        System.out.println(sayi);
        //önce arttırır sonra yazdırısak java yeni değeri yazar
        // eğer önce yazdırır sonra artırırsak eski değer yazılır

        System.out.println("pre-increment satırında : " +   ++sayi);// 13 önce artır sonra yazdır


        System.out.println("pos-increment satırında  :" +  sayi++);//önce yazdır sonra arttır
        System.out.println("post-increment satırında sonra "+  sayi);

    }
}
