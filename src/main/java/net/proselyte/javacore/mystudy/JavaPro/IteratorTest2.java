package net.proselyte.javacore.mystudy.JavaPro;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorTest2 {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        for(int i = 0; i<11; i++)
            list.add(i);
        System.out.println(list); // [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

        int idx = 0;
        Iterator<Integer> myIterator = list.iterator();
        while(myIterator.hasNext()){
            myIterator.next();
            if(idx%2 == 0)
                myIterator.remove();
            idx++;
        }
        System.out.println(list); // [1, 3, 5, 7, 9]
    }
}
