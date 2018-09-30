package net.proselyte.javacore.mystudy.JavaPro.Multithreading;

public class ThreadTest9 {
    public static void main(String[] args) throws InterruptedException {
        WaitAndNotify wn = new WaitAndNotify();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                wn.produce();
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                wn.consume();
            }
        });

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

    }
}

class WaitAndNotify{
    public void produce(){

    }

    public void consume(){

    }
}

