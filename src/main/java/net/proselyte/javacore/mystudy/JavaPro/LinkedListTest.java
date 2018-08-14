package net.proselyte.javacore.mystudy.JavaPro;

import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;



public class LinkedListTest {
    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<>();
        List<Integer> arrayList = new ArrayList<>();

        measureTime(linkedList);
        measureTime(arrayList);
    }

    private static void measureTime(List<Integer> list){
        for(int i = 0; i<100000; i++)
            list.add(i);
        long start = System.currentTimeMillis();
        for(int i = 0; i<100000; i++)
            list.get(i);
        long end = System.currentTimeMillis();
        System.out.print(list.getClass() + " = ");
        System.out.println(end - start + " ms ");
    }
}

/*
class java.util.LinkedList = 4853 ms
class java.util.ArrayList = 6 ms
*/
