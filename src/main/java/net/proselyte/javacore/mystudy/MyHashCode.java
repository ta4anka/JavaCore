package net.proselyte.javacore.mystudy;

import java.util.Objects;

class BlackBox {
    int varA;
    int varB;

    public BlackBox(int varA, int varB) {

        this.varA = varA;
        this.varB = varB;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BlackBox blackBox = (BlackBox) o;
        return varA == blackBox.varA &&
                varB == blackBox.varB;
    }
    @Override
    public int hashCode() {

        return Objects.hash(varA, varB);
    }
}

public class MyHashCode {
    public static void main(String[] args) {
        Object object = new Object();
        int hCode;
        hCode = object.hashCode();
        System.out.println(hCode); //==> 1639705018; System.identityHashCode(object) is the same.



        BlackBox b1 = new BlackBox(5,10);
        BlackBox b2 = new BlackBox(5,10);

        System.out.println(b1.equals(b2)); // true
        System.out.println(b1.hashCode() == b2.hashCode()); // true

        // hashCode after ovveride:
        System.out.println(b1.hashCode()); // 1126
        System.out.println(b2.hashCode()); // 1126

        // identityHashCode:
        System.out.println(System.identityHashCode(b1)); // 1627674070
        System.out.println(System.identityHashCode(b2)); // 1360875712
    }
}
