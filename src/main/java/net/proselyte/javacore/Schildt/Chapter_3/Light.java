package net.proselyte.javacore.Schildt.Chapter_3;

// Compute distance light travels using long variables.
public class Light {
    public static void main(String[] args) {
        int lightspeed;
        long days;
        long seconds;
        long distance;

        // approximate speed of light in miles per second
        lightspeed = 186000;
        days = 1000; // specify number of days here

        seconds = days * 24 * 60 * 60;
        distance = lightspeed * seconds;

        System.out.print("In " + days);
        System.out.print(" days light will travel about ");
        System.out.println(distance + " miles.");

    }
}
