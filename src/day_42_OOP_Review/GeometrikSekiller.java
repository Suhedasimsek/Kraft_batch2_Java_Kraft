package day_42_OOP_Review;

public  class GeometrikSekiller {
     boolean isKare;
     int a=5;
    static{
        System.out.println("parent static çalıştı");
    }

    {
        System.out.println("parent block");
    }

    GeometrikSekiller(){

        System.out.println("parent constructor çalıştı");
    }

   final public  void notOverride(){

    }

    public static void getName(){
        System.out.println("bu bir şekildir");
    }
}
