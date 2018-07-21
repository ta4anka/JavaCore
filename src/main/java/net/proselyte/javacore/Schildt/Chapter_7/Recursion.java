package net.proselyte.javacore.Schildt.Chapter_7;

// A simple example of recursion
class Factorial {

    int fact(int n) { // this is a recursive method
        int result;
        if(n==1 | n==0) return 1;
        result = fact(n-1) * n;
        return result;
    }
}
public class Recursion {
    public static void main(String args[]) {
        Factorial f = new Factorial();
        System.out.println("Factorial of 0 is " + f.fact(0));
        System.out.println("Factorial of 1 is " + f.fact(1));
        System.out.println("Factorial of 3 is " + f.fact(3));
        System.out.println("Factorial of 4 is " + f.fact(4));
        System.out.println("Factorial of 5 is " + f.fact(5));
    }
}