package net.proselyte.javacore.practice.multithreading;

public class AppRunner {
    public static void main(String[] args) {
        FileThread fileThread = new FileThread();
        fileThread.start();
    }
}
