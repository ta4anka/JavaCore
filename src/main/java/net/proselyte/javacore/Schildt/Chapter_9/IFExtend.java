package net.proselyte.javacore.Schildt.Chapter_9;

// One interface can extend another
interface A2 {
    void meth1();
    void meth2();
}
// B now includes meth1() and meth2() -- it adds meth3().
interface B2 extends A2 {
    void meth3();
}
// This class must implement all of A and B
class MyClass implements B2 {
    public void meth1() {
        System.out.println("Implement meth1().");
    }
    public void meth2() {
        System.out.println("Implement meth2().");
    }
    public void meth3() {
        System.out.println("Implement meth3().");
    }
}
class IFExtend {
    public static void main(String arg[]) {
        MyClass ob = new MyClass();

        ob.meth1();
        ob.meth2();
        ob.meth3();
    }
}