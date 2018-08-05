package net.proselyte.javacore.mystudy;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptions3 {
    public static void main(String[] args) {
        File file = new File("text3");

        try {
            Scanner scanner = new Scanner(file);
            System.out.println("After Scanner");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        System.out.println("After try/catch");


    }
}
