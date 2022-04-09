package day12_stringManipulation;

public class C04_Replace {
    public static void main(String[] args) {


        String str="bugun ne cok sey ogrendik";

        //bu cumledeki bosluk dısındki krekter sayısını bulunuz

        System.out.println("space haric karekter sayısı : "+str.replace(" ","").length());

        //atama yapılmadıgı surece orjinal String kalıcı olarak degismez
        //sadece o satır icin degisiklik yapılıp sonuc yazdırılmıs olur

        System.out.println("orjinal str karekter sayısı : "+str.length());

        //str da kalıcı degisiklik yapalım
        //bugun yerine yarin
        //ogrendik yerine ogrenecegiz

        str=str.replace("bugun","yarin");
        str=str.replace("ogrendik","ogrenecegiz");

        System.out.println("kalıcı degisiklikten sonra : "+str);

        str.replace("ne cok","ne az");//atama yapılmadıgı için kalıcıdegisiklik yok
        System.out.println(str);


    }
}
