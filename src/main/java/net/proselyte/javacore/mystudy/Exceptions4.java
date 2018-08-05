package net.proselyte.javacore.mystudy;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptions4 {
    public static void main(String[] args)  {
        try {
            readFile();  // We must handle the exception here too
        } catch (FileNotFoundException e) {
            System.out.println("Exception handling in main");
        }
    }

    public static void readFile() throws FileNotFoundException {
        File file = new File("text");
        Scanner scanner = new Scanner(file);
    }
}
