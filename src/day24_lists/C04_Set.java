package day24_lists;

import java.util.ArrayList;
import java.util.List;

public class C04_Set {
    public static void main(String[] args) {

        List<String> isimler=new ArrayList<>();

        isimler.add("aykut");
        isimler.add("ali");
        isimler.add(2,"fatma");
        isimler.add("kadir");

        System.out.println(isimler);

        isimler.set(1,"kader");
        System.out.println(isimler);

        //daha oncedden listede var olanları da arsiv gibi tutmak istersek

        List<String> logListesi=new ArrayList<>();

        logListesi.add(isimler.set(2,"huseyin"));
        //ustteki komutta 2. index yerine yeni isim tanıdı ama yerine konulan eski ismi aldı ve yeni bir log listesine eklemiş oldu.

        System.out.println(isimler);
        System.out.println(logListesi);


    }
}
