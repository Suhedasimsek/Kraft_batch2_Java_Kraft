package day_44_OOP_ReviewCont.finalKeyword;

import java.util.ArrayList;
import java.util.Arrays;

public class FinalArrayAndArrayList {
    public static void main(String[] args) {
        final String[] BATCH2 = {"Talip","Alparslan"};
        BATCH2[0]="İbrahim";
        System.out.println(Arrays.toString(BATCH2));

//        batch2 = new String[]{"Ali","Mehmet"};// batch2 final olduüu içi yreferansı değiştirilemez
        System.out.println(Arrays.toString(BATCH2));

        System.out.println("---------------------");

        final ArrayList<String> NAME = new ArrayList<>();
        NAME.add("İhsan");
        NAME.add("Enes");

//        NAME = new ArrayList<>();// final olduüu için referansı değiştirilemez.




    }



}
