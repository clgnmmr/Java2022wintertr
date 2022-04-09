package day34_accessModifier_encapsulation;

public class C03 {


    private int sayi;
    private String str;


    public int getSayi() {
        return sayi;
    }

    public String getStr() {
        return str;
    }

    @Override
    public String toString() {
        return "C03{" +
                "sayi=" + sayi +
                ", str='" + str + '\'' +
                '}';
    }

    public void setSayi(int sayi) {
        this.sayi = sayi;
    }

    public void setStr(String str) {
        this.str = str;
    }
}
