package net.proselyte.javacore.practice.mycollection_2;

//https://docs.oracle.com/javase/8/docs/api/java/util/PriorityQueue.html

import java.util.PriorityQueue;

public class FixedQueue extends PriorityQueue {
    int Capacity;

    //first constructor
    public FixedQueue() {
        this.Capacity = 16;
    }

    //second constructor
    public FixedQueue(int capacity) {
        this.Capacity = capacity;
    }

    @Override
    public boolean offer(Object o) {
        if(this.size() > Capacity )
            this.poll();
        return super.offer(o);
    }



}