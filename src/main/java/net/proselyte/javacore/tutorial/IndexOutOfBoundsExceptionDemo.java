package net.proselyte.javacore.tutorial;

public class IndexOutOfBoundsExceptionDemo {
    public static void main(String[] args) {
        int[] integers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Trying to call 10th element of array: ");
        System.out.println(integers[10]);
    }
}



/*
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 10
Trying to call 10th element of array:
at net.proselyte.javacore.tutorial.IndexOutOfBoundsExceptionDemo.main(IndexOutOfBoundsExceptionDemo.java:8)
*/
