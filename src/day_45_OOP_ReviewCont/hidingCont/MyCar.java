package day_45_OOP_ReviewCont.hidingCont;

public class MyCar {

    public static boolean haveSunroof(){
        return false;
    }
    public void getMyCarSunroofStatus(){
        System.out.println("My car have sunroof :"+haveSunroof());
    }
}
