package day27_constructor;

public class VolvoRunner2 {

    public static void main(String[] args) {
        //her obje obje olusturdugumuzda model ,yakıt,gibi degerleri
        // tek tekk atama yapmak istemiyorak

        Volvo v3=new Volvo("XC60",true,2023,"Benzin");

        System.out.println(v3.toString());
        System.out.println(v3);//toString ismi verirseniz boylece bu komutu kullanabilirz

        Volvo v4=new Volvo("XC90",true,2021,"elektrikli");
        System.out.println(v4);

    }



}
