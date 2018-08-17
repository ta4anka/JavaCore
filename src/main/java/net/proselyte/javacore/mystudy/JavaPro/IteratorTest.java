package net.proselyte.javacore.mystudy.JavaPro;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//Comparing iterator and loop for-each
public class IteratorTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        //---Before Java 5---
        Iterator<Integer> iterator = list.iterator();

        while(iterator.hasNext())
            System.out.print(iterator.next() + " "); // 1 2 3

        //---Java 5---
        for(int x : list)
            System.out.print(x + " "); //1 2 3
    }
}
