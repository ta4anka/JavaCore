package net.proselyte.javacore.tutorial;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TryCatchDemo {
    public static void main(String[] args) {
        File file = new File("nullFile.txt");

        try {
            FileReader fileReader = new FileReader(file);
            char[] charArray = new char[100];
            fileReader.read(charArray);

            for (char character : charArray) {
                System.out.print(character);
            }
            fileReader.close();
            }catch (IOException e){
            System.out.println("We have IOException here.");
        }
    }
}
