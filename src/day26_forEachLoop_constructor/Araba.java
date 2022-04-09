package day26_forEachLoop_constructor;

public class Araba {
/*
    // javada her class oludsturdugumuzda
    //java o classtan ileride objeler uretmek gerekeceğini bilir
    ve biz özellikle belirtmesekte yava her olusturdugu class bir contructor koyaring

    java class olustururken koydugu constructor a DEFAULT CONSTRUCTOR denir ve bu gorunmez.


    eger biz görünür bir constructorumuz olsun istersek default constructor ile aynı gorevi yapan bir constructor  olusturabiliriz
    veya istersek aynı kalıptan farklı desenlerde objelerden olusturmak icin farklı ozelliklerde constructor lar da olusturabiliriz


    constructor ları birbirinden farklastırılan tek ayrıcalık kullanılan
    parametre sayısı ve parametre data turudur


*/

  public  Araba() {

      System.out.println("parametresiz constructor calıştı ");

    }


     /* //bir code blogunun method ve y constructor lmasından emin olmak istiyoranız
     iki seye dikkat edilmelidir
     1-Constructor ların isimleri buyuk harfle baslar
     2-Constructorların return type olmaz(method buyuk harf ve cals ismi başlasa bile )

     ozetle: constructor adı clas adı ile aynı olmalı ve return type olmamalıdır

*
*/
    public Araba(String renk){
        System.out.println(renk +" renkli bir araba uretildi");
    }
    public Araba( int yıl){

        System.out.println(yıl +" model araba uretildi.  ");


    }


    public Araba(int yıl,String renk){
        System.out.println(yıl +" model "+renk  +" renk araba uretildi");

    }


}
