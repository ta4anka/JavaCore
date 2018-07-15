package net.proselyte.javacore.Schildt.Chapter_3;

import java.util.Arrays;
// Demonstrate a two-dimensional array.
public class TwoDArray {
    public static void main(String args[]) {
        int twoD[][] = new int[4][5];
        int i, j, k = 0;
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 5; j++) {
                twoD[i][j] = k;
                k++;
            }
        }

// This block is just for printing our Array, beacouse in Java, arrays don't override toString()!!!
//        or you can use Arrays.toString(arr) or Arrays.deepToString(arr) for arrays within arrays.

            for (i = 0; i < 4; i++) {
                for (j = 0; j < 5; j++)
                    System.out.print(twoD[i][j] + " ");
                System.out.println();
            }

    }
}

//https://stackoverflow.com/questions/409784/whats-the-simplest-way-to-print-a-java-array