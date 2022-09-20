package day_41_Polymorphism;

import day_36_Inheritance_Cont.VanKedisi;
import day_40_Interface.A;

public class Main_Polymorphism {
    public static void main(String[] args) {
 /* SporCar kırmızMelek=new SporCar();

 Car beyazMelek=new Car();

 IVehicle sariMelek=new SporCar();
 //sariMelek.stop();
        //System.out.println(sariMelek.tekerSayisi);

        System.out.println(sariMelek.getClass().getSimpleName());

        VanKedisi minnos=new VanKedisi();
        System.out.println(minnos.getClass().getConstructors().length);

        Kus limon=new Kanarya();
        Kus mavis=new Muhabbet();


      if(limon instanceof Kus){
          System.out.println("limon kanayanın örneği");
      }

      */


// parent class child class gibi davranması gerekiyor(poliformizm)

       /*
        String a="harun";
        int b=(int)a;
        Animal animal=new Animal();
        Dog dog=(Dog)animal;
        dog.eat(); */ //hata

        Animal animal=new Dog();
        Dog dog=(Dog)animal;
        dog.sleep();
        animal.sleep();







    }
}
