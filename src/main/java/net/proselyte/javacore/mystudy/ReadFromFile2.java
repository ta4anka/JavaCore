package net.proselyte.javacore.mystudy;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadFromFile2 {
    public static void main(String[] args) throws FileNotFoundException {


        String sep = File.separator;
        String path = sep + "home" + sep + "maya" +sep +  "Documents" +sep +
                "Java_study"  +sep + "readFile2.txt";
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        String[] words = line.split(" ");
        System.out.println(Arrays.toString(words));

        scanner.close();
    }
}

/*
[first_word, second_word, third_word]
*/
