package net.proselyte.javacore.mystudy;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadFromFile3 {
    public static void main(String[] args) throws FileNotFoundException {
        String sep = File.separator;
        String path = sep + "home" + sep + "maya" +sep +  "Documents" +sep +
                "Java_study"  +sep + "readFile3.txt";

        File file = new File(path);
        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();

        String[] numbersString = line.split(" ");
        int[] numbers = new int[5];
        int counter = 0;
        for(String number: numbersString){
            numbers[counter++] = Integer.parseInt(number);
            }

        System.out.println(Arrays.toString(numbers));
        scanner.close();
    }
}

/*
[1, 2, 3, 4, 5]
*/
