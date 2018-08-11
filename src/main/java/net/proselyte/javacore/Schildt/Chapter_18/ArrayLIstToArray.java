package net.proselyte.javacore.Schildt.Chapter_18;

import java.util.ArrayList;

public class ArrayLIstToArray {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();

        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);

        System.out.println("Contents of al: " + al);

        //Get the array.
        Integer ia[] = new Integer[al.size()];
        ia = al.toArray(ia);

        int sum = 0;
        //Sum the array.
        for(int i: ia) sum += i;
        System.out.println("Sum is: " + sum);

    }
}

/*
Contents of al: [1, 2, 3, 4]
Sum is: 10
*/
