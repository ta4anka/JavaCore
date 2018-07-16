package net.proselyte.javacore.Schildt.Chapter_4;

// Demonstrate ?.
public class Ternary {
    public static void main(String args[]) {
        int i, k;
        i = 10;
        k = i < 0 ? -i : i; // get absolute value of i
        System.out.print("Absolute value of ");
        System.out.println(i + " is " + k);  //10
        i = -10;
        k = i < 0 ? -i : i; // get absolute value of i
        System.out.print("Absolute value of ");
        System.out.println(i + " is " + k);  //10
    }
}