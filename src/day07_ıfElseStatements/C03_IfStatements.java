package day07_ıfElseStatements;

public class C03_IfStatements {
    public static void main(String[] args) {


    int a=10;
    int b=20;


    if (a>b && b<100){
        System.out.println("isteğiniz gerçekleşecek");
        System.out.println("body içindeki tum kodlar çalışır");// burda if cümlesi doğru oladığı için yazdırmaz
        // burda süslü{} parentez olduğu için bir çok satır yazılır.

    }

    if (a>0) System.out.println("suslu parentez olmazsa sadece bir satır çalışır");//bu şekildede kod çalışır ama çalışır mı çalışmazmm belli değil


        //bir if cümlesinin daha anlaşılır olmasını istiyoranız if bodysini süslü parntez içine {} yazmalısınız
        //body {} içine yazmazsakta if cümlesi çalışır ancak ilk noktalı virgül ; gördüğünde if cümlesi bitmiş olur

      //23.satırdaki kod 16. satırdaki if doğru olsada çalışır yanlış olsada çalışır
    System.out.println("ikinci satırda çalıştı");

   // if (a+b){ bunu kabul etmez sadece boolean


    }
}
