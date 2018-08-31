package net.proselyte.javacore.Schildt.Chapter_15;

// Demonstrate a simple lambda expression.

// A functional interface.
interface MyNumber {
    double getValue();
}
class LambdaDemo {
    public static void main(String args[])
    {
        MyNumber myNum; // declare an interface reference

        myNum = () -> 123.45;
        System.out.println("A fixed value: " + myNum.getValue());


        myNum = () -> Math.random() * 100;
        System.out.println("A random value: " + myNum.getValue());
        System.out.println("Another random value: " + myNum.getValue());

        //myNum = () -> "123.03"; // Error!

    }
}
