package day_9;

import java.util.Scanner;

public class MotelTask {
    public static void main(String[] args) {
            /*
    3 katlı bir motel in
    1. katında Resepsion, Güvenlik ve Oda hizmetler var.
    2 katında Yemekhane, Dinlenme salonu ve Room1,Room2
    3.katında ise Room3,Room4,Room5,Room6 vardır.
    Bir switch yapısı ile otel katlarını ve oda isimlerini girerek tanıtım alacagınız bir program(nested
    switch) yazın. Tanıtım bilgileri için aşağıdakileri kullanabilirsiniz.

    message 1 : lütfen motelimizi tanımak için 1-2-3 bir kat numarası girin ve oda adı seçin.
    message 2 : 1.kat : Resepsion-Güvenlik-Oda hizmetleri
    2.kat : Yemekhane-Dinlenme salonu-Room1-Room2
    3.kat : Room3-Room4-Room5-Room6
    Resepsion : tüm işlemleriniz için bekleriz
    Güvenlik : profosyonel bir hizmettir
    Oda hizmetleri : temizlik ve taşıma hizmetleri için 101 dahili hattan ulaşabilirsiniz
    Yemekhane : Kahvaltı 08-11
    Öğle yemeği 12-15
    Akşam yemeği 18-21
    Dinlenme salonu : 24 saat çay servisi ile hizmetinizdedir
    Room1,Room2 : ekonomik oda
    Room3,Room4 : standart oda
    Room5,Room6 : özel oda

         */
        Scanner sc = new Scanner(System.in);

        System.out.println("lütfen motelimizi tanımak için 1-2-3 bir kat numarası girin ve oda adı seçin.");
        System.out.println("1.kat : Resepsion-Güvenlik-Oda hizmetleri\n2.kat : Yemekhane-Dinlenme salonu-Room1-Room2\n3.kat : Room3-Room4-Room5-Room6");

        byte kat = sc.nextByte();
        sc.nextLine();
        String secim = sc.nextLine();

        switch(kat){
            case 1:
                switch (secim){
                    case "Resepsion":
                        System.out.println("tüm işlemleriniz için bekleriz");
                        break;
                    case "Güvenlik":
                        System.out.println("profosyonel bir hizmettir");
                        break;
                    case "Oda hizmetleri":
                        System.out.println("temizlik ve taşıma hizmetleri için 101 dahili hattan ulaşabilirsiniz");
                        break;
                    default:
                        System.out.println("boyle bir oda yok");
                }

                break;
            case 2:
                switch (secim){
                    case "Yemekhane":
                        System.out.println("Kahvaltı 08-11\nÖğle yemeği 12-15\nAkşam yemeği 18-21");
                        break;
                    case "Dinlenme salonu":
                        System.out.println("24 saat çay servisi ile hizmetinizdedir");
                        break;
                    case "Room1","Room2":
                        System.out.println("ekonomik oda");
                        break;
                    default:
                        System.out.println("2. katta boyle bir oda yok");
                }


                break;
            case 3:
                switch (secim){
                    case "Room3","Room4":
                        System.out.println("standart oda");
                        break;
                    case "Room5","Room6":
                        System.out.println("Özel oda");
                        break;
                    default:
                        System.out.println("boyle bir oda yok");
                }

                break;
            default:
                System.out.println("Otelimiz 3 katlıdır");
        }
    }
}
