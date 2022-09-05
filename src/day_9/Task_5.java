package day_9;

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        //Task5

        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        System.out.println("lütfen sayıları girin");
        a = sc.nextInt();
        b = sc.nextInt();

        if (a == b) {
            System.out.println("sayılar eşit");
        } else {
            System.out.println("sayılar eşit değildir");
        }
        System.out.println("----------------------");
    }
}
