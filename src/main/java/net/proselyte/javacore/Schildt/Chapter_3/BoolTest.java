package net.proselyte.javacore.Schildt.Chapter_3;

// Demonstrate boolean values
public class BoolTest {
    public static void main(String args[]){
        boolean b;

        b = false;
        System.out.println("b is " + b);
        b = true;
        System.out.println("b is " + b);

        // a boolean value can control the if statement
        if(b) System.out.println("This is executed");

        b = false;

        if(b) System.out.println("This is not executed.");

// outcome of a relational operator is a boolean value
// {a relational operator - an operator that compares two values.}
        System.out.println("10 > 9 is " + (10 > 9));


    }
}
