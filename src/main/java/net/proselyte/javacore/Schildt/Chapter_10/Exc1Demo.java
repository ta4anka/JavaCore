package net.proselyte.javacore.Schildt.Chapter_10;

public class Exc1Demo {
    public static void main(String[] args) {
        int d,a;

        try {
            d = 0;
            a = 42/d;
            System.out.println("This will not be printed. ");

        }
        catch (ArithmeticException e) {
            System.out.println("Division by zero.");
        }
    }
}
