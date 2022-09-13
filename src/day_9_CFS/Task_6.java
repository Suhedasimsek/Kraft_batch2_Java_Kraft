package day_9_CFS;

import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        //Task6
        Scanner sc = new Scanner(System.in);
        System.out.println("Sayıları giriniz");
        int c;
        int d;

        c = sc.nextInt();
        d = sc.nextInt();
        if (c> d) {
            System.out.println(c + " buyuk sayıdır");
        }

        else if (d > c) {
            System.out.println(d + " buyuk sayıdır");

        }
        else {
            System.out.println("sayılar eşittir");

        }
        System.out.println("----------------------");

//task7(Ödev)

    }
}
