package day_9;

import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {
        //Task11_12

        int A = 50;
        int B = 70;
        int C = 50;

        if (A + B + C == 180) {

            if (A == 90 || B == 90 || C == 90) {
                System.out.println("Bu bir dik ucgendir");
            } else {
                System.out.println("Bu bir üçgendir");
            }

        } else {
            System.out.println("bu bir üçgen olamaz");
            System.out.println("çünkü iç açıları toplamı " + (A + B + C) + " olan bir " +
                    "geometrik şekil üçgen olamaz");
        }

        System.out.println("----------------------");







    }
}
