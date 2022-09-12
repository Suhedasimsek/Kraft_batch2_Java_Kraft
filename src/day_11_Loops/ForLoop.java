package day_11_Loops;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args){

/*for(int i=1; i<=20; i++){
    System.out.println(i+"-Merhaba Dünya");
}
        for(int i=100; i<100; i++){
            System.out.print(i+" ");
        }




       for(int i=100; i>=0; i--){
           System.out.print(i+" ");
       }






       for(int i=0; i<100; i++){
          if(i%2!=1){
              System.out.print(i+" ");
          }



        int sonuc=1;
        for(int i=6; i>0; i--){
            sonuc*=i;  //  1.loop: sonuc=sonuc*i(6); sonuc=1*6;  sonuc=6
                       //  2.loop: sonuc=sonuc*i (5); sonuc=6*5;  sonuc=30
                       //  3.loop: sonuc=sonuc*i (4); sonuc=30*4;  sonuc=120
                       //  4.loop: sonuc=sonuc*i (3); sonuc=120*3;  sonuc=360
                       //  5.loop: sonuc=sonuc*i (2); sonuc=360*2;  sonuc=720
                       //  6.loop: sonuc=sonuc*i (1); sonuc=720*1;  sonuc=720
        }
        System.out.println("6!="+sonuc);

        Scanner scan=new Scanner(System.in);
        System.out.print("faktöriyeli girilecek rakamı yazınız: ");
        int faktoriyel= scan.nextInt();

        int sonuc=1;
        for(int i=1; i<=faktoriyel; i++){

            sonuc=sonuc*i;
        }
        System.out.println(faktoriyel+"!="+sonuc);

        for(int i=0; i<20; i++){
          int sonuc=i*i*i;
            System.out.println(i+" nin küpü: "+sonuc);
        }
*/

/*
        for(int i=0; i<20; i++){
            double sonuc=1;
            sonuc=Math.pow(i,3);
            System.out.println(i+" nin küpü: "+sonuc);
        }



   for(int i=24; i<50; i++){
       double fahrenheit= (i*1.8)+32;//    c=(f-32)/1.8     (c*1.8)+32=f
       System.out.println(i+" C= "+fahrenheit+" F dır");
   }





Scanner scan=new Scanner(System.in);
System.out.print("Lütfen bir kelime yazınız ");
String kelime= scan.nextLine();
System.out.print("kaç defa ekrana yazdırmak istiyorsunuz ");
int tekrarSayisi=scan.nextInt();

for(int i=0; i<tekrarSayisi; i++){
    System.out.println(kelime);
}

        Scanner scan=new Scanner(System.in);
        System.out.print("0 ile 1000 arasında bir sayı giriniz ");
        int sayi=scan.nextInt();
        int sonuc=0;
        for(int i=0; i<=sayi; i++){
            sonuc+=i;

        }
        System.out.println(sayi+" kadar olan toplam: "+ sonuc);


        Scanner scan=new Scanner(System.in);
        System.out.print("0 ile 1000 arasında bir sayı giriniz ");
        int sayi=scan.nextInt();
        int tekSayi=0;
        int ciftSayi=0;
      for(int i=0; i<=sayi; i++){
          if(i%2==0){
              ciftSayi+=i;
          }
          else{
              tekSayi+=i;
          }
      }
        System.out.println("Tek sayilar toplamı: "+tekSayi);
        System.out.println("çift sayilar toplamı: "+ciftSayi);



        Scanner scan=new Scanner(System.in);

        System.out.print("taban giriniz: ");
        int taban=scan.nextInt();
        System.out.print("üs giriniz: ");
        int ust=scan.nextInt();

        int sonuc=1;
        for(int i=0; i<ust; i++){
            sonuc*=taban;
        }
        System.out.println(sonuc);

*/
        Scanner scan=new Scanner(System.in);
        System.out.println("araba fiyatı");
        double araba=scan.nextInt();
        System.out.println("kdv oranı");
        double kdv=scan.nextInt();
        System.out.println("ötv oranı");
        double otv=scan.nextInt();
        double toplam=araba+araba*kdv/100;
        toplam=toplam+toplam*otv/100;
        if(toplam>700000&&toplam<1000000){
            System.out.println(toplam+"alabilirim");
        }else if(toplam>=1000000){
            System.out.println(toplam+"çok para");
        }else {
            System.out.println(toplam+"ucuz");
        }

   }
}




















