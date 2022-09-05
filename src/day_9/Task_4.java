package day_9;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        //Task4
// bankadaki hesabımız takım elbiseyi alabilirmi alamazmı bunu ele alan  bir if yapısı
        double hesaptakiPara = 2050;
        double takımınFiyatı = 2000;

        if (hesaptakiPara >= takımınFiyatı) {
            System.out.println("takımı satın alabilir"); // bu mesajı yazdırır.

        } else {
            System.out.println("yetersiz bakiye");
        }
        System.out.println("----------------------");


    }
}
