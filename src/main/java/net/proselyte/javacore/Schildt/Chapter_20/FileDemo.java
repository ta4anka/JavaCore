package net.proselyte.javacore.Schildt.Chapter_20;

// Demonstrate File.
import java.io.File;
class FileDemo {
    static void p(String s) {
        System.out.println(s);
    }
    public static void main(String args[]) {
        File f1 = new File("/home/maya/IdeaProjects/JavaCore/TextFile.txt");
        p("File Name: " + f1.getName());
        p("Path: " + f1.getPath());
        p("Abs Path: " + f1.getAbsolutePath());
        p("Parent: " + f1.getParent());
        p(f1.exists() ? "exists" : "does not exist");
        p(f1.canWrite() ? "is writeable" : "is not writeable");
        p(f1.canRead() ? "is readable" : "is not readable");
        p("is " + (f1.isDirectory() ? "" : "not" + " a directory"));
        p(f1.isFile() ? "is normal file" : "might be a named pipe");
        p(f1.isAbsolute() ? "is absolute" : "is not absolute");
        p("File last modified: " + f1.lastModified());
        p("File size: " + f1.length() + " Bytes");
    }
}

/*
    File Name: TextFile.txt
    Path: /home/maya/IdeaProjects/JavaCore/TextFile.txt
    Abs Path: /home/maya/IdeaProjects/JavaCore/TextFile.txt
    Parent: /home/maya/IdeaProjects/JavaCore
    exists
    is writeable
    is readable
    is not a directory
    is normal file
    is absolute
    File last modified: 1535733838000
    File size: 766 Bytes
 */
