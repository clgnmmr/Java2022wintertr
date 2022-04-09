package day27_constructor;

public class VolvoRunner {
    public static void main(String[] args) {

        Volvo v1=new Volvo();
       v1.model="XC90";
        v1.yakit="Dizel";
        v1.elektrikliMi=false;
        //System.out.println(v1.maxHiz);
        System.out.println(v1.toString());//Model : XC90, Yakıt :Dizel, Max hiz :240

        Volvo v2=new  Volvo();

        v2.yakit="Elektrikli";
        v2.elektrikliMi=true;
        v2.model="V60";
        v2.maxHiz= v2.maxHizAta();
        System.out.println(v2.toString());//Model : V60, Yakıt :Elektrikli, Max hiz :160



    }
}
