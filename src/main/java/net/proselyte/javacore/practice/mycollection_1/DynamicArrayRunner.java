package net.proselyte.javacore.practice.mycollection_1;

import java.util.NoSuchElementException;

public class DynamicArrayRunner {
    public static void main(String[] args) {
        DynamicArray da = new DynamicArray();

        //Some test:
        da.add(2);
        da.add(3);
        da.add(4);
        da.add(5);
        System.out.println("The contain of array : " + da);
        System.out.println("The contain of array after removing " + da.specialRemove(5) + ": " + da);
        System.out.println("An element by index: " + da.getElByIndex(0)); // 0
        System.out.println("An index by value: " + da.getElByValue(7));
        System.out.println("The maximum element is: " + da.maxElement());
        System.out.println("The minimum element is: " + da.minElement());
        System.out.println("The arithmetic mean is: " + da.average());

    }
}
