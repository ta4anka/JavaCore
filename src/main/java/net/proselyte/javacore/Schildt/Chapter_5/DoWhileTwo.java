package net.proselyte.javacore.Schildt.Chapter_5;

// Demonstrate the do-while loop with --n in while loop
public class DoWhileTwo {
    public static void main(String args[]) {
        int n = 10;
        do {
            System.out.println("tick " + n);

        } while(--n > 0);
    }
}