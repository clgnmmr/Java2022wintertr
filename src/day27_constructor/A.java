package day27_constructor;

public class A {

    int x=3;
    int y=5;


    public static void play(){


    }


    A(){
        x+=1;
        System.out.println("-x"+x);
    }

    A(int i) {
        this();
        this.y = i;
        x += y;
        System.out.println("-x" + x);
    }
        A(int i , int i2){
            this(3);
            this.x-=4;
            System.out.println("-x"+x);



    }

    public static void main(String[] args) {
        A mrc=new A(4,3);


    }

    }

