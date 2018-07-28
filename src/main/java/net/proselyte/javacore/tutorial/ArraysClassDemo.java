package net.proselyte.javacore.tutorial;

import java.util.Arrays;

public class ArraysClassDemo {
    public static void main(String[] args) {
        int[] intArray = {5, 52, 2, 3, 6, 7, 12, 45, 1, 2, 4, 2};

        System.out.println("intArray (using Arrays): ");
        System.out.println(Arrays.toString(intArray));

        System.out.println("Sorted intArray (using Arrays): ");
        Arrays.sort(intArray);
        System.out.println(Arrays.toString(intArray));

        System.out.println("Filling intArray with 8 (using Arrays): ");
        Arrays.fill(intArray,8);
        System.out.println(Arrays.toString(intArray));

    }
}


/*

intArray (using Arrays):
[5, 52, 2, 3, 6, 7, 12, 45, 1, 2, 4, 2]
 Sorted intArray (using Arrays):
[1, 2, 2, 2, 3, 4, 5, 6, 7, 12, 45, 52]
Filling intArray with 8 (using Arrays):
[8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8]

*/