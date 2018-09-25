package net.proselyte.javacore.mystudy.JavaPro.Multithreading;

import java.util.Scanner;

//The Java volatile keyword is used to mark a Java variable as "being stored in main memory".
//http://tutorials.jenkov.com/java-concurrency/volatile.html

public class ThreadTest4 {
    public static void main(String[] args) {
        MyThread4 myThread = new MyThread4();
        myThread.start();

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        myThread.shutdown();
    }
}

class MyThread4 extends Thread{
    private volatile boolean running = true;
    public void run(){
        while(running) {
            System.out.println("Hello,world!");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void shutdown(){
        this.running = false;
    }
}
