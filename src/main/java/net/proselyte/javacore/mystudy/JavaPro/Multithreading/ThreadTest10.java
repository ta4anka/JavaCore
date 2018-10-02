package net.proselyte.javacore.mystudy.JavaPro.Multithreading;

import java.util.LinkedList;
import java.util.Queue;


public class ThreadTest10 {
    public static void main(String[] args) throws InterruptedException {
        ProducerConsumer pc = new ProducerConsumer();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

    }
}

class ProducerConsumer{
    private Queue<Integer> queue = new LinkedList<>();
    private final int LIMIT = 10;
    private final Object lock = new Object();

    public void produce() throws InterruptedException {
        int value = 0;
while(true){
    synchronized(lock){
        while(queue.size() == LIMIT){
            lock.wait();
        }
        queue.offer(value++);
        lock.notify();

                }
            }
    }

    public void consume() throws InterruptedException {
        while(true){
            synchronized (lock){
                while(queue.size() == 0){
                    lock.wait();
                }
                int value = queue.poll();
                System.out.println(value);
                System.out.println("Queue size is " + queue.size());
                lock.notify();
            }
            Thread.sleep(1000);
        }
    }
}


/*
        0
        Queue size is 1
        1
        Queue size is 9
        2
        Queue size is 9
        3
        Queue size is 9
        4
        Queue size is 9
        5
        Queue size is 9
        6
        Queue size is 9
        7
        Queue size is 9
        8
        Queue size is 9
        9
        Queue size is 9
        10
        Queue size is 9
        11
        Queue size is 9
        12
        Queue size is 9
        13
        Queue size is 9
        14
*/
