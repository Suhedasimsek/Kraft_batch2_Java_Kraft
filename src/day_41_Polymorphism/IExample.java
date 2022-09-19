package day_41_Polymorphism;

public interface IExample {

    default void baslat(){
        mesaj();
    }
    private void mesaj(){
        System.out.println("merhaba dünya");
    }
}

class Main implements IExample{
    public static void main(String[] args) {
        Main main=new Main();
        main.baslat();
        System.out.println(main.sum(5, 3));
        System.out.println(main.sum(5,3,2));
        Main2 main2=new Main2();
        System.out.println(main2.sum(5, 3));
    }

    public  int sum(int a,int b){
        return a+b;
    }
    public  int sum(int a,int b,int c){
        return a+b+c;
    }
}

class Main2 extends Main{
    public int sum(int a,int b){
        return a*b;
    }
}
