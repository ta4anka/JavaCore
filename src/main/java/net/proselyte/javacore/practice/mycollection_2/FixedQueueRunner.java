package net.proselyte.javacore.practice.mycollection_2;

import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.Queue;

public class FixedQueueRunner {
    public static void main(String[] args) {
        try{
        Queue fq = new FixedQueue(-10);
        for(int i = 1; i < 20;i++ )
            fq.offer(i);
        System.out.println(fq);
    }
    catch (NoSuchElementException e){
        System.out.println("This is "+e.getClass().getSimpleName() +
                        ". The capacity will be a number > 0 !"
                );
    }
    }
}

//    This is NoSuchElementException. The capacity will be a number > 0 !