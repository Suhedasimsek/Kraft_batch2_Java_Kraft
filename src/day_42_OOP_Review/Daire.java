package day_42_OOP_Review;

public class Daire extends GeometrikSekiller{

   private final static double PI=3.14;
    private double radius;


    static {
        System.out.println("static metod 1 defa çalışır.");
    }

    {
        System.out.println("instance metot çalıştı");
    }

    public Daire(boolean isKare){
        super(isKare);
        System.out.println("Daire constructor çalıştı.");
    }




    public Daire(boolean isKare,int radius){
       super(isKare);
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
        return PI*Math.pow(radius,2);
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

}
//kolay gelsin