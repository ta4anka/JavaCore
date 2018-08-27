package net.proselyte.javacore.Schildt.Chapter_10;

import java.util.Random;

public class Exc2Demo {
    public static void main(String[] args) {
        int a = 0, b = 0, c = 0;
        Random r = new Random();

        for(int i = 0; i < 7; i++){
            try {
                b = r.nextInt();
                c = r.nextInt();
                a = 12345 / (b/c);
            }
            catch (ArithmeticException e ){
                System.out.println("Division by zero. ");
                a = 0;
            }
            System.out.println("a: " + a);
            System.out.println("----------------------");

        }
    }
}

/*        a: 12345
        ----------------------
        Division by zero.
        a: 0
        ----------------------
        Division by zero.
        a: 0
        ----------------------
        a: -617
        ----------------------
        a: -12345
        ----------------------
        a: -12345
        ----------------------
        Division by zero.
        a: 0
        ----------------------
*/
