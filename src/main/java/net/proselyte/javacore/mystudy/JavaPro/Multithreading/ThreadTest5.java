package net.proselyte.javacore.mystudy.JavaPro.Multithreading;

public class ThreadTest5 {
    private int counter;

    private synchronized void increment() {
        counter++;
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadTest5 test = new ThreadTest5();
        test.doWork();
    }

    public void doWork() throws InterruptedException {
        Thread thread1 = new Thread(new Runnable() { // using anonymous class
            @Override
            public void run() {
                for(int i = 0; i< 100000; i++)
                    increment();
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 100000; i++)
                    increment();
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();// Current (main) thread waits until thread1 finishes its work
        thread2.join();


        System.out.println(counter);
    }


}
