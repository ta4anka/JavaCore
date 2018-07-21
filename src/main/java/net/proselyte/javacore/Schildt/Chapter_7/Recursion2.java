package net.proselyte.javacore.Schildt.Chapter_7;

// Another example that uses recursion.
class RecTest {
    int values[];

    RecTest(int i) {
        values = new int[i];  //creating a new array
    }
    // display array -- recursively
    void printArray(int i) {
        if(i==0) return;
        else printArray(i-1);
        System.out.println("[" + (i-1) + "] " + values[i-1]);
    }
}
public class Recursion2 {
    public static void main(String args[]) {
        RecTest ob = new RecTest(10);

        for(int i=0; i<10; i++) ob.values[i] = i; // adding a new element in the array

        ob.printArray(10);
    }
}
