package net.proselyte.javacore.tutorial;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] integers = {5, 4, 2, 5, 7, 32, 6, 6, 32, 34, 5, 3, 5, 3, 78, 56};

        //print array integers:
        System.out.println("Array integers: ");
        for (int i = 0; i < integers.length; i++) {
            System.out.print(integers[i] + " ");
        }
        System.out.println("\n========================");



        //Identifying min elements of array
        int minElement = integers[0];
        for (int i = 0; i < integers.length; i++) {
            if (integers[i] < minElement) {
                minElement = integers[i];
            }
        }
        System.out.println("Minimum element of array: " + minElement);

        System.out.println("\n========================");



        //Identifying max element of array
        int maxElement = integers[0];
        for (int i = 0; i < integers.length; i++) {
            if (integers[i] > maxElement) {
            maxElement = integers[i];
            }
        }
        System.out.println("Maximum element of array: " + maxElement);



        System.out.println("\n========================");

        //Calculating the sum of elements of the array:
        int sumOfElementsOfArrayIntegers = 0;
        for (int i = 0; i < integers.length; i++) {
            sumOfElementsOfArrayIntegers += integers[i];
        }
        System.out.println("Sum of elements of the array is: " + sumOfElementsOfArrayIntegers);
    }
}

/*

Array integers:
5 4 2 5 7 32 6 6 32 34 5 3 5 3 78 56
========================
Minimum element of array: 2

========================
Maximum element of array: 78
========================
Sum of elements of the array is: 283

*/
