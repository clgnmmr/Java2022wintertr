package day33_varargs_stringBuilder;

public class C02_Varargs {
    public static void main(String[] args) {
        //paraetreolarak bir int ve istedigimiz kadar string alan en uzun kelimenin harf sayssı ile int
        //parametre degerini carpıp sonucu yazdıran bir method oluşturun
        int sayi=5;

        String str1="Ali";
        String str2="Veli";


        carpim(sayi, str1, str2);
        // bir method da varargs dısında parametre kullanacaksak
        //once dgre parametre yazıp.varargs i en son yazmalıyız
        //bu sepeple bir method da birden fazla varargs olamaz


    }

    private static void carpim(int sayi, String... str) {

        String enUzunStr="";

        for (String each:str){

            if (each.length()>enUzunStr.length()){
                enUzunStr=each;
            }


        }
        System.out.println(enUzunStr);

        System.out.println((sayi*enUzunStr.length()));



    }
}
