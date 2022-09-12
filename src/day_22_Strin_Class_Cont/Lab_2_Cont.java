package day_22_Strin_Class_Cont;

public class Lab_2_Cont {

//Kullanıcıdan 2 kelime alın kısa kelime yi başta 2
// defa uzun kelimeyi ortada 30 defa kısa kelimeyi
// tekrar sonda 2 defa yazdıran metodu yazınız.

    public static String shortLongShort(String str1,String str2){
        String result="";
        if(str1.length()<=str2.length()){

            firstLoop: for(int i=0; i<2; i++){
                result+=str1+str1; //aliali
                for (int j=0; j<30; j++){
                    if(i>0) {
                        return result;
                    }                       //alialimehmetmehmetmehmet...........mehmetalialimehmet.........mehmet
                    result+=str2;
                }
            }
        }else {

            firstLoop: for(int i=0; i<2; i++){
                result+=str2+str2; //aliali
                for (int j=0; j<30; j++){
                    if(i>0) {
                        return result;
                    }                       //alialimehmetmehmetmehmet...........mehmetalialimehmet.........mehmet
                    result+=str1;
                }
            }

        }

       return result;
    }




//Kullanıcıdan bir kelime veya söz alın ve ilk 5 karakterini yazdırın.
// 5 karakterin altında bir kelime girdiği taktirde 5 karaktere nokta ile tamamlayın.

    public static String nokta(String str){
        if(str.length()>=5){
            return str.substring(0,5);
        }
        else{
            String result="";
            for(int i=0; i<5-str.length(); i++){
                result+=".";
            }
            return str+result;

        }


    }





//Kullanıcıdan bir kelime alın ve bu kelimenin ilk 2
// harfi sonunda yer alıyorsa true almıyorsa false yazdırın.


public static boolean twoLetterEnd(String str){
        String start="";
        String end="";
        for (int i=0,j=str.length()-2; i<2; i++,j++){
            start+=str.charAt(i);
            end+=str.charAt(j);
        }
        return start.equals(end);
}

//Kullanıcının konsoldan ad ve soyad bilgilerini konsoldan alın
//Ekrana "Soy isminiz ..(soyad).. dır."  Yazan metodu yazınız.



    //"  ahmet mehmet yılmaz   "
public static String surname(String str){
    String str1=str.trim();
    int count=0;
    for(int i=0; i<str1.length(); i++){
      if(str1.charAt(i)==' '){
          count=i;
      }
    }
    if(count==0){
        return "";
    }
    else {
        return str1.substring(count+1);
    }




}



    //Kullanıcıdan bir dize sözcük alın ve yinelenen her karakteri
// kelimenizden çıkartarak sonuç döndüren metodu yazınız. (Büyük küçük duyarlı)
    // Merhaba  Merhab
    // Ananas   Anas

    public static String yinelenenKarakterAt(String str){
        String result=""; //str="araba"

      while (!str.isEmpty()){
          result+=str.charAt(0);  /// Result="arb"
          str=str.replace(str.substring(0,1),""); //str=""
          //str=""
      }

        return result;
    }







//Kullanıcıdan bir kelime alan ve sonucunda yinelenen kelimeleri string
//olarak return eden methot yazınız.
    //java   a
    //javva  av

    public static String yinelenenHarfBul(String str){ //str="     ja v v  a   "
         str=str.replace(" ",""); //str=""
        String result="";                          //result="av"
        while(!str.isEmpty()){
            if(    str.substring(1).contains(  str.substring(0,1)   )     ){
                result+=str.substring(0,1);
            }
            str=str.replace(str.substring(0,1),"");
        }

        return  result;
    }
    // yazılan kelimenin içerinde sayıları yazdıran metodu yazınız
    // merha123ba     123
    // 123a23ff34    1232334
    //ASCII




    public static void main(String[] args) {


        System.out.println(rakamBul("  +'  2 ja v v1125  a   "));
    }

    public static String rakamBul(String str){
        String result="";
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)>47 && str.charAt(i)<58){
                result+=str.charAt(i);
            }
        }
        return result;


    }

    // yazılan kelimenin içerinde sadece harfleri yazdıran metodu yazınız
    // merha123ba     merhba
    // 123a23ff34      aff
    //ASCII

}
