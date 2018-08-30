package net.proselyte.javacore.Schildt.Chapter_13;

// Demonstrate PrintWriter

import java.io.*;
public class PrintWriterDemo {
    public static void main(String args[]) {
        PrintWriter pw = new PrintWriter(System.out, true);

        pw.println("This is a string");
        pw.println(-7);
        pw.println(4.5e-7);
    }
}