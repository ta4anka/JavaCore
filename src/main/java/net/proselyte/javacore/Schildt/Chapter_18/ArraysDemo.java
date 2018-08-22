package net.proselyte.javacore.Schildt.Chapter_18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class ArraysDemo {
    public static void main(String[] args) {
        //---------asList:
        List<Integer> fakeList = Arrays.asList(1,2,3,4);
        System.out.println(fakeList.getClass()); //class java.util.Arrays$ArrayList

        List<Integer> realList2 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println(realList2.getClass()); //class java.util.ArrayList

        // 1 array:
        int [] array = new int[10];
        for(int i = 0; i < array.length; i++)
            array[i] = -3 * i;

        //2 array:
        int [] array2 = new int[10];
        for(int i = 0; i < array2.length; i++)
            array2[i] = -3 * i;

        //---------equals:
        System.out.println(Arrays.equals(array,array2)); // true

        //---------hashCode:
        System.out.println(Arrays.hashCode(array) == Arrays.hashCode(array2));// true


        //---------fill:
        Arrays.fill(array,0,4,-1);

        //---------toString:
        System.out.println(Arrays.toString(array)); // [-1, -1, -1, -1, -12, -15, -18, -21, -24, -27]

        //---------sort:
        Arrays.sort(array);
        System.out.println(Arrays.toString(array)); // [-27, -24, -21, -18, -15, -12, -1, -1, -1, -1]

        //---------binarySearch:
        int index = Arrays.binarySearch(array, -15);
        System.out.println(index); // 4

        //---------setAll:
        int[] arr = new int[5];
        Arrays.setAll(arr, (idx) -> 2 + idx);
        System.out.println(Arrays.toString(arr)); //[2, 3, 4, 5, 6]
    }
}
