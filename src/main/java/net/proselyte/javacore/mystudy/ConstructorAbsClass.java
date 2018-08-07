package net.proselyte.javacore.mystudy;

abstract class A{
    private int value;

// constructor A
    protected A(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public abstract void print();
}

class B extends A{
    //Constructor B
    public B(int value){
        super(value);
    }
    public void print(){
        System.out.println("B: " + getValue());
    }
}


public class ConstructorAbsClass {
    public static void main(String[] args) {

        B b = new B(10);
        b.print();
        }
}
