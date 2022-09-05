package day_9;

import java.util.Scanner;

public class Task_8 {
    public static void main(String[] args) {
//task8

        Scanner sc = new Scanner(System.in);

        int sayı1 = 10;
        int sayı2 = sc.nextInt();
        int sayı3 = sc.nextInt();

        if (sayı1+sayı2>sayı3){
            sayı3 = Math.abs(sayı1 - sayı2);
            System.out.println("sayı3 = " + sayı3);

        }
        System.out.println("----------------------");



    }
}
