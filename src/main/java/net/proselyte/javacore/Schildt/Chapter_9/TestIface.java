package net.proselyte.javacore.Schildt.Chapter_9;

public class TestIface {
    public static void main(String[] args) {
        Callback c = new Client();
        AnotherClient ob = new AnotherClient();

        c.callback(42);

        c = ob;// c now refers to AnotherClient object
        c.callback(42);
    }
}

/*
callback called with 42
Another version of callback
p squared is 1764
*/