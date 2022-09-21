package day_42_OOP_Review;
import  static day_42_OOP_Review.Daire.*;
public class Main_Day_42 {
    public static void main(String[] args) {
        System.out.println(Math.pow(2, 4));
        Daire daire2=new Daire();
       Daire daire3=new Daire();

        System.out.println(alan(5));


    }

    public static Daire changeRadius(Daire daire,double radius){
        daire.setRadius(radius);
        return daire;

    }
}
