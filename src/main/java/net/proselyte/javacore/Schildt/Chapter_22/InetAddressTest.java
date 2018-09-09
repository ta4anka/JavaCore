package net.proselyte.javacore.Schildt.Chapter_22;

// Demonstrate InetAddress.
import java.net.*;
class InetAddressTest
{
    public static void main(String args[]) throws UnknownHostException {
        InetAddress Address = InetAddress.getLocalHost();
        System.out.println(Address);

        Address = InetAddress.getByName("www.HerbSchildt.com");
        System.out.println(Address);

        InetAddress SW[] = InetAddress.getAllByName("www.nba.com");
        for (int i=0; i<SW.length; i++)
            System.out.println(SW[i]);
    }
}


/*
        comp/127.0.1.1
        www.HerbSchildt.com/216.92.65.4
        www.nba.com/184.25.159.201
        www.nba.com/2a02:26f0:d8:396:0:0:0:2e1
        www.nba.com/2a02:26f0:d8:38c:0:0:0:2e1
*/
