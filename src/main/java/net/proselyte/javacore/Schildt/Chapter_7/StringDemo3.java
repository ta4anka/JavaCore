package net.proselyte.javacore.Schildt.Chapter_7;

// Demonstrate String arrays
public class StringDemo3 {
    public static void main(String args[]) {
        String str[] = { "one", "two", "three" };

        for(int i=0; i<str.length; i++)
            System.out.println("str[" + i + "]: " +
                    str[i]);
    }
}

/*
str[0]: one
str[1]: two
str[2]: three

*/
