package net.proselyte.javacore.mystudy.JavaPro;

public class GenTest {
    public static void main(String[] args) {
        Generic <String> string = new Generic<>();
        string.setT("Thing_1");
        System.out.println(string);
        String str = string.getT();  //before generics ==> String str = (String)string.getT()

        Generic<Integer> integer = new Generic<>();
        integer.setT(15);
        System.out.println(integer);

        Generic<Boolean> bool = new Generic<>();
        bool.setT(true);
        System.out.println(bool);
    }
}


class Generic <T> {
    private T t;


    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    @Override
    public String toString() {
        return "Now class of t is " +  t.getClass().getSimpleName() +
                " and = " + t;
    }
}


/*
Now class of t is String and = Thing_1
Now class of t is Integer and = 15
Now class of t is Boolean and = true*/
