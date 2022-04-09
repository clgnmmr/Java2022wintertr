package day14_stringManipulation;

public class C01_Trim {
    public static void main(String[] args) {

        String str="  siz ne derseniz deyin.java bildigini okur.     ";

        str.trim();
        System.out.println(str);// sizne deeniz deyin java gördügünü yazar
        System.out.println(str.length());// 49


        str=str.trim();

        System.out.println(str);//atama yapıldıktan sonra trim boşlukları siler
        System.out.println(str.length());// 42





    }
}
