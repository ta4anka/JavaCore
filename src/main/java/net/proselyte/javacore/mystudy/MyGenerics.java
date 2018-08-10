package net.proselyte.javacore.mystudy;

import java.util.ArrayList;
import java.util.List;

public class MyGenerics {
    public static void main(String[] args) {
// ------------- -before Java 5-----------------------------------------------
// you can put in List any object
// and then downcasted if you wanted to put in new variable:
        List animals = new ArrayList();
        animals.add("cat");
        animals.add(555);
        animals.add(true);
        String animal = (String)animals.get(0);//downcasting Object to String
        int num = (int)animals.get(1); //downcasting Object to int
        System.out.println(animal);
        System.out.println(num);
//        or without downcasting for just printing:
        System.out.println(animals.get(2));

//---------------------------After Java 5 with generics -------------------------------------
        List<String> animals2 = new ArrayList<String>();
        animals2.add("cat");
//        animals2.add(555); ==> Error!
        animals2.add("dog");
        String animal2 = animals2.get(0);
        System.out.println(animal2);
//-----------------------------After Java 7-----------------------------------
        List<String> animals3 = new ArrayList<>();


    }
}
