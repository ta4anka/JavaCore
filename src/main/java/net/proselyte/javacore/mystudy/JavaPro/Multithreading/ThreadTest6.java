package net.proselyte.javacore.mystudy.JavaPro.Multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ThreadTest6 {
    public static void main(String[] args) throws InterruptedException {
        new Worker().main();
        }
}

class Worker {
    Random random = new Random();

    Object lock1 = new Object();
    Object lock2 = new Object();
    private List<Integer> list1 = new ArrayList<>();
    private List<Integer> list2 = new ArrayList<>();

    public void addToList1() throws InterruptedException {
        synchronized (lock1) {

            Thread.sleep(1);
            list1.add(random.nextInt(100));
        }
    }

    public void addToList2() throws InterruptedException {
        synchronized (lock2) {
            Thread.sleep(1);
            list2.add(random.nextInt(100));
        }
    }

    public  void work() throws InterruptedException {
        for(int i = 0; i < 1000; i++){
            addToList1();
            addToList2();
        }
    }

    public void main() throws InterruptedException {//--------------------------
        long before = System.currentTimeMillis();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    work();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    work();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        long after = System.currentTimeMillis();

        System.out.println("Programm tooks " + (after - before) + " ms to run");
        System.out.println("List1 : " + list1.size());
        System.out.println("List2 : " + list2.size());
    }//---------------------------------------------------------------------------
}

/*    Programm tooks 2204 ms to run
      List1 : 2000
      List2 : 2000
*/
