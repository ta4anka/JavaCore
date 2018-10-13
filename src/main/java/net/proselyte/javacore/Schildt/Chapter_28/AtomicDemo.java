package net.proselyte.javacore.Schildt.Chapter_28;

// A simple example of Atomic.
import java.util.concurrent.atomic.*;

class AtomicDemo {
    public static void main(String args[]) {
        new AtomThread("A");
        new AtomThread("B");
        new AtomThread("C");
    }
}

class Shared {
        static AtomicInteger ai = new AtomicInteger(0);
        static int i = 0;
        public void updateI(){}
}

// A thread of execution that increments count.
class AtomThread implements Runnable {
        String name;

        public AtomThread(String name) {
            this.name = name;
            new Thread(this).start();
        }

        public void run() {

            System.out.println("Starting " + name);

            for (int i = 1; i <= 3; i++)
                System.out.println(name + " got: " +
                        Shared.ai.getAndSet(i));
        }
    }


/*       Starting A
        A got: 0
        A got: 1
        A got: 2
        Starting B
        B got: 3
        B got: 1
        B got: 2
        Starting C
        C got: 3
        C got: 1
        C got: 2
*/
