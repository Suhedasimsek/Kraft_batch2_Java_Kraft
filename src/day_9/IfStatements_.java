package day_9;

import java.util.Scanner;

public class IfStatements_ {
    public static void main(String[] args) {

        int hız = 10;
        boolean isMoving = true;

        if (isMoving) {
            hız++;
        }
        System.out.println("hız = " + hız);
        System.out.println("----------------------");


//Task1

        // eger x 10 a eşitse y ye 20 atayın.
        int x = 10;
        int y = 0;

        if (x == 10) {  //true
            y = 20;  // y ye 20 degeri atanır
        }
        System.out.println("y = " + y);
        System.out.println("----------------------");

//Task2
// sıcaklı 20 ve 20 derecenin ustunde ise kelebekler uçar diye consola yazdırın
        int temp = 10; // guncel sıcaklığı temsil eden bu varable 10 degrini tasımata.
        if (temp >= 20) { //false
            System.out.println("kelebekler uçar");
        } else {
            System.out.println("kelebekler sogukta pek ucmaz"); // bu mesajı konsola yazdırır
        }
        System.out.println("----------------------");
//Task3
// Aysenin harclığı 5 liradan az ise babası ona 10 lira harclık veririr.
        int harclık = 6;

        if (harclık < 5) { //false
            harclık = harclık + 10;
            //harclık += 10;
        } else {
            System.out.println("Ayse bugun " + harclık + " Tl ile okula gidecek"); // konsola bu mesajı yazdıracak cunku
            // aysenin harclıgı 5 liradan az degil
        }
        System.out.println("harclık = " + harclık);
        System.out.println("----------------------");












    }
}
