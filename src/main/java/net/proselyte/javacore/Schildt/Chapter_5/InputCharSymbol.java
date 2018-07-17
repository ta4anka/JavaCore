package net.proselyte.javacore.Schildt.Chapter_5;

//Demonstrate input one symbol
public class InputCharSymbol{
    public static void main(String[] args)
            throws java.io.IOException { //This line is necessary to handle input errors.
        System.out.println("Enter only one symbol: ");

        char symbol;
        symbol = (char) System.in.read();

        System.out.println("Your symbol is " + symbol);

    }
}