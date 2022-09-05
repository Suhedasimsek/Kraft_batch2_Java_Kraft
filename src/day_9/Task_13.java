package day_9;

import java.util.Scanner;

public class Task_13 {
    public static void main(String[] args) {
        //Task13
        /*
        * • Bir sayı için 5 den 25 den ve 50 den büyük olup olmadığını
            denetimini yapın. Eğer sayı 5 den büyükse 5 den büyük
            olduğunu konsola yazdırın. Sayı 25 den de büyükse hem 5
            hem 25 den büyük olduğunu konsola yazdırın. Sayı 50 den
            buyukse sayının hem 5 den hem 25 den hem de 50 den
            buyuk oldugunu konsola yazırın..
          */
        Scanner sc = new Scanner(System.in);

        int numberx = sc.nextInt();
//
        if (numberx > 5) {
            System.out.println("sayı 5 den buyuktur");
            if (numberx > 25) {
                System.out.println("sayı 25 den buyuktur");
                if (numberx > 50) {
                    System.out.println("sayı 50 den de buyuktur");
                } else {
                    System.out.println("sayı 50 den kucuk");
                }

            } else {
                System.out.println("sayı 25 den ve 50 den kucuk");
            }

        } else {
            System.out.println("sayı 5 den 25 den ve 50 den kucuk");
        }
    }
}
