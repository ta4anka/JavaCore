package net.proselyte.javacore.Schildt.Chapter_13;

/*
To enable assertion checking at run time, you must specify the -ea(enable assertions) option:
-in Terminal: ==> java -ea AssertTest
-in IntelliJ Idea: ==> Edit configurations /VM options --> -ea

*/
public class AssertTest {
    public static void main(String[] args) {
       new AssertTest().someMethod(-4);

    }

    private void someMethod(int a){
        assert (a > 0);
        System.out.println(a);
    }
}

// Exception in thread "main" java.lang.AssertionError