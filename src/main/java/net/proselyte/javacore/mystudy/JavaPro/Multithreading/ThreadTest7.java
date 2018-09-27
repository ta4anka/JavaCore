package net.proselyte.javacore.mystudy.JavaPro.Multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

// Thread Pool.

public class ThreadTest7 {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executeService = Executors.newFixedThreadPool(2);

        for(int i = 0; i < 5; i++)
            executeService.submit(new Work(i));

        executeService.shutdown();
        System.out.println("All tasks submitted");

        executeService.awaitTermination(1,TimeUnit.DAYS); // the same as join(); Main thread stops here

        }
}

//--------------------------------------------------------------
class Work implements Runnable{
    private int id;

    public Work(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("work " + id + " was completed");
    }
}

  /*  All tasks submitted
      work 0 was completed
      work 1 was completed
      work 2 was completed
      work 3 was completed
      work 4 was completed*/