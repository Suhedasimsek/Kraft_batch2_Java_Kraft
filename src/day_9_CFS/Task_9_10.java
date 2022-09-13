package day_9_CFS;

import java.util.Scanner;

public class Task_9_10 {
    public static void main(String[] args) {
        //Task9-10
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

//        int nunmer2 = sc.nextInt();           //Task_10
//        number = Math.abs(number-nunmer2);    /Task_10

        if (number%2==0){
            System.out.println("Bu bir çift sayıdır");
        }else{
            System.out.println("Bu bir tek sayıdır");

        }
        System.out.println("----------------------");
    }
}
