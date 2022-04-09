package day10_switch_StringManipulation;

public class C03_Concate {
    public static void main(String[] args) {
      //concetanation yapmak icin


        String str1="Java";
        String str2="Candır";

        //java candır yzdıralım
        System.out.println(str1+ " "+str2);


        String cumle=str1.concat(str2);//JavaCandır

        cumle=str1.concat(" ").concat(str2);//Java Candır

        System.out.println(cumle);


        //concat icine string degilde sayi veya boolean deger yazsak
        //cancat methodu icine string parametre ister
        //string sışında bir data turu yazıldığında onu string hale getirmelisiniz


       cumle=str1.concat(""+5);
       cumle=str1.concat(true+"");

    }
}
