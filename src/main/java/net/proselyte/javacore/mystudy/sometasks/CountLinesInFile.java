package net.proselyte.javacore.mystudy.sometasks;

// task: how to count a number of lines in file

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class CountLinesInFile {
    public static void main(String[] args) throws IOException {
        String path = "TextFile.txt";
        int lines = countLines(path);
        System.out.println(lines);
    }

    public static int countLines(String filename) throws IOException {
        try (LineNumberReader reader = new LineNumberReader(new FileReader(filename))) {
            int cnt = 0;
            String lineRead = "";
            lineRead = reader.readLine();
            while ((lineRead = reader.readLine()) != null) {}
            cnt = reader.getLineNumber();
            return cnt;
            }
    }
}
