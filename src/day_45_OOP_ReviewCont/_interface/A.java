package day_45_OOP_ReviewCont._interface;

public interface A {
//  public static final int i; //instance variable olmaz
    public static final int i=10;
                        int j=20;
    public abstract void M1();
    public abstract void M2();
    public abstract void M3();
    public abstract void M4();

    private void M5(){
        System.out.println("Hello from private method from Interface A");
    }

    default void M6(){
        System.out.println("Hi from interface A");
        //tüm alt sınıfları kolayca etkilemek için default method kullanımına
        // izin verilmiş
        //backyard compatibility/geriye donuk uyumluluk//java 8
        M5();
    }
    static void M7(){
        System.out.println("hello from static method from A ınterface");
        M5_1();
    }  //java 8

    private static void M5_1(){
        System.out.println("Hello from private static method");
    } //java 9

}
