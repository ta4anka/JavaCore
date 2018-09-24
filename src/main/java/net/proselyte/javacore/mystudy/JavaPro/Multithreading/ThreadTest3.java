package net.proselyte.javacore.mystudy.JavaPro.Multithreading;

// create new thread by implements Runnable
public class ThreadTest3 {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runner());
        thread.start();
    }

}

class Runner implements Runnable{

    @Override
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
