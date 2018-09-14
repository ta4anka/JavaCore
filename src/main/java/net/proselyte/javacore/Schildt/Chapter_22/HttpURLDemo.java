package net.proselyte.javacore.Schildt.Chapter_22;

// Demonstrate HttpURLConnection.
import java.net.*;
import java.io.*;
import java.util.*;
class HttpURLDemo
{
    public static void main(String args[]) throws Exception {
        URL hp = new URL("http://www.google.com");
        HttpURLConnection hpCon = (HttpURLConnection) hp.openConnection();
// Display request method.
        System.out.println("Request method is " +
                hpCon.getRequestMethod());
// Display response code.
        System.out.println("Response code is " +
                hpCon.getResponseCode());
// Display response message.
        System.out.println("Response Message is " +
                hpCon.getResponseMessage());
// Get a list of the header fields and a set of the header keys.
        Map<String, List<String>> hdrMap = hpCon.getHeaderFields();
        Set<String> hdrField = hdrMap.keySet();
        System.out.println("\nHere is the header:");
// Display all header keys and values.
        for(String k : hdrField) {
            System.out.println("Key: " + k +
                    " Value: " + hdrMap.get(k));
        }
    }
}

/*

    Request method is GET
    Response code is 200
    Response Message is OK

        Here is the header:
        Key: Transfer-Encoding Value: [chunked]
        Key: null Value: [HTTP/1.1 200 OK]
        Key: Server Value: [gws]
        Key: P3P Value: [CP="This is not a P3P policy! See g.co/p3phelp for more info."]
        Key: Date Value: [Fri, 14 Sep 2018 10:29:29 GMT]
        Key: Accept-Ranges Value: [none]
        Key: X-Frame-Options Value: [SAMEORIGIN]
        Key: Cache-Control Value: [private, max-age=0]
        Key: Vary Value: [Accept-Encoding]
        Key: Set-Cookie Value: [NID=138=dv59ur1VH9PqLenzk-EZQvnl-7mEzn-j1IWmQzagsZ3POPBCvZaXBDo7xNs6aq5Oj_fEDM4ktrwEx-XgTyOehsdh_Eldi2AWzNUgnxwV7XJfi1ur3A6KCgCzjaLBqMPy; expires=Sat, 16-Mar-2019 10:29:29 GMT; path=/; domain=.google.com; HttpOnly, 1P_JAR=2018-09-14-10; expires=Sun, 14-Oct-2018 10:29:29 GMT; path=/; domain=.google.com]
        Key: Expires Value: [-1]
        Key: X-XSS-Protection Value: [1; mode=block]
        Key: Content-Type Value: [text/html; charset=ISO-8859-1]
*/
