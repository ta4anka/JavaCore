package net.proselyte.javacore.mystudy.JavaPro.Multithreading;

public class ThreadTest2 {
    public static void main(String[] args) throws InterruptedException {
        MyThread1 myHtread1 = new MyThread1();
        myHtread1.start();

        Thread.sleep(1000);

        MyThread1 myHtread2 = new MyThread1();
        myHtread2.start();

    }
}

class MyThread1 extends Thread {
    public void run() {
        for(int i = 0; i<5; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i + " an another thread ");
        }
    }
}

/*
0 an another thread  --> first thread
1 an another thread  --> first thread
0 an another thread
2 an another thread --> first thread
1 an another thread
3 an another thread --> first thread
2 an another thread
4 an another thread --> first thread
3 an another thread
4 an another thread
*/