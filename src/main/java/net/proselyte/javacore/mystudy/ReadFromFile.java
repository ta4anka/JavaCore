package net.proselyte.javacore.mystudy;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromFile {
    public static void main(String[] args) throws FileNotFoundException {
// pwd ==> /home/maya/Documents/Java_study/readFile.txt

        String sep = File.separator;
        String path = sep + "home" + sep + "maya" +sep +  "Documents" +sep +
                "Java_study"  +sep + "readFile.txt";
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        while(scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }
        scanner.close();
    }
}

/*
first line
second line
third line
*/
