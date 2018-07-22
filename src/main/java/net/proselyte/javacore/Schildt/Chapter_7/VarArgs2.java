package net.proselyte.javacore.Schildt.Chapter_7;

// Use varargs with standard arguments.
public class VarArgs2 {
    // Here, msg is a normal parameter and v is avarargs parameter.

    static void vaTest(String msg, int ... v) {
        System.out.print(msg + v.length + " Contents: ");

        for(int x : v)
            System.out.print(x + " ");
        System.out.println();
    }
    public static void main(String args[])
    {
        vaTest("One vararg: ", 10);
        vaTest("Three varargs: ", 1, 2, 3);
        vaTest("No varargs: ");
    }
}

/*
One vararg: 1 Contents: 10
Three varargs: 3 Contents: 1 2 3
No varargs: 0 Contents:
*/