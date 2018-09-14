package net.proselyte.javacore.Schildt.Chapter_22;

// Demonstrate URL.
import java.net.*;

class URLDemo {
    public static void main(String args[]) throws MalformedURLException {
        URL hp = new URL("http://www.HerbSchildt.com/WhatsNew");
        System.out.println("Protocol: " + hp.getProtocol());
        System.out.println("Port: " + hp.getPort());
        System.out.println("Host: " + hp.getHost());
        System.out.println("File: " + hp.getFile());
        System.out.println("Ext:" + hp.toExternalForm());
    }
}


/*
        Protocol: http
        Port: -1
        Host: www.HerbSchildt.com
        File: /WhatsNew
        Ext:http://www.HerbSchildt.com/WhatsNew
*/
