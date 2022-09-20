package day_42_OOP_Review;

public class StaticCalisma {
    public static  int x=5;
    public int y=10;

    StaticCalisma(int x){
    StaticCalisma.x=x;

    }

    public void normalMetot(){
        System.out.println(x*10);
        System.out.println(y);
    }
    public static void staticMetot(int a){
        System.out.println(x);
        StaticCalisma.x=a;
        //normalMetot();

    }
}
