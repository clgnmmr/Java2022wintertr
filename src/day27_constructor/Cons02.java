package day27_constructor;

public class Cons02 {
    public static void main(String[] args) {



        Cons01 obj1=new Cons01();


        // Cons01 class ında hıc constructor olusturmaksak,
        // java default constructor ı kullandıgından obj1 i uretebildik
        //ancak biz parametreli veya paremetreli
        // bir constructor yazdıgımızda java default constructor siler.


   /*    dolasıyla biz herhangi bir constructor olusturdugumuzda
        daha once baska class lar vveya kullanıcıların
        olusturmus olabilicegi objeleri kullanabilmeleri icin
        default constructor ın işlevini gercekleştirecek parametresiz
        bir constructor olusturmkta fayda var
*/




        Cons01 obj2=new Cons01("kalem");

        //iki objede calışacak yukardan asagıy dogru calışır


    }
}
