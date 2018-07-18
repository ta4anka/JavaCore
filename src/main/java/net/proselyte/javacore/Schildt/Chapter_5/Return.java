package net.proselyte.javacore.Schildt.Chapter_5;

// Demonstrate return.
public class Return {
    public static void main(String args[]) {
        boolean t = true;
        System.out.println("Before the return.");
        if(t) return; // return to caller
        System.out.println("This won't execute.");
    }
}

/*
the if(t) statement is necessary. Without it, the
Java compiler would flag an “unreachable code” error because the compiler
would know that the last println( ) statement would never be executed.
To prevent this error, the if statement is used here to trick the compiler
for the sake of this demonstration.
*/