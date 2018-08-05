package net.proselyte.javacore.mystudy;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptions2 {
    public static void main(String[] args) {
        File file2 = new File("text2");

        try {
            Scanner scanner = new Scanner(file2);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
