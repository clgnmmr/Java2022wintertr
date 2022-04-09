package day07_ıfElseStatements;

public class C01_IfStatements {
    public static void main(String[] args) {

        int a=2;
        int b=3;

     if (a!=b){
         System.out.println("verilen sayılar eşit");

     }
     if (a>100) {
         System.out.println("a yüzden büyük");//ıf devreye girdi ama ıf bodysi çalışmaz bir şey yazmaz
     }

     if (a*b>5){
         System.out.println("sayıların çarpımı 5 den büyük");// ıf devri true olduğu için çalışır
     }
     //bagımsız if cümleleri kendileri dışındakı kodlarla ilgilenmezler
        // bir şart be o sarta baglı sonuca odaklıdır
        //birden fazla bagımsız if cümlesi olduğunda hepsinin body calışabileceği gibi//hiçbirirsinin body si çalışmaya bilir











    }
}
