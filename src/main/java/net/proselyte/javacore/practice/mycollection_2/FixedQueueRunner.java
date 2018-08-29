package net.proselyte.javacore.practice.mycollection_2;

import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.Queue;

public class FixedQueueRunner {
    public static void main(String[] args) {
        Queue fq = new FixedQueue(10);
        for(int i = 1; i < 20;i++ )
            fq.offer(i);
        System.out.println(fq);
    }
}



