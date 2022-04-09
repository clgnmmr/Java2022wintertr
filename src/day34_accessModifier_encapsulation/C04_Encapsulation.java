package day34_accessModifier_encapsulation;

public class C04_Encapsulation {
    public static void main(String[] args) {

        //bir variable encapsulation etmek için
        // 1-Access Modifier private
        // 2-okuma ve yazma ozelliklerinin kullanlmasını istedgimiz gibi sınırlayabiliriz

        // eger sadece okunasını istiyorsanız getter
        //sadece deger girilebilsinisterseniz setter
        //methodlarını olestururuz


        //bir variable icin hem getter hem setter olusturursanız o veriable public olmuş
        // gibi hem okuyum hemde yazılasını sağlayabilirsiniz
        // piyasada developer arasında genel uygulamada boyledir.

        C03 obj = new C03();

        System.out.println(obj.getSayi());
        obj.setStr("java");

        System.out.println(obj.getStr());

        System.out.println(obj);
    }
}
