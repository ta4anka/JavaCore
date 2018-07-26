package net.proselyte.javacore.Schildt.Chapter_9;

// A nested interface example

// This class contains a member interface
class A {
    // this is a nested interface
    public interface NestedIF {
        boolean isNotNegative(int x);
    }
}
// B implements the nested interface.
class B implements A.NestedIF {   //Notice A.NestefIF !!!
    public boolean isNotNegative(int x) {
        return x < 0 ? false: true;
    }
}
class NestedIFDemo {
    public static void main(String args[]) {
// use a nested interface reference
        A.NestedIF nif = new B();

        if(nif.isNotNegative(10))
            System.out.println("10 is not negative");
        if(nif.isNotNegative(-12))
            System.out.println("this won't be displayed");
    }
}

//10 is not negative