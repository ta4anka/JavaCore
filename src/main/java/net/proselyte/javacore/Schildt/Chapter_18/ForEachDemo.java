package net.proselyte.javacore.Schildt.Chapter_18;

//The For-Each Alternative to Iterators

/*If you won’t be modifying the contents of a collection or obtaining elements in reverse
order, then the for-each version of the for loop is often a more convenient alternative to
cycling through a collection than is using an iterator. Recall that the for can cycle through
any collection of objects that implement the Iterable interface
*/

import java.util.ArrayList;
import java.util.List;

public class ForEachDemo {
    public static void main(String[] args) {
        List<Integer> vals = new ArrayList<>();

        for(int i = 1; i < 6; i++) vals.add(i);

        //Use for loop to display the values.
        System.out.print("Contents of vals: ");
        for(int v : vals)
            System.out.print(v + " ");
        System.out.println();

        // Now, sum the values by using a for loop.
        int sum = 0;
        for(int v : vals)
            sum += v;
        System.out.println("Sum of values: " + sum);
        }
}

/*
Contents of vals: 1 2 3 4 5
Sum of values: 15
*/
