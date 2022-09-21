package day_42_OOP_Review;

public class Daire extends GeometrikSekiller{

   private final static double PI=3.14;
    public static double radius;
int a=10;

    static {
        System.out.println("Child static metod   çalıştı.");
    }

    {
        System.out.println("child instance metot çalıştı");
    }

   public  Daire(){
super();
        System.out.println("child constructor çalıştı.");
    }

    public Daire(int radius){
super();

        this.radius=radius;
    }

    public void setRadius(double radius){
        if(radius>0){
            this.radius=radius;
        }else{
            System.out.println("Yarıçap 0 ve 0 dan küçük olamaz");
        }
    }
    public double getRadius(){
        return this.radius;
    }




    public double alan(){
        return PI*Math.pow(this.radius,2);
    }
    protected double cevre(){
        return 2*PI*this.radius;
    }

    public static double alan(double radius){
        return  PI*radius*radius;
    }

    public static double cevre(double radius){
        return 2*PI*radius;
    }

    public void notOverride1(){

    }
    public static void getName(){
        System.out.println("bu bir dairedir");
    }




}
//kolay gelsin