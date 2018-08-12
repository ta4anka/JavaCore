package net.proselyte.javacore.Schildt.Chapter_18;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();

        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");
        System.out.println(ts);
        System.out.println(ts.subSet("C","F"));

    }
}

/*
[A, B, C, D, E, F]
[C, D, E]
*/
