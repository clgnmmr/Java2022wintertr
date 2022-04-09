package day06_concatenationOperators;

public class C02_MantıkOperators {
    public static void main(String[] args) {

       boolean num1=5*3==15;
        System.out.println(num1);
        boolean num2=5+3<15;
        System.out.println(num1+""+num2);


       boolean  num3=(5*3==15)&&(4+3!=5);
        System.out.println(num3);//&& bu işaret herşey doğru olduğunda true der yoksa hep false olur

        boolean num4=(5+2!=7)||(4*3==2)||(4+3>5);
        System.out.println(num4);//|| bu işarette hepsi false false yzılır yoksa tek doğru varsa true yazar

        boolean sonuc2= 5>4 && 7>9 && 6+3==9 && 5+2!=8;

        System.out.println(sonuc2);

        boolean sonuc3= 5>4 & 7>9 & 6+3==9 & 5+2!=8;

        System.out.println(sonuc3);

        /*
        <--------------10-------------20----------->

         */
            int sayi3=15;
            //sayi 3 un 10 ile 20 aralığınnda olduğunu true diyerek dondürelim
        //java üçlükarşılaştırma kabul etmez
        ///ikili karşılaştırmalar yapıp mantıksal operatorler ile birleştirmeliyiz

        System.out.println(10<sayi3 && sayi3<20);//arasında ise ve olur yanı and &&
         /*
         <-------------10------------20--------->
          */
        int sayi4=5;

        // sayi4 ün 10 ile 15 in arasında olmadığını true diyerek dondürelim

        System.out.println(sayi4<10 || sayi4>20);//arasındadeğil dışındaysa veya or || kullanılır




    }
}
