package day_54_CollectionCont;

import java.util.HashSet;
import java.util.Set;

public class Set_String_HashCode {
    public static void main(String[] args) {
        System.out.println(new String("Murat").hashCode());//74709341
        System.out.println("Murat".hashCode());//74709341

        Set<String> stringSet = new HashSet<>();
        stringSet.add("Murat");
        stringSet.add("Hakan");
        stringSet.add("Murat");

        System.out.println("stringSet = " + stringSet);//[Hakan, Murat]

        Student s1 = new Student("Ahmet",25);
        Student s2 = new Student("Ahmet",25);
        Student s3 = new Student("Ahmet",25);

        System.out.println("s1.hashCode() = " + s1.hashCode());//1607521710
        System.out.println("s2.hashCode() = " + s2.hashCode());//1531448569
        System.out.println("s3.hashCode() = " + s3.hashCode());//1867083167

        System.out.println("s1.equals(s2) = " + s1.equals(s2));

        Set<Object> studentSet = new HashSet<>();
        studentSet.add(s1);
        studentSet.add(s2);
        studentSet.add(s3);
//        System.out.println("stringSet = " + studentSet);
        System.out.println("studentSet.size() = " + studentSet.size());
    }
}
