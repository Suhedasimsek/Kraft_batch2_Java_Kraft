package review;

public class Pattern {

    public static void main(String[] args) {
        //pattern soruları çözerken anlıycağımız şey

        for (int i = 0; i < 5; i++) { //dışdaki loop satır sayısını

            for (int j = 5; j > i; j--) {
                System.out.print("-");
            }                                   //iç looplar ise bulunduğu satırın sütununa işaretlemelri yapıyor. boşluk yerine çizgi koyduk ki mesela anlşaılır olsun diye
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

/*
        dıştaki loop hiçbirsey yazırmıyor sadece 16. satırdaki printLn ile her döngüde bir satır aşağı atlıyor.
        inner looplardan birincisi en yuksek değerden başlıyarak(ters piramitin tabanı) dış loop her döndüğünde  azalarak  '-' işareti koyuyor
        inner looplardan ikincisi en düşük değerden başlıyarak(piramitin tepesi) dış loop her döndüğünde  artarak '*' işareti koyuyor

 */


    }
}
