package day15_methodCreation;

public class C06_MethodCreation {
    public static void main(String[] args) {

        int a=10;
        int b=20;

        //iki varaeble değerlerini toplayan bir method oluşturalım

        //1.adım methoda ismini yazazalım
        //2.adım methoda göndermem gereken argüman (argüment) varmmı?4
        //ikiSayiTopla(a,b);
     ikiSayiTopla(25,50);


     C04.dortHarfiTersineCevir("sema");



    }
// bir methodu oluşturmak çalışması ıcın yeterli değildir
    //method ancak cagırılırsa calisir.
    //aynı classs veya farklı class ta olmasını hiç bir önemi yoktur
    //Java main methodda yukarıdan aşşağya doğru calışır
    //geldigi satırı calıştırır

    private static void ikiSayiTopla(int a, int b) {
        int toplam=a+b;
        System.out.println("sayıların toplamı :"+toplam);
    }
}
