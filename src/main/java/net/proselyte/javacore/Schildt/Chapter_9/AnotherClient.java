package net.proselyte.javacore.Schildt.Chapter_9;

//Another implementation of Callback
public class AnotherClient implements Callback {
    public void callback(int p){
        System.out.println("Another version of callback");
        System.out.println("p squared is " + (p*p));
    }
}
