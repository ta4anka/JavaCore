package net.proselyte.javacore.tutorial;


import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileNotFoundEXceptionDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("/home/proselyte/Programming/Projects/Proselyte/JavaCore/resources/nullFile.txt");
        FileReader fileReader = new FileReader(file);

        char[] charArray = new char[100];
        fileReader.read(charArray);

        for (char character : charArray) {
            System.out.print(character);
        }
        fileReader.close();
    }
}


/*

    Exception in thread "main" java.io.FileNotFoundException: /home/proselyte/Programming/Projects/Proselyte/JavaCore/resources/nullFile.txt (No such file or directory)
        at java.io.FileInputStream.open0(Native Method)
        at java.io.FileInputStream.open(FileInputStream.java:195)
        at java.io.FileInputStream.<init>(FileInputStream.java:138)
        at java.io.FileReader.<init>(FileReader.java:72)
        at net.proselyte.javacore.tutorial.FileNotFoundEXceptionDemo.main(FileNotFoundEXceptionDemo.java:11)

  */
