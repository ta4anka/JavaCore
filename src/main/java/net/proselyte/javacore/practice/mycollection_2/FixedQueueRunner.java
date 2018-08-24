package net.proselyte.javacore.practice.mycollection_2;

import java.util.Queue;
public class FixedQueueRunner {
    public static void main(String[] args) {
        Queue fq = new FixedQueue(10);
        for(int i = 0; i < 12;i++ )
            fq.offer(i);
        System.out.println(fq);  // ==> [1, 3, 2, 7, 4, 5, 6, 10, 8, 9, 11]  What's the Hell?
    }
}
