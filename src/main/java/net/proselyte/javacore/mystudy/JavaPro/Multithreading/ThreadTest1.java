package net.proselyte.javacore.mystudy.JavaPro.Multithreading;

public class ThreadTest1 {
    public static void main(String[] args){
        MyThread myHtread = new MyThread();
        myHtread.start();
        System.out.println("The main thread"); //it's code from main thread
    }
}

class MyThread extends Thread {
    public void run() {
        for(int i = 0; i<10; i++){
            System.out.println("An another thread");
        }
    }
}