package net.proselyte.javacore.Schildt.Chapter_3;

// Compute the area of a circle.
public class Area {
    public static void main(String[] args) {
        double pi, r, a;

        r = 10.8; // radius of circle
        pi = 3.1416;

        a = pi * r * r; // compute area

        System.out.println("Area of circle is " + a);

    }
}
