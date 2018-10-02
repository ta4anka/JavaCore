package net.proselyte.javacore.mystudy.JavaPro.Multithreading;

import java.util.concurrent.*;

public class ThreadTest12 {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(200);
        Connection connection = Connection.getConnection();

        for(int i = 0; i < 200; i++){
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        connection.work();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });

        }
        executorService.shutdown();
        executorService.awaitTermination(1,TimeUnit.DAYS);
    }
}

// Singleton
class Connection{
    private static Connection connection = new Connection();
    private int connectionsCount;
    private Semaphore semaphore = new Semaphore(10);
    private Connection(){

    }

    public  static Connection getConnection () {
        return connection;
    }

    public void work() throws InterruptedException {
        semaphore.acquire();
        try {
            doWork();
        }finally {
            semaphore.release(); // using after finally!
        }
    }

    private void doWork() throws InterruptedException {
        synchronized (this){
            connectionsCount++;
            System.out.print(connectionsCount + " ");
        }

        Thread.sleep(5000);

        synchronized (this){
            connectionsCount--;
        }

    }
}

// 1 2 3 4 5 6 7 8 9 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 ...