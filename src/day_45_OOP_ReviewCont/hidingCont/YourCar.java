package day_45_OOP_ReviewCont.hidingCont;

public class YourCar extends MyCar {

    public static boolean haveSunroof(){
        return true;
    }
    public void getYourCarSunRoofStatus(){
        System.out.println("Your car have sunroof :"+haveSunroof());

    }
}
