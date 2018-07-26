package net.proselyte.javacore.Schildt.Chapter_9;

public class Client implements Callback{
    //Implement Callback's interface
    public void callback(int p){
        System.out.println("callback called with " + p);
        }

    void noIfaceMeth(){
        System.out.println("Classes that implement interfaces " +
                "may also define other members, too");
    }

}
