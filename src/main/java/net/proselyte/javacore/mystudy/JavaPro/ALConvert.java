package net.proselyte.javacore.mystudy.JavaPro;


//https://www.geeksforgeeks.org/arraylist-array-conversion-java-toarray-methods/
import java.util.ArrayList;
import java.util.List;

public class ALConvert {
    public static void main(String[] args) {

        List<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);

        //-------------1 method ==> Object[]toArray()-----:
        Object[] objects = al.toArray();

        // Printing array of objects
        for (Object obj : objects)
            System.out.print(obj + " "); // 10 20 30 40

        //-------------2 method ==> T[]toArray(T[] a)----:
        Integer[] arr = new Integer[al.size()];
        arr = al.toArray(arr);

        for (Integer x : arr)
            System.out.print(x + " "); // 10 20 30 40

        //------------3 method ==> get()-----------------:
        Integer[] arr2 = new Integer[al.size()];

        // ArrayList to Array Conversion
        for (int i =0; i < al.size(); i++)
            arr2[i] = al.get(i);

        for (Integer x : arr2)
            System.out.print(x + " "); //10 20 30 40

    }
}
