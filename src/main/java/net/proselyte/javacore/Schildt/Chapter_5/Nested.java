package net.proselyte.javacore.Schildt.Chapter_5;

// Loops may be nested.
public class Nested {
    public static void main(String args[]) {
        int i, j;
        for(i=0; i<5; i++) {
            for(j=i; j<5; j++)
                System.out.print(".");
            System.out.println();
        }
        }
    }

/*
.....
....
...
..
.
 */