package net.proselyte.javacore.Schildt.Chapter_5;

public class Nested2 {
    public static void main(String[] args) {
        for(int i = 0;i<5;i++){
            for(int j = i;j>0;j--){
                System.out.print(".");
            }
            System.out.println();
        }
    }
}

/*
.
..
...
....
*/