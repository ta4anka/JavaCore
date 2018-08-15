package net.proselyte.javacore.Schildt.Chapter_18;

// A simple Spliterator demonstration.
import java.util.*;
class SpliteratorDemo {
    public static void main(String args[]) {
//============================================================
        // Create an array list for doubles.
        ArrayList<Double> vals = new ArrayList<>();
        // Add values to the array list.
        vals.add(1.0);
        vals.add(2.0);
        vals.add(3.0);
        vals.add(4.0);
        vals.add(5.0);

        // Use tryAdvance() to display contents of vals.
        System.out.print("Contents of vals:\n");
        Spliterator<Double> spltitr = vals.spliterator();
        while(spltitr.tryAdvance((n) -> System.out.println(n)));

        System.out.println();
//============================================================
        // Create new list that contains square roots.
        spltitr = vals.spliterator();
        ArrayList<Double> sqrs = new ArrayList<>();
        while(spltitr.tryAdvance((n) -> sqrs.add(Math.sqrt(n))));

        // Use forEachRemaining() to display contents of sqrs.
        System.out.print("Contents of sqrs:\n");
        spltitr = sqrs.spliterator();
        spltitr.forEachRemaining((n) -> System.out.println(n));
        System.out.println();
    }
}


/*
    Contents of vals:
    1.0
    2.0
    3.0
    4.0
    5.0

    Contents of sqrs:
    1.0
    1.4142135623730951
    1.7320508075688772
    2.0
    2.23606797749979
*/
