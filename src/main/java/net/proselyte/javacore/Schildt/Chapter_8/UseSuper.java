package net.proselyte.javacore.Schildt.Chapter_8;

// Using super to overcome name hiding
class A3 {
    int i;
}
// Create a subclass by extending class A.

class B3 extends A3 {
    int i; // this i hides the i in A
    B3(int a, int b) {
        super.i = a; // i in A
        i = b; // i in B
    }
    void show() {
        System.out.println("i in superclass: " + super.i);
        System.out.println("i in subclass: " + i);
    }
}
public class UseSuper {
    public static void main(String args[]) {
        B3 subOb = new B3(1, 2);
        subOb.show();
    }
}

/*
i in superclass: 1
i in subclass: 2


Although the instance variable i in B hides the i in A, super allows access to the i
defined in the superclass. As you will see, super can also be used to call methods that are
hidden by a subclass.
 */